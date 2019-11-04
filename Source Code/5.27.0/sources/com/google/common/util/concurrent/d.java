package com.google.common.util.concurrent;

import com.google.common.base.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: AbstractTransformFuture */
abstract class d<I, O, F, T> extends a<O> implements Runnable {
    t<? extends I> ZJ;
    F aae;

    /* compiled from: AbstractTransformFuture */
    private static final class a<I, O> extends d<I, O, h<? super I, ? extends O>, t<? extends O>> {
        a(t<? extends I> tVar, h<? super I, ? extends O> hVar) {
            super(tVar, hVar);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public t<? extends O> u(h<? super I, ? extends O> hVar, I i) {
            Object apply = hVar.apply(i);
            i.a(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) hVar);
            return apply;
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: b */
        public void setResult(t<? extends O> tVar) {
            setFuture(tVar);
        }
    }

    /* compiled from: AbstractTransformFuture */
    private static final class b<I, O> extends d<I, O, com.google.common.base.d<? super I, ? extends O>, O> {
        b(t<? extends I> tVar, com.google.common.base.d<? super I, ? extends O> dVar) {
            super(tVar, dVar);
        }

        /* Access modifiers changed, original: 0000 */
        /* renamed from: a */
        public O u(com.google.common.base.d<? super I, ? extends O> dVar, I i) {
            return dVar.apply(i);
        }

        /* Access modifiers changed, original: 0000 */
        public void setResult(O o) {
            set(o);
        }
    }

    public abstract void setResult(T t);

    public abstract T u(F f, I i);

    static <I, O> t<O> a(t<I> tVar, h<? super I, ? extends O> hVar, Executor executor) {
        i.checkNotNull(executor);
        a aVar = new a(tVar, hVar);
        tVar.addListener(aVar, x.a(executor, aVar));
        return aVar;
    }

    static <I, O> t<O> a(t<I> tVar, com.google.common.base.d<? super I, ? extends O> dVar, Executor executor) {
        i.checkNotNull(dVar);
        b bVar = new b(tVar, dVar);
        tVar.addListener(bVar, x.a(executor, bVar));
        return bVar;
    }

    d(t<? extends I> tVar, F f) {
        this.ZJ = (t) i.checkNotNull(tVar);
        this.aae = i.checkNotNull(f);
    }

    public final void run() {
        Future future = this.ZJ;
        Object obj = this.aae;
        int i = 1;
        int isCancelled = isCancelled() | (future == null ? 1 : 0);
        if (obj != null) {
            i = 0;
        }
        if ((isCancelled | i) == 0) {
            this.ZJ = null;
            if (future.isCancelled()) {
                setFuture(future);
                return;
            }
            try {
                Object u;
                try {
                    u = u(obj, p.a(future));
                    setResult(u);
                } catch (Throwable th) {
                    u = th;
                    setException(u);
                } finally {
                    this.aae = null;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                setException(e.getCause());
            } catch (RuntimeException e2) {
                setException(e2);
            } catch (Error e3) {
                setException(e3);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterDone() {
        maybePropagateCancellationTo(this.ZJ);
        this.ZJ = null;
        this.aae = null;
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        String stringBuilder;
        t tVar = this.ZJ;
        Object obj = this.aae;
        String pendingToString = super.pendingToString();
        if (tVar != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("inputFuture=[");
            stringBuilder2.append(tVar);
            stringBuilder2.append("], ");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        if (obj != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder);
            stringBuilder3.append("function=[");
            stringBuilder3.append(obj);
            stringBuilder3.append("]");
            return stringBuilder3.toString();
        } else if (pendingToString == null) {
            return null;
        } else {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder);
            stringBuilder4.append(pendingToString);
            return stringBuilder4.toString();
        }
    }
}
