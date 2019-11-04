package com.iqoption.cardsverification.status;

import com.iqoption.core.microservices.billing.verification.response.VerifyInitResult;
import com.iqoption.core.microservices.configuration.a.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/cardsverification/status/PerformVerifyData;", "", "verifyInitResult", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "country", "Lcom/iqoption/core/microservices/configuration/response/Country;", "(Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;Lcom/iqoption/core/microservices/configuration/response/Country;)V", "getCountry", "()Lcom/iqoption/core/microservices/configuration/response/Country;", "getVerifyInitResult", "()Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cardsverification_release"})
/* compiled from: PerformVerifyViewModel.kt */
public final class d {
    private final VerifyInitResult aBY;
    private final c aBZ;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.aBZ, r3.aBZ) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.cardsverification.status.d;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.cardsverification.status.d) r3;
        r0 = r2.aBY;
        r1 = r3.aBY;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.aBZ;
        r3 = r3.aBZ;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.cardsverification.status.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        VerifyInitResult verifyInitResult = this.aBY;
        int i = 0;
        int hashCode = (verifyInitResult != null ? verifyInitResult.hashCode() : 0) * 31;
        c cVar = this.aBZ;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PerformVerifyData(verifyInitResult=");
        stringBuilder.append(this.aBY);
        stringBuilder.append(", country=");
        stringBuilder.append(this.aBZ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(VerifyInitResult verifyInitResult, c cVar) {
        kotlin.jvm.internal.i.f(verifyInitResult, "verifyInitResult");
        kotlin.jvm.internal.i.f(cVar, "country");
        this.aBY = verifyInitResult;
        this.aBZ = cVar;
    }

    public final VerifyInitResult LA() {
        return this.aBY;
    }

    public final c LB() {
        return this.aBZ;
    }
}
