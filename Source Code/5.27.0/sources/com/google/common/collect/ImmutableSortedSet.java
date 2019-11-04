package com.google.common.collect;

import com.google.common.base.i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements ae<E>, NavigableSet<E> {
    transient ImmutableSortedSet<E> Wu;
    final transient Comparator<? super E> comparator;

    private static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator, Object[] objArr) {
            this.comparator = comparator;
            this.elements = objArr;
        }

        /* Access modifiers changed, original: 0000 */
        public Object readResolve() {
            return new a(this.comparator).k(this.elements).tq();
        }
    }

    public static final class a<E> extends com.google.common.collect.ImmutableSet.a<E> {
        private final Comparator<? super E> comparator;

        public a(Comparator<? super E> comparator) {
            this.comparator = (Comparator) i.checkNotNull(comparator);
        }

        /* renamed from: aU */
        public a<E> aO(E e) {
            super.aI(e);
            return this;
        }

        /* renamed from: l */
        public a<E> k(E... eArr) {
            super.e((Object[]) eArr);
            return this;
        }

        /* renamed from: m */
        public a<E> k(Iterable<? extends E> iterable) {
            super.e((Iterable) iterable);
            return this;
        }

        /* renamed from: g */
        public a<E> f(Iterator<? extends E> it) {
            super.b(it);
            return this;
        }

        /* renamed from: tA */
        public ImmutableSortedSet<E> tq() {
            ImmutableSortedSet a = ImmutableSortedSet.a(this.comparator, this.size, this.VY);
            this.size = a.size();
            this.VZ = true;
            return a;
        }
    }

    public abstract ImmutableSortedSet<E> c(E e, boolean z, E e2, boolean z2);

    public abstract ImmutableSortedSet<E> e(E e, boolean z);

    public abstract ImmutableSortedSet<E> f(E e, boolean z);

    public abstract int indexOf(Object obj);

    /* renamed from: sK */
    public abstract aj<E> iterator();

    public abstract ImmutableSortedSet<E> ty();

    /* renamed from: tz */
    public abstract aj<E> descendingIterator();

    static <E> RegularImmutableSortedSet<E> c(Comparator<? super E> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return RegularImmutableSortedSet.XG;
        }
        return new RegularImmutableSortedSet(ImmutableList.sQ(), comparator);
    }

    static <E> ImmutableSortedSet<E> a(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return c(comparator);
        }
        Object[] eArr2;
        y.d(eArr2, i);
        Arrays.sort(eArr2, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = eArr2[i3];
            if (comparator.compare(obj, eArr2[i2 - 1]) != 0) {
                int i4 = i2 + 1;
                eArr2[i2] = obj;
                i2 = i4;
            }
        }
        Arrays.fill(eArr2, i2, i, null);
        if (i2 < eArr2.length / 2) {
            eArr2 = Arrays.copyOf(eArr2, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.b(eArr2, i2), comparator);
    }

    /* Access modifiers changed, original: 0000 */
    public int r(Object obj, Object obj2) {
        return c(this.comparator, obj, obj2);
    }

    static int c(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    ImmutableSortedSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    /* renamed from: aS */
    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    /* renamed from: c */
    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        return e(i.checkNotNull(e), z);
    }

    /* renamed from: s */
    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    /* renamed from: b */
    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        i.checkNotNull(e);
        i.checkNotNull(e2);
        i.checkArgument(this.comparator.compare(e, e2) <= 0);
        return c(e, z, e2, z2);
    }

    /* renamed from: aT */
    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    /* renamed from: d */
    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return f(i.checkNotNull(e), z);
    }

    public E lower(E e) {
        return t.a(headSet(e, false).descendingIterator(), null);
    }

    public E floor(E e) {
        return t.a(headSet(e, true).descendingIterator(), null);
    }

    public E ceiling(E e) {
        return s.a(tailSet(e, true), null);
    }

    public E higher(E e) {
        return s.a(tailSet(e, false), null);
    }

    public E first() {
        return iterator().next();
    }

    public E last() {
        return descendingIterator().next();
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: tx */
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.Wu;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet ty = ty();
        this.Wu = ty;
        ty.Wu = this;
        return ty;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this.comparator, toArray());
    }
}
