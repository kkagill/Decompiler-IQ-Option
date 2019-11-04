package com.umoove.all;

import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: FrameProccesor */
public class c extends Thread {
    private boolean a = true;
    private int b;
    private int c;
    private int d;
    private byte[] e;
    private float[] eJb;
    private g eJc;
    private LinkedBlockingQueue<d> eJd = new LinkedBlockingQueue();
    private LinkedBlockingQueue<byte[]> eJe = new LinkedBlockingQueue();
    private LinkedBlockingQueue<Long> eJf = new LinkedBlockingQueue();
    private boolean eJg = true;
    private int h = -1;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private int n;
    private int o = 3;
    private int p = 1;

    public c(int i) {
        this.eJb = new float[i];
    }

    public void a(g gVar, int i, int i2) {
        setPriority(10);
        this.eJc = gVar;
        this.h = 0;
        double d = (double) i2;
        Double.isNaN(d);
        d *= 1.5d;
        double d2 = (double) i;
        Double.isNaN(d2);
        this.b = (int) (d * d2);
        this.c = i2;
        this.d = i;
    }

    public void a(d dVar) {
        this.eJd.add(dVar);
        interrupt();
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        while (this.a) {
            try {
                if (this.eJd.isEmpty()) {
                    a((byte[]) this.eJe.take(), (Long) this.eJf.take());
                } else {
                    while (!this.eJd.isEmpty()) {
                        b((d) this.eJd.poll());
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
        UMNativeCore.Destroy();
    }

    public void a(byte[] bArr, int i, Long l) {
        this.n = i;
        if (bArr.length < this.b || this.k) {
            boolean z = this.k;
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        int i2 = this.b;
        this.e = new byte[i2];
        System.arraycopy(bArr, 0, this.e, 0, i2);
        this.eJe.offer(this.e);
        this.eJf.offer(l);
        Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue() - valueOf.longValue()).toString();
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0115 */
    public void a(byte[] r13, java.lang.Long r14) {
        /*
        r12 = this;
        r0 = "Saving to file failed";
        r1 = 2;
        r2 = 1;
        r3 = r12.h;	 Catch:{ Exception -> 0x015b }
        r4 = 4;
        r5 = 0;
        if (r3 == r1) goto L_0x008c;
    L_0x000a:
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r6 = 3;
        if (r3 == r6) goto L_0x0058;
    L_0x000f:
        if (r3 == r4) goto L_0x0013;
    L_0x0011:
        goto L_0x0089;
    L_0x0013:
        r12.l = r2;	 Catch:{ Exception -> 0x015b }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x015b }
        r3 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x015b }
        r6 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r7 = r12.n;	 Catch:{ Exception -> 0x015b }
        r8 = r14.longValue();	 Catch:{ Exception -> 0x015b }
        com.umoove.all.UMNativeCore.Process(r13, r6, r7, r8);	 Catch:{ Exception -> 0x015b }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x015b }
        r13 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x015b }
        r6 = r13.longValue();	 Catch:{ Exception -> 0x015b }
        r8 = r3.longValue();	 Catch:{ Exception -> 0x015b }
        r6 = r6 - r8;
        r13 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x015b }
        r13.toString();	 Catch:{ Exception -> 0x015b }
        r13 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r13 = r13[r5];	 Catch:{ Exception -> 0x015b }
        r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r13 != 0) goto L_0x0055;
    L_0x0048:
        r13 = r12.i;	 Catch:{ Exception -> 0x015b }
        if (r13 == 0) goto L_0x0053;
    L_0x004c:
        r13 = r12.h;	 Catch:{ Exception -> 0x015b }
        if (r13 != r4) goto L_0x0053;
    L_0x0050:
        r12.h = r1;	 Catch:{ Exception -> 0x015b }
        goto L_0x0055;
    L_0x0053:
        r12.h = r5;	 Catch:{ Exception -> 0x015b }
    L_0x0055:
        r12.l = r5;	 Catch:{ Exception -> 0x015b }
        goto L_0x0089;
    L_0x0058:
        r12.l = r2;	 Catch:{ Exception -> 0x015b }
        r3 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r7 = r12.n;	 Catch:{ Exception -> 0x015b }
        r8 = r14.longValue();	 Catch:{ Exception -> 0x015b }
        com.umoove.all.UMNativeCore.Process(r13, r3, r7, r8);	 Catch:{ Exception -> 0x015b }
        r13 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r13 = r13[r5];	 Catch:{ Exception -> 0x015b }
        r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r13 != 0) goto L_0x0085;
    L_0x006d:
        r13 = r12.eJe;	 Catch:{ Exception -> 0x015b }
        r13.clear();	 Catch:{ Exception -> 0x015b }
        r13 = r12.eJf;	 Catch:{ Exception -> 0x015b }
        r13.clear();	 Catch:{ Exception -> 0x015b }
        r13 = r12.i;	 Catch:{ Exception -> 0x015b }
        if (r13 == 0) goto L_0x0082;
    L_0x007b:
        r13 = r12.h;	 Catch:{ Exception -> 0x015b }
        if (r13 != r6) goto L_0x0082;
    L_0x007f:
        r12.h = r1;	 Catch:{ Exception -> 0x015b }
        goto L_0x0087;
    L_0x0082:
        r12.h = r5;	 Catch:{ Exception -> 0x015b }
        goto L_0x0087;
    L_0x0085:
        r12.h = r4;	 Catch:{ Exception -> 0x015b }
    L_0x0087:
        r12.l = r5;	 Catch:{ Exception -> 0x015b }
    L_0x0089:
        r13 = 0;
        goto L_0x014a;
    L_0x008c:
        com.umoove.all.UMNativeCore.Start();	 Catch:{ Exception -> 0x015b }
        r12.k = r2;	 Catch:{ Exception -> 0x015b }
        r3 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r6 = r12.n;	 Catch:{ Exception -> 0x015b }
        r7 = r14.longValue();	 Catch:{ Exception -> 0x015b }
        com.umoove.all.UMNativeCore.Process(r13, r3, r6, r7);	 Catch:{ Exception -> 0x015b }
        r3 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r3 = r3[r5];	 Catch:{ Exception -> 0x015b }
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x00aa;
    L_0x00a6:
        r12.h = r4;	 Catch:{ Exception -> 0x015b }
        goto L_0x0147;
    L_0x00aa:
        r3 = r12.m;	 Catch:{ Exception -> 0x015b }
        if (r3 == 0) goto L_0x0126;
    L_0x00ae:
        r3 = r12.p;	 Catch:{ Exception -> 0x015b }
        if (r3 != r2) goto L_0x0126;
    L_0x00b2:
        r3 = new android.graphics.YuvImage;	 Catch:{ Exception -> 0x015b }
        r8 = 17;
        r9 = r12.d;	 Catch:{ Exception -> 0x015b }
        r10 = r12.c;	 Catch:{ Exception -> 0x015b }
        r11 = 0;
        r6 = r3;
        r7 = r13;
        r6.<init>(r7, r8, r9, r10, r11);	 Catch:{ Exception -> 0x015b }
        r13 = new android.graphics.Rect;	 Catch:{ Exception -> 0x015b }
        r4 = r12.d;	 Catch:{ Exception -> 0x015b }
        r6 = r12.c;	 Catch:{ Exception -> 0x015b }
        r13.<init>(r5, r5, r4, r6);	 Catch:{ Exception -> 0x015b }
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x015b }
        r4.<init>();	 Catch:{ Exception -> 0x015b }
        r6 = 100;
        r3.compressToJpeg(r13, r6, r4);	 Catch:{ Exception -> 0x015b }
        r13 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r3 = "%s";
        r6 = new java.lang.Object[r2];	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r7 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r7.<init>();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r8 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r8 = r8.getPath();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r7.append(r8);	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r8 = "/unDetect_";
        r7.append(r8);	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r7.append(r8);	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r8 = ".jpg";
        r7.append(r8);	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r7 = r7.toString();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r6[r5] = r7;	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r3 = java.lang.String.format(r3, r6);	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r13.<init>(r3);	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r3 = r4.toByteArray();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r13.write(r3);	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r13.flush();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        r13.close();	 Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011b, Exception -> 0x0115 }
        goto L_0x0126;
    L_0x0115:
        r13 = java.lang.System.out;	 Catch:{ Exception -> 0x015b }
        r13.println(r0);	 Catch:{ Exception -> 0x015b }
        goto L_0x0126;
    L_0x011b:
        r13 = java.lang.System.out;	 Catch:{ Exception -> 0x015b }
        r13.println(r0);	 Catch:{ Exception -> 0x015b }
        goto L_0x0126;
    L_0x0121:
        r13 = java.lang.System.out;	 Catch:{ Exception -> 0x015b }
        r13.println(r0);	 Catch:{ Exception -> 0x015b }
    L_0x0126:
        r13 = r12.eJe;	 Catch:{ Exception -> 0x015b }
        r13.clear();	 Catch:{ Exception -> 0x015b }
        r13 = r12.eJf;	 Catch:{ Exception -> 0x015b }
        r13.clear();	 Catch:{ Exception -> 0x015b }
        r13 = r12.j;	 Catch:{ Exception -> 0x015b }
        if (r13 == 0) goto L_0x0138;
    L_0x0134:
        r13 = r12.h;	 Catch:{ Exception -> 0x015b }
        if (r13 == r1) goto L_0x0147;
    L_0x0138:
        r13 = r12.p;	 Catch:{ Exception -> 0x015b }
        r0 = r12.o;	 Catch:{ Exception -> 0x015b }
        if (r13 >= r0) goto L_0x0145;
    L_0x013e:
        r13 = r12.p;	 Catch:{ Exception -> 0x015b }
        r13 = r13 + r2;
        r12.p = r13;	 Catch:{ Exception -> 0x015b }
        r13 = 1;
        goto L_0x0148;
    L_0x0145:
        r12.h = r5;	 Catch:{ Exception -> 0x015b }
    L_0x0147:
        r13 = 0;
    L_0x0148:
        r12.k = r5;	 Catch:{ Exception -> 0x015b }
    L_0x014a:
        r0 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r3 = r12.h;	 Catch:{ Exception -> 0x015b }
        r3 = (float) r3;	 Catch:{ Exception -> 0x015b }
        r0[r2] = r3;	 Catch:{ Exception -> 0x015b }
        if (r13 != 0) goto L_0x0169;
    L_0x0153:
        r13 = r12.eJc;	 Catch:{ Exception -> 0x015b }
        r0 = r12.eJb;	 Catch:{ Exception -> 0x015b }
        r13.a(r0, r14);	 Catch:{ Exception -> 0x015b }
        goto L_0x0169;
    L_0x015b:
        r12.h = r1;
        r13 = r12.eJb;
        r0 = r12.h;
        r0 = (float) r0;
        r13[r2] = r0;
        r0 = r12.eJc;
        r0.a(r13, r14);
    L_0x0169:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umoove.all.c.a(byte[], java.lang.Long):void");
    }

    private void b(d dVar) {
        d dVar2 = dVar;
        switch (dVar.big()) {
            case 0:
                UMNativeCore.InitNative(dVar2.a, dVar2.b, dVar2.c, dVar2.d, dVar2.o, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.eJh, dVar2.eJi, dVar2.m, dVar2.n, dVar2.p);
                return;
            case 1:
                UMNativeCore.Reset();
                return;
            case 2:
                this.i = dVar2.q;
                this.j = dVar2.q;
                int i = this.h;
                if (i == 0 || this.eJg) {
                    this.h = 2;
                    this.p = 1;
                    return;
                } else if (i == 4) {
                    UMNativeCore.Reset();
                    return;
                } else {
                    return;
                }
            case 3:
                this.i = false;
                this.eJe.clear();
                this.eJf.clear();
                if (this.h != 0) {
                    this.h = 0;
                    UMNativeCore.Stop();
                    UMNativeCore.Reset();
                    return;
                }
                return;
            case 4:
                UMNativeCore.SetDisplayWindow(dVar2.c, dVar2.d);
                return;
            case 5:
                UMNativeCore.Destroy();
                return;
            case 7:
                UMNativeCore.setInitEyeMovement();
                return;
            case 8:
                UMNativeCore.setInitHeadCenter();
                return;
            case 9:
                UMNativeCore.setInitHeadMovement();
                return;
            case 10:
                UMNativeCore.setInitIris();
                return;
            case 11:
                UMNativeCore.setIrisTrackingMode(dVar2.u);
                return;
            case 12:
                UMNativeCore.setIrisRadius(dVar2.r);
                return;
            case 13:
                UMNativeCore.setEyeBallRadius(dVar2.s);
                return;
            case 14:
                UMNativeCore.setDistanceBetweenEyes(dVar2.t);
                return;
            case 15:
                UMNativeCore.setStrictEyeMovement(dVar2.eJj);
                return;
            default:
                return;
        }
    }
}
