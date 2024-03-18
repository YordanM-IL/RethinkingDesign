package decorator.func;

import lombok.AllArgsConstructor;

import java.util.function.Function;
import java.util.stream.DoubleStream;

@AllArgsConstructor
public class SingleOfferBasket implements CheckoutBasketFactory{

    private final DoubleStream items = DoubleStream.of(100.99, 14.99, 21, 0.99, 489.89);
    private final Function<Double, Double> offer;

    @Override
    public DoubleStream getItems() {
        return this.items;
    }

    @Override
    public Function<Double, Double> getOffer() {
        return this.offer;
    }
}
