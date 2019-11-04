package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMap<T, R> extends p<R> {
    final g<? super T, ? extends t<? extends R>> mapper;
    final t<? extends T> source;

    static final class SingleFlatMapCallback<T, R> extends AtomicReference<b> implements b, r<T> {
        private static final long serialVersionUID = 3258103020495908596L;
        final r<? super R> downstream;
        final g<? super T, ? extends t<? extends R>> mapper;

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

        SingleFlatMapCallback(r<? super R> rVar, g<? super T, ? extends t<? extends R>> gVar) {
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
                t tVar = (t) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    tVar.a(new a(this, this.downstream));
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                this.downstream.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }

    public SingleFlatMap(t<? extends T> tVar, g<? super T, ? extends t<? extends R>> gVar) {
        this.mapper = gVar;
        this.source = tVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super R> rVar) {
        this.source.a(new SingleFlatMapCallback(rVar, this.mapper));
    }
}
