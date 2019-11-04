package com.google.common.util.concurrent;

/* compiled from: FutureCallback */
public interface o<V> {
    void l(Throwable th);

    void onSuccess(V v);
}
