package SOLIDPrinciples.SingleResponsibilty.WithoutSR;

import SOLIDPrinciples.SingleResponsibilty.Marker;

public class Invoice {
    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    int calculateTotal() {
        int price = marker.getPrice() * this.quantity;
        return price;
    }

    void printInvoice() {
        //
    }

    void saveToDB() {
        //
    }
}
