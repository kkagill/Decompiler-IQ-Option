package com.google.zxing.datamatrix.encoder;

import com.google.zxing.a;

/* compiled from: SymbolInfo */
public class k {
    static final k[] aho;
    private static k[] ahp;
    private final boolean ahq;
    private final int ahr;
    private final int ahs;
    public final int aht;
    public final int ahu;
    private final int ahv;
    private final int ahw;
    private final int ahx;

    static {
        k[] kVarArr = new k[]{new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        aho = kVarArr;
        ahp = kVarArr;
    }

    public k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ahq = z;
        this.ahr = i;
        this.ahs = i2;
        this.aht = i3;
        this.ahu = i4;
        this.ahv = i5;
        this.ahw = i6;
        this.ahx = i7;
    }

    public static k a(int i, SymbolShapeHint symbolShapeHint, a aVar, a aVar2, boolean z) {
        for (k kVar : ahp) {
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !kVar.ahq) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || kVar.ahq) && ((aVar == null || (kVar.ze() >= aVar.getWidth() && kVar.zf() >= aVar.getHeight())) && ((aVar2 == null || (kVar.ze() <= aVar2.getWidth() && kVar.zf() <= aVar2.getHeight())) && i <= kVar.ahr)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    private int za() {
        int i = this.ahv;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    private int zb() {
        int i = this.ahv;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final int zc() {
        return za() * this.aht;
    }

    public final int zd() {
        return zb() * this.ahu;
    }

    public final int ze() {
        return zc() + (za() << 1);
    }

    public final int zf() {
        return zd() + (zb() << 1);
    }

    public int yN() {
        return this.ahr / this.ahw;
    }

    public final int zg() {
        return this.ahr;
    }

    public final int zh() {
        return this.ahs;
    }

    public int cU(int i) {
        return this.ahw;
    }

    public final int dc(int i) {
        return this.ahx;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.ahq ? "Rectangular Symbol:" : "Square Symbol:");
        stringBuilder.append(" data region ");
        stringBuilder.append(this.aht);
        stringBuilder.append('x');
        stringBuilder.append(this.ahu);
        stringBuilder.append(", symbol size ");
        stringBuilder.append(ze());
        stringBuilder.append('x');
        stringBuilder.append(zf());
        stringBuilder.append(", symbol data size ");
        stringBuilder.append(zc());
        stringBuilder.append('x');
        stringBuilder.append(zd());
        stringBuilder.append(", codewords ");
        stringBuilder.append(this.ahr);
        stringBuilder.append('+');
        stringBuilder.append(this.ahs);
        return stringBuilder.toString();
    }
}
