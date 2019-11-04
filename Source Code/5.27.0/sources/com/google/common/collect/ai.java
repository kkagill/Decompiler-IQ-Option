package com.google.common.collect;

import java.util.ListIterator;

/* compiled from: TransformedListIterator */
abstract class ai<F, T> extends ah<F, T> implements ListIterator<T> {
    ai(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> uD() {
        return t.o(this.XS);
    }

    public final boolean hasPrevious() {
        return uD().hasPrevious();
    }

    public final T previous() {
        return aW(uD().previous());
    }

    public final int nextIndex() {
        return uD().nextIndex();
    }

    public final int previousIndex() {
        return uD().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}
