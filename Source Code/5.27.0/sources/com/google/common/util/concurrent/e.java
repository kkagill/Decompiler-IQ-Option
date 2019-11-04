package com.google.common.util.concurrent;

import com.google.common.base.i;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.aj;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Logger;

/* compiled from: AggregateFuture */
abstract class e<InputT, OutputT> extends i<OutputT> {
    private static final Logger logger = Logger.getLogger(e.class.getName());
    private a aaf;

    /* compiled from: AggregateFuture */
    abstract class a extends f implements Runnable {
        private ImmutableCollection<? extends t<? extends InputT>> aag;
        private final boolean aah;
        private final boolean aai;

        public abstract void a(boolean z, int i, InputT inputT);

        /* Access modifiers changed, original: 0000 */
        public void interruptTask() {
        }

        public abstract void vx();

        a(ImmutableCollection<? extends t<? extends InputT>> immutableCollection, boolean z, boolean z2) {
            super(immutableCollection.size());
            this.aag = (ImmutableCollection) i.checkNotNull(immutableCollection);
            this.aah = z;
            this.aai = z2;
        }

        public final void run() {
            vu();
        }

        private void init() {
            if (this.aag.isEmpty()) {
                vx();
                return;
            }
            if (this.aah) {
                int i = 0;
                aj sK = this.aag.iterator();
                while (sK.hasNext()) {
                    final t tVar = (t) sK.next();
                    int i2 = i + 1;
                    tVar.addListener(new Runnable() {
                        public void run() {
                            try {
                                a.this.a(i, tVar);
                            } finally {
                                a.this.vu();
                            }
                        }
                    }, x.vG());
                    i = i2;
                }
            } else {
                aj sK2 = this.aag.iterator();
                while (sK2.hasNext()) {
                    ((t) sK2.next()).addListener(this, x.vG());
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:18:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
        private void k(java.lang.Throwable r7) {
            /*
            r6 = this;
            com.google.common.base.i.checkNotNull(r7);
            r0 = r6.aah;
            r1 = 1;
            r2 = 0;
            if (r0 == 0) goto L_0x001e;
        L_0x0009:
            r0 = com.google.common.util.concurrent.e.this;
            r0 = r0.setException(r7);
            if (r0 == 0) goto L_0x0015;
        L_0x0011:
            r6.vw();
            goto L_0x001f;
        L_0x0015:
            r3 = r6.vy();
            r3 = com.google.common.util.concurrent.e.a(r3, r7);
            goto L_0x0020;
        L_0x001e:
            r0 = 0;
        L_0x001f:
            r3 = 1;
        L_0x0020:
            r4 = r7 instanceof java.lang.Error;
            r5 = r6.aah;
            if (r0 != 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0028;
        L_0x0027:
            r1 = 0;
        L_0x0028:
            r0 = r5 & r1;
            r0 = r0 & r3;
            r0 = r0 | r4;
            if (r0 == 0) goto L_0x003e;
        L_0x002e:
            if (r4 == 0) goto L_0x0033;
        L_0x0030:
            r0 = "Input Future failed with Error";
            goto L_0x0035;
        L_0x0033:
            r0 = "Got more than one input Future failure. Logging failures after the first";
        L_0x0035:
            r1 = com.google.common.util.concurrent.e.logger;
            r2 = java.util.logging.Level.SEVERE;
            r1.log(r2, r0, r7);
        L_0x003e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.e$a.k(java.lang.Throwable):void");
        }

        /* Access modifiers changed, original: final */
        public final void d(Set<Throwable> set) {
            if (!e.this.isCancelled()) {
                e.a((Set) set, e.this.vq());
            }
        }

        private void a(int i, Future<? extends InputT> future) {
            boolean z = this.aah || !e.this.isDone() || e.this.isCancelled();
            i.checkState(z, "Future was done before all dependencies completed");
            try {
                i.checkState(future.isDone(), "Tried to set value from future which is not done");
                if (this.aah) {
                    if (future.isCancelled()) {
                        e.this.aaf = null;
                        e.this.cancel(false);
                        return;
                    }
                    Object a = p.a((Future) future);
                    if (this.aai) {
                        a(this.aah, i, a);
                    }
                } else if (this.aai && !future.isCancelled()) {
                    a(this.aah, i, p.a((Future) future));
                }
            } catch (ExecutionException e) {
                k(e.getCause());
            } catch (Throwable th) {
                k(th);
            }
        }

        private void vu() {
            int vz = vz();
            i.checkState(vz >= 0, "Less than 0 remaining futures");
            if (vz == 0) {
                vv();
            }
        }

        private void vv() {
            if ((this.aai & (this.aah ^ 1)) != 0) {
                int i = 0;
                aj sK = this.aag.iterator();
                while (sK.hasNext()) {
                    int i2 = i + 1;
                    a(i, (t) sK.next());
                    i = i2;
                }
            }
            vx();
        }

        /* Access modifiers changed, original: 0000 */
        public void vw() {
            this.aag = null;
        }
    }

    e() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterDone() {
        super.afterDone();
        a aVar = this.aaf;
        if (aVar != null) {
            this.aaf = null;
            ImmutableCollection b = aVar.aag;
            boolean wasInterrupted = wasInterrupted();
            if (wasInterrupted) {
                aVar.interruptTask();
            }
            if ((isCancelled() & (b != null ? 1 : 0)) != 0) {
                aj sK = b.iterator();
                while (sK.hasNext()) {
                    ((t) sK.next()).cancel(wasInterrupted);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        a aVar = this.aaf;
        if (aVar == null) {
            return null;
        }
        ImmutableCollection b = aVar.aag;
        if (b == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("futures=[");
        stringBuilder.append(b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        this.aaf = aVar;
        aVar.init();
    }

    private static boolean a(Set<Throwable> set, Throwable th) {
        Object th2;
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }
}
