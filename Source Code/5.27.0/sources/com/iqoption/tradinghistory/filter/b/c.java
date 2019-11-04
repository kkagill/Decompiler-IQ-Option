package com.iqoption.tradinghistory.filter.b;

import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, bng = {"Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterAdapterItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "selected", "", "(Lcom/iqoption/core/microservices/internalbilling/response/Balance;Z)V", "getBalance", "()Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "id", "getId", "()Ljava/lang/Long;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "tradinghistory_release"})
/* compiled from: BalanceFilterAdapterItem.kt */
public final class c implements d<Long> {
    private final b bcM;
    private final boolean cFW;

    public static /* synthetic */ c a(c cVar, b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = cVar.bcM;
        }
        if ((i & 2) != 0) {
            z = cVar.cFW;
        }
        return cVar.a(bVar, z);
    }

    public final c a(b bVar, boolean z) {
        kotlin.jvm.internal.i.f(bVar, "balance");
        return new c(bVar, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.i.y(this.bcM, cVar.bcM)) {
                    if ((this.cFW == cVar.cFW ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        b bVar = this.bcM;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        int i = this.cFW;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BalanceFilterAdapterItem(balance=");
        stringBuilder.append(this.bcM);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.cFW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(b bVar, boolean z) {
        kotlin.jvm.internal.i.f(bVar, "balance");
        this.bcM = bVar;
        this.cFW = z;
    }

    public final b VL() {
        return this.bcM;
    }

    public final boolean asM() {
        return this.cFW;
    }

    public Long getId() {
        return Long.valueOf(this.bcM.getId());
    }
}
