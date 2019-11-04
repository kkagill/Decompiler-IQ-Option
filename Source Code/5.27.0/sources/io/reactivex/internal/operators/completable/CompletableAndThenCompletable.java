package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableAndThenCompletable extends io.reactivex.a {
    final c next;
    final c source;

    static final class SourceObserver extends AtomicReference<b> implements io.reactivex.b, b {
        private static final long serialVersionUID = -4101678820158072998L;
        final io.reactivex.b actualObserver;
        final c next;

        SourceObserver(io.reactivex.b bVar, c cVar) {
            this.actualObserver = bVar;
            this.next = cVar;
        }

        public void d(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.actualObserver.d(this);
            }
        }

        public void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        public void onComplete() {
            this.next.a(new a(this, this.actualObserver));
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((b) get());
        }
    }

    static final class a implements io.reactivex.b {
        final io.reactivex.b downstream;
        final AtomicReference<b> parent;

        public a(AtomicReference<b> atomicReference, io.reactivex.b bVar) {
            this.parent = atomicReference;
            this.downstream = bVar;
        }

        public void d(b bVar) {
            DisposableHelper.replace(this.parent, bVar);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }

    public CompletableAndThenCompletable(c cVar, c cVar2) {
        this.source = cVar;
        this.next = cVar2;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        this.source.a(new SourceObserver(bVar, this.next));
    }
}
