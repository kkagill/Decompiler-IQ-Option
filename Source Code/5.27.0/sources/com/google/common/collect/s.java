package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.d;
import com.google.common.base.i;
import com.google.common.base.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: Iterables */
public final class s {
    public static int n(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return t.i(iterable.iterator());
    }

    public static String o(Iterable<?> iterable) {
        return t.j(iterable.iterator());
    }

    public static <T> T[] a(Iterable<? extends T> iterable, Class<T> cls) {
        return a((Iterable) iterable, y.a((Class) cls, 0));
    }

    static <T> T[] a(Iterable<? extends T> iterable, T[] tArr) {
        return q(iterable).toArray(tArr);
    }

    static Object[] p(Iterable<?> iterable) {
        return q(iterable).toArray();
    }

    private static <E> Collection<E> q(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return Lists.p(iterable.iterator());
    }

    public static <T> Iterable<T> a(final Iterable<T> iterable, final j<? super T> jVar) {
        i.checkNotNull(iterable);
        i.checkNotNull(jVar);
        return new i<T>() {
            public Iterator<T> iterator() {
                return t.a(iterable.iterator(), jVar);
            }
        };
    }

    public static <T> boolean b(Iterable<T> iterable, j<? super T> jVar) {
        return t.b(iterable.iterator(), (j) jVar);
    }

    public static <T> Optional<T> c(Iterable<T> iterable, j<? super T> jVar) {
        return t.c(iterable.iterator(), (j) jVar);
    }

    public static <T> int d(Iterable<T> iterable, j<? super T> jVar) {
        return t.d(iterable.iterator(), jVar);
    }

    public static <F, T> Iterable<T> a(final Iterable<F> iterable, final d<? super F, ? extends T> dVar) {
        i.checkNotNull(iterable);
        i.checkNotNull(dVar);
        return new i<T>() {
            public Iterator<T> iterator() {
                return t.a(iterable.iterator(), dVar);
            }
        };
    }

    public static <T> T a(Iterable<T> iterable, int i) {
        i.checkNotNull(iterable);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        return t.a(iterable.iterator(), i);
    }

    public static <T> T a(Iterable<? extends T> iterable, T t) {
        return t.a(iterable.iterator(), (Object) t);
    }

    public static <T> T r(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return t.l(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return l(list);
        }
        throw new NoSuchElementException();
    }

    private static <T> T l(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> Iterable<T> b(final Iterable<T> iterable, final int i) {
        i.checkNotNull(iterable);
        i.checkArgument(i >= 0, "number to skip cannot be negative");
        return new i<T>() {
            public Iterator<T> iterator() {
                Iterable iterable = iterable;
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), i), list.size()).iterator();
                }
                final Iterator it = iterable.iterator();
                t.b(it, i);
                return new Iterator<T>() {
                    boolean WA = true;

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public T next() {
                        Object next = it.next();
                        this.WA = false;
                        return next;
                    }

                    public void remove() {
                        g.ai(this.WA ^ 1);
                        it.remove();
                    }
                };
            }
        };
    }

    public static <T> Iterable<T> c(final Iterable<T> iterable, final int i) {
        i.checkNotNull(iterable);
        i.checkArgument(i >= 0, "limit is negative");
        return new i<T>() {
            public Iterator<T> iterator() {
                return t.c(iterable.iterator(), i);
            }
        };
    }

    static <T> d<Iterable<? extends T>, Iterator<? extends T>> tB() {
        return new d<Iterable<? extends T>, Iterator<? extends T>>() {
            /* renamed from: s */
            public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
                return iterable.iterator();
            }
        };
    }
}
