package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* compiled from: Multiset */
public interface x<E> extends Collection<E> {

    /* compiled from: Multiset */
    public interface a<E> {
        int getCount();

        E ur();
    }

    boolean a(E e, int i, int i2);

    boolean add(E e);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    int e(E e, int i);

    Set<a<E>> entrySet();

    int f(Object obj, int i);

    int g(E e, int i);

    boolean remove(Object obj);

    Set<E> sh();

    int size();
}
