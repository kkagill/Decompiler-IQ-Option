package com.google.common.util.concurrent;

import com.google.common.base.i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ImmediateFuture */
abstract class s<V> implements t<V> {
    private static final Logger log = Logger.getLogger(s.class.getName());

    /* compiled from: ImmediateFuture */
    static class b<V, X extends Exception> extends s<V> implements j<V, X> {
        private final X aaA;

        b(X x) {
            this.aaA = x;
        }

        public V get() {
            throw new ExecutionException(this.aaA);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("[status=FAILURE, cause=[");
            stringBuilder.append(this.aaA);
            stringBuilder.append("]]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: ImmediateFuture */
    static class d<V> extends s<V> {
        static final d<Object> aaB = new d(null);
        private final V value;

        d(V v) {
            this.value = v;
        }

        public V get() {
            return this.value;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("[status=SUCCESS, result=[");
            stringBuilder.append(this.value);
            stringBuilder.append("]]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: ImmediateFuture */
    static final class a<V> extends i<V> {
        a() {
            cancel(false);
        }
    }

    /* compiled from: ImmediateFuture */
    static final class c<V> extends i<V> {
        c(Throwable th) {
            setException(th);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get();

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    s() {
    }

    public void addListener(Runnable runnable, Executor executor) {
        i.checkNotNull(runnable, "Runnable was null.");
        i.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            logger.log(level, stringBuilder.toString(), e);
        }
    }

    public V get(long j, TimeUnit timeUnit) {
        i.checkNotNull(timeUnit);
        return get();
    }
}
