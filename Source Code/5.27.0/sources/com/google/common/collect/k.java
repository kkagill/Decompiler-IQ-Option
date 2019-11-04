package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* compiled from: ForwardingConcurrentMap */
public abstract class k<K, V> extends m<K, V> implements ConcurrentMap<K, V> {
    /* renamed from: sE */
    public abstract ConcurrentMap<K, V> sF();

    protected k() {
    }

    public V putIfAbsent(K k, V v) {
        return sF().putIfAbsent(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return sF().remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return sF().replace(k, v);
    }

    public boolean replace(K k, V v, V v2) {
        return sF().replace(k, v, v2);
    }
}
