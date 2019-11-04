package io.reactivex.internal.operators.single;

import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.exceptions.a;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class SingleFlatMapPublisher<T, R> extends e<R> {
    final g<? super T, ? extends b<? extends R>> mapper;
    final t<T> source;

    static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements h<T>, r<S>, d {
        private static final long serialVersionUID = 7759721921468635667L;
        io.reactivex.disposables.b disposable;
        final c<? super T> downstream;
        final g<? super S, ? extends b<? extends T>> mapper;
        final AtomicReference<d> parent = new AtomicReference();

        SingleFlatMapPublisherObserver(c<? super T> cVar, g<? super S, ? extends b<? extends T>> gVar) {
            this.downstream = cVar;
            this.mapper = gVar;
        }

        public void d(io.reactivex.disposables.b bVar) {
            this.disposable = bVar;
            this.downstream.onSubscribe(this);
        }

        public void onSuccess(S s) {
            try {
                ((b) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(s), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                a.ad(th);
                this.downstream.onError(th);
            }
        }

        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, dVar);
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.parent, this, j);
        }

        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
        }
    }

    public SingleFlatMapPublisher(t<T> tVar, g<? super T, ? extends b<? extends R>> gVar) {
        this.source = tVar;
        this.mapper = gVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super R> cVar) {
        this.source.a(new SingleFlatMapPublisherObserver(cVar, this.mapper));
    }
}
