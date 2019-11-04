package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.j;
import io.reactivex.k;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSubscribeOn<T> extends a<T, T> {
    final o scheduler;

    static final class a<T> implements Runnable {
        final k<T> eSe;
        final j<? super T> eSh;

        a(j<? super T> jVar, k<T> kVar) {
            this.eSh = jVar;
            this.eSe = kVar;
        }

        public void run() {
            this.eSe.a(this.eSh);
        }
    }

    static final class SubscribeOnMaybeObserver<T> extends AtomicReference<b> implements b, j<T> {
        private static final long serialVersionUID = 8571289934935992137L;
        final j<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnMaybeObserver(j<? super T> jVar) {
            this.downstream = jVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }

        public void d(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }

    public MaybeSubscribeOn(k<T> kVar, o oVar) {
        super(kVar);
        this.scheduler = oVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super T> jVar) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(jVar);
        jVar.d(subscribeOnMaybeObserver);
        subscribeOnMaybeObserver.task.j(this.scheduler.m(new a(subscribeOnMaybeObserver, this.eSe)));
    }
}
