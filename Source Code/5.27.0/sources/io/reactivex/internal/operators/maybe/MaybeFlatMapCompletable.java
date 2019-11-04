package io.reactivex.internal.operators.maybe;

import io.reactivex.a;
import io.reactivex.b.g;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapCompletable<T> extends a {
    final k<T> eSe;
    final g<? super T, ? extends c> mapper;

    static final class FlatMapCompletableObserver<T> extends AtomicReference<b> implements io.reactivex.b, b, j<T> {
        private static final long serialVersionUID = -2177128922851101253L;
        final io.reactivex.b downstream;
        final g<? super T, ? extends c> mapper;

        FlatMapCompletableObserver(io.reactivex.b bVar, g<? super T, ? extends c> gVar) {
            this.downstream = bVar;
            this.mapper = gVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }

        public void d(b bVar) {
            DisposableHelper.replace(this, bVar);
        }

        public void onSuccess(T t) {
            try {
                c cVar = (c) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    cVar.a(this);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }

    public MaybeFlatMapCompletable(k<T> kVar, g<? super T, ? extends c> gVar) {
        this.eSe = kVar;
        this.mapper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(bVar, this.mapper);
        bVar.d(flatMapCompletableObserver);
        this.eSe.a(flatMapCompletableObserver);
    }
}
