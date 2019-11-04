package com.google.common.collect;

import com.google.common.base.f;
import com.google.common.base.i;
import com.iqoption.dto.event.OtnEmissionExecuted;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Multisets {

    static final class d<E> implements Iterator<E> {
        private final x<E> Xp;
        private final Iterator<com.google.common.collect.x.a<E>> Xq;
        private com.google.common.collect.x.a<E> Xr;
        private int Xs;
        private int Xt;
        private boolean canRemove;

        d(x<E> xVar, Iterator<com.google.common.collect.x.a<E>> it) {
            this.Xp = xVar;
            this.Xq = it;
        }

        public boolean hasNext() {
            return this.Xs > 0 || this.Xq.hasNext();
        }

        public E next() {
            if (hasNext()) {
                if (this.Xs == 0) {
                    this.Xr = (com.google.common.collect.x.a) this.Xq.next();
                    int count = this.Xr.getCount();
                    this.Xs = count;
                    this.Xt = count;
                }
                this.Xs--;
                this.canRemove = true;
                return this.Xr.ur();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            g.ai(this.canRemove);
            if (this.Xt == 1) {
                this.Xq.remove();
            } else {
                this.Xp.remove(this.Xr.ur());
            }
            this.Xt--;
            this.canRemove = false;
        }
    }

    static abstract class a<E> implements com.google.common.collect.x.a<E> {
        a() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof com.google.common.collect.x.a)) {
                return false;
            }
            com.google.common.collect.x.a aVar = (com.google.common.collect.x.a) obj;
            if (getCount() == aVar.getCount() && f.equal(ur(), aVar.ur())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            Object ur = ur();
            if (ur == null) {
                i = 0;
            } else {
                i = ur.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(ur());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(valueOf);
            stringBuilder.append(" x ");
            stringBuilder.append(count);
            return stringBuilder.toString();
        }
    }

    static abstract class b<E> extends a<E> {
        public abstract x<E> sj();

        b() {
        }

        public void clear() {
            sj().clear();
        }

        public boolean contains(Object obj) {
            return sj().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return sj().containsAll(collection);
        }

        public boolean isEmpty() {
            return sj().isEmpty();
        }

        public boolean remove(Object obj) {
            return sj().f(obj, Integer.MAX_VALUE) > 0;
        }

        public int size() {
            return sj().entrySet().size();
        }
    }

    static abstract class c<E> extends a<com.google.common.collect.x.a<E>> {
        public abstract x<E> sj();

        c() {
        }

        public boolean contains(Object obj) {
            boolean z = false;
            if (obj instanceof com.google.common.collect.x.a) {
                com.google.common.collect.x.a aVar = (com.google.common.collect.x.a) obj;
                if (aVar.getCount() <= 0) {
                    return false;
                }
                if (sj().count(aVar.ur()) == aVar.getCount()) {
                    z = true;
                }
            }
            return z;
        }

        public boolean remove(Object obj) {
            if (obj instanceof com.google.common.collect.x.a) {
                com.google.common.collect.x.a aVar = (com.google.common.collect.x.a) obj;
                Object ur = aVar.ur();
                int count = aVar.getCount();
                if (count != 0) {
                    return sj().a(ur, count, 0);
                }
            }
            return false;
        }

        public void clear() {
            sj().clear();
        }
    }

    static class ImmutableEntry<E> extends a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            g.b(i, OtnEmissionExecuted.COUNT);
        }

        public final E ur() {
            return this.element;
        }

        public final int getCount() {
            return this.count;
        }
    }

    public static <E> com.google.common.collect.x.a<E> k(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    static boolean a(x<?> xVar, Object obj) {
        if (obj == xVar) {
            return true;
        }
        if (obj instanceof x) {
            x xVar2 = (x) obj;
            if (xVar.size() == xVar2.size() && xVar.entrySet().size() == xVar2.entrySet().size()) {
                for (com.google.common.collect.x.a aVar : xVar2.entrySet()) {
                    if (xVar.count(aVar.ur()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static <E> boolean a(x<E> xVar, Collection<? extends E> collection) {
        i.checkNotNull(xVar);
        i.checkNotNull(collection);
        if (collection instanceof x) {
            return a((x) xVar, u(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return t.a((Collection) xVar, collection.iterator());
    }

    private static <E> boolean a(x<E> xVar, x<? extends E> xVar2) {
        if (xVar2 instanceof AbstractMapBasedMultiset) {
            return a((x) xVar, (AbstractMapBasedMultiset) xVar2);
        }
        if (xVar2.isEmpty()) {
            return false;
        }
        for (com.google.common.collect.x.a aVar : xVar2.entrySet()) {
            xVar.e(aVar.ur(), aVar.getCount());
        }
        return true;
    }

    private static <E> boolean a(x<E> xVar, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.a(xVar);
        return true;
    }

    static boolean b(x<?> xVar, Collection<?> collection) {
        Collection collection2;
        if (collection2 instanceof x) {
            collection2 = ((x) collection2).sh();
        }
        return xVar.sh().removeAll(collection2);
    }

    static boolean c(x<?> xVar, Collection<?> collection) {
        Collection collection2;
        i.checkNotNull(collection2);
        if (collection2 instanceof x) {
            collection2 = ((x) collection2).sh();
        }
        return xVar.sh().retainAll(collection2);
    }

    static <E> int a(x<E> xVar, E e, int i) {
        g.b(i, OtnEmissionExecuted.COUNT);
        int count = xVar.count(e);
        i -= count;
        if (i > 0) {
            xVar.e(e, i);
        } else if (i < 0) {
            xVar.f(e, -i);
        }
        return count;
    }

    static <E> boolean a(x<E> xVar, E e, int i, int i2) {
        g.b(i, "oldCount");
        g.b(i2, "newCount");
        if (xVar.count(e) != i) {
            return false;
        }
        xVar.g(e, i2);
        return true;
    }

    static <E> Iterator<E> b(x<E> xVar) {
        return new d(xVar, xVar.entrySet().iterator());
    }

    static <T> x<T> u(Iterable<T> iterable) {
        return (x) iterable;
    }
}
