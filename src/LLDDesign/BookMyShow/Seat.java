package LLDDesign.BookMyShow;

import LLDDesign.BookMyShow.PricingStrategy.SeatPricingStrategy;

public class Seat {
    private int id;
    private int row;
    private int column;
    private SeatType seatType;
    private SeatPricingStrategy pricingStrategy;
    private SeatStatus status;

    public Seat(int id, int row, int column, SeatType seatType, SeatPricingStrategy pricingStrategy) {
        this.id = id;
        this.row = row;
        this.column = column;
        this.seatType = seatType;
        this.pricingStrategy = pricingStrategy;
        this.status = SeatStatus.AVAILABLE;
    }

    public double getPrice() {
        return pricingStrategy.calculatePrice();
    }
    public SeatType getSeatType() { return seatType; }
    public SeatStatus getStatus() { return status; }
    public void setStatus(SeatStatus status) { this.status = status; }

    // Additional Getters
    public int getId() { return id; }
    public int getRow() { return row; }
    public int getColumn() { return column; }
}
