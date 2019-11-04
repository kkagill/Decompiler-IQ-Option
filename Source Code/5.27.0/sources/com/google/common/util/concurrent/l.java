package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: FluentFuture */
public abstract class l<V> extends q<V> {

    /* compiled from: FluentFuture */
    static abstract class a<V> extends l<V> implements h<V> {
        a() {
        }

        public final V get() {
            return super.get();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }

        public final boolean isDone() {
            return super.isDone();
        }

        public final boolean isCancelled() {
            return super.isCancelled();
        }

        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    l() {
    }
}
