package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ListeningScheduledExecutorService */
public interface w extends v, ScheduledExecutorService {
    u<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    u<?> a(Runnable runnable, long j, TimeUnit timeUnit);

    <V> u<V> a(Callable<V> callable, long j, TimeUnit timeUnit);

    u<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
