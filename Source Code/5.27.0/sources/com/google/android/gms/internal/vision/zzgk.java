package com.google.android.gms.internal.vision;

import java.util.Map.Entry;

final class zzgk<K> implements Entry<K, Object> {
    private Entry<K, zzgi> zzyf;

    private zzgk(Entry<K, zzgi> entry) {
        this.zzyf = entry;
    }

    public final K getKey() {
        return this.zzyf.getKey();
    }

    public final Object getValue() {
        if (((zzgi) this.zzyf.getValue()) == null) {
            return null;
        }
        return zzgi.zzfr();
    }

    public final zzgi zzfs() {
        return (zzgi) this.zzyf.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzhf) {
            return ((zzgi) this.zzyf.getValue()).zzi((zzhf) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
