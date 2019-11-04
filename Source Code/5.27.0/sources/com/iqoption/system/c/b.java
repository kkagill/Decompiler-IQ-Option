package com.iqoption.system.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.j;
import com.google.common.util.concurrent.o;
import java.lang.ref.WeakReference;

/* compiled from: ReferenceFutureCallback */
public abstract class b<T, V> implements o<V> {
    protected final WeakReference<T> biQ;
    @Nullable
    private j<? super T> dUv;
    private final Class<V> dUw;

    public void c(@NonNull T t, Throwable th) {
    }

    public void v(@NonNull T t, @Nullable V v) {
    }

    public b(T t) {
        this.biQ = new WeakReference(t);
        this.dUw = null;
    }

    public b(T t, Class<V> cls) {
        this.biQ = new WeakReference(t);
        this.dUw = cls;
    }

    public void e(@Nullable j<? super T> jVar) {
        this.dUv = jVar;
    }

    public void onSuccess(V v) {
        if (v == null) {
            Class cls = this.dUw;
            if (cls == null || (!cls.isInstance(Void.class) && this.dUw.isInstance(Object.class))) {
                l(new NullPointerException("not parse"));
                return;
            }
        }
        Object aUD = aUD();
        if (aUD != null) {
            v(aUD, v);
        }
    }

    public void l(Throwable th) {
        Object aUD = aUD();
        if (aUD != null) {
            c(aUD, th);
        }
    }

    private T aUD() {
        T t = this.biQ.get();
        if (t == null) {
            return null;
        }
        j jVar = this.dUv;
        if (jVar == null) {
            return t;
        }
        if (!jVar.apply(t)) {
            t = null;
        }
        return t;
    }

    public T aUE() {
        return this.biQ.get();
    }
}
