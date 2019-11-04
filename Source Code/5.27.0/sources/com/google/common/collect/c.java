package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractMultimap */
abstract class c<K, V> implements w<K, V> {
    private transient Set<K> Tx;
    private transient Map<K, Collection<V>> Vn;

    public abstract Set<K> rJ();

    public abstract Map<K, Collection<V>> rL();

    c() {
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) sg().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public boolean i(K k, V v) {
        return az(k).add(v);
    }

    public Set<K> keySet() {
        Set<K> set = this.Tx;
        if (set != null) {
            return set;
        }
        Set rJ = rJ();
        this.Tx = rJ;
        return rJ;
    }

    public Map<K, Collection<V>> sg() {
        Map<K, Collection<V>> map = this.Vn;
        if (map != null) {
            return map;
        }
        Map rL = rL();
        this.Vn = rL;
        return rL;
    }

    public boolean equals(Object obj) {
        return Multimaps.a((w) this, obj);
    }

    public int hashCode() {
        return sg().hashCode();
    }

    public String toString() {
        return sg().toString();
    }
}
