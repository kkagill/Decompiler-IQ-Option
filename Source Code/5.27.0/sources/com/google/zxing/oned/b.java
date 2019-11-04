package com.google.zxing.oned;

/* compiled from: CodaBarWriter */
public final class b extends m {
    private static final char[] ahB = new char[]{'A', 'B', 'C', 'D'};
    private static final char[] ahC = new char[]{'T', 'N', '*', 'E'};
    private static final char[] ahD = new char[]{'/', ':', '+', '.'};
    private static final char ahE = ahB[0];

    public boolean[] cT(String str) {
        StringBuilder stringBuilder;
        if (str.length() < 2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(ahE);
            stringBuilder.append(str);
            stringBuilder.append(ahE);
            str = stringBuilder.toString();
        } else {
            char toUpperCase = Character.toUpperCase(str.charAt(0));
            char toUpperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            boolean a = a.a(ahB, toUpperCase);
            boolean a2 = a.a(ahB, toUpperCase2);
            boolean a3 = a.a(ahC, toUpperCase);
            boolean a4 = a.a(ahC, toUpperCase2);
            String str2 = "Invalid start/end guards: ";
            if (a) {
                if (!a2) {
                    throw new IllegalArgumentException(str2.concat(String.valueOf(str)));
                }
            } else if (a3) {
                if (!a4) {
                    throw new IllegalArgumentException(str2.concat(String.valueOf(str)));
                }
            } else if (a2 || a4) {
                throw new IllegalArgumentException(str2.concat(String.valueOf(str)));
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ahE);
                stringBuilder.append(str);
                stringBuilder.append(ahE);
                str = stringBuilder.toString();
            }
        }
        int i = 1;
        int i2 = 20;
        while (i < str.length() - 1) {
            if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '-' || str.charAt(i) == '$') {
                i2 += 9;
            } else if (a.a(ahD, str.charAt(i))) {
                i2 += 10;
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("Cannot encode : '");
                stringBuilder2.append(str.charAt(i));
                stringBuilder2.append('\'');
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
            i++;
        }
        boolean[] zArr = new boolean[(i2 + (str.length() - 1))];
        i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int i4;
            int i5;
            char toUpperCase3 = Character.toUpperCase(str.charAt(i2));
            if (i2 == 0 || i2 == str.length() - 1) {
                if (toUpperCase3 == '*') {
                    toUpperCase3 = 'C';
                } else if (toUpperCase3 == 'E') {
                    toUpperCase3 = 'D';
                } else if (toUpperCase3 == 'N') {
                    toUpperCase3 = 'B';
                } else if (toUpperCase3 == 'T') {
                    toUpperCase3 = 'A';
                }
            }
            for (i4 = 0; i4 < a.ahy.length; i4++) {
                if (toUpperCase3 == a.ahy[i4]) {
                    i5 = a.ahz[i4];
                    break;
                }
            }
            i5 = 0;
            i4 = i3;
            i3 = 0;
            boolean z = true;
            while (true) {
                int i6 = 0;
                while (i3 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i5 >> (6 - i3)) & 1) == 0 || i6 == 1) {
                        z ^= 1;
                        i3++;
                    } else {
                        i6++;
                    }
                }
                break;
            }
            if (i2 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
            i3 = i4;
            i2++;
        }
        return zArr;
    }
}
