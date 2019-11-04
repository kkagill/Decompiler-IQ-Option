package com.google.common.util.concurrent;

import com.google.common.base.d;
import com.google.common.base.i;
import java.util.concurrent.Executor;

/* compiled from: AbstractCatchingFuture */
abstract class a<V, X extends Throwable, F, T> extends a<V> implements Runnable {
    t<? extends V> ZJ;
    Class<X> ZK;
    F ZL;

    /* compiled from: AbstractCatchingFuture */
    private static final class a<V, X extends Throwable> extends a<V, X, d<? super X, ? extends V>, V> {
        a(t<? extends V> tVar, Class<X> cls, d<? super X, ? extends V> dVar) {
            super(tVar, cls, dVar);
        }

        /* Access modifiers changed, original: 0000 */
        public V a(d<? super X, ? extends V> dVar, X x) {
            return dVar.apply(x);
        }

        /* Access modifiers changed, original: 0000 */
        public void setResult(V v) {
            set(v);
        }
    }

    public abstract T a(F f, X x);

    public abstract void setResult(T t);

    static <V, X extends Throwable> t<V> a(t<? extends V> tVar, Class<X> cls, d<? super X, ? extends V> dVar, Executor executor) {
        a aVar = new a(tVar, cls, dVar);
        tVar.addListener(aVar, x.a(executor, aVar));
        return aVar;
    }

    a(t<? extends V> tVar, Class<X> cls, F f) {
        this.ZJ = (t) i.checkNotNull(tVar);
        this.ZK = (Class) i.checkNotNull(cls);
        this.ZL = i.checkNotNull(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    public final void run() {
        /*
        r7 = this;
        r0 = r7.ZJ;
        r1 = r7.ZK;
        r2 = r7.ZL;
        r3 = 1;
        r4 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000a:
        r5 = 1;
        goto L_0x000d;
    L_0x000c:
        r5 = 0;
    L_0x000d:
        if (r1 != 0) goto L_0x0011;
    L_0x000f:
        r6 = 1;
        goto L_0x0012;
    L_0x0011:
        r6 = 0;
    L_0x0012:
        r5 = r5 | r6;
        if (r2 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0017;
    L_0x0016:
        r3 = 0;
    L_0x0017:
        r3 = r3 | r5;
        r4 = r7.isCancelled();
        r3 = r3 | r4;
        if (r3 == 0) goto L_0x0020;
    L_0x001f:
        return;
    L_0x0020:
        r3 = 0;
        r7.ZJ = r3;
        r4 = com.google.common.util.concurrent.p.a(r0);	 Catch:{ ExecutionException -> 0x002c, Throwable -> 0x002a }
        r5 = r4;
        r4 = r3;
        goto L_0x0038;
    L_0x002a:
        r4 = move-exception;
        goto L_0x0037;
    L_0x002c:
        r4 = move-exception;
        r4 = r4.getCause();
        r4 = com.google.common.base.i.checkNotNull(r4);
        r4 = (java.lang.Throwable) r4;
    L_0x0037:
        r5 = r3;
    L_0x0038:
        if (r4 != 0) goto L_0x003e;
    L_0x003a:
        r7.set(r5);
        return;
    L_0x003e:
        r1 = com.google.common.util.concurrent.y.e(r4, r1);
        if (r1 != 0) goto L_0x0048;
    L_0x0044:
        r7.setFuture(r0);
        return;
    L_0x0048:
        r0 = r7.a(r2, r4);	 Catch:{ Throwable -> 0x0056 }
        r7.ZK = r3;
        r7.ZL = r3;
        r7.setResult(r0);
        return;
    L_0x0054:
        r0 = move-exception;
        goto L_0x005f;
    L_0x0056:
        r0 = move-exception;
        r7.setException(r0);	 Catch:{ all -> 0x0054 }
        r7.ZK = r3;
        r7.ZL = r3;
        return;
    L_0x005f:
        r7.ZK = r3;
        r7.ZL = r3;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.run():void");
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        String stringBuilder;
        t tVar = this.ZJ;
        Class cls = this.ZK;
        Object obj = this.ZL;
        String pendingToString = super.pendingToString();
        if (tVar != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("inputFuture=[");
            stringBuilder2.append(tVar);
            stringBuilder2.append("], ");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        if (cls != null && obj != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder);
            stringBuilder3.append("exceptionType=[");
            stringBuilder3.append(cls);
            stringBuilder3.append("], fallback=[");
            stringBuilder3.append(obj);
            stringBuilder3.append("]");
            return stringBuilder3.toString();
        } else if (pendingToString == null) {
            return null;
        } else {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder);
            stringBuilder4.append(pendingToString);
            return stringBuilder4.toString();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterDone() {
        maybePropagateCancellationTo(this.ZJ);
        this.ZJ = null;
        this.ZK = null;
        this.ZL = null;
    }
}
