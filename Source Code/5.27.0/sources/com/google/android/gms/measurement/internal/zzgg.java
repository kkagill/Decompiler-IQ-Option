package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;

public final class zzgg {
    public static void zza(@NonNull Bundle bundle, @NonNull Object obj) {
        boolean z = obj instanceof Double;
        String str = ConditionalUserProperty.VALUE;
        if (z) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else {
            bundle.putString(str, obj.toString());
        }
    }

    public static <T> T zza(@NonNull Bundle bundle, String str, Class<T> cls, T t) {
        Object obj = bundle.get(str);
        if (obj == null) {
            return t;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj.getClass().getCanonicalName()}));
    }
}
