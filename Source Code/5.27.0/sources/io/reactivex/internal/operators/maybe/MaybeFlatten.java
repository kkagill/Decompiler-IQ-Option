package io.reactivex.internal.operators.maybe;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatten<T, R> extends a<T, R> {
    final g<? super T, ? extends k<? extends R>> mapper;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<b> implements b, j<T> {
        private static final long serialVersionUID = 4375739915521278546L;
        final j<? super R> downstream;
        final g<? super T, ? extends k<? extends R>> mapper;
        b upstream;

        final class a implements j<R> {
            a() {
            }

            public void d(b bVar) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, bVar);
            }

            public void onSuccess(R r) {
                FlatMapMaybeObserver.this.downstream.onSuccess(r);
            }

            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.downstream.onError(th);
            }

            public void onComplete() {
                FlatMapMaybeObserver.this.downstream.onComplete();
            }
        }

        FlatMapMaybeObserver(j<? super R> jVar, g<? super T, ? extends k<? extends R>> gVar) {
            this.downstream = jVar;
            this.mapper = gVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.upstream.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }

        public void d(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.d(this);
            }
        }

        public void onSuccess(T t) {
            try {
                k kVar = (k) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    kVar.a(new a());
                }
            } catch (Exception e) {
                io.reactivex.exceptions.a.ad(e);
                this.downstream.onError(e);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }

    public MaybeFlatten(k<T> kVar, g<? super T, ? extends k<? extends R>> gVar) {
        super(kVar);
        this.mapper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(j<? super R> jVar) {
        this.eSe.a(new FlatMapMaybeObserver(jVar, this.mapper));
    }
}
