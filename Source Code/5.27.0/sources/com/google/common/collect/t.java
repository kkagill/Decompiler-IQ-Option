package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.d;
import com.google.common.base.f;
import com.google.common.base.i;
import com.google.common.base.j;
import com.google.common.primitives.c;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators */
public final class t {

    /* compiled from: Iterators */
    private static class b<T> implements Iterator<T> {
        private Iterator<? extends T> WI;
        private Iterator<? extends T> WJ = t.tC();
        private Iterator<? extends Iterator<? extends T>> WK;
        private Deque<Iterator<? extends Iterator<? extends T>>> WL;

        b(Iterator<? extends Iterator<? extends T>> it) {
            this.WK = (Iterator) i.checkNotNull(it);
        }

        private Iterator<? extends Iterator<? extends T>> tE() {
            while (true) {
                Iterator it = this.WK;
                if (it != null && it.hasNext()) {
                    return this.WK;
                }
                Deque deque = this.WL;
                if (deque != null && !deque.isEmpty()) {
                    this.WK = (Iterator) this.WL.removeFirst();
                }
            }
            return null;
        }

        public boolean hasNext() {
            while (!((Iterator) i.checkNotNull(this.WJ)).hasNext()) {
                this.WK = tE();
                Iterator it = this.WK;
                if (it == null) {
                    return false;
                }
                this.WJ = (Iterator) it.next();
                it = this.WJ;
                if (it instanceof b) {
                    b bVar = (b) it;
                    this.WJ = bVar.WJ;
                    if (this.WL == null) {
                        this.WL = new ArrayDeque();
                    }
                    this.WL.addFirst(this.WK);
                    if (bVar.WL != null) {
                        while (!bVar.WL.isEmpty()) {
                            this.WL.addFirst(bVar.WL.removeLast());
                        }
                    }
                    this.WK = bVar.WK;
                }
            }
            return true;
        }

        public T next() {
            if (hasNext()) {
                Iterator it = this.WJ;
                this.WI = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            g.ai(this.WI != null);
            this.WI.remove();
            this.WI = null;
        }
    }

    /* compiled from: Iterators */
    private static final class a<T> extends a<T> {
        static final ak<Object> WH = new a(new Object[0], 0, 0, 0);
        private final T[] array;
        private final int offset;

        a(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.array = tArr;
            this.offset = i;
        }

        /* Access modifiers changed, original: protected */
        public T get(int i) {
            return this.array[this.offset + i];
        }
    }

    static <T> aj<T> tC() {
        return tD();
    }

    static <T> ak<T> tD() {
        return a.WH;
    }

    public static <T> aj<T> h(final Iterator<? extends T> it) {
        i.checkNotNull(it);
        if (it instanceof aj) {
            return (aj) it;
        }
        return new aj<T>() {
            public boolean hasNext() {
                return it.hasNext();
            }

            public T next() {
                return it.next();
            }
        };
    }

    public static int i(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return c.G(j);
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        i.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean b(Iterator<?> it, Collection<?> collection) {
        i.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!f.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return it2.hasNext() ^ 1;
    }

    public static String j(Iterator<?> it) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        Object obj = 1;
        while (it.hasNext()) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            obj = null;
            stringBuilder.append(it.next());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        i.checkNotNull(collection);
        i.checkNotNull(it);
        int i = 0;
        while (it.hasNext()) {
            i |= collection.add(it.next());
        }
        return i;
    }

    public static <T> Iterator<T> k(Iterator<? extends Iterator<? extends T>> it) {
        return new b(it);
    }

    public static <T> aj<T> a(final Iterator<T> it, final j<? super T> jVar) {
        i.checkNotNull(it);
        i.checkNotNull(jVar);
        return new AbstractIterator<T>() {
            /* Access modifiers changed, original: protected */
            public T pO() {
                while (it.hasNext()) {
                    Object next = it.next();
                    if (jVar.apply(next)) {
                        return next;
                    }
                }
                return pP();
            }
        };
    }

    public static <T> boolean b(Iterator<T> it, j<? super T> jVar) {
        return d(it, jVar) != -1;
    }

    public static <T> Optional<T> c(Iterator<T> it, j<? super T> jVar) {
        i.checkNotNull(it);
        i.checkNotNull(jVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (jVar.apply(next)) {
                return Optional.am(next);
            }
        }
        return Optional.pW();
    }

    public static <T> int d(Iterator<T> it, j<? super T> jVar) {
        i.checkNotNull(jVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (jVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> Iterator<T> a(Iterator<F> it, final d<? super F, ? extends T> dVar) {
        i.checkNotNull(dVar);
        return new ah<F, T>(it) {
            /* Access modifiers changed, original: 0000 */
            public T aW(F f) {
                return dVar.apply(f);
            }
        };
    }

    public static <T> T a(Iterator<T> it, int i) {
        bY(i);
        int b = b((Iterator) it, i);
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("position (");
        stringBuilder.append(i);
        stringBuilder.append(") must be less than the number of elements that remained (");
        stringBuilder.append(b);
        stringBuilder.append(")");
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    static void bY(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("position (");
            stringBuilder.append(i);
            stringBuilder.append(") must not be negative");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public static <T> T a(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T l(Iterator<T> it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int b(Iterator<?> it, int i) {
        i.checkNotNull(it);
        int i2 = 0;
        i.checkArgument(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> Iterator<T> c(final Iterator<T> it, final int i) {
        i.checkNotNull(it);
        i.checkArgument(i >= 0, "limit is negative");
        return new Iterator<T>() {
            private int count;

            public boolean hasNext() {
                return this.count < i && it.hasNext();
            }

            public T next() {
                if (hasNext()) {
                    this.count++;
                    return it.next();
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    static <T> T m(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void n(Iterator<?> it) {
        i.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> aj<T> aV(final T t) {
        return new aj<T>() {
            boolean done;

            public boolean hasNext() {
                return this.done ^ 1;
            }

            public T next() {
                if (this.done) {
                    throw new NoSuchElementException();
                }
                this.done = true;
                return t;
            }
        };
    }

    static <T> ListIterator<T> o(Iterator<T> it) {
        return (ListIterator) it;
    }
}
