package com.iqoption.core.rx;

import com.iqoption.core.d;
import com.iqoption.core.util.d.a;
import io.reactivex.o;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r*\n\u0010\u000e\"\u00020\u000f2\u00020\u000f¨\u0006\u0010"}, bng = {"bg", "Lio/reactivex/Scheduler;", "getBg", "()Lio/reactivex/Scheduler;", "comp", "getComp", "ui", "getUi", "worker", "getWorker", "workerHandler", "Lcom/iqoption/core/util/thread/ExecutorHandlerThread;", "getWorkerHandler", "()Lcom/iqoption/core/util/thread/ExecutorHandlerThread;", "GuavaSchedulers", "Lcom/iqoption/core/guava/Schedulers;", "core_release"})
/* compiled from: Schedulers.kt */
public final class i {
    private static final a bFk;
    private static final o bFl;
    private static final o bFm;
    private static final o bFn;
    private static final o bFo;

    static {
        a aVar = new a("WorkerHandlerThread");
        aVar.start();
        bFk = aVar;
        Object bmN = d.Un().Dt() ? io.reactivex.d.a.bmN() : io.reactivex.d.a.b(com.iqoption.core.c.a.biL);
        kotlin.jvm.internal.i.e(bmN, "if (config.isTest) Sched….from(GuavaSchedulers.io)");
        bFl = bmN;
        bmN = d.Un().Dt() ? io.reactivex.d.a.bmN() : io.reactivex.d.a.b(com.iqoption.core.c.a.biN);
        kotlin.jvm.internal.i.e(bmN, "if (config.isTest) Sched….from(GuavaSchedulers.ui)");
        bFm = bmN;
        bmN = d.Un().Dt() ? io.reactivex.d.a.bmN() : io.reactivex.d.a.bmM();
        kotlin.jvm.internal.i.e(bmN, "if (config.isTest) Sched… Schedulers.computation()");
        bFn = bmN;
        bmN = d.Un().Dt() ? io.reactivex.d.a.bmN() : io.reactivex.d.a.b(bFk);
        kotlin.jvm.internal.i.e(bmN, "if (config.isTest) Sched…ulers.from(workerHandler)");
        bFo = bmN;
    }

    public static final a akh() {
        return bFk;
    }

    public static final o aki() {
        return bFl;
    }

    public static final o akj() {
        return bFm;
    }

    public static final o akk() {
        return bFn;
    }

    public static final o akl() {
        return bFo;
    }
}
