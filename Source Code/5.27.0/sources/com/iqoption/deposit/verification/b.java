package com.iqoption.deposit.verification;

import com.iqoption.core.microservices.kyc.response.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, bng = {"Lcom/iqoption/deposit/verification/KycVerifyWarning;", "Lcom/iqoption/deposit/verification/VerifyWarning;", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "verificationState", "Lcom/iqoption/deposit/verification/VerificationState;", "message", "", "data", "(Lcom/iqoption/deposit/verification/VerificationState;Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;)V", "getData", "()Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "getMessage", "()Ljava/lang/String;", "source", "Lcom/iqoption/deposit/verification/VerifySource;", "getSource", "()Lcom/iqoption/deposit/verification/VerifySource;", "getVerificationState", "()Lcom/iqoption/deposit/verification/VerificationState;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "deposit_release"})
/* compiled from: VerifyWarning.kt */
public final class b implements e<k> {
    private final k buQ;
    private final VerifySource cGC = VerifySource.KYC;
    private final VerificationState cGD;
    private final String message;

    /* JADX WARNING: Missing block: B:8:0x0030, code skipped:
            if (kotlin.jvm.internal.i.y(aeM(), r3.aeM()) != false) goto L_0x0035;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0035;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.deposit.verification.b;
        if (r0 == 0) goto L_0x0033;
    L_0x0006:
        r3 = (com.iqoption.deposit.verification.b) r3;
        r0 = r2.ath();
        r1 = r3.ath();
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0033;
    L_0x0016:
        r0 = r2.getMessage();
        r1 = r3.getMessage();
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0033;
    L_0x0024:
        r0 = r2.getData();
        r3 = r3.getData();
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0035;
    L_0x0033:
        r3 = 0;
        return r3;
    L_0x0035:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.verification.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        VerificationState ath = ath();
        int i = 0;
        int hashCode = (ath != null ? ath.hashCode() : 0) * 31;
        String message = getMessage();
        hashCode = (hashCode + (message != null ? message.hashCode() : 0)) * 31;
        k aeM = getData();
        if (aeM != null) {
            i = aeM.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycVerifyWarning(verificationState=");
        stringBuilder.append(ath());
        stringBuilder.append(", message=");
        stringBuilder.append(getMessage());
        stringBuilder.append(", data=");
        stringBuilder.append(getData());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(VerificationState verificationState, String str, k kVar) {
        kotlin.jvm.internal.i.f(verificationState, "verificationState");
        this.cGD = verificationState;
        this.message = str;
        this.buQ = kVar;
    }

    public VerificationState ath() {
        return this.cGD;
    }

    public String getMessage() {
        return this.message;
    }

    /* renamed from: aeM */
    public k getData() {
        return this.buQ;
    }

    public VerifySource atg() {
        return this.cGC;
    }
}
