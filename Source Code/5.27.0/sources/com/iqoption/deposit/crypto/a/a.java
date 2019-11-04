package com.iqoption.deposit.crypto.a;

import com.iqoption.core.microservices.billing.response.crypto.f;
import com.iqoption.core.microservices.billing.response.crypto.g;
import com.iqoption.core.microservices.billing.response.crypto.j;
import com.iqoption.core.microservices.billing.response.deposit.d;
import com.iqoption.core.util.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, bng = {"Lcom/iqoption/deposit/crypto/preform/CryptoData;", "", "from", "", "to", "Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "settings", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoToFiatSettingsResult;", "rate", "Lcom/iqoption/core/microservices/billing/response/crypto/Rate;", "(Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;Lcom/iqoption/core/microservices/billing/response/crypto/CryptoToFiatSettingsResult;Lcom/iqoption/core/microservices/billing/response/crypto/Rate;)V", "getFrom", "()Ljava/lang/String;", "getRate", "()Lcom/iqoption/core/microservices/billing/response/crypto/Rate;", "getSettings", "()Lcom/iqoption/core/microservices/billing/response/crypto/CryptoToFiatSettingsResult;", "getTo", "()Lcom/iqoption/core/microservices/billing/response/deposit/CurrencyBilling;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getFormattedMaxLimit", "getMaxLimit", "", "getPrevDepAmount", "hashCode", "", "toString", "deposit_release"})
/* compiled from: DepositCryptoViewModel.kt */
public final class a {
    private final j bnf;
    private final String czO;
    private final d czP;
    private final f czQ;

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bnf, r3.bnf) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.deposit.crypto.a.a;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.iqoption.deposit.crypto.a.a) r3;
        r0 = r2.czO;
        r1 = r3.czO;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.czP;
        r1 = r3.czP;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.czQ;
        r1 = r3.czQ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.bnf;
        r3 = r3.bnf;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.crypto.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.czO;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        d dVar = this.czP;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        f fVar = this.czQ;
        hashCode = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        j jVar = this.bnf;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CryptoData(from=");
        stringBuilder.append(this.czO);
        stringBuilder.append(", to=");
        stringBuilder.append(this.czP);
        stringBuilder.append(", settings=");
        stringBuilder.append(this.czQ);
        stringBuilder.append(", rate=");
        stringBuilder.append(this.bnf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(String str, d dVar, f fVar, j jVar) {
        kotlin.jvm.internal.i.f(str, "from");
        kotlin.jvm.internal.i.f(dVar, "to");
        kotlin.jvm.internal.i.f(fVar, "settings");
        kotlin.jvm.internal.i.f(jVar, "rate");
        this.czO = str;
        this.czP = dVar;
        this.czQ = fVar;
        this.bnf = jVar;
    }

    public final String wU() {
        return this.czO;
    }

    public final d aqP() {
        return this.czP;
    }

    public final f aqQ() {
        return this.czQ;
    }

    public final j aal() {
        return this.bnf;
    }

    public final double aqM() {
        return (double) ((g) af.f(this.czQ.aag(), this.czP.getName())).getMax();
    }

    public final double aqN() {
        Float aah = this.czQ.aah();
        double floatValue = aah != null ? (double) aah.floatValue() : 0.0d;
        if (floatValue > ((double) 0)) {
            return aqM() - floatValue;
        }
        if (this.czQ.aaj()) {
            return aqM();
        }
        return 0.0d;
    }

    public final String aqO() {
        return e.a(aqM(), this.czP, false, 2, null);
    }
}
