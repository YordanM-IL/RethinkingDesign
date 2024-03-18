package strategy.oop.without;

import org.openjdk.jol.info.ClassLayout;

public class Main {

    public static void main(String[] args) {
        separate();
        var shoppingBasket = new ShoppingBasket();
        System.out.printf("Total: $%.2f%n", shoppingBasket.total(Offers.BLACK_FRIDAY));

        separate();
        System.out.println("Instance size [ " + ClassLayout.parseClass(shoppingBasket.getClass()).instanceSize() + " ] bytes.");
        separate();
    }

    private static void separate() {
        System.out.println("-".repeat(150));
    }
}
