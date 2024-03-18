package decorator.func;

import java.util.function.Function;
import java.util.stream.DoubleStream;

public interface CheckoutBasketFactory {

    DoubleStream getItems();

    Function<Double, Double> getOffer();

    default void total() {
        System.out.printf("Total: $%.2f%n", getOffer().apply(getItems().sum()));
    }
}
