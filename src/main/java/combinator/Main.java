package combinator;

import org.openjdk.jol.info.ClassLayout;

public class Main {

    public static void main(String[] args) {

        final var mikeyMouse = new Customer("Mikey Mouse", "00786541231", "mikeygmail.com");

        // We can use all validations or the ones we need in the specific situation (like builder)
        final var result = CustomerPurchaseValidator.isNameValid()
//                .andThen(CustomerPurchaseValidator.isPhoneValid())
                .andThen(CustomerPurchaseValidator.isEmailValid())
                .apply(mikeyMouse);

        System.out.println(result);

//        System.out.println(ClassLayout.parseInstance(result).toPrintable());
    }
}
