package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.r;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class FlowableFlatMapSingle<T, R> extends a<T, R> {
    final boolean delayErrors;
    final g<? super T, ? extends t<? extends R>> mapper;
    final int maxConcurrency;

    static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements h<T>, d {
        private static final long serialVersionUID = 8600231336733376951L;
        final AtomicInteger active = new AtomicInteger(1);
        volatile boolean cancelled;
        final boolean delayErrors;
        final c<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final g<? super T, ? extends t<? extends R>> mapper;
        final int maxConcurrency;
        final AtomicReference<a<R>> queue = new AtomicReference();
        final AtomicLong requested = new AtomicLong();
        final io.reactivex.disposables.a set = new io.reactivex.disposables.a();
        d upstream;

        final class InnerObserver extends AtomicReference<b> implements b, r<R> {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            public void d(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            public void onSuccess(R r) {
                FlatMapSingleSubscriber.this.a(this, (Object) r);
            }

            public void onError(Throwable th) {
                FlatMapSingleSubscriber.this.a(this, th);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((b) get());
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }

        FlatMapSingleSubscriber(c<? super R> cVar, g<? super T, ? extends t<? extends R>> gVar, boolean z, int i) {
            this.downstream = cVar;
            this.mapper = gVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    dVar.request(Long.MAX_VALUE);
                } else {
                    dVar.request((long) i);
                }
            }
        }

        public void onNext(T t) {
            try {
                t tVar = (t) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.cancelled && this.set.e(innerObserver)) {
                    tVar.a(innerObserver);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.ai(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                drain();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.b.a(this.requested, j);
                drain();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void a(InnerObserver innerObserver, R r) {
            a blM;
            this.set.g(innerObserver);
            if (get() == 0) {
                int i = 1;
                if (compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() != 0) {
                        i = 0;
                    }
                    if (this.requested.get() != 0) {
                        this.downstream.onNext(r);
                        a aVar = (a) this.queue.get();
                        if (i == 0 || !(aVar == null || aVar.isEmpty())) {
                            io.reactivex.internal.util.b.c(this.requested, 1);
                            if (this.maxConcurrency != Integer.MAX_VALUE) {
                                this.upstream.request(1);
                            }
                        } else {
                            Throwable bmB = this.errors.bmB();
                            if (bmB != null) {
                                this.downstream.onError(bmB);
                            } else {
                                this.downstream.onComplete();
                            }
                            return;
                        }
                    }
                    blM = blM();
                    synchronized (blM) {
                        blM.offer(r);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    blI();
                }
            }
            blM = blM();
            synchronized (blM) {
                blM.offer(r);
            }
            this.active.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            blI();
        }

        /* Access modifiers changed, original: 0000 */
        public a<R> blM() {
            a aVar;
            do {
                aVar = (a) this.queue.get();
                if (aVar != null) {
                    return aVar;
                }
                aVar = new a(e.bkP());
            } while (!this.queue.compareAndSet(null, aVar));
            return aVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(InnerObserver innerObserver, Throwable th) {
            this.set.g(innerObserver);
            if (this.errors.ai(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    this.set.dispose();
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1);
                }
                this.active.decrementAndGet();
                drain();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        /* Access modifiers changed, original: 0000 */
        public void drain() {
            if (getAndIncrement() == 0) {
                blI();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            a aVar = (a) this.queue.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void blI() {
            c cVar = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference atomicReference = this.queue;
            int i = 1;
            do {
                Object obj;
                Throwable bmB;
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    obj = null;
                    if (j2 == j) {
                        break;
                    } else if (this.cancelled) {
                        clear();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        Object obj2 = atomicInteger.get() == 0 ? 1 : null;
                        a aVar = (a) atomicReference.get();
                        Object poll = aVar != null ? aVar.poll() : null;
                        Object obj3 = poll == null ? 1 : null;
                        if (obj2 != null && obj3 != null) {
                            bmB = this.errors.bmB();
                            if (bmB != null) {
                                cVar.onError(bmB);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        } else if (obj3 != null) {
                            break;
                        } else {
                            cVar.onNext(poll);
                            j2++;
                        }
                    } else {
                        bmB = this.errors.bmB();
                        clear();
                        cVar.onError(bmB);
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        clear();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        Object obj4 = atomicInteger.get() == 0 ? 1 : null;
                        a aVar2 = (a) atomicReference.get();
                        if (aVar2 == null || aVar2.isEmpty()) {
                            obj = 1;
                        }
                        if (!(obj4 == null || obj == null)) {
                            bmB = this.errors.bmB();
                            if (bmB != null) {
                                cVar.onError(bmB);
                            } else {
                                cVar.onComplete();
                            }
                            return;
                        }
                    } else {
                        bmB = this.errors.bmB();
                        clear();
                        cVar.onError(bmB);
                        return;
                    }
                }
                if (j2 != 0) {
                    io.reactivex.internal.util.b.c(this.requested, j2);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(j2);
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    public FlowableFlatMapSingle(e<T> eVar, g<? super T, ? extends t<? extends R>> gVar, boolean z, int i) {
        super(eVar);
        this.mapper = gVar;
        this.delayErrors = z;
        this.maxConcurrency = i;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super R> cVar) {
        this.eRc.a(new FlatMapSingleSubscriber(cVar, this.mapper, this.delayErrors, this.maxConcurrency));
    }
}
