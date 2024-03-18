package strategy.oop.with;

public class BlackFridayOffer implements Offer{
    @Override
    public double applyOffer(double sum) {
        return sum * Offers.BLACK_FRIDAY.getPercentage();
    }
}
