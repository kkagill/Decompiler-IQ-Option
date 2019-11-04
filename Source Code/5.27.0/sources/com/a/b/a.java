package com.a.b;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.b;

/* compiled from: AndroidThreeTen */
public final class a {
    private static final AtomicBoolean vI = new AtomicBoolean();

    public static void c(Application application) {
        init(application);
    }

    public static void init(Context context) {
        I(context, "org/threeten/bp/TZDB.dat");
    }

    public static void I(Context context, String str) {
        if (!vI.getAndSet(true)) {
            b.a(new b(context, str));
        }
    }
}
