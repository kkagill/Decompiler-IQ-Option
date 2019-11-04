package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableConcatArray<T> extends e<T> {
    final boolean delayError;
    final b<? extends T>[] sources;

    static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements h<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final c<? super T> downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final b<? extends T>[] sources;
        final AtomicInteger wip = new AtomicInteger();

        ConcatArraySubscriber(b<? extends T>[] bVarArr, boolean z, c<? super T> cVar) {
            super(false);
            this.downstream = cVar;
            this.sources = bVarArr;
            this.delayError = z;
        }

        public void onSubscribe(d dVar) {
            a(dVar);
        }

        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                b[] bVarArr = this.sources;
                int length = bVarArr.length;
                int i = this.index;
                while (i != length) {
                    b bVar = bVarArr[i];
                    if (bVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    }
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        dc(j);
                    }
                    bVar.subscribe(this);
                    i++;
                    this.index = i;
                    if (this.wip.decrementAndGet() == 0) {
                    }
                }
                Iterable iterable = this.errors;
                if (iterable == null) {
                    this.downstream.onComplete();
                } else if (iterable.size() == 1) {
                    this.downstream.onError((Throwable) iterable.get(0));
                } else {
                    this.downstream.onError(new CompositeException(iterable));
                }
            }
        }
    }

    public FlowableConcatArray(b<? extends T>[] bVarArr, boolean z) {
        this.sources = bVarArr;
        this.delayError = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, cVar);
        cVar.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
