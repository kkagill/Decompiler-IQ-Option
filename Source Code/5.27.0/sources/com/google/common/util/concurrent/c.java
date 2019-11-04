package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: AbstractListeningExecutorService */
public abstract class c extends AbstractExecutorService implements v {
    /* Access modifiers changed, original: protected|final */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return TrustedListenableFutureTask.b(runnable, t);
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return TrustedListenableFutureTask.d(callable);
    }

    /* renamed from: d */
    public t<?> submit(Runnable runnable) {
        return (t) super.submit(runnable);
    }

    /* renamed from: a */
    public <T> t<T> submit(Runnable runnable, T t) {
        return (t) super.submit(runnable, t);
    }

    /* renamed from: c */
    public <T> t<T> submit(Callable<T> callable) {
        return (t) super.submit(callable);
    }
}
