package com.google.common.util.concurrent;

import com.google.common.base.i;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

class TrustedListenableFutureTask<V> extends a<V> implements RunnableFuture<V> {
    private volatile InterruptibleTask<?> abb;

    private final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;

        TrustedFutureInterruptibleTask(Callable<V> callable) {
            this.callable = (Callable) i.checkNotNull(callable);
        }

        /* Access modifiers changed, original: final */
        public final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        /* Access modifiers changed, original: 0000 */
        public V vC() {
            return this.callable.call();
        }

        /* Access modifiers changed, original: 0000 */
        public void b(V v, Throwable th) {
            if (th == null) {
                TrustedListenableFutureTask.this.set(v);
            } else {
                TrustedListenableFutureTask.this.setException(th);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public String vB() {
            return this.callable.toString();
        }
    }

    static <V> TrustedListenableFutureTask<V> d(Callable<V> callable) {
        return new TrustedListenableFutureTask(callable);
    }

    static <V> TrustedListenableFutureTask<V> b(Runnable runnable, V v) {
        return new TrustedListenableFutureTask(Executors.callable(runnable, v));
    }

    TrustedListenableFutureTask(Callable<V> callable) {
        this.abb = new TrustedFutureInterruptibleTask(callable);
    }

    public void run() {
        InterruptibleTask interruptibleTask = this.abb;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.abb = null;
    }

    /* Access modifiers changed, original: protected */
    public void afterDone() {
        super.afterDone();
        if (wasInterrupted()) {
            InterruptibleTask interruptibleTask = this.abb;
            if (interruptibleTask != null) {
                interruptibleTask.interruptTask();
            }
        }
        this.abb = null;
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        InterruptibleTask interruptibleTask = this.abb;
        if (interruptibleTask == null) {
            return super.pendingToString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("task=[");
        stringBuilder.append(interruptibleTask);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
