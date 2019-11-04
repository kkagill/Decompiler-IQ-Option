package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.b;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;

public abstract class ImmutableMap<K, V> implements Serializable, Map<K, V> {
    static final Entry<?, ?>[] Wd = new Entry[0];
    private transient ImmutableSet<Entry<K, V>> We;
    private transient ImmutableSet<K> Wf;
    private transient ImmutableCollection<V> Wg;

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        SerializedForm(ImmutableMap<?, ?> immutableMap) {
            this.keys = new Object[immutableMap.size()];
            this.values = new Object[immutableMap.size()];
            aj sK = immutableMap.entrySet().iterator();
            int i = 0;
            while (sK.hasNext()) {
                Entry entry = (Entry) sK.next();
                this.keys[i] = entry.getKey();
                this.values[i] = entry.getValue();
                i++;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public Object readResolve() {
            return a(new a(this.keys.length));
        }

        /* Access modifiers changed, original: 0000 */
        public Object a(a<Object, Object> aVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.keys;
                if (i >= objArr.length) {
                    return aVar.tf();
                }
                aVar.m(objArr[i], this.values[i]);
                i++;
            }
        }
    }

    public static class a<K, V> {
        Comparator<? super V> Wh;
        Object[] Wi;
        boolean Wj;
        int size;

        public a() {
            this(4);
        }

        a(int i) {
            this.Wi = new Object[(i * 2)];
            this.size = 0;
            this.Wj = false;
        }

        private void ensureCapacity(int i) {
            i *= 2;
            Object[] objArr = this.Wi;
            if (i > objArr.length) {
                this.Wi = Arrays.copyOf(objArr, b.v(objArr.length, i));
                this.Wj = false;
            }
        }

        public a<K, V> m(K k, V v) {
            ensureCapacity(this.size + 1);
            g.k(k, v);
            Object[] objArr = this.Wi;
            int i = this.size;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.size = i + 1;
            return this;
        }

        public a<K, V> b(Entry<? extends K, ? extends V> entry) {
            return m(entry.getKey(), entry.getValue());
        }

        public a<K, V> p(Map<? extends K, ? extends V> map) {
            return i(map.entrySet());
        }

        public a<K, V> i(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                ensureCapacity(this.size + ((Collection) iterable).size());
            }
            for (Entry b : iterable) {
                b(b);
            }
            return this;
        }

        public ImmutableMap<K, V> tf() {
            tg();
            this.Wj = true;
            return RegularImmutableMap.c(this.size, this.Wi);
        }

        /* Access modifiers changed, original: 0000 */
        public void tg() {
            if (this.Wh != null) {
                int i;
                if (this.Wj) {
                    this.Wi = Arrays.copyOf(this.Wi, this.size * 2);
                }
                Entry[] entryArr = new Entry[this.size];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = this.size;
                    if (i3 >= i) {
                        break;
                    }
                    Object[] objArr = this.Wi;
                    int i4 = i3 * 2;
                    entryArr[i3] = new SimpleImmutableEntry(objArr[i4], objArr[i4 + 1]);
                    i3++;
                }
                Arrays.sort(entryArr, 0, i, Ordering.from(this.Wh).onResultOf(Maps.uj()));
                while (i2 < this.size) {
                    i = i2 * 2;
                    this.Wi[i] = entryArr[i2].getKey();
                    this.Wi[i + 1] = entryArr[i2].getValue();
                    i2++;
                }
            }
        }
    }

    public abstract V get(Object obj);

    public abstract boolean sP();

    public abstract ImmutableSet<Entry<K, V>> sZ();

    public abstract ImmutableSet<K> tb();

    public abstract ImmutableCollection<V> td();

    /* Access modifiers changed, original: 0000 */
    public boolean te() {
        return false;
    }

    public static <K, V> ImmutableMap<K, V> sW() {
        return RegularImmutableMap.XB;
    }

    public static <K, V> a<K, V> sX() {
        return new a();
    }

    public static <K, V> ImmutableMap<K, V> o(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.sP()) {
                return immutableMap;
            }
        }
        return h(map.entrySet());
    }

    public static <K, V> ImmutableMap<K, V> h(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.i(iterable);
        return aVar.tf();
    }

    ImmutableMap() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: sY */
    public ImmutableSet<Entry<K, V>> entrySet() {
        ImmutableSet<Entry<K, V>> immutableSet = this.We;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet sZ = sZ();
        this.We = sZ;
        return sZ;
    }

    /* renamed from: ta */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.Wf;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet tb = tb();
        this.Wf = tb;
        return tb;
    }

    /* renamed from: tc */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.Wg;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection td = td();
        this.Wg = td;
        return td;
    }

    public boolean equals(Object obj) {
        return Maps.d((Map) this, obj);
    }

    public int hashCode() {
        return Sets.c(entrySet());
    }

    public String toString() {
        return Maps.r((Map) this);
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
