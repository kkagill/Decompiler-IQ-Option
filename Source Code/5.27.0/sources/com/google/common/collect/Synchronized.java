package com.google.common.collect;

import com.google.common.base.i;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

final class Synchronized {

    static class SynchronizedObject implements Serializable {
        private static final long serialVersionUID = 0;
        final Object delegate;
        final Object mutex;

        SynchronizedObject(Object obj, Object obj2) {
            this.delegate = i.checkNotNull(obj);
            if (obj2 == null) {
                obj2 = this;
            }
            this.mutex = obj2;
        }

        /* Access modifiers changed, original: 0000 */
        public Object qK() {
            return this.delegate;
        }

        public String toString() {
            String obj;
            synchronized (this.mutex) {
                obj = this.delegate.toString();
            }
            return obj;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            synchronized (this.mutex) {
                objectOutputStream.defaultWriteObject();
            }
        }
    }

    static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        private SynchronizedCollection(Collection<E> collection, Object obj) {
            super(collection, obj);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: sv */
        public Collection<E> qK() {
            return (Collection) super.qK();
        }

        public boolean add(E e) {
            boolean add;
            synchronized (this.mutex) {
                add = qK().add(e);
            }
            return add;
        }

        public boolean addAll(Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = qK().addAll(collection);
            }
            return addAll;
        }

        public void clear() {
            synchronized (this.mutex) {
                qK().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean contains;
            synchronized (this.mutex) {
                contains = qK().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            synchronized (this.mutex) {
                containsAll = qK().containsAll(collection);
            }
            return containsAll;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = qK().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return qK().iterator();
        }

        public boolean remove(Object obj) {
            boolean remove;
            synchronized (this.mutex) {
                remove = qK().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            synchronized (this.mutex) {
                removeAll = qK().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            synchronized (this.mutex) {
                retainAll = qK().retainAll(collection);
            }
            return retainAll;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = qK().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] toArray;
            synchronized (this.mutex) {
                toArray = qK().toArray();
            }
            return toArray;
        }

        public <T> T[] toArray(T[] tArr) {
            Object[] toArray;
            synchronized (this.mutex) {
                toArray = qK().toArray(tArr);
            }
            return toArray;
        }
    }

    private static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;
        transient Set<K> Tx;
        transient Collection<V> Ty;
        transient Set<Entry<K, V>> Tz;

        SynchronizedMap(Map<K, V> map, Object obj) {
            super(map, obj);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: sF */
        public Map<K, V> qK() {
            return (Map) super.qK();
        }

        public void clear() {
            synchronized (this.mutex) {
                qK().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = qK().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = qK().containsValue(obj);
            }
            return containsValue;
        }

        public Set<Entry<K, V>> entrySet() {
            Set set;
            synchronized (this.mutex) {
                if (this.Tz == null) {
                    this.Tz = Synchronized.b(qK().entrySet(), this.mutex);
                }
                set = this.Tz;
            }
            return set;
        }

        public V get(Object obj) {
            synchronized (this.mutex) {
                obj = qK().get(obj);
            }
            return obj;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = qK().isEmpty();
            }
            return isEmpty;
        }

        public Set<K> keySet() {
            Set set;
            synchronized (this.mutex) {
                if (this.Tx == null) {
                    this.Tx = Synchronized.b(qK().keySet(), this.mutex);
                }
                set = this.Tx;
            }
            return set;
        }

        public V put(K k, V v) {
            Object put;
            synchronized (this.mutex) {
                put = qK().put(k, v);
            }
            return put;
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.mutex) {
                qK().putAll(map);
            }
        }

        public V remove(Object obj) {
            synchronized (this.mutex) {
                obj = qK().remove(obj);
            }
            return obj;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = qK().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection collection;
            synchronized (this.mutex) {
                if (this.Ty == null) {
                    this.Ty = Synchronized.e(qK().values(), this.mutex);
                }
                collection = this.Ty;
            }
            return collection;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            boolean equals;
            synchronized (this.mutex) {
                equals = qK().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = qK().hashCode();
            }
            return hashCode;
        }
    }

    private static class SynchronizedMultimap<K, V> extends SynchronizedObject implements w<K, V> {
        private static final long serialVersionUID = 0;
        transient Map<K, Collection<V>> Vn;

        /* Access modifiers changed, original: 0000 */
        /* renamed from: uA */
        public w<K, V> qK() {
            return (w) super.qK();
        }

        SynchronizedMultimap(w<K, V> wVar, Object obj) {
            super(wVar, obj);
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = qK().size();
            }
            return size;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = qK().isEmpty();
            }
            return isEmpty;
        }

        public Collection<V> az(K k) {
            Collection g;
            synchronized (this.mutex) {
                g = Synchronized.f(qK().az(k), this.mutex);
            }
            return g;
        }

        public boolean i(K k, V v) {
            boolean i;
            synchronized (this.mutex) {
                i = qK().i(k, v);
            }
            return i;
        }

        public boolean remove(Object obj, Object obj2) {
            boolean remove;
            synchronized (this.mutex) {
                remove = qK().remove(obj, obj2);
            }
            return remove;
        }

        public Map<K, Collection<V>> sg() {
            Map map;
            synchronized (this.mutex) {
                if (this.Vn == null) {
                    this.Vn = new SynchronizedAsMap(qK().sg(), this.mutex);
                }
                map = this.Vn;
            }
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            boolean equals;
            synchronized (this.mutex) {
                equals = qK().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = qK().hashCode();
            }
            return hashCode;
        }
    }

    private static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;
        transient Set<Entry<K, Collection<V>>> XL;
        transient Collection<Collection<V>> XM;

        SynchronizedAsMap(Map<K, Collection<V>> map, Object obj) {
            super(map, obj);
        }

        /* renamed from: az */
        public Collection<V> get(Object obj) {
            Collection<V> collection;
            synchronized (this.mutex) {
                Collection collection2 = (Collection) super.get(obj);
                if (collection2 == null) {
                    collection = null;
                } else {
                    collection = Synchronized.f(collection2, this.mutex);
                }
            }
            return collection;
        }

        public Set<Entry<K, Collection<V>>> entrySet() {
            Set set;
            synchronized (this.mutex) {
                if (this.XL == null) {
                    this.XL = new SynchronizedAsMapEntries(qK().entrySet(), this.mutex);
                }
                set = this.XL;
            }
            return set;
        }

        public Collection<Collection<V>> values() {
            Collection collection;
            synchronized (this.mutex) {
                if (this.XM == null) {
                    this.XM = new SynchronizedAsMapValues(qK().values(), this.mutex);
                }
                collection = this.XM;
            }
            return collection;
        }

        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }
    }

    private static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapValues(Collection<Collection<V>> collection, Object obj) {
            super(collection, obj);
        }

        public Iterator<Collection<V>> iterator() {
            return new ah<Collection<V>, Collection<V>>(super.iterator()) {
                /* Access modifiers changed, original: 0000 */
                /* renamed from: r */
                public Collection<V> aW(Collection<V> collection) {
                    return Synchronized.f((Collection) collection, SynchronizedAsMapValues.this.mutex);
                }
            };
        }
    }

    private static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        SynchronizedList(List<E> list, Object obj) {
            super(list, obj);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: uz */
        public List<E> sv() {
            return (List) super.qK();
        }

        public void add(int i, E e) {
            synchronized (this.mutex) {
                sv().add(i, e);
            }
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = sv().addAll(i, collection);
            }
            return addAll;
        }

        public E get(int i) {
            Object obj;
            synchronized (this.mutex) {
                obj = sv().get(i);
            }
            return obj;
        }

        public int indexOf(Object obj) {
            int indexOf;
            synchronized (this.mutex) {
                indexOf = sv().indexOf(obj);
            }
            return indexOf;
        }

        public int lastIndexOf(Object obj) {
            int lastIndexOf;
            synchronized (this.mutex) {
                lastIndexOf = sv().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        public ListIterator<E> listIterator() {
            return sv().listIterator();
        }

        public ListIterator<E> listIterator(int i) {
            return sv().listIterator(i);
        }

        public E remove(int i) {
            Object remove;
            synchronized (this.mutex) {
                remove = sv().remove(i);
            }
            return remove;
        }

        public E set(int i, E e) {
            Object obj;
            synchronized (this.mutex) {
                obj = sv().set(i, e);
            }
            return obj;
        }

        public List<E> subList(int i, int i2) {
            List g;
            synchronized (this.mutex) {
                g = Synchronized.f(sv().subList(i, i2), this.mutex);
            }
            return g;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            boolean equals;
            synchronized (this.mutex) {
                equals = sv().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = sv().hashCode();
            }
            return hashCode;
        }
    }

    static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSet(Set<E> set, Object obj) {
            super(set, obj);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: su */
        public Set<E> sv() {
            return (Set) super.qK();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            boolean equals;
            synchronized (this.mutex) {
                equals = sv().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = sv().hashCode();
            }
            return hashCode;
        }
    }

    private static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements ad<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSetMultimap(ad<K, V> adVar, Object obj) {
            super(adVar, obj);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: uB */
        public ad<K, V> uA() {
            return (ad) super.qK();
        }

        /* renamed from: aE */
        public Set<V> az(K k) {
            Set b;
            synchronized (this.mutex) {
                b = Synchronized.b(uA().aE(k), this.mutex);
            }
            return b;
        }
    }

    private static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapEntries(Set<Entry<K, Collection<V>>> set, Object obj) {
            super(set, obj);
        }

        public Iterator<Entry<K, Collection<V>>> iterator() {
            return new ah<Entry<K, Collection<V>>, Entry<K, Collection<V>>>(super.iterator()) {
                /* Access modifiers changed, original: 0000 */
                /* renamed from: g */
                public Entry<K, Collection<V>> aW(final Entry<K, Collection<V>> entry) {
                    return new n<K, Collection<V>>() {
                        /* Access modifiers changed, original: protected */
                        /* renamed from: sG */
                        public Entry<K, Collection<V>> qK() {
                            return entry;
                        }

                        /* renamed from: uy */
                        public Collection<V> getValue() {
                            return Synchronized.f((Collection) entry.getValue(), SynchronizedAsMapEntries.this.mutex);
                        }
                    };
                }
            };
        }

        public Object[] toArray() {
            Object[] q;
            synchronized (this.mutex) {
                q = y.q(sv());
            }
            return q;
        }

        public <T> T[] toArray(T[] tArr) {
            Object[] a;
            synchronized (this.mutex) {
                a = y.a(sv(), (Object[]) tArr);
            }
            return a;
        }

        public boolean contains(Object obj) {
            boolean c;
            synchronized (this.mutex) {
                c = Maps.c(sv(), obj);
            }
            return c;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean a;
            synchronized (this.mutex) {
                a = h.a(sv(), (Collection) collection);
            }
            return a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            boolean a;
            synchronized (this.mutex) {
                a = Sets.a(sv(), obj);
            }
            return a;
        }

        public boolean remove(Object obj) {
            boolean d;
            synchronized (this.mutex) {
                d = Maps.d(sv(), obj);
            }
            return d;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean a;
            synchronized (this.mutex) {
                a = t.a(sv().iterator(), (Collection) collection);
            }
            return a;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean b;
            synchronized (this.mutex) {
                b = t.b(sv().iterator(), (Collection) collection);
            }
            return b;
        }
    }

    private static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        SynchronizedRandomAccessList(List<E> list, Object obj) {
            super(list, obj);
        }
    }

    static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSet(SortedSet<E> sortedSet, Object obj) {
            super(sortedSet, obj);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: sH */
        public SortedSet<E> sv() {
            return (SortedSet) super.sv();
        }

        public Comparator<? super E> comparator() {
            Comparator comparator;
            synchronized (this.mutex) {
                comparator = sv().comparator();
            }
            return comparator;
        }

        public SortedSet<E> subSet(E e, E e2) {
            SortedSet b;
            synchronized (this.mutex) {
                b = Synchronized.a(sv().subSet(e, e2), this.mutex);
            }
            return b;
        }

        public SortedSet<E> headSet(E e) {
            SortedSet b;
            synchronized (this.mutex) {
                b = Synchronized.a(sv().headSet(e), this.mutex);
            }
            return b;
        }

        public SortedSet<E> tailSet(E e) {
            SortedSet b;
            synchronized (this.mutex) {
                b = Synchronized.a(sv().tailSet(e), this.mutex);
            }
            return b;
        }

        public E first() {
            Object first;
            synchronized (this.mutex) {
                first = sv().first();
            }
            return first;
        }

        public E last() {
            Object last;
            synchronized (this.mutex) {
                last = sv().last();
            }
            return last;
        }
    }

    private static <E> Collection<E> e(Collection<E> collection, Object obj) {
        return new SynchronizedCollection(collection, obj);
    }

    static <E> Set<E> b(Set<E> set, Object obj) {
        return new SynchronizedSet(set, obj);
    }

    private static <E> SortedSet<E> a(SortedSet<E> sortedSet, Object obj) {
        return new SynchronizedSortedSet(sortedSet, obj);
    }

    private static <E> List<E> f(List<E> list, Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    static <K, V> ad<K, V> a(ad<K, V> adVar, Object obj) {
        return ((adVar instanceof SynchronizedSetMultimap) || (adVar instanceof f)) ? adVar : new SynchronizedSetMultimap(adVar, obj);
    }

    private static <E> Collection<E> f(Collection<E> collection, Object obj) {
        if (collection instanceof SortedSet) {
            return a((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return b((Set) collection, obj);
        }
        if (collection instanceof List) {
            return f((List) collection, obj);
        }
        return e(collection, obj);
    }
}
