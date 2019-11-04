package com.google.common.cache;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Random;
import sun.misc.Unsafe;

abstract class Striped64 extends Number {
    static final ThreadLocal<int[]> UC = new ThreadLocal();
    static final Random UD = new Random();
    static final int UE = Runtime.getRuntime().availableProcessors();
    private static final Unsafe UJ;
    private static final long UK;
    private static final long UL;
    volatile transient a[] UF;
    volatile transient long UH;
    volatile transient int UI;

    static final class a {
        private static final Unsafe UJ;
        private static final long UN;
        volatile long value;

        a(long j) {
            this.value = j;
        }

        /* Access modifiers changed, original: final */
        public final boolean e(long j, long j2) {
            return UJ.compareAndSwapLong(this, UN, j, j2);
        }

        static {
            try {
                UJ = Striped64.rE();
                UN = UJ.objectFieldOffset(a.class.getDeclaredField(ConditionalUserProperty.VALUE));
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }

    public abstract long c(long j, long j2);

    static {
        try {
            UJ = rE();
            Class cls = Striped64.class;
            UK = UJ.objectFieldOffset(cls.getDeclaredField("base"));
            UL = UJ.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    Striped64() {
    }

    /* Access modifiers changed, original: final */
    public final boolean d(long j, long j2) {
        return UJ.compareAndSwapLong(this, UK, j, j2);
    }

    /* Access modifiers changed, original: final */
    public final boolean rD() {
        return UJ.compareAndSwapInt(this, UL, 0, 1);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0022 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ec A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:53:0x008d, code skipped:
            if (r1.UF != r9) goto L_0x009f;
     */
    /* JADX WARNING: Missing block: B:54:0x008f, code skipped:
            r8 = new com.google.common.cache.Striped64.a[(r10 << 1)];
            r11 = 0;
     */
    /* JADX WARNING: Missing block: B:55:0x0094, code skipped:
            if (r11 >= r10) goto L_0x009d;
     */
    /* JADX WARNING: Missing block: B:56:0x0096, code skipped:
            r8[r11] = r9[r11];
            r11 = r11 + 1;
     */
    /* JADX WARNING: Missing block: B:57:0x009d, code skipped:
            r1.UF = r8;
     */
    public final void a(long r17, int[] r19, boolean r20) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r17;
        r0 = 1;
        r4 = 0;
        if (r19 != 0) goto L_0x001b;
    L_0x0008:
        r5 = UC;
        r6 = new int[r0];
        r5.set(r6);
        r5 = UD;
        r5 = r5.nextInt();
        if (r5 != 0) goto L_0x0018;
    L_0x0017:
        r5 = 1;
    L_0x0018:
        r6[r4] = r5;
        goto L_0x001f;
    L_0x001b:
        r5 = r19[r4];
        r6 = r19;
    L_0x001f:
        r7 = r20;
    L_0x0021:
        r8 = 0;
    L_0x0022:
        r9 = r1.UF;
        if (r9 == 0) goto L_0x00b4;
    L_0x0026:
        r10 = r9.length;
        if (r10 <= 0) goto L_0x00b4;
    L_0x0029:
        r11 = r10 + -1;
        r11 = r11 & r5;
        r11 = r9[r11];
        if (r11 != 0) goto L_0x0062;
    L_0x0030:
        r9 = r1.UI;
        if (r9 != 0) goto L_0x0060;
    L_0x0034:
        r9 = new com.google.common.cache.Striped64$a;
        r9.<init>(r2);
        r10 = r1.UI;
        if (r10 != 0) goto L_0x0060;
    L_0x003d:
        r10 = r16.rD();
        if (r10 == 0) goto L_0x0060;
    L_0x0043:
        r10 = r1.UF;	 Catch:{ all -> 0x005c }
        if (r10 == 0) goto L_0x0055;
    L_0x0047:
        r11 = r10.length;	 Catch:{ all -> 0x005c }
        if (r11 <= 0) goto L_0x0055;
    L_0x004a:
        r11 = r11 + -1;
        r11 = r11 & r5;
        r12 = r10[r11];	 Catch:{ all -> 0x005c }
        if (r12 != 0) goto L_0x0055;
    L_0x0051:
        r10[r11] = r9;	 Catch:{ all -> 0x005c }
        r9 = 1;
        goto L_0x0056;
    L_0x0055:
        r9 = 0;
    L_0x0056:
        r1.UI = r4;
        if (r9 == 0) goto L_0x0022;
    L_0x005a:
        goto L_0x00ec;
    L_0x005c:
        r0 = move-exception;
        r1.UI = r4;
        throw r0;
    L_0x0060:
        r8 = 0;
        goto L_0x00a7;
    L_0x0062:
        if (r7 != 0) goto L_0x0066;
    L_0x0064:
        r7 = 1;
        goto L_0x00a7;
    L_0x0066:
        r12 = r11.value;
        r14 = r1.c(r12, r2);
        r11 = r11.e(r12, r14);
        if (r11 == 0) goto L_0x0074;
    L_0x0072:
        goto L_0x00ec;
    L_0x0074:
        r11 = UE;
        if (r10 >= r11) goto L_0x0060;
    L_0x0078:
        r11 = r1.UF;
        if (r11 == r9) goto L_0x007d;
    L_0x007c:
        goto L_0x0060;
    L_0x007d:
        if (r8 != 0) goto L_0x0081;
    L_0x007f:
        r8 = 1;
        goto L_0x00a7;
    L_0x0081:
        r11 = r1.UI;
        if (r11 != 0) goto L_0x00a7;
    L_0x0085:
        r11 = r16.rD();
        if (r11 == 0) goto L_0x00a7;
    L_0x008b:
        r8 = r1.UF;	 Catch:{ all -> 0x00a3 }
        if (r8 != r9) goto L_0x009f;
    L_0x008f:
        r8 = r10 << 1;
        r8 = new com.google.common.cache.Striped64.a[r8];	 Catch:{ all -> 0x00a3 }
        r11 = 0;
    L_0x0094:
        if (r11 >= r10) goto L_0x009d;
    L_0x0096:
        r12 = r9[r11];	 Catch:{ all -> 0x00a3 }
        r8[r11] = r12;	 Catch:{ all -> 0x00a3 }
        r11 = r11 + 1;
        goto L_0x0094;
    L_0x009d:
        r1.UF = r8;	 Catch:{ all -> 0x00a3 }
    L_0x009f:
        r1.UI = r4;
        goto L_0x0021;
    L_0x00a3:
        r0 = move-exception;
        r1.UI = r4;
        throw r0;
    L_0x00a7:
        r9 = r5 << 13;
        r5 = r5 ^ r9;
        r9 = r5 >>> 17;
        r5 = r5 ^ r9;
        r9 = r5 << 5;
        r5 = r5 ^ r9;
        r6[r4] = r5;
        goto L_0x0022;
    L_0x00b4:
        r10 = r1.UI;
        if (r10 != 0) goto L_0x00e0;
    L_0x00b8:
        r10 = r1.UF;
        if (r10 != r9) goto L_0x00e0;
    L_0x00bc:
        r10 = r16.rD();
        if (r10 == 0) goto L_0x00e0;
    L_0x00c2:
        r10 = r1.UF;	 Catch:{ all -> 0x00dc }
        if (r10 != r9) goto L_0x00d6;
    L_0x00c6:
        r9 = 2;
        r9 = new com.google.common.cache.Striped64.a[r9];	 Catch:{ all -> 0x00dc }
        r10 = r5 & 1;
        r11 = new com.google.common.cache.Striped64$a;	 Catch:{ all -> 0x00dc }
        r11.<init>(r2);	 Catch:{ all -> 0x00dc }
        r9[r10] = r11;	 Catch:{ all -> 0x00dc }
        r1.UF = r9;	 Catch:{ all -> 0x00dc }
        r9 = 1;
        goto L_0x00d7;
    L_0x00d6:
        r9 = 0;
    L_0x00d7:
        r1.UI = r4;
        if (r9 == 0) goto L_0x0022;
    L_0x00db:
        goto L_0x00ec;
    L_0x00dc:
        r0 = move-exception;
        r1.UI = r4;
        throw r0;
    L_0x00e0:
        r9 = r1.UH;
        r11 = r1.c(r9, r2);
        r9 = r1.d(r9, r11);
        if (r9 == 0) goto L_0x0022;
    L_0x00ec:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.a(long, int[], boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:5:0x0010, code skipped:
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.cache.Striped64.AnonymousClass1());
     */
    /* JADX WARNING: Missing block: B:6:0x0011, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:8:0x001d, code skipped:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    private static sun.misc.Unsafe rE() {
        /*
        r0 = sun.misc.Unsafe.getUnsafe();	 Catch:{ SecurityException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new com.google.common.cache.Striped64$1;	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0.<init>();	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ PrivilegedActionException -> 0x0011 }
        return r0;
    L_0x0011:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = r0.getCause();
        r2 = "Could not initialize intrinsics";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.rE():sun.misc.Unsafe");
    }
}
