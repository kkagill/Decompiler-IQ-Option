package io.reactivex.internal.operators.single;

import io.reactivex.b.f;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p;
import io.reactivex.r;
import io.reactivex.t;

/* compiled from: SingleDoOnSubscribe */
public final class e<T> extends p<T> {
    final f<? super b> onSubscribe;
    final t<T> source;

    /* compiled from: SingleDoOnSubscribe */
    static final class a<T> implements r<T> {
        boolean done;
        final r<? super T> downstream;
        final f<? super b> onSubscribe;

        a(r<? super T> rVar, f<? super b> fVar) {
            this.downstream = rVar;
            this.onSubscribe = fVar;
        }

        public void d(b bVar) {
            try {
                this.onSubscribe.accept(bVar);
                this.downstream.d(bVar);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                this.done = true;
                bVar.dispose();
                EmptyDisposable.error(th, this.downstream);
            }
        }

        public void onSuccess(T t) {
            if (!this.done) {
                this.downstream.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.c.a.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    public e(t<T> tVar, f<? super b> fVar) {
        this.source = tVar;
        this.onSubscribe = fVar;
    }

    /* Access modifiers changed, original: protected */
    public void b(r<? super T> rVar) {
        this.source.a(new a(rVar, this.onSubscribe));
    }
}
