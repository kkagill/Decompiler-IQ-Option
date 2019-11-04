package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: ForwardingMap */
public abstract class m<K, V> extends o implements Map<K, V> {
    /* renamed from: sF */
    public abstract Map<K, V> qK();

    protected m() {
    }

    public int size() {
        return qK().size();
    }

    public boolean isEmpty() {
        return qK().isEmpty();
    }

    public V remove(Object obj) {
        return qK().remove(obj);
    }

    public void clear() {
        qK().clear();
    }

    public boolean containsKey(Object obj) {
        return qK().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return qK().containsValue(obj);
    }

    public V get(Object obj) {
        return qK().get(obj);
    }

    public V put(K k, V v) {
        return qK().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        qK().putAll(map);
    }

    public Set<K> keySet() {
        return qK().keySet();
    }

    public Collection<V> values() {
        return qK().values();
    }

    public Set<Entry<K, V>> entrySet() {
        return qK().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || qK().equals(obj);
    }

    public int hashCode() {
        return qK().hashCode();
    }
}
