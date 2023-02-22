package SOLIDPrinciples.OpenClosedPrinciple.WithoutOC;

import SOLIDPrinciples.SingleResponsibilty.WithSR.Invoice;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        //
    }

    // Added a new functionality
    // Save invoice in the file with the given filename
    public void saveToFile(String filename) {

    }
}
