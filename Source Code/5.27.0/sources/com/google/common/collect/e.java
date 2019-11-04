package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: AbstractSequentialIterator */
public abstract class e<T> extends aj<T> {
    private T Vq;

    public abstract T ax(T t);

    protected e(T t) {
        this.Vq = t;
    }

    public final boolean hasNext() {
        return this.Vq != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                T t = this.Vq;
                return t;
            } finally {
                this.Vq = ax(this.Vq);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
