package com.google.common.collect;

import java.util.Map.Entry;

/* compiled from: ForwardingMapEntry */
public abstract class n<K, V> extends o implements Entry<K, V> {
    /* renamed from: sG */
    public abstract Entry<K, V> qK();

    protected n() {
    }

    public K getKey() {
        return qK().getKey();
    }

    public V getValue() {
        return qK().getValue();
    }

    public V setValue(V v) {
        return qK().setValue(v);
    }

    public boolean equals(Object obj) {
        return qK().equals(obj);
    }

    public int hashCode() {
        return qK().hashCode();
    }
}
