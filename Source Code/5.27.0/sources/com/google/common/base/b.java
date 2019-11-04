package com.google.common.base;

/* compiled from: CharMatcher */
public abstract class b implements j<Character> {

    /* compiled from: CharMatcher */
    static abstract class a extends b {
        a() {
        }

        @Deprecated
        public /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }
    }

    /* compiled from: CharMatcher */
    private static final class b extends a {
        private final char RN;

        b(char c) {
            this.RN = c;
        }

        public boolean b(char c) {
            return c == this.RN;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CharMatcher.is('");
            stringBuilder.append(b.c(this.RN));
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    /* compiled from: CharMatcher */
    static abstract class c extends a {
        private final String description;

        c(String str) {
            this.description = (String) i.checkNotNull(str);
        }

        public final String toString() {
            return this.description;
        }
    }

    /* compiled from: CharMatcher */
    private static final class d extends c {
        static final d RP = new d();

        public boolean b(char c) {
            return false;
        }

        private d() {
            super("CharMatcher.none()");
        }

        public int a(CharSequence charSequence, int i) {
            i.t(i, charSequence.length());
            return -1;
        }
    }

    /* compiled from: CharMatcher */
    static final class e extends c {
        static final int RQ = Integer.numberOfLeadingZeros(31);
        static final e RR = new e();

        e() {
            super("CharMatcher.whitespace()");
        }

        public boolean b(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((1682554634 * c) >>> RQ) == c;
        }
    }

    public abstract boolean b(char c);

    public static b pR() {
        return d.RP;
    }

    public static b pS() {
        return e.RR;
    }

    public static b a(char c) {
        return new b(c);
    }

    protected b() {
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        i.t(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Deprecated
    /* renamed from: a */
    public boolean apply(Character ch) {
        return b(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }

    private static String c(char c) {
        char[] cArr = new char[]{'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            int c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
