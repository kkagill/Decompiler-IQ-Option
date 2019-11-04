package com.iqoption.core.microservices.withdraw.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/PayoutCommission;", "", "amount", "", "(D)V", "getAmount", "()D", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: PayoutCommission.kt */
public final class g {
    @SerializedName("amount")
    private final double bmw;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (java.lang.Double.compare(r4.bmw, ((com.iqoption.core.microservices.withdraw.response.g) r5).bmw) == 0) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x0015;
    L_0x0002:
        r0 = r5 instanceof com.iqoption.core.microservices.withdraw.response.g;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r5 = (com.iqoption.core.microservices.withdraw.response.g) r5;
        r0 = r4.bmw;
        r2 = r5.bmw;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r5 = 0;
        return r5;
    L_0x0015:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.withdraw.response.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.bmw);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PayoutCommission(amount=");
        stringBuilder.append(this.bmw);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final double ZC() {
        return this.bmw;
    }
}
