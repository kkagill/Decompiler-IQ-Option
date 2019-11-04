package com.iqoption.tradinghistory.list;

import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryResult;", "", "items", "", "Lcom/iqoption/tradinghistory/list/TradingHistoryListItem;", "lastOffset", "", "tradingItemsCount", "hasMore", "", "(Ljava/util/List;IIZ)V", "getHasMore", "()Z", "getItems", "()Ljava/util/List;", "getLastOffset", "()I", "getTradingItemsCount", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "tradinghistory_release"})
/* compiled from: TradingHistoryListViewModel.kt */
public final class j {
    private final boolean btw;
    private final int dYP;
    private final int dYQ;
    private final List<i> iA;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (kotlin.jvm.internal.i.y(this.iA, jVar.iA)) {
                    if ((this.dYP == jVar.dYP ? 1 : null) != null) {
                        if ((this.dYQ == jVar.dYQ ? 1 : null) != null) {
                            if ((this.btw == jVar.btw ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.iA;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.dYP) * 31) + this.dYQ) * 31;
        int i = this.btw;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TradingHistoryResult(items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(", lastOffset=");
        stringBuilder.append(this.dYP);
        stringBuilder.append(", tradingItemsCount=");
        stringBuilder.append(this.dYQ);
        stringBuilder.append(", hasMore=");
        stringBuilder.append(this.btw);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public j(List<? extends i> list, int i, int i2, boolean z) {
        kotlin.jvm.internal.i.f(list, "items");
        this.iA = list;
        this.dYP = i;
        this.dYQ = i2;
        this.btw = z;
    }

    public final List<i> getItems() {
        return this.iA;
    }

    public final int aWi() {
        return this.dYQ;
    }

    public final boolean adP() {
        return this.btw;
    }
}
