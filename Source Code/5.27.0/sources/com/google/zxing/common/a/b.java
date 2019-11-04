package com.google.zxing.common.a;

/* compiled from: GenericGFPoly */
final class b {
    private final a agV;
    private final int[] agW;

    b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.agV = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.agW = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.agW = new int[]{0};
                return;
            }
            this.agW = new int[(length - i)];
            int[] iArr2 = this.agW;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* Access modifiers changed, original: 0000 */
    public int[] yK() {
        return this.agW;
    }

    /* Access modifiers changed, original: 0000 */
    public int yL() {
        return this.agW.length - 1;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isZero() {
        return this.agW[0] == 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int cS(int i) {
        int[] iArr = this.agW;
        return iArr[(iArr.length - 1) - i];
    }

    /* Access modifiers changed, original: 0000 */
    public b a(b bVar) {
        if (!this.agV.equals(bVar.agV)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (isZero()) {
            return bVar;
        } else {
            if (bVar.isZero()) {
                return this;
            }
            int[] iArr = this.agW;
            Object obj = bVar.agW;
            if (iArr.length > obj.length) {
                Object obj2 = iArr;
                iArr = obj;
                obj = obj2;
            }
            int[] iArr2 = new int[obj.length];
            int length = obj.length - iArr.length;
            System.arraycopy(obj, 0, iArr2, 0, length);
            for (int i = length; i < obj.length; i++) {
                iArr2[i] = a.R(iArr[i - length], obj[i]);
            }
            return new b(this.agV, iArr2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public b b(b bVar) {
        if (!this.agV.equals(bVar.agV)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (isZero() || bVar.isZero()) {
            return this.agV.yI();
        } else {
            int[] iArr = this.agW;
            int length = iArr.length;
            int[] iArr2 = bVar.agW;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = a.R(iArr3[i4], this.agV.S(i2, iArr2[i3]));
                }
            }
            return new b(this.agV, iArr3);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public b T(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.agV.yI();
        } else {
            int length = this.agW.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.agV.S(this.agW[i3], i2);
            }
            return new b(this.agV, iArr);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public b[] c(b bVar) {
        if (!this.agV.equals(bVar.agV)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (bVar.isZero()) {
            throw new IllegalArgumentException("Divide by 0");
        } else {
            b yI = this.agV.yI();
            int cR = this.agV.cR(bVar.cS(bVar.yL()));
            b bVar2 = yI;
            yI = this;
            while (yI.yL() >= bVar.yL() && !yI.isZero()) {
                int yL = yI.yL() - bVar.yL();
                int S = this.agV.S(yI.cS(yI.yL()), cR);
                b T = bVar.T(yL, S);
                bVar2 = bVar2.a(this.agV.Q(yL, S));
                yI = yI.a(T);
            }
            return new b[]{bVar2, yI};
        }
    }

    public String toString() {
        if (isZero()) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder(yL() * 8);
        for (int yL = yL(); yL >= 0; yL--) {
            int cS = cS(yL);
            if (cS != 0) {
                if (cS < 0) {
                    if (yL == yL()) {
                        stringBuilder.append("-");
                    } else {
                        stringBuilder.append(" - ");
                    }
                    cS = -cS;
                } else if (stringBuilder.length() > 0) {
                    stringBuilder.append(" + ");
                }
                if (yL == 0 || cS != 1) {
                    cS = this.agV.cQ(cS);
                    if (cS == 0) {
                        stringBuilder.append('1');
                    } else if (cS == 1) {
                        stringBuilder.append('a');
                    } else {
                        stringBuilder.append("a^");
                        stringBuilder.append(cS);
                    }
                }
                if (yL != 0) {
                    if (yL == 1) {
                        stringBuilder.append('x');
                    } else {
                        stringBuilder.append("x^");
                        stringBuilder.append(yL);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
