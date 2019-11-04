package com.google.zxing.common.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ReedSolomonEncoder */
public final class c {
    private final a agV;
    private final List<b> agX = new ArrayList();

    public c(a aVar) {
        this.agV = aVar;
        this.agX.add(new b(aVar, new int[]{1}));
    }

    private b cT(int i) {
        if (i >= this.agX.size()) {
            List list = this.agX;
            b bVar = (b) list.get(list.size() - 1);
            for (int size = this.agX.size(); size <= i; size++) {
                bVar = bVar.b(new b(this.agV, new int[]{1, r4.cP((size - 1) + this.agV.yJ())}));
                this.agX.add(bVar);
            }
        }
        return (b) this.agX.get(i);
    }

    public void a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                b cT = cT(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] yK = new b(this.agV, iArr2).T(i, 1).c(cT)[1].yK();
                i -= yK.length;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(yK, 0, iArr, length + i, yK.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
