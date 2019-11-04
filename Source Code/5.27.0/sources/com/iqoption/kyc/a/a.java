package com.iqoption.kyc.a;

import com.google.gson.JsonObject;
import com.iqoption.core.analytics.b;
import com.iqoption.core.d;
import com.iqoption.core.util.u;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\"\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0004H\u0007J4\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J.\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002J$\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J,\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J.\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J.\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J,\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J$\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJL\u0010!\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010\u0006J<\u0010(\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0006H\u0007J,\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J,\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u0006H\u0007J.\u00100\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J$\u00101\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J4\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J,\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u00042\b\b\u0001\u00109\u001a\u00020\u00062\b\b\u0001\u0010:\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010;\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ.\u0010<\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010=\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010>\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010?\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010@\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ8\u0010A\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010B\u001a\u00020$2\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010C\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010D\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010E\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010F\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ,\u0010G\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006H"}, bng = {"Lcom/iqoption/kyc/analytics/KycAnalyticsEventUtils;", "", "()V", "createOpenScreenEvent", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "stageName", "", "screenName", "isRegulated", "", "createTraderoomBlockedEvent", "getChooseCountryParameters", "Lcom/google/gson/JsonObject;", "countryId", "", "country", "getContinueEventParameters", "screenNameToContinue", "getEventParameterIsRegulated", "getEventParameters", "getIsCitizenParameters", "warningText", "getJumioResponseEventParameters", "errorResponse", "getReturnEventParameters", "screenNameToReturn", "getTextChangedEventParameters", "fieldName", "getWarningEventParameters", "sendAttachDocumentLaterEvent", "", "sendButtonPressedEvent", "eventName", "sendChooseAnswerEvent", "questionText", "questionId", "", "answersIds", "", "answerText", "sendChooseCountryEvent", "countryName", "sendChooseSexEvent", "isMale", "sendChooseUsReportableEvent", "isUsReportable", "sendComlianceFailedEvent", "json", "sendContinueEvent", "sendDoneEvent", "sendIsCitizenEvent", "isCitizen", "sendJumioOpenEvent", "sendJumioResponseEvent", "isSuccess", "sendOpenScreenEvent", "openEvent", "stage", "screen", "sendPhoneCodeResendEvent", "sendReturnEvent", "sendRiskDisclosureDoneEvent", "sendRiskDisclosureEvent", "sendSaveProfileEvent", "sendSupportEvent", "sendTextChangedEvent", "fieldId", "sendUploadDocumentErrorEvent", "sendUploadDocumentsEvent", "sendVerifyEvent", "sendVideoTutorialEvent", "sendWarningEvent", "kyc_release"})
/* compiled from: KycAnalyticsEventUtils.kt */
public final class a {
    public static final a dtL = new a();

    private a() {
    }

    private final JsonObject h(String str, String str2, boolean z) {
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).o("stage_name", str).o("screen_name", str2).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    private final JsonObject ez(boolean z) {
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    private final JsonObject a(String str, String str2, String str3, boolean z) {
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).o("stage_name", str).o("screen_name", str2).o("field_name", str3).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    private final JsonObject b(String str, String str2, String str3, boolean z) {
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).o("stage_name", str).o("screen_name", str2).o("screen_name_to_return", str3).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    private final JsonObject v(String str, boolean z) {
        if (str == null) {
            return ez(z);
        }
        JsonObject anr = u.anp().o("error_response", str).o("is_regulated", Boolean.valueOf(z)).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…                 .build()");
        return anr;
    }

    private final JsonObject c(String str, String str2, String str3, boolean z) {
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).o("stage_name", str).o("screen_name", str2).o("screen_name_to_continue", str3).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    private final JsonObject d(String str, String str2, String str3, boolean z) {
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).o("stage_name", str).o("screen_name", str2).o("warning_text", str3).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    private final JsonObject e(String str, String str2, String str3, boolean z) {
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).o("stage_name", str).o("screen_name", str2).o("warning_text", str3).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    private final JsonObject a(String str, String str2, boolean z, long j, String str3) {
        String str4 = "country_id";
        JsonObject anr = u.anp().o("is_regulated", Boolean.valueOf(z)).o("stage_name", str).o("screen_name", str2).o(str4, Long.valueOf(j)).o("country_name", str3).anr();
        kotlin.jvm.internal.i.e(anr, "JsonUtils.createJsonBuil…\n                .build()");
        return anr;
    }

    public final b i(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        b h = d.EC().h("kyc_new-screen", 0.0d, h(str, str2, z));
        kotlin.jvm.internal.i.e(h, "analytics.createScreenOp…screenName, isRegulated))");
        return h;
    }

    public static final b aKm() {
        b dm = d.EC().dm("kyc_new-screen");
        kotlin.jvm.internal.i.e(dm, "analytics.createScreenOp…edEvent(\"kyc_new-screen\")");
        return dm;
    }

    public static final void a(b bVar, String str, String str2, boolean z) {
        JsonObject ez;
        kotlin.jvm.internal.i.f(bVar, "openEvent");
        kotlin.jvm.internal.i.f(str, "stage");
        kotlin.jvm.internal.i.f(str2, "screen");
        if (kotlin.jvm.internal.i.y("TraderoomBlocked", str)) {
            ez = dtL.ez(z);
        } else {
            ez = dtL.h(str, str2, z);
        }
        bVar.a(ez);
        bVar.Cc();
    }

    public static final void a(String str, String str2, String str3, int i, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        kotlin.jvm.internal.i.f(str3, "fieldName");
        d.EC().e("kyc_focus-on-field", (double) i, dtL.a(str, str2, str3, z));
    }

    public static final void f(String str, String str2, String str3, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        kotlin.jvm.internal.i.f(str3, "screenNameToReturn");
        d.EC().a("kyc_return", 0.0d, dtL.b(str, str2, str3, z));
    }

    public static final void g(String str, String str2, String str3, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        kotlin.jvm.internal.i.f(str3, "screenNameToContinue");
        d.EC().a("kyc_continue", 0.0d, dtL.c(str, str2, str3, z));
    }

    public static final void h(String str, String str2, String str3, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        kotlin.jvm.internal.i.f(str3, "warningText");
        d.EC().g("kyc_warning", 0.0d, dtL.d(str, str2, str3, z)).Cc();
    }

    public static final void j(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_done", 0.0d, dtL.h(str, str2, z));
    }

    public static final void k(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_risk-disclosure", 0.0d, dtL.h(str, str2, z));
    }

    public static final void l(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_risk-disclosure-done", 0.0d, dtL.h(str, str2, z));
    }

    public static final void eA(boolean z) {
        d.EC().g("kyc_jumio-open", 0.0d, dtL.ez(z)).Cc();
    }

    public static final void a(boolean z, String str, boolean z2) {
        d.EC().g("kyc_jumio-response", z ? 1.0d : 0.0d, dtL.v(str, z2)).Cc();
    }

    public static final void w(String str, boolean z) {
        d.EC().a("kyc_upload-document-error", 0.0d, dtL.v(str, z), false);
    }

    public static final void m(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_attach-doc-later", 1.0d, dtL.h(str, str2, z));
    }

    public static final void a(boolean z, String str, String str2, String str3, boolean z2) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        kotlin.jvm.internal.i.f(str3, "warningText");
        d.EC().a("kyc_is-citizen", z ? 1.0d : 0.0d, dtL.e(str, str2, str3, z2));
    }

    public static final void b(boolean z, String str, boolean z2) {
        d.EC().a("kyc_save-profile", z ? 1.0d : 0.0d, dtL.v(str, z2), false);
    }

    public static final void a(boolean z, String str, String str2, boolean z2) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_choose-sex", z ? 1.0d : 0.0d, dtL.h(str, str2, z2));
    }

    public static final void b(boolean z, String str, String str2, boolean z2) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_choose-us-reportable", z ? 1.0d : 0.0d, dtL.h(str, str2, z2));
    }

    public final void n(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_support", 0.0d, h(str, str2, z));
    }

    public final void o(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_resend", 0.0d, h(str, str2, z));
    }

    public static final void a(String str, String str2, String str3, boolean z, long j, String str4) {
        kotlin.jvm.internal.i.f(str, "eventName");
        kotlin.jvm.internal.i.f(str2, "stageName");
        kotlin.jvm.internal.i.f(str3, "screenName");
        kotlin.jvm.internal.i.f(str4, "countryName");
        d.EC().d(str, 0.0d, dtL.a(str2, str3, z, j, str4));
    }

    public final void p(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_video-tutorial", 1.0d, h(str, str2, z));
    }

    public final void q(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        d.EC().a("kyc_upload-documents", 1.0d, h(str, str2, z));
    }

    public final void i(String str, String str2, String str3, boolean z) {
        kotlin.jvm.internal.i.f(str, "eventName");
        kotlin.jvm.internal.i.f(str2, "stageName");
        kotlin.jvm.internal.i.f(str3, "screenName");
        d.EC().a(str, 0.0d, h(str2, str3, z));
    }

    public static final void eB(boolean z) {
        d.EC().a("kyc_verify-your-account", 0.0d, dtL.ez(z));
    }

    public final void a(String str, String str2, boolean z, String str3, int i, List<Integer> list, String str4) {
        String str5 = str3;
        String str6 = str4;
        String str7 = str;
        kotlin.jvm.internal.i.f(str, "stageName");
        kotlin.jvm.internal.i.f(str2, "screenName");
        kotlin.jvm.internal.i.f(str5, "questionText");
        com.iqoption.core.analytics.d EC = d.EC();
        JsonObject h = h(str, str2, z);
        h.addProperty("question_text", str5);
        h.addProperty("question_id", (Number) Integer.valueOf(i));
        if (list != null) {
            h.addProperty("answers_ids", u.a(list, ";", null, null, 0, null, null, 62, null));
        }
        if (str6 != null) {
            h.addProperty("answer_texts", str6);
        }
        EC.a("kyc_choose-answer", 0.0d, h);
    }
}
