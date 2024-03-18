package strategy.oop.with;

public class NoneOffer implements Offer {

    @Override
    public double applyOffer(double sum) {
        return sum * Offers.NONE.getPercentage();
    }
}
