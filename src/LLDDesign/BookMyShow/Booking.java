package LLDDesign.BookMyShow;

import LLDDesign.BookMyShow.Observer.NotificationObserver;
import LLDDesign.BookMyShow.PaymentService.PaymentService;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int id;
    private User user;
    private Show show;
    private List<Seat> seats;
    private BookingStatus status;
    private PaymentService paymentService;
    private double totalPrice;

    private List<NotificationObserver> observers = new ArrayList<>();

    public Booking(int id, User user, Show show, List<Seat> seats, PaymentService paymentService) {
        this.id = id;
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.paymentService = paymentService;
        this.status = BookingStatus.PENDING;
        this.totalPrice = calculateTotalPrice();
    }

    // Register an observer
    public void registerObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    // Remove an observer
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    // Notify all observers
    private void notifyObservers() {
        for (NotificationObserver observer : observers) {
            observer.update(this);
        }
    }

    private double calculateTotalPrice() {
        return seats.stream().mapToDouble(Seat::getPrice).sum();
    }

    // Confirm the booking by processing payment and updating seat statuses
    public synchronized boolean confirmBooking() {
        // Process payment
        boolean paymentSuccess = paymentService.processPayment(user, totalPrice);
        if (paymentSuccess) {
            // Lock seats and update their status to BOOKED
            for (Seat seat : seats) {
                synchronized (seat) {
                    if (seat.getStatus() == SeatStatus.AVAILABLE) {
                        seat.setStatus(SeatStatus.BOOKED);
                        notifyObservers();
                    } else {
                        // If any seat is already booked, rollback and fail the booking
                        rollbackSeats();
                        notifyObservers();
                        status = BookingStatus.FAILED;
                        return false;
                    }
                }
            }
            status = BookingStatus.CONFIRMED;
            notifyObservers();
            return true;
        } else {
            status = BookingStatus.FAILED;
            notifyObservers();
            return false;
        }
    }

    // Cancel the booking and refund payment
    public synchronized boolean cancelBooking() {
        if (status != BookingStatus.CONFIRMED) {
            System.out.println("Cannot cancel a booking that is not confirmed.");
            return false;
        }

        // Release seats
        for (Seat seat : seats) {
            synchronized (seat) {
                seat.setStatus(SeatStatus.AVAILABLE);
            }
        }

        // Refund payment
        paymentService.refundPayment(user, totalPrice);
        status = BookingStatus.CANCELLED;
        notifyObservers();
        return true;
    }

    // Rollback seat status in case of failure during booking
    private void rollbackSeats() {
        for (Seat seat : seats) {
            synchronized (seat) {
                if (seat.getStatus() == SeatStatus.BOOKED) {
                    seat.setStatus(SeatStatus.AVAILABLE);
                }
            }
        }
    }

    // Getters
    public int getId() { return id; }
    public User getUser() { return user; }
    public Show getShow() { return show; }
    public List<Seat> getSeats() { return seats; }
    public BookingStatus getStatus() { return status; }
    public double getTotalPrice() { return totalPrice; }
}
