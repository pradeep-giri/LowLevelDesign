package LLDDesign.BookMyShow.PaymentService;

import LLDDesign.BookMyShow.User;

public class CreditCardPaymentService implements PaymentService {
    @Override
    public boolean processPayment(User user, double amount) {
        // Process payment logic
        System.out.println("Processing credit card payment for user: " + user.getName());
        return true;  // Payment successful
    }

    @Override
    public void refundPayment(User user, double amount) {
        // Simulate payment refund
        System.out.println("Refunding $" + amount + " to user: " + user.getName());
        // Implement actual refund logic here
    }
}
