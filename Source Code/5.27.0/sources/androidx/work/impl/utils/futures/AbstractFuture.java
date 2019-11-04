package androidx.work.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.util.concurrent.t;
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

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class AbstractFuture<V> implements t<V> {
    static final AtomicHelper ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Object NULL = new Object();
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final Logger log = Logger.getLogger(AbstractFuture.class.getName());
    @Nullable
    volatile Listener listeners;
    @Nullable
    volatile Object value;
    @Nullable
    volatile Waiter waiters;

    private static abstract class AtomicHelper {
        public abstract boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        public abstract boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract void putNext(Waiter waiter, Waiter waiter2);

        public abstract void putThread(Waiter waiter, Thread thread);

        private AtomicHelper() {
        }
    }

    private static final class Cancellation {
        static final Cancellation CAUSELESS_CANCELLED;
        static final Cancellation CAUSELESS_INTERRUPTED;
        @Nullable
        final Throwable cause;
        final boolean wasInterrupted;

        static {
            if (AbstractFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
                return;
            }
            CAUSELESS_CANCELLED = new Cancellation(false, null);
            CAUSELESS_INTERRUPTED = new Cancellation(true, null);
        }

        Cancellation(boolean z, @Nullable Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    private static final class Failure {
        static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        Failure(Throwable th) {
            this.exception = (Throwable) AbstractFuture.checkNotNull(th);
        }
    }

    private static final class Listener {
        static final Listener TOMBSTONE = new Listener(null, null);
        final Executor executor;
        @Nullable
        Listener next;
        final Runnable task;

        Listener(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    private static final class SetFuture<V> implements Runnable {
        final t<? extends V> future;
        final AbstractFuture<V> owner;

        SetFuture(AbstractFuture<V> abstractFuture, t<? extends V> tVar) {
            this.owner = abstractFuture;
            this.future = tVar;
        }

        public void run() {
            if (this.owner.value == this) {
                if (AbstractFuture.ATOMIC_HELPER.casValue(this.owner, this, AbstractFuture.getFutureValue(this.future))) {
                    AbstractFuture.complete(this.owner);
                }
            }
        }
    }

    private static final class Waiter {
        static final Waiter TOMBSTONE = new Waiter(false);
        @Nullable
        volatile Waiter next;
        @Nullable
        volatile Thread thread;

        Waiter(boolean z) {
        }

        Waiter() {
            AbstractFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }

        /* Access modifiers changed, original: 0000 */
        public void setNext(Waiter waiter) {
            AbstractFuture.ATOMIC_HELPER.putNext(this, waiter);
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

    private static final class SafeAtomicHelper extends AtomicHelper {
        final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;

        SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        /* Access modifiers changed, original: 0000 */
        public void putThread(Waiter waiter, Thread thread) {
            this.waiterThreadUpdater.lazySet(waiter, thread);
        }

        /* Access modifiers changed, original: 0000 */
        public void putNext(Waiter waiter, Waiter waiter2) {
            this.waiterNextUpdater.lazySet(waiter, waiter2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return this.waitersUpdater.compareAndSet(abstractFuture, waiter, waiter2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return this.listenersUpdater.compareAndSet(abstractFuture, listener, listener2);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return this.valueUpdater.compareAndSet(abstractFuture, obj, obj2);
        }
    }

    private static final class SynchronizedHelper extends AtomicHelper {
        SynchronizedHelper() {
            super();
        }

        /* Access modifiers changed, original: 0000 */
        public void putThread(Waiter waiter, Thread thread) {
            waiter.thread = thread;
        }

        /* Access modifiers changed, original: 0000 */
        public void putNext(Waiter waiter, Waiter waiter2) {
            waiter.next = waiter2;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                if (abstractFuture.waiters == waiter) {
                    abstractFuture.waiters = waiter2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                if (abstractFuture.listeners == listener) {
                    abstractFuture.listeners = listener2;
                    return true;
                }
                return false;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.value == obj) {
                    abstractFuture.value = obj2;
                    return true;
                }
                return false;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void afterDone() {
    }

    /* Access modifiers changed, original: protected */
    public void interruptTask() {
    }

    static {
        Throwable th;
        AtomicHelper synchronizedHelper;
        try {
            AtomicHelper safeAtomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, ConditionalUserProperty.VALUE));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            synchronizedHelper = new SynchronizedHelper();
        }
        ATOMIC_HELPER = synchronizedHelper;
        Class cls = LockSupport.class;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    private void removeWaiter(Waiter waiter) {
        waiter.thread = null;
        while (true) {
            waiter = this.waiters;
            if (waiter != Waiter.TOMBSTONE) {
                Waiter waiter2 = null;
                while (waiter != null) {
                    Waiter waiter3 = waiter.next;
                    if (waiter.thread != null) {
                        waiter2 = waiter;
                    } else if (waiter2 != null) {
                        waiter2.next = waiter3;
                        if (waiter2.thread == null) {
                        }
                    } else if (ATOMIC_HELPER.casWaiters(this, waiter, waiter3)) {
                    }
                    waiter = waiter3;
                }
                return;
            }
            return;
        }
    }

    protected AbstractFuture() {
    }

    public final V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long toNanos = timeUnit2.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof SetFuture) ? 1 : 0)) != 0) {
            return getDoneValue(obj);
        }
        Object obj2;
        StringBuilder stringBuilder;
        long nanoTime = toNanos > 0 ? System.nanoTime() + toNanos : 0;
        if (toNanos >= SPIN_THRESHOLD_NANOS) {
            Waiter waiter = this.waiters;
            if (waiter != Waiter.TOMBSTONE) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.setNext(waiter);
                    if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                        do {
                            LockSupport.parkNanos(this, toNanos);
                            if (Thread.interrupted()) {
                                removeWaiter(waiter2);
                                throw new InterruptedException();
                            }
                            obj2 = this.value;
                            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof SetFuture) ? 1 : 0)) != 0) {
                                return getDoneValue(obj2);
                            }
                            toNanos = nanoTime - System.nanoTime();
                        } while (toNanos >= SPIN_THRESHOLD_NANOS);
                        removeWaiter(waiter2);
                    } else {
                        waiter = this.waiters;
                    }
                } while (waiter != Waiter.TOMBSTONE);
            }
            return getDoneValue(this.value);
        }
        while (toNanos > 0) {
            obj2 = this.value;
            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof SetFuture) ? 1 : 0)) != 0) {
                return getDoneValue(obj2);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            toNanos = nanoTime - System.nanoTime();
        }
        String abstractFuture = toString();
        String toLowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Waited ");
        stringBuilder2.append(j2);
        String str = " ";
        stringBuilder2.append(str);
        stringBuilder2.append(timeUnit.toString().toLowerCase(Locale.ROOT));
        String stringBuilder3 = stringBuilder2.toString();
        if (toNanos + SPIN_THRESHOLD_NANOS < 0) {
            StringBuilder stringBuilder4;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(stringBuilder3);
            stringBuilder2.append(" (plus ");
            stringBuilder3 = stringBuilder2.toString();
            toNanos = -toNanos;
            nanoTime = timeUnit2.convert(toNanos, TimeUnit.NANOSECONDS);
            toNanos -= timeUnit2.toNanos(nanoTime);
            Object obj3 = (nanoTime == 0 || toNanos > SPIN_THRESHOLD_NANOS) ? 1 : null;
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
        stringBuilder.append(abstractFuture);
        throw new TimeoutException(stringBuilder.toString());
    }

    public final V get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof SetFuture) ? 1 : 0)) != 0) {
            return getDoneValue(obj);
        }
        Waiter waiter = this.waiters;
        if (waiter != Waiter.TOMBSTONE) {
            Waiter waiter2 = new Waiter();
            do {
                waiter2.setNext(waiter);
                if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            removeWaiter(waiter2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (((obj != null ? 1 : 0) & (!(obj instanceof SetFuture) ? 1 : 0)) == 0);
                    return getDoneValue(obj);
                }
                waiter = this.waiters;
            } while (waiter != Waiter.TOMBSTONE);
        }
        return getDoneValue(this.value);
    }

    private V getDoneValue(Object obj) {
        if (obj instanceof Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation) obj).cause);
        } else if (!(obj instanceof Failure)) {
            return obj == NULL ? null : obj;
        } else {
            throw new ExecutionException(((Failure) obj).exception);
        }
    }

    public final boolean isDone() {
        Object obj = this.value;
        int i = 1;
        int i2 = obj != null ? 1 : 0;
        if (obj instanceof SetFuture) {
            i = 0;
        }
        return i2 & i;
    }

    public final boolean isCancelled() {
        return this.value instanceof Cancellation;
    }

    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (((obj == null ? 1 : 0) | (obj instanceof SetFuture)) == 0) {
            return false;
        }
        Object cancellation = GENERATE_CANCELLATION_CAUSES ? new Cancellation(z, new CancellationException("Future.cancel() was called.")) : z ? Cancellation.CAUSELESS_INTERRUPTED : Cancellation.CAUSELESS_CANCELLED;
        boolean z2 = false;
        Object obj2 = obj;
        AbstractFuture abstractFuture = this;
        while (true) {
            if (ATOMIC_HELPER.casValue(abstractFuture, obj2, cancellation)) {
                if (z) {
                    abstractFuture.interruptTask();
                }
                complete(abstractFuture);
                if (!(obj2 instanceof SetFuture)) {
                    return true;
                }
                t tVar = ((SetFuture) obj2).future;
                if (tVar instanceof AbstractFuture) {
                    abstractFuture = (AbstractFuture) tVar;
                    obj2 = abstractFuture.value;
                    if (((obj2 == null ? 1 : 0) | (obj2 instanceof SetFuture)) == 0) {
                        return true;
                    }
                    z2 = true;
                } else {
                    tVar.cancel(z);
                    return true;
                }
            }
            obj2 = abstractFuture.value;
            if (!(obj2 instanceof SetFuture)) {
                return z2;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof Cancellation) && ((Cancellation) obj).wasInterrupted;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        Listener listener = this.listeners;
        if (listener != Listener.TOMBSTONE) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.next = listener;
                if (!ATOMIC_HELPER.casListeners(this, listener, listener2)) {
                    listener = this.listeners;
                } else {
                    return;
                }
            } while (listener != Listener.TOMBSTONE);
        }
        executeListener(runnable, executor);
    }

    /* Access modifiers changed, original: protected */
    public boolean set(@Nullable V v) {
        Object v2;
        if (v2 == null) {
            v2 = NULL;
        }
        if (!ATOMIC_HELPER.casValue(this, null, v2)) {
            return false;
        }
        complete(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.casValue(this, null, new Failure((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean setFuture(t<? extends V> tVar) {
        SetFuture setFuture;
        Object failure;
        checkNotNull(tVar);
        Object obj = this.value;
        if (obj == null) {
            if (tVar.isDone()) {
                if (!ATOMIC_HELPER.casValue(this, null, getFutureValue(tVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            setFuture = new SetFuture(this, tVar);
            if (ATOMIC_HELPER.casValue(this, null, setFuture)) {
                try {
                    tVar.addListener(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.FALLBACK_INSTANCE;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof Cancellation) {
            tVar.cancel(((Cancellation) obj).wasInterrupted);
        }
        return false;
        ATOMIC_HELPER.casValue(this, setFuture, failure);
        return true;
    }

    static Object getFutureValue(t<?> tVar) {
        if (tVar instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) tVar).value;
            if (obj instanceof Cancellation) {
                Cancellation cancellation = (Cancellation) obj;
                if (cancellation.wasInterrupted) {
                    obj = cancellation.cause != null ? new Cancellation(false, cancellation.cause) : Cancellation.CAUSELESS_CANCELLED;
                }
            }
            return obj;
        }
        boolean isCancelled = tVar.isCancelled();
        if (((GENERATE_CANCELLATION_CAUSES ^ 1) & isCancelled) != 0) {
            return Cancellation.CAUSELESS_CANCELLED;
        }
        try {
            Object uninterruptibly = getUninterruptibly(tVar);
            if (uninterruptibly == null) {
                uninterruptibly = NULL;
            }
            return uninterruptibly;
        } catch (ExecutionException e) {
            return new Failure(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new Cancellation(false, e2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            stringBuilder.append(tVar);
            return new Failure(new IllegalArgumentException(stringBuilder.toString(), e2));
        } catch (Throwable th) {
            return new Failure(th);
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

    static void complete(AbstractFuture<?> abstractFuture) {
        Listener listener = null;
        while (true) {
            AbstractFuture abstractFuture2;
            abstractFuture2.releaseWaiters();
            abstractFuture2.afterDone();
            Listener clearListeners = abstractFuture2.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.next;
                Runnable runnable = clearListeners.task;
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    abstractFuture2 = setFuture.owner;
                    if (abstractFuture2.value == setFuture) {
                        if (ATOMIC_HELPER.casValue(abstractFuture2, setFuture, getFutureValue(setFuture.future))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, clearListeners.executor);
                }
                clearListeners = listener;
            }
            return;
        }
    }

    /* Access modifiers changed, original: final */
    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if (((future != null ? 1 : 0) & isCancelled()) != 0) {
            future.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        Waiter waiter;
        do {
            waiter = this.waiters;
        } while (!ATOMIC_HELPER.casWaiters(this, waiter, Waiter.TOMBSTONE));
        while (waiter != null) {
            waiter.unpark();
            waiter = waiter.next;
        }
    }

    private Listener clearListeners(Listener listener) {
        Listener listener2;
        do {
            listener2 = this.listeners;
        } while (!ATOMIC_HELPER.casListeners(this, listener2, Listener.TOMBSTONE));
        Listener listener3 = listener2;
        listener2 = listener;
        listener = listener3;
        while (listener != null) {
            Listener listener4 = listener.next;
            listener.next = listener2;
            listener2 = listener;
            listener = listener4;
        }
        return listener2;
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
    @Nullable
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof SetFuture) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setFuture=[");
            stringBuilder.append(userObjectToString(((SetFuture) obj).future));
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

    private static CancellationException cancellationExceptionWithCause(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @NonNull
    static <T> T checkNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }
}
