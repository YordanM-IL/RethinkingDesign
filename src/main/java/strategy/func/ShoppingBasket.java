package strategy.func;

import java.util.function.UnaryOperator;
import java.util.stream.DoubleStream;

public class ShoppingBasket {

    private final DoubleStream items = DoubleStream.of(100.99, 14.99, 21, 0.99, 489.89);

    public double total(UnaryOperator<Double> offer) {
        return offer.apply(this.items.sum());
    }


//    final Function<Integer, Integer> off = integer -> (int) integer;
//    final Function<Integer, Integer> tenOff = integer -> (int) (integer * (1 - 0.1));
//    final Function<Integer, Integer> fifteenOff = integer -> (int) (integer * (1 - 0.15));
//    final Function<Integer, Integer> twentyOff = integer -> (int) (integer * (1 - 0.2));
//
//
//    private final Function<Offers, Function<Integer, Integer>> promotionsStrategy = p-> {
//        final EnumMap<Offers, Function<Integer, Integer>> promsMap = new EnumMap<>(Offers.class);
//        promsMap.put(Offers.NO, off);
//        promsMap.put(Offers.WEEKENDS, tenOff);
//        promsMap.put(Offers.BLACK_FRIDAY, fifteenOff);
//        promsMap.put(Offers.CHRISTMAS, twentyOff);
//        return promsMap.get(p);
//    };
}
