package com.google.common.util.concurrent;

import com.google.common.base.i;
import com.google.common.base.o;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MoreExecutors */
public final class x {

    /* compiled from: MoreExecutors */
    private static class a extends c {
        private final ExecutorService aaK;

        a(ExecutorService executorService) {
            this.aaK = (ExecutorService) i.checkNotNull(executorService);
        }

        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.aaK.awaitTermination(j, timeUnit);
        }

        public final boolean isShutdown() {
            return this.aaK.isShutdown();
        }

        public final boolean isTerminated() {
            return this.aaK.isTerminated();
        }

        public final void shutdown() {
            this.aaK.shutdown();
        }

        public final List<Runnable> shutdownNow() {
            return this.aaK.shutdownNow();
        }

        public final void execute(Runnable runnable) {
            this.aaK.execute(runnable);
        }
    }

    /* compiled from: MoreExecutors */
    private static final class b extends a implements w {
        final ScheduledExecutorService aaL;

        /* compiled from: MoreExecutors */
        private static final class b extends i<Void> implements Runnable {
            private final Runnable aaN;

            public b(Runnable runnable) {
                this.aaN = (Runnable) i.checkNotNull(runnable);
            }

            public void run() {
                try {
                    this.aaN.run();
                } catch (Throwable th) {
                    setException(th);
                    RuntimeException h = o.h(th);
                }
            }
        }

        /* compiled from: MoreExecutors */
        private static final class a<V> extends com.google.common.util.concurrent.n.a<V> implements u<V> {
            private final ScheduledFuture<?> aaM;

            public a(t<V> tVar, ScheduledFuture<?> scheduledFuture) {
                super(tVar);
                this.aaM = scheduledFuture;
            }

            public boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.aaM.cancel(z);
                }
                return cancel;
            }

            public long getDelay(TimeUnit timeUnit) {
                return this.aaM.getDelay(timeUnit);
            }

            /* renamed from: a */
            public int compareTo(Delayed delayed) {
                return this.aaM.compareTo(delayed);
            }
        }

        b(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.aaL = (ScheduledExecutorService) i.checkNotNull(scheduledExecutorService);
        }

        /* renamed from: a */
        public u<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask b = TrustedListenableFutureTask.b(runnable, null);
            return new a(b, this.aaL.schedule(b, j, timeUnit));
        }

        /* renamed from: a */
        public <V> u<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask d = TrustedListenableFutureTask.d(callable);
            return new a(d, this.aaL.schedule(d, j, timeUnit));
        }

        /* renamed from: a */
        public u<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.aaL.scheduleAtFixedRate(bVar, j, j2, timeUnit));
        }

        /* renamed from: b */
        public u<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.aaL.scheduleWithFixedDelay(bVar, j, j2, timeUnit));
        }
    }

    public static Executor vG() {
        return DirectExecutor.INSTANCE;
    }

    public static w a(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof w ? (w) scheduledExecutorService : new b(scheduledExecutorService);
    }

    static Executor a(final Executor executor, final b<?> bVar) {
        i.checkNotNull(executor);
        i.checkNotNull(bVar);
        if (executor == vG()) {
            return executor;
        }
        return new Executor() {
            boolean aaF = true;

            public void execute(final Runnable runnable) {
                try {
                    executor.execute(new Runnable() {
                        public void run() {
                            AnonymousClass1.this.aaF = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    if (this.aaF) {
                        bVar.setException(e);
                    }
                }
            }
        };
    }
}
