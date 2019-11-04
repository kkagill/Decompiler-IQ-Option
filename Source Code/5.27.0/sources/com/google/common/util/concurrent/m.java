package com.google.common.util.concurrent;

import com.google.common.collect.o;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingFuture */
public abstract class m<V> extends o implements Future<V> {
    /* renamed from: vD */
    public abstract Future<? extends V> qK();

    protected m() {
    }

    public boolean cancel(boolean z) {
        return qK().cancel(z);
    }

    public boolean isCancelled() {
        return qK().isCancelled();
    }

    public boolean isDone() {
        return qK().isDone();
    }

    public V get() {
        return qK().get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return qK().get(j, timeUnit);
    }
}
