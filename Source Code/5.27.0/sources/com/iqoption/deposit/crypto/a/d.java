package com.iqoption.deposit.crypto.a;

import com.iqoption.core.microservices.billing.response.crypto.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, bng = {"Lcom/iqoption/deposit/crypto/preform/RateData;", "", "rate", "Lcom/iqoption/core/microservices/billing/response/crypto/Rate;", "from", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "to", "(Lcom/iqoption/core/microservices/billing/response/crypto/Rate;Lcom/iqoption/core/microservices/configuration/response/Currency;Lcom/iqoption/core/microservices/configuration/response/Currency;)V", "getFrom", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "getRate", "()Lcom/iqoption/core/microservices/billing/response/crypto/Rate;", "getTo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "deposit_release"})
/* compiled from: DepositCryptoViewModel.kt */
public final class d {
    private final j bnf;
    private final com.iqoption.core.microservices.configuration.a.d cAh;
    private final com.iqoption.core.microservices.configuration.a.d cAi;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cAi, r3.cAi) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.deposit.crypto.a.d;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.deposit.crypto.a.d) r3;
        r0 = r2.bnf;
        r1 = r3.bnf;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.cAh;
        r1 = r3.cAh;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.cAi;
        r3 = r3.cAi;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.crypto.a.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        j jVar = this.bnf;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        com.iqoption.core.microservices.configuration.a.d dVar = this.cAh;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        dVar = this.cAi;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RateData(rate=");
        stringBuilder.append(this.bnf);
        stringBuilder.append(", from=");
        stringBuilder.append(this.cAh);
        stringBuilder.append(", to=");
        stringBuilder.append(this.cAi);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(j jVar, com.iqoption.core.microservices.configuration.a.d dVar, com.iqoption.core.microservices.configuration.a.d dVar2) {
        kotlin.jvm.internal.i.f(jVar, "rate");
        kotlin.jvm.internal.i.f(dVar, "from");
        kotlin.jvm.internal.i.f(dVar2, "to");
        this.bnf = jVar;
        this.cAh = dVar;
        this.cAi = dVar2;
    }

    public final j aal() {
        return this.bnf;
    }

    public final com.iqoption.core.microservices.configuration.a.d aqW() {
        return this.cAh;
    }

    public final com.iqoption.core.microservices.configuration.a.d aqX() {
        return this.cAi;
    }
}
