package com.google.zxing.common.a;

import com.jumio.analytics.MobileEvents;

/* compiled from: GenericGF */
public final class a {
    public static final a agH = new a(4201, 4096, 1);
    public static final a agI = new a(1033, 1024, 1);
    public static final a agJ = new a(67, 64, 1);
    public static final a agK = new a(19, 16, 1);
    public static final a agL = new a(285, 256, 0);
    public static final a agM;
    public static final a agN;
    public static final a agO = agJ;
    private final int[] agP;
    private final int[] agQ;
    private final b agR;
    private final b agS;
    private final int agT;
    private final int agU;
    private final int size;

    static int R(int i, int i2) {
        return i ^ i2;
    }

    static {
        a aVar = new a(MobileEvents.EVENTTYPE_USERACTION, 256, 1);
        agM = aVar;
        agN = aVar;
    }

    public a(int i, int i2, int i3) {
        this.agT = i;
        this.size = i2;
        this.agU = i3;
        this.agP = new int[i2];
        this.agQ = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.agP[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (i = 0; i < i2 - 1; i++) {
            this.agQ[this.agP[i]] = i;
        }
        this.agR = new b(this, new int[]{0});
        this.agS = new b(this, new int[]{1});
    }

    /* Access modifiers changed, original: 0000 */
    public b yI() {
        return this.agR;
    }

    /* Access modifiers changed, original: 0000 */
    public b Q(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.agR;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new b(this, iArr);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int cP(int i) {
        return this.agP[i];
    }

    /* Access modifiers changed, original: 0000 */
    public int cQ(int i) {
        if (i != 0) {
            return this.agQ[i];
        }
        throw new IllegalArgumentException();
    }

    /* Access modifiers changed, original: 0000 */
    public int cR(int i) {
        if (i != 0) {
            return this.agP[(this.size - this.agQ[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* Access modifiers changed, original: 0000 */
    public int S(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.agP;
        int[] iArr2 = this.agQ;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.size - 1)];
    }

    public int yJ() {
        return this.agU;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GF(0x");
        stringBuilder.append(Integer.toHexString(this.agT));
        stringBuilder.append(',');
        stringBuilder.append(this.size);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
