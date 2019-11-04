package com.iqoption.kyc.questionnaire.substeps;

import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/kyc/questionnaire/substeps/QuestionSubStep;", "", "item", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "(Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;)V", "getItem", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "getType", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kyc_release"})
/* compiled from: QuestionSubStep.kt */
public final class f {
    private final QuestionnaireType bvm;
    private final com.iqoption.core.microservices.kyc.response.questionnaire.f dDR;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bvm, r3.bvm) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.kyc.questionnaire.substeps.f;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.kyc.questionnaire.substeps.f) r3;
        r0 = r2.dDR;
        r1 = r3.dDR;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bvm;
        r3 = r3.bvm;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.questionnaire.substeps.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        com.iqoption.core.microservices.kyc.response.questionnaire.f fVar = this.dDR;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        QuestionnaireType questionnaireType = this.bvm;
        if (questionnaireType != null) {
            i = questionnaireType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("QuestionSubStep(item=");
        stringBuilder.append(this.dDR);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bvm);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(com.iqoption.core.microservices.kyc.response.questionnaire.f fVar, QuestionnaireType questionnaireType) {
        kotlin.jvm.internal.i.f(fVar, "item");
        kotlin.jvm.internal.i.f(questionnaireType, "type");
        this.dDR = fVar;
        this.bvm = questionnaireType;
    }

    public final com.iqoption.core.microservices.kyc.response.questionnaire.f aMZ() {
        return this.dDR;
    }

    public final QuestionnaireType afc() {
        return this.bvm;
    }
}
