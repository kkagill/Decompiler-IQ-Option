package com.google.common.cache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Cache */
public interface b<K, V> {
    V a(K k, Callable<? extends V> callable);

    V ar(Object obj);

    void as(Object obj);

    void invalidateAll();

    void put(K k, V v);

    ConcurrentMap<K, V> qp();
}
