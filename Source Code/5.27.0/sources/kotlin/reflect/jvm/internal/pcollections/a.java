package kotlin.reflect.jvm.internal.pcollections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ConsPStack */
final class a<E> implements Iterable<E> {
    private static final a<Object> fAk = new a();
    final a<E> fAl;
    final E first;
    private final int size;

    /* compiled from: ConsPStack */
    private static class a<E> implements Iterator<E> {
        private a<E> fAm;

        public a(a<E> aVar) {
            this.fAm = aVar;
        }

        public boolean hasNext() {
            return this.fAm.size > 0;
        }

        public E next() {
            Object obj = this.fAm.first;
            this.fAm = this.fAm.fAl;
            return obj;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> a<E> bQh() {
        return fAk;
    }

    private a() {
        this.size = 0;
        this.first = null;
        this.fAl = null;
    }

    private a(E e, a<E> aVar) {
        this.first = e;
        this.fAl = aVar;
        this.size = aVar.size + 1;
    }

    public E get(int i) {
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException();
        }
        try {
            i = mD(i).next();
            return i;
        } catch (NoSuchElementException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index: ");
            stringBuilder.append(i);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public Iterator<E> iterator() {
        return mD(0);
    }

    public int size() {
        return this.size;
    }

    private Iterator<E> mD(int i) {
        return new a(mF(i));
    }

    public a<E> ec(E e) {
        return new a(e, this);
    }

    private a<E> ed(Object obj) {
        if (this.size == 0) {
            return this;
        }
        if (this.first.equals(obj)) {
            return this.fAl;
        }
        a ed = this.fAl.ed(obj);
        if (ed == this.fAl) {
            return this;
        }
        return new a(this.first, ed);
    }

    public a<E> mE(int i) {
        return ed(get(i));
    }

    private a<E> mF(int i) {
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.fAl.mF(i - 1);
        }
    }
}
