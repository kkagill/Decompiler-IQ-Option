package com.google.common.collect;

import com.google.common.base.i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final ak<Object> Wa = new b(RegularImmutableList.XA, 0);

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* Access modifiers changed, original: 0000 */
        public Object readResolve() {
            return ImmutableList.f(this.elements);
        }
    }

    private static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> Wc;

        public /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        public /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        ReverseImmutableList(ImmutableList<E> immutableList) {
            this.Wc = immutableList;
        }

        private int bU(int i) {
            return (size() - 1) - i;
        }

        private int bV(int i) {
            return size() - i;
        }

        public ImmutableList<E> sS() {
            return this.Wc;
        }

        public boolean contains(Object obj) {
            return this.Wc.contains(obj);
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.Wc.lastIndexOf(obj);
            return lastIndexOf >= 0 ? bU(lastIndexOf) : -1;
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.Wc.indexOf(obj);
            return indexOf >= 0 ? bU(indexOf) : -1;
        }

        /* renamed from: w */
        public ImmutableList<E> subList(int i, int i2) {
            i.f(i, i2, size());
            return this.Wc.subList(bV(i2), bV(i)).sS();
        }

        public E get(int i) {
            i.s(i, size());
            return this.Wc.get(bU(i));
        }

        public int size() {
            return this.Wc.size();
        }

        /* Access modifiers changed, original: 0000 */
        public boolean sP() {
            return this.Wc.sP();
        }
    }

    class SubList extends ImmutableList<E> {
        final transient int length;
        final transient int offset;

        /* Access modifiers changed, original: 0000 */
        public boolean sP() {
            return true;
        }

        public /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        public /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        public /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        SubList(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        public int size() {
            return this.length;
        }

        /* Access modifiers changed, original: 0000 */
        public Object[] sL() {
            return ImmutableList.this.sL();
        }

        /* Access modifiers changed, original: 0000 */
        public int sM() {
            return ImmutableList.this.sM() + this.offset;
        }

        /* Access modifiers changed, original: 0000 */
        public int sN() {
            return (ImmutableList.this.sM() + this.offset) + this.length;
        }

        public E get(int i) {
            i.s(i, this.length);
            return ImmutableList.this.get(i + this.offset);
        }

        /* renamed from: w */
        public ImmutableList<E> subList(int i, int i2) {
            i.f(i, i2, this.length);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.offset;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    public static final class a<E> extends a<E> {
        public a() {
            this(4);
        }

        a(int i) {
            super(i);
        }

        /* renamed from: aK */
        public a<E> aI(E e) {
            super.aI(e);
            return this;
        }

        /* renamed from: i */
        public a<E> e(E... eArr) {
            super.e((Object[]) eArr);
            return this;
        }

        /* renamed from: g */
        public a<E> e(Iterable<? extends E> iterable) {
            super.e((Iterable) iterable);
            return this;
        }

        /* renamed from: d */
        public a<E> b(Iterator<? extends E> it) {
            super.b(it);
            return this;
        }

        public ImmutableList<E> sU() {
            this.VZ = true;
            return ImmutableList.b(this.VY, this.size);
        }
    }

    static class b<E> extends a<E> {
        private final ImmutableList<E> Wb;

        b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.Wb = immutableList;
        }

        /* Access modifiers changed, original: protected */
        public E get(int i) {
            return this.Wb.get(i);
        }
    }

    public final ImmutableList<E> sO() {
        return this;
    }

    public static <E> ImmutableList<E> sQ() {
        return RegularImmutableList.XA;
    }

    public static <E> ImmutableList<E> aJ(E e) {
        return g(e);
    }

    public static <E> ImmutableList<E> l(E e, E e2) {
        return g(e, e2);
    }

    public static <E> ImmutableList<E> f(Iterable<? extends E> iterable) {
        i.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return m((Collection) iterable);
        }
        return c(iterable.iterator());
    }

    public static <E> ImmutableList<E> m(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return g(collection.toArray());
        }
        ImmutableList<E> sO = ((ImmutableCollection) collection).sO();
        if (sO.sP()) {
            sO = h(sO.toArray());
        }
        return sO;
    }

    public static <E> ImmutableList<E> c(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return sQ();
        }
        Object next = it.next();
        if (it.hasNext()) {
            return new a().aI(next).b(it).sU();
        }
        return aJ(next);
    }

    public static <E> ImmutableList<E> f(E[] eArr) {
        if (eArr.length == 0) {
            return sQ();
        }
        return g((Object[]) eArr.clone());
    }

    public static <E> ImmutableList<E> a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        i.checkNotNull(comparator);
        Object[] p = s.p(iterable);
        y.m(p);
        Arrays.sort(p, comparator);
        return h(p);
    }

    private static <E> ImmutableList<E> g(Object... objArr) {
        return h(y.m(objArr));
    }

    static <E> ImmutableList<E> h(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static <E> ImmutableList<E> b(Object[] objArr, int i) {
        if (i == 0) {
            return sQ();
        }
        return new RegularImmutableList(objArr, i);
    }

    ImmutableList() {
    }

    /* renamed from: sK */
    public aj<E> iterator() {
        return listIterator();
    }

    /* renamed from: sR */
    public ak<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: bT */
    public ak<E> listIterator(int i) {
        i.t(i, size());
        if (isEmpty()) {
            return Wa;
        }
        return new b(this, i);
    }

    public int indexOf(Object obj) {
        return obj == null ? -1 : Lists.b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        return obj == null ? -1 : Lists.d(this, obj);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: w */
    public ImmutableList<E> subList(int i, int i2) {
        i.f(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return sQ();
        }
        return x(i, i2);
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableList<E> x(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public ImmutableList<E> sS() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    public boolean equals(Object obj) {
        return Lists.a((List) this, obj);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> a<E> sT() {
        return new a();
    }
}
