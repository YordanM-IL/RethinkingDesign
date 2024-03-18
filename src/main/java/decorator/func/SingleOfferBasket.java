package decorator.func;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Function;
import java.util.stream.DoubleStream;

@Getter
@AllArgsConstructor
public class SingleOfferBasket implements CheckoutBasketFactory{

    private final DoubleStream items = DoubleStream.of(100.99, 14.99, 21, 0.99, 489.89);
    private final Function<Double, Double> offer;

}
