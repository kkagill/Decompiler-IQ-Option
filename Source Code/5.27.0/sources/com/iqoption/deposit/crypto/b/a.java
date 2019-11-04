package com.iqoption.deposit.crypto.b;

import com.iqoption.core.microservices.configuration.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/deposit/crypto/status/CryptoDepositData;", "", "cryptoDeposit", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "fiatCurrency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "(Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;Lcom/iqoption/core/microservices/configuration/response/Currency;)V", "getCryptoDeposit", "()Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "getFiatCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "deposit_release"})
/* compiled from: CryptoPaymentStatusViewModel.kt */
public final class a {
    private final com.iqoption.core.microservices.billing.response.crypto.a bmY;
    private final d cAs;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cAs, r3.cAs) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.deposit.crypto.b.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.deposit.crypto.b.a) r3;
        r0 = r2.bmY;
        r1 = r3.bmY;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.cAs;
        r3 = r3.cAs;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.crypto.b.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        com.iqoption.core.microservices.billing.response.crypto.a aVar = this.bmY;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        d dVar = this.cAs;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CryptoDepositData(cryptoDeposit=");
        stringBuilder.append(this.bmY);
        stringBuilder.append(", fiatCurrency=");
        stringBuilder.append(this.cAs);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(com.iqoption.core.microservices.billing.response.crypto.a aVar, d dVar) {
        kotlin.jvm.internal.i.f(aVar, "cryptoDeposit");
        this.bmY = aVar;
        this.cAs = dVar;
    }

    public final com.iqoption.core.microservices.billing.response.crypto.a aaf() {
        return this.bmY;
    }

    public final d arg() {
        return this.cAs;
    }
}
