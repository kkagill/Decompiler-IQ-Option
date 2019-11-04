package com.iqoption.system.d;

/* compiled from: SntpClient */
public class b {
    private static final String TAG = "com.iqoption.system.d.b";
    private long dUA;
    private long dUB;
    private boolean dUC = false;

    private int c(byte b) {
        return b & 255;
    }

    public static long d(long[] jArr) {
        return ((jArr[1] - jArr[0]) + (jArr[2] - jArr[3])) / 2;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0179  */
    public long[] N(java.lang.String r22, int r23) {
        /*
        r21 = this;
        r1 = r21;
        r0 = 48;
        r2 = 0;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x0175 }
        r3 = java.net.InetAddress.getByName(r22);	 Catch:{ Exception -> 0x0175 }
        r4 = new java.net.DatagramPacket;	 Catch:{ Exception -> 0x0175 }
        r5 = r0.length;	 Catch:{ Exception -> 0x0175 }
        r6 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r4.<init>(r0, r5, r3, r6);	 Catch:{ Exception -> 0x0175 }
        r1.n(r0);	 Catch:{ Exception -> 0x0175 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0175 }
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x0175 }
        r3 = 40;
        r1.a(r0, r3, r5);	 Catch:{ Exception -> 0x0175 }
        r9 = new java.net.DatagramSocket;	 Catch:{ Exception -> 0x0175 }
        r9.<init>();	 Catch:{ Exception -> 0x0175 }
        r2 = r23;
        r9.setSoTimeout(r2);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r9.send(r4);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r2 = 8;
        r4 = new long[r2];	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r10 = new java.net.DatagramPacket;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r11 = r0.length;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r10.<init>(r0, r11);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r9.receive(r10);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r10 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r12 = 7;
        r4[r12] = r10;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r13 = 24;
        r13 = r1.b(r0, r13);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r15 = 32;
        r15 = r1.b(r0, r15);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r17 = r1.b(r0, r3);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r10 = r10 - r7;
        r5 = r5 + r10;
        r3 = 0;
        r4[r3] = r13;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r7 = 1;
        r4[r7] = r15;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r8 = 2;
        r4[r8] = r17;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r8 = 3;
        r4[r8] = r5;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r10 = 4;
        r19 = r1.c(r0, r10);	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r4[r10] = r19;	 Catch:{ Exception -> 0x016d, all -> 0x0167 }
        r22 = r9;
        r8 = r4[r10];	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r8 = r1.cj(r8);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r19 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r11 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1));
        if (r11 > 0) goto L_0x014c;
    L_0x0077:
        r8 = r1.c(r0, r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = 5;
        r4[r2] = r8;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r8 = r4[r2];	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r8 = r1.cj(r8);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r11 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1));
        if (r11 > 0) goto L_0x0135;
    L_0x0088:
        r8 = r0[r3];	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r8 = r8 & r12;
        r8 = (byte) r8;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        if (r8 == r10) goto L_0x00a9;
    L_0x008e:
        if (r8 != r2) goto L_0x0091;
    L_0x0090:
        goto L_0x00a9;
    L_0x0091:
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2.<init>();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r3 = "untrusted mode value for NtpTime: ";
        r2.append(r3);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2.append(r8);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        throw r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
    L_0x00a9:
        r2 = r0[r7];	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = r2 & 255;
        r8 = (long) r2;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r10 = 6;
        r4[r10] = r8;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        if (r2 < r7) goto L_0x011d;
    L_0x00b3:
        r8 = 15;
        if (r2 > r8) goto L_0x011d;
    L_0x00b7:
        r0 = r0[r3];	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r0 = r0 >> r10;
        r2 = 3;
        r0 = r0 & r2;
        r0 = (byte) r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        if (r0 == r2) goto L_0x0114;
    L_0x00bf:
        r5 = r5 - r13;
        r17 = r17 - r15;
        r5 = r5 - r17;
        r2 = java.lang.Math.abs(r5);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r5 = 100;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x00fd;
    L_0x00ce:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r13 = r13 - r2;
        r2 = java.lang.Math.abs(r13);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r5 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x00e6;
    L_0x00dd:
        r1.dUC = r7;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r1.e(r4);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r22.close();
        return r4;
    L_0x00e6:
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r4.<init>();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r5 = "Request was sent more than 10 seconds back ";
        r4.append(r5);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r4.append(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = r4.toString();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        throw r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
    L_0x00fd:
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r4.<init>();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r5 = "Server response delay too large for comfort ";
        r4.append(r5);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r4.append(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = r4.toString();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        throw r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
    L_0x0114:
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = "unsynchronized server responded for NtpTime";
        r0.<init>(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        throw r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
    L_0x011d:
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r3.<init>();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r4 = "untrusted stratum value for NtpTime: ";
        r3.append(r4);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r3.append(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = r3.toString();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        throw r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
    L_0x0135:
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2.<init>();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r3 = "Invalid response from NTP server. Root dispersion violation ";
        r2.append(r3);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2.append(r8);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        throw r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
    L_0x014c:
        r0 = new java.io.IOException;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2.<init>();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r3 = "Invalid response from NTP server. Root delay violation ";
        r2.append(r3);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2.append(r8);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
        throw r0;	 Catch:{ Exception -> 0x0165, all -> 0x0163 }
    L_0x0163:
        r0 = move-exception;
        goto L_0x016a;
    L_0x0165:
        r0 = move-exception;
        goto L_0x0170;
    L_0x0167:
        r0 = move-exception;
        r22 = r9;
    L_0x016a:
        r2 = r22;
        goto L_0x0177;
    L_0x016d:
        r0 = move-exception;
        r22 = r9;
    L_0x0170:
        r2 = r22;
        goto L_0x0176;
    L_0x0173:
        r0 = move-exception;
        goto L_0x0177;
    L_0x0175:
        r0 = move-exception;
    L_0x0176:
        throw r0;	 Catch:{ all -> 0x0173 }
    L_0x0177:
        if (r2 == 0) goto L_0x017c;
    L_0x0179:
        r2.close();
    L_0x017c:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.system.d.b.N(java.lang.String, int):long[]");
    }

    /* Access modifiers changed, original: 0000 */
    public void e(long[] jArr) {
        this.dUB = f(jArr);
        this.dUA = jArr[7];
    }

    /* Access modifiers changed, original: 0000 */
    public long f(long[] jArr) {
        return jArr[3] + d(jArr);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean aUJ() {
        return this.dUC;
    }

    /* Access modifiers changed, original: 0000 */
    public long aUK() {
        return this.dUB;
    }

    /* Access modifiers changed, original: 0000 */
    public long aUL() {
        return this.dUA;
    }

    private void n(byte[] bArr) {
        bArr[0] = (byte) 27;
    }

    private void a(byte[] bArr, int i, long j) {
        long j2 = j / 1000;
        j -= j2 * 1000;
        j2 += 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j2 >> 24));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) (j2 >> 16));
        i2 = i + 1;
        bArr[i] = (byte) ((int) (j2 >> 8));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) (j2 >> null));
        j = (j * 4294967296L) / 1000;
        int i3 = i + 1;
        bArr[i] = (byte) ((int) (j >> 24));
        i = i3 + 1;
        bArr[i3] = (byte) ((int) (j >> 16));
        i3 = i + 1;
        bArr[i] = (byte) ((int) (j >> 8));
        bArr[i3] = (byte) ((int) (Math.random() * 255.0d));
    }

    private long b(byte[] bArr, int i) {
        return ((c(bArr, i) - 2208988800L) * 1000) + ((c(bArr, i + 4) * 1000) / 4294967296L);
    }

    private long c(byte[] bArr, int i) {
        return (((((long) c(bArr[i])) << 24) + (((long) c(bArr[i + 1])) << 16)) + (((long) c(bArr[i + 2])) << 8)) + ((long) c(bArr[i + 3]));
    }

    private double cj(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 65.536d;
    }
}
