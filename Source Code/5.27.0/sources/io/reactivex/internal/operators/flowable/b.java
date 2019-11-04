package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.e;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.h;
import io.reactivex.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

/* compiled from: FlowableBufferTimed */
public final class b<T, U extends Collection<? super T>> extends a<T, U> {
    final long eRd;
    final long eRe;
    final Callable<U> eRf;
    final boolean eRg;
    final int maxSize;
    final o scheduler;
    final TimeUnit unit;

    /* compiled from: FlowableBufferTimed */
    static final class a<T, U extends Collection<? super T>> extends e<T, U, U> implements io.reactivex.disposables.b, Runnable, d {
        final io.reactivex.o.c eQl;
        final long eRd;
        final Callable<U> eRf;
        final boolean eRg;
        U eRh;
        long eRi;
        long eRj;
        final int maxSize;
        io.reactivex.disposables.b timer;
        final TimeUnit unit;
        d upstream;

        a(org.a.c<? super U> cVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, io.reactivex.o.c cVar2) {
            super(cVar, new MpscLinkedQueue());
            this.eRf = callable;
            this.eRd = j;
            this.unit = timeUnit;
            this.maxSize = i;
            this.eRg = z;
            this.eQl = cVar2;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.eRh = (Collection) io.reactivex.internal.a.b.requireNonNull(this.eRf.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    io.reactivex.o.c cVar = this.eQl;
                    long j = this.eRd;
                    this.timer = cVar.d(this, j, j, this.unit);
                    dVar.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.eQl.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        /* JADX WARNING: Missing block: B:13:0x0021, code skipped:
            if (r7.eRg == false) goto L_0x0028;
     */
        /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            r7.timer.dispose();
     */
        /* JADX WARNING: Missing block: B:15:0x0028, code skipped:
            b(r0, false, r7);
     */
        /* JADX WARNING: Missing block: B:17:?, code skipped:
            r8 = (java.util.Collection) io.reactivex.internal.a.b.requireNonNull(r7.eRf.call(), "The supplied buffer is null");
     */
        /* JADX WARNING: Missing block: B:18:0x003a, code skipped:
            monitor-enter(r7);
     */
        /* JADX WARNING: Missing block: B:20:?, code skipped:
            r7.eRh = r8;
            r7.eRj++;
     */
        /* JADX WARNING: Missing block: B:21:0x0042, code skipped:
            monitor-exit(r7);
     */
        /* JADX WARNING: Missing block: B:23:0x0045, code skipped:
            if (r7.eRg == false) goto L_0x0055;
     */
        /* JADX WARNING: Missing block: B:24:0x0047, code skipped:
            r0 = r7.eQl;
            r4 = r7.eRd;
            r7.timer = r0.d(r7, r4, r4, r7.unit);
     */
        /* JADX WARNING: Missing block: B:25:0x0055, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:30:0x0059, code skipped:
            r8 = move-exception;
     */
        /* JADX WARNING: Missing block: B:31:0x005a, code skipped:
            io.reactivex.exceptions.a.ad(r8);
            cancel();
            r7.downstream.onError(r8);
     */
        /* JADX WARNING: Missing block: B:32:0x0065, code skipped:
            return;
     */
        public void onNext(T r8) {
            /*
            r7 = this;
            monitor-enter(r7);
            r0 = r7.eRh;	 Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r7);	 Catch:{ all -> 0x0066 }
            return;
        L_0x0007:
            r0.add(r8);	 Catch:{ all -> 0x0066 }
            r8 = r0.size();	 Catch:{ all -> 0x0066 }
            r1 = r7.maxSize;	 Catch:{ all -> 0x0066 }
            if (r8 >= r1) goto L_0x0014;
        L_0x0012:
            monitor-exit(r7);	 Catch:{ all -> 0x0066 }
            return;
        L_0x0014:
            r8 = 0;
            r7.eRh = r8;	 Catch:{ all -> 0x0066 }
            r1 = r7.eRi;	 Catch:{ all -> 0x0066 }
            r3 = 1;
            r1 = r1 + r3;
            r7.eRi = r1;	 Catch:{ all -> 0x0066 }
            monitor-exit(r7);	 Catch:{ all -> 0x0066 }
            r8 = r7.eRg;
            if (r8 == 0) goto L_0x0028;
        L_0x0023:
            r8 = r7.timer;
            r8.dispose();
        L_0x0028:
            r8 = 0;
            r7.b(r0, r8, r7);
            r8 = r7.eRf;	 Catch:{ Throwable -> 0x0059 }
            r8 = r8.call();	 Catch:{ Throwable -> 0x0059 }
            r0 = "The supplied buffer is null";
            r8 = io.reactivex.internal.a.b.requireNonNull(r8, r0);	 Catch:{ Throwable -> 0x0059 }
            r8 = (java.util.Collection) r8;	 Catch:{ Throwable -> 0x0059 }
            monitor-enter(r7);
            r7.eRh = r8;	 Catch:{ all -> 0x0056 }
            r0 = r7.eRj;	 Catch:{ all -> 0x0056 }
            r0 = r0 + r3;
            r7.eRj = r0;	 Catch:{ all -> 0x0056 }
            monitor-exit(r7);	 Catch:{ all -> 0x0056 }
            r8 = r7.eRg;
            if (r8 == 0) goto L_0x0055;
        L_0x0047:
            r0 = r7.eQl;
            r4 = r7.eRd;
            r6 = r7.unit;
            r1 = r7;
            r2 = r4;
            r8 = r0.d(r1, r2, r4, r6);
            r7.timer = r8;
        L_0x0055:
            return;
        L_0x0056:
            r8 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x0056 }
            throw r8;
        L_0x0059:
            r8 = move-exception;
            io.reactivex.exceptions.a.ad(r8);
            r7.cancel();
            r0 = r7.downstream;
            r0.onError(r8);
            return;
        L_0x0066:
            r8 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x0066 }
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.b$a.onNext(java.lang.Object):void");
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.eRh = null;
            }
            this.downstream.onError(th);
            this.eQl.dispose();
        }

        public void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.eRh;
                this.eRh = null;
            }
            this.queue.offer(collection);
            this.done = true;
            if (bmw()) {
                h.a(this.queue, this.downstream, false, this, this);
            }
            this.eQl.dispose();
        }

        public boolean a(org.a.c<? super U> cVar, U u) {
            cVar.onNext(u);
            return true;
        }

        public void request(long j) {
            db(j);
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                dispose();
            }
        }

        public void dispose() {
            synchronized (this) {
                this.eRh = null;
            }
            this.upstream.cancel();
            this.eQl.dispose();
        }

        public boolean isDisposed() {
            return this.eQl.isDisposed();
        }

        public void run() {
            try {
                Collection collection = (Collection) io.reactivex.internal.a.b.requireNonNull(this.eRf.call(), "The supplied buffer is null");
                synchronized (this) {
                    Collection collection2 = this.eRh;
                    if (collection2 != null) {
                        if (this.eRi == this.eRj) {
                            this.eRh = collection;
                            b(collection2, false, this);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                cancel();
                this.downstream.onError(th);
            }
        }
    }

    /* compiled from: FlowableBufferTimed */
    static final class b<T, U extends Collection<? super T>> extends e<T, U, U> implements io.reactivex.disposables.b, Runnable, d {
        final long eRd;
        final Callable<U> eRf;
        U eRh;
        final AtomicReference<io.reactivex.disposables.b> eRk = new AtomicReference();
        final o scheduler;
        final TimeUnit unit;
        d upstream;

        b(org.a.c<? super U> cVar, Callable<U> callable, long j, TimeUnit timeUnit, o oVar) {
            super(cVar, new MpscLinkedQueue());
            this.eRf = callable;
            this.eRd = j;
            this.unit = timeUnit;
            this.scheduler = oVar;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.eRh = (Collection) io.reactivex.internal.a.b.requireNonNull(this.eRf.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        dVar.request(Long.MAX_VALUE);
                        o oVar = this.scheduler;
                        long j = this.eRd;
                        io.reactivex.disposables.b c = oVar.c(this, j, j, this.unit);
                        if (!this.eRk.compareAndSet(null, c)) {
                            c.dispose();
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        public void onNext(T t) {
            synchronized (this) {
                Collection collection = this.eRh;
                if (collection != null) {
                    collection.add(t);
                }
            }
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this.eRk);
            synchronized (this) {
                this.eRh = null;
            }
            this.downstream.onError(th);
        }

        /* JADX WARNING: Missing block: B:9:0x0010, code skipped:
            r4.queue.offer(r0);
            r4.done = true;
     */
        /* JADX WARNING: Missing block: B:10:0x001c, code skipped:
            if (bmw() == false) goto L_0x0026;
     */
        /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            io.reactivex.internal.util.h.a(r4.queue, r4.downstream, false, null, r4);
     */
        /* JADX WARNING: Missing block: B:12:0x0026, code skipped:
            return;
     */
        public void onComplete() {
            /*
            r4 = this;
            r0 = r4.eRk;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0);
            monitor-enter(r4);
            r0 = r4.eRh;	 Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r4);	 Catch:{ all -> 0x0027 }
            return;
        L_0x000c:
            r1 = 0;
            r4.eRh = r1;	 Catch:{ all -> 0x0027 }
            monitor-exit(r4);	 Catch:{ all -> 0x0027 }
            r2 = r4.queue;
            r2.offer(r0);
            r0 = 1;
            r4.done = r0;
            r0 = r4.bmw();
            if (r0 == 0) goto L_0x0026;
        L_0x001e:
            r0 = r4.queue;
            r2 = r4.downstream;
            r3 = 0;
            io.reactivex.internal.util.h.a(r0, r2, r3, r1, r4);
        L_0x0026:
            return;
        L_0x0027:
            r0 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x0027 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.b$b.onComplete():void");
        }

        public void request(long j) {
            db(j);
        }

        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            DisposableHelper.dispose(this.eRk);
        }

        public void run() {
            try {
                Collection collection = (Collection) io.reactivex.internal.a.b.requireNonNull(this.eRf.call(), "The supplied buffer is null");
                synchronized (this) {
                    Collection collection2 = this.eRh;
                    if (collection2 == null) {
                        return;
                    }
                    this.eRh = collection;
                    a(collection2, false, this);
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.ad(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        public boolean a(org.a.c<? super U> cVar, U u) {
            this.downstream.onNext(u);
            return true;
        }

        public void dispose() {
            cancel();
        }

        public boolean isDisposed() {
            return this.eRk.get() == DisposableHelper.DISPOSED;
        }
    }

    /* compiled from: FlowableBufferTimed */
    static final class c<T, U extends Collection<? super T>> extends e<T, U, U> implements Runnable, d {
        final io.reactivex.o.c eQl;
        final long eRd;
        final long eRe;
        final Callable<U> eRf;
        final List<U> eRl = new LinkedList();
        final TimeUnit unit;
        d upstream;

        /* compiled from: FlowableBufferTimed */
        final class a implements Runnable {
            private final U eRh;

            a(U u) {
                this.eRh = u;
            }

            public void run() {
                synchronized (c.this) {
                    c.this.eRl.remove(this.eRh);
                }
                c cVar = c.this;
                cVar.b(this.eRh, false, cVar.eQl);
            }
        }

        c(org.a.c<? super U> cVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, io.reactivex.o.c cVar2) {
            super(cVar, new MpscLinkedQueue());
            this.eRf = callable;
            this.eRd = j;
            this.eRe = j2;
            this.unit = timeUnit;
            this.eQl = cVar2;
        }

        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    Collection collection = (Collection) io.reactivex.internal.a.b.requireNonNull(this.eRf.call(), "The supplied buffer is null");
                    this.eRl.add(collection);
                    this.downstream.onSubscribe(this);
                    dVar.request(Long.MAX_VALUE);
                    io.reactivex.o.c cVar = this.eQl;
                    long j = this.eRe;
                    cVar.d(this, j, j, this.unit);
                    this.eQl.c(new a(collection), this.eRd, this.unit);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    this.eQl.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        public void onNext(T t) {
            synchronized (this) {
                for (Collection add : this.eRl) {
                    add.add(t);
                }
            }
        }

        public void onError(Throwable th) {
            this.done = true;
            this.eQl.dispose();
            clear();
            this.downstream.onError(th);
        }

        public void onComplete() {
            synchronized (this) {
                ArrayList<Collection> arrayList = new ArrayList(this.eRl);
                this.eRl.clear();
            }
            for (Collection offer : arrayList) {
                this.queue.offer(offer);
            }
            this.done = true;
            if (bmw()) {
                h.a(this.queue, this.downstream, false, this.eQl, this);
            }
        }

        public void request(long j) {
            db(j);
        }

        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.eQl.dispose();
            clear();
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            synchronized (this) {
                this.eRl.clear();
            }
        }

        public void run() {
            if (!this.cancelled) {
                try {
                    Collection collection = (Collection) io.reactivex.internal.a.b.requireNonNull(this.eRf.call(), "The supplied buffer is null");
                    synchronized (this) {
                        if (this.cancelled) {
                            return;
                        }
                        this.eRl.add(collection);
                        this.eQl.c(new a(collection), this.eRd, this.unit);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.ad(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
        }

        public boolean a(org.a.c<? super U> cVar, U u) {
            cVar.onNext(u);
            return true;
        }
    }

    public b(io.reactivex.e<T> eVar, long j, long j2, TimeUnit timeUnit, o oVar, Callable<U> callable, int i, boolean z) {
        super(eVar);
        this.eRd = j;
        this.eRe = j2;
        this.unit = timeUnit;
        this.scheduler = oVar;
        this.eRf = callable;
        this.maxSize = i;
        this.eRg = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.a.c<? super U> cVar) {
        if (this.eRd == this.eRe && this.maxSize == Integer.MAX_VALUE) {
            this.eRc.a(new b(new io.reactivex.e.a(cVar), this.eRf, this.eRd, this.unit, this.scheduler));
            return;
        }
        io.reactivex.o.c blk = this.scheduler.blk();
        if (this.eRd == this.eRe) {
            this.eRc.a(new a(new io.reactivex.e.a(cVar), this.eRf, this.eRd, this.unit, this.maxSize, this.eRg, blk));
        } else {
            this.eRc.a(new c(new io.reactivex.e.a(cVar), this.eRf, this.eRd, this.eRe, this.unit, blk));
        }
    }
}
