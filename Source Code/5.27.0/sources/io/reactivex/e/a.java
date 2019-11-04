package io.reactivex.e;

import io.reactivex.h;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import org.a.c;
import org.a.d;

/* compiled from: SerializedSubscriber */
public final class a<T> implements h<T>, d {
    final boolean delayError;
    volatile boolean done;
    final c<? super T> downstream;
    boolean emitting;
    io.reactivex.internal.util.a<Object> queue;
    d upstream;

    public a(c<? super T> cVar) {
        this(cVar, false);
    }

    public a(c<? super T> cVar, boolean z) {
        this.downstream = cVar;
        this.delayError = z;
    }

    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    public void onNext(T t) {
        if (!this.done) {
            if (t == null) {
                this.upstream.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (this.done) {
                } else if (this.emitting) {
                    io.reactivex.internal.util.a aVar = this.queue;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a(4);
                        this.queue = aVar;
                    }
                    aVar.add(NotificationLite.next(t));
                } else {
                    this.emitting = true;
                    this.downstream.onNext(t);
                    bmI();
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x0031, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:0x0038, code skipped:
            if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:23:0x003a, code skipped:
            io.reactivex.c.a.onError(r3);
     */
    /* JADX WARNING: Missing block: B:24:0x003d, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:25:0x003e, code skipped:
            r2.downstream.onError(r3);
     */
    /* JADX WARNING: Missing block: B:26:0x0043, code skipped:
            return;
     */
    public void onError(java.lang.Throwable r3) {
        /*
        r2 = this;
        r0 = r2.done;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        io.reactivex.c.a.onError(r3);
        return;
    L_0x0008:
        monitor-enter(r2);
        r0 = r2.done;	 Catch:{ all -> 0x0044 }
        r1 = 1;
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0037;
    L_0x000f:
        r0 = r2.emitting;	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x0032;
    L_0x0013:
        r2.done = r1;	 Catch:{ all -> 0x0044 }
        r0 = r2.queue;	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0021;
    L_0x0019:
        r0 = new io.reactivex.internal.util.a;	 Catch:{ all -> 0x0044 }
        r1 = 4;
        r0.<init>(r1);	 Catch:{ all -> 0x0044 }
        r2.queue = r0;	 Catch:{ all -> 0x0044 }
    L_0x0021:
        r3 = io.reactivex.internal.util.NotificationLite.error(r3);	 Catch:{ all -> 0x0044 }
        r1 = r2.delayError;	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x002d;
    L_0x0029:
        r0.add(r3);	 Catch:{ all -> 0x0044 }
        goto L_0x0030;
    L_0x002d:
        r0.cW(r3);	 Catch:{ all -> 0x0044 }
    L_0x0030:
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0032:
        r2.done = r1;	 Catch:{ all -> 0x0044 }
        r2.emitting = r1;	 Catch:{ all -> 0x0044 }
        r1 = 0;
    L_0x0037:
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x003e;
    L_0x003a:
        io.reactivex.c.a.onError(r3);
        return;
    L_0x003e:
        r0 = r2.downstream;
        r0.onError(r3);
        return;
    L_0x0044:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.e.a.onError(java.lang.Throwable):void");
    }

    public void onComplete() {
        if (!this.done) {
            synchronized (this) {
                if (this.done) {
                } else if (this.emitting) {
                    io.reactivex.internal.util.a aVar = this.queue;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a(4);
                        this.queue = aVar;
                    }
                    aVar.add(NotificationLite.complete());
                } else {
                    this.done = true;
                    this.emitting = true;
                    this.downstream.onComplete();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bmI() {
        io.reactivex.internal.util.a aVar;
        do {
            synchronized (this) {
                aVar = this.queue;
                if (aVar == null) {
                    this.emitting = false;
                    return;
                }
                this.queue = null;
            }
        } while (!aVar.b(this.downstream));
    }

    public void request(long j) {
        this.upstream.request(j);
    }

    public void cancel() {
        this.upstream.cancel();
    }
}
