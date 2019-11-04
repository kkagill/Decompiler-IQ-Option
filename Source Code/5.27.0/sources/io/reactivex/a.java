package io.reactivex;

import io.reactivex.b.l;
import io.reactivex.internal.a.b;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableDelay;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.c;
import io.reactivex.internal.operators.completable.d;
import io.reactivex.internal.operators.completable.f;
import io.reactivex.internal.operators.completable.g;
import io.reactivex.internal.operators.completable.h;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.completable.j;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: Completable */
public abstract class a implements c {
    public abstract void b(b bVar);

    public static a bkL() {
        return io.reactivex.c.a.b(io.reactivex.internal.operators.completable.a.eQM);
    }

    public static a b(io.reactivex.b.a aVar) {
        b.requireNonNull(aVar, "run is null");
        return io.reactivex.c.a.b(new io.reactivex.internal.operators.completable.b(aVar));
    }

    public static a b(Future<?> future) {
        b.requireNonNull(future, "future is null");
        return b(io.reactivex.internal.a.a.e(future));
    }

    public static a l(Runnable runnable) {
        b.requireNonNull(runnable, "run is null");
        return io.reactivex.c.a.b(new d(runnable));
    }

    public static <T> a a(org.a.b<T> bVar) {
        b.requireNonNull(bVar, "publisher is null");
        return io.reactivex.c.a.b(new c(bVar));
    }

    public static a a(c... cVarArr) {
        b.requireNonNull(cVarArr, "sources is null");
        if (cVarArr.length == 0) {
            return bkL();
        }
        if (cVarArr.length == 1) {
            return a(cVarArr[0]);
        }
        return io.reactivex.c.a.b(new CompletableMergeArray(cVarArr));
    }

    private static NullPointerException Z(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public static a a(c cVar) {
        b.requireNonNull(cVar, "source is null");
        if (cVar instanceof a) {
            return io.reactivex.c.a.b((a) cVar);
        }
        return io.reactivex.c.a.b(new f(cVar));
    }

    public final <T> p<T> a(t<T> tVar) {
        b.requireNonNull(tVar, "next is null");
        return io.reactivex.c.a.f(new SingleDelayWithCompletable(tVar, this));
    }

    public final a b(c cVar) {
        b.requireNonNull(cVar, "next is null");
        return io.reactivex.c.a.b(new CompletableAndThenCompletable(this, cVar));
    }

    public final a e(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, io.reactivex.d.a.bmM(), false);
    }

    public final a a(long j, TimeUnit timeUnit, o oVar, boolean z) {
        b.requireNonNull(timeUnit, "unit is null");
        b.requireNonNull(oVar, "scheduler is null");
        return io.reactivex.c.a.b(new CompletableDelay(this, j, timeUnit, oVar, z));
    }

    public final a c(io.reactivex.b.a aVar) {
        return a(io.reactivex.internal.a.a.bls(), io.reactivex.internal.a.a.bls(), aVar, io.reactivex.internal.a.a.aMp, io.reactivex.internal.a.a.aMp, io.reactivex.internal.a.a.aMp);
    }

    public final a a(io.reactivex.b.f<? super Throwable> fVar) {
        return a(io.reactivex.internal.a.a.bls(), fVar, io.reactivex.internal.a.a.aMp, io.reactivex.internal.a.a.aMp, io.reactivex.internal.a.a.aMp, io.reactivex.internal.a.a.aMp);
    }

    private a a(io.reactivex.b.f<? super io.reactivex.disposables.b> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar, io.reactivex.b.a aVar2, io.reactivex.b.a aVar3, io.reactivex.b.a aVar4) {
        b.requireNonNull(fVar, "onSubscribe is null");
        b.requireNonNull(fVar2, "onError is null");
        b.requireNonNull(aVar, "onComplete is null");
        b.requireNonNull(aVar2, "onTerminate is null");
        b.requireNonNull(aVar3, "onAfterTerminate is null");
        b.requireNonNull(aVar4, "onDispose is null");
        return io.reactivex.c.a.b(new h(this, fVar, fVar2, aVar, aVar2, aVar3, aVar4));
    }

    public final a c(c cVar) {
        b.requireNonNull(cVar, "other is null");
        return a(this, cVar);
    }

    public final a a(o oVar) {
        b.requireNonNull(oVar, "scheduler is null");
        return io.reactivex.c.a.b(new CompletableObserveOn(this, oVar));
    }

    public final a bkM() {
        return a(io.reactivex.internal.a.a.blt());
    }

    public final a a(l<? super Throwable> lVar) {
        b.requireNonNull(lVar, "predicate is null");
        return io.reactivex.c.a.b(new g(this, lVar));
    }

    public final a a(io.reactivex.b.g<? super e<Throwable>, ? extends org.a.b<?>> gVar) {
        return a(bkO().j(gVar));
    }

    public final io.reactivex.disposables.b bkN() {
        b emptyCompletableObserver = new EmptyCompletableObserver();
        a(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    public final void a(b bVar) {
        NullPointerException e;
        b.requireNonNull(bVar, "observer is null");
        try {
            bVar = io.reactivex.c.a.a(this, bVar);
            b.requireNonNull(bVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(bVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            io.reactivex.c.a.onError(th);
            e2 = Z(th);
        }
    }

    public final io.reactivex.disposables.b a(io.reactivex.b.a aVar, io.reactivex.b.f<? super Throwable> fVar) {
        b.requireNonNull(fVar, "onError is null");
        b.requireNonNull(aVar, "onComplete is null");
        b callbackCompletableObserver = new CallbackCompletableObserver(fVar, aVar);
        a(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final io.reactivex.disposables.b d(io.reactivex.b.a aVar) {
        b.requireNonNull(aVar, "onComplete is null");
        b callbackCompletableObserver = new CallbackCompletableObserver(aVar);
        a(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final a b(o oVar) {
        b.requireNonNull(oVar, "scheduler is null");
        return io.reactivex.c.a.b(new CompletableSubscribeOn(this, oVar));
    }

    public final <T> e<T> bkO() {
        if (this instanceof io.reactivex.internal.b.b) {
            return ((io.reactivex.internal.b.b) this).blv();
        }
        return io.reactivex.c.a.k(new i(this));
    }

    public final <T> p<T> cC(T t) {
        b.requireNonNull(t, "completionValue is null");
        return io.reactivex.c.a.f(new j(this, null, t));
    }
}
