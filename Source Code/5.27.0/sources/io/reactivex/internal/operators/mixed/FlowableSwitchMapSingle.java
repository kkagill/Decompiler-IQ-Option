package io.reactivex.internal.operators.mixed;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.exceptions.a;
import io.reactivex.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableSwitchMapSingle<T, R> extends e<R> {
    final boolean delayErrors;
    final e<T> eRc;
    final g<? super T, ? extends t<? extends R>> mapper;

    static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements h<T>, d {
        static final SwitchMapSingleObserver<Object> eSi = new SwitchMapSingleObserver(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c<? super R> downstream;
        long emitted;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference();
        final g<? super T, ? extends t<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        d upstream;

        static final class SwitchMapSingleObserver<R> extends AtomicReference<b> implements r<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleSubscriber<?, R> parent;

            SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            public void d(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            public void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
            }

            public void onError(Throwable th) {
                this.parent.a(this, th);
            }

            /* Access modifiers changed, original: 0000 */
            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }

        SwitchMapSingleSubscriber(c<? super R> cVar, g<? super T, ? extends t<? extends R>> gVar, boolean z) {
            this.downstream = cVar;
            this.mapper = gVar;
            this.delayErrors = z;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) this.inner.get();
            if (switchMapSingleObserver != null) {
                switchMapSingleObserver.dispose();
            }
            try {
                t tVar = (t) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource");
                switchMapSingleObserver = new SwitchMapSingleObserver(this);
                SwitchMapSingleObserver switchMapSingleObserver2;
                do {
                    switchMapSingleObserver2 = (SwitchMapSingleObserver) this.inner.get();
                    if (switchMapSingleObserver2 == eSi) {
                        break;
                    }
                } while (!this.inner.compareAndSet(switchMapSingleObserver2, switchMapSingleObserver));
                tVar.a(switchMapSingleObserver);
            } catch (Throwable th) {
                a.ad(th);
                this.upstream.cancel();
                this.inner.getAndSet(eSi);
                onError(th);
            }
        }

        public void onError(Throwable th) {
            if (this.errors.ai(th)) {
                if (!this.delayErrors) {
                    bmc();
                }
                this.done = true;
                drain();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        /* Access modifiers changed, original: 0000 */
        public void bmc() {
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) this.inner.getAndSet(eSi);
            if (switchMapSingleObserver != null && switchMapSingleObserver != eSi) {
                switchMapSingleObserver.dispose();
            }
        }

        public void request(long j) {
            io.reactivex.internal.util.b.a(this.requested, j);
            drain();
        }

        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            bmc();
        }

        /* Access modifiers changed, original: 0000 */
        public void a(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
            if (this.inner.compareAndSet(switchMapSingleObserver, null) && this.errors.ai(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    bmc();
                }
                drain();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference atomicReference = this.inner;
                AtomicLong atomicLong = this.requested;
                long j = this.emitted;
                int i = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() == null || this.delayErrors) {
                        boolean z = this.done;
                        SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                        Object obj = switchMapSingleObserver == null ? 1 : null;
                        if (z && obj != null) {
                            Throwable bmB = atomicThrowable.bmB();
                            if (bmB != null) {
                                cVar.onError(bmB);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        } else if (obj != null || switchMapSingleObserver.item == null || j == atomicLong.get()) {
                            this.emitted = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(switchMapSingleObserver, null);
                            cVar.onNext(switchMapSingleObserver.item);
                            j++;
                        }
                    } else {
                        cVar.onError(atomicThrowable.bmB());
                        return;
                    }
                }
            }
        }
    }

    public FlowableSwitchMapSingle(e<T> eVar, g<? super T, ? extends t<? extends R>> gVar, boolean z) {
        this.eRc = eVar;
        this.mapper = gVar;
        this.delayErrors = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super R> cVar) {
        this.eRc.a(new SwitchMapSingleSubscriber(cVar, this.mapper, this.delayErrors));
    }
}
