package com.google.android.gms.internal.measurement;

import java.io.Serializable;

final class zzdd<T> implements zzdb<T>, Serializable {
    private transient T value;
    private final zzdb<T> zzabs;
    private volatile transient boolean zzdh;

    zzdd(zzdb<T> zzdb) {
        this.zzabs = (zzdb) zzcz.checkNotNull(zzdb);
    }

    public final T get() {
        if (!this.zzdh) {
            synchronized (this) {
                if (!this.zzdh) {
                    Object obj = this.zzabs.get();
                    this.value = obj;
                    this.zzdh = true;
                    return obj;
                }
            }
        }
        return this.value;
    }

    public final String toString() {
        String valueOf;
        StringBuilder stringBuilder;
        Object stringBuilder2;
        if (this.zzdh) {
            valueOf = String.valueOf(this.value);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(valueOf);
            stringBuilder.append(">");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = this.zzabs;
        }
        valueOf = String.valueOf(stringBuilder2);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
