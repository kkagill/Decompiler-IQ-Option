package io.reactivex.internal.b;

/* compiled from: SimpleQueue */
public interface h<T> {
    void clear();

    boolean isEmpty();

    boolean offer(T t);

    T poll();
}
