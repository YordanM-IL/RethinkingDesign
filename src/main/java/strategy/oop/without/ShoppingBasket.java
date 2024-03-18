package strategy.oop.without;

import java.util.stream.DoubleStream;

public class ShoppingBasket {

    private final DoubleStream items = DoubleStream.of(100.99, 14.99, 21, 0.99, 489.89);

    public double total(Offers offer) {
        if (Offers.BLACK_FRIDAY.equals(offer)) {
            return applyOffer(Offers.BLACK_FRIDAY.getPercentage());
        } else if (Offers.CHRISTMAS.equals(offer)) {
            return applyOffer(Offers.CHRISTMAS.getPercentage());
        } else
            return applyOffer(Offers.NONE.getPercentage());
    }

    private double applyOffer(Double percentage) {
        return items.sum() * percentage;
    }
}
