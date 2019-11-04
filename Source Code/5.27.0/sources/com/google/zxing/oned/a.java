package com.google.zxing.oned;

/* compiled from: CodaBarReader */
public final class a extends l {
    private static final char[] ahA = new char[]{'A', 'B', 'C', 'D'};
    static final char[] ahy = "0123456789-$:/.+ABCD".toCharArray();
    static final int[] ahz = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    static boolean a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
