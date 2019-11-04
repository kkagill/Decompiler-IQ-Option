package com.iqoption.core.microservices.withdraw.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodsResponse;", "", "methods", "", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethod;", "maxPayout", "", "(Ljava/util/List;Ljava/lang/Double;)V", "getMaxPayout", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMethods", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Double;)Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodsResponse;", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: WithdrawMethodsResponse.kt */
public final class n {
    @SerializedName("methods")
    private final List<l> bEh;
    @SerializedName("max_payout")
    private final Double bEi;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bEi, r3.bEi) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.withdraw.response.n;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.withdraw.response.n) r3;
        r0 = r2.bEh;
        r1 = r3.bEh;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bEi;
        r3 = r3.bEi;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.withdraw.response.n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.bEh;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Double d = this.bEi;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawMethodsResponse(methods=");
        stringBuilder.append(this.bEh);
        stringBuilder.append(", maxPayout=");
        stringBuilder.append(this.bEi);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final List<l> ajQ() {
        return this.bEh;
    }
}