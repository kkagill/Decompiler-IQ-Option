package com.google.common.collect;

import com.google.common.base.i;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] VX = new Object[0];

    public static abstract class b<E> {
        public abstract b<E> aI(E e);

        static int v(int i, int i2) {
            if (i2 >= 0) {
                i = (i + (i >> 1)) + 1;
                if (i < i2) {
                    i = Integer.highestOneBit(i2 - 1) << 1;
                }
                return i < 0 ? Integer.MAX_VALUE : i;
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }

        b() {
        }

        public b<E> e(E... eArr) {
            for (Object aI : eArr) {
                aI(aI);
            }
            return this;
        }

        public b<E> e(Iterable<? extends E> iterable) {
            for (Object aI : iterable) {
                aI(aI);
            }
            return this;
        }

        public b<E> b(Iterator<? extends E> it) {
            while (it.hasNext()) {
                aI(it.next());
            }
            return this;
        }
    }

    static abstract class a<E> extends b<E> {
        Object[] VY;
        boolean VZ;
        int size = 0;

        a(int i) {
            g.b(i, "initialCapacity");
            this.VY = new Object[i];
        }

        private void bS(int i) {
            Object[] objArr = this.VY;
            if (objArr.length < i) {
                this.VY = Arrays.copyOf(objArr, b.v(objArr.length, i));
                this.VZ = false;
            } else if (this.VZ) {
                this.VY = (Object[]) objArr.clone();
                this.VZ = false;
            }
        }

        /* renamed from: aH */
        public a<E> aI(E e) {
            i.checkNotNull(e);
            bS(this.size + 1);
            Object[] objArr = this.VY;
            int i = this.size;
            this.size = i + 1;
            objArr[i] = e;
            return this;
        }

        public b<E> e(E... eArr) {
            y.m(eArr);
            bS(this.size + eArr.length);
            System.arraycopy(eArr, 0, this.VY, this.size, eArr.length);
            this.size += eArr.length;
            return this;
        }

        public b<E> e(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                bS(this.size + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.size = ((ImmutableCollection) collection).a(this.VY, this.size);
                    return this;
                }
            }
            super.e((Iterable) iterable);
            return this;
        }
    }

    public abstract boolean contains(Object obj);

    /* renamed from: sK */
    public abstract aj<E> iterator();

    /* Access modifiers changed, original: 0000 */
    public Object[] sL() {
        return null;
    }

    public abstract boolean sP();

    ImmutableCollection() {
    }

    public final Object[] toArray() {
        return toArray(VX);
    }

    public final <T> T[] toArray(T[] tArr) {
        Object[] tArr2;
        i.checkNotNull(tArr2);
        int size = size();
        if (tArr2.length < size) {
            Object[] sL = sL();
            if (sL != null) {
                return aa.b(sL, sM(), sN(), tArr2);
            }
            tArr2 = y.c(tArr2, size);
        } else if (tArr2.length > size) {
            tArr2[size] = null;
        }
        a(tArr2, 0);
        return tArr2;
    }

    /* Access modifiers changed, original: 0000 */
    public int sM() {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public int sN() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> sO() {
        return isEmpty() ? ImmutableList.sQ() : ImmutableList.h(toArray());
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        aj sK = iterator();
        while (sK.hasNext()) {
            int i2 = i + 1;
            objArr[i] = sK.next();
            i = i2;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
