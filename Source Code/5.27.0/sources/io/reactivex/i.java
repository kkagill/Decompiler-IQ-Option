package io.reactivex;

import io.reactivex.b.g;
import io.reactivex.c.a;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.b;
import io.reactivex.internal.operators.maybe.c;
import io.reactivex.internal.operators.maybe.d;
import io.reactivex.internal.operators.maybe.e;
import io.reactivex.internal.operators.maybe.f;
import java.util.concurrent.Callable;

/* compiled from: Maybe */
public abstract class i<T> implements k<T> {
    public abstract void b(j<? super T> jVar);

    public static <T> i<T> bld() {
        return a.a(b.eSf);
    }

    public static <T> i<T> g(Callable<? extends T> callable) {
        io.reactivex.internal.a.b.requireNonNull(callable, "callable is null");
        return a.a(new c(callable));
    }

    public static <T> i<T> cH(T t) {
        io.reactivex.internal.a.b.requireNonNull(t, "item is null");
        return a.a(new e(t));
    }

    public final T ble() {
        io.reactivex.internal.observers.a aVar = new io.reactivex.internal.observers.a();
        a(aVar);
        return aVar.ble();
    }

    public final <R> i<R> m(g<? super T, ? extends k<? extends R>> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        return a.a(new MaybeFlatten(this, gVar));
    }

    public final <R> p<R> n(g<? super T, ? extends t<? extends R>> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        return a.f(new MaybeFlatMapSingle(this, gVar));
    }

    public final a o(g<? super T, ? extends c> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        return a.b(new MaybeFlatMapCompletable(this, gVar));
    }

    public final a blf() {
        return a.b(new d(this));
    }

    public final <R> i<R> p(g<? super T, ? extends R> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        return a.a(new f(this, gVar));
    }

    public final i<T> e(o oVar) {
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.a(new MaybeObserveOn(this, oVar));
    }

    public final e<T> bkO() {
        if (this instanceof io.reactivex.internal.b.b) {
            return ((io.reactivex.internal.b.b) this).blv();
        }
        return a.k(new MaybeToFlowable(this));
    }

    public final p<T> blg() {
        return a.f(new io.reactivex.internal.operators.maybe.g(this, null));
    }

    public final io.reactivex.disposables.b a(io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2) {
        return a(fVar, fVar2, io.reactivex.internal.a.a.aMp);
    }

    public final io.reactivex.disposables.b a(io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar) {
        io.reactivex.internal.a.b.requireNonNull(fVar, "onSuccess is null");
        io.reactivex.internal.a.b.requireNonNull(fVar2, "onError is null");
        io.reactivex.internal.a.b.requireNonNull(aVar, "onComplete is null");
        return (io.reactivex.disposables.b) c(new MaybeCallbackObserver(fVar, fVar2, aVar));
    }

    public final void a(j<? super T> jVar) {
        io.reactivex.internal.a.b.requireNonNull(jVar, "observer is null");
        j a = a.a(this, (j) jVar);
        io.reactivex.internal.a.b.requireNonNull(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            new NullPointerException("subscribeActual failed").initCause(th);
        }
    }

    public final i<T> f(o oVar) {
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.a(new MaybeSubscribeOn(this, oVar));
    }

    public final <E extends j<? super T>> E c(E e) {
        a(e);
        return e;
    }

    public final p<T> b(t<? extends T> tVar) {
        io.reactivex.internal.a.b.requireNonNull(tVar, "other is null");
        return a.f(new MaybeSwitchIfEmptySingle(this, tVar));
    }
}
