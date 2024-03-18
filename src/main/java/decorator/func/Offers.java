package decorator.func;

import lombok.Getter;

import java.util.function.Function;

@Getter
public enum Offers {
    NO(i -> i),                           // 0% Off
    BLACK_FRIDAY(i -> (i * (1 - 0.1))),   // 10% Off
    CHRISTMAS(i -> (i * (1 - 0.15))),     // 15% Off
    WEEKENDS(i -> (i * (1 - 0.2)));       // 20% Off

    public final Function<Double, Double> offer;

    Offers(Function<Double, Double> offer) {
        this.offer = offer;
    }
}
