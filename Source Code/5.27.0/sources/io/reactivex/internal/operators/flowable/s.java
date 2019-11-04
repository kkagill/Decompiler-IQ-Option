package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.a.c;

/* compiled from: FlowableNever */
public final class s extends e<Object> {
    public static final e<Object> eRD = new s();

    private s() {
    }

    public void a(c<? super Object> cVar) {
        cVar.onSubscribe(EmptySubscription.INSTANCE);
    }
}
