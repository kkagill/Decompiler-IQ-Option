package com.google.common.util.concurrent;

import com.google.common.base.i;
import java.util.concurrent.Executor;

/* compiled from: ForwardingListenableFuture */
public abstract class n<V> extends m<V> implements t<V> {

    /* compiled from: ForwardingListenableFuture */
    public static abstract class a<V> extends n<V> {
        private final t<V> aaw;

        protected a(t<V> tVar) {
            this.aaw = (t) i.checkNotNull(tVar);
        }

        /* Access modifiers changed, original: protected|final */
        /* renamed from: vE */
        public final t<V> vD() {
            return this.aaw;
        }
    }

    /* renamed from: vE */
    public abstract t<? extends V> vD();

    protected n() {
    }

    public void addListener(Runnable runnable, Executor executor) {
        vD().addListener(runnable, executor);
    }
}
