package com.google.zxing.a.a;

import com.google.zxing.common.a;

/* compiled from: BinaryShiftToken */
final class b extends g {
    private final short agp;
    private final short agq;

    b(g gVar, int i, int i2) {
        super(gVar);
        this.agp = (short) i;
        this.agq = (short) i2;
    }

    public void a(a aVar, byte[] bArr) {
        short s = (short) 0;
        while (true) {
            short s2 = this.agq;
            if (s < s2) {
                if (s == (short) 0 || (s == (short) 31 && s2 <= (short) 62)) {
                    aVar.O(31, 5);
                    short s3 = this.agq;
                    if (s3 > (short) 62) {
                        aVar.O(s3 - 31, 16);
                    } else if (s == (short) 0) {
                        aVar.O(Math.min(s3, 31), 5);
                    } else {
                        aVar.O(s3 - 31, 5);
                    }
                }
                aVar.O(bArr[this.agp + s], 8);
                s++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(this.agp);
        stringBuilder.append("::");
        stringBuilder.append((this.agp + this.agq) - 1);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
