package io.reactivex.internal.operators.single;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.o;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleSubscribeOn<T> extends p<T> {
    final o scheduler;
    final t<? extends T> source;

    static final class SubscribeOnObserver<T> extends AtomicReference<b> implements b, r<T>, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final r<? super T> downstream;
        final t<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(r<? super T> rVar, t<? extends T> tVar) {
            this.downstream = rVar;
            this.source = tVar;
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

        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }

        public void run() {
            this.source.a(this);
        }
    }

    public SingleSubscribeOn(t<? extends T> tVar, o oVar) {
        this.source = tVar;
        this.scheduler = oVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(rVar, this.source);
        rVar.d(subscribeOnObserver);
        subscribeOnObserver.task.j(this.scheduler.m(subscribeOnObserver));
    }
}
