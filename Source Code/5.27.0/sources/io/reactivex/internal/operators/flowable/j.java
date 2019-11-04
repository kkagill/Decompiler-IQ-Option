package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.internal.b.f;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.a.c;

/* compiled from: FlowableEmpty */
public final class j extends e<Object> implements f<Object> {
    public static final e<Object> eRD = new j();

    public Object call() {
        return null;
    }

    private j() {
    }

    public void a(c<? super Object> cVar) {
        EmptySubscription.complete(cVar);
    }
}
