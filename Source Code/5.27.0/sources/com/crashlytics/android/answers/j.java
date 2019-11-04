package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* compiled from: AppMeasurementEventLogger */
public class j implements o {
    private final Method of;
    private final Object og;

    public static o I(Context context) {
        Class J = J(context);
        if (J == null) {
            return null;
        }
        Object a = a(context, J);
        if (a == null) {
            return null;
        }
        Method b = b(context, J);
        if (b == null) {
            return null;
        }
        return new j(a, b);
    }

    private static Class J(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method b(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }

    public j(Object obj, Method method) {
        this.og = obj;
        this.of = method;
    }

    public void logEvent(String str, Bundle bundle) {
        logEvent("fab", str, bundle);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        try {
            this.of.invoke(this.og, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }
}
