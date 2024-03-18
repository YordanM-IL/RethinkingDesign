package strategy.oop.with;

import org.openjdk.jol.info.ClassLayout;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        separate();
        var shoppingBasket = new ShoppingBasket(new BlackFridayOffer());
        System.out.printf("Total: $%.2f%n", shoppingBasket.total());

        separate();
        System.out.println(ClassLayout.parseClass(ShoppingBasket.class).toPrintable(shoppingBasket));

        separate();
        final var totalSize = getTotalSize();
        System.out.println("Total instances size is [ " + totalSize + " ] bytes.");
    }

    private static Long getTotalSize() {
        var offers = List.of(BlackFridayOffer.class, NoneOffer.class, ChristmasOffer.class, WeekendOffer.class, Offer.class);
        return offers.stream()
                .mapToLong(c -> ClassLayout.parseClass(c).instanceSize())
                .sum();
    }

    private static void separate() {
        System.out.println("-".repeat(150));
    }
}
