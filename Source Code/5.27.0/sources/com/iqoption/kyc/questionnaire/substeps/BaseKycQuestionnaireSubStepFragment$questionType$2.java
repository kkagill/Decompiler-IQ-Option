package com.iqoption.kyc.questionnaire.substeps;

import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "invoke"})
/* compiled from: BaseKycQuestionnaireSubStepFragment.kt */
final class BaseKycQuestionnaireSubStepFragment$questionType$2 extends Lambda implements a<QuestionnaireType> {
    final /* synthetic */ a this$0;

    BaseKycQuestionnaireSubStepFragment$questionType$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: aMV */
    public final QuestionnaireType invoke() {
        Serializable serializable = com.iqoption.core.ext.a.s(this.this$0).getSerializable("ARG_QUESTION_TYPE");
        if (serializable != null) {
            return (QuestionnaireType) serializable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType");
    }
}