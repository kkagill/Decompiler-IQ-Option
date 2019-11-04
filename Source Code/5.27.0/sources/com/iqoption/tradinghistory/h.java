package com.iqoption.tradinghistory;

import com.iqoption.core.microservices.internalbilling.a.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, bng = {"Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "", "instrumentFilter", "Lcom/iqoption/tradinghistory/InstrumentFilter;", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "activeFilter", "Lcom/iqoption/tradinghistory/ActiveFilter;", "date", "Lcom/iqoption/tradinghistory/DateFilter;", "(Lcom/iqoption/tradinghistory/InstrumentFilter;Lcom/iqoption/core/microservices/internalbilling/response/Balance;Lcom/iqoption/tradinghistory/ActiveFilter;Lcom/iqoption/tradinghistory/DateFilter;)V", "getActiveFilter", "()Lcom/iqoption/tradinghistory/ActiveFilter;", "getBalance", "()Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "getDate", "()Lcom/iqoption/tradinghistory/DateFilter;", "getInstrumentFilter", "()Lcom/iqoption/tradinghistory/InstrumentFilter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "tradinghistory_release"})
/* compiled from: Filters.kt */
public final class h {
    public static final a dVo = new a();
    private final b bcM;
    private final f dVl;
    private final a dVm;
    private final d dVn;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/TradingHistoryFilters$Companion;", "", "()V", "allowAll", "Lcom/iqoption/tradinghistory/TradingHistoryFilters;", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "tradinghistory_release"})
    /* compiled from: Filters.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h b(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "balance");
            return new h(new f(null, 1, null), bVar, new a(null, 1, null), new d(null, null));
        }
    }

    public static /* synthetic */ h a(h hVar, f fVar, b bVar, a aVar, d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = hVar.dVl;
        }
        if ((i & 2) != 0) {
            bVar = hVar.bcM;
        }
        if ((i & 4) != 0) {
            aVar = hVar.dVm;
        }
        if ((i & 8) != 0) {
            dVar = hVar.dVn;
        }
        return hVar.a(fVar, bVar, aVar, dVar);
    }

    public final h a(f fVar, b bVar, a aVar, d dVar) {
        kotlin.jvm.internal.i.f(fVar, "instrumentFilter");
        kotlin.jvm.internal.i.f(bVar, "balance");
        kotlin.jvm.internal.i.f(aVar, "activeFilter");
        kotlin.jvm.internal.i.f(dVar, "date");
        return new h(fVar, bVar, aVar, dVar);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dVn, r3.dVn) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.tradinghistory.h;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.iqoption.tradinghistory.h) r3;
        r0 = r2.dVl;
        r1 = r3.dVl;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.bcM;
        r1 = r3.bcM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.dVm;
        r1 = r3.dVm;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.dVn;
        r3 = r3.dVn;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        f fVar = this.dVl;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        b bVar = this.bcM;
        hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        a aVar = this.dVm;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        d dVar = this.dVn;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TradingHistoryFilters(instrumentFilter=");
        stringBuilder.append(this.dVl);
        stringBuilder.append(", balance=");
        stringBuilder.append(this.bcM);
        stringBuilder.append(", activeFilter=");
        stringBuilder.append(this.dVm);
        stringBuilder.append(", date=");
        stringBuilder.append(this.dVn);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public h(f fVar, b bVar, a aVar, d dVar) {
        kotlin.jvm.internal.i.f(fVar, "instrumentFilter");
        kotlin.jvm.internal.i.f(bVar, "balance");
        kotlin.jvm.internal.i.f(aVar, "activeFilter");
        kotlin.jvm.internal.i.f(dVar, "date");
        this.dVl = fVar;
        this.bcM = bVar;
        this.dVm = aVar;
        this.dVn = dVar;
    }

    public final f aVm() {
        return this.dVl;
    }

    public final b VL() {
        return this.bcM;
    }

    public final a aVn() {
        return this.dVm;
    }

    public final d aVo() {
        return this.dVn;
    }
}
