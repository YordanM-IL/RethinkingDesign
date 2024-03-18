package strategy.func;

import org.openjdk.jol.info.ClassLayout;

public class Main {

    public static void main(String[] args) {

        final ShoppingBasket basket = new ShoppingBasket();
        System.out.printf("Total: $%.2f%n", basket.total(Offers.BLACK_FRIDAY.getOffer()));

        separate();
        System.out.println(ClassLayout.parseInstance(basket).toPrintable());
    }

    private static void separate() {
        System.out.println("-".repeat(150));
    }
}
