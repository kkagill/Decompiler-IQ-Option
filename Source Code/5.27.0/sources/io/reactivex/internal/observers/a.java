package io.reactivex.internal.observers;

import io.reactivex.b;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.c;
import io.reactivex.j;
import io.reactivex.r;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingMultiObserver */
public final class a<T> extends CountDownLatch implements b, j<T>, r<T> {
    volatile boolean cancelled;
    Throwable error;
    io.reactivex.disposables.b upstream;
    T value;

    public a() {
        super(1);
    }

    /* Access modifiers changed, original: 0000 */
    public void dispose() {
        this.cancelled = true;
        io.reactivex.disposables.b bVar = this.upstream;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public void d(io.reactivex.disposables.b bVar) {
        this.upstream = bVar;
        if (this.cancelled) {
            bVar.dispose();
        }
    }

    public void onSuccess(T t) {
        this.value = t;
        countDown();
    }

    public void onError(Throwable th) {
        this.error = th;
        countDown();
    }

    public void onComplete() {
        countDown();
    }

    public T ble() {
        if (getCount() != 0) {
            try {
                c.bmC();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw ExceptionHelper.aj(e);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.aj(th);
    }
}
