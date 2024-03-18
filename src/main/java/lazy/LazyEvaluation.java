package lazy;

import java.util.function.UnaryOperator;

public class LazyEvaluation {

    private static final String STR = "Hell";

    static String process(String str) {
        // Presuming, we do some expensive processing (external API call, Db query etc.)
        System.out.println("Process is been invoked.");
        return String.join("-", str.repeat(2).split("")).toUpperCase();
    }

    public static void main(String[] args) {
        separate();

        UnaryOperator<String> temp = getInFunc();
        if (STR.length() >= 5 && temp.apply(STR).length() >= 10) {
            separate();
            System.out.println("\tIt's valid - processed value is [ " + temp.apply(STR) + " ]");
        } else {
            separate();
            System.out.println("\tIt's not valid");
        }

    }

    private static UnaryOperator<String> getInFunc() {
        return s -> {
            System.out.println("In func");
            return String.join("-", s.repeat(2).split("")).toUpperCase();
        };
    }

    private static void separate() {
        System.out.println("-".repeat(150));
    }
}
