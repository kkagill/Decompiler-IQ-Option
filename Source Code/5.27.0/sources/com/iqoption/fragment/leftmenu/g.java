package com.iqoption.fragment.leftmenu;

import com.iqoption.core.microservices.kyc.response.j;
import com.iqoption.deposit.verification.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ6\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, bng = {"Lcom/iqoption/fragment/leftmenu/MenuVerificationState;", "", "kycData", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "verifyWarning", "Lcom/iqoption/deposit/verification/VerifyWarning;", "hasInvoices", "", "(Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;Lcom/iqoption/deposit/verification/VerifyWarning;Ljava/lang/Boolean;)V", "getHasInvoices", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKycData", "()Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "getVerifyWarning", "()Lcom/iqoption/deposit/verification/VerifyWarning;", "component1", "component2", "component3", "copy", "(Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;Lcom/iqoption/deposit/verification/VerifyWarning;Ljava/lang/Boolean;)Lcom/iqoption/fragment/leftmenu/MenuVerificationState;", "equals", "other", "hashCode", "", "toString", "", "app_optionXRelease"})
/* compiled from: LeftMenuViewModel.kt */
public final class g {
    private final j djf;
    private final e<?> djg;
    private final Boolean djh;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.djh, r3.djh) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.fragment.leftmenu.g;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.fragment.leftmenu.g) r3;
        r0 = r2.djf;
        r1 = r3.djf;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.djg;
        r1 = r3.djg;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.djh;
        r3 = r3.djh;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.leftmenu.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        j jVar = this.djf;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        e eVar = this.djg;
        hashCode = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Boolean bool = this.djh;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MenuVerificationState(kycData=");
        stringBuilder.append(this.djf);
        stringBuilder.append(", verifyWarning=");
        stringBuilder.append(this.djg);
        stringBuilder.append(", hasInvoices=");
        stringBuilder.append(this.djh);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public g(j jVar, e<?> eVar, Boolean bool) {
        this.djf = jVar;
        this.djg = eVar;
        this.djh = bool;
    }

    public final j aEu() {
        return this.djf;
    }

    public final e<?> aEv() {
        return this.djg;
    }

    public final Boolean aEw() {
        return this.djh;
    }
}
