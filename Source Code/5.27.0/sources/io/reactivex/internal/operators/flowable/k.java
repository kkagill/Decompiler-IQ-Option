package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.exceptions.a;
import io.reactivex.internal.a.b;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.a.c;

/* compiled from: FlowableError */
public final class k<T> extends e<T> {
    final Callable<? extends Throwable> eRE;

    public k(Callable<? extends Throwable> callable) {
        this.eRE = callable;
    }

    public void a(c<? super T> cVar) {
        Throwable th;
        try {
            th = (Throwable) b.requireNonNull(this.eRE.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            a.ad(th);
        }
        EmptySubscription.error(th, cVar);
    }
}
