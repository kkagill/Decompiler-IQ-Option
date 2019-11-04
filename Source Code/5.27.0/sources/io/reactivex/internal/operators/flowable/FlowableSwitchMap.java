package io.reactivex.internal.operators.flowable;

import io.reactivex.b.g;
import io.reactivex.c.a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.h;
import io.reactivex.internal.b.e;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowableSwitchMap<T, R> extends a<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final g<? super T, ? extends b<? extends R>> mapper;

    static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<d> implements h<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile io.reactivex.internal.b.h<R> queue;

        SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.parent = switchMapSubscriber;
            this.index = j;
            this.bufferSize = i;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = eVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = eVar;
                        dVar.request((long) this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                dVar.request((long) this.bufferSize);
            }
        }

        public void onNext(R r) {
            SwitchMapSubscriber switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode != 0 || this.queue.offer(r)) {
                    switchMapSubscriber.drain();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        public void onError(Throwable th) {
            SwitchMapSubscriber switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique && switchMapSubscriber.error.ai(th)) {
                if (!switchMapSubscriber.delayErrors) {
                    switchMapSubscriber.upstream.cancel();
                }
                this.done = true;
                switchMapSubscriber.drain();
                return;
            }
            a.onError(th);
        }

        public void onComplete() {
            SwitchMapSubscriber switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
    }

    static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements h<T>, d {
        static final SwitchMapInnerSubscriber<Object, Object> eRY = new SwitchMapInnerSubscriber(null, -1, 1);
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c<? super R> downstream;
        final AtomicThrowable error;
        final g<? super T, ? extends b<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        volatile long unique;
        d upstream;

        static {
            eRY.cancel();
        }

        SwitchMapSubscriber(c<? super R> cVar, g<? super T, ? extends b<? extends R>> gVar, int i, boolean z) {
            this.downstream = cVar;
            this.mapper = gVar;
            this.bufferSize = i;
            this.delayErrors = z;
            this.error = new AtomicThrowable();
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                long j = this.unique + 1;
                this.unique = j;
                SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.get();
                if (switchMapInnerSubscriber != null) {
                    switchMapInnerSubscriber.cancel();
                }
                try {
                    b bVar = (b) io.reactivex.internal.a.b.requireNonNull(this.mapper.apply(t), "The publisher returned is null");
                    switchMapInnerSubscriber = new SwitchMapInnerSubscriber(this, j, this.bufferSize);
                    SwitchMapInnerSubscriber switchMapInnerSubscriber2;
                    do {
                        switchMapInnerSubscriber2 = (SwitchMapInnerSubscriber) this.active.get();
                        if (switchMapInnerSubscriber2 == eRY) {
                            break;
                        }
                    } while (!this.active.compareAndSet(switchMapInnerSubscriber2, switchMapInnerSubscriber));
                    bVar.subscribe(switchMapInnerSubscriber);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done || !this.error.ai(th)) {
                a.onError(th);
                return;
            }
            if (!this.delayErrors) {
                bmc();
            }
            this.done = true;
            drain();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.b.a(this.requested, j);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                bmc();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void bmc() {
            SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.get();
            SwitchMapInnerSubscriber switchMapInnerSubscriber2 = eRY;
            if (switchMapInnerSubscriber != switchMapInnerSubscriber2) {
                switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.getAndSet(switchMapInnerSubscriber2);
                if (switchMapInnerSubscriber != eRY && switchMapInnerSubscriber != null) {
                    switchMapInnerSubscriber.cancel();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Missing block: B:62:0x00e5, code skipped:
            r14 = 1;
     */
        public void drain() {
            /*
            r17 = this;
            r1 = r17;
            r0 = r17.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r2 = r1.downstream;
            r4 = 1;
        L_0x000c:
            r0 = r1.cancelled;
            r5 = 0;
            if (r0 == 0) goto L_0x0017;
        L_0x0011:
            r0 = r1.active;
            r0.lazySet(r5);
            return;
        L_0x0017:
            r0 = r1.done;
            if (r0 == 0) goto L_0x0062;
        L_0x001b:
            r0 = r1.delayErrors;
            if (r0 == 0) goto L_0x003f;
        L_0x001f:
            r0 = r1.active;
            r0 = r0.get();
            if (r0 != 0) goto L_0x0062;
        L_0x0027:
            r0 = r1.error;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x003b;
        L_0x0031:
            r0 = r1.error;
            r0 = r0.bmB();
            r2.onError(r0);
            goto L_0x003e;
        L_0x003b:
            r2.onComplete();
        L_0x003e:
            return;
        L_0x003f:
            r0 = r1.error;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x0056;
        L_0x0049:
            r17.bmc();
            r0 = r1.error;
            r0 = r0.bmB();
            r2.onError(r0);
            return;
        L_0x0056:
            r0 = r1.active;
            r0 = r0.get();
            if (r0 != 0) goto L_0x0062;
        L_0x005e:
            r2.onComplete();
            return;
        L_0x0062:
            r0 = r1.active;
            r0 = r0.get();
            r6 = r0;
            r6 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r6;
            if (r6 == 0) goto L_0x0071;
        L_0x006d:
            r0 = r6.queue;
            r7 = r0;
            goto L_0x0072;
        L_0x0071:
            r7 = r5;
        L_0x0072:
            if (r7 == 0) goto L_0x013f;
        L_0x0074:
            r0 = r6.done;
            if (r0 == 0) goto L_0x00ad;
        L_0x0078:
            r0 = r1.delayErrors;
            if (r0 != 0) goto L_0x00a0;
        L_0x007c:
            r0 = r1.error;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x0093;
        L_0x0086:
            r17.bmc();
            r0 = r1.error;
            r0 = r0.bmB();
            r2.onError(r0);
            return;
        L_0x0093:
            r0 = r7.isEmpty();
            if (r0 == 0) goto L_0x00ad;
        L_0x0099:
            r0 = r1.active;
            r0.compareAndSet(r6, r5);
            goto L_0x000c;
        L_0x00a0:
            r0 = r7.isEmpty();
            if (r0 == 0) goto L_0x00ad;
        L_0x00a6:
            r0 = r1.active;
            r0.compareAndSet(r6, r5);
            goto L_0x000c;
        L_0x00ad:
            r0 = r1.requested;
            r8 = r0.get();
            r10 = 0;
            r12 = r10;
        L_0x00b6:
            r14 = 0;
            r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
            if (r0 == 0) goto L_0x011b;
        L_0x00bb:
            r0 = r1.cancelled;
            if (r0 == 0) goto L_0x00c0;
        L_0x00bf:
            return;
        L_0x00c0:
            r0 = r6.done;
            r15 = r7.poll();	 Catch:{ Throwable -> 0x00c7 }
            goto L_0x00d6;
        L_0x00c7:
            r0 = move-exception;
            r15 = r0;
            io.reactivex.exceptions.a.ad(r15);
            r6.cancel();
            r0 = r1.error;
            r0.ai(r15);
            r15 = r5;
            r0 = 1;
        L_0x00d6:
            if (r15 != 0) goto L_0x00db;
        L_0x00d8:
            r16 = 1;
            goto L_0x00dd;
        L_0x00db:
            r16 = 0;
        L_0x00dd:
            r3 = r1.active;
            r3 = r3.get();
            if (r6 == r3) goto L_0x00e7;
        L_0x00e5:
            r14 = 1;
            goto L_0x011b;
        L_0x00e7:
            if (r0 == 0) goto L_0x0111;
        L_0x00e9:
            r0 = r1.delayErrors;
            if (r0 != 0) goto L_0x0109;
        L_0x00ed:
            r0 = r1.error;
            r0 = r0.get();
            r0 = (java.lang.Throwable) r0;
            if (r0 == 0) goto L_0x0101;
        L_0x00f7:
            r0 = r1.error;
            r0 = r0.bmB();
            r2.onError(r0);
            return;
        L_0x0101:
            if (r16 == 0) goto L_0x0111;
        L_0x0103:
            r0 = r1.active;
            r0.compareAndSet(r6, r5);
            goto L_0x00e5;
        L_0x0109:
            if (r16 == 0) goto L_0x0111;
        L_0x010b:
            r0 = r1.active;
            r0.compareAndSet(r6, r5);
            goto L_0x00e5;
        L_0x0111:
            if (r16 == 0) goto L_0x0114;
        L_0x0113:
            goto L_0x011b;
        L_0x0114:
            r2.onNext(r15);
            r14 = 1;
            r12 = r12 + r14;
            goto L_0x00b6;
        L_0x011b:
            r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
            if (r0 == 0) goto L_0x013b;
        L_0x011f:
            r0 = r1.cancelled;
            if (r0 != 0) goto L_0x013b;
        L_0x0123:
            r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r0 == 0) goto L_0x0132;
        L_0x012c:
            r0 = r1.requested;
            r7 = -r12;
            r0.addAndGet(r7);
        L_0x0132:
            r0 = r6.get();
            r0 = (org.a.d) r0;
            r0.request(r12);
        L_0x013b:
            if (r14 == 0) goto L_0x013f;
        L_0x013d:
            goto L_0x000c;
        L_0x013f:
            r0 = -r4;
            r4 = r1.addAndGet(r0);
            if (r4 != 0) goto L_0x000c;
        L_0x0146:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber.drain():void");
        }
    }

    public FlowableSwitchMap(io.reactivex.e<T> eVar, g<? super T, ? extends b<? extends R>> gVar, int i, boolean z) {
        super(eVar);
        this.mapper = gVar;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super R> cVar) {
        if (!t.a(this.eRc, cVar, this.mapper)) {
            this.eRc.a(new SwitchMapSubscriber(cVar, this.mapper, this.bufferSize, this.delayErrors));
        }
    }
}
