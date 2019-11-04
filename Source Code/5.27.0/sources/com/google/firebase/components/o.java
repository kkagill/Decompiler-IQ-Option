package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.a.a;
import com.google.firebase.a.b;
import com.google.firebase.a.c;
import com.google.firebase.a.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
class o implements c, d {
    @GuardedBy("this")
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> aci = new HashMap();
    @GuardedBy("this")
    private Queue<a<?>> acj = new ArrayDeque();
    private final Executor ack;

    o(Executor executor) {
        this.ack = executor;
    }

    /* JADX WARNING: Missing block: B:9:0x0010, code skipped:
            r0 = d(r4).iterator();
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            r1 = (java.util.Map.Entry) r0.next();
            ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.p.b(r1, r4));
     */
    /* JADX WARNING: Missing block: B:13:0x0032, code skipped:
            return;
     */
    public void c(com.google.firebase.a.a<?> r4) {
        /*
        r3 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r4);
        monitor-enter(r3);
        r0 = r3.acj;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r3.acj;	 Catch:{ all -> 0x0033 }
        r0.add(r4);	 Catch:{ all -> 0x0033 }
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        return;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        r0 = r3.d(r4);
        r0 = r0.iterator();
    L_0x0018:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0032;
    L_0x001e:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getValue();
        r2 = (java.util.concurrent.Executor) r2;
        r1 = com.google.firebase.components.p.b(r1, r4);
        r2.execute(r1);
        goto L_0x0018;
    L_0x0032:
        return;
    L_0x0033:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        goto L_0x0037;
    L_0x0036:
        throw r4;
    L_0x0037:
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.o.c(com.google.firebase.a.a):void");
    }

    private synchronized Set<Entry<b<Object>, Executor>> d(a<?> aVar) {
        Map map;
        map = (Map) this.aci.get(aVar.getType());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, b<? super T> bVar) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(bVar);
        Preconditions.checkNotNull(executor);
        if (!this.aci.containsKey(cls)) {
            this.aci.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.aci.get(cls)).put(bVar, executor);
    }

    public <T> void a(Class<T> cls, b<? super T> bVar) {
        a(cls, this.ack, bVar);
    }

    /* JADX WARNING: Missing block: B:11:0x0028, code skipped:
            return;
     */
    public synchronized <T> void b(java.lang.Class<T> r2, com.google.firebase.a.b<? super T> r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r2);	 Catch:{ all -> 0x0029 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);	 Catch:{ all -> 0x0029 }
        r0 = r1.aci;	 Catch:{ all -> 0x0029 }
        r0 = r0.containsKey(r2);	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r1);
        return;
    L_0x0011:
        r0 = r1.aci;	 Catch:{ all -> 0x0029 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0029 }
        r0 = (java.util.concurrent.ConcurrentHashMap) r0;	 Catch:{ all -> 0x0029 }
        r0.remove(r3);	 Catch:{ all -> 0x0029 }
        r3 = r0.isEmpty();	 Catch:{ all -> 0x0029 }
        if (r3 == 0) goto L_0x0027;
    L_0x0022:
        r3 = r1.aci;	 Catch:{ all -> 0x0029 }
        r3.remove(r2);	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r1);
        return;
    L_0x0029:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.o.b(java.lang.Class, com.google.firebase.a.b):void");
    }

    /* Access modifiers changed, original: 0000 */
    public void wr() {
        synchronized (this) {
            Queue queue;
            if (this.acj != null) {
                queue = this.acj;
                this.acj = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (a c : queue) {
                c(c);
            }
        }
    }
}
