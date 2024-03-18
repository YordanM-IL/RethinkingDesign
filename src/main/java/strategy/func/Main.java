package strategy.func;

import org.openjdk.jol.info.ClassLayout;

public class Main {

    public static void main(String[] args) {
        separate();

        final ShoppingBasket basket = new ShoppingBasket();
        final double total = basket.total(Offers.BLACK_FRIDAY.getOffer());
        System.out.printf("Total: $%.2f%n", total);

        separate();
        System.out.println(ClassLayout.parseInstance(basket).toPrintable());
    }

    private static void separate() {
        System.out.println("-".repeat(150));
    }
}
