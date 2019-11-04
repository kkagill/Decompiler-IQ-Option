package io.card.payment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Calendar;
import java.util.Date;

/* compiled from: CreditCardNumber */
class c {
    public static boolean hC(String str) {
        r0 = new int[2][];
        boolean z = false;
        r0[0] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        r0[1] = new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        char last = stringCharacterIterator.last();
        int i = 0;
        int i2 = 0;
        while (last != 65535) {
            if (!Character.isDigit(last)) {
                return false;
            }
            int i3 = i2 + 1;
            i += r0[i2 & 1][last - 48];
            last = stringCharacterIterator.previous();
            i2 = i3;
        }
        if (i % 10 == 0) {
            z = true;
        }
        return z;
    }

    public static String kZ(String str) {
        return a(str, true, null);
    }

    public static String a(String str, boolean z, CardType cardType) {
        String le = z ? k.le(str) : str;
        if (cardType == null) {
            cardType = CardType.fromCardNumber(le);
        }
        int numberLength = cardType.numberLength();
        if (le.length() == numberLength) {
            if (numberLength == 16) {
                return lb(le);
            }
            if (numberLength == 15) {
                str = la(le);
            }
        }
        return str;
    }

    private static String la(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < 15) {
            if (i == 4 || i == 10) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(str.charAt(i));
            i++;
        }
        return stringBuilder.toString();
    }

    private static String lb(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < 16) {
            if (i != 0 && i % 4 == 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(str.charAt(i));
            i++;
        }
        return stringBuilder.toString();
    }

    public static boolean aV(int i, int i2) {
        if (i < 1 || 12 < i) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        int i3 = instance.get(1);
        int i4 = instance.get(2) + 1;
        if (i2 < i3) {
            return false;
        }
        return (i2 != i3 || i >= i4) && i2 <= i3 + 15;
    }

    public static SimpleDateFormat ji(int i) {
        if (i == 4) {
            return new SimpleDateFormat("MMyy");
        }
        return i == 6 ? new SimpleDateFormat("MMyyyy") : null;
    }

    public static Date lc(String str) {
        str = k.le(str);
        SimpleDateFormat ji = ji(str.length());
        if (ji != null) {
            try {
                ji.setLenient(false);
                return ji.parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }
}
