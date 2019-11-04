package com.google.common.collect;

import java.util.Iterator;

/* compiled from: ForwardingIterator */
public abstract class l<T> extends o implements Iterator<T> {
    /* renamed from: sx */
    public abstract Iterator<T> qK();

    protected l() {
    }

    public boolean hasNext() {
        return qK().hasNext();
    }

    public T next() {
        return qK().next();
    }

    public void remove() {
        qK().remove();
    }
}
