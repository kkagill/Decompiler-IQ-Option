package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class zzii extends AbstractSet<Entry<K, V>> {
    private final /* synthetic */ zzhz zzaal;

    private zzii(zzhz zzhz) {
        this.zzaal = zzhz;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new zzih(this.zzaal, null);
    }

    public int size() {
        return this.zzaal.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.zzaal.get(entry.getKey());
        obj = entry.getValue();
        return obj2 == obj || (obj2 != null && obj2.equals(obj));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzaal.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzaal.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzaal.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzii(zzhz zzhz, zzia zzia) {
        this(zzhz);
    }
}
