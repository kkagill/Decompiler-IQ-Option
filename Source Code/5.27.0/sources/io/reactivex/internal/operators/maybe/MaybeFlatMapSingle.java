package io.reactivex.internal.operators.maybe;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapSingle<T, R> extends p<R> {
    final k<T> eSe;
    final g<? super T, ? extends t<? extends R>> mapper;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<b> implements b, j<T> {
        private static final long serialVersionUID = 4827726964688405508L;
        final r<? super R> downstream;
        final g<? super T, ? extends t<? extends R>> mapper;

        FlatMapMaybeObserver(r<? super R> rVar, g<? super T, ? extends t<? extends R>> gVar) {
            this.downstream = rVar;
            this.mapper = gVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }

        public void d(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.d(this);
            }
        }

        public void onSuccess(T t) {
            try {
                t tVar = (t) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource");
                if (!isDisposed()) {
                    tVar.a(new a(this, this.downstream));
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
            this.downstream.onError(new NoSuchElementException());
        }
    }

    static final class a<R> implements r<R> {
        final r<? super R> downstream;
        final AtomicReference<b> parent;

        a(AtomicReference<b> atomicReference, r<? super R> rVar) {
            this.parent = atomicReference;
            this.downstream = rVar;
        }

        public void d(b bVar) {
            DisposableHelper.replace(this.parent, bVar);
        }

        public void onSuccess(R r) {
            this.downstream.onSuccess(r);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }

    public MaybeFlatMapSingle(k<T> kVar, g<? super T, ? extends t<? extends R>> gVar) {
        this.eSe = kVar;
        this.mapper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super R> rVar) {
        this.eSe.a(new FlatMapMaybeObserver(rVar, this.mapper));
    }
}
