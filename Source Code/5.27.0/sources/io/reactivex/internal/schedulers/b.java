package io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: DisposeOnCancel */
final class b implements Future<Object> {
    final io.reactivex.disposables.b upstream;

    public Object get() {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    b(io.reactivex.disposables.b bVar) {
        this.upstream = bVar;
    }

    public boolean cancel(boolean z) {
        this.upstream.dispose();
        return false;
    }
}
