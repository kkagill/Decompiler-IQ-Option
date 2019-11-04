package com.iqoption.i;

import com.iqoption.config.a;

/* compiled from: Logger */
public final class b {
    private static final boolean DEBUG = a.aZl.Uk().Ds();
    public static volatile boolean dET = false;

    public static void N(Throwable th) {
        com.crashlytics.android.a.d(th);
    }

    public static void iW(String str) {
        com.crashlytics.android.a.ag(str);
    }
}
