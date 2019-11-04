package com.iqoption.core.microservices.kyc;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.k;
import com.iqoption.core.d;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.e;
import com.iqoption.core.microservices.kyc.response.questionnaire.g;
import com.iqoption.core.microservices.kyc.response.questionnaire.governance.GovernanceStatus;
import com.iqoption.core.microservices.kyc.response.questionnaire.j;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fJ\u001c\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/kyc/KycQuestionnaireRequests;", "", "()V", "CMD_GET_KYC_QUESTIONNAIRE", "", "CMD_GET_KYC_QUESTIONNAIRES", "CMD_GET_KYC_RISK_WARNING", "CMD_GET_PRODUCT_GOVERNANCE_VALUE", "CMD_PUT_KYC_QUESTIONNAIRE", "CMD_PUT_KYC_RISK_WARNING", "CMD_PUT_PRODUCT_GOVERNANCE", "getKycQuestionnaire", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "getKycQuestionnaires", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnairesItem;", "getKycRiskWarning", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycRiskWarning;", "getProductGovernance", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/ProductGovernance;", "putKycQuestionnaire", "Lio/reactivex/Completable;", "questions", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/PutKycQuestionnaireItem;", "putKycRiskWarning", "agree", "", "signature", "putProductGovernance", "value", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;", "core_release"})
/* compiled from: KycQuestionnaireRequests.kt */
public final class b {
    public static final b buq = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/microservices/kyc/KycQuestionnaireRequests$getKycQuestionnaires$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnairesItem;", "core_release"})
    /* compiled from: KycQuestionnaireRequests.kt */
    public static final class a extends TypeToken<List<? extends e>> {
        a() {
        }
    }

    private b() {
    }

    public final p<List<e>> aew() {
        k EV = d.EV();
        Type type = new a().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<List<…ionnairesItem>>() {}.type");
        return EV.a("get-kyc-questionnaires", type).fp("1.0").UB();
    }

    public final p<com.iqoption.core.microservices.kyc.response.questionnaire.d> a(QuestionnaireType questionnaireType) {
        String str = "type";
        kotlin.jvm.internal.i.f(questionnaireType, str);
        return d.EV().a("get-kyc-questionnaire", com.iqoption.core.microservices.kyc.response.questionnaire.d.class).k(str, questionnaireType.getServerValue()).fp("2.0").UB();
    }

    public final io.reactivex.a a(QuestionnaireType questionnaireType, List<j> list) {
        String str = "type";
        kotlin.jvm.internal.i.f(questionnaireType, str);
        String str2 = "questions";
        kotlin.jvm.internal.i.f(list, str2);
        JsonElement toJsonTree = d.Ez().toJsonTree(list);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(str, (Number) questionnaireType.getServerValue());
        jsonObject.add(str2, toJsonTree);
        io.reactivex.a blf = d.EV().a("put-kyc-questionnaire", com.iqoption.core.connect.a.Uv()).fp("1.0").c(jsonObject).UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory.cr…         .ignoreElement()");
        return blf;
    }

    public final p<g> aex() {
        return d.EV().a("get-kyc-risk-warning", g.class).fp("2.0").UB();
    }

    public final io.reactivex.a e(boolean z, String str) {
        String str2 = "agree";
        com.iqoption.core.connect.j k = d.EV().a("put-kyc-risk-warning", com.iqoption.core.connect.a.Uv()).fp("1.0").k(str2, Boolean.valueOf(z));
        if (str != null) {
            k.k("signature", str);
        }
        io.reactivex.a blf = k.UB().blf();
        kotlin.jvm.internal.i.e(blf, "request.exec()\n                .ignoreElement()");
        return blf;
    }

    public final p<com.iqoption.core.microservices.kyc.response.questionnaire.governance.a> aey() {
        return d.EV().a("get-product-governance-value", com.iqoption.core.microservices.kyc.response.questionnaire.governance.a.class).fp("1.0").UB();
    }

    public final io.reactivex.a a(GovernanceStatus governanceStatus) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(ConditionalUserProperty.VALUE, governanceStatus != null ? governanceStatus.getServerValue() : null);
        io.reactivex.a blf = d.EV().a("put-product-governance", com.iqoption.core.connect.a.Uv()).c(jsonObject).fp("1.0").UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory.cr…         .ignoreElement()");
        return blf;
    }
}
