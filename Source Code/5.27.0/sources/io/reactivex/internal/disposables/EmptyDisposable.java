package io.reactivex.internal.disposables;

import io.reactivex.b;
import io.reactivex.internal.b.c;
import io.reactivex.j;
import io.reactivex.n;
import io.reactivex.r;

public enum EmptyDisposable implements c<Object> {
    INSTANCE,
    NEVER;

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isEmpty() {
        return true;
    }

    public Object poll() {
        return null;
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void complete(n<?> nVar) {
        nVar.d(INSTANCE);
        nVar.onComplete();
    }

    public static void complete(j<?> jVar) {
        jVar.d(INSTANCE);
        jVar.onComplete();
    }

    public static void error(Throwable th, n<?> nVar) {
        nVar.d(INSTANCE);
        nVar.onError(th);
    }

    public static void complete(b bVar) {
        bVar.d(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th, b bVar) {
        bVar.d(INSTANCE);
        bVar.onError(th);
    }

    public static void error(Throwable th, r<?> rVar) {
        rVar.d(INSTANCE);
        rVar.onError(th);
    }

    public static void error(Throwable th, j<?> jVar) {
        jVar.d(INSTANCE);
        jVar.onError(th);
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
