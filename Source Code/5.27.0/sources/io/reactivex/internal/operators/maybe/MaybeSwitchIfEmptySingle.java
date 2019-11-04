package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.j;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSwitchIfEmptySingle<T> extends p<T> {
    final k<T> eSe;
    final t<? extends T> other;

    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<b> implements b, j<T> {
        private static final long serialVersionUID = 4603919676453758899L;
        final r<? super T> downstream;
        final t<? extends T> other;

        static final class a<T> implements r<T> {
            final r<? super T> downstream;
            final AtomicReference<b> parent;

            a(r<? super T> rVar, AtomicReference<b> atomicReference) {
                this.downstream = rVar;
                this.parent = atomicReference;
            }

            public void d(b bVar) {
                DisposableHelper.setOnce(this.parent, bVar);
            }

            public void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }

            public void onError(Throwable th) {
                this.downstream.onError(th);
            }
        }

        SwitchIfEmptyMaybeObserver(r<? super T> rVar, t<? extends T> tVar) {
            this.downstream = rVar;
            this.other = tVar;
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
            this.downstream.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            b bVar = (b) get();
            if (bVar != DisposableHelper.DISPOSED && compareAndSet(bVar, null)) {
                this.other.a(new a(this.downstream, this));
            }
        }
    }

    public MaybeSwitchIfEmptySingle(k<T> kVar, t<? extends T> tVar) {
        this.eSe = kVar;
        this.other = tVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.eSe.a(new SwitchIfEmptyMaybeObserver(rVar, this.other));
    }
}
