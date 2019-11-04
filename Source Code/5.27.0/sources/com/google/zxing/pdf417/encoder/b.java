package com.google.zxing.pdf417.encoder;

/* compiled from: BarcodeRow */
final class b {
    private final byte[] ahV;
    private int ahW = 0;

    b(int i) {
        this.ahV = new byte[i];
    }

    private void set(int i, boolean z) {
        this.ahV[i] = (byte) z;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.ahW;
            this.ahW = i3 + 1;
            set(i3, z);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] dd(int i) {
        byte[] bArr = new byte[(this.ahV.length * i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = this.ahV[i2 / i];
        }
        return bArr;
    }
}
