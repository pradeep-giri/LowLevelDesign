package LLDDesign.BookMyShow.Observer;

import LLDDesign.BookMyShow.Booking;

public class EmailNotification implements NotificationObserver {
    @Override
    public void update(Booking booking) {
        System.out.println("Sending email notification: Your booking with ID " + booking.getId() + " is " + booking.getStatus());
    }
}
