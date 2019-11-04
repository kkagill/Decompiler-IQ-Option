package com.iqoption.deposit.verification;

import com.iqoption.core.microservices.billing.verification.response.c;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, bng = {"Lcom/iqoption/deposit/verification/CardsVerifyWarning;", "Lcom/iqoption/deposit/verification/VerifyWarning;", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "verificationState", "Lcom/iqoption/deposit/verification/VerificationState;", "message", "", "data", "(Lcom/iqoption/deposit/verification/VerificationState;Ljava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "source", "Lcom/iqoption/deposit/verification/VerifySource;", "getSource", "()Lcom/iqoption/deposit/verification/VerifySource;", "getVerificationState", "()Lcom/iqoption/deposit/verification/VerificationState;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "deposit_release"})
/* compiled from: VerifyWarning.kt */
public final class a implements e<List<? extends c>> {
    private final List<c> bxW;
    private final VerifySource cGC = VerifySource.CARD;
    private final VerificationState cGD;
    private final String message;

    /* JADX WARNING: Missing block: B:8:0x0030, code skipped:
            if (kotlin.jvm.internal.i.y(agZ(), r3.agZ()) != false) goto L_0x0035;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0035;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.deposit.verification.a;
        if (r0 == 0) goto L_0x0033;
    L_0x0006:
        r3 = (com.iqoption.deposit.verification.a) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.verification.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        VerificationState ath = ath();
        int i = 0;
        int hashCode = (ath != null ? ath.hashCode() : 0) * 31;
        String message = getMessage();
        hashCode = (hashCode + (message != null ? message.hashCode() : 0)) * 31;
        List agZ = getData();
        if (agZ != null) {
            i = agZ.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CardsVerifyWarning(verificationState=");
        stringBuilder.append(ath());
        stringBuilder.append(", message=");
        stringBuilder.append(getMessage());
        stringBuilder.append(", data=");
        stringBuilder.append(getData());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(VerificationState verificationState, String str, List<c> list) {
        kotlin.jvm.internal.i.f(verificationState, "verificationState");
        this.cGD = verificationState;
        this.message = str;
        this.bxW = list;
    }

    public VerificationState ath() {
        return this.cGD;
    }

    public String getMessage() {
        return this.message;
    }

    /* renamed from: agZ */
    public List<c> getData() {
        return this.bxW;
    }

    public VerifySource atg() {
        return this.cGC;
    }
}
