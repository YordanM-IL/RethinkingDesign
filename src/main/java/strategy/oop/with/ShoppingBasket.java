package strategy.oop.with;

import lombok.AllArgsConstructor;
import strategy.oop.without.Offers;

import java.util.stream.DoubleStream;

@AllArgsConstructor
public class ShoppingBasket {

    private final DoubleStream items = DoubleStream.of(100.99, 14.99, 21, 0.99, 489.89);

    private final Offer currentOffer;

    public double total() {
        return currentOffer.applyOffer(items.sum());
    }
}
