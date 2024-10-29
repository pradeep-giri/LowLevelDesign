package SOLIDPrinciples;

public class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) { System.out.println("Invoice save to File - " + invoice.calculateTotal()); }
}
