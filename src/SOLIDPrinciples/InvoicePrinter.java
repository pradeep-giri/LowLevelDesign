package SOLIDPrinciples;

public class InvoicePrinter {
    private final Invoice invoice;

    InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println("Printing the invoice - " + invoice);
    }
}
