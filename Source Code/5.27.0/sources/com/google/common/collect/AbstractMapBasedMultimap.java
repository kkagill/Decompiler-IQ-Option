package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class AbstractMapBasedMultimap<K, V> extends c<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient int UR;
    private transient Map<K, Collection<V>> map;

    class g extends AbstractCollection<V> {
        Collection<V> Ve;
        final g Vf;
        final Collection<V> Vg;
        final K key;

        class a implements Iterator<V> {
            final Iterator<V> UW;
            final Collection<V> Vh = g.this.Ve;

            a() {
                this.UW = AbstractMapBasedMultimap.i(g.this.Ve);
            }

            a(Iterator<V> it) {
                this.UW = it;
            }

            /* Access modifiers changed, original: 0000 */
            public void rZ() {
                g.this.rU();
                if (g.this.Ve != this.Vh) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                rZ();
                return this.UW.hasNext();
            }

            public V next() {
                rZ();
                return this.UW.next();
            }

            public void remove() {
                this.UW.remove();
                AbstractMapBasedMultimap.this.UR = AbstractMapBasedMultimap.this.UR - 1;
                g.this.rV();
            }
        }

        g(K k, Collection<V> collection, g gVar) {
            Collection collection2;
            this.key = k;
            this.Ve = collection;
            this.Vf = gVar;
            if (gVar == null) {
                collection2 = null;
            } else {
                collection2 = gVar.rX();
            }
            this.Vg = collection2;
        }

        /* Access modifiers changed, original: 0000 */
        public void rU() {
            g gVar = this.Vf;
            if (gVar != null) {
                gVar.rU();
                if (this.Vf.rX() != this.Vg) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.Ve.isEmpty()) {
                Collection collection = (Collection) AbstractMapBasedMultimap.this.map.get(this.key);
                if (collection != null) {
                    this.Ve = collection;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void rV() {
            g gVar = this.Vf;
            if (gVar != null) {
                gVar.rV();
            } else if (this.Ve.isEmpty()) {
                AbstractMapBasedMultimap.this.map.remove(this.key);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public K getKey() {
            return this.key;
        }

        /* Access modifiers changed, original: 0000 */
        public void rW() {
            g gVar = this.Vf;
            if (gVar != null) {
                gVar.rW();
            } else {
                AbstractMapBasedMultimap.this.map.put(this.key, this.Ve);
            }
        }

        public int size() {
            rU();
            return this.Ve.size();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            rU();
            return this.Ve.equals(obj);
        }

        public int hashCode() {
            rU();
            return this.Ve.hashCode();
        }

        public String toString() {
            rU();
            return this.Ve.toString();
        }

        /* Access modifiers changed, original: 0000 */
        public Collection<V> rX() {
            return this.Ve;
        }

        public Iterator<V> iterator() {
            rU();
            return new a();
        }

        public boolean add(V v) {
            rU();
            boolean isEmpty = this.Ve.isEmpty();
            boolean add = this.Ve.add(v);
            if (add) {
                AbstractMapBasedMultimap.this.UR = AbstractMapBasedMultimap.this.UR + 1;
                if (isEmpty) {
                    rW();
                }
            }
            return add;
        }

        /* Access modifiers changed, original: 0000 */
        public g rY() {
            return this.Vf;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.Ve.addAll(collection);
            if (addAll) {
                int size2 = this.Ve.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.UR = abstractMapBasedMultimap.UR + (size2 - size);
                if (size == 0) {
                    rW();
                }
            }
            return addAll;
        }

        public boolean contains(Object obj) {
            rU();
            return this.Ve.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            rU();
            return this.Ve.containsAll(collection);
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.Ve.clear();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.UR = abstractMapBasedMultimap.UR - size;
                rV();
            }
        }

        public boolean remove(Object obj) {
            rU();
            boolean remove = this.Ve.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.this.UR = AbstractMapBasedMultimap.this.UR - 1;
                rV();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.Ve.removeAll(collection);
            if (removeAll) {
                int size2 = this.Ve.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.UR = abstractMapBasedMultimap.UR + (size2 - size);
                rV();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            com.google.common.base.i.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.Ve.retainAll(collection);
            if (retainAll) {
                int size2 = this.Ve.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.UR = abstractMapBasedMultimap.UR + (size2 - size);
                rV();
            }
            return retainAll;
        }
    }

    private class a extends d<K, Collection<V>> {
        final transient Map<K, Collection<V>> UT;

        class b implements Iterator<Entry<K, Collection<V>>> {
            final Iterator<Entry<K, Collection<V>>> UW = a.this.UT.entrySet().iterator();
            Collection<V> UX;

            b() {
            }

            public boolean hasNext() {
                return this.UW.hasNext();
            }

            public Entry<K, Collection<V>> next() {
                Entry entry = (Entry) this.UW.next();
                this.UX = (Collection) entry.getValue();
                return a.this.a(entry);
            }

            public void remove() {
                g.ai(this.UX != null);
                this.UW.remove();
                AbstractMapBasedMultimap.this.UR = AbstractMapBasedMultimap.this.UR - this.UX.size();
                this.UX.clear();
                this.UX = null;
            }
        }

        class a extends a<K, Collection<V>> {
            a() {
            }

            /* Access modifiers changed, original: 0000 */
            public Map<K, Collection<V>> rO() {
                return a.this;
            }

            public Iterator<Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            public boolean contains(Object obj) {
                return h.a(a.this.UT.entrySet(), obj);
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractMapBasedMultimap.this.aA(((Entry) obj).getKey());
                return true;
            }
        }

        a(Map<K, Collection<V>> map) {
            this.UT = map;
        }

        /* Access modifiers changed, original: protected */
        public Set<Entry<K, Collection<V>>> rN() {
            return new a();
        }

        public boolean containsKey(Object obj) {
            return Maps.b(this.UT, obj);
        }

        /* renamed from: az */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) Maps.a(this.UT, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.a(obj, collection);
        }

        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        public int size() {
            return this.UT.size();
        }

        /* renamed from: aB */
        public Collection<V> remove(Object obj) {
            Collection collection = (Collection) this.UT.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection rH = AbstractMapBasedMultimap.this.rH();
            rH.addAll(collection);
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.UR = abstractMapBasedMultimap.UR - collection.size();
            collection.clear();
            return rH;
        }

        public boolean equals(Object obj) {
            return this == obj || this.UT.equals(obj);
        }

        public int hashCode() {
            return this.UT.hashCode();
        }

        public String toString() {
            return this.UT.toString();
        }

        public void clear() {
            if (this.UT == AbstractMapBasedMultimap.this.map) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                t.n(new b());
            }
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<K, Collection<V>> a(Entry<K, Collection<V>> entry) {
            Object key = entry.getKey();
            return Maps.t(key, AbstractMapBasedMultimap.this.a(key, (Collection) entry.getValue()));
        }
    }

    class i extends g implements Set<V> {
        i(K k, Set<V> set) {
            super(k, set, null);
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean a = Sets.a((Set) this.Ve, (Collection) collection);
            if (a) {
                int size2 = this.Ve.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.UR = abstractMapBasedMultimap.UR + (size2 - size);
                rV();
            }
            return a;
        }
    }

    private class b extends b<K, Collection<V>> {
        b(Map<K, Collection<V>> map) {
            super(map);
        }

        public Iterator<K> iterator() {
            final Iterator it = rO().entrySet().iterator();
            return new Iterator<K>() {
                Entry<K, Collection<V>> Va;

                public boolean hasNext() {
                    return it.hasNext();
                }

                public K next() {
                    this.Va = (Entry) it.next();
                    return this.Va.getKey();
                }

                public void remove() {
                    g.ai(this.Va != null);
                    Collection collection = (Collection) this.Va.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.this.UR = AbstractMapBasedMultimap.this.UR - collection.size();
                    collection.clear();
                    this.Va = null;
                }
            };
        }

        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) rO().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.UR = abstractMapBasedMultimap.UR - size;
            } else {
                size = 0;
            }
            if (size > 0) {
                return true;
            }
            return false;
        }

        public void clear() {
            t.n(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return rO().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || rO().keySet().equals(obj);
        }

        public int hashCode() {
            return rO().keySet().hashCode();
        }
    }

    private class e extends a implements SortedMap<K, Collection<V>> {
        SortedSet<K> Vd;

        e(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* Access modifiers changed, original: 0000 */
        public SortedMap<K, Collection<V>> rT() {
            return (SortedMap) this.UT;
        }

        public Comparator<? super K> comparator() {
            return rT().comparator();
        }

        public K firstKey() {
            return rT().firstKey();
        }

        public K lastKey() {
            return rT().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new e(rT().headMap(k));
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new e(rT().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new e(rT().tailMap(k));
        }

        /* renamed from: rS */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.Vd;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet rR = rJ();
            this.Vd = rR;
            return rR;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: rR */
        public SortedSet<K> rJ() {
            return new f(rT());
        }
    }

    class c extends e implements NavigableMap<K, Collection<V>> {
        c(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: rP */
        public NavigableMap<K, Collection<V>> rT() {
            return (NavigableMap) super.rT();
        }

        public Entry<K, Collection<V>> lowerEntry(K k) {
            Entry lowerEntry = rT().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        public K lowerKey(K k) {
            return rT().lowerKey(k);
        }

        public Entry<K, Collection<V>> floorEntry(K k) {
            Entry floorEntry = rT().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        public K floorKey(K k) {
            return rT().floorKey(k);
        }

        public Entry<K, Collection<V>> ceilingEntry(K k) {
            Entry ceilingEntry = rT().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return rT().ceilingKey(k);
        }

        public Entry<K, Collection<V>> higherEntry(K k) {
            Entry higherEntry = rT().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        public K higherKey(K k) {
            return rT().higherKey(k);
        }

        public Entry<K, Collection<V>> firstEntry() {
            Entry firstEntry = rT().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        public Entry<K, Collection<V>> lastEntry() {
            Entry lastEntry = rT().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        public Entry<K, Collection<V>> pollFirstEntry() {
            return a(entrySet().iterator());
        }

        public Entry<K, Collection<V>> pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<K, Collection<V>> a(Iterator<Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Entry entry = (Entry) it.next();
            Collection rH = AbstractMapBasedMultimap.this.rH();
            rH.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.t(entry.getKey(), AbstractMapBasedMultimap.this.h(rH));
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new c(rT().descendingMap());
        }

        /* renamed from: keySet */
        public NavigableSet<K> rS() {
            return (NavigableSet) super.keySet();
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: rQ */
        public NavigableSet<K> rR() {
            return new d(rT());
        }

        public NavigableSet<K> navigableKeySet() {
            return rS();
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        /* renamed from: j */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new c(rT().subMap(k, z, k2, z2));
        }

        /* renamed from: aC */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new c(rT().headMap(k, z));
        }

        /* renamed from: aD */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new c(rT().tailMap(k, z));
        }
    }

    private class f extends b implements SortedSet<K> {
        f(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* Access modifiers changed, original: 0000 */
        public SortedMap<K, Collection<V>> rT() {
            return (SortedMap) super.rO();
        }

        public Comparator<? super K> comparator() {
            return rT().comparator();
        }

        public K first() {
            return rT().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new f(rT().headMap(k));
        }

        public K last() {
            return rT().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new f(rT().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new f(rT().tailMap(k));
        }
    }

    class d extends f implements NavigableSet<K> {
        d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: rP */
        public NavigableMap<K, Collection<V>> rT() {
            return (NavigableMap) super.rT();
        }

        public K lower(K k) {
            return rT().lowerKey(k);
        }

        public K floor(K k) {
            return rT().floorKey(k);
        }

        public K ceiling(K k) {
            return rT().ceilingKey(k);
        }

        public K higher(K k) {
            return rT().higherKey(k);
        }

        public K pollFirst() {
            return t.m(iterator());
        }

        public K pollLast() {
            return t.m(descendingIterator());
        }

        public NavigableSet<K> descendingSet() {
            return new d(rT().descendingMap());
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new d(rT().headMap(k, z));
        }

        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new d(rT().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new d(rT().tailMap(k, z));
        }
    }

    class j extends g implements SortedSet<V> {
        j(K k, SortedSet<V> sortedSet, g gVar) {
            super(k, sortedSet, gVar);
        }

        /* Access modifiers changed, original: 0000 */
        public SortedSet<V> sb() {
            return (SortedSet) rX();
        }

        public Comparator<? super V> comparator() {
            return sb().comparator();
        }

        public V first() {
            rU();
            return sb().first();
        }

        public V last() {
            rU();
            return sb().last();
        }

        public SortedSet<V> headSet(V v) {
            rU();
            return new j(getKey(), sb().headSet(v), rY() == null ? this : rY());
        }

        public SortedSet<V> subSet(V v, V v2) {
            rU();
            return new j(getKey(), sb().subSet(v, v2), rY() == null ? this : rY());
        }

        public SortedSet<V> tailSet(V v) {
            rU();
            return new j(getKey(), sb().tailSet(v), rY() == null ? this : rY());
        }
    }

    class h extends j implements NavigableSet<V> {
        h(K k, NavigableSet<V> navigableSet, g gVar) {
            super(k, navigableSet, gVar);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: sa */
        public NavigableSet<V> sb() {
            return (NavigableSet) super.sb();
        }

        public V lower(V v) {
            return sb().lower(v);
        }

        public V floor(V v) {
            return sb().floor(v);
        }

        public V ceiling(V v) {
            return sb().ceiling(v);
        }

        public V higher(V v) {
            return sb().higher(v);
        }

        public V pollFirst() {
            return t.m(iterator());
        }

        public V pollLast() {
            return t.m(descendingIterator());
        }

        private NavigableSet<V> a(NavigableSet<V> navigableSet) {
            return new h(this.key, navigableSet, rY() == null ? this : rY());
        }

        public NavigableSet<V> descendingSet() {
            return a(sb().descendingSet());
        }

        public Iterator<V> descendingIterator() {
            return new a(sb().descendingIterator());
        }

        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return a(sb().subSet(v, z, v2, z2));
        }

        public NavigableSet<V> headSet(V v, boolean z) {
            return a(sb().headSet(v, z));
        }

        public NavigableSet<V> tailSet(V v, boolean z) {
            return a(sb().tailSet(v, z));
        }
    }

    public abstract Collection<V> rH();

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        com.google.common.base.i.checkArgument(map.isEmpty());
        this.map = map;
    }

    /* Access modifiers changed, original: final */
    public final void n(Map<K, Collection<V>> map) {
        this.map = map;
        this.UR = 0;
        for (Collection collection : map.values()) {
            com.google.common.base.i.checkArgument(collection.isEmpty() ^ 1);
            this.UR += collection.size();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<V> ay(K k) {
        return rH();
    }

    /* Access modifiers changed, original: 0000 */
    public Map<K, Collection<V>> rI() {
        return this.map;
    }

    public int size() {
        return this.UR;
    }

    public boolean i(K k, V v) {
        Collection collection = (Collection) this.map.get(k);
        if (collection == null) {
            collection = ay(k);
            if (collection.add(v)) {
                this.UR++;
                this.map.put(k, collection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.UR++;
            return true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public <E> Collection<E> h(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public void clear() {
        for (Collection clear : this.map.values()) {
            clear.clear();
        }
        this.map.clear();
        this.UR = 0;
    }

    public Collection<V> az(K k) {
        Collection collection = (Collection) this.map.get(k);
        if (collection == null) {
            collection = ay(k);
        }
        return a((Object) k, collection);
    }

    /* Access modifiers changed, original: 0000 */
    public Collection<V> a(K k, Collection<V> collection) {
        return new g(k, collection, null);
    }

    private static <E> Iterator<E> i(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* Access modifiers changed, original: 0000 */
    public Set<K> rJ() {
        return new b(this.map);
    }

    /* Access modifiers changed, original: final */
    public final Set<K> rK() {
        Map map = this.map;
        if (map instanceof NavigableMap) {
            return new d((NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new f((SortedMap) map);
        }
        return new b(map);
    }

    private void aA(Object obj) {
        Collection collection = (Collection) Maps.c(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.UR -= size;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Map<K, Collection<V>> rL() {
        return new a(this.map);
    }

    /* Access modifiers changed, original: final */
    public final Map<K, Collection<V>> rM() {
        Map map = this.map;
        if (map instanceof NavigableMap) {
            return new c((NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new e((SortedMap) map);
        }
        return new a(map);
    }
}
