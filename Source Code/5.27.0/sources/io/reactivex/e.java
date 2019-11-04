package io.reactivex;

import com.iqoption.dto.event.OtnEmissionExecuted;
import io.reactivex.b.g;
import io.reactivex.b.h;
import io.reactivex.b.i;
import io.reactivex.b.j;
import io.reactivex.b.l;
import io.reactivex.c.a;
import io.reactivex.internal.b.f;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableThrottleLatest;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.internal.operators.flowable.m;
import io.reactivex.internal.operators.flowable.n;
import io.reactivex.internal.operators.flowable.p;
import io.reactivex.internal.operators.flowable.q;
import io.reactivex.internal.operators.flowable.r;
import io.reactivex.internal.operators.flowable.s;
import io.reactivex.internal.operators.flowable.t;
import io.reactivex.internal.operators.flowable.u;
import io.reactivex.internal.operators.flowable.w;
import io.reactivex.internal.operators.flowable.x;
import io.reactivex.internal.operators.flowable.y;
import io.reactivex.internal.operators.flowable.z;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.subscribers.d;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.a.b;
import org.a.c;

/* compiled from: Flowable */
public abstract class e<T> implements b<T> {
    static final int BUFFER_SIZE = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void a(c<? super T> cVar);

    public static int bkP() {
        return BUFFER_SIZE;
    }

    public static <T, R> e<R> a(b<? extends T>[] bVarArr, g<? super Object[], ? extends R> gVar) {
        return a((b[]) bVarArr, (g) gVar, bkP());
    }

    public static <T, R> e<R> a(g<? super Object[], ? extends R> gVar, b<? extends T>... bVarArr) {
        return a((b[]) bVarArr, (g) gVar, bkP());
    }

    public static <T, R> e<R> a(b<? extends T>[] bVarArr, g<? super Object[], ? extends R> gVar, int i) {
        io.reactivex.internal.a.b.requireNonNull(bVarArr, "sources is null");
        if (bVarArr.length == 0) {
            return bkQ();
        }
        io.reactivex.internal.a.b.requireNonNull(gVar, "combiner is null");
        io.reactivex.internal.a.b.i(i, "bufferSize");
        return a.k(new FlowableCombineLatest((b[]) bVarArr, (g) gVar, i, false));
    }

    public static <T, R> e<R> a(Iterable<? extends b<? extends T>> iterable, g<? super Object[], ? extends R> gVar) {
        return a((Iterable) iterable, (g) gVar, bkP());
    }

    public static <T, R> e<R> a(Iterable<? extends b<? extends T>> iterable, g<? super Object[], ? extends R> gVar, int i) {
        io.reactivex.internal.a.b.requireNonNull(iterable, "sources is null");
        io.reactivex.internal.a.b.requireNonNull(gVar, "combiner is null");
        io.reactivex.internal.a.b.i(i, "bufferSize");
        return a.k(new FlowableCombineLatest((Iterable) iterable, (g) gVar, i, false));
    }

    public static <T1, T2, R> e<R> a(b<? extends T1> bVar, b<? extends T2> bVar2, io.reactivex.b.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "source1 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar2, "source2 is null");
        return a(io.reactivex.internal.a.a.b(cVar), bVar, bVar2);
    }

    public static <T1, T2, T3, R> e<R> a(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "source1 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar2, "source2 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar3, "source3 is null");
        return a(io.reactivex.internal.a.a.a((h) hVar), bVar, bVar2, bVar3);
    }

    public static <T1, T2, T3, T4, R> e<R> a(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "source1 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar2, "source2 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar3, "source3 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar4, "source4 is null");
        return a(io.reactivex.internal.a.a.a((i) iVar), bVar, bVar2, bVar3, bVar4);
    }

    public static <T1, T2, T3, T4, T5, R> e<R> a(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "source1 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar2, "source2 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar3, "source3 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar4, "source4 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar5, "source5 is null");
        return a(io.reactivex.internal.a.a.a((j) jVar), bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static <T> e<T> a(b<? extends T> bVar, b<? extends T> bVar2) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "source1 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar2, "source2 is null");
        return a(bVar, bVar2);
    }

    public static <T> e<T> a(b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return bkQ();
        }
        if (bVarArr.length == 1) {
            return b(bVarArr[0]);
        }
        return a.k(new FlowableConcatArray(bVarArr, false));
    }

    public static <T> e<T> a(g<T> gVar, BackpressureStrategy backpressureStrategy) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "source is null");
        io.reactivex.internal.a.b.requireNonNull(backpressureStrategy, "mode is null");
        return a.k(new FlowableCreate(gVar, backpressureStrategy));
    }

    public static <T> e<T> bkQ() {
        return a.k(io.reactivex.internal.operators.flowable.j.eRD);
    }

    public static <T> e<T> e(Callable<? extends Throwable> callable) {
        io.reactivex.internal.a.b.requireNonNull(callable, "supplier is null");
        return a.k(new k(callable));
    }

    public static <T> e<T> aa(Throwable th) {
        io.reactivex.internal.a.b.requireNonNull(th, "throwable is null");
        return e(io.reactivex.internal.a.a.cL(th));
    }

    public static <T> e<T> w(T... tArr) {
        io.reactivex.internal.a.b.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return bkQ();
        }
        if (tArr.length == 1) {
            return cD(tArr[0]);
        }
        return a.k(new FlowableFromArray(tArr));
    }

    public static <T> e<T> f(Callable<? extends T> callable) {
        io.reactivex.internal.a.b.requireNonNull(callable, "supplier is null");
        return a.k(new m(callable));
    }

    public static <T> e<T> c(Future<? extends T> future) {
        io.reactivex.internal.a.b.requireNonNull(future, "future is null");
        return a.k(new n(future, 0, null));
    }

    public static <T> e<T> G(Iterable<? extends T> iterable) {
        io.reactivex.internal.a.b.requireNonNull(iterable, "source is null");
        return a.k(new FlowableFromIterable(iterable));
    }

    public static <T> e<T> b(b<? extends T> bVar) {
        if (bVar instanceof e) {
            return a.k((e) bVar);
        }
        io.reactivex.internal.a.b.requireNonNull(bVar, "source is null");
        return a.k(new p(bVar));
    }

    public static e<Long> a(long j, long j2, TimeUnit timeUnit) {
        return a(j, j2, timeUnit, io.reactivex.d.a.bmM());
    }

    public static e<Long> a(long j, long j2, TimeUnit timeUnit, o oVar) {
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "unit is null");
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.k(new FlowableInterval(Math.max(0, j), Math.max(0, j2), timeUnit, oVar));
    }

    public static e<Long> f(long j, TimeUnit timeUnit) {
        return a(j, j, timeUnit, io.reactivex.d.a.bmM());
    }

    public static <T> e<T> cD(T t) {
        io.reactivex.internal.a.b.requireNonNull(t, "item is null");
        return a.k(new q(t));
    }

    public static <T> e<T> H(Iterable<? extends b<? extends T>> iterable) {
        return G(iterable).d(io.reactivex.internal.a.a.blr());
    }

    public static <T> e<T> b(b<? extends T> bVar, b<? extends T> bVar2) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "source1 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar2, "source2 is null");
        return w(bVar, bVar2).a(io.reactivex.internal.a.a.blr(), false, 2);
    }

    public static <T> e<T> a(b<? extends T> bVar, b<? extends T> bVar2, b<? extends T> bVar3) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "source1 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar2, "source2 is null");
        io.reactivex.internal.a.b.requireNonNull(bVar3, "source3 is null");
        return w(bVar, bVar2, bVar3).a(io.reactivex.internal.a.a.blr(), false, 3);
    }

    public static <T> e<T> bkR() {
        return a.k(s.eRD);
    }

    public static e<Integer> ba(int i, int i2) {
        if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count >= 0 required but it was ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 == 0) {
            return bkQ();
        } else {
            if (i2 == 1) {
                return cD(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return a.k(new FlowableRange(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    public static e<Long> g(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, io.reactivex.d.a.bmM());
    }

    public static e<Long> a(long j, TimeUnit timeUnit, o oVar) {
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "unit is null");
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.k(new FlowableTimer(Math.max(0, j), timeUnit, oVar));
    }

    public final T bkS() {
        h dVar = new d();
        a(dVar);
        Object ble = dVar.ble();
        if (ble != null) {
            return ble;
        }
        throw new NoSuchElementException();
    }

    public final e<List<T>> h(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, io.reactivex.d.a.bmM(), Integer.MAX_VALUE);
    }

    public final e<List<T>> a(long j, TimeUnit timeUnit, o oVar, int i) {
        return a(j, timeUnit, oVar, i, ArrayListSupplier.asCallable(), false);
    }

    public final <U extends Collection<? super T>> e<U> a(long j, TimeUnit timeUnit, o oVar, int i, Callable<U> callable, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "unit is null");
        o oVar2 = oVar;
        io.reactivex.internal.a.b.requireNonNull(oVar2, "scheduler is null");
        Callable<U> callable2 = callable;
        io.reactivex.internal.a.b.requireNonNull(callable2, "bufferSupplier is null");
        int i2 = i;
        io.reactivex.internal.a.b.i(i2, OtnEmissionExecuted.COUNT);
        return a.k(new io.reactivex.internal.operators.flowable.b(this, j, j, timeUnit2, oVar2, callable2, i2, z));
    }

    public final <U> e<U> D(Class<U> cls) {
        io.reactivex.internal.a.b.requireNonNull(cls, "clazz is null");
        return g(io.reactivex.internal.a.a.E(cls));
    }

    public final <U> p<U> a(Callable<? extends U> callable, io.reactivex.b.b<? super U, ? super T> bVar) {
        io.reactivex.internal.a.b.requireNonNull(callable, "initialItemSupplier is null");
        io.reactivex.internal.a.b.requireNonNull(bVar, "collector is null");
        return a.f(new io.reactivex.internal.operators.flowable.c(this, callable, bVar));
    }

    public final <R> e<R> b(g<? super T, ? extends b<? extends R>> gVar) {
        return a((g) gVar, 2);
    }

    public final <R> e<R> a(g<? super T, ? extends b<? extends R>> gVar, int i) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        io.reactivex.internal.a.b.i(i, "prefetch");
        if (!(this instanceof f)) {
            return a.k(new FlowableConcatMap(this, gVar, i, ErrorMode.IMMEDIATE));
        }
        Object call = ((f) this).call();
        if (call == null) {
            return bkQ();
        }
        return t.a(call, gVar);
    }

    public final e<T> c(b<? extends T> bVar) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "other is null");
        return a((b) this, (b) bVar);
    }

    public final e<T> i(long j, TimeUnit timeUnit) {
        return b(j, timeUnit, io.reactivex.d.a.bmM());
    }

    public final e<T> b(long j, TimeUnit timeUnit, o oVar) {
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "unit is null");
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.k(new FlowableDebounceTimed(this, j, timeUnit, oVar));
    }

    public final e<T> j(long j, TimeUnit timeUnit) {
        return b(j, timeUnit, io.reactivex.d.a.bmM(), false);
    }

    public final e<T> b(long j, TimeUnit timeUnit, o oVar, boolean z) {
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "unit is null");
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.k(new io.reactivex.internal.operators.flowable.d(this, Math.max(0, j), timeUnit, oVar, z));
    }

    public final e<T> bkT() {
        return c(io.reactivex.internal.a.a.blr());
    }

    public final <K> e<T> c(g<? super T, K> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "keySelector is null");
        return a.k(new io.reactivex.internal.operators.flowable.e(this, gVar, io.reactivex.internal.a.b.blu()));
    }

    public final e<T> a(io.reactivex.b.d<? super T, ? super T> dVar) {
        io.reactivex.internal.a.b.requireNonNull(dVar, "comparer is null");
        return a.k(new io.reactivex.internal.operators.flowable.e(this, io.reactivex.internal.a.a.blr(), dVar));
    }

    public final e<T> e(io.reactivex.b.a aVar) {
        io.reactivex.internal.a.b.requireNonNull(aVar, "onFinally is null");
        return a.k(new FlowableDoFinally(this, aVar));
    }

    public final e<T> f(io.reactivex.b.a aVar) {
        return a(io.reactivex.internal.a.a.bls(), io.reactivex.internal.a.a.bls(), aVar, io.reactivex.internal.a.a.aMp);
    }

    private e<T> a(io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar, io.reactivex.b.a aVar2) {
        io.reactivex.internal.a.b.requireNonNull(fVar, "onNext is null");
        io.reactivex.internal.a.b.requireNonNull(fVar2, "onError is null");
        io.reactivex.internal.a.b.requireNonNull(aVar, "onComplete is null");
        io.reactivex.internal.a.b.requireNonNull(aVar2, "onAfterTerminate is null");
        return a.k(new io.reactivex.internal.operators.flowable.f(this, fVar, fVar2, aVar, aVar2));
    }

    public final e<T> b(io.reactivex.b.f<? super Throwable> fVar) {
        return a(io.reactivex.internal.a.a.bls(), (io.reactivex.b.f) fVar, io.reactivex.internal.a.a.aMp, io.reactivex.internal.a.a.aMp);
    }

    public final e<T> a(io.reactivex.b.f<? super org.a.d> fVar, io.reactivex.b.k kVar, io.reactivex.b.a aVar) {
        io.reactivex.internal.a.b.requireNonNull(fVar, "onSubscribe is null");
        io.reactivex.internal.a.b.requireNonNull(kVar, "onRequest is null");
        io.reactivex.internal.a.b.requireNonNull(aVar, "onCancel is null");
        return a.k(new io.reactivex.internal.operators.flowable.g(this, fVar, kVar, aVar));
    }

    public final e<T> c(io.reactivex.b.f<? super T> fVar) {
        return a((io.reactivex.b.f) fVar, io.reactivex.internal.a.a.bls(), io.reactivex.internal.a.a.aMp, io.reactivex.internal.a.a.aMp);
    }

    public final e<T> d(io.reactivex.b.f<? super org.a.d> fVar) {
        return a((io.reactivex.b.f) fVar, io.reactivex.internal.a.a.eQA, io.reactivex.internal.a.a.aMp);
    }

    public final i<T> cO(long j) {
        if (j >= 0) {
            return a.a(new io.reactivex.internal.operators.flowable.h(this, j));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final p<T> a(long j, T t) {
        if (j >= 0) {
            io.reactivex.internal.a.b.requireNonNull(t, "defaultItem is null");
            return a.f(new io.reactivex.internal.operators.flowable.i(this, j, t));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final p<T> cP(long j) {
        if (j >= 0) {
            return a.f(new io.reactivex.internal.operators.flowable.i(this, j, null));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final e<T> b(l<? super T> lVar) {
        io.reactivex.internal.a.b.requireNonNull(lVar, "predicate is null");
        return a.k(new io.reactivex.internal.operators.flowable.l(this, lVar));
    }

    public final i<T> bkU() {
        return cO(0);
    }

    public final p<T> cE(T t) {
        return a(0, (Object) t);
    }

    public final p<T> bkV() {
        return cP(0);
    }

    public final <R> e<R> d(g<? super T, ? extends b<? extends R>> gVar) {
        return a((g) gVar, false, bkP(), bkP());
    }

    public final <R> e<R> a(g<? super T, ? extends b<? extends R>> gVar, boolean z, int i) {
        return a((g) gVar, z, i, bkP());
    }

    public final <R> e<R> a(g<? super T, ? extends b<? extends R>> gVar, boolean z, int i, int i2) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        io.reactivex.internal.a.b.i(i, "maxConcurrency");
        io.reactivex.internal.a.b.i(i2, "bufferSize");
        if (!(this instanceof f)) {
            return a.k(new FlowableFlatMap(this, gVar, z, i, i2));
        }
        Object call = ((f) this).call();
        if (call == null) {
            return bkQ();
        }
        return t.a(call, gVar);
    }

    public final <R> e<R> e(g<? super T, ? extends k<? extends R>> gVar) {
        return b((g) gVar, false, Integer.MAX_VALUE);
    }

    public final <R> e<R> b(g<? super T, ? extends k<? extends R>> gVar, boolean z, int i) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        io.reactivex.internal.a.b.i(i, "maxConcurrency");
        return a.k(new FlowableFlatMapMaybe(this, gVar, z, i));
    }

    public final <R> e<R> f(g<? super T, ? extends t<? extends R>> gVar) {
        return c((g) gVar, false, Integer.MAX_VALUE);
    }

    public final <R> e<R> c(g<? super T, ? extends t<? extends R>> gVar, boolean z, int i) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        io.reactivex.internal.a.b.i(i, "maxConcurrency");
        return a.k(new FlowableFlatMapSingle(this, gVar, z, i));
    }

    public final <R> e<R> g(g<? super T, ? extends R> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        return a.k(new r(this, gVar));
    }

    public final e<T> d(b<? extends T> bVar) {
        io.reactivex.internal.a.b.requireNonNull(bVar, "other is null");
        return b((b) this, (b) bVar);
    }

    public final e<T> c(o oVar) {
        return a(oVar, false, bkP());
    }

    public final e<T> a(o oVar, boolean z, int i) {
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        io.reactivex.internal.a.b.i(i, "bufferSize");
        return a.k(new FlowableObserveOn(this, oVar, z, i));
    }

    public final e<T> bkW() {
        return c(bkP(), false, true);
    }

    public final e<T> c(int i, boolean z, boolean z2) {
        io.reactivex.internal.a.b.i(i, "capacity");
        return a.k(new FlowableOnBackpressureBuffer(this, i, z2, z, io.reactivex.internal.a.a.aMp));
    }

    public final e<T> bkX() {
        return a.k(new FlowableOnBackpressureDrop(this));
    }

    public final e<T> bkY() {
        return a.k(new FlowableOnBackpressureLatest(this));
    }

    public final e<T> h(g<? super Throwable, ? extends T> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "valueSupplier is null");
        return a.k(new FlowableOnErrorReturn(this, gVar));
    }

    public final e<T> cF(T t) {
        io.reactivex.internal.a.b.requireNonNull(t, "item is null");
        return h(io.reactivex.internal.a.a.cM(t));
    }

    public final io.reactivex.a.a<T> bkZ() {
        return jv(bkP());
    }

    public final io.reactivex.a.a<T> jv(int i) {
        io.reactivex.internal.a.b.i(i, "bufferSize");
        return FlowablePublish.a(this, i);
    }

    public final e<T> bla() {
        return cQ(Long.MAX_VALUE);
    }

    public final e<T> cQ(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("times >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j == 0) {
            return bkQ();
        } else {
            return a.k(new FlowableRepeat(this, j));
        }
    }

    public final e<T> i(g<? super e<Object>, ? extends b<?>> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "handler is null");
        return a.k(new FlowableRepeatWhen(this, gVar));
    }

    public final io.reactivex.a.a<T> jw(int i) {
        io.reactivex.internal.a.b.i(i, "bufferSize");
        return FlowableReplay.a(this, i);
    }

    public final e<T> j(g<? super e<Throwable>, ? extends b<?>> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "handler is null");
        return a.k(new FlowableRetryWhen(this, gVar));
    }

    public final e<T> a(io.reactivex.b.c<T, T, T> cVar) {
        io.reactivex.internal.a.b.requireNonNull(cVar, "accumulator is null");
        return a.k(new u(this, cVar));
    }

    public final <R> e<R> a(R r, io.reactivex.b.c<R, ? super T, R> cVar) {
        io.reactivex.internal.a.b.requireNonNull(r, "initialValue is null");
        return a(io.reactivex.internal.a.a.cL(r), (io.reactivex.b.c) cVar);
    }

    public final <R> e<R> a(Callable<R> callable, io.reactivex.b.c<R, ? super T, R> cVar) {
        io.reactivex.internal.a.b.requireNonNull(callable, "seedSupplier is null");
        io.reactivex.internal.a.b.requireNonNull(cVar, "accumulator is null");
        return a.k(new FlowableScanSeed(this, callable, cVar));
    }

    public final e<T> blb() {
        return bkZ().blq();
    }

    public final e<T> cR(long j) {
        if (j <= 0) {
            return a.k(this);
        }
        return a.k(new w(this, j));
    }

    public final e<T> c(l<? super T> lVar) {
        io.reactivex.internal.a.b.requireNonNull(lVar, "predicate is null");
        return a.k(new x(this, lVar));
    }

    public final e<T> cG(T t) {
        io.reactivex.internal.a.b.requireNonNull(t, "value is null");
        return a(cD(t), this);
    }

    public final io.reactivex.disposables.b e(io.reactivex.b.f<? super T> fVar) {
        return a((io.reactivex.b.f) fVar, io.reactivex.internal.a.a.eQz, io.reactivex.internal.a.a.aMp, RequestMax.INSTANCE);
    }

    public final io.reactivex.disposables.b a(io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2) {
        return a((io.reactivex.b.f) fVar, (io.reactivex.b.f) fVar2, io.reactivex.internal.a.a.aMp, RequestMax.INSTANCE);
    }

    public final io.reactivex.disposables.b a(io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar) {
        return a((io.reactivex.b.f) fVar, (io.reactivex.b.f) fVar2, aVar, RequestMax.INSTANCE);
    }

    public final io.reactivex.disposables.b a(io.reactivex.b.f<? super T> fVar, io.reactivex.b.f<? super Throwable> fVar2, io.reactivex.b.a aVar, io.reactivex.b.f<? super org.a.d> fVar3) {
        io.reactivex.internal.a.b.requireNonNull(fVar, "onNext is null");
        io.reactivex.internal.a.b.requireNonNull(fVar2, "onError is null");
        io.reactivex.internal.a.b.requireNonNull(aVar, "onComplete is null");
        io.reactivex.internal.a.b.requireNonNull(fVar3, "onSubscribe is null");
        h lambdaSubscriber = new LambdaSubscriber(fVar, fVar2, aVar, fVar3);
        a(lambdaSubscriber);
        return lambdaSubscriber;
    }

    public final void subscribe(c<? super T> cVar) {
        if (cVar instanceof h) {
            a((h) cVar);
            return;
        }
        io.reactivex.internal.a.b.requireNonNull(cVar, "s is null");
        a(new StrictSubscriber(cVar));
    }

    public final void a(h<? super T> hVar) {
        io.reactivex.internal.a.b.requireNonNull(hVar, "s is null");
        try {
            c a = a.a(this, (c) hVar);
            io.reactivex.internal.a.b.requireNonNull(a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            a.onError(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }

    public final e<T> d(o oVar) {
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a(oVar, !(this instanceof FlowableCreate));
    }

    public final e<T> a(o oVar, boolean z) {
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.k(new FlowableSubscribeOn(this, oVar, z));
    }

    public final <R> e<R> k(g<? super T, ? extends b<? extends R>> gVar) {
        return b((g) gVar, bkP());
    }

    public final <R> e<R> b(g<? super T, ? extends b<? extends R>> gVar, int i) {
        return a((g) gVar, i, false);
    }

    /* Access modifiers changed, original: 0000 */
    public <R> e<R> a(g<? super T, ? extends b<? extends R>> gVar, int i, boolean z) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        io.reactivex.internal.a.b.i(i, "bufferSize");
        if (!(this instanceof f)) {
            return a.k(new FlowableSwitchMap(this, gVar, i, z));
        }
        Object call = ((f) this).call();
        if (call == null) {
            return bkQ();
        }
        return t.a(call, gVar);
    }

    public final <R> e<R> l(g<? super T, ? extends t<? extends R>> gVar) {
        io.reactivex.internal.a.b.requireNonNull(gVar, "mapper is null");
        return a.k(new FlowableSwitchMapSingle(this, gVar, false));
    }

    public final e<T> d(l<? super T> lVar) {
        io.reactivex.internal.a.b.requireNonNull(lVar, "stopPredicate is null");
        return a.k(new y(this, lVar));
    }

    public final e<T> k(long j, TimeUnit timeUnit) {
        return c(j, timeUnit, io.reactivex.d.a.bmM(), false);
    }

    public final e<T> c(long j, TimeUnit timeUnit, o oVar, boolean z) {
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "unit is null");
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.k(new FlowableThrottleLatest(this, j, timeUnit, oVar, z));
    }

    public final e<T> l(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, null, io.reactivex.d.a.bmM());
    }

    private e<T> a(long j, TimeUnit timeUnit, b<? extends T> bVar, o oVar) {
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "timeUnit is null");
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return a.k(new FlowableTimeoutTimed(this, j, timeUnit, oVar, bVar));
    }

    public final p<List<T>> blc() {
        return a.f(new z(this));
    }
}
