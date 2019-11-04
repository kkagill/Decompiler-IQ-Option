package com.google.common.collect;

import com.google.common.base.i;
import java.io.Serializable;
import java.util.Iterator;

final class ReverseNaturalOrdering extends Ordering<Comparable> implements Serializable {
    static final ReverseNaturalOrdering XI = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        i.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public <S extends Comparable> Ordering<S> reverse() {
        return Ordering.natural();
    }

    /* renamed from: a */
    public <E extends Comparable> E min(E e, E e2) {
        return (Comparable) NaturalOrdering.Xu.max(e, e2);
    }

    /* renamed from: a */
    public <E extends Comparable> E min(E e, E e2, E e3, E... eArr) {
        return (Comparable) NaturalOrdering.Xu.max(e, e2, e3, eArr);
    }

    /* renamed from: s */
    public <E extends Comparable> E min(Iterator<E> it) {
        return (Comparable) NaturalOrdering.Xu.max((Iterator) it);
    }

    /* renamed from: v */
    public <E extends Comparable> E min(Iterable<E> iterable) {
        return (Comparable) NaturalOrdering.Xu.max((Iterable) iterable);
    }

    /* renamed from: b */
    public <E extends Comparable> E max(E e, E e2) {
        return (Comparable) NaturalOrdering.Xu.min(e, e2);
    }

    /* renamed from: b */
    public <E extends Comparable> E max(E e, E e2, E e3, E... eArr) {
        return (Comparable) NaturalOrdering.Xu.min(e, e2, e3, eArr);
    }

    /* renamed from: t */
    public <E extends Comparable> E max(Iterator<E> it) {
        return (Comparable) NaturalOrdering.Xu.min((Iterator) it);
    }

    /* renamed from: w */
    public <E extends Comparable> E max(Iterable<E> iterable) {
        return (Comparable) NaturalOrdering.Xu.min((Iterable) iterable);
    }

    private Object readResolve() {
        return XI;
    }

    private ReverseNaturalOrdering() {
    }
}
