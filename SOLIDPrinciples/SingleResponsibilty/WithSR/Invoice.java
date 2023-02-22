package SOLIDPrinciples.SingleResponsibilty.WithSR;

import SOLIDPrinciples.SingleResponsibilty.Marker;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    int calculatePrice() {
        return marker.getPrice() * this.quantity;
    }
}
