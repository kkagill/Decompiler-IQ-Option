package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.airbnb.lottie.d.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask */
public class n<T> {
    public static Executor eP = Executors.newCachedThreadPool();
    private final Set<i<T>> eQ;
    private final Set<i<Throwable>> eR;
    @Nullable
    private volatile m<T> eS;
    private final Handler handler;

    /* compiled from: LottieTask */
    private class a extends FutureTask<m<T>> {
        a(Callable<m<T>> callable) {
            super(callable);
        }

        /* Access modifiers changed, original: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    n.this.a((m) get());
                } catch (InterruptedException | ExecutionException e) {
                    n.this.a(new m(e));
                }
            }
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public n(Callable<m<T>> callable) {
        this(callable, false);
    }

    @RestrictTo({Scope.LIBRARY})
    n(Callable<m<T>> callable, boolean z) {
        this.eQ = new LinkedHashSet(1);
        this.eR = new LinkedHashSet(1);
        this.handler = new Handler(Looper.getMainLooper());
        this.eS = null;
        if (z) {
            try {
                a((m) callable.call());
                return;
            } catch (Throwable th) {
                a(new m(th));
                return;
            }
        }
        eP.execute(new a(callable));
    }

    private void a(@Nullable m<T> mVar) {
        if (this.eS == null) {
            this.eS = mVar;
            aA();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized n<T> a(i<T> iVar) {
        if (!(this.eS == null || this.eS.getValue() == null)) {
            iVar.onResult(this.eS.getValue());
        }
        this.eQ.add(iVar);
        return this;
    }

    public synchronized n<T> b(i<T> iVar) {
        this.eQ.remove(iVar);
        return this;
    }

    public synchronized n<T> c(i<Throwable> iVar) {
        if (!(this.eS == null || this.eS.getException() == null)) {
            iVar.onResult(this.eS.getException());
        }
        this.eR.add(iVar);
        return this;
    }

    public synchronized n<T> d(i<Throwable> iVar) {
        this.eR.remove(iVar);
        return this;
    }

    private void aA() {
        this.handler.post(new Runnable() {
            public void run() {
                if (n.this.eS != null) {
                    m a = n.this.eS;
                    if (a.getValue() != null) {
                        n.this.P(a.getValue());
                    } else {
                        n.this.b(a.getException());
                    }
                }
            }
        });
    }

    private synchronized void P(T t) {
        for (i onResult : new ArrayList(this.eQ)) {
            onResult.onResult(t);
        }
    }

    private synchronized void b(Throwable th) {
        ArrayList<i> arrayList = new ArrayList(this.eR);
        if (arrayList.isEmpty()) {
            d.a("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (i onResult : arrayList) {
            onResult.onResult(th);
        }
    }
}
