package com.google.zxing.a.a;

import androidx.core.internal.view.SupportMenu;
import com.google.zxing.common.a;
import java.util.LinkedList;

/* compiled from: State */
final class f {
    static final f agz = new f(g.agD, 0, 0, 0);
    private final g agA;
    private final int agB;
    private final int agC;
    private final int mode;

    private f(g gVar, int i, int i2, int i3) {
        this.agA = gVar;
        this.mode = i;
        this.agB = i2;
        this.agC = i3;
    }

    /* Access modifiers changed, original: 0000 */
    public int getMode() {
        return this.mode;
    }

    /* Access modifiers changed, original: 0000 */
    public int yC() {
        return this.agB;
    }

    /* Access modifiers changed, original: 0000 */
    public int yD() {
        return this.agC;
    }

    /* Access modifiers changed, original: 0000 */
    public f K(int i, int i2) {
        int i3;
        int i4 = this.agC;
        g gVar = this.agA;
        if (i != this.mode) {
            i3 = d.agt[this.mode][i];
            int i5 = SupportMenu.USER_MASK & i3;
            i3 >>= 16;
            gVar = gVar.M(i5, i3);
            i4 += i3;
        }
        i3 = i == 2 ? 4 : 5;
        return new f(gVar.M(i2, i3), i, 0, i4 + i3);
    }

    /* Access modifiers changed, original: 0000 */
    public f L(int i, int i2) {
        g gVar = this.agA;
        int i3 = this.mode == 2 ? 4 : 5;
        return new f(gVar.M(d.agv[this.mode][i], i3).M(i2, 5), this.mode, 0, (this.agC + i3) + 5);
    }

    /* Access modifiers changed, original: 0000 */
    public f cM(int i) {
        g gVar = this.agA;
        int i2 = this.mode;
        int i3 = this.agC;
        if (i2 == 4 || i2 == 2) {
            i2 = d.agt[i2][0];
            int i4 = SupportMenu.USER_MASK & i2;
            i2 >>= 16;
            gVar = gVar.M(i4, i2);
            i3 += i2;
            i2 = 0;
        }
        int i5 = this.agB;
        i5 = (i5 == 0 || i5 == 31) ? 18 : i5 == 62 ? 9 : 8;
        f fVar = new f(gVar, i2, this.agB + 1, i3 + i5);
        return fVar.agB == 2078 ? fVar.cN(i + 1) : fVar;
    }

    /* Access modifiers changed, original: 0000 */
    public f cN(int i) {
        int i2 = this.agB;
        if (i2 == 0) {
            return this;
        }
        return new f(this.agA.N(i - i2, i2), this.mode, 0, this.agC);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(f fVar) {
        int i = this.agC + (d.agt[this.mode][fVar.mode] >> 16);
        int i2 = this.agB;
        int i3 = fVar.agB;
        if (i2 < i3) {
            i += b(fVar) - b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= fVar.agC;
    }

    /* Access modifiers changed, original: 0000 */
    public a i(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList();
        for (Object obj = cN(bArr.length).agA; obj != null; obj = obj.yE()) {
            linkedList.addFirst(obj);
        }
        a aVar = new a();
        for (g a : linkedList) {
            a.a(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{d.ags[this.mode], Integer.valueOf(this.agC), Integer.valueOf(this.agB)});
    }

    private static int b(f fVar) {
        int i = fVar.agB;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }
}
