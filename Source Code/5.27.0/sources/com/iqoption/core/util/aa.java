package com.iqoption.core.util;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/util/PointD;", "", "x", "", "y", "(DD)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: PointD.kt */
public final class aa {
    public final double x;
    public final double y;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (java.lang.Double.compare(r4.y, r5.y) == 0) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x001f;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.core.util.aa;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r5 = (com.iqoption.core.util.aa) r5;
        r0 = r4.x;
        r2 = r5.x;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x001d;
    L_0x0012:
        r0 = r4.y;
        r2 = r5.y;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r5 = 0;
        return r5;
    L_0x001f:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.util.aa.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.x);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.y);
        return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PointD(x=");
        stringBuilder.append(this.x);
        stringBuilder.append(", y=");
        stringBuilder.append(this.y);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public aa(double d, double d2) {
        this.x = d;
        this.y = d2;
    }
}
