package com.iqoption.core.microservices.kyc;

import com.iqoption.core.microservices.kyc.response.Gender;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.h;
import com.iqoption.core.microservices.kyc.response.j;
import com.iqoption.core.microservices.kyc.response.k;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import io.reactivex.b.g;
import io.reactivex.b.l;
import io.reactivex.e;
import io.reactivex.p;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0017J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0017J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0017J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001bJ\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020-2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204Jd\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00172\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006@"}, bng = {"Lcom/iqoption/core/microservices/kyc/KycRequests;", "", "()V", "CMD_GET_CUSTOMER_STEPS", "", "CMD_GET_PROFILE_FIELDS", "CMD_GET_RESTRICTIONS", "CMD_GET_VERIFICATION_INIT_DATA", "CMD_GET_VERIFICATION_LEVEL", "CMD_PUT_CUSTOMER_TIN", "CMD_SET_REQUIREMENT_SHOWN", "CMD_SET_VERIFICATION_CONTEXT", "CMD_SKIP_VERIFICATION_STEP", "CMD_UPDATE_USER_PROFILE", "EVENT_CUSTOMER_STEPS_DATA_UPDATED", "EVENT_RESTRICTION_DATA_CHANGED", "EVENT_VERIFICATION_LEVEL_UPDATED", "FLOW_ID", "dateFormat", "Ljava/text/DateFormat;", "getDateFormat", "()Ljava/text/DateFormat;", "getCustomerSteps", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getCustomerStepsUpdated", "Lio/reactivex/Flowable;", "getProfileFields", "Lcom/iqoption/core/microservices/kyc/response/ProfileFieldsResponse;", "getRestrictionDataChanged", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionDataChanged;", "getRestrictions", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionsData;", "getVerificationInitData", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "getVerificationLevel", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "getVerificationLevelUpdates", "putCustomerTin", "Lcom/iqoption/core/microservices/kyc/response/PutCustomerTinResult;", "countryId", "", "tin", "setRequirementShown", "Lio/reactivex/Completable;", "requirementId", "setVerificationContext", "context", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "skipVerificationStep", "stepType", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "updateUserProfile", "Lcom/iqoption/core/microservices/kyc/response/UpdateProfileResult;", "firstName", "lastName", "birthDate", "gender", "Lcom/iqoption/core/microservices/kyc/response/Gender;", "nationality", "city", "address", "postalIndex", "core_release"})
/* compiled from: KycRequests.kt */
public final class c {
    private static final DateFormat buo = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    public static final c bur = new c();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "it", "Lcom/iqoption/core/microservices/kyc/response/step/CustomerStepsResult;", "apply"})
    /* compiled from: KycRequests.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bus = new a();

        a() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.kyc.response.step.c> apply(com.iqoption.core.microservices.kyc.response.step.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return bVar.afF();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/step/CustomerStepsEvent;", "test"})
    /* compiled from: KycRequests.kt */
    static final class b<T> implements l<com.iqoption.core.microservices.kyc.response.step.a> {
        public static final b but = new b();

        b() {
        }

        /* renamed from: a */
        public final boolean test(com.iqoption.core.microservices.kyc.response.step.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return kotlin.jvm.internal.i.y(aVar.afG(), "MOBILE2");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "it", "Lcom/iqoption/core/microservices/kyc/response/step/CustomerStepsEvent;", "apply"})
    /* compiled from: KycRequests.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c buu = new c();

        c() {
        }

        /* renamed from: b */
        public final List<com.iqoption.core.microservices.kyc.response.step.c> apply(com.iqoption.core.microservices.kyc.response.step.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.afF();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "it", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelDataUpdate;", "apply"})
    /* compiled from: KycRequests.kt */
    static final class d<T, R> implements g<T, R> {
        public static final d buv = new d();

        d() {
        }

        /* renamed from: a */
        public final k apply(com.iqoption.core.microservices.kyc.response.l lVar) {
            kotlin.jvm.internal.i.f(lVar, "it");
            return lVar.aeM();
        }
    }

    static {
        buo.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private c() {
    }

    public final DateFormat aes() {
        return buo;
    }

    public final p<j> aez() {
        return com.iqoption.core.d.EV().a("get-verification-init-data", j.class).k("enable_context", Boolean.valueOf(true)).fp("1.0").UB();
    }

    public final e<k> aeA() {
        e blb = com.iqoption.core.d.EW().b("verification-level-updated", com.iqoption.core.microservices.kyc.response.l.class).HO().HQ().g(d.buv).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public static final p<h> a(String str, String str2, String str3, Gender gender, String str4, long j, String str5, String str6, String str7, String str8) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str8;
        kotlin.jvm.internal.i.f(str, "firstName");
        kotlin.jvm.internal.i.f(str10, "lastName");
        kotlin.jvm.internal.i.f(str11, "birthDate");
        String str16 = "gender";
        kotlin.jvm.internal.i.f(gender, str16);
        String str17 = "nationality";
        kotlin.jvm.internal.i.f(str12, str17);
        String str18 = "city";
        kotlin.jvm.internal.i.f(str13, str18);
        String str19 = "address";
        kotlin.jvm.internal.i.f(str14, str19);
        str11 = "country_id";
        com.iqoption.core.connect.j fp = com.iqoption.core.d.EV().a("update-user-profile", h.class).k("first_name", str).k("last_name", str10).k("birthdate", str11).k(str16, gender.getServerValue()).k(str17, str12).k(str11, Long.valueOf(j)).k(str18, str13).k(str19, str14).k("postal_index", str7).fp("1.0");
        if (str15 != null) {
            fp.k("tin", str15);
        }
        return fp.UB();
    }

    public final p<List<com.iqoption.core.microservices.kyc.response.step.c>> aeB() {
        p t = com.iqoption.core.d.EV().a("get-customer-steps", com.iqoption.core.microservices.kyc.response.step.b.class).k("flow_id", "MOBILE2").fp("2.0").UB().t(a.bus);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory.cr…        .map { it.steps }");
        return t;
    }

    public final e<List<com.iqoption.core.microservices.kyc.response.step.c>> aeC() {
        e blb = com.iqoption.core.d.EW().b("customer-steps-data-updated", com.iqoption.core.microservices.kyc.response.step.a.class).i("flow_id", "MOBILE2").HO().HQ().b((l) b.but).g(c.buu).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final io.reactivex.a a(KycStepType kycStepType) {
        kotlin.jvm.internal.i.f(kycStepType, "stepType");
        String str = "step_id";
        io.reactivex.a blf = com.iqoption.core.d.EV().a("skip-verification-step", com.iqoption.core.microservices.kyc.response.step.g.class).k(str, kycStepType.getServerValue()).fp("1.0").UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory.cr…         .ignoreElement()");
        return blf;
    }

    public final p<com.iqoption.core.microservices.kyc.response.b> aeD() {
        return com.iqoption.core.d.EV().a("get-profile-fields", com.iqoption.core.microservices.kyc.response.b.class).fp("1.0").UB();
    }

    public final p<com.iqoption.core.microservices.kyc.response.c> g(long j, String str) {
        String str2 = "tin";
        kotlin.jvm.internal.i.f(str, str2);
        return com.iqoption.core.d.EV().a("put-customer-tin", com.iqoption.core.microservices.kyc.response.c.class).k("countryId", Long.valueOf(j)).k(str2, str).fp("2.0").eG(0).UB();
    }

    public final io.reactivex.a b(KycVerificationContext kycVerificationContext) {
        String str = "context";
        kotlin.jvm.internal.i.f(kycVerificationContext, str);
        io.reactivex.a blf = com.iqoption.core.d.EV().a("set-verification-context", com.iqoption.core.connect.a.Uv()).k(str, kycVerificationContext.getServerValue()).fp("1.0").UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory.cr…         .ignoreElement()");
        return blf;
    }

    public final p<com.iqoption.core.microservices.kyc.response.restriction.d> aeE() {
        return com.iqoption.core.d.EV().a("get-restrictions", com.iqoption.core.microservices.kyc.response.restriction.d.class).fp("1.0").UB();
    }

    public final e<com.iqoption.core.microservices.kyc.response.restriction.c> aeF() {
        return com.iqoption.core.d.EW().b("restriction-data-changed", com.iqoption.core.microservices.kyc.response.restriction.c.class).HQ();
    }

    public final io.reactivex.a gG(String str) {
        kotlin.jvm.internal.i.f(str, "requirementId");
        io.reactivex.a blf = com.iqoption.core.d.EV().a("set-requirement-shown", com.iqoption.core.connect.a.Uv()).k("requirement_id", str).fp("1.0").UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory.cr…         .ignoreElement()");
        return blf;
    }
}
