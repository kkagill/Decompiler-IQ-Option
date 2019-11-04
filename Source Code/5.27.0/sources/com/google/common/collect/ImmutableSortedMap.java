package com.google.common.collect;

import com.google.common.base.i;
import com.google.common.collect.ImmutableCollection.b;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;

public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {
    private static final Comparator<Comparable> NATURAL_ORDER = Ordering.natural();
    private static final ImmutableSortedMap<Comparable, Object> Wq = new ImmutableSortedMap(ImmutableSortedSet.c(Ordering.natural()), ImmutableList.sQ());
    private static final long serialVersionUID = 0;
    private final transient RegularImmutableSortedSet<K> Wr;
    private final transient ImmutableList<V> Ws;
    private transient ImmutableSortedMap<K, V> Wt;

    public static class a<K, V> extends com.google.common.collect.ImmutableMap.a<K, V> {
        private final Comparator<? super K> comparator;
        private transient Object[] keys;
        private transient Object[] values;

        public a(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private a(Comparator<? super K> comparator, int i) {
            this.comparator = (Comparator) i.checkNotNull(comparator);
            this.keys = new Object[i];
            this.values = new Object[i];
        }

        private void ensureCapacity(int i) {
            Object[] objArr = this.keys;
            if (i > objArr.length) {
                i = b.v(objArr.length, i);
                this.keys = Arrays.copyOf(this.keys, i);
                this.values = Arrays.copyOf(this.values, i);
            }
        }

        /* renamed from: q */
        public a<K, V> m(K k, V v) {
            ensureCapacity(this.size + 1);
            g.k(k, v);
            this.keys[this.size] = k;
            this.values[this.size] = v;
            this.size++;
            return this;
        }

        /* renamed from: c */
        public a<K, V> b(Entry<? extends K, ? extends V> entry) {
            super.b(entry);
            return this;
        }

        /* renamed from: q */
        public a<K, V> p(Map<? extends K, ? extends V> map) {
            super.p(map);
            return this;
        }

        /* renamed from: l */
        public a<K, V> i(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            super.i(iterable);
            return this;
        }

        /* renamed from: tw */
        public ImmutableSortedMap<K, V> tf() {
            int i = this.size;
            if (i == 0) {
                return ImmutableSortedMap.b(this.comparator);
            }
            int i2 = 0;
            if (i == 1) {
                return ImmutableSortedMap.a(this.comparator, this.keys[0], this.values[0]);
            }
            Object[] copyOf = Arrays.copyOf(this.keys, this.size);
            Object[] objArr = copyOf;
            Arrays.sort(objArr, this.comparator);
            Object[] objArr2 = new Object[this.size];
            while (i2 < this.size) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.comparator.compare(copyOf[i3], copyOf[i2]) == 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("keys required to be distinct but compared as equal: ");
                        stringBuilder.append(copyOf[i3]);
                        stringBuilder.append(" and ");
                        stringBuilder.append(copyOf[i2]);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                objArr2[Arrays.binarySearch(objArr, this.keys[i2], this.comparator)] = this.values[i2];
                i2++;
            }
            return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.h(copyOf), this.comparator), ImmutableList.h(objArr2));
        }
    }

    private static class SerializedForm extends SerializedForm {
        private static final long serialVersionUID = 0;
        private final Comparator<Object> comparator;

        SerializedForm(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        /* Access modifiers changed, original: 0000 */
        public Object readResolve() {
            return a(new a(this.comparator));
        }
    }

    static <K, V> ImmutableSortedMap<K, V> b(Comparator<? super K> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return tr();
        }
        return new ImmutableSortedMap(ImmutableSortedSet.c(comparator), ImmutableList.sQ());
    }

    public static <K, V> ImmutableSortedMap<K, V> tr() {
        return Wq;
    }

    private static <K, V> ImmutableSortedMap<K, V> a(Comparator<? super K> comparator, K k, V v) {
        return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.aJ(k), (Comparator) i.checkNotNull(comparator)), ImmutableList.aJ(v));
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.Wr = regularImmutableSortedSet;
        this.Ws = immutableList;
        this.Wt = immutableSortedMap;
    }

    public int size() {
        return this.Ws.size();
    }

    public V get(Object obj) {
        int indexOf = this.Wr.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.Ws.get(indexOf);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean sP() {
        return this.Wr.sP() || this.Ws.sP();
    }

    /* renamed from: sY */
    public ImmutableSet<Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableSet<Entry<K, V>> sZ() {
        return isEmpty() ? ImmutableSet.tm() : new ImmutableMapEntrySet<K, V>() {
            /* renamed from: sK */
            public aj<Entry<K, V>> iterator() {
                return sO().iterator();
            }

            /* Access modifiers changed, original: 0000 */
            public ImmutableList<Entry<K, V>> tn() {
                return new ImmutableList<Entry<K, V>>() {
                    /* Access modifiers changed, original: 0000 */
                    public boolean sP() {
                        return true;
                    }

                    /* renamed from: bX */
                    public Entry<K, V> get(int i) {
                        return new SimpleImmutableEntry(ImmutableSortedMap.this.Wr.sO().get(i), ImmutableSortedMap.this.Ws.get(i));
                    }

                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            /* Access modifiers changed, original: 0000 */
            public ImmutableMap<K, V> th() {
                return ImmutableSortedMap.this;
            }
        };
    }

    /* renamed from: ts */
    public ImmutableSortedSet<K> ta() {
        return this.Wr;
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableSet<K> tb() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: tc */
    public ImmutableCollection<V> values() {
        return this.Ws;
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableCollection<V> td() {
        throw new AssertionError("should never be called");
    }

    public Comparator<? super K> comparator() {
        return ta().comparator();
    }

    public K firstKey() {
        return ta().first();
    }

    public K lastKey() {
        return ta().last();
    }

    private ImmutableSortedMap<K, V> A(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return b(comparator());
        }
        return new ImmutableSortedMap(this.Wr.E(i, i2), this.Ws.subList(i, i2));
    }

    /* renamed from: aQ */
    public ImmutableSortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    /* renamed from: a */
    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return A(0, this.Wr.g(i.checkNotNull(k), z));
    }

    /* renamed from: p */
    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    /* renamed from: a */
    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        i.checkNotNull(k);
        i.checkNotNull(k2);
        i.a(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", (Object) k, (Object) k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    /* renamed from: aR */
    public ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    /* renamed from: b */
    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return A(this.Wr.h(i.checkNotNull(k), z), size());
    }

    public Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return Maps.e(lowerEntry(k));
    }

    public Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return Maps.e(floorEntry(k));
    }

    public Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return Maps.e(ceilingEntry(k));
    }

    public Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return Maps.e(higherEntry(k));
    }

    public Entry<K, V> firstEntry() {
        return isEmpty() ? null : (Entry) entrySet().sO().get(0);
    }

    public Entry<K, V> lastEntry() {
        return isEmpty() ? null : (Entry) entrySet().sO().get(size() - 1);
    }

    @Deprecated
    public final Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: tt */
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.Wt;
        if (immutableSortedMap == null) {
            if (isEmpty()) {
                return b(Ordering.from(comparator()).reverse());
            }
            immutableSortedMap = new ImmutableSortedMap((RegularImmutableSortedSet) this.Wr.descendingSet(), this.Ws.sS(), this);
        }
        return immutableSortedMap;
    }

    /* renamed from: tu */
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.Wr;
    }

    /* renamed from: tv */
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.Wr.descendingSet();
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
