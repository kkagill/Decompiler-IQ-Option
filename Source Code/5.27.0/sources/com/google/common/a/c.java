package com.google.common.a;

import com.google.common.base.i;

/* compiled from: UnicodeEscaper */
public abstract class c extends a {
    public abstract char[] ct(int i);

    protected c() {
    }

    public String escape(String str) {
        i.checkNotNull(str);
        int length = str.length();
        int a = a((CharSequence) str, 0, length);
        return a == length ? str : l(str, a);
    }

    /* Access modifiers changed, original: protected */
    public int a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int b = b(charSequence, i, i2);
            if (b < 0 || ct(b) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(b) ? 2 : 1;
        }
        return i;
    }

    /* Access modifiers changed, original: protected|final */
    public final String l(String str, int i) {
        int length = str.length();
        char[] uE = b.uE();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int b = b(str, i, length);
            if (b >= 0) {
                char[] ct = ct(b);
                b = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
                if (ct != null) {
                    int i4 = i - i2;
                    int i5 = i3 + i4;
                    int length2 = ct.length + i5;
                    if (uE.length < length2) {
                        uE = a(uE, i3, (length2 + (length - i)) + 32);
                    }
                    if (i4 > 0) {
                        str.getChars(i2, i, uE, i3);
                        i3 = i5;
                    }
                    if (ct.length > 0) {
                        System.arraycopy(ct, 0, uE, i3, ct.length);
                        i3 += ct.length;
                    }
                    i2 = b;
                }
                i = a((CharSequence) str, b, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        i = length - i2;
        if (i > 0) {
            i += i3;
            if (uE.length < i) {
                uE = a(uE, i3, i);
            }
            str.getChars(i2, length, uE, i3);
        } else {
            i = i3;
        }
        return new String(uE, 0, i);
    }

    protected static int b(CharSequence charSequence, int i, int i2) {
        i.checkNotNull(charSequence);
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            String str = "'";
            String str2 = " in '";
            String str3 = " at index ";
            String str4 = "' with value ";
            StringBuilder stringBuilder;
            if (charAt > 56319) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected low surrogate character '");
                stringBuilder.append(charAt);
                stringBuilder.append(str4);
                stringBuilder.append(charAt);
                stringBuilder.append(str3);
                stringBuilder.append(i3 - 1);
                stringBuilder.append(str2);
                stringBuilder.append(charSequence);
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Expected low surrogate but got char '");
                stringBuilder.append(charAt2);
                stringBuilder.append(str4);
                stringBuilder.append(charAt2);
                stringBuilder.append(str3);
                stringBuilder.append(i3);
                stringBuilder.append(str2);
                stringBuilder.append(charSequence);
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static char[] a(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }
}
