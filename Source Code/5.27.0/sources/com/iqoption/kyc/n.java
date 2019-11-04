package com.iqoption.kyc;

import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.microservices.kyc.response.step.c;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J2\u0010\r\u001a\u0004\u0018\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, bng = {"Lcom/iqoption/kyc/ParticularStepInvoke;", "Lcom/iqoption/kyc/StepInvoke;", "step", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "(Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;)V", "getStep", "()Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "component1", "copy", "equals", "", "other", "", "getStepToOpen", "editableSteps", "", "onlyScreen", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "startSteps", "hashCode", "", "toString", "", "kyc_release"})
/* compiled from: StepInvoke.kt */
public final class n extends p {
    private final c dtd;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.dtd, ((com.iqoption.kyc.n) r2).dtd) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.kyc.n;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.kyc.n) r2;
        r0 = r1.dtd;
        r2 = r2.dtd;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        c cVar = this.dtd;
        return cVar != null ? cVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ParticularStepInvoke(step=");
        stringBuilder.append(this.dtd);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public n(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "step");
        super();
        this.dtd = cVar;
    }

    public c a(List<c> list, KycStepType kycStepType, List<? extends KycStepType> list2) {
        kotlin.jvm.internal.i.f(list, "editableSteps");
        for (Object next : list) {
            Object obj;
            if (((c) next).afH() == this.dtd.afH()) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return (c) next2;
    }
}
