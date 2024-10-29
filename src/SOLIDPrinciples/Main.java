package SOLIDPrinciples;

import SOLIDPrinciples.Marker;
import SOLIDPrinciples.Invoice;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Marker", "Blue", 2024, 18);
        Invoice invoice = new Invoice(marker, 10);
        InvoiceDao dataBaseInvoiceDao = new DataBaseInvoiceDao();
        dataBaseInvoiceDao.save(invoice);
    }
}

// Single Responsibility - A Class should have only one reason to change
// Open/Closed Principle - Open for extension but close for Modification
// Liskov Substitution Principle - If class B is subtype of Class A, then we should be able to replace object of A with B without breaking the behaviour of the program
// - (Subclass should extend the capability of parent class not narrow it down)
// Interface Segmented Principle - Interface should be such, that client should not implement unnecessary function they so not need
// Dependency Inversion Principle - Class should depend on interfaces rather than concrete classes
// - (High-level modules should not depend on low-level modules. Both should depend on abstractions)
