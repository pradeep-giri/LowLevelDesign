package LLDDesign.BookMyShow.PricingStrategy;

public class NormalSeatPricingStrategy implements SeatPricingStrategy {
    @Override
    public double calculatePrice() {
        return 10.0;  // Normal seat price
    }
}
