package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix */
public final class a {
    private final b[] ahT;
    private int ahU;
    private final int height;
    private final int width;

    a(int i, int i2) {
        this.ahT = new b[i];
        int length = this.ahT.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.ahT[i3] = new b(((i2 + 4) * 17) + 1);
        }
        this.width = i2 * 17;
        this.height = i;
        this.ahU = -1;
    }

    /* Access modifiers changed, original: 0000 */
    public void zj() {
        this.ahU++;
    }

    /* Access modifiers changed, original: 0000 */
    public b zk() {
        return this.ahT[this.ahU];
    }

    public byte[][] W(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, new int[]{this.height * i2, this.width * i});
        int i3 = this.height * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.ahT[i4 / i2].dd(i);
        }
        return bArr;
    }
}
