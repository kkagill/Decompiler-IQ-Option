package com.google.common.collect;

import com.google.common.base.f;
import com.google.common.base.i;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class Maps {

    static class c<K, V> extends AbstractCollection<V> {
        final Map<K, V> map;

        c(Map<K, V> map) {
            this.map = (Map) i.checkNotNull(map);
        }

        /* Access modifiers changed, original: final */
        public final Map<K, V> rO() {
            return this.map;
        }

        public Iterator<V> iterator() {
            return Maps.r(rO().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                obj = super.remove(obj);
                return obj;
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : rO().entrySet()) {
                    if (f.equal(obj, entry.getValue())) {
                        rO().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.removeAll((Collection) i.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                HashSet uw = Sets.uw();
                for (Entry entry : rO().entrySet()) {
                    if (collection2.contains(entry.getValue())) {
                        uw.add(entry.getKey());
                    }
                }
                return rO().keySet().removeAll(uw);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.retainAll((Collection) i.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                HashSet uw = Sets.uw();
                for (Entry entry : rO().entrySet()) {
                    if (collection2.contains(entry.getValue())) {
                        uw.add(entry.getKey());
                    }
                }
                return rO().keySet().retainAll(uw);
            }
        }

        public int size() {
            return rO().size();
        }

        public boolean isEmpty() {
            return rO().isEmpty();
        }

        public boolean contains(Object obj) {
            return rO().containsValue(obj);
        }

        public void clear() {
            rO().clear();
        }
    }

    static abstract class d<K, V> extends AbstractMap<K, V> {
        private transient Set<K> Tx;
        private transient Collection<V> Ty;
        private transient Set<Entry<K, V>> Tz;

        public abstract Set<Entry<K, V>> rN();

        d() {
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.Tz;
            if (set != null) {
                return set;
            }
            Set rN = rN();
            this.Tz = rN;
            return rN;
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

        /* Access modifiers changed, original: 0000 */
        public Set<K> rJ() {
            return new b(this);
        }

        public Collection<V> values() {
            Collection<V> collection = this.Ty;
            if (collection != null) {
                return collection;
            }
            Collection sq = sq();
            this.Ty = sq;
            return sq;
        }

        /* Access modifiers changed, original: 0000 */
        public Collection<V> sq() {
            return new c(this);
        }
    }

    private enum EntryFunction implements com.google.common.base.d<Entry<?, ?>, Object> {
        KEY {
            public Object apply(Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            public Object apply(Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static abstract class a<K, V> extends a<Entry<K, V>> {
        public abstract Map<K, V> rO();

        a() {
        }

        public int size() {
            return rO().size();
        }

        public void clear() {
            rO().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object a = Maps.a(rO(), key);
            if (!f.equal(a, entry.getValue())) {
                return false;
            }
            if (a != null || rO().containsKey(key)) {
                return true;
            }
            return false;
        }

        public boolean isEmpty() {
            return rO().isEmpty();
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            return rO().keySet().remove(((Entry) obj).getKey());
        }

        public boolean removeAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.removeAll((Collection) i.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                return Sets.a((Set) this, collection2.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            Collection collection2;
            try {
                collection2 = super.retainAll((Collection) i.checkNotNull(collection2));
                return collection2;
            } catch (UnsupportedOperationException unused) {
                HashSet cs = Sets.cs(collection2.size());
                for (Object next : collection2) {
                    if (contains(next)) {
                        cs.add(((Entry) next).getKey());
                    }
                }
                return rO().keySet().retainAll(cs);
            }
        }
    }

    static class b<K, V> extends a<K> {
        final Map<K, V> map;

        b(Map<K, V> map) {
            this.map = (Map) i.checkNotNull(map);
        }

        /* Access modifiers changed, original: 0000 */
        public Map<K, V> rO() {
            return this.map;
        }

        public Iterator<K> iterator() {
            return Maps.q(rO().entrySet().iterator());
        }

        public int size() {
            return rO().size();
        }

        public boolean isEmpty() {
            return rO().isEmpty();
        }

        public boolean contains(Object obj) {
            return rO().containsKey(obj);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            rO().remove(obj);
            return true;
        }

        public void clear() {
            rO().clear();
        }
    }

    static <K> com.google.common.base.d<Entry<K, ?>, K> ui() {
        return EntryFunction.KEY;
    }

    static <V> com.google.common.base.d<Entry<?, V>, V> uj() {
        return EntryFunction.VALUE;
    }

    static <K, V> Iterator<K> q(Iterator<Entry<K, V>> it) {
        return new ah<Entry<K, V>, K>(it) {
            /* Access modifiers changed, original: 0000 */
            /* renamed from: f */
            public K aW(Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    static <K, V> Iterator<V> r(Iterator<Entry<K, V>> it) {
        return new ah<Entry<K, V>, V>(it) {
            /* Access modifiers changed, original: 0000 */
            /* renamed from: f */
            public V aW(Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    public static <K, V> HashMap<K, V> uk() {
        return new HashMap();
    }

    public static <K, V> HashMap<K, V> ch(int i) {
        return new HashMap(ci(i));
    }

    static int ci(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        } else {
            g.b(i, "expectedSize");
            return i + 1;
        }
    }

    public static <K, V> ConcurrentMap<K, V> ul() {
        return new ConcurrentHashMap();
    }

    public static <K, V> ImmutableMap<K, V> b(Iterable<V> iterable, com.google.common.base.d<? super V, K> dVar) {
        return b(iterable.iterator(), (com.google.common.base.d) dVar);
    }

    public static <K, V> ImmutableMap<K, V> b(Iterator<V> it, com.google.common.base.d<? super V, K> dVar) {
        i.checkNotNull(dVar);
        com.google.common.collect.ImmutableMap.a sX = ImmutableMap.sX();
        while (it.hasNext()) {
            Object next = it.next();
            sX.m(dVar.apply(next), next);
        }
        try {
            return sX.tf();
        } catch (IllegalArgumentException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e.getMessage());
            stringBuilder.append(". To index multiple values under a key, use Multimaps.index.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static <K, V> Entry<K, V> t(K k, V v) {
        return new ImmutableEntry(k, v);
    }

    static <K, V> Entry<K, V> d(final Entry<? extends K, ? extends V> entry) {
        i.checkNotNull(entry);
        return new b<K, V>() {
            public K getKey() {
                return entry.getKey();
            }

            public V getValue() {
                return entry.getValue();
            }
        };
    }

    static <V> V a(Map<?, V> map, Object obj) {
        i.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map<?, ?> map, Object obj) {
        i.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V c(Map<?, V> map, Object obj) {
        i.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <K, V> boolean c(Collection<Entry<K, V>> collection, Object obj) {
        if (obj instanceof Entry) {
            return collection.contains(d((Entry) obj));
        }
        return false;
    }

    static <K, V> boolean d(Collection<Entry<K, V>> collection, Object obj) {
        if (obj instanceof Entry) {
            return collection.remove(d((Entry) obj));
        }
        return false;
    }

    static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    static String r(Map<?, ?> map) {
        StringBuilder bz = h.bz(map.size());
        bz.append('{');
        Object obj = 1;
        for (Entry entry : map.entrySet()) {
            if (obj == null) {
                bz.append(", ");
            }
            obj = null;
            bz.append(entry.getKey());
            bz.append('=');
            bz.append(entry.getValue());
        }
        bz.append('}');
        return bz.toString();
    }

    static <K> K e(Entry<K, ?> entry) {
        return entry == null ? null : entry.getKey();
    }

    static <E> ImmutableMap<E, Integer> p(Collection<E> collection) {
        com.google.common.collect.ImmutableMap.a aVar = new com.google.common.collect.ImmutableMap.a(collection.size());
        int i = 0;
        for (E m : collection) {
            int i2 = i + 1;
            aVar.m(m, Integer.valueOf(i));
            i = i2;
        }
        return aVar.tf();
    }
}
