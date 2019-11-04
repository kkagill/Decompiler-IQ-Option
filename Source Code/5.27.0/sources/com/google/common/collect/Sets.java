package com.google.common.collect;

import com.google.common.base.i;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public final class Sets {

    static abstract class a<E> extends AbstractSet<E> {
        a() {
        }

        public boolean removeAll(Collection<?> collection) {
            return Sets.a((Set) this, (Collection) collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) i.checkNotNull(collection));
        }
    }

    static final class UnmodifiableNavigableSet<E> extends q<E> implements Serializable, NavigableSet<E> {
        private static final long serialVersionUID = 0;
        private transient UnmodifiableNavigableSet<E> XJ;
        private final NavigableSet<E> delegate;
        private final SortedSet<E> unmodifiableDelegate;

        UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) i.checkNotNull(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: sH */
        public SortedSet<E> sv() {
            return this.unmodifiableDelegate;
        }

        public E lower(E e) {
            return this.delegate.lower(e);
        }

        public E floor(E e) {
            return this.delegate.floor(e);
        }

        public E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        public E higher(E e) {
            return this.delegate.higher(e);
        }

        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        public NavigableSet<E> descendingSet() {
            NavigableSet<E> navigableSet = this.XJ;
            if (navigableSet != null) {
                return navigableSet;
            }
            UnmodifiableNavigableSet unmodifiableNavigableSet = new UnmodifiableNavigableSet(this.delegate.descendingSet());
            this.XJ = unmodifiableNavigableSet;
            unmodifiableNavigableSet.XJ = this;
            return unmodifiableNavigableSet;
        }

        public Iterator<E> descendingIterator() {
            return t.h(this.delegate.descendingIterator());
        }

        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.unmodifiableNavigableSet(this.delegate.subSet(e, z, e2, z2));
        }

        public NavigableSet<E> headSet(E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.delegate.headSet(e, z));
        }

        public NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.delegate.tailSet(e, z));
        }
    }

    public static <E> HashSet<E> uw() {
        return new HashSet();
    }

    public static <E> HashSet<E> x(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet(h.a(iterable));
        }
        return u(iterable.iterator());
    }

    public static <E> HashSet<E> u(Iterator<? extends E> it) {
        Collection uw = uw();
        t.a(uw, (Iterator) it);
        return uw;
    }

    public static <E> HashSet<E> cs(int i) {
        return new HashSet(Maps.ci(i));
    }

    public static <E> Set<E> ux() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> TreeSet<E> d(Comparator<? super E> comparator) {
        return new TreeSet((Comparator) i.checkNotNull(comparator));
    }

    static int c(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    static boolean a(Set<?> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (!(set.size() == set2.size() && set.containsAll(set2))) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    static boolean a(Set<?> set, Iterator<?> it) {
        int i = 0;
        while (it.hasNext()) {
            i |= set.remove(it.next());
        }
        return i;
    }

    static boolean a(Set<?> set, Collection<?> collection) {
        Collection collection2;
        i.checkNotNull(collection2);
        if (collection2 instanceof x) {
            collection2 = ((x) collection2).sh();
        }
        if (!(collection2 instanceof Set) || collection2.size() <= set.size()) {
            return a((Set) set, collection2.iterator());
        }
        return t.a(set.iterator(), collection2);
    }
}
