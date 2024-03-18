package decorator.func;

import lombok.Getter;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

@Getter
public class MultiOffersBasket implements CheckoutBasketFactory{

    private final DoubleStream items = DoubleStream.of(100.99, 14.99, 21, 0.99, 489.89);
    private final Function<Double, Double> offer;

    @SafeVarargs
    public MultiOffersBasket(Function<Double, Double>... offers) {
        this.offer = Stream.of(offers).reduce(UnaryOperator.identity(), Function::andThen);
    }
}
