package io.reactivex.processors;

import io.reactivex.internal.queue.a;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class UnicastProcessor<T> extends a<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    boolean eUA;
    final AtomicReference<Runnable> eUx;
    final AtomicReference<c<? super T>> eUy;
    final BasicIntQueueSubscription<T> eUz;
    Throwable error;
    final AtomicBoolean once;
    final a<T> queue;
    final AtomicLong requested;

    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.eUA = true;
            return 2;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                b.a(UnicastProcessor.this.requested, j);
                UnicastProcessor.this.drain();
            }
        }

        public void cancel() {
            if (!UnicastProcessor.this.cancelled) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                unicastProcessor.cancelled = true;
                unicastProcessor.bmL();
                if (!UnicastProcessor.this.eUA && UnicastProcessor.this.eUz.getAndIncrement() == 0) {
                    UnicastProcessor.this.queue.clear();
                    UnicastProcessor.this.eUy.lazySet(null);
                }
            }
        }
    }

    public static <T> UnicastProcessor<T> jG(int i) {
        return new UnicastProcessor(i);
    }

    UnicastProcessor(int i) {
        this(i, null, true);
    }

    UnicastProcessor(int i, Runnable runnable, boolean z) {
        this.queue = new a(io.reactivex.internal.a.b.i(i, "capacityHint"));
        this.eUx = new AtomicReference(runnable);
        this.delayError = z;
        this.eUy = new AtomicReference();
        this.once = new AtomicBoolean();
        this.eUz = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    /* Access modifiers changed, original: 0000 */
    public void bmL() {
        Runnable runnable = (Runnable) this.eUx.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(c<? super T> cVar) {
        a aVar = this.queue;
        boolean z = this.delayError ^ 1;
        int i = 1;
        do {
            long j;
            long j2 = this.requested.get();
            long j3 = 0;
            while (j2 != j3) {
                boolean z2 = this.done;
                Object poll = aVar.poll();
                boolean z3 = poll == null;
                j = j3;
                if (!a(z, z2, z3, cVar, aVar)) {
                    if (z3) {
                        break;
                    }
                    cVar.onNext(poll);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            j = j3;
            c<? super T> cVar2 = cVar;
            if (j2 == j) {
                if (a(z, this.done, aVar.isEmpty(), cVar, aVar)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                this.requested.addAndGet(-j);
            }
            i = this.eUz.addAndGet(-i);
        } while (i != 0);
    }

    /* Access modifiers changed, original: 0000 */
    public void d(c<? super T> cVar) {
        a aVar = this.queue;
        int i = 1;
        int i2 = this.delayError ^ 1;
        while (!this.cancelled) {
            boolean z = this.done;
            if (i2 == 0 || !z || this.error == null) {
                cVar.onNext(null);
                if (z) {
                    this.eUy.lazySet(null);
                    Throwable th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    return;
                }
                i = this.eUz.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            aVar.clear();
            this.eUy.lazySet(null);
            cVar.onError(this.error);
            return;
        }
        aVar.clear();
        this.eUy.lazySet(null);
    }

    /* Access modifiers changed, original: 0000 */
    public void drain() {
        if (this.eUz.getAndIncrement() == 0) {
            int i = 1;
            c cVar = (c) this.eUy.get();
            while (cVar == null) {
                i = this.eUz.addAndGet(-i);
                if (i != 0) {
                    cVar = (c) this.eUy.get();
                } else {
                    return;
                }
            }
            if (this.eUA) {
                d(cVar);
            } else {
                c(cVar);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(boolean z, boolean z2, boolean z3, c<? super T> cVar, a<T> aVar) {
        if (this.cancelled) {
            aVar.clear();
            this.eUy.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.error != null) {
                aVar.clear();
                this.eUy.lazySet(null);
                cVar.onError(this.error);
                return true;
            } else if (z3) {
                Throwable th = this.error;
                this.eUy.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    public void onSubscribe(d dVar) {
        if (this.done || this.cancelled) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    public void onNext(T t) {
        io.reactivex.internal.a.b.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.cancelled) {
            this.queue.offer(t);
            drain();
        }
    }

    public void onError(Throwable th) {
        io.reactivex.internal.a.b.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            io.reactivex.c.a.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        bmL();
        drain();
    }

    public void onComplete() {
        if (!this.done && !this.cancelled) {
            this.done = true;
            bmL();
            drain();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.eUz);
        this.eUy.set(cVar);
        if (this.cancelled) {
            this.eUy.lazySet(null);
        } else {
            drain();
        }
    }
}
