package com.google.common.base;

import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: Platform */
final class h {
    private static final g Sg = pY();
    private static final Logger logger = Logger.getLogger(h.class.getName());

    /* compiled from: Platform */
    private static final class a implements g {
        private a() {
        }
    }

    private h() {
    }

    static long pX() {
        return System.nanoTime();
    }

    static String c(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    private static g pY() {
        return new a();
    }
}
