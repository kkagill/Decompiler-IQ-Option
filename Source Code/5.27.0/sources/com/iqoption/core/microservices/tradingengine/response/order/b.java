package com.iqoption.core.microservices.tradingengine.response.order;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/ChangeTpslResult;", "", "()V", "positionId", "", "orderId", "limitOrderId", "stopOrderId", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getLimitOrderId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderId", "getPositionId", "getStopOrderId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/iqoption/core/microservices/tradingengine/response/order/ChangeTpslResult;", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: ChangeTpslResult.kt */
public final class b {
    @SerializedName("order_id")
    private final Long bBm;
    @SerializedName("limit_order_id")
    private final Long bBo;
    @SerializedName("stop_order_id")
    private final Long bBp;
    @SerializedName("position_id")
    private final Long positionId;

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bBp, r3.bBp) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.tradingengine.response.order.b;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.tradingengine.response.order.b) r3;
        r0 = r2.positionId;
        r1 = r3.positionId;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.bBm;
        r1 = r3.bBm;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.bBo;
        r1 = r3.bBo;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.bBp;
        r3 = r3.bBp;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.tradingengine.response.order.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Long l = this.positionId;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.bBm;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.bBo;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.bBp;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChangeTpslResult(positionId=");
        stringBuilder.append(this.positionId);
        stringBuilder.append(", orderId=");
        stringBuilder.append(this.bBm);
        stringBuilder.append(", limitOrderId=");
        stringBuilder.append(this.bBo);
        stringBuilder.append(", stopOrderId=");
        stringBuilder.append(this.bBp);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(Long l, Long l2, Long l3, Long l4) {
        this.positionId = l;
        this.bBm = l2;
        this.bBo = l3;
        this.bBp = l4;
    }

    public /* synthetic */ b(Long l, Long l2, Long l3, Long l4, int i, f fVar) {
        if ((i & 1) != 0) {
            l = (Long) null;
        }
        if ((i & 2) != 0) {
            l2 = (Long) null;
        }
        if ((i & 4) != 0) {
            l3 = (Long) null;
        }
        if ((i & 8) != 0) {
            l4 = (Long) null;
        }
        this(l, l2, l3, l4);
    }

    public b() {
        this(null, null, null, null, 14, null);
    }
}
