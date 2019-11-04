package com.iqoption.microservice.b.a;

import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.kyc.b;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.d;
import com.iqoption.core.microservices.kyc.response.questionnaire.e;
import com.iqoption.core.microservices.kyc.response.questionnaire.j;
import com.iqoption.core.rx.g;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¨\u0006\u0015"}, bng = {"Lcom/iqoption/microservice/kyc/questionnaire/KycQuestionnaireRequestsOld;", "", "()V", "getKycQuestionnaire", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "getKycQuestionnaires", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnairesItem;", "getKycRiskWarning", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "putKycQuestionnaire", "questions", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/PutKycQuestionnaireItem;", "putKycRiskWarning", "agree", "", "signature", "", "app_optionXRelease"})
/* compiled from: KycQuestionnaireRequestsOld.kt */
public final class a {
    public static final a dGF = new a();

    private a() {
    }

    public final t<d> b(QuestionnaireType questionnaireType) {
        kotlin.jvm.internal.i.f(questionnaireType, "type");
        return g.a(b.buq.a(questionnaireType), null, 1, null);
    }

    public final t<List<e>> aOe() {
        return g.a(b.buq.aew(), null, 1, null);
    }

    public final t<com.iqoption.core.microservices.kyc.response.questionnaire.g> aOf() {
        return g.a(b.buq.aex(), null, 1, null);
    }

    public final t<Object> b(QuestionnaireType questionnaireType, List<j> list) {
        kotlin.jvm.internal.i.f(questionnaireType, "type");
        kotlin.jvm.internal.i.f(list, "questions");
        return g.a(b.buq.a(questionnaireType, list), null, 1, null);
    }

    public final t<Object> h(boolean z, String str) {
        return g.a(b.buq.e(z, str), null, 1, null);
    }
}
