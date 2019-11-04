package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: AbstractFuture */
public abstract class b<V> extends com.google.common.util.concurrent.a.a implements t<V> {
    private static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Object NULL = new Object();
    private static final a ZN;
    private static final Logger log = Logger.getLogger(b.class.getName());
    private volatile d ZO;
    private volatile k ZP;
    private volatile Object value;

    /* compiled from: AbstractFuture */
    private static abstract class a {
        public abstract void a(k kVar, k kVar2);

        public abstract void a(k kVar, Thread thread);

        public abstract boolean a(b<?> bVar, d dVar, d dVar2);

        public abstract boolean a(b<?> bVar, k kVar, k kVar2);

        public abstract boolean a(b<?> bVar, Object obj, Object obj2);

        private a() {
        }
    }

    /* compiled from: AbstractFuture */
    private static final class b {
        static final b ZQ;
        static final b ZR;
        final Throwable cause;
        final boolean wasInterrupted;

        static {
            if (b.GENERATE_CANCELLATION_CAUSES) {
                ZR = null;
                ZQ = null;
                return;
            }
            ZR = new b(false, null);
            ZQ = new b(true, null);
        }

        b(boolean z, Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class c {
        static final c ZS = new c(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
        final Throwable exception;

        c(Throwable th) {
            this.exception = (Throwable) com.google.common.base.i.checkNotNull(th);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class d {
        static final d ZT = new d(null, null);
        d ZU;
        final Executor executor;
        final Runnable task;

        d(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class f<V> implements Runnable {
        final b<V> ZV;
        final t<? extends V> future;

        f(b<V> bVar, t<? extends V> tVar) {
            this.ZV = bVar;
            this.future = tVar;
        }

        public void run() {
            if (this.ZV.value == this) {
                if (b.ZN.a(this.ZV, (Object) this, b.getFutureValue(this.future))) {
                    b.a(this.ZV);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    private static final class k {
        static final k aac = new k(false);
        volatile k aad;
        volatile Thread thread;

        k(boolean z) {
        }

        k() {
            b.ZN.a(this, Thread.currentThread());
        }

        /* Access modifiers changed, original: 0000 */
        public void b(k kVar) {
            b.ZN.a(this, kVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void unpark() {
            Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* compiled from: AbstractFuture */
    private static final class e extends a {
        final AtomicReferenceFieldUpdater<b, d> listenersUpdater;
        final AtomicReferenceFieldUpdater<b, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<k, k> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<k, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<b, k> waitersUpdater;

        e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(k kVar, Thread thread) {
            this.waiterThreadUpdater.lazySet(kVar, thread);
        }

        /* Access modifiers changed, original: 0000 */
        public void a(k kVar, k kVar2) {
            this.waiterNextUpdater.lazySet(kVar, kVar2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, k kVar, k kVar2) {
            return this.waitersUpdater.compareAndSet(bVar, kVar, kVar2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, d dVar, d dVar2) {
            return this.listenersUpdater.compareAndSet(bVar, dVar, dVar2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, Object obj, Object obj2) {
            return this.valueUpdater.compareAndSet(bVar, obj, obj2);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class g extends a {
        private g() {
            super();
        }

        /* Access modifiers changed, original: 0000 */
        public void a(k kVar, Thread thread) {
            kVar.thread = thread;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(k kVar, k kVar2) {
            kVar.aad = kVar2;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, k kVar, k kVar2) {
            synchronized (bVar) {
                if (bVar.ZP == kVar) {
                    bVar.ZP = kVar2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, d dVar, d dVar2) {
            synchronized (bVar) {
                if (bVar.ZO == dVar) {
                    bVar.ZO = dVar2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.value == obj) {
                    bVar.value = obj2;
                    return true;
                }
                return false;
            }
        }
    }

    /* compiled from: AbstractFuture */
    interface h<V> extends t<V> {
    }

    /* compiled from: AbstractFuture */
    private static final class j extends a {
        static final Unsafe UJ;
        static final long ZX;
        static final long ZY;
        static final long ZZ;
        static final long aaa;
        static final long aab;

        private j() {
            super();
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:0|1|2|3|(3:4|5|6)) */
        /* JADX WARNING: Missing block: B:10:0x0062, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:12:0x006e, code skipped:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
        static {
            /*
            r0 = sun.misc.Unsafe.getUnsafe();	 Catch:{ SecurityException -> 0x0005 }
            goto L_0x0010;
        L_0x0005:
            r0 = new com.google.common.util.concurrent.b$j$1;	 Catch:{ PrivilegedActionException -> 0x0062 }
            r0.<init>();	 Catch:{ PrivilegedActionException -> 0x0062 }
            r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ PrivilegedActionException -> 0x0062 }
            r0 = (sun.misc.Unsafe) r0;	 Catch:{ PrivilegedActionException -> 0x0062 }
        L_0x0010:
            r1 = com.google.common.util.concurrent.b.class;
            r2 = "waiters";
            r2 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0058 }
            r2 = r0.objectFieldOffset(r2);	 Catch:{ Exception -> 0x0058 }
            ZY = r2;	 Catch:{ Exception -> 0x0058 }
            r2 = "listeners";
            r2 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0058 }
            r2 = r0.objectFieldOffset(r2);	 Catch:{ Exception -> 0x0058 }
            ZX = r2;	 Catch:{ Exception -> 0x0058 }
            r2 = "value";
            r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0058 }
            r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0058 }
            ZZ = r1;	 Catch:{ Exception -> 0x0058 }
            r1 = com.google.common.util.concurrent.b.k.class;
            r2 = "thread";
            r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0058 }
            r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0058 }
            aaa = r1;	 Catch:{ Exception -> 0x0058 }
            r1 = com.google.common.util.concurrent.b.k.class;
            r2 = "aad";
            r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0058 }
            r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0058 }
            aab = r1;	 Catch:{ Exception -> 0x0058 }
            UJ = r0;	 Catch:{ Exception -> 0x0058 }
            return;
        L_0x0058:
            r0 = move-exception;
            com.google.common.base.o.f(r0);
            r1 = new java.lang.RuntimeException;
            r1.<init>(r0);
            throw r1;
        L_0x0062:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r0 = r0.getCause();
            r2 = "Could not initialize intrinsics";
            r1.<init>(r2, r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.b$j.<clinit>():void");
        }

        /* Access modifiers changed, original: 0000 */
        public void a(k kVar, Thread thread) {
            UJ.putObject(kVar, aaa, thread);
        }

        /* Access modifiers changed, original: 0000 */
        public void a(k kVar, k kVar2) {
            UJ.putObject(kVar, aab, kVar2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, k kVar, k kVar2) {
            return UJ.compareAndSwapObject(bVar, ZY, kVar, kVar2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, d dVar, d dVar2) {
            return UJ.compareAndSwapObject(bVar, ZX, dVar, dVar2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a(b<?> bVar, Object obj, Object obj2) {
            return UJ.compareAndSwapObject(bVar, ZZ, obj, obj2);
        }
    }

    /* compiled from: AbstractFuture */
    static abstract class i<V> extends b<V> implements h<V> {
        i() {
        }

        public final V get() {
            return super.get();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }

        public final boolean isDone() {
            return super.isDone();
        }

        public final boolean isCancelled() {
            return super.isCancelled();
        }

        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    /* Access modifiers changed, original: protected */
    public void afterDone() {
    }

    /* Access modifiers changed, original: protected */
    public void interruptTask() {
    }

    static {
        a jVar;
        Throwable th;
        Throwable th2 = null;
        try {
            jVar = new j();
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th3 = th;
            jVar = new g();
        }
        ZN = jVar;
        Class cls = LockSupport.class;
        if (th2 != null) {
            log.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th3);
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    private void a(k kVar) {
        kVar.thread = null;
        while (true) {
            kVar = this.ZP;
            if (kVar != k.aac) {
                k kVar2 = null;
                while (kVar != null) {
                    k kVar3 = kVar.aad;
                    if (kVar.thread != null) {
                        kVar2 = kVar;
                    } else if (kVar2 != null) {
                        kVar2.aad = kVar3;
                        if (kVar2.thread == null) {
                        }
                    } else if (ZN.a(this, kVar, kVar3)) {
                    }
                    kVar = kVar3;
                }
                return;
            }
            return;
        }
    }

    protected b() {
    }

    public V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long toNanos = timeUnit2.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof f) ? 1 : 0)) != 0) {
            return getDoneValue(obj);
        }
        Object obj2;
        StringBuilder stringBuilder;
        long nanoTime = toNanos > 0 ? System.nanoTime() + toNanos : 0;
        if (toNanos >= 1000) {
            k kVar = this.ZP;
            if (kVar != k.aac) {
                k kVar2 = new k();
                do {
                    kVar2.b(kVar);
                    if (ZN.a(this, kVar, kVar2)) {
                        do {
                            LockSupport.parkNanos(this, toNanos);
                            if (Thread.interrupted()) {
                                a(kVar2);
                                throw new InterruptedException();
                            }
                            obj2 = this.value;
                            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof f) ? 1 : 0)) != 0) {
                                return getDoneValue(obj2);
                            }
                            toNanos = nanoTime - System.nanoTime();
                        } while (toNanos >= 1000);
                        a(kVar2);
                    } else {
                        kVar = this.ZP;
                    }
                } while (kVar != k.aac);
            }
            return getDoneValue(this.value);
        }
        while (toNanos > 0) {
            obj2 = this.value;
            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof f) ? 1 : 0)) != 0) {
                return getDoneValue(obj2);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            toNanos = nanoTime - System.nanoTime();
        }
        String bVar = toString();
        String toLowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Waited ");
        stringBuilder2.append(j2);
        String str = " ";
        stringBuilder2.append(str);
        stringBuilder2.append(timeUnit.toString().toLowerCase(Locale.ROOT));
        String stringBuilder3 = stringBuilder2.toString();
        if (toNanos + 1000 < 0) {
            StringBuilder stringBuilder4;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(stringBuilder3);
            stringBuilder2.append(" (plus ");
            stringBuilder3 = stringBuilder2.toString();
            toNanos = -toNanos;
            nanoTime = timeUnit2.convert(toNanos, TimeUnit.NANOSECONDS);
            toNanos -= timeUnit2.toNanos(nanoTime);
            Object obj3 = (nanoTime == 0 || toNanos > 1000) ? 1 : null;
            if (nanoTime > 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder3);
                stringBuilder.append(nanoTime);
                stringBuilder.append(str);
                stringBuilder.append(toLowerCase);
                stringBuilder3 = stringBuilder.toString();
                if (obj3 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(stringBuilder3);
                    stringBuilder.append(",");
                    stringBuilder3 = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder3);
                stringBuilder.append(str);
                stringBuilder3 = stringBuilder.toString();
            }
            if (obj3 != null) {
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(stringBuilder3);
                stringBuilder4.append(toNanos);
                stringBuilder4.append(" nanoseconds ");
                stringBuilder3 = stringBuilder4.toString();
            }
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder3);
            stringBuilder4.append("delay)");
            stringBuilder3 = stringBuilder4.toString();
        }
        if (isDone()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append(" but future completed as timeout expired");
            throw new TimeoutException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder3);
        stringBuilder.append(" for ");
        stringBuilder.append(bVar);
        throw new TimeoutException(stringBuilder.toString());
    }

    public V get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof f) ? 1 : 0)) != 0) {
            return getDoneValue(obj);
        }
        k kVar = this.ZP;
        if (kVar != k.aac) {
            k kVar2 = new k();
            do {
                kVar2.b(kVar);
                if (ZN.a(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (((obj != null ? 1 : 0) & (!(obj instanceof f) ? 1 : 0)) == 0);
                    return getDoneValue(obj);
                }
                kVar = this.ZP;
            } while (kVar != k.aac);
        }
        return getDoneValue(this.value);
    }

    private V getDoneValue(Object obj) {
        if (obj instanceof b) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((b) obj).cause);
        } else if (!(obj instanceof c)) {
            return obj == NULL ? null : obj;
        } else {
            throw new ExecutionException(((c) obj).exception);
        }
    }

    public boolean isDone() {
        Object obj = this.value;
        int i = 1;
        int i2 = obj != null ? 1 : 0;
        if (obj instanceof f) {
            i = 0;
        }
        return i2 & i;
    }

    public boolean isCancelled() {
        return this.value instanceof b;
    }

    public boolean cancel(boolean z) {
        Object obj = this.value;
        if (((obj == null ? 1 : 0) | (obj instanceof f)) == 0) {
            return false;
        }
        Object bVar = GENERATE_CANCELLATION_CAUSES ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.ZQ : b.ZR;
        boolean z2 = false;
        Object obj2 = obj;
        b bVar2 = this;
        while (true) {
            if (ZN.a(bVar2, obj2, bVar)) {
                if (z) {
                    bVar2.interruptTask();
                }
                a(bVar2);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                t tVar = ((f) obj2).future;
                if (tVar instanceof h) {
                    bVar2 = (b) tVar;
                    obj2 = bVar2.value;
                    if (((obj2 == null ? 1 : 0) | (obj2 instanceof f)) == 0) {
                        return true;
                    }
                    z2 = true;
                } else {
                    tVar.cancel(z);
                    return true;
                }
            }
            obj2 = bVar2.value;
            if (!(obj2 instanceof f)) {
                return z2;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).wasInterrupted;
    }

    public void addListener(Runnable runnable, Executor executor) {
        com.google.common.base.i.checkNotNull(runnable, "Runnable was null.");
        com.google.common.base.i.checkNotNull(executor, "Executor was null.");
        if (!isDone()) {
            d dVar = this.ZO;
            if (dVar != d.ZT) {
                d dVar2 = new d(runnable, executor);
                do {
                    dVar2.ZU = dVar;
                    if (!ZN.a(this, dVar, dVar2)) {
                        dVar = this.ZO;
                    } else {
                        return;
                    }
                } while (dVar != d.ZT);
            }
        }
        executeListener(runnable, executor);
    }

    /* Access modifiers changed, original: protected */
    public boolean set(V v) {
        Object v2;
        if (v2 == null) {
            v2 = NULL;
        }
        if (!ZN.a(this, null, v2)) {
            return false;
        }
        a(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean setException(Throwable th) {
        if (!ZN.a(this, null, new c((Throwable) com.google.common.base.i.checkNotNull(th)))) {
            return false;
        }
        a(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean setFuture(t<? extends V> tVar) {
        Object cVar;
        com.google.common.base.i.checkNotNull(tVar);
        Object obj = this.value;
        if (obj == null) {
            if (tVar.isDone()) {
                if (!ZN.a(this, null, getFutureValue(tVar))) {
                    return false;
                }
                a(this);
                return true;
            }
            obj = new f(this, tVar);
            if (ZN.a(this, null, obj)) {
                try {
                    tVar.addListener(obj, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.ZS;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            tVar.cancel(((b) obj).wasInterrupted);
        }
        return false;
        ZN.a(this, obj, cVar);
        return true;
    }

    private static Object getFutureValue(t<?> tVar) {
        String str = "get() did not throw CancellationException, despite reporting isCancelled() == true: ";
        if (tVar instanceof h) {
            Object obj = ((b) tVar).value;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.wasInterrupted) {
                    obj = bVar.cause != null ? new b(false, bVar.cause) : b.ZR;
                }
            }
            return obj;
        }
        if (tVar instanceof com.google.common.util.concurrent.a.a) {
            Throwable a = com.google.common.util.concurrent.a.b.a((com.google.common.util.concurrent.a.a) tVar);
            if (a != null) {
                return new c(a);
            }
        }
        boolean isCancelled = tVar.isCancelled();
        if (((GENERATE_CANCELLATION_CAUSES ^ 1) & isCancelled) != 0) {
            return b.ZR;
        }
        StringBuilder stringBuilder;
        try {
            Object uninterruptibly = getUninterruptibly(tVar);
            if (isCancelled) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(tVar);
                return new b(false, new IllegalArgumentException(stringBuilder.toString()));
            }
            if (uninterruptibly == null) {
                uninterruptibly = NULL;
            }
            return uninterruptibly;
        } catch (ExecutionException e) {
            if (!isCancelled) {
                return new c(e.getCause());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(tVar);
            return new b(false, new IllegalArgumentException(stringBuilder.toString(), e));
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new b(false, e2);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            stringBuilder2.append(tVar);
            return new c(new IllegalArgumentException(stringBuilder2.toString(), e2));
        } catch (Throwable th) {
            return new c(th);
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) {
        Future future2;
        Object obj = null;
        while (true) {
            try {
                future2 = future2.get();
                break;
            } catch (InterruptedException unused) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return future2;
    }

    private static void a(b<?> bVar) {
        d dVar = null;
        while (true) {
            b bVar2;
            bVar2.releaseWaiters();
            bVar2.afterDone();
            d a = bVar2.a(dVar);
            while (a != null) {
                dVar = a.ZU;
                Runnable runnable = a.task;
                if (runnable instanceof f) {
                    Object obj = (f) runnable;
                    bVar2 = obj.ZV;
                    if (bVar2.value == obj) {
                        if (ZN.a(bVar2, obj, getFutureValue(obj.future))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, a.executor);
                }
                a = dVar;
            }
            return;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Throwable vq() {
        if (this instanceof h) {
            Object obj = this.value;
            if (obj instanceof c) {
                return ((c) obj).exception;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void maybePropagateCancellationTo(Future<?> future) {
        if (((future != null ? 1 : 0) & isCancelled()) != 0) {
            future.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        k kVar;
        do {
            kVar = this.ZP;
        } while (!ZN.a(this, kVar, k.aac));
        while (kVar != null) {
            kVar.unpark();
            kVar = kVar.aad;
        }
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.ZO;
        } while (!ZN.a(this, dVar2, d.ZT));
        d dVar3 = dVar2;
        dVar2 = dVar;
        dVar = dVar3;
        while (dVar != null) {
            d dVar4 = dVar.ZU;
            dVar.ZU = dVar2;
            dVar2 = dVar;
            dVar = dVar4;
        }
        return dVar2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        String str = "]";
        if (isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(stringBuilder);
        } else {
            String pendingToString;
            try {
                pendingToString = pendingToString();
            } catch (RuntimeException e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Exception thrown from implementation: ");
                stringBuilder2.append(e.getClass());
                pendingToString = stringBuilder2.toString();
            }
            if (pendingToString != null && !pendingToString.isEmpty()) {
                stringBuilder.append("PENDING, info=[");
                stringBuilder.append(pendingToString);
                stringBuilder.append(str);
            } else if (isDone()) {
                addDoneString(stringBuilder);
            } else {
                stringBuilder.append("PENDING");
            }
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setFuture=[");
            stringBuilder.append(userObjectToString(((f) obj).future));
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("remaining delay=[");
            stringBuilder2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            stringBuilder2.append(" ms]");
            return stringBuilder2.toString();
        }
    }

    private void addDoneString(StringBuilder stringBuilder) {
        String str = "]";
        try {
            Object uninterruptibly = getUninterruptibly(this);
            stringBuilder.append("SUCCESS, result=[");
            stringBuilder.append(userObjectToString(uninterruptibly));
            stringBuilder.append(str);
        } catch (ExecutionException e) {
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(e.getCause());
            stringBuilder.append(str);
        } catch (CancellationException unused) {
            stringBuilder.append("CANCELLED");
        } catch (RuntimeException e2) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(e2.getClass());
            stringBuilder.append(" thrown from get()]");
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            logger.log(level, stringBuilder.toString(), e);
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
