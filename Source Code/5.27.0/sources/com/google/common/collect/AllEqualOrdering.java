package com.google.common.collect;

import java.io.Serializable;
import java.util.List;

final class AllEqualOrdering extends Ordering<Object> implements Serializable {
    static final AllEqualOrdering Vr = new AllEqualOrdering();
    private static final long serialVersionUID = 0;

    public int compare(Object obj, Object obj2) {
        return 0;
    }

    public <S> Ordering<S> reverse() {
        return this;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }

    AllEqualOrdering() {
    }

    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return Lists.t(iterable);
    }

    public <E> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.f((Iterable) iterable);
    }

    private Object readResolve() {
        return Vr;
    }
}
