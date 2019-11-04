package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public abstract class ImmutableMultimap<K, V> extends f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    public static class a<K, V> {
        Comparator<? super V> Wh;
        Map<K, Collection<V>> Wk = aa.ut();
        Comparator<? super K> Wl;

        /* Access modifiers changed, original: 0000 */
        public Collection<V> tk() {
            return new ArrayList();
        }

        public a<K, V> n(K k, V v) {
            g.k(k, v);
            Collection collection = (Collection) this.Wk.get(k);
            if (collection == null) {
                Map map = this.Wk;
                Collection tk = tk();
                map.put(k, tk);
                collection = tk;
            }
            collection.add(v);
            return this;
        }

        public ImmutableMultimap<K, V> tl() {
            Collection entrySet = this.Wk.entrySet();
            Comparator comparator = this.Wl;
            if (comparator != null) {
                entrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(entrySet);
            }
            return ImmutableListMultimap.a(entrySet, this.Wh);
        }
    }

    static class b {
        static final a<ImmutableMultimap> Wm = ac.b(ImmutableMultimap.class, "map");
        static final a<ImmutableMultimap> Wn = ac.b(ImmutableMultimap.class, "size");
    }

    /* renamed from: aM */
    public abstract ImmutableCollection<V> az(K k);

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> a<K, V> ti() {
        return new a();
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    @Deprecated
    public boolean i(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.size;
    }

    /* renamed from: ta */
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    /* Access modifiers changed, original: 0000 */
    public Set<K> rJ() {
        throw new AssertionError("unreachable");
    }

    /* renamed from: tj */
    public ImmutableMap<K, Collection<V>> sg() {
        return this.map;
    }

    /* Access modifiers changed, original: 0000 */
    public Map<K, Collection<V>> rL() {
        throw new AssertionError("should never be called");
    }
}
