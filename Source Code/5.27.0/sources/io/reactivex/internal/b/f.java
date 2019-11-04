package io.reactivex.internal.b;

import java.util.concurrent.Callable;

/* compiled from: ScalarCallable */
public interface f<T> extends Callable<T> {
    T call();
}
