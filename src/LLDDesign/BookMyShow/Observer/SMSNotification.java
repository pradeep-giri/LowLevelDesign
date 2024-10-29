package LLDDesign.BookMyShow.Observer;

import LLDDesign.BookMyShow.Booking;

public class SMSNotification implements NotificationObserver {
    @Override
    public void update(Booking booking) {
        System.out.println("Sending SMS notification: Your booking with ID " + booking.getId() + " is " + booking.getStatus());
    }
}
