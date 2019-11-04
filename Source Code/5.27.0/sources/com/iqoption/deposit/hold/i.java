package com.iqoption.deposit.hold;

import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.deposit.verification.a;
import com.iqoption.deposit.verification.b;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, bng = {"Lcom/iqoption/deposit/hold/HoldScreenStatus;", "", "kycWarning", "Lcom/iqoption/deposit/verification/KycVerifyWarning;", "cardWarning", "Lcom/iqoption/deposit/verification/CardsVerifyWarning;", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "(Lcom/iqoption/deposit/verification/KycVerifyWarning;Lcom/iqoption/deposit/verification/CardsVerifyWarning;Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;)V", "getCard", "()Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "getCardWarning", "()Lcom/iqoption/deposit/verification/CardsVerifyWarning;", "getKycWarning", "()Lcom/iqoption/deposit/verification/KycVerifyWarning;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "deposit_release"})
/* compiled from: HoldScreenStatus.kt */
public final class i {
    private final b cEp;
    private final a cEq;
    private final c cEr;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cEr, r3.cEr) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.deposit.hold.i;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.deposit.hold.i) r3;
        r0 = r2.cEp;
        r1 = r3.cEp;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.cEq;
        r1 = r3.cEq;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.cEr;
        r3 = r3.cEr;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.hold.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        b bVar = this.cEp;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        a aVar = this.cEq;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        c cVar = this.cEr;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HoldScreenStatus(kycWarning=");
        stringBuilder.append(this.cEp);
        stringBuilder.append(", cardWarning=");
        stringBuilder.append(this.cEq);
        stringBuilder.append(", card=");
        stringBuilder.append(this.cEr);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public i(b bVar, a aVar, c cVar) {
        this.cEp = bVar;
        this.cEq = aVar;
        this.cEr = cVar;
    }

    public final b arz() {
        return this.cEp;
    }

    public final a arA() {
        return this.cEq;
    }

    public final c La() {
        return this.cEr;
    }
}
