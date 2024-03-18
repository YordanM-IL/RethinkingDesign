package combinator;

import java.util.function.Function;


public interface CustomerPurchaseValidator extends Function<Customer, CustomerPurchaseValidator.ValidationResultEnum> {
    static CustomerPurchaseValidator isNameValid() {
        return n -> !n.name().isBlank() ? ValidationResultEnum.VALID : ValidationResultEnum.NAME_NOT_VALID;
    }

    static CustomerPurchaseValidator isPhoneValid() {
        return c -> c.phone().length() == 11 && c.phone().startsWith("00") ?
                ValidationResultEnum.VALID : ValidationResultEnum.PHONE_NOT_VALID;
    }

    static CustomerPurchaseValidator isEmailValid() {
        return c -> c.email().contains("@") ? ValidationResultEnum.VALID : ValidationResultEnum.EMAIL_NOT_VALID;
    }

    default CustomerPurchaseValidator andThen(CustomerPurchaseValidator other) {
        return c -> {
            final ValidationResultEnum thisCustomer = this.apply(c);
            return thisCustomer.equals(ValidationResultEnum.VALID) ? other.apply(c) : thisCustomer;
        };
    }

    enum ValidationResultEnum {
        VALID, NAME_NOT_VALID, PHONE_NOT_VALID, EMAIL_NOT_VALID
    }
}
