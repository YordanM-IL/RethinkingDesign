package strategy.func;

import java.util.function.UnaryOperator;
import java.util.stream.DoubleStream;

public class ShoppingBasket {

    private final DoubleStream items = DoubleStream.of(100.99, 14.99, 21, 0.99, 489.89);

    public double total(UnaryOperator<Double> offer) {
        return offer.apply(this.items.sum());
    }
}
