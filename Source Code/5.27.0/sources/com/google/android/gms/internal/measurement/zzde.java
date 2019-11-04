package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

final class zzde<T> implements zzdb<T>, Serializable {
    private final T zzaby;

    zzde(T t) {
        this.zzaby = t;
    }

    public final T get() {
        return this.zzaby;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzde)) {
            return false;
        }
        zzde zzde = (zzde) obj;
        Object obj2 = this.zzaby;
        obj = zzde.zzaby;
        if (obj2 == obj || (obj2 != null && obj2.equals(obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzaby});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzaby);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("Suppliers.ofInstance(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
