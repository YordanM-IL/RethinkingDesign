package strategy.oop.without;

import lombok.Getter;

@Getter
public enum Offers {
    NONE(0),
    BLACK_FRIDAY(0.9),
    CHRISTMAS(0.85);

    public final double percentage;

    Offers(double percentage) {
        this.percentage = percentage;
    }
}
