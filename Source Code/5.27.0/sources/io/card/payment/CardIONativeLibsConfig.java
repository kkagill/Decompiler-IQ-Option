package io.card.payment;

public class CardIONativeLibsConfig {
    private static String eKd;

    public static void init(String str) {
        eKd = str;
    }

    static String bis() {
        return eKd;
    }
}
