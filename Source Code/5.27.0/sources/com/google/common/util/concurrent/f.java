package com.google.common.util.concurrent;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AggregateFutureState */
abstract class f {
    private static final a aap;
    private static final Logger log = Logger.getLogger(f.class.getName());
    private volatile Set<Throwable> aan = null;
    private volatile int aao;

    /* compiled from: AggregateFutureState */
    private static abstract class a {
        public abstract void a(f fVar, Set<Throwable> set, Set<Throwable> set2);

        public abstract int d(f fVar);

        private a() {
        }
    }

    /* compiled from: AggregateFutureState */
    private static final class b extends a {
        final AtomicReferenceFieldUpdater<f, Set<Throwable>> aaq;
        final AtomicIntegerFieldUpdater<f> aar;

        b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.aaq = atomicReferenceFieldUpdater;
            this.aar = atomicIntegerFieldUpdater;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(f fVar, Set<Throwable> set, Set<Throwable> set2) {
            this.aaq.compareAndSet(fVar, set, set2);
        }

        /* Access modifiers changed, original: 0000 */
        public int d(f fVar) {
            return this.aar.decrementAndGet(fVar);
        }
    }

    /* compiled from: AggregateFutureState */
    private static final class c extends a {
        private c() {
            super();
        }

        /* Access modifiers changed, original: 0000 */
        public void a(f fVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (fVar) {
                if (fVar.aan == set) {
                    fVar.aan = set2;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public int d(f fVar) {
            int c;
            synchronized (fVar) {
                fVar.aao = fVar.aao - 1;
                c = fVar.aao;
            }
            return c;
        }
    }

    public abstract void d(Set<Throwable> set);

    static {
        a bVar;
        Throwable th = null;
        try {
            bVar = new b(AtomicReferenceFieldUpdater.newUpdater(f.class, Set.class, "aan"), AtomicIntegerFieldUpdater.newUpdater(f.class, "aao"));
        } catch (Throwable th2) {
            th = th2;
            bVar = new c();
        }
        aap = bVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    f(int i) {
        this.aao = i;
    }

    /* Access modifiers changed, original: final */
    public final Set<Throwable> vy() {
        Set<Throwable> set = this.aan;
        if (set != null) {
            return set;
        }
        Set ux = Sets.ux();
        d(ux);
        aap.a(this, null, ux);
        return this.aan;
    }

    /* Access modifiers changed, original: final */
    public final int vz() {
        return aap.d(this);
    }
}
