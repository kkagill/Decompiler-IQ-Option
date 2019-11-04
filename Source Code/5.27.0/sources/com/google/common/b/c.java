package com.google.common.b;

import com.google.common.collect.ab;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: Dispatcher */
abstract class c {

    /* compiled from: Dispatcher */
    private static final class a extends c {
        private final ThreadLocal<Queue<a>> XY;
        private final ThreadLocal<Boolean> XZ;

        /* compiled from: Dispatcher */
        private static final class a {
            private final Object XX;
            private final Iterator<f> Yb;

            private a(Object obj, Iterator<f> it) {
                this.XX = obj;
                this.Yb = it;
            }
        }

        private a() {
            this.XY = new ThreadLocal<Queue<a>>() {
                /* Access modifiers changed, original: protected */
                /* renamed from: uI */
                public Queue<a> initialValue() {
                    return ab.uu();
                }
            };
            this.XZ = new ThreadLocal<Boolean>() {
                /* Access modifiers changed, original: protected */
                /* renamed from: uJ */
                public Boolean initialValue() {
                    return Boolean.valueOf(false);
                }
            };
        }

        /* Access modifiers changed, original: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0037 A:{LOOP_START, Catch:{ all -> 0x005e }, LOOP:3: B:6:0x0037->B:9:0x0052} */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0053 A:{SYNTHETIC, EDGE_INSN: B:12:0x0053->B:15:0x0053 ?: BREAK  } */
        public void a(java.lang.Object r4, java.util.Iterator<com.google.common.b.f> r5) {
            /*
            r3 = this;
            com.google.common.base.i.checkNotNull(r4);
            com.google.common.base.i.checkNotNull(r5);
            r0 = r3.XY;
            r0 = r0.get();
            r0 = (java.util.Queue) r0;
            r1 = new com.google.common.b.c$a$a;
            r2 = 0;
            r1.<init>(r4, r5);
            r0.offer(r1);
            r4 = r3.XZ;
            r4 = r4.get();
            r4 = (java.lang.Boolean) r4;
            r4 = r4.booleanValue();
            if (r4 != 0) goto L_0x006a;
        L_0x0025:
            r4 = r3.XZ;
            r5 = 1;
            r5 = java.lang.Boolean.valueOf(r5);
            r4.set(r5);
        L_0x002f:
            r4 = r0.poll();	 Catch:{ all -> 0x005e }
            r4 = (com.google.common.b.c.a.a) r4;	 Catch:{ all -> 0x005e }
            if (r4 == 0) goto L_0x0053;
        L_0x0037:
            r5 = r4.Yb;	 Catch:{ all -> 0x005e }
            r5 = r5.hasNext();	 Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x002f;
        L_0x0041:
            r5 = r4.Yb;	 Catch:{ all -> 0x005e }
            r5 = r5.next();	 Catch:{ all -> 0x005e }
            r5 = (com.google.common.b.f) r5;	 Catch:{ all -> 0x005e }
            r1 = r4.XX;	 Catch:{ all -> 0x005e }
            r5.be(r1);	 Catch:{ all -> 0x005e }
            goto L_0x0037;
        L_0x0053:
            r4 = r3.XZ;
            r4.remove();
            r4 = r3.XY;
            r4.remove();
            goto L_0x006a;
        L_0x005e:
            r4 = move-exception;
            r5 = r3.XZ;
            r5.remove();
            r5 = r3.XY;
            r5.remove();
            throw r4;
        L_0x006a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.b.c$a.a(java.lang.Object, java.util.Iterator):void");
        }
    }

    public abstract void a(Object obj, Iterator<f> it);

    c() {
    }

    static c uH() {
        return new a();
    }
}
