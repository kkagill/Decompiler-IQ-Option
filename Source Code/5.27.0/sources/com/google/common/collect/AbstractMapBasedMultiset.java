package com.google.common.collect;

import com.google.common.base.i;
import com.google.common.primitives.c;
import com.iqoption.dto.event.OtnEmissionExecuted;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractMapBasedMultiset<E> extends d<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient z<E> Vj;
    transient long size;

    abstract class a<T> implements Iterator<T> {
        int Vl = AbstractMapBasedMultiset.this.Vj.us();
        int Vm = -1;
        int expectedModCount = AbstractMapBasedMultiset.this.Vj.modCount;

        public abstract T bx(int i);

        a() {
        }

        private void sf() {
            if (AbstractMapBasedMultiset.this.Vj.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            sf();
            return this.Vl >= 0;
        }

        public T next() {
            if (hasNext()) {
                Object bx = bx(this.Vl);
                this.Vm = this.Vl;
                this.Vl = AbstractMapBasedMultiset.this.Vj.cl(this.Vl);
                return bx;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            sf();
            g.ai(this.Vm != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) AbstractMapBasedMultiset.this.Vj.cp(this.Vm);
            this.Vl = AbstractMapBasedMultiset.this.Vj.C(this.Vl, this.Vm);
            this.Vm = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.Vj.modCount;
        }
    }

    public abstract void init(int i);

    AbstractMapBasedMultiset(int i) {
        init(i);
    }

    public final int count(Object obj) {
        return this.Vj.get(obj);
    }

    public final int e(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        boolean z = true;
        i.a(i > 0, "occurrences cannot be negative: %s", i);
        int indexOf = this.Vj.indexOf(e);
        if (indexOf == -1) {
            this.Vj.m(e, i);
            this.size += (long) i;
            return 0;
        }
        int cn = this.Vj.cn(indexOf);
        long j = (long) i;
        long j2 = ((long) cn) + j;
        if (j2 > 2147483647L) {
            z = false;
        }
        i.a(z, "too many occurrences: %s", j2);
        this.Vj.D(indexOf, (int) j2);
        this.size += j;
        return cn;
    }

    public final int f(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        i.a(i > 0, "occurrences cannot be negative: %s", i);
        int indexOf = this.Vj.indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        int cn = this.Vj.cn(indexOf);
        if (cn > i) {
            this.Vj.D(indexOf, cn - i);
        } else {
            this.Vj.cp(indexOf);
            i = cn;
        }
        this.size -= (long) i;
        return cn;
    }

    public final int g(E e, int i) {
        g.b(i, OtnEmissionExecuted.COUNT);
        int aX = i == 0 ? this.Vj.aX(e) : this.Vj.m(e, i);
        this.size += (long) (i - aX);
        return aX;
    }

    public final boolean a(E e, int i, int i2) {
        g.b(i, "oldCount");
        g.b(i2, "newCount");
        int indexOf = this.Vj.indexOf(e);
        if (indexOf == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.Vj.m(e, i2);
                this.size += (long) i2;
            }
            return true;
        } else if (this.Vj.cn(indexOf) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.Vj.cp(indexOf);
                this.size -= (long) i;
            } else {
                this.Vj.D(indexOf, i2);
                this.size += (long) (i2 - i);
            }
            return true;
        }
    }

    public final void clear() {
        this.Vj.clear();
        this.size = 0;
    }

    /* Access modifiers changed, original: final */
    public final Iterator<E> sc() {
        return new a<E>() {
            /* Access modifiers changed, original: 0000 */
            public E bx(int i) {
                return AbstractMapBasedMultiset.this.Vj.cm(i);
            }
        };
    }

    /* Access modifiers changed, original: final */
    public final Iterator<com.google.common.collect.x.a<E>> sd() {
        return new a<com.google.common.collect.x.a<E>>() {
            /* Access modifiers changed, original: 0000 */
            /* renamed from: by */
            public com.google.common.collect.x.a<E> bx(int i) {
                return AbstractMapBasedMultiset.this.Vj.co(i);
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public void a(x<? super E> xVar) {
        i.checkNotNull(xVar);
        int us = this.Vj.us();
        while (us >= 0) {
            xVar.e(this.Vj.cm(us), this.Vj.cn(us));
            us = this.Vj.cl(us);
        }
    }

    /* Access modifiers changed, original: final */
    public final int se() {
        return this.Vj.size();
    }

    public final Iterator<E> iterator() {
        return Multisets.b(this);
    }

    public final int size() {
        return c.G(this.size);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        ac.a((x) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int c = ac.c(objectInputStream);
        init(3);
        ac.a((x) this, objectInputStream, c);
    }
}
