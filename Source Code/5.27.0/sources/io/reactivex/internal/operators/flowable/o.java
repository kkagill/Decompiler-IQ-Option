package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.m;
import io.reactivex.n;
import org.a.c;
import org.a.d;

/* compiled from: FlowableFromObservable */
public final class o<T> extends e<T> {
    private final m<T> eRJ;

    /* compiled from: FlowableFromObservable */
    static final class a<T> implements n<T>, d {
        final c<? super T> downstream;
        b upstream;

        public void request(long j) {
        }

        a(c<? super T> cVar) {
            this.downstream = cVar;
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void d(b bVar) {
            this.upstream = bVar;
            this.downstream.onSubscribe(this);
        }

        public void cancel() {
            this.upstream.dispose();
        }
    }

    public o(m<T> mVar) {
        this.eRJ = mVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRJ.a(new a(cVar));
    }
}
