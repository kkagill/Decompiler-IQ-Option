package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.i;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMapMaybe<T, R> extends i<R> {
    final g<? super T, ? extends k<? extends R>> mapper;
    final t<? extends T> source;

    static final class FlatMapSingleObserver<T, R> extends AtomicReference<b> implements b, r<T> {
        private static final long serialVersionUID = -5843758257109742742L;
        final j<? super R> downstream;
        final g<? super T, ? extends k<? extends R>> mapper;

        FlatMapSingleObserver(j<? super R> jVar, g<? super T, ? extends k<? extends R>> gVar) {
            this.downstream = jVar;
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
                k kVar = (k) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    kVar.a(new a(this, this.downstream));
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }

    static final class a<R> implements j<R> {
        final j<? super R> downstream;
        final AtomicReference<b> parent;

        a(AtomicReference<b> atomicReference, j<? super R> jVar) {
            this.parent = atomicReference;
            this.downstream = jVar;
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

        public void onComplete() {
            this.downstream.onComplete();
        }
    }

    public SingleFlatMapMaybe(t<? extends T> tVar, g<? super T, ? extends k<? extends R>> gVar) {
        this.mapper = gVar;
        this.source = tVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super R> jVar) {
        this.source.a(new FlatMapSingleObserver(jVar, this.mapper));
    }
}
