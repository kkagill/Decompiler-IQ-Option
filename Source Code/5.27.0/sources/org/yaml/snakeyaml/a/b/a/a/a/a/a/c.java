package org.yaml.snakeyaml.a.b.a.a.a.a.a;

/* compiled from: UnicodeEscaper */
public abstract class c implements a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ThreadLocal<char[]> XW = new ThreadLocal<char[]>() {
        /* Access modifiers changed, original: protected */
        /* renamed from: uF */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    public abstract char[] ct(int i);

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

    public String escape(String str) {
        int length = str.length();
        int a = a((CharSequence) str, 0, length);
        return a == length ? str : l(str, a);
    }

    /* Access modifiers changed, original: protected|final */
    public final String l(String str, int i) {
        int length = str.length();
        char[] cArr = (char[]) XW.get();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int b = b(str, i, length);
            if (b >= 0) {
                char[] ct = ct(b);
                if (ct != null) {
                    int i4 = i - i2;
                    int i5 = i3 + i4;
                    int length2 = ct.length + i5;
                    if (cArr.length < length2) {
                        cArr = a(cArr, i3, (length2 + (length - i)) + 32);
                    }
                    if (i4 > 0) {
                        str.getChars(i2, i, cArr, i3);
                        i3 = i5;
                    }
                    if (ct.length > 0) {
                        System.arraycopy(ct, 0, cArr, i3, ct.length);
                        i3 += ct.length;
                    }
                }
                i2 = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
                i = a((CharSequence) str, i2, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        i = length - i2;
        if (i > 0) {
            i += i3;
            if (cArr.length < i) {
                cArr = a(cArr, i3, i);
            }
            str.getChars(i2, length, cArr, i3);
        } else {
            i = i3;
        }
        return new String(cArr, 0, i);
    }

    protected static final int b(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            String str = " at index ";
            String str2 = "' with value ";
            StringBuilder stringBuilder;
            if (charAt > 56319) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected low surrogate character '");
                stringBuilder.append(charAt);
                stringBuilder.append(str2);
                stringBuilder.append(charAt);
                stringBuilder.append(str);
                stringBuilder.append(i3 - 1);
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
                stringBuilder.append(str2);
                stringBuilder.append(charAt2);
                stringBuilder.append(str);
                stringBuilder.append(i3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static final char[] a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
