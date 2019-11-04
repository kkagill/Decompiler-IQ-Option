package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* compiled from: Multimap */
public interface w<K, V> {
    Collection<V> az(K k);

    boolean equals(Object obj);

    int hashCode();

    boolean i(K k, V v);

    boolean isEmpty();

    boolean remove(Object obj, Object obj2);

    Map<K, Collection<V>> sg();

    int size();
}
