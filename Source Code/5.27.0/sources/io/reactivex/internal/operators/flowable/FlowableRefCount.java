package io.reactivex.internal.operators.flowable;

import io.reactivex.a.a;
import io.reactivex.b.f;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class FlowableRefCount<T> extends e<T> {
    RefConnection connection;
    final a<T> eRP;
    final int n;
    final o scheduler;
    final long timeout;
    final TimeUnit unit;

    static final class RefConnection extends AtomicReference<b> implements f<b>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final FlowableRefCount<?> parent;
        long subscriberCount;
        b timer;

        RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
        }

        public void run() {
            this.parent.c(this);
        }

        /* renamed from: c */
        public void accept(b bVar) {
            DisposableHelper.replace(this, bVar);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((c) this.parent.eRP).i(bVar);
                }
            }
        }
    }

    static final class RefCountSubscriber<T> extends AtomicBoolean implements h<T>, d {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final org.a.c<? super T> downstream;
        final FlowableRefCount<T> parent;
        d upstream;

        RefCountSubscriber(org.a.c<? super T> cVar, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = cVar;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.b(this.connection);
                this.downstream.onError(th);
                return;
            }
            io.reactivex.c.a.onError(th);
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.b(this.connection);
                this.downstream.onComplete();
            }
        }

        public void request(long j) {
            this.upstream.request(j);
        }

        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.a(this.connection);
            }
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public FlowableRefCount(a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, io.reactivex.d.a.bmN());
    }

    public FlowableRefCount(a<T> aVar, int i, long j, TimeUnit timeUnit, o oVar) {
        this.eRP = aVar;
        this.n = i;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = oVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.a.c<? super T> cVar) {
        RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.connection;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.connection = refConnection;
            }
            long j = refConnection.subscriberCount;
            if (j == 0 && refConnection.timer != null) {
                refConnection.timer.dispose();
            }
            j++;
            refConnection.subscriberCount = j;
            z = true;
            if (refConnection.connected || j != ((long) this.n)) {
                z = false;
            } else {
                refConnection.connected = true;
            }
        }
        this.eRP.a((h) new RefCountSubscriber(cVar, this, refConnection));
        if (z) {
            this.eRP.j(refConnection);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:25:0x0040, code skipped:
            return;
     */
    public void a(io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.connection;	 Catch:{ all -> 0x0041 }
        if (r0 == 0) goto L_0x003f;
    L_0x0005:
        r0 = r5.connection;	 Catch:{ all -> 0x0041 }
        if (r0 == r6) goto L_0x000a;
    L_0x0009:
        goto L_0x003f;
    L_0x000a:
        r0 = r6.subscriberCount;	 Catch:{ all -> 0x0041 }
        r2 = 1;
        r0 = r0 - r2;
        r6.subscriberCount = r0;	 Catch:{ all -> 0x0041 }
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x003d;
    L_0x0017:
        r0 = r6.connected;	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x003d;
    L_0x001c:
        r0 = r5.timeout;	 Catch:{ all -> 0x0041 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0027;
    L_0x0022:
        r5.c(r6);	 Catch:{ all -> 0x0041 }
        monitor-exit(r5);	 Catch:{ all -> 0x0041 }
        return;
    L_0x0027:
        r0 = new io.reactivex.internal.disposables.SequentialDisposable;	 Catch:{ all -> 0x0041 }
        r0.<init>();	 Catch:{ all -> 0x0041 }
        r6.timer = r0;	 Catch:{ all -> 0x0041 }
        monitor-exit(r5);	 Catch:{ all -> 0x0041 }
        r1 = r5.scheduler;
        r2 = r5.timeout;
        r4 = r5.unit;
        r6 = r1.b(r6, r2, r4);
        r0.j(r6);
        return;
    L_0x003d:
        monitor-exit(r5);	 Catch:{ all -> 0x0041 }
        return;
    L_0x003f:
        monitor-exit(r5);	 Catch:{ all -> 0x0041 }
        return;
    L_0x0041:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0041 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRefCount.a(io.reactivex.internal.operators.flowable.FlowableRefCount$RefConnection):void");
    }

    /* Access modifiers changed, original: 0000 */
    public void b(RefConnection refConnection) {
        synchronized (this) {
            if (this.connection != null && this.connection == refConnection) {
                this.connection = null;
                if (refConnection.timer != null) {
                    refConnection.timer.dispose();
                }
            }
            long j = refConnection.subscriberCount - 1;
            refConnection.subscriberCount = j;
            if (j == 0) {
                if (this.eRP instanceof b) {
                    ((b) this.eRP).dispose();
                } else if (this.eRP instanceof c) {
                    ((c) this.eRP).i((b) refConnection.get());
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                this.connection = null;
                b bVar = (b) refConnection.get();
                DisposableHelper.dispose(refConnection);
                if (this.eRP instanceof b) {
                    ((b) this.eRP).dispose();
                } else if (this.eRP instanceof c) {
                    if (bVar == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((c) this.eRP).i(bVar);
                    }
                }
            }
        }
    }
}
