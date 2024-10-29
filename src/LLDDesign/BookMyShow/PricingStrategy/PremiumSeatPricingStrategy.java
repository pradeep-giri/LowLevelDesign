package LLDDesign.BookMyShow.PricingStrategy;

public class PremiumSeatPricingStrategy implements SeatPricingStrategy {
    @Override
    public double calculatePrice() {
        return 20.0;  // Premium seat price
    }
}
