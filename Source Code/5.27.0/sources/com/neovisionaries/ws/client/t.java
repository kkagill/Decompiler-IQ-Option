package com.neovisionaries.ws.client;

import java.util.Map.Entry;

/* compiled from: PerMessageDeflateExtension */
class t extends s {
    private static final byte[] ezU = new byte[]{(byte) 0, (byte) 0, (byte) -1, (byte) -1};
    private c eAa;
    private boolean ezV;
    private boolean ezW;
    private int ezX = 32768;
    private int ezY = 32768;
    private int ezZ;

    public t() {
        super("permessage-deflate");
    }

    public t(String str) {
        super(str);
    }

    /* Access modifiers changed, original: 0000 */
    public void validate() {
        for (Entry entry : getParameters().entrySet()) {
            aL((String) entry.getKey(), (String) entry.getValue());
        }
        this.ezZ = this.ezX + 1024;
    }

    private void aL(String str, String str2) {
        if ("server_no_context_takeover".equals(str)) {
            this.ezV = true;
        } else if ("client_no_context_takeover".equals(str)) {
            this.ezW = true;
        } else if ("server_max_window_bits".equals(str)) {
            this.ezX = aM(str, str2);
        } else if ("client_max_window_bits".equals(str)) {
            this.ezY = aM(str, str2);
        } else {
            WebSocketError webSocketError = WebSocketError.PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("permessage-deflate extension contains an unsupported parameter: ");
            stringBuilder.append(str);
            throw new WebSocketException(webSocketError, stringBuilder.toString());
        }
    }

    private int aM(String str, String str2) {
        int aN = aN(str, str2);
        int i = 256;
        for (int i2 = 8; i2 < aN; i2++) {
            i *= 2;
        }
        return i;
    }

    private int aN(String str, String str2) {
        int kA = kA(str2);
        if (kA >= 0) {
            return kA;
        }
        throw new WebSocketException(WebSocketError.PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS, String.format("The value of %s parameter of permessage-deflate extension is invalid: %s", new Object[]{str, str2}));
    }

    private int kA(String str) {
        if (str == null) {
            return -1;
        }
        try {
            int parseInt = Integer.parseInt(str);
            return (parseInt < 8 || 15 < parseInt) ? -1 : parseInt;
        } catch (NumberFormatException unused) {
        }
    }

    /* Access modifiers changed, original: protected */
    public byte[] u(byte[] bArr) {
        c cVar = new c(bArr.length + ezU.length);
        cVar.o(bArr);
        cVar.o(ezU);
        if (this.eAa == null) {
            this.eAa = new c(this.ezZ);
        }
        int length = this.eAa.length();
        try {
            f.a(cVar, this.eAa);
            bArr = this.eAa.iv(length);
            this.eAa.iw(this.ezZ);
            if (this.ezV) {
                this.eAa.clear();
            }
            return bArr;
        } catch (Exception e) {
            throw new WebSocketException(WebSocketError.DECOMPRESSION_ERROR, String.format("Failed to decompress the message: %s", new Object[]{e.getMessage()}), e);
        }
    }

    /* Access modifiers changed, original: protected */
    public byte[] p(byte[] bArr) {
        if (!v(bArr)) {
            return bArr;
        }
        try {
            return w(e.p(bArr));
        } catch (Exception e) {
            throw new WebSocketException(WebSocketError.COMPRESSION_ERROR, String.format("Failed to compress the message: %s", new Object[]{e.getMessage()}), e);
        }
    }

    private boolean v(byte[] bArr) {
        int i = this.ezY;
        return i == 32768 || bArr.length < i;
    }

    private static byte[] w(byte[] bArr) {
        c cVar = new c(bArr.length + 1);
        cVar.o(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        while (a(cVar, iArr, zArr)) {
        }
        if (zArr[0]) {
            return cVar.aH(0, (((iArr[0] - 1) / 8) + 1) - 4);
        }
        b(cVar, iArr);
        return cVar.aH(0, ((iArr[0] - 1) / 8) + 1);
    }

    private static void b(c cVar, int[] iArr) {
        int i = iArr[0] % 8;
        if (i == 0 || i == 6 || i == 7) {
            cVar.iu(0);
        }
        iArr[0] = iArr[0] + 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A:{SYNTHETIC, RETURN} */
    private static boolean a(com.neovisionaries.ws.client.c r5, int[] r6, boolean[] r7) {
        /*
        r0 = r5.i(r6);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r3 = r6[r2];
        r3 = r3 - r1;
        r5.iy(r3);
    L_0x000e:
        r3 = 2;
        r4 = r5.b(r6, r3);
        if (r4 == 0) goto L_0x0040;
    L_0x0015:
        if (r4 == r1) goto L_0x003b;
    L_0x0017:
        if (r4 != r3) goto L_0x001d;
    L_0x0019:
        e(r5, r6);
        goto L_0x003e;
    L_0x001d:
        r5 = new java.lang.Object[r3];
        r7 = com.neovisionaries.ws.client.t.class;
        r7 = r7.getSimpleName();
        r5[r2] = r7;
        r6 = r6[r2];
        r6 = java.lang.Integer.valueOf(r6);
        r5[r1] = r6;
        r6 = "[%s] Bad compression type '11' at the bit index '%d'.";
        r5 = java.lang.String.format(r6, r5);
        r6 = new com.neovisionaries.ws.client.FormatException;
        r6.<init>(r5);
        throw r6;
    L_0x003b:
        d(r5, r6);
    L_0x003e:
        r3 = 0;
        goto L_0x0047;
    L_0x0040:
        r3 = c(r5, r6);
        if (r3 != 0) goto L_0x003e;
    L_0x0046:
        r3 = 1;
    L_0x0047:
        r5 = r5.length();
        r6 = r6[r2];
        r6 = r6 / 8;
        if (r5 > r6) goto L_0x0052;
    L_0x0051:
        r0 = 1;
    L_0x0052:
        if (r0 == 0) goto L_0x0058;
    L_0x0054:
        if (r3 == 0) goto L_0x0058;
    L_0x0056:
        r7[r2] = r1;
    L_0x0058:
        if (r0 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r1 = 0;
    L_0x005c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neovisionaries.ws.client.t.a(com.neovisionaries.ws.client.c, int[], boolean[]):boolean");
    }

    private static int c(c cVar, int[] iArr) {
        int i = ((iArr[0] + 7) & -8) / 8;
        int i2 = (cVar.get(i) & 255) + ((cVar.get(i + 1) & 255) * 256);
        iArr[0] = ((i + 4) + i2) * 8;
        return i2;
    }

    private static void d(c cVar, int[] iArr) {
        a(cVar, iArr, k.beU(), j.beT());
    }

    private static void e(c cVar, int[] iArr) {
        n[] nVarArr = new n[2];
        g.a(cVar, iArr, nVarArr);
        a(cVar, iArr, nVarArr[0], nVarArr[1]);
    }

    private static void a(c cVar, int[] iArr, n nVar, n nVar2) {
        while (true) {
            int a = nVar.a(cVar, iArr);
            if (a != 256) {
                if (a < 0 || a > 255) {
                    g.a(cVar, iArr, a);
                    g.a(cVar, iArr, nVar2);
                }
            } else {
                return;
            }
        }
    }
}
