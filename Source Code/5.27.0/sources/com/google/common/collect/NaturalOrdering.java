package com.google.common.collect;

import com.google.common.base.i;
import java.io.Serializable;

final class NaturalOrdering extends Ordering<Comparable> implements Serializable {
    static final NaturalOrdering Xu = new NaturalOrdering();
    private static final long serialVersionUID = 0;
    private transient Ordering<Comparable> Xv;
    private transient Ordering<Comparable> Xw;

    public String toString() {
        return "Ordering.natural()";
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        i.checkNotNull(comparable);
        i.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public <S extends Comparable> Ordering<S> nullsFirst() {
        Ordering<S> ordering = this.Xv;
        if (ordering != null) {
            return ordering;
        }
        Ordering nullsFirst = super.nullsFirst();
        this.Xv = nullsFirst;
        return nullsFirst;
    }

    public <S extends Comparable> Ordering<S> nullsLast() {
        Ordering<S> ordering = this.Xw;
        if (ordering != null) {
            return ordering;
        }
        Ordering nullsLast = super.nullsLast();
        this.Xw = nullsLast;
        return nullsLast;
    }

    public <S extends Comparable> Ordering<S> reverse() {
        return ReverseNaturalOrdering.XI;
    }

    private Object readResolve() {
        return Xu;
    }

    private NaturalOrdering() {
    }
}
