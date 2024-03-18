package strategy.oop.with;

import lombok.Getter;

@Getter
public enum Offers {
    NONE(0),
    BLACK_FRIDAY(0.9),
    CHRISTMAS(0.85),
    WEEKENDS(0.80);

    public final double percentage;

    Offers(double percentage) {
        this.percentage = percentage;
    }
}
