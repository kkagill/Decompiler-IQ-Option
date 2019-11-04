package io.reactivex.internal.operators.single;

import io.reactivex.disposables.b;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleCache<T> extends p<T> implements r<T> {
    static final CacheDisposable[] eSj = new CacheDisposable[0];
    static final CacheDisposable[] eSk = new CacheDisposable[0];
    final AtomicReference<CacheDisposable<T>[]> eSl = new AtomicReference(eSj);
    Throwable error;
    final t<? extends T> source;
    T value;
    final AtomicInteger wip = new AtomicInteger();

    static final class CacheDisposable<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 7514387411091976596L;
        final r<? super T> downstream;
        final SingleCache<T> parent;

        CacheDisposable(r<? super T> rVar, SingleCache<T> singleCache) {
            this.downstream = rVar;
            this.parent = singleCache;
        }

        public boolean isDisposed() {
            return get();
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.b(this);
            }
        }
    }

    public void d(b bVar) {
    }

    public SingleCache(t<? extends T> tVar) {
        this.source = tVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        CacheDisposable cacheDisposable = new CacheDisposable(rVar, this);
        rVar.d(cacheDisposable);
        if (a(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                b(cacheDisposable);
            }
            if (this.wip.getAndIncrement() == 0) {
                this.source.a(this);
            }
            return;
        }
        Throwable th = this.error;
        if (th != null) {
            rVar.onError(th);
        } else {
            rVar.onSuccess(this.value);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(CacheDisposable<T> cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.eSl.get();
            if (cacheDisposableArr == eSk) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[(length + 1)];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!this.eSl.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(CacheDisposable<T> cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        Object obj;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.eSl.get();
            int length = cacheDisposableArr.length;
            if (length != 0) {
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (cacheDisposableArr[i2] == cacheDisposable) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = eSj;
                    } else {
                        Object obj2 = new CacheDisposable[(length - 1)];
                        System.arraycopy(cacheDisposableArr, 0, obj2, 0, i);
                        System.arraycopy(cacheDisposableArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            }
            return;
        } while (!this.eSl.compareAndSet(cacheDisposableArr, obj));
    }

    public void onSuccess(T t) {
        this.value = t;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.eSl.getAndSet(eSk)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    public void onError(Throwable th) {
        this.error = th;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.eSl.getAndSet(eSk)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }
}
