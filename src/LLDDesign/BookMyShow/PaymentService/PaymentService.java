package LLDDesign.BookMyShow.PaymentService;

import LLDDesign.BookMyShow.User;

public interface PaymentService {
    boolean processPayment(User user, double amount);
    void refundPayment(User user, double amount);
}
