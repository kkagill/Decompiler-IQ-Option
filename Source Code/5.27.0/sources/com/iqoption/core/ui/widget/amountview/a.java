package com.iqoption.core.ui.widget.amountview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: AmountViewCharacters */
class a {
    private final int bMh;
    private final char[] bMi;
    private final Map<Character, Integer> bMj;

    /* compiled from: AmountViewCharacters */
    class a {
        final int bMk;
        final int bMl;

        public a(int i, int i2) {
            this.bMk = i;
            this.bMl = i2;
        }
    }

    a(String str) {
        int i = 0;
        if (str.contains(Character.toString(0))) {
            throw new IllegalArgumentException("You cannot include AmountViewUtils.EMPTY_CHAR in the character list.");
        }
        char[] toCharArray = str.toCharArray();
        int length = toCharArray.length;
        this.bMh = length;
        this.bMj = new HashMap(length);
        for (int i2 = 0; i2 < length; i2++) {
            this.bMj.put(Character.valueOf(toCharArray[i2]), Integer.valueOf(i2));
        }
        this.bMi = new char[((length * 2) + 1)];
        this.bMi[0] = 0;
        while (i < length) {
            char[] cArr = this.bMi;
            int i3 = i + 1;
            cArr[i3] = toCharArray[i];
            cArr[(length + 1) + i] = toCharArray[i];
            i = i3;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public a b(char c, char c2) {
        int B = B(c);
        int B2 = B(c2);
        if (B < 0 || B2 < 0) {
            return null;
        }
        if (!(c == 0 || c2 == 0)) {
            int i;
            int i2;
            if (B2 < B) {
                i = B - B2;
                i2 = this.bMh;
                if ((i2 - B) + B2 < i) {
                    B2 += i2;
                }
            } else if (B < B2) {
                i = B2 - B;
                i2 = this.bMh;
                if ((i2 - B2) + B < i) {
                    B += i2;
                }
            }
        }
        return new a(B, B2);
    }

    /* Access modifiers changed, original: 0000 */
    public Set<Character> amo() {
        return this.bMj.keySet();
    }

    /* Access modifiers changed, original: 0000 */
    public char[] amp() {
        return this.bMi;
    }

    private int B(char c) {
        if (c == 0) {
            return 0;
        }
        return this.bMj.containsKey(Character.valueOf(c)) ? ((Integer) this.bMj.get(Character.valueOf(c))).intValue() + 1 : -1;
    }
}
