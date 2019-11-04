package io.reactivex.internal.subscribers;

import io.reactivex.b.a;
import io.reactivex.b.f;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class LambdaSubscriber<T> extends AtomicReference<d> implements b, h<T>, d {
    private static final long serialVersionUID = -7251123623727029452L;
    final a onComplete;
    final f<? super Throwable> onError;
    final f<? super T> onNext;
    final f<? super d> onSubscribe;

    public LambdaSubscriber(f<? super T> fVar, f<? super Throwable> fVar2, a aVar, f<? super d> fVar3) {
        this.onNext = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
        this.onSubscribe = fVar3;
    }

    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                ((d) get()).cancel();
                onError(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onError.accept(th);
                return;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                io.reactivex.c.a.onError(new CompositeException(th, th2));
                return;
            }
        }
        io.reactivex.c.a.onError(th);
    }

    public void onComplete() {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                io.reactivex.c.a.onError(th);
            }
        }
    }

    public void dispose() {
        cancel();
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void request(long j) {
        ((d) get()).request(j);
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }
}
