package com.google.android.gms.internal.gtm;

import java.util.Map.Entry;

final class zztj implements Comparable<zztj>, Entry<K, V> {
    private V value;
    private final /* synthetic */ zztc zzbef;
    private final K zzbei;

    zztj(zztc zztc, Entry<K, V> entry) {
        this(zztc, (Comparable) entry.getKey(), entry.getValue());
    }

    zztj(zztc zztc, K k, V v) {
        this.zzbef = zztc;
        this.zzbei = k;
        this.value = v;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        this.zzbef.zzrd();
        Object obj = this.value;
        this.value = v;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return equals(this.zzbei, entry.getKey()) && equals(this.value, entry.getValue());
    }

    public final int hashCode() {
        Comparable comparable = this.zzbei;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzbei);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    public final /* synthetic */ Object getKey() {
        return this.zzbei;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zztj) obj).getKey());
    }
}
