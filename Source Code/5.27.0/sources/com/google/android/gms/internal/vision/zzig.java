package com.google.android.gms.internal.vision;

import java.util.Map.Entry;

final class zzig implements Comparable<zzig>, Entry<K, V> {
    private V value;
    private final /* synthetic */ zzhz zzaal;
    private final K zzaao;

    zzig(zzhz zzhz, Entry<K, V> entry) {
        this(zzhz, (Comparable) entry.getKey(), entry.getValue());
    }

    zzig(zzhz zzhz, K k, V v) {
        this.zzaal = zzhz;
        this.zzaao = k;
        this.value = v;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        this.zzaal.zzgx();
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
        return equals(this.zzaao, entry.getKey()) && equals(this.value, entry.getValue());
    }

    public final int hashCode() {
        Comparable comparable = this.zzaao;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzaao);
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
        return this.zzaao;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzig) obj).getKey());
    }
}
