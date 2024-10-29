package LLDDesign.BookMyShow.PaymentService;

public class PaymentServiceFactory {
    public static PaymentService getPaymentService(String serviceType) {
        if (serviceType.equalsIgnoreCase("CreditCard")) {
            return new CreditCardPaymentService();
        } else if (serviceType.equalsIgnoreCase("UPI")) {
            return new UPIPaymentService();
        } else {
            throw new IllegalArgumentException("Unsupported payment type");
        }
    }
}
