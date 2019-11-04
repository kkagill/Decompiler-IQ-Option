package com.iqoption.tradinghistory.filter.d;

import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\b\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, bng = {"Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterAdapterItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "item", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;", "selected", "", "(Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;Z)V", "id", "getId", "()Ljava/lang/Integer;", "getItem", "()Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "tradinghistory_release"})
/* compiled from: InstrumentFilterAdapterItem.kt */
public final class b implements d<Integer> {
    private final boolean cFW;
    private final d dYm;

    public static /* synthetic */ b a(b bVar, d dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = bVar.dYm;
        }
        if ((i & 2) != 0) {
            z = bVar.cFW;
        }
        return bVar.a(dVar, z);
    }

    public final b a(d dVar, boolean z) {
        kotlin.jvm.internal.i.f(dVar, "item");
        return new b(dVar, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.dYm, bVar.dYm)) {
                    if ((this.cFW == bVar.cFW ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        d dVar = this.dYm;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        int i = this.cFW;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstrumentFilterAdapterItem(item=");
        stringBuilder.append(this.dYm);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.cFW);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(d dVar, boolean z) {
        kotlin.jvm.internal.i.f(dVar, "item");
        this.dYm = dVar;
        this.cFW = z;
    }

    public final d aVZ() {
        return this.dYm;
    }

    public final boolean asM() {
        return this.cFW;
    }

    /* renamed from: JR */
    public Integer getId() {
        return this.dYm.getId();
    }
}
