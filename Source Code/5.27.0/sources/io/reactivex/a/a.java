package io.reactivex.a;

import io.reactivex.b.f;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectableFlowable */
public abstract class a<T> extends e<T> {
    public abstract void j(f<? super b> fVar);

    public e<T> blq() {
        return io.reactivex.c.a.k(new FlowableRefCount(this));
    }

    public final e<T> n(long j, TimeUnit timeUnit) {
        return a(1, j, timeUnit, io.reactivex.d.a.bmM());
    }

    public final e<T> a(int i, long j, TimeUnit timeUnit, o oVar) {
        io.reactivex.internal.a.b.i(i, "subscriberCount");
        io.reactivex.internal.a.b.requireNonNull(timeUnit, "unit is null");
        io.reactivex.internal.a.b.requireNonNull(oVar, "scheduler is null");
        return io.reactivex.c.a.k(new FlowableRefCount(this, i, j, timeUnit, oVar));
    }
}
