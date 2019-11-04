package io.reactivex.internal.operators.single;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDelayWithCompletable<T> extends p<T> {
    final c eSo;
    final t<T> source;

    static final class OtherObserver<T> extends AtomicReference<b> implements io.reactivex.b, b {
        private static final long serialVersionUID = -8565274649390031272L;
        final r<? super T> downstream;
        final t<T> source;

        OtherObserver(r<? super T> rVar, t<T> tVar) {
            this.downstream = rVar;
            this.source = tVar;
        }

        public void d(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.d(this);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.source.a(new io.reactivex.internal.observers.b(this, this.downstream));
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }
    }

    public SingleDelayWithCompletable(t<T> tVar, c cVar) {
        this.source = tVar;
        this.eSo = cVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.eSo.a(new OtherObserver(rVar, this.source));
    }
}
