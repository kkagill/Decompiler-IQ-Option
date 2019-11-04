package com.google.zxing.a.a;

import com.google.zxing.common.a;

/* compiled from: SimpleToken */
final class e extends g {
    private final short agy;
    private final short value;

    e(g gVar, int i, int i2) {
        super(gVar);
        this.value = (short) i;
        this.agy = (short) i2;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(a aVar, byte[] bArr) {
        aVar.O(this.value, this.agy);
    }

    public String toString() {
        short s = this.value;
        short s2 = this.agy;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(Integer.toBinaryString(i | (1 << this.agy)).substring(1));
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
