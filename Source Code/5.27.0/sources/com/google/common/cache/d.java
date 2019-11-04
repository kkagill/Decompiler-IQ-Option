package com.google.common.cache;

import com.google.common.collect.o;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ForwardingCache */
public abstract class d<K, V> extends o implements b<K, V> {
    /* renamed from: qJ */
    public abstract b<K, V> qK();

    protected d() {
    }

    public V ar(Object obj) {
        return qK().ar(obj);
    }

    public V a(K k, Callable<? extends V> callable) {
        return qK().a(k, callable);
    }

    public void put(K k, V v) {
        qK().put(k, v);
    }

    public void as(Object obj) {
        qK().as(obj);
    }

    public void invalidateAll() {
        qK().invalidateAll();
    }

    public ConcurrentMap<K, V> qp() {
        return qK().qp();
    }
}
