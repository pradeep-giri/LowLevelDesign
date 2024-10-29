package SOLIDPrinciples;

import SOLIDPrinciples.Marker;

class Invoice {
    private final Marker marker;
    private final int quantity;

    Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return marker.getPrice() * this.quantity;
    }
}
