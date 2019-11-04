package com.google.common.collect;

import com.google.common.base.i;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: SortedIterables */
final class af {
    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Object a;
        i.checkNotNull(comparator);
        i.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            a = a((SortedSet) iterable);
        } else if (!(iterable instanceof ae)) {
            return false;
        } else {
            a = ((ae) iterable).comparator();
        }
        return comparator.equals(a);
    }

    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.natural() : comparator;
    }
}
