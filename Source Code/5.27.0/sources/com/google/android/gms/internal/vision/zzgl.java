package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzgl<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> zzyg;

    public zzgl(Iterator<Entry<K, Object>> it) {
        this.zzyg = it;
    }

    public final boolean hasNext() {
        return this.zzyg.hasNext();
    }

    public final void remove() {
        this.zzyg.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.zzyg.next();
        return entry.getValue() instanceof zzgi ? new zzgk(entry) : entry;
    }
}
