package com.iqoption.billing;

import com.iqoption.core.microservices.billing.response.a;
import com.iqoption.core.microservices.billing.response.deposit.b;
import com.iqoption.core.microservices.configuration.a.d;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, bng = {"Lcom/iqoption/billing/CashboxData;", "", "session", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "counting", "Lcom/iqoption/core/microservices/billing/response/deposit/CashboxCounting;", "currencies", "", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "(Lcom/iqoption/core/microservices/billing/response/BillingSession;Lcom/iqoption/core/microservices/billing/response/deposit/CashboxCounting;Ljava/util/List;)V", "getCounting", "()Lcom/iqoption/core/microservices/billing/response/deposit/CashboxCounting;", "getCurrencies", "()Ljava/util/List;", "getSession", "()Lcom/iqoption/core/microservices/billing/response/BillingSession;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_release"})
/* compiled from: CashboxData.kt */
public final class e {
    private final a ayI;
    private final b ayJ;
    private final List<d> ayK;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.ayK, r3.ayK) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.billing.e;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.billing.e) r3;
        r0 = r2.ayI;
        r1 = r3.ayI;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.ayJ;
        r1 = r3.ayJ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.ayK;
        r3 = r3.ayK;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.billing.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        a aVar = this.ayI;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        b bVar = this.ayJ;
        hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        List list = this.ayK;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CashboxData(session=");
        stringBuilder.append(this.ayI);
        stringBuilder.append(", counting=");
        stringBuilder.append(this.ayJ);
        stringBuilder.append(", currencies=");
        stringBuilder.append(this.ayK);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(a aVar, b bVar, List<d> list) {
        kotlin.jvm.internal.i.f(aVar, "session");
        kotlin.jvm.internal.i.f(bVar, "counting");
        kotlin.jvm.internal.i.f(list, "currencies");
        this.ayI = aVar;
        this.ayJ = bVar;
        this.ayK = list;
    }

    public final a Kl() {
        return this.ayI;
    }

    public final b Km() {
        return this.ayJ;
    }

    public final List<d> Kn() {
        return this.ayK;
    }
}
