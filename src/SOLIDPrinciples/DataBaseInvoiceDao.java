package SOLIDPrinciples;

public class DataBaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        System.out.println("Invoice save to database - " + invoice.calculateTotal());
    }
}
