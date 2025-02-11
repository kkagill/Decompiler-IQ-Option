package io.reactivex.internal.subscriptions;

import io.reactivex.internal.b.e;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements e<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
