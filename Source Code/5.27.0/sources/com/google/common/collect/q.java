package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: ForwardingSortedSet */
public abstract class q<E> extends p<E> implements SortedSet<E> {
    /* renamed from: sH */
    public abstract SortedSet<E> sv();

    protected q() {
    }

    public Comparator<? super E> comparator() {
        return sv().comparator();
    }

    public E first() {
        return sv().first();
    }

    public SortedSet<E> headSet(E e) {
        return sv().headSet(e);
    }

    public E last() {
        return sv().last();
    }

    public SortedSet<E> subSet(E e, E e2) {
        return sv().subSet(e, e2);
    }

    public SortedSet<E> tailSet(E e) {
        return sv().tailSet(e);
    }
}
