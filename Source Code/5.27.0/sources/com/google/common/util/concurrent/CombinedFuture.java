package com.google.common.util.concurrent;

import com.google.common.base.i;
import com.google.common.collect.ImmutableCollection;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class CombinedFuture<V> extends e<Object, V> {

    private abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;
        boolean thrownByExecute = true;

        public abstract void setValue(T t);

        public CombinedFutureInterruptibleTask(Executor executor) {
            this.listenerExecutor = (Executor) i.checkNotNull(executor);
        }

        /* Access modifiers changed, original: final */
        public final boolean isDone() {
            return CombinedFuture.this.isDone();
        }

        /* Access modifiers changed, original: final */
        public final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (RejectedExecutionException e) {
                if (this.thrownByExecute) {
                    CombinedFuture.this.setException(e);
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void b(T t, Throwable th) {
            if (th == null) {
                setValue(t);
            } else if (th instanceof ExecutionException) {
                CombinedFuture.this.setException(th.getCause());
            } else if (th instanceof CancellationException) {
                CombinedFuture.this.cancel(false);
            } else {
                CombinedFuture.this.setException(th);
            }
        }
    }

    private final class AsyncCallableInterruptibleTask extends CombinedFutureInterruptibleTask<t<V>> {
        private final g<V> callable;

        public AsyncCallableInterruptibleTask(g<V> gVar, Executor executor) {
            super(executor);
            this.callable = (g) i.checkNotNull(gVar);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: vA */
        public t<V> vC() {
            this.thrownByExecute = false;
            return (t) i.a(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: c */
        public void setValue(t<V> tVar) {
            CombinedFuture.this.setFuture(tVar);
        }

        /* Access modifiers changed, original: 0000 */
        public String vB() {
            return this.callable.toString();
        }
    }

    private final class a extends a {
        private CombinedFutureInterruptibleTask aav;

        /* Access modifiers changed, original: 0000 */
        public void a(boolean z, int i, Object obj) {
        }

        a(ImmutableCollection<? extends t<?>> immutableCollection, boolean z, CombinedFutureInterruptibleTask combinedFutureInterruptibleTask) {
            super(immutableCollection, z, false);
            this.aav = combinedFutureInterruptibleTask;
        }

        /* Access modifiers changed, original: 0000 */
        public void vx() {
            CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.aav;
            if (combinedFutureInterruptibleTask != null) {
                combinedFutureInterruptibleTask.execute();
            } else {
                i.checkState(CombinedFuture.this.isDone());
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void vw() {
            super.vw();
            this.aav = null;
        }

        /* Access modifiers changed, original: 0000 */
        public void interruptTask() {
            CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.aav;
            if (combinedFutureInterruptibleTask != null) {
                combinedFutureInterruptibleTask.interruptTask();
            }
        }
    }

    CombinedFuture(ImmutableCollection<? extends t<?>> immutableCollection, boolean z, Executor executor, g<V> gVar) {
        a(new a(immutableCollection, z, new AsyncCallableInterruptibleTask(gVar, executor)));
    }
}
