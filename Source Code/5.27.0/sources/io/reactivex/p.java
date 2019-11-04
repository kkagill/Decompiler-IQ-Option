package io.reactivex;

import io.reactivex.b.c;
import io.reactivex.b.f;
import io.reactivex.c.a;
import io.reactivex.internal.a.b;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.flowable.v;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.operators.single.d;
import io.reactivex.internal.operators.single.e;
import io.reactivex.internal.operators.single.g;
import io.reactivex.internal.operators.single.h;
import io.reactivex.internal.operators.single.i;
import io.reactivex.internal.operators.single.j;
import io.reactivex.internal.operators.single.k;
import io.reactivex.internal.operators.single.l;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: Single */
public abstract class p<T> implements t<T> {
    public abstract void b(r<? super T> rVar);

    public static <T> p<T> a(s<T> sVar) {
        b.requireNonNull(sVar, "source is null");
        return a.f(new SingleCreate(sVar));
    }

    public static <T> p<T> h(Callable<? extends t<? extends T>> callable) {
        b.requireNonNull(callable, "singleSupplier is null");
        return a.f(new io.reactivex.internal.operators.single.a(callable));
    }

    public static <T> p<T> i(Callable<? extends Throwable> callable) {
        b.requireNonNull(callable, "errorSupplier is null");
        return a.f(new g(callable));
    }

    public static <T> p<T> ab(Throwable th) {
        b.requireNonNull(th, "exception is null");
        return i(io.reactivex.internal.a.a.cL(th));
    }

    public static <T> p<T> j(Callable<? extends T> callable) {
        b.requireNonNull(callable, "callable is null");
        return a.f(new h(callable));
    }

    public static <T> p<T> d(Future<? extends T> future) {
        return i(e.c((Future) future));
    }

    public static <T> p<T> cI(T t) {
        b.requireNonNull(t, "item is null");
        return a.f(new i(t));
    }

    public static <T, R> p<R> b(Iterable<? extends t<? extends T>> iterable, io.reactivex.b.g<? super Object[], ? extends R> gVar) {
        b.requireNonNull(gVar, "zipper is null");
        b.requireNonNull(iterable, "sources is null");
        return a.f(new l(iterable, gVar));
    }

    public static <T1, T2, R> p<R> a(t<? extends T1> tVar, t<? extends T2> tVar2, c<? super T1, ? super T2, ? extends R> cVar) {
        b.requireNonNull(tVar, "source1 is null");
        b.requireNonNull(tVar2, "source2 is null");
        return a(io.reactivex.internal.a.a.b(cVar), tVar, tVar2);
    }

    public static <T1, T2, T3, R> p<R> a(t<? extends T1> tVar, t<? extends T2> tVar2, t<? extends T3> tVar3, io.reactivex.b.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        b.requireNonNull(tVar, "source1 is null");
        b.requireNonNull(tVar2, "source2 is null");
        b.requireNonNull(tVar3, "source3 is null");
        return a(io.reactivex.internal.a.a.a((io.reactivex.b.h) hVar), tVar, tVar2, tVar3);
    }

    public static <T1, T2, T3, T4, R> p<R> a(t<? extends T1> tVar, t<? extends T2> tVar2, t<? extends T3> tVar3, t<? extends T4> tVar4, io.reactivex.b.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        b.requireNonNull(tVar, "source1 is null");
        b.requireNonNull(tVar2, "source2 is null");
        b.requireNonNull(tVar3, "source3 is null");
        b.requireNonNull(tVar4, "source4 is null");
        return a(io.reactivex.internal.a.a.a((io.reactivex.b.i) iVar), tVar, tVar2, tVar3, tVar4);
    }

    public static <T, R> p<R> a(io.reactivex.b.g<? super Object[], ? extends R> gVar, t<? extends T>... tVarArr) {
        b.requireNonNull(gVar, "zipper is null");
        b.requireNonNull(tVarArr, "sources is null");
        if (tVarArr.length == 0) {
            return ab(new NoSuchElementException());
        }
        return a.f(new SingleZipArray(tVarArr, gVar));
    }

    public final p<T> bll() {
        return a.f(new SingleCache(this));
    }

    public final p<T> f(f<? super T> fVar) {
        b.requireNonNull(fVar, "onAfterSuccess is null");
        return a.f(new io.reactivex.internal.operators.single.b(this, fVar));
    }

    public final p<T> g(f<? super io.reactivex.disposables.b> fVar) {
        b.requireNonNull(fVar, "onSubscribe is null");
        return a.f(new e(this, fVar));
    }

    public final p<T> h(f<? super T> fVar) {
        b.requireNonNull(fVar, "onSuccess is null");
        return a.f(new io.reactivex.internal.operators.single.f(this, fVar));
    }

    public final p<T> a(io.reactivex.b.b<? super T, ? super Throwable> bVar) {
        b.requireNonNull(bVar, "onEvent is null");
        return a.f(new d(this, bVar));
    }

    public final p<T> i(f<? super Throwable> fVar) {
        b.requireNonNull(fVar, "onError is null");
        return a.f(new io.reactivex.internal.operators.single.c(this, fVar));
    }

    public final <R> p<R> q(io.reactivex.b.g<? super T, ? extends t<? extends R>> gVar) {
        b.requireNonNull(gVar, "mapper is null");
        return a.f(new SingleFlatMap(this, gVar));
    }

    public final <R> i<R> r(io.reactivex.b.g<? super T, ? extends k<? extends R>> gVar) {
        b.requireNonNull(gVar, "mapper is null");
        return a.a(new SingleFlatMapMaybe(this, gVar));
    }

    public final <R> e<R> s(io.reactivex.b.g<? super T, ? extends org.a.b<? extends R>> gVar) {
        b.requireNonNull(gVar, "mapper is null");
        return a.k(new SingleFlatMapPublisher(this, gVar));
    }

    public final a o(io.reactivex.b.g<? super T, ? extends c> gVar) {
        b.requireNonNull(gVar, "mapper is null");
        return a.b(new SingleFlatMapCompletable(this, gVar));
    }

    public final T ble() {
        r aVar = new io.reactivex.internal.observers.a();
        a(aVar);
        return aVar.ble();
    }

    public final <R> p<R> t(io.reactivex.b.g<? super T, ? extends R> gVar) {
        b.requireNonNull(gVar, "mapper is null");
        return a.f(new j(this, gVar));
    }

    public final p<T> g(o oVar) {
        b.requireNonNull(oVar, "scheduler is null");
        return a.f(new SingleObserveOn(this, oVar));
    }

    public final p<T> u(io.reactivex.b.g<Throwable, ? extends T> gVar) {
        b.requireNonNull(gVar, "resumeFunction is null");
        return a.f(new k(this, gVar, null));
    }

    public final p<T> cJ(T t) {
        b.requireNonNull(t, "value is null");
        return a.f(new k(this, null, t));
    }

    public final p<T> e(p<? extends T> pVar) {
        b.requireNonNull(pVar, "resumeSingleInCaseOfError is null");
        return v(io.reactivex.internal.a.a.cM(pVar));
    }

    public final p<T> v(io.reactivex.b.g<? super Throwable, ? extends t<? extends T>> gVar) {
        b.requireNonNull(gVar, "resumeFunctionInCaseOfError is null");
        return a.f(new SingleResumeNext(this, gVar));
    }

    public final e<T> i(io.reactivex.b.g<? super e<Object>, ? extends org.a.b<?>> gVar) {
        return bkO().i(gVar);
    }

    public final p<T> w(io.reactivex.b.g<? super e<Throwable>, ? extends org.a.b<?>> gVar) {
        return i(bkO().j(gVar));
    }

    public final io.reactivex.disposables.b e(f<? super T> fVar) {
        return a((f) fVar, io.reactivex.internal.a.a.eQz);
    }

    public final io.reactivex.disposables.b a(f<? super T> fVar, f<? super Throwable> fVar2) {
        b.requireNonNull(fVar, "onSuccess is null");
        b.requireNonNull(fVar2, "onError is null");
        r consumerSingleObserver = new ConsumerSingleObserver(fVar, fVar2);
        a(consumerSingleObserver);
        return consumerSingleObserver;
    }

    public final void a(r<? super T> rVar) {
        b.requireNonNull(rVar, "observer is null");
        r a = a.a(this, (r) rVar);
        b.requireNonNull(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            new NullPointerException("subscribeActual failed").initCause(th);
        }
    }

    public final p<T> h(o oVar) {
        b.requireNonNull(oVar, "scheduler is null");
        return a.f(new SingleSubscribeOn(this, oVar));
    }

    public final p<T> m(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, io.reactivex.d.a.bmM(), null);
    }

    private p<T> a(long j, TimeUnit timeUnit, o oVar, t<? extends T> tVar) {
        b.requireNonNull(timeUnit, "unit is null");
        b.requireNonNull(oVar, "scheduler is null");
        return a.f(new SingleTimeout(this, j, timeUnit, oVar, tVar));
    }

    @Deprecated
    public final a blm() {
        return a.b(new io.reactivex.internal.operators.completable.e(this));
    }

    public final a blf() {
        return a.b(new io.reactivex.internal.operators.completable.e(this));
    }

    public final e<T> bkO() {
        if (this instanceof io.reactivex.internal.b.b) {
            return ((io.reactivex.internal.b.b) this).blv();
        }
        return a.k(new SingleToFlowable(this));
    }

    private static <T> p<T> i(e<T> eVar) {
        return a.f(new v(eVar, null));
    }
}
