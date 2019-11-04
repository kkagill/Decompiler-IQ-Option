package org.yaml.snakeyaml.scanner;

import java.util.Arrays;

/* compiled from: Constant */
public final class a {
    public static final a fMq = new a("\n  ");
    public static final a fMr = new a("\r\n  ");
    public static final a fMs = new a("\u0000\r\n  ");
    public static final a fMt = new a(" \u0000\r\n  ");
    public static final a fMu = new a("\t \u0000\r\n  ");
    public static final a fMv = new a("\u0000 \t");
    public static final a fMw = new a("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
    public static final a fMx = new a("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
    boolean fMA;
    private String fMy;
    boolean[] fMz = new boolean[128];

    private a(String str) {
        int i = 0;
        this.fMA = false;
        Arrays.fill(this.fMz, false);
        StringBuilder stringBuilder = new StringBuilder();
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 128) {
                this.fMz[codePointAt] = true;
            } else {
                stringBuilder.appendCodePoint(codePointAt);
            }
            i++;
        }
        if (stringBuilder.length() > 0) {
            this.fMA = true;
            this.fMy = stringBuilder.toString();
        }
    }

    public boolean nX(int i) {
        if (i < 128) {
            return this.fMz[i];
        }
        return this.fMA && this.fMy.indexOf(i, 0) != -1;
    }

    public boolean nY(int i) {
        return nX(i) ^ 1;
    }

    public boolean l(int i, String str) {
        return nX(i) || str.indexOf(i, 0) != -1;
    }

    public boolean m(int i, String str) {
        return l(i, str) ^ 1;
    }
}
