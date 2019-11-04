package com.iqoption.tradinghistory;

import com.iqoption.tradinghistory.materialcalendar.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, bng = {"Lcom/iqoption/tradinghistory/DateFilter;", "", "from", "Lcom/iqoption/tradinghistory/materialcalendar/CalendarDay;", "to", "(Lcom/iqoption/tradinghistory/materialcalendar/CalendarDay;Lcom/iqoption/tradinghistory/materialcalendar/CalendarDay;)V", "getFrom", "()Lcom/iqoption/tradinghistory/materialcalendar/CalendarDay;", "getTo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tradinghistory_release"})
/* compiled from: Filters.kt */
public final class d {
    private final b dVi;
    private final b dVj;

    public final b aVj() {
        return this.dVi;
    }

    public final b aVk() {
        return this.dVj;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dVj, r3.dVj) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.tradinghistory.d;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.tradinghistory.d) r3;
        r0 = r2.dVi;
        r1 = r3.dVi;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.dVj;
        r3 = r3.dVj;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        b bVar = this.dVi;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        b bVar2 = this.dVj;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DateFilter(from=");
        stringBuilder.append(this.dVi);
        stringBuilder.append(", to=");
        stringBuilder.append(this.dVj);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(b bVar, b bVar2) {
        this.dVi = bVar;
        this.dVj = bVar2;
    }

    public final b aVh() {
        return this.dVi;
    }

    public final b aVi() {
        return this.dVj;
    }
}
