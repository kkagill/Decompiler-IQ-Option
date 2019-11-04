package com.google.zxing.a.a;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: HighLevelEncoder */
public final class d {
    static final String[] ags = new String[]{"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] agt = new int[][]{new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    private static final int[][] agu;
    static final int[][] agv;
    private final byte[] agw;

    static {
        int i;
        int i2;
        int i3;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{5, 256});
        agu = iArr;
        iArr[0][32] = 1;
        for (i = 65; i <= 90; i++) {
            agu[0][i] = (i - 65) + 2;
        }
        agu[1][32] = 1;
        for (i = 97; i <= 122; i++) {
            agu[1][i] = (i - 97) + 2;
        }
        agu[2][32] = 1;
        for (i = 48; i <= 57; i++) {
            agu[2][i] = (i - 48) + 2;
        }
        iArr = agu;
        iArr[2][44] = 12;
        iArr[2][46] = 13;
        int[] iArr2 = new int[]{0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (i2 = 0; i2 < 28; i2++) {
            agu[3][iArr2[i2]] = i2;
        }
        int[] iArr3 = new int[]{0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (i3 = 0; i3 < 31; i3++) {
            if (iArr3[i3] > 0) {
                agu[4][iArr3[i3]] = i3;
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance(int.class, new int[]{6, 6});
        agv = iArr4;
        for (int[] fill : iArr4) {
            Arrays.fill(fill, -1);
        }
        iArr4 = agv;
        iArr4[0][4] = 0;
        iArr4[1][4] = 0;
        iArr4[1][0] = 28;
        iArr4[3][4] = 0;
        iArr4[2][4] = 0;
        iArr4[2][0] = 15;
    }

    public d(byte[] bArr) {
        this.agw = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    public com.google.zxing.common.a yB() {
        /*
        r8 = this;
        r0 = com.google.zxing.a.a.f.agz;
        r0 = java.util.Collections.singletonList(r0);
        r1 = 0;
        r2 = r0;
        r0 = 0;
    L_0x0009:
        r3 = r8.agw;
        r4 = r3.length;
        if (r0 >= r4) goto L_0x0050;
    L_0x000e:
        r4 = r0 + 1;
        r5 = r3.length;
        if (r4 >= r5) goto L_0x0016;
    L_0x0013:
        r3 = r3[r4];
        goto L_0x0017;
    L_0x0016:
        r3 = 0;
    L_0x0017:
        r5 = r8.agw;
        r5 = r5[r0];
        r6 = 13;
        if (r5 == r6) goto L_0x003b;
    L_0x001f:
        r6 = 44;
        r7 = 32;
        if (r5 == r6) goto L_0x0037;
    L_0x0025:
        r6 = 46;
        if (r5 == r6) goto L_0x0033;
    L_0x0029:
        r6 = 58;
        if (r5 == r6) goto L_0x002f;
    L_0x002d:
        r3 = 0;
        goto L_0x0040;
    L_0x002f:
        if (r3 != r7) goto L_0x002d;
    L_0x0031:
        r3 = 5;
        goto L_0x0040;
    L_0x0033:
        if (r3 != r7) goto L_0x002d;
    L_0x0035:
        r3 = 3;
        goto L_0x0040;
    L_0x0037:
        if (r3 != r7) goto L_0x002d;
    L_0x0039:
        r3 = 4;
        goto L_0x0040;
    L_0x003b:
        r5 = 10;
        if (r3 != r5) goto L_0x002d;
    L_0x003f:
        r3 = 2;
    L_0x0040:
        if (r3 <= 0) goto L_0x0049;
    L_0x0042:
        r0 = a(r2, r0, r3);
        r2 = r0;
        r0 = r4;
        goto L_0x004d;
    L_0x0049:
        r2 = r8.d(r2, r0);
    L_0x004d:
        r0 = r0 + 1;
        goto L_0x0009;
    L_0x0050:
        r0 = new com.google.zxing.a.a.d$1;
        r0.<init>();
        r0 = java.util.Collections.min(r2, r0);
        r0 = (com.google.zxing.a.a.f) r0;
        r1 = r8.agw;
        r0 = r0.i(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.a.a.d.yB():com.google.zxing.common.a");
    }

    private Collection<f> d(Iterable<f> iterable, int i) {
        Collection linkedList = new LinkedList();
        for (f a : iterable) {
            a(a, i, linkedList);
        }
        return C(linkedList);
    }

    private void a(f fVar, int i, Collection<f> collection) {
        char c = (char) (this.agw[i] & 255);
        int i2 = 0;
        Object obj = agu[fVar.getMode()][c] > 0 ? 1 : null;
        f fVar2 = null;
        while (i2 <= 4) {
            int i3 = agu[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.cN(i);
                }
                if (obj == null || i2 == fVar.getMode() || i2 == 2) {
                    collection.add(fVar2.K(i2, i3));
                }
                if (obj == null && agv[fVar.getMode()][i2] >= 0) {
                    collection.add(fVar2.L(i2, i3));
                }
            }
            i2++;
        }
        if (fVar.yC() > 0 || agu[fVar.getMode()][c] == 0) {
            collection.add(fVar.cM(i));
        }
    }

    private static Collection<f> a(Iterable<f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (f a : iterable) {
            a(a, i, i2, linkedList);
        }
        return C(linkedList);
    }

    private static void a(f fVar, int i, int i2, Collection<f> collection) {
        f cN = fVar.cN(i);
        collection.add(cN.K(4, i2));
        if (fVar.getMode() != 4) {
            collection.add(cN.L(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(cN.K(2, 16 - i2).K(2, 1));
        }
        if (fVar.yC() > 0) {
            collection.add(fVar.cM(i).cM(i + 1));
        }
    }

    private static Collection<f> C(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            Object obj = 1;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2.a(fVar)) {
                    obj = null;
                    break;
                } else if (fVar.a(fVar2)) {
                    it.remove();
                }
            }
            if (obj != null) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }
}
