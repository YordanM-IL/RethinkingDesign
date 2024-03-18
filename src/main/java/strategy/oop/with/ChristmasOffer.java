package strategy.oop.with;

public class ChristmasOffer implements Offer{
    @Override
    public double applyOffer(double sum) {
        return sum * Offers.CHRISTMAS.getPercentage();
    }
}
