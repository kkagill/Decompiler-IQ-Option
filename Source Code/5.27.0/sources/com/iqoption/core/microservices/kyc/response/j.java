package com.iqoption.core.microservices.kyc.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.kyc.response.requirement.b;
import com.iqoption.core.microservices.kyc.response.restriction.d;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "", "verificationLevelData", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "stepsSummary", "Lcom/iqoption/core/microservices/kyc/response/StepsSummary;", "restrictionsData", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionsData;", "requirementsData", "Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirementData;", "(Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;Lcom/iqoption/core/microservices/kyc/response/StepsSummary;Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionsData;Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirementData;)V", "getRequirementsData", "()Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirementData;", "getRestrictionsData", "()Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionsData;", "getStepsSummary", "()Lcom/iqoption/core/microservices/kyc/response/StepsSummary;", "getVerificationLevelData", "()Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: VerificationInitData.kt */
public final class j {
    @SerializedName("verification_level_data")
    private final k buI;
    @SerializedName("steps_summary")
    private final f buJ;
    @SerializedName("restrictions_data")
    private final d buK;
    @SerializedName("requirements_data")
    private final b buL;

    public static /* synthetic */ j a(j jVar, k kVar, f fVar, d dVar, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = jVar.buI;
        }
        if ((i & 2) != 0) {
            fVar = jVar.buJ;
        }
        if ((i & 4) != 0) {
            dVar = jVar.buK;
        }
        if ((i & 8) != 0) {
            bVar = jVar.buL;
        }
        return jVar.a(kVar, fVar, dVar, bVar);
    }

    public final j a(k kVar, f fVar, d dVar, b bVar) {
        kotlin.jvm.internal.i.f(kVar, "verificationLevelData");
        return new j(kVar, fVar, dVar, bVar);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.buL, r3.buL) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.j;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.j) r3;
        r0 = r2.buI;
        r1 = r3.buI;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.buJ;
        r1 = r3.buJ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.buK;
        r1 = r3.buK;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.buL;
        r3 = r3.buL;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        k kVar = this.buI;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        f fVar = this.buJ;
        hashCode = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        d dVar = this.buK;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        b bVar = this.buL;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerificationInitData(verificationLevelData=");
        stringBuilder.append(this.buI);
        stringBuilder.append(", stepsSummary=");
        stringBuilder.append(this.buJ);
        stringBuilder.append(", restrictionsData=");
        stringBuilder.append(this.buK);
        stringBuilder.append(", requirementsData=");
        stringBuilder.append(this.buL);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public j(k kVar, f fVar, d dVar, b bVar) {
        kotlin.jvm.internal.i.f(kVar, "verificationLevelData");
        this.buI = kVar;
        this.buJ = fVar;
        this.buK = dVar;
        this.buL = bVar;
    }

    public final k aeH() {
        return this.buI;
    }

    public /* synthetic */ j(k kVar, f fVar, d dVar, b bVar, int i, f fVar2) {
        if ((i & 2) != 0) {
            fVar = (f) null;
        }
        if ((i & 4) != 0) {
            dVar = (d) null;
        }
        if ((i & 8) != 0) {
            bVar = (b) null;
        }
        this(kVar, fVar, dVar, bVar);
    }

    public final b aeI() {
        return this.buL;
    }
}
