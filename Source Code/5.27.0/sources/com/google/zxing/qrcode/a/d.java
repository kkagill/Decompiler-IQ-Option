package com.google.zxing.qrcode.a;

/* compiled from: MaskUtil */
final class d {
    static int b(b bVar) {
        return a(bVar, true) + a(bVar, false);
    }

    static int c(b bVar) {
        byte[][] zA = bVar.zA();
        int width = bVar.getWidth();
        int height = bVar.getHeight();
        int i = 0;
        int i2 = 0;
        while (i < height - 1) {
            byte[] bArr = zA[i];
            int i3 = i2;
            i2 = 0;
            while (i2 < width - 1) {
                byte b = bArr[i2];
                int i4 = i2 + 1;
                if (b == bArr[i4]) {
                    int i5 = i + 1;
                    if (b == zA[i5][i2] && b == zA[i5][i4]) {
                        i3++;
                    }
                }
                i2 = i4;
            }
            i++;
            i2 = i3;
        }
        return i2 * 3;
    }

    static int d(b bVar) {
        byte[][] zA = bVar.zA();
        int width = bVar.getWidth();
        int height = bVar.getHeight();
        int i = 0;
        int i2 = 0;
        while (i < height) {
            int i3 = i2;
            i2 = 0;
            while (i2 < width) {
                byte[] bArr = zA[i];
                int i4 = i2 + 6;
                if (i4 < width && bArr[i2] == (byte) 1 && bArr[i2 + 1] == (byte) 0 && bArr[i2 + 2] == (byte) 1 && bArr[i2 + 3] == (byte) 1 && bArr[i2 + 4] == (byte) 1 && bArr[i2 + 5] == (byte) 0 && bArr[i4] == (byte) 1 && (f(bArr, i2 - 4, i2) || f(bArr, i2 + 7, i2 + 11))) {
                    i3++;
                }
                int i5 = i + 6;
                if (i5 < height && zA[i][i2] == (byte) 1 && zA[i + 1][i2] == (byte) 0 && zA[i + 2][i2] == (byte) 1 && zA[i + 3][i2] == (byte) 1 && zA[i + 4][i2] == (byte) 1 && zA[i + 5][i2] == (byte) 0 && zA[i5][i2] == (byte) 1 && (a(zA, i2, i - 4, i) || a(zA, i2, i + 7, i + 11))) {
                    i3++;
                }
                i2++;
            }
            i++;
            i2 = i3;
        }
        return i2 * 40;
    }

    private static boolean f(byte[] bArr, int i, int i2) {
        i2 = Math.min(i2, bArr.length);
        for (i = Math.max(i, 0); i < i2; i++) {
            if (bArr[i] == (byte) 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte[][] bArr, int i, int i2, int i3) {
        i3 = Math.min(i3, bArr.length);
        for (i2 = Math.max(i2, 0); i2 < i3; i2++) {
            if (bArr[i2][i] == (byte) 1) {
                return false;
            }
        }
        return true;
    }

    static int e(b bVar) {
        byte[][] zA = bVar.zA();
        int width = bVar.getWidth();
        int height = bVar.getHeight();
        int i = 0;
        int i2 = 0;
        while (i < height) {
            byte[] bArr = zA[i];
            int i3 = i2;
            for (i2 = 0; i2 < width; i2++) {
                if (bArr[i2] == (byte) 1) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        int height2 = bVar.getHeight() * bVar.getWidth();
        return ((Math.abs((i2 << 1) - height2) * 10) / height2) * 10;
    }

    /* JADX WARNING: Missing block: B:6:0x0024, code skipped:
            r1 = r1 & 1;
     */
    /* JADX WARNING: Missing block: B:11:0x003a, code skipped:
            r3 = r3 + r2;
     */
    /* JADX WARNING: Missing block: B:12:0x003b, code skipped:
            r1 = r3 & 1;
     */
    /* JADX WARNING: Missing block: B:13:0x003d, code skipped:
            if (r1 != 0) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:14:0x003f, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:16:0x0041, code skipped:
            return false;
     */
    static boolean k(int r1, int r2, int r3) {
        /*
        r0 = 1;
        switch(r1) {
            case 0: goto L_0x003a;
            case 1: goto L_0x003b;
            case 2: goto L_0x0037;
            case 3: goto L_0x0033;
            case 4: goto L_0x002e;
            case 5: goto L_0x0026;
            case 6: goto L_0x001d;
            case 7: goto L_0x0014;
            default: goto L_0x0004;
        };
    L_0x0004:
        r2 = new java.lang.IllegalArgumentException;
        r1 = java.lang.String.valueOf(r1);
        r3 = "Invalid mask pattern: ";
        r1 = r3.concat(r1);
        r2.<init>(r1);
        throw r2;
    L_0x0014:
        r1 = r3 * r2;
        r1 = r1 % 3;
        r3 = r3 + r2;
        r2 = r3 & 1;
        r1 = r1 + r2;
        goto L_0x0024;
    L_0x001d:
        r3 = r3 * r2;
        r1 = r3 & 1;
        r3 = r3 % 3;
        r1 = r1 + r3;
    L_0x0024:
        r1 = r1 & r0;
        goto L_0x003d;
    L_0x0026:
        r3 = r3 * r2;
        r1 = r3 & 1;
        r3 = r3 % 3;
        r1 = r1 + r3;
        goto L_0x003d;
    L_0x002e:
        r3 = r3 / 2;
        r2 = r2 / 3;
        goto L_0x003a;
    L_0x0033:
        r3 = r3 + r2;
        r1 = r3 % 3;
        goto L_0x003d;
    L_0x0037:
        r1 = r2 % 3;
        goto L_0x003d;
    L_0x003a:
        r3 = r3 + r2;
    L_0x003b:
        r1 = r3 & 1;
    L_0x003d:
        if (r1 != 0) goto L_0x0040;
    L_0x003f:
        return r0;
    L_0x0040:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.a.d.k(int, int, int):boolean");
    }

    private static int a(b bVar, boolean z) {
        int height = z ? bVar.getHeight() : bVar.getWidth();
        int width = z ? bVar.getWidth() : bVar.getHeight();
        byte[][] zA = bVar.zA();
        int i = 0;
        int i2 = 0;
        while (i < height) {
            int i3 = i2;
            i2 = 0;
            int i4 = 0;
            byte b = (byte) -1;
            while (i2 < width) {
                byte b2 = z ? zA[i][i2] : zA[i2][i];
                if (b2 == b) {
                    i4++;
                } else {
                    if (i4 >= 5) {
                        i3 += (i4 - 5) + 3;
                    }
                    i4 = 1;
                    b = b2;
                }
                i2++;
            }
            if (i4 >= 5) {
                i3 += (i4 - 5) + 3;
            }
            i2 = i3;
            i++;
        }
        return i2;
    }
}
