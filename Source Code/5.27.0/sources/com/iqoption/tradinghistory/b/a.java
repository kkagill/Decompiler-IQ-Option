package com.iqoption.tradinghistory.b;

import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/tradinghistory/details/AssetData;", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "subActives", "", "(Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Ljava/util/List;)V", "getActive", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getSubActives", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tradinghistory_release"})
/* compiled from: PositionDetailsViewModel.kt */
final class a {
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private final List<com.iqoption.core.microservices.tradingengine.response.active.a> dWA;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dWA, r3.dWA) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.tradinghistory.b.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.tradinghistory.b.a) r3;
        r0 = r2.anF;
        r1 = r3.anF;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.dWA;
        r3 = r3.dWA;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.b.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.anF;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List list = this.dWA;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetData(active=");
        stringBuilder.append(this.anF);
        stringBuilder.append(", subActives=");
        stringBuilder.append(this.dWA);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, List<? extends com.iqoption.core.microservices.tradingengine.response.active.a> list) {
        this.anF = aVar;
        this.dWA = list;
    }

    public final com.iqoption.core.microservices.tradingengine.response.active.a Jt() {
        return this.anF;
    }

    public final List<com.iqoption.core.microservices.tradingengine.response.active.a> aVq() {
        return this.dWA;
    }
}
