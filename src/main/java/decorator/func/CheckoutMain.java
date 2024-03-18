package decorator.func;

public class CheckoutMain {

    public CheckoutMain() {
    }

    public static void main(String[] args) {
        System.out.print("Single Offer Basket - ");
        final CheckoutBasketFactory  singleOfferBasket = new SingleOfferBasket(Offers.BLACK_FRIDAY.getOffer());
        singleOfferBasket.total();

        separate();
        System.out.print("Multi Offer Basket - ");
        final CheckoutBasketFactory multiOffersBasket = new MultiOffersBasket(Offers.WEEKENDS.getOffer(), Offers.CHRISTMAS.getOffer());
        multiOffersBasket.total();
    }

    private static void separate() {
        System.out.println("-".repeat(150));
    }
}
