package com.iqoption.core.microservices.auth;

import com.iqoption.core.d;
import com.iqoption.core.microservices.auth.response.c;
import io.reactivex.p;
import java.util.List;
import kotlin.i;
import okhttp3.FormBody;
import okhttp3.FormBody.Builder;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0017J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004J9\u0010#\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020$J\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010)\u001a\u00020\u0004J\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000403R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00064"}, bng = {"Lcom/iqoption/core/microservices/auth/AuthRequests;", "", "()V", "API_CHANGE_PASS", "", "API_CHANGE_PASS_OLD", "API_LOGIN", "API_LOGIN_TOKEN", "API_LOGOUT", "API_OAUTH_GOOGLE_EXCHANGE", "API_RETRIEVING", "API_TOKEN", "CMD_GET_SESSIONS", "CMD_TERMINATE_SESSIONS", "JSON", "Lokhttp3/MediaType;", "SOCIAL_ID_FB", "SOCIAL_ID_GP", "SOCIAL_ID_MAIL", "SOCIAL_ID_OK", "SOCIAL_ID_TW", "SOCIAL_ID_VK", "changePassword", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/auth/response/ResponseV2;", "current", "newPass", "repeatPass", "generateAutoLoginToken", "getAccessToken", "Lcom/iqoption/core/microservices/auth/response/AccessTokenResponse;", "clientId", "code", "getSessions", "Lcom/iqoption/core/microservices/auth/response/SessionsResponse;", "login", "Lio/reactivex/Completable;", "userId", "", "token", "Lcom/iqoption/core/microservices/auth/response/LoginResponse;", "email", "password", "authCode", "authCodeResend", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Single;", "logout", "passwordRecoveryRequest", "terminateSessions", "terminateIds", "", "core_release"})
/* compiled from: AuthRequests.kt */
public final class a {
    public static final a blA = new a();
    private static final MediaType blz = MediaType.parse("application/json; charset=utf-8");

    private a() {
    }

    public final p<com.iqoption.core.microservices.auth.response.i> Ze() {
        return d.EV().a("get-sessions", com.iqoption.core.microservices.auth.response.i.class).UB();
    }

    public final p<com.iqoption.core.microservices.auth.response.i> az(List<String> list) {
        kotlin.jvm.internal.i.f(list, "terminateIds");
        return d.EV().a("terminate-sessions", com.iqoption.core.microservices.auth.response.i.class).k("match", list).UB();
    }

    public final p<c> b(String str, String str2, String str3, Boolean bool) {
        String str4 = "email";
        kotlin.jvm.internal.i.f(str, str4);
        String str5 = "password";
        kotlin.jvm.internal.i.f(str2, str5);
        Builder add = new Builder().add(str4, str).add(str5, str2);
        if (str3 != null) {
            add.add("auth_code", str3);
        }
        if (bool != null) {
            add.add("auth_code_resend", String.valueOf(bool.booleanValue()));
        }
        FormBody build = add.build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Vd());
        stringBuilder.append("api/v1.0/login");
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, AuthRequests$login$1.blD, com.iqoption.core.connect.http.a.bas, null, 8, null);
    }

    public final p<String> Zf() {
        FormBody build = new Builder().build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Vd());
        stringBuilder.append("api/v1.0/token");
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, AuthRequests$generateAutoLoginToken$1.blB, null, null, 12, null);
    }

    public final io.reactivex.a Yp() {
        FormBody build = new Builder().build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Vd());
        stringBuilder.append("api/v1.0/logout");
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        io.reactivex.a blm = com.iqoption.core.connect.http.c.b(cVar, post, com.iqoption.core.connect.http.d.UP(), com.iqoption.core.connect.http.a.bas, null, 8, null).blm();
        kotlin.jvm.internal.i.e(blm, "Http.executeSingle(build…alidator).toCompletable()");
        return blm;
    }

    public final p<String> ga(String str) {
        String str2 = "email";
        kotlin.jvm.internal.i.f(str, str2);
        FormBody build = new Builder().add(str2, str).build();
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Va());
        stringBuilder.append("api/auth/retrieving");
        Request.Builder post = a.url(stringBuilder.toString()).post(build);
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, AuthRequests$passwordRecoveryRequest$1.blE, null, null, 12, null);
    }

    public final p<com.iqoption.core.microservices.auth.response.a> ai(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "clientId");
        kotlin.jvm.internal.i.f(str2, "code");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n            \"client_id\":\"");
        stringBuilder.append(str);
        stringBuilder.append("\",\n            \"code\":\"");
        stringBuilder.append(str2);
        stringBuilder.append("\",\n            \"redirect_uri\":\"\"\n        }");
        str = n.b(stringBuilder.toString(), null, 1, null);
        Request.Builder a = com.iqoption.core.connect.http.c.a(com.iqoption.core.connect.http.c.baF, new Request.Builder(), null, 1, null);
        stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Vd());
        stringBuilder.append("api/v1.0/oauth/google/exchange");
        Request.Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, str));
        com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return com.iqoption.core.connect.http.c.b(cVar, post, AuthRequests$getAccessToken$1.blC, null, null, 12, null);
    }
}
