package com.google.common.util.concurrent;

import com.google.common.base.d;
import com.google.common.base.e;
import com.google.common.base.i;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Futures */
public final class p extends r {

    /* compiled from: Futures */
    /* renamed from: com.google.common.util.concurrent.p$1 */
    static class AnonymousClass1 implements Runnable {
        final /* synthetic */ Future aax;

        public void run() {
            this.aax.cancel(false);
        }
    }

    /* compiled from: Futures */
    private static final class a<V> implements Runnable {
        final o<? super V> aay;
        final Future<V> future;

        a(Future<V> future, o<? super V> oVar) {
            this.future = future;
            this.aay = oVar;
        }

        public void run() {
            try {
                this.aay.onSuccess(p.a(this.future));
            } catch (ExecutionException e) {
                this.aay.l(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.aay.l(e2);
            }
        }

        public String toString() {
            return e.aj(this).ak(this.aay).toString();
        }
    }

    /* compiled from: Futures */
    public static final class b<V> {
        private final boolean aah;
        private final ImmutableList<t<? extends V>> aaz;

        /* synthetic */ b(boolean z, ImmutableList immutableList, AnonymousClass1 anonymousClass1) {
            this(z, immutableList);
        }

        private b(boolean z, ImmutableList<t<? extends V>> immutableList) {
            this.aah = z;
            this.aaz = immutableList;
        }

        public <C> t<C> a(g<C> gVar, Executor executor) {
            return new CombinedFuture(this.aaz, this.aah, executor, gVar);
        }
    }

    public static <V> t<V> bo(V v) {
        if (v == null) {
            return d.aaB;
        }
        return new d(v);
    }

    public static <V> t<V> m(Throwable th) {
        i.checkNotNull(th);
        return new c(th);
    }

    public static <V> t<V> vF() {
        return new a();
    }

    @Deprecated
    public static <V, X extends Exception> j<V, X> b(X x) {
        i.checkNotNull(x);
        return new b(x);
    }

    public static <V, X extends Throwable> t<V> b(t<? extends V> tVar, Class<X> cls, d<? super X, ? extends V> dVar, Executor executor) {
        return a.a(tVar, cls, dVar, executor);
    }

    public static <V> t<V> a(t<V> tVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (tVar.isDone()) {
            return tVar;
        }
        return TimeoutFuture.b(tVar, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> t<O> b(t<I> tVar, h<? super I, ? extends O> hVar, Executor executor) {
        return d.a((t) tVar, (h) hVar, executor);
    }

    public static <I, O> t<O> b(t<I> tVar, d<? super I, ? extends O> dVar, Executor executor) {
        return d.a((t) tVar, (d) dVar, executor);
    }

    @SafeVarargs
    public static <V> t<List<V>> a(t<? extends V>... tVarArr) {
        return new b(ImmutableList.f((Object[]) tVarArr), true);
    }

    public static <V> t<List<V>> B(Iterable<? extends t<? extends V>> iterable) {
        return new b(ImmutableList.f((Iterable) iterable), true);
    }

    @SafeVarargs
    public static <V> b<V> b(t<? extends V>... tVarArr) {
        return new b(false, ImmutableList.f((Object[]) tVarArr), null);
    }

    public static <V> void a(t<V> tVar, o<? super V> oVar, Executor executor) {
        i.checkNotNull(oVar);
        tVar.addListener(new a(tVar, oVar), executor);
    }

    public static <V> V a(Future<V> future) {
        i.b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return ac.getUninterruptibly(future);
    }
}
