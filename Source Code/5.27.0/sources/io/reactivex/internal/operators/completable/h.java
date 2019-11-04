package io.reactivex.internal.operators.completable;

import io.reactivex.b.f;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* compiled from: CompletablePeek */
public final class h extends io.reactivex.a {
    final io.reactivex.b.a eQU;
    final io.reactivex.b.a eQV;
    final io.reactivex.b.a eQW;
    final io.reactivex.b.a onComplete;
    final f<? super Throwable> onError;
    final f<? super b> onSubscribe;
    final c source;

    /* compiled from: CompletablePeek */
    final class a implements io.reactivex.b, b {
        final io.reactivex.b downstream;
        b upstream;

        a(io.reactivex.b bVar) {
            this.downstream = bVar;
        }

        public void d(b bVar) {
            try {
                h.this.onSubscribe.accept(bVar);
                if (DisposableHelper.validate(this.upstream, bVar)) {
                    this.upstream = bVar;
                    this.downstream.d(this);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                bVar.dispose();
                this.upstream = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.downstream);
            }
        }

        public void onError(Throwable th) {
            if (this.upstream == DisposableHelper.DISPOSED) {
                io.reactivex.c.a.onError(th);
                return;
            }
            try {
                h.this.onError.accept(th);
                h.this.eQU.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.ad(th2);
                th = new CompositeException(th, th2);
            }
            this.downstream.onError(th);
            blw();
        }

        public void onComplete() {
            if (this.upstream != DisposableHelper.DISPOSED) {
                try {
                    h.this.onComplete.run();
                    h.this.eQU.run();
                    this.downstream.onComplete();
                    blw();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.downstream.onError(th);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blw() {
            try {
                h.this.eQV.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                io.reactivex.c.a.onError(th);
            }
        }

        public void dispose() {
            try {
                h.this.eQW.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                io.reactivex.c.a.onError(th);
            }
            this.upstream.dispose();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }

    public h(c cVar, f<? super b> fVar, f<? super Throwable> fVar2, io.reactivex.b.a aVar, io.reactivex.b.a aVar2, io.reactivex.b.a aVar3, io.reactivex.b.a aVar4) {
        this.source = cVar;
        this.onSubscribe = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
        this.eQU = aVar2;
        this.eQV = aVar3;
        this.eQW = aVar4;
    }

    /* Access modifiers changed, original: protected */
    public void b(io.reactivex.b bVar) {
        this.source.a(new a(bVar));
    }
}
