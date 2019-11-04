package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* compiled from: Callables */
public final class i {
    public static <T> Callable<T> bn(final T t) {
        return new Callable<T>() {
            public T call() {
                return t;
            }
        };
    }
}
