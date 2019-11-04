package com.iqoption.core.microservices.tradingengine.response.order;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/ChangeAutoMarginResult;", "", "()V", "positionId", "", "orderId", "autoMargin", "", "(Ljava/lang/Long;Ljava/lang/Long;Z)V", "getAutoMargin", "()Z", "getOrderId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPositionId", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Z)Lcom/iqoption/core/microservices/tradingengine/response/order/ChangeAutoMarginResult;", "equals", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: ChangeAutoMarginResult.kt */
public final class a {
    @SerializedName("order_id")
    private final Long bBm;
    @SerializedName("auto_margin_call")
    private final boolean bBn;
    @SerializedName("position_id")
    private final Long positionId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.positionId, aVar.positionId) && kotlin.jvm.internal.i.y(this.bBm, aVar.bBm)) {
                    if ((this.bBn == aVar.bBn ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Long l = this.positionId;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.bBm;
        if (l2 != null) {
            i = l2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.bBn;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChangeAutoMarginResult(positionId=");
        stringBuilder.append(this.positionId);
        stringBuilder.append(", orderId=");
        stringBuilder.append(this.bBm);
        stringBuilder.append(", autoMargin=");
        stringBuilder.append(this.bBn);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(Long l, Long l2, boolean z) {
        this.positionId = l;
        this.bBm = l2;
        this.bBn = z;
    }

    public /* synthetic */ a(Long l, Long l2, boolean z, int i, f fVar) {
        if ((i & 1) != 0) {
            l = (Long) null;
        }
        if ((i & 2) != 0) {
            l2 = (Long) null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        this(l, l2, z);
    }

    public a() {
        this(null, null, false, 6, null);
    }
}
