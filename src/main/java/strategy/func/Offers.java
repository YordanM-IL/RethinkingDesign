package strategy.func;

import lombok.Getter;

import java.util.function.UnaryOperator;

@Getter
public enum Offers {
    NON(i -> i),                           // 0% Off
    BLACK_FRIDAY(i -> (i * (1 - 0.1))),   // 10% Off
    CHRISTMAS(i -> (i * (1 - 0.15))),     // 15% Off
    WEEKENDS(i -> (i * (1 - 0.2)));       // 20% Off

    public final UnaryOperator<Double> offer;

    Offers(UnaryOperator<Double> offer) {
        this.offer = offer;
    }
}
