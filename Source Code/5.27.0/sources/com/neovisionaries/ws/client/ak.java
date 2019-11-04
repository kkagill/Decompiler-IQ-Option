package com.neovisionaries.ws.client;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WebSocketInputStream */
class ak extends FilterInputStream {
    public ak(InputStream inputStream) {
        super(inputStream);
    }

    public String readLine() {
        return p.c(this, "UTF-8");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    public com.neovisionaries.ws.client.aj bfk() {
        /*
        r17 = this;
        r1 = r17;
        r0 = 8;
        r2 = new byte[r0];
        r3 = 2;
        r1.e(r2, r3);	 Catch:{ InsufficientDataException -> 0x00ed }
        r4 = 0;
        r5 = r2[r4];
        r5 = r5 & 128;
        r6 = 1;
        if (r5 == 0) goto L_0x0014;
    L_0x0012:
        r5 = 1;
        goto L_0x0015;
    L_0x0014:
        r5 = 0;
    L_0x0015:
        r7 = r2[r4];
        r7 = r7 & 64;
        if (r7 == 0) goto L_0x001d;
    L_0x001b:
        r7 = 1;
        goto L_0x001e;
    L_0x001d:
        r7 = 0;
    L_0x001e:
        r8 = r2[r4];
        r8 = r8 & 32;
        if (r8 == 0) goto L_0x0026;
    L_0x0024:
        r8 = 1;
        goto L_0x0027;
    L_0x0026:
        r8 = 0;
    L_0x0027:
        r9 = r2[r4];
        r9 = r9 & 16;
        if (r9 == 0) goto L_0x002f;
    L_0x002d:
        r9 = 1;
        goto L_0x0030;
    L_0x002f:
        r9 = 0;
    L_0x0030:
        r10 = r2[r4];
        r10 = r10 & 15;
        r11 = r2[r6];
        r11 = r11 & 128;
        if (r11 == 0) goto L_0x003c;
    L_0x003a:
        r11 = 1;
        goto L_0x003d;
    L_0x003c:
        r11 = 0;
    L_0x003d:
        r12 = r2[r6];
        r12 = r12 & 127;
        r12 = (long) r12;
        r14 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r6 = 4;
        r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r16 != 0) goto L_0x005a;
    L_0x0049:
        r1.e(r2, r3);
        r3 = r2[r4];
        r3 = r3 & 255;
        r0 = r3 << 8;
        r3 = 1;
        r2 = r2[r3];
    L_0x0055:
        r2 = r2 & 255;
        r0 = r0 | r2;
        r12 = (long) r0;
        goto L_0x00ab;
    L_0x005a:
        r14 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r16 != 0) goto L_0x00ab;
    L_0x0060:
        r1.e(r2, r0);
        r12 = r2[r4];
        r12 = r12 & 128;
        if (r12 != 0) goto L_0x00a1;
    L_0x0069:
        r4 = r2[r4];
        r4 = r4 & 255;
        r4 = r4 << 56;
        r12 = 1;
        r12 = r2[r12];
        r12 = r12 & 255;
        r12 = r12 << 48;
        r4 = r4 | r12;
        r3 = r2[r3];
        r3 = r3 & 255;
        r3 = r3 << 40;
        r3 = r3 | r4;
        r4 = 3;
        r4 = r2[r4];
        r4 = r4 & 255;
        r4 = r4 << 32;
        r3 = r3 | r4;
        r4 = r2[r6];
        r4 = r4 & 255;
        r4 = r4 << 24;
        r3 = r3 | r4;
        r4 = 5;
        r4 = r2[r4];
        r4 = r4 & 255;
        r4 = r4 << 16;
        r3 = r3 | r4;
        r4 = 6;
        r4 = r2[r4];
        r4 = r4 & 255;
        r0 = r4 << 8;
        r0 = r0 | r3;
        r3 = 7;
        r2 = r2[r3];
        goto L_0x0055;
    L_0x00a1:
        r0 = new com.neovisionaries.ws.client.WebSocketException;
        r2 = com.neovisionaries.ws.client.WebSocketError.INVALID_PAYLOAD_LENGTH;
        r3 = "The payload length of a frame is invalid.";
        r0.<init>(r2, r3);
        throw r0;
    L_0x00ab:
        r0 = 0;
        if (r11 == 0) goto L_0x00b3;
    L_0x00ae:
        r0 = new byte[r6];
        r1.e(r0, r6);
    L_0x00b3:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r4 < 0) goto L_0x00e0;
    L_0x00ba:
        r0 = r1.a(r12, r11, r0);
        r2 = new com.neovisionaries.ws.client.aj;
        r2.<init>();
        r2 = r2.fO(r5);
        r2 = r2.fP(r7);
        r2 = r2.fQ(r8);
        r2 = r2.fR(r9);
        r2 = r2.iD(r10);
        r2 = r2.fS(r11);
        r0 = r2.y(r0);
        return r0;
    L_0x00e0:
        r1.cH(r12);
        r0 = new com.neovisionaries.ws.client.WebSocketException;
        r2 = com.neovisionaries.ws.client.WebSocketError.TOO_LONG_PAYLOAD;
        r3 = "The payload length of a frame exceeds the maximum array size in Java.";
        r0.<init>(r2, r3);
        throw r0;
    L_0x00ed:
        r0 = move-exception;
        r2 = r0;
        r0 = r2.beX();
        if (r0 != 0) goto L_0x00fb;
    L_0x00f5:
        r0 = new com.neovisionaries.ws.client.NoMoreFrameException;
        r0.<init>();
        throw r0;
    L_0x00fb:
        goto L_0x00fd;
    L_0x00fc:
        throw r2;
    L_0x00fd:
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.ak.bfk():com.neovisionaries.ws.client.aj");
    }

    /* Access modifiers changed, original: 0000 */
    public void e(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read > 0) {
                i2 += read;
            } else {
                throw new InsufficientDataException(i, i2);
            }
        }
    }

    private void cH(long j) {
        try {
            skip(j);
        } catch (IOException unused) {
        }
    }

    private byte[] a(long j, boolean z, byte[] bArr) {
        if (j == 0) {
            return null;
        }
        try {
            byte[] bArr2 = new byte[((int) j)];
            e(bArr2, bArr2.length);
            if (z) {
                aj.a(bArr, bArr2);
            }
            return bArr2;
        } catch (OutOfMemoryError e) {
            cH(j);
            WebSocketError webSocketError = WebSocketError.INSUFFICIENT_MEMORY_FOR_PAYLOAD;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: ");
            stringBuilder.append(e.getMessage());
            throw new WebSocketException(webSocketError, stringBuilder.toString(), e);
        }
    }
}
