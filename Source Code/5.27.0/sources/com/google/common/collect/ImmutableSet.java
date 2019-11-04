package com.google.common.collect;

import com.google.common.base.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private transient ImmutableList<E> Wo;

    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* Access modifiers changed, original: 0000 */
        public Object readResolve() {
            return ImmutableSet.j(this.elements);
        }
    }

    public static class a<E> extends a<E> {
        Object[] Wp;
        private int hashCode;

        public a() {
            super(4);
        }

        /* renamed from: aO */
        public a<E> aI(E e) {
            i.checkNotNull(e);
            if (this.Wp == null || ImmutableSet.bW(this.size) > this.Wp.length) {
                this.Wp = null;
                super.aI(e);
                return this;
            }
            aP(e);
            return this;
        }

        /* renamed from: k */
        public a<E> e(E... eArr) {
            if (this.Wp != null) {
                for (Object aO : eArr) {
                    aI(aO);
                }
            } else {
                super.e((Object[]) eArr);
            }
            return this;
        }

        private void aP(E e) {
            int length = this.Wp.length - 1;
            int hashCode = e.hashCode();
            int bR = r.bR(hashCode);
            while (true) {
                bR &= length;
                Object[] objArr = this.Wp;
                Object obj = objArr[bR];
                if (obj == null) {
                    objArr[bR] = e;
                    this.hashCode += hashCode;
                    super.aI(e);
                    return;
                } else if (!obj.equals(e)) {
                    bR++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: k */
        public a<E> e(Iterable<? extends E> iterable) {
            i.checkNotNull(iterable);
            if (this.Wp != null) {
                for (Object aO : iterable) {
                    aI(aO);
                }
            } else {
                super.e((Iterable) iterable);
            }
            return this;
        }

        /* renamed from: f */
        public a<E> b(Iterator<? extends E> it) {
            i.checkNotNull(it);
            while (it.hasNext()) {
                aI(it.next());
            }
            return this;
        }

        public ImmutableSet<E> tq() {
            int i = this.size;
            if (i == 0) {
                return ImmutableSet.tm();
            }
            if (i == 1) {
                return ImmutableSet.aN(this.VY[0]);
            }
            ImmutableSet<E> b;
            if (this.Wp == null || ImmutableSet.bW(this.size) != this.Wp.length) {
                b = ImmutableSet.a(this.size, this.VY);
                this.size = b.size();
            } else {
                Object[] copyOf = ImmutableSet.y(this.size, this.VY.length) ? Arrays.copyOf(this.VY, this.size) : this.VY;
                int i2 = this.hashCode;
                Object[] objArr = this.Wp;
                ImmutableSet<E> regularImmutableSet = new RegularImmutableSet(copyOf, i2, objArr, objArr.length - 1, this.size);
            }
            this.VZ = true;
            this.Wp = null;
            return b;
        }
    }

    private static boolean y(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: sK */
    public abstract aj<E> iterator();

    /* Access modifiers changed, original: 0000 */
    public boolean te() {
        return false;
    }

    public static <E> ImmutableSet<E> tm() {
        return RegularImmutableSet.XE;
    }

    public static <E> ImmutableSet<E> aN(E e) {
        return new SingletonImmutableSet(e);
    }

    public static <E> ImmutableSet<E> o(E e, E e2) {
        return a(2, e, e2);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        i.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return a(objArr.length, objArr);
    }

    private static <E> ImmutableSet<E> a(int i, Object... objArr) {
        if (i == 0) {
            return tm();
        }
        if (i == 1) {
            return aN(objArr[0]);
        }
        int bW = bW(i);
        Object[] objArr2 = new Object[bW];
        int i2 = bW - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object l = y.l(objArr[i5], i5);
            int hashCode = l.hashCode();
            int bR = r.bR(hashCode);
            while (true) {
                int i6 = bR & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    bR = i4 + 1;
                    objArr[i4] = l;
                    objArr2[i6] = l;
                    i3 += hashCode;
                    i4 = bR;
                    break;
                } else if (obj.equals(l)) {
                    break;
                } else {
                    bR++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, null);
        if (i4 == 1) {
            return new SingletonImmutableSet(objArr[0], i3);
        }
        if (bW(i4) < bW / 2) {
            return a(i4, objArr);
        }
        if (y(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    static int bW(int i) {
        i = Math.max(i, 2);
        boolean z = true;
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) i)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (i >= 1073741824) {
                z = false;
            }
            i.checkArgument(z, "collection too large");
            return 1073741824;
        }
    }

    public static <E> ImmutableSet<E> n(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.sP()) {
                return immutableSet;
            }
        }
        Object[] toArray = collection.toArray();
        return a(toArray.length, toArray);
    }

    public static <E> ImmutableSet<E> j(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return n((Collection) iterable);
        }
        return e(iterable.iterator());
    }

    public static <E> ImmutableSet<E> e(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return tm();
        }
        Object next = it.next();
        if (it.hasNext()) {
            return new a().aI(next).b(it).tq();
        }
        return aN(next);
    }

    public static <E> ImmutableSet<E> j(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return tm();
        }
        if (length != 1) {
            return a(eArr.length, (Object[]) eArr.clone());
        }
        return aN(eArr[0]);
    }

    ImmutableSet() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && te() && ((ImmutableSet) obj).te() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.a((Set) this, obj);
    }

    public int hashCode() {
        return Sets.c(this);
    }

    public ImmutableList<E> sO() {
        ImmutableList<E> immutableList = this.Wo;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList tn = tn();
        this.Wo = tn;
        return tn;
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableList<E> tn() {
        return ImmutableList.h(toArray());
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> a<E> tp() {
        return new a();
    }
}
