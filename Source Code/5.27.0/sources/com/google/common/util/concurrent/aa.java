package com.google.common.util.concurrent;

/* compiled from: SettableFuture */
public final class aa<V> extends i<V> {
    public static <V> aa<V> vM() {
        return new aa();
    }

    public boolean set(V v) {
        return super.set(v);
    }

    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    public boolean setFuture(t<? extends V> tVar) {
        return super.setFuture(tVar);
    }

    private aa() {
    }
}
