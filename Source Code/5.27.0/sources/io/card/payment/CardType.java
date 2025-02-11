package io.card.payment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public enum CardType {
    AMEX("AmEx"),
    DINERSCLUB("DinersClub"),
    DISCOVER("Discover"),
    JCB(r5),
    MASTERCARD("MasterCard"),
    VISA("Visa"),
    MAESTRO("Maestro"),
    UNKNOWN("Unknown"),
    INSUFFICIENT_DIGITS("More digits required");
    
    private static HashMap<Pair<String, String>, CardType> intervalLookup;
    private static int minDigits;
    public final String name;

    static {
        minDigits = 1;
        intervalLookup = new HashMap();
        intervalLookup.put(getNewPair("2221", "2720"), MASTERCARD);
        intervalLookup.put(getNewPair("300", "305"), DINERSCLUB);
        intervalLookup.put(getNewPair("309", null), DINERSCLUB);
        intervalLookup.put(getNewPair("34", null), AMEX);
        intervalLookup.put(getNewPair("3528", "3589"), JCB);
        intervalLookup.put(getNewPair("36", null), DINERSCLUB);
        intervalLookup.put(getNewPair("37", null), AMEX);
        intervalLookup.put(getNewPair("38", "39"), DINERSCLUB);
        intervalLookup.put(getNewPair("4", null), VISA);
        intervalLookup.put(getNewPair("50", null), MAESTRO);
        intervalLookup.put(getNewPair("51", "55"), MASTERCARD);
        intervalLookup.put(getNewPair("56", "59"), MAESTRO);
        intervalLookup.put(getNewPair("6011", null), DISCOVER);
        intervalLookup.put(getNewPair("61", null), MAESTRO);
        intervalLookup.put(getNewPair("62", null), DISCOVER);
        intervalLookup.put(getNewPair("63", null), MAESTRO);
        intervalLookup.put(getNewPair("644", "649"), DISCOVER);
        intervalLookup.put(getNewPair("65", null), DISCOVER);
        intervalLookup.put(getNewPair("66", "69"), MAESTRO);
        intervalLookup.put(getNewPair("88", null), DISCOVER);
        for (Entry entry : getIntervalLookup().entrySet()) {
            minDigits = Math.max(minDigits, ((String) ((Pair) entry.getKey()).first).length());
            if (((Pair) entry.getKey()).second != null) {
                minDigits = Math.max(minDigits, ((String) ((Pair) entry.getKey()).second).length());
            }
        }
    }

    private CardType(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }

    public String getDisplayName(String str) {
        switch (this) {
            case AMEX:
                return b.a(StringKey.CARDTYPE_AMERICANEXPRESS, str);
            case DINERSCLUB:
            case DISCOVER:
                return b.a(StringKey.CARDTYPE_DISCOVER, str);
            case JCB:
                return b.a(StringKey.CARDTYPE_JCB, str);
            case MASTERCARD:
                return b.a(StringKey.CARDTYPE_MASTERCARD, str);
            case MAESTRO:
                return b.a(StringKey.CARDTYPE_MAESTRO, str);
            case VISA:
                return b.a(StringKey.CARDTYPE_VISA, str);
            default:
                return null;
        }
    }

    public int numberLength() {
        switch (this) {
            case AMEX:
                return 15;
            case DINERSCLUB:
                return 14;
            case DISCOVER:
            case JCB:
            case MASTERCARD:
            case MAESTRO:
            case VISA:
                return 16;
            case INSUFFICIENT_DIGITS:
                return minDigits;
            default:
                return -1;
        }
    }

    public int cvvLength() {
        switch (this) {
            case AMEX:
                return 4;
            case DINERSCLUB:
            case DISCOVER:
            case JCB:
            case MASTERCARD:
            case MAESTRO:
            case VISA:
                return 3;
            default:
                return -1;
        }
    }

    public Bitmap imageBitmap(Context context) {
        int i = AnonymousClass1.eKw[ordinal()];
        if (i == 1) {
            i = R.drawable.cio_ic_amex;
        } else if (i == 2 || i == 3) {
            i = R.drawable.cio_ic_discover;
        } else if (i == 4) {
            i = R.drawable.cio_ic_jcb;
        } else if (i == 5) {
            i = R.drawable.cio_ic_mastercard;
        } else if (i != 7) {
            i = -1;
        } else {
            i = R.drawable.cio_ic_visa;
        }
        return i != -1 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
    }

    private static boolean isNumberInInterval(String str, String str2, String str3) {
        int min = Math.min(str.length(), str2.length());
        int min2 = Math.min(str.length(), str3.length());
        if (Integer.parseInt(str.substring(0, min)) >= Integer.parseInt(str2.substring(0, min)) && Integer.parseInt(str.substring(0, min2)) <= Integer.parseInt(str3.substring(0, min2))) {
            return true;
        }
        return false;
    }

    private static HashMap<Pair<String, String>, CardType> getIntervalLookup() {
        return intervalLookup;
    }

    private static Pair<String, String> getNewPair(String str, String str2) {
        Object str22;
        if (str22 == null) {
            str22 = str;
        }
        return new Pair(str, str22);
    }

    public static CardType fromString(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (CardType cardType : values()) {
            if (cardType != UNKNOWN && cardType != INSUFFICIENT_DIGITS && str.equalsIgnoreCase(cardType.toString())) {
                return cardType;
            }
        }
        return UNKNOWN;
    }

    public static CardType fromCardNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        HashSet hashSet = new HashSet();
        for (Entry entry : getIntervalLookup().entrySet()) {
            if (isNumberInInterval(str, (String) ((Pair) entry.getKey()).first, (String) ((Pair) entry.getKey()).second)) {
                hashSet.add(entry.getValue());
            }
        }
        if (hashSet.size() > 1) {
            return INSUFFICIENT_DIGITS;
        }
        if (hashSet.size() == 1) {
            return (CardType) hashSet.iterator().next();
        }
        return UNKNOWN;
    }
}
