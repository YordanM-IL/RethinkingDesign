package strategy.oop.with;

public class WeekendOffer implements Offer {

    @Override
    public double applyOffer(double sum) {
        return sum * Offers.WEEKENDS.getPercentage();
    }
}
