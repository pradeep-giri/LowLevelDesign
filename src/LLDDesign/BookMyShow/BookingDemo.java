package LLDDesign.BookMyShow;

import LLDDesign.BookMyShow.Observer.EmailNotification;
import LLDDesign.BookMyShow.Observer.NotificationObserver;
import LLDDesign.BookMyShow.Observer.SMSNotification;
import LLDDesign.BookMyShow.PaymentService.PaymentService;
import LLDDesign.BookMyShow.PaymentService.PaymentServiceFactory;
import LLDDesign.BookMyShow.PricingStrategy.NormalSeatPricingStrategy;
import LLDDesign.BookMyShow.PricingStrategy.PremiumSeatPricingStrategy;
import LLDDesign.BookMyShow.PricingStrategy.SeatPricingStrategy;

import java.util.*;

public class BookingDemo {
    public static void main(String[] args) {
        // Initialize Payment Service
        PaymentService paymentService = PaymentServiceFactory.getPaymentService("CreditCard");

        // Create User
        User user = new User(1, "John Doe", "john.doe@example.com");

        // Create Movie
        Movie movie = new Movie(101, "Inception", "A mind-bending thriller", 148);

        // Create Theater
        Theater theater = new Theater(201, "Grand Cinema", "Downtown");

        // Create Seats
        SeatPricingStrategy normalPricing = new NormalSeatPricingStrategy();
        SeatPricingStrategy premiumPricing = new PremiumSeatPricingStrategy();

        Seat seat1 = new Seat(1, 1, 1, SeatType.NORMAL, normalPricing);
        Seat seat2 = new Seat(2, 1, 2, SeatType.PREMIUM, premiumPricing);

        // Add Seats to Seat Map
        Map<Integer, Seat> seatMap = new HashMap<>();
        seatMap.put(seat1.getId(), seat1);
        seatMap.put(seat2.getId(), seat2);

        // Create Show
        Show show = new Show(301, movie, theater, new Date(), new Date(), seatMap);
        theater.addShow(show);

        // Select Seats
        List<Seat> selectedSeats = Arrays.asList(seat1, seat2);

        // Create Booking
        Booking booking = new Booking(401, user, show, selectedSeats, paymentService);

        // Register Observers
        NotificationObserver emailNotification = new EmailNotification();
        NotificationObserver smsNotification = new SMSNotification();
        booking.registerObserver(emailNotification);
        booking.registerObserver(smsNotification);

        // Confirm Booking
        boolean isConfirmed = booking.confirmBooking();
        if (isConfirmed) {
            System.out.println("Booking confirmed! Total Price: $" + booking.getTotalPrice());
        } else {
            System.out.println("Booking failed.");
        }

        // Optionally, Cancel Booking
        boolean isCancelled = booking.cancelBooking();
        if (isCancelled) {
            System.out.println("Booking cancelled and payment refunded.");
        }
    }
}
