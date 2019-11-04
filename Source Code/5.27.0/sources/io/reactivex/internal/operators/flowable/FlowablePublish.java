package io.reactivex.internal.operators.flowable;

import io.reactivex.b.f;
import io.reactivex.e;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.h;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class FlowablePublish<T> extends io.reactivex.a.a<T> {
    final int bufferSize;
    final AtomicReference<PublishSubscriber<T>> current;
    final b<T> eRL;
    final e<T> eRc;

    static final class InnerSubscriber<T> extends AtomicLong implements d {
        private static final long serialVersionUID = -4453897557930727610L;
        final c<? super T> child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        InnerSubscriber(c<? super T> cVar) {
            this.child = cVar;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.b.b(this, j);
                PublishSubscriber publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.dispatch();
                }
            }
        }

        public void cancel() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                PublishSubscriber publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.b(this);
                    publishSubscriber.dispatch();
                }
            }
        }
    }

    static final class a<T> implements b<T> {
        private final int bufferSize;
        private final AtomicReference<PublishSubscriber<T>> eRM;

        a(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.eRM = atomicReference;
            this.bufferSize = i;
        }

        public void subscribe(c<? super T> cVar) {
            PublishSubscriber publishSubscriber;
            InnerSubscriber innerSubscriber = new InnerSubscriber(cVar);
            cVar.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = (PublishSubscriber) this.eRM.get();
                if (publishSubscriber == null || publishSubscriber.isDisposed()) {
                    PublishSubscriber publishSubscriber2 = new PublishSubscriber(this.eRM, this.bufferSize);
                    if (this.eRM.compareAndSet(publishSubscriber, publishSubscriber2)) {
                        publishSubscriber = publishSubscriber2;
                    }
                }
                if (publishSubscriber.a(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.b(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.dispatch();
        }
    }

    static final class PublishSubscriber<T> extends AtomicInteger implements io.reactivex.disposables.b, h<T> {
        static final InnerSubscriber[] eRN = new InnerSubscriber[0];
        static final InnerSubscriber[] eRO = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile io.reactivex.internal.b.h<T> queue;
        final AtomicBoolean shouldConnect;
        int sourceMode;
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference(eRN);
        volatile Object terminalEvent;
        final AtomicReference<d> upstream = new AtomicReference();

        PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.current = atomicReference;
            this.shouldConnect = new AtomicBoolean();
            this.bufferSize = i;
        }

        public void dispose() {
            Object obj = this.subscribers.get();
            Object obj2 = eRO;
            if (obj != obj2 && ((InnerSubscriber[]) this.subscribers.getAndSet(obj2)) != eRO) {
                this.current.compareAndSet(this, null);
                SubscriptionHelper.cancel(this.upstream);
            }
        }

        public boolean isDisposed() {
            return this.subscribers.get() == eRO;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                if (dVar instanceof io.reactivex.internal.b.e) {
                    io.reactivex.internal.b.e eVar = (io.reactivex.internal.b.e) dVar;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = eVar;
                        this.terminalEvent = NotificationLite.complete();
                        dispatch();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = eVar;
                        dVar.request((long) this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                dVar.request((long) this.bufferSize);
            }
        }

        public void onNext(T t) {
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                dispatch();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        public void onError(Throwable th) {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.error(th);
                dispatch();
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void onComplete() {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.complete();
                dispatch();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                if (innerSubscriberArr == eRO) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public void b(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            Object obj;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    break;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (innerSubscriberArr[i2].equals(innerSubscriber)) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = eRN;
                    } else {
                        Object obj2 = new InnerSubscriber[(length - 1)];
                        System.arraycopy(innerSubscriberArr, 0, obj2, 0, i);
                        System.arraycopy(innerSubscriberArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, obj));
        }

        /* Access modifiers changed, original: 0000 */
        public boolean i(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    this.current.compareAndSet(this, null);
                    InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.getAndSet(eRO);
                    if (innerSubscriberArr.length != 0) {
                        int length = innerSubscriberArr.length;
                        while (i < length) {
                            innerSubscriberArr[i].child.onError(error);
                            i++;
                        }
                    } else {
                        io.reactivex.c.a.onError(error);
                    }
                    return true;
                } else if (z) {
                    this.current.compareAndSet(this, null);
                    InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) this.subscribers.getAndSet(eRO);
                    int length2 = innerSubscriberArr2.length;
                    while (i < length2) {
                        innerSubscriberArr2[i].child.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Missing block: B:75:0x013d, code skipped:
            if (r8 == 0) goto L_0x0150;
     */
        /* JADX WARNING: Missing block: B:77:0x0142, code skipped:
            if (r1.sourceMode == 1) goto L_0x0151;
     */
        /* JADX WARNING: Missing block: B:78:0x0144, code skipped:
            ((org.a.d) r1.upstream.get()).request(r11);
     */
        /* JADX WARNING: Missing block: B:81:0x0155, code skipped:
            if (r14 == 0) goto L_0x015b;
     */
        /* JADX WARNING: Missing block: B:82:0x0157, code skipped:
            if (r0 != false) goto L_0x015b;
     */
        /* JADX WARNING: Missing block: B:96:0x016a, code skipped:
            continue;
     */
        public void dispatch() {
            /*
            r25 = this;
            r1 = r25;
            r0 = r25.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r2 = r1.subscribers;
            r0 = r2.get();
            r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0;
            r3 = 1;
            r4 = r0;
            r5 = 1;
        L_0x0014:
            r0 = r1.terminalEvent;
            r6 = r1.queue;
            if (r6 == 0) goto L_0x0023;
        L_0x001a:
            r8 = r6.isEmpty();
            if (r8 == 0) goto L_0x0021;
        L_0x0020:
            goto L_0x0023;
        L_0x0021:
            r8 = 0;
            goto L_0x0024;
        L_0x0023:
            r8 = 1;
        L_0x0024:
            r0 = r1.i(r0, r8);
            if (r0 == 0) goto L_0x002b;
        L_0x002a:
            return;
        L_0x002b:
            if (r8 != 0) goto L_0x015a;
        L_0x002d:
            r0 = r4.length;
            r9 = r4.length;
            r12 = 0;
            r13 = 0;
            r14 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        L_0x0036:
            r16 = -9223372036854775808;
            if (r12 >= r9) goto L_0x0053;
        L_0x003a:
            r7 = r4[r12];
            r18 = r7.get();
            r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1));
            if (r20 == 0) goto L_0x004e;
        L_0x0044:
            r10 = r7.emitted;
            r10 = r18 - r10;
            r10 = java.lang.Math.min(r14, r10);
            r14 = r10;
            goto L_0x0050;
        L_0x004e:
            r13 = r13 + 1;
        L_0x0050:
            r12 = r12 + 1;
            goto L_0x0036;
        L_0x0053:
            r9 = 1;
            if (r0 != r13) goto L_0x0093;
        L_0x0057:
            r0 = r1.terminalEvent;
            r7 = r6.poll();	 Catch:{ Throwable -> 0x005e }
            goto L_0x0075;
        L_0x005e:
            r0 = move-exception;
            r6 = r0;
            io.reactivex.exceptions.a.ad(r6);
            r0 = r1.upstream;
            r0 = r0.get();
            r0 = (org.a.d) r0;
            r0.cancel();
            r0 = io.reactivex.internal.util.NotificationLite.error(r6);
            r1.terminalEvent = r0;
            r7 = 0;
        L_0x0075:
            if (r7 != 0) goto L_0x0079;
        L_0x0077:
            r6 = 1;
            goto L_0x007a;
        L_0x0079:
            r6 = 0;
        L_0x007a:
            r0 = r1.i(r0, r6);
            if (r0 == 0) goto L_0x0081;
        L_0x0080:
            return;
        L_0x0081:
            r0 = r1.sourceMode;
            if (r0 == r3) goto L_0x0090;
        L_0x0085:
            r0 = r1.upstream;
            r0 = r0.get();
            r0 = (org.a.d) r0;
            r0.request(r9);
        L_0x0090:
            r6 = 1;
            goto L_0x0159;
        L_0x0093:
            r0 = r8;
            r8 = 0;
        L_0x0095:
            r11 = (long) r8;
            r13 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
            if (r13 >= 0) goto L_0x013d;
        L_0x009a:
            r0 = r1.terminalEvent;
            r13 = r6.poll();	 Catch:{ Throwable -> 0x00a1 }
            goto L_0x00b8;
        L_0x00a1:
            r0 = move-exception;
            r13 = r0;
            io.reactivex.exceptions.a.ad(r13);
            r0 = r1.upstream;
            r0 = r0.get();
            r0 = (org.a.d) r0;
            r0.cancel();
            r0 = io.reactivex.internal.util.NotificationLite.error(r13);
            r1.terminalEvent = r0;
            r13 = 0;
        L_0x00b8:
            if (r13 != 0) goto L_0x00bc;
        L_0x00ba:
            r7 = 1;
            goto L_0x00bd;
        L_0x00bc:
            r7 = 0;
        L_0x00bd:
            r0 = r1.i(r0, r7);
            if (r0 == 0) goto L_0x00c4;
        L_0x00c3:
            return;
        L_0x00c4:
            if (r7 == 0) goto L_0x00c9;
        L_0x00c6:
            r0 = r7;
            goto L_0x013d;
        L_0x00c9:
            r0 = io.reactivex.internal.util.NotificationLite.getValue(r13);
            r11 = r4.length;
            r12 = 0;
            r13 = 0;
        L_0x00d0:
            if (r12 >= r11) goto L_0x010b;
        L_0x00d2:
            r3 = r4[r12];
            r22 = r3.get();
            r24 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1));
            if (r24 == 0) goto L_0x00f9;
        L_0x00dc:
            r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r24 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1));
            if (r24 == 0) goto L_0x00ef;
        L_0x00e5:
            r22 = r6;
            r23 = r7;
            r6 = r3.emitted;
            r6 = r6 + r9;
            r3.emitted = r6;
            goto L_0x00f3;
        L_0x00ef:
            r22 = r6;
            r23 = r7;
        L_0x00f3:
            r3 = r3.child;
            r3.onNext(r0);
            goto L_0x0103;
        L_0x00f9:
            r22 = r6;
            r23 = r7;
            r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r13 = 1;
        L_0x0103:
            r12 = r12 + 1;
            r6 = r22;
            r7 = r23;
            r3 = 1;
            goto L_0x00d0;
        L_0x010b:
            r22 = r6;
            r23 = r7;
            r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r8 = r8 + 1;
            r0 = r2.get();
            r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0;
            if (r13 != 0) goto L_0x0128;
        L_0x011e:
            if (r0 == r4) goto L_0x0121;
        L_0x0120:
            goto L_0x0128;
        L_0x0121:
            r6 = r22;
            r0 = r23;
            r3 = 1;
            goto L_0x0095;
        L_0x0128:
            if (r8 == 0) goto L_0x013b;
        L_0x012a:
            r3 = r1.sourceMode;
            r4 = 1;
            if (r3 == r4) goto L_0x013b;
        L_0x012f:
            r3 = r1.upstream;
            r3 = r3.get();
            r3 = (org.a.d) r3;
            r6 = (long) r8;
            r3.request(r6);
        L_0x013b:
            r4 = r0;
            goto L_0x016a;
        L_0x013d:
            if (r8 == 0) goto L_0x0150;
        L_0x013f:
            r3 = r1.sourceMode;
            r6 = 1;
            if (r3 == r6) goto L_0x0151;
        L_0x0144:
            r3 = r1.upstream;
            r3 = r3.get();
            r3 = (org.a.d) r3;
            r3.request(r11);
            goto L_0x0151;
        L_0x0150:
            r6 = 1;
        L_0x0151:
            r7 = 0;
            r3 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1));
            if (r3 == 0) goto L_0x015b;
        L_0x0157:
            if (r0 != 0) goto L_0x015b;
        L_0x0159:
            goto L_0x016a;
        L_0x015a:
            r6 = 1;
        L_0x015b:
            r0 = -r5;
            r5 = r1.addAndGet(r0);
            if (r5 != 0) goto L_0x0163;
        L_0x0162:
            return;
        L_0x0163:
            r0 = r2.get();
            r4 = r0;
            r4 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r4;
        L_0x016a:
            r3 = 1;
            goto L_0x0014;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber.dispatch():void");
        }
    }

    public static <T> io.reactivex.a.a<T> a(e<T> eVar, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.c.a.a(new FlowablePublish(new a(atomicReference, i), eVar, atomicReference, i));
    }

    private FlowablePublish(b<T> bVar, e<T> eVar, AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
        this.eRL = bVar;
        this.eRc = eVar;
        this.current = atomicReference;
        this.bufferSize = i;
    }

    /* Access modifiers changed, original: protected */
    public void a(c<? super T> cVar) {
        this.eRL.subscribe(cVar);
    }

    public void j(f<? super io.reactivex.disposables.b> fVar) {
        h hVar;
        while (true) {
            hVar = (PublishSubscriber) this.current.get();
            if (hVar != null && !hVar.isDisposed()) {
                break;
            }
            PublishSubscriber publishSubscriber = new PublishSubscriber(this.current, this.bufferSize);
            if (this.current.compareAndSet(hVar, publishSubscriber)) {
                hVar = publishSubscriber;
                break;
            }
        }
        boolean z = true;
        if (hVar.shouldConnect.get() || !hVar.shouldConnect.compareAndSet(false, true)) {
            z = false;
        }
        try {
            fVar.accept(hVar);
            if (z) {
                this.eRc.a(hVar);
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.ad(th);
            RuntimeException aj = ExceptionHelper.aj(th);
        }
    }
}
