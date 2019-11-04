package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ad<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    /* renamed from: sk */
    public abstract Set<V> rH();

    protected AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* Access modifiers changed, original: 0000 */
    public <E> Collection<E> h(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<V> a(K k, Collection<V> collection) {
        return new i(k, (Set) collection);
    }

    /* renamed from: aE */
    public Set<V> az(K k) {
        return (Set) super.az(k);
    }

    public Map<K, Collection<V>> sg() {
        return super.sg();
    }

    public boolean i(K k, V v) {
        return super.i(k, v);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
