package io.reactivex.internal.operators.flowable;

import io.reactivex.b.f;
import org.a.d;

public final class FlowableInternalHelper {

    public enum RequestMax implements f<d> {
        INSTANCE;

        public void accept(d dVar) {
            dVar.request(Long.MAX_VALUE);
        }
    }
}
