package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.d;
import com.google.common.base.j;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: FluentIterable */
public abstract class i<E> implements Iterable<E> {
    private final Optional<Iterable<E>> VR;

    protected i() {
        this.VR = Optional.pW();
    }

    i(Iterable<E> iterable) {
        Object iterable2;
        com.google.common.base.i.checkNotNull(iterable2);
        if (this == iterable2) {
            iterable2 = null;
        }
        this.VR = Optional.an(iterable2);
    }

    private Iterable<E> sA() {
        return (Iterable) this.VR.ae(this);
    }

    public static <E> i<E> b(final Iterable<E> iterable) {
        return iterable instanceof i ? (i) iterable : new i<E>(iterable) {
            public Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <E> i<E> d(E[] eArr) {
        return b(Arrays.asList(eArr));
    }

    public static <T> i<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return a(iterable, iterable2);
    }

    public static <T> i<T> c(final Iterable<? extends Iterable<? extends T>> iterable) {
        com.google.common.base.i.checkNotNull(iterable);
        return new i<T>() {
            public Iterator<T> iterator() {
                return t.k(t.a(iterable.iterator(), s.tB()));
            }
        };
    }

    private static <T> i<T> a(final Iterable<? extends T>... iterableArr) {
        for (Object checkNotNull : iterableArr) {
            com.google.common.base.i.checkNotNull(checkNotNull);
        }
        return new i<T>() {
            public Iterator<T> iterator() {
                return t.k(new a<Iterator<? extends T>>(iterableArr.length) {
                    /* renamed from: bP */
                    public Iterator<? extends T> get(int i) {
                        return iterableArr[i].iterator();
                    }
                });
            }
        };
    }

    public String toString() {
        return s.o(sA());
    }

    public final int size() {
        return s.n(sA());
    }

    public final i<E> d(Iterable<? extends E> iterable) {
        return a(sA(), iterable);
    }

    public final i<E> b(j<? super E> jVar) {
        return b(s.a(sA(), (j) jVar));
    }

    public final boolean c(j<? super E> jVar) {
        return s.b(sA(), (j) jVar);
    }

    public final Optional<E> d(j<? super E> jVar) {
        return s.c(sA(), (j) jVar);
    }

    public final <T> i<T> a(d<? super E, T> dVar) {
        return b(s.a(sA(), (d) dVar));
    }

    public <T> i<T> b(d<? super E, ? extends Iterable<? extends T>> dVar) {
        return c(a((d) dVar));
    }

    public final Optional<E> sB() {
        Iterator it = sA().iterator();
        return it.hasNext() ? Optional.am(it.next()) : Optional.pW();
    }

    public final i<E> bO(int i) {
        return b(s.b(sA(), i));
    }

    public final ImmutableList<E> sC() {
        return ImmutableList.f(sA());
    }

    public final ImmutableList<E> a(Comparator<? super E> comparator) {
        return Ordering.from((Comparator) comparator).immutableSortedCopy(sA());
    }

    public final ImmutableSet<E> sD() {
        return ImmutableSet.j(sA());
    }

    public final E[] c(Class<E> cls) {
        return s.a(sA(), (Class) cls);
    }
}
