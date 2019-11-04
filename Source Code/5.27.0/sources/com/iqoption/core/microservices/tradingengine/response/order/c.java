package com.iqoption.core.microservices.tradingengine.response.order;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/order/DeferredOrdersResponse;", "", "()V", "total", "", "orders", "", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "(ILjava/util/List;)V", "getOrders", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
/* compiled from: DeferredOrdersResponse.kt */
public final class c {
    @SerializedName("orders")
    private final List<TradingOrder> bBq;
    @SerializedName("total")
    private final int total;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.total == cVar.total ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bBq, cVar.bBq)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.total * 31;
        List list = this.bBq;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeferredOrdersResponse(total=");
        stringBuilder.append(this.total);
        stringBuilder.append(", orders=");
        stringBuilder.append(this.bBq);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(int i, List<TradingOrder> list) {
        kotlin.jvm.internal.i.f(list, "orders");
        this.total = i;
        this.bBq = list;
    }

    public /* synthetic */ c(int i, List list, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            list = m.emptyList();
        }
        this(i, list);
    }

    public final List<TradingOrder> getOrders() {
        return this.bBq;
    }

    public c() {
        this(0, null, 2, null);
    }
}
