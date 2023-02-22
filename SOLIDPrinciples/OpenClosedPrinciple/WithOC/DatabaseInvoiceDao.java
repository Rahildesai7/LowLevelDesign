package SOLIDPrinciples.OpenClosedPrinciple.WithOC;

import SOLIDPrinciples.SingleResponsibilty.WithSR.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}
