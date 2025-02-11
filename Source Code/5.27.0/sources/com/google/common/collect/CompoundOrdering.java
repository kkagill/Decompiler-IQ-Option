package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] comparators;

    CompoundOrdering(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.comparators = new Comparator[]{comparator, comparator2};
    }

    CompoundOrdering(Iterable<? extends Comparator<? super T>> iterable) {
        this.comparators = (Comparator[]) s.a((Iterable) iterable, new Comparator[0]);
    }

    public int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompoundOrdering)) {
            return false;
        }
        return Arrays.equals(this.comparators, ((CompoundOrdering) obj).comparators);
    }

    public int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ordering.compound(");
        stringBuilder.append(Arrays.toString(this.comparators));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
