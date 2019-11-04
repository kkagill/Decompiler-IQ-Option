package com.iqoption.withdraw.fields.verify;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, bng = {"Lcom/iqoption/withdraw/fields/verify/DocWarning;", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "withdrawAction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "(Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;)V", "getWithdrawAction", "()Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "type", "Lcom/iqoption/withdraw/fields/verify/VerificationWarningType;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "withdraw_release"})
/* compiled from: VerificationWarnings.kt */
public final class b implements c {
    public static final Creator CREATOR = new a();
    private final com.iqoption.core.microservices.kyc.response.restriction.a esg;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b((com.iqoption.core.microservices.kyc.response.restriction.a) parcel.readParcelable(b.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.esg, ((com.iqoption.withdraw.fields.verify.b) r2).esg) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.withdraw.fields.verify.b;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.withdraw.fields.verify.b) r2;
        r0 = r1.esg;
        r2 = r2.esg;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.fields.verify.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        com.iqoption.core.microservices.kyc.response.restriction.a aVar = this.esg;
        return aVar != null ? aVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DocWarning(withdrawAction=");
        stringBuilder.append(this.esg);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeParcelable(this.esg, i);
    }

    public b(com.iqoption.core.microservices.kyc.response.restriction.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "withdrawAction");
        this.esg = aVar;
    }

    public final com.iqoption.core.microservices.kyc.response.restriction.a bcA() {
        return this.esg;
    }

    public VerificationWarningType bcz() {
        return VerificationWarningType.DOCUMENTS_WARNING;
    }
}
