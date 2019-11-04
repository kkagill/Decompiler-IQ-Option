package com.google.common.collect;

import com.google.common.base.d;
import com.google.common.base.f;
import com.google.common.base.i;
import com.google.common.primitives.c;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class Lists {

    private static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (Object[]) i.checkNotNull(eArr);
        }

        public int size() {
            return com.google.common.c.b.I(this.rest.length, 1);
        }

        public E get(int i) {
            i.s(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }
    }

    private static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final d<? super F, ? extends T> function;

        TransformingRandomAccessList(List<F> list, d<? super F, ? extends T> dVar) {
            this.fromList = (List) i.checkNotNull(list);
            this.function = (d) i.checkNotNull(dVar);
        }

        public void clear() {
            this.fromList.clear();
        }

        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            return new ai<F, T>(this.fromList.listIterator(i)) {
                /* Access modifiers changed, original: 0000 */
                public T aW(F f) {
                    return TransformingRandomAccessList.this.function.apply(f);
                }
            };
        }

        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    private static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final d<? super F, ? extends T> function;

        TransformingSequentialList(List<F> list, d<? super F, ? extends T> dVar) {
            this.fromList = (List) i.checkNotNull(list);
            this.function = (d) i.checkNotNull(dVar);
        }

        public void clear() {
            this.fromList.clear();
        }

        public int size() {
            return this.fromList.size();
        }

        public ListIterator<T> listIterator(int i) {
            return new ai<F, T>(this.fromList.listIterator(i)) {
                /* Access modifiers changed, original: 0000 */
                public T aW(F f) {
                    return TransformingSequentialList.this.function.apply(f);
                }
            };
        }
    }

    private static class b<T> extends AbstractList<T> {
        private final List<T> WM;

        b(List<T> list) {
            this.WM = (List) i.checkNotNull(list);
        }

        /* Access modifiers changed, original: 0000 */
        public List<T> tF() {
            return this.WM;
        }

        private int bU(int i) {
            int size = size();
            i.s(i, size);
            return (size - 1) - i;
        }

        private int bV(int i) {
            int size = size();
            i.t(i, size);
            return size - i;
        }

        public void add(int i, T t) {
            this.WM.add(bV(i), t);
        }

        public void clear() {
            this.WM.clear();
        }

        public T remove(int i) {
            return this.WM.remove(bU(i));
        }

        /* Access modifiers changed, original: protected */
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        public T set(int i, T t) {
            return this.WM.set(bU(i), t);
        }

        public T get(int i) {
            return this.WM.get(bU(i));
        }

        public int size() {
            return this.WM.size();
        }

        public List<T> subList(int i, int i2) {
            i.f(i, i2, size());
            return Lists.reverse(this.WM.subList(bV(i2), bV(i)));
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            final ListIterator listIterator = this.WM.listIterator(bV(i));
            return new ListIterator<T>() {
                boolean WN;

                public void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.WN = false;
                }

                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                public T next() {
                    if (hasNext()) {
                        this.WN = true;
                        return listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                public int nextIndex() {
                    return b.this.bV(listIterator.nextIndex());
                }

                public T previous() {
                    if (hasPrevious()) {
                        this.WN = true;
                        return listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                public int previousIndex() {
                    return nextIndex() - 1;
                }

                public void remove() {
                    g.ai(this.WN);
                    listIterator.remove();
                    this.WN = false;
                }

                public void set(T t) {
                    i.checkState(this.WN);
                    listIterator.set(t);
                }
            };
        }
    }

    private static class a<T> extends b<T> implements RandomAccess {
        a(List<T> list) {
            super(list);
        }
    }

    private Lists() {
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList();
    }

    public static <E> ArrayList<E> t(Iterable<? extends E> iterable) {
        i.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList(h.a(iterable));
        }
        return p(iterable.iterator());
    }

    public static <E> ArrayList<E> p(Iterator<? extends E> it) {
        Collection newArrayList = newArrayList();
        t.a(newArrayList, (Iterator) it);
        return newArrayList;
    }

    static int bZ(int i) {
        g.b(i, "arraySize");
        return c.G((((long) i) + 5) + ((long) (i / 10)));
    }

    public static <E> ArrayList<E> ca(int i) {
        g.b(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static <E> ArrayList<E> cb(int i) {
        return new ArrayList(bZ(i));
    }

    public static <E> List<E> a(E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    public static <F, T> List<T> a(List<F> list, d<? super F, ? extends T> dVar) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, dVar) : new TransformingSequentialList(list, dVar);
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).sS();
        }
        if (list instanceof b) {
            return ((b) list).tF();
        }
        if (list instanceof RandomAccess) {
            return new a(list);
        }
        return new b(list);
    }

    static boolean a(List<?> list, Object obj) {
        if (obj == i.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return t.a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!f.equal(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    static int b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (f.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int c(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(list.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (f.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (obj.equals(list.get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }
}
