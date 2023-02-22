package SOLIDPrinciples.OpenClosedPrinciple.WithOC;

import SOLIDPrinciples.SingleResponsibilty.WithSR.Invoice;

public interface InvoiceDao {
    void save(Invoice Invoice);
}
