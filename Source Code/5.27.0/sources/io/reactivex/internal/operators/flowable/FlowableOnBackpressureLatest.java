package io.reactivex.internal.operators.flowable;

import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableOnBackpressureLatest<T> extends a<T, T> {

    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements h<T>, d {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        final AtomicReference<T> current = new AtomicReference();
        volatile boolean done;
        final c<? super T> downstream;
        Throwable error;
        final AtomicLong requested = new AtomicLong();
        d upstream;

        BackpressureLatestSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            this.current.lazySet(t);
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                b.a(this.requested, j);
                drain();
            }
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference atomicReference = this.current;
                int i = 1;
                do {
                    boolean z;
                    boolean z2;
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        z2 = this.done;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!a(z2, z3, cVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        z2 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (a(z2, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        b.c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(boolean z, boolean z2, c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(th);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public FlowableOnBackpressureLatest(e<T> eVar) {
        super(eVar);
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRc.a(new BackpressureLatestSubscriber(cVar));
    }
}
