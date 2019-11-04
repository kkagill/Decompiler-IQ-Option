package com.google.common.collect;

import java.util.Comparator;

/* compiled from: SortedIterable */
interface ae<T> extends Iterable<T> {
    Comparator<? super T> comparator();
}
