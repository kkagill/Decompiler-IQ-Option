package com.iqoption.core.microservices.core.register;

import com.iqoption.core.d;
import com.iqoption.core.microservices.core.register.response.b;
import com.iqoption.core.microservices.core.register.response.c;
import io.reactivex.p;
import java.util.TimeZone;
import kotlin.i;
import okhttp3.FormBody;
import okhttp3.FormBody.Builder;
import okhttp3.Request;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ=\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016JW\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u001aJ&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004J_\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006#"}, bng = {"Lcom/iqoption/core/microservices/core/register/RegisterRequests;", "", "()V", "API_ANONYM_REGISTER", "", "API_DO_END_TRIAL", "API_DO_END_TRIAL_GDPR", "API_REGISTER", "API_REGISTER_CHECK", "API_REGISTER_GDPR", "anonymRegister", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/core/register/response/RegisterTrialResponse;", "endTrial", "Lcom/iqoption/core/microservices/core/register/response/RegisterResponse;", "email", "password", "currencyId", "", "countryId", "isGdpr", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Z)Lio/reactivex/Single;", "register", "firstName", "lastName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Z)Lio/reactivex/Single;", "registerCheck", "Lcom/iqoption/core/microservices/core/register/response/RegisterCheckResponse;", "socialId", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "userSocialId", "token", "registerSocial", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/core/register/SocialTypeId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Z)Lio/reactivex/Single;", "core_release"})
/* compiled from: RegisterRequests.kt */
public final class a {
    public static final a brS = new a();

    private a() {
    }

    public final p<c> Yo() {
        Builder builder = new Builder();
        TimeZone timeZone = TimeZone.getDefault();
        kotlin.jvm.internal.i.e(timeZone, "TimeZone.getDefault()");
        FormBody build = builder.add("tz", timeZone.getID()).build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Va());
        stringBuilder.append("api/anonymregister-trial-users");
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, RegisterRequests$anonymRegister$1.brT, null, null, 12, null);
    }

    public final p<b> a(String str, String str2, String str3, String str4, Long l, Long l2, boolean z) {
        kotlin.jvm.internal.i.f(str, "firstName");
        kotlin.jvm.internal.i.f(str2, "lastName");
        String str5 = "email";
        kotlin.jvm.internal.i.f(str3, str5);
        String str6 = z ? "api/register/gdpr" : "api/register";
        Builder add = new Builder().add(str5, str3).add("first_name", str).add("last_name", str2);
        TimeZone timeZone = TimeZone.getDefault();
        kotlin.jvm.internal.i.e(timeZone, "TimeZone.getDefault()");
        add = add.add("tz", timeZone.getID());
        if (str4 != null) {
            add.add("password", str4);
        }
        if (z) {
            add.add("is_gdpr_accepted", "1");
        }
        if (l != null) {
            add.add("currency_id", String.valueOf(l.longValue()));
        }
        if (l2 != null) {
            add.add("country_id", String.valueOf(l2.longValue()));
        }
        FormBody build = add.build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Va());
        stringBuilder.append(str6);
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, RegisterRequests$register$1.brV, null, null, 12, null);
    }

    public final p<com.iqoption.core.microservices.core.register.response.a> b(SocialTypeId socialTypeId, String str, String str2) {
        kotlin.jvm.internal.i.f(socialTypeId, "socialId");
        kotlin.jvm.internal.i.f(str, "userSocialId");
        Builder add = new Builder().add("social_id", String.valueOf(socialTypeId.getServerValue())).add("user_social_id", str);
        if (str2 != null) {
            add.add("token", str2);
        }
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Va());
        stringBuilder.append("api/register/check");
        Request.Builder post = a.url(stringBuilder.toString()).post(add.build());
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, RegisterRequests$registerCheck$1.brW, null, null, 12, null);
    }

    public final p<b> a(String str, String str2, String str3, SocialTypeId socialTypeId, String str4, String str5, Long l, Long l2, boolean z) {
        kotlin.jvm.internal.i.f(str, "firstName");
        kotlin.jvm.internal.i.f(str2, "lastName");
        String str6 = "email";
        kotlin.jvm.internal.i.f(str3, str6);
        kotlin.jvm.internal.i.f(socialTypeId, "socialId");
        kotlin.jvm.internal.i.f(str4, "userSocialId");
        String str7 = z ? "api/register/gdpr" : "api/register";
        Builder add = new Builder().add(str6, str3).add("first_name", str).add("last_name", str2).add("social_id", String.valueOf(socialTypeId.getServerValue())).add("user_social_id", str4);
        TimeZone timeZone = TimeZone.getDefault();
        kotlin.jvm.internal.i.e(timeZone, "TimeZone.getDefault()");
        add = add.add("tz", timeZone.getID());
        if (str5 != null) {
            add.add("token", str5);
        }
        if (z) {
            add.add("is_gdpr_accepted", "1");
        }
        if (l != null) {
            add.add("currency_id", String.valueOf(l.longValue()));
        }
        if (l2 != null) {
            add.add("country_id", String.valueOf(l2.longValue()));
        }
        FormBody build = add.build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Va());
        stringBuilder.append(str7);
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, RegisterRequests$registerSocial$1.brX, null, null, 12, null);
    }

    public final p<b> a(String str, String str2, Long l, Long l2, boolean z) {
        String str3 = "email";
        kotlin.jvm.internal.i.f(str, str3);
        String str4 = "password";
        kotlin.jvm.internal.i.f(str2, str4);
        String str5 = z ? "api/do-end-trial/gdpr" : "api/do-end-trial";
        Builder add = new Builder().add(str3, str).add(str4, str2);
        if (z) {
            add.add("is_gdpr_accepted", "1");
        }
        if (l != null) {
            add.add("currency_id", String.valueOf(l.longValue()));
        }
        if (l2 != null) {
            add.add("country_id", String.valueOf(l2.longValue()));
        }
        FormBody build = add.build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Va());
        stringBuilder.append(str5);
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, RegisterRequests$endTrial$1.brU, null, null, 12, null);
    }
}
