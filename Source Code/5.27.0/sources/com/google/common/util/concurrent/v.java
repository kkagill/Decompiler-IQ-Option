package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: ListeningExecutorService */
public interface v extends ExecutorService {
    <T> t<T> c(Callable<T> callable);

    t<?> d(Runnable runnable);
}
