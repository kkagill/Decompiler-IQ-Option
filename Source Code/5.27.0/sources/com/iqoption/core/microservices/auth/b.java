package com.iqoption.core.microservices.auth;

import com.iqoption.core.connect.http.a;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.microservices.auth.response.VerifyMethod;
import com.iqoption.core.microservices.auth.response.VerifyType;
import com.iqoption.core.microservices.auth.response.d;
import com.iqoption.core.microservices.auth.response.k;
import com.iqoption.core.util.t;
import io.reactivex.p;
import kotlin.i;
import okhttp3.MediaType;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004Jg\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJG\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010!J4\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, bng = {"Lcom/iqoption/core/microservices/auth/AuthRequestsV2;", "", "()V", "API_CHANGE_PASSWORD", "", "API_LOGIN", "API_RECOVERY", "API_REGISTER", "API_SOCIAL_LOGIN", "API_UPGRADE", "API_VERIFY", "JSON", "Lokhttp3/MediaType;", "login", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/auth/response/LoginResponseV2;", "identifier", "password", "token", "loginSocial", "appKey", "accessToken", "passwordChange", "newpassword", "confirmation", "passwordRecovery", "register", "accepted", "", "countryId", "", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lio/reactivex/Single;", "upgrade", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lio/reactivex/Single;", "verify", "Lcom/iqoption/core/microservices/auth/response/VerifyResponse;", "type", "Lcom/iqoption/core/microservices/auth/response/VerifyType;", "method", "Lcom/iqoption/core/microservices/auth/response/VerifyMethod;", "code", "core_release"})
/* compiled from: AuthRequestsV2.kt */
public final class b {
    public static final b blF = new b();
    private static final MediaType blz = MediaType.parse("application/json; charset=utf-8");

    private b() {
    }

    public final p<d> m(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "identifier");
        kotlin.jvm.internal.i.f(str2, "password");
        str = new t(new AuthRequestsV2$login$body$1(str, str2, str3)).toString();
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vd());
        stringBuilder.append("api/v2/login");
        Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, str));
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar, post, AuthRequestsV2$login$1.blG, a.bas, null, 8, null);
    }

    public final p<k> a(VerifyType verifyType, String str, VerifyMethod verifyMethod, String str2) {
        kotlin.jvm.internal.i.f(verifyType, "type");
        kotlin.jvm.internal.i.f(str, "token");
        str = new t(new AuthRequestsV2$verify$body$1(str, verifyMethod, str2)).toString();
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vd());
        stringBuilder.append("api/v2/verify/");
        stringBuilder.append(verifyType);
        Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, str));
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar, post, AuthRequestsV2$verify$1.blM, a.bas, null, 8, null);
    }

    public final p<d> aj(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "identifier");
        str = new t(new AuthRequestsV2$passwordRecovery$body$1(str, str2)).toString();
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vd());
        stringBuilder.append("api/v2/recover/password");
        Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, str));
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar, post, AuthRequestsV2$passwordRecovery$1.blJ, a.bas, null, 8, null);
    }

    public final p<d> n(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "newpassword");
        kotlin.jvm.internal.i.f(str2, "confirmation");
        str = new t(new AuthRequestsV2$passwordChange$body$1(str, str2, str3)).toString();
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vd());
        stringBuilder.append("api/v2/change/password");
        Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, str));
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar, post, AuthRequestsV2$passwordChange$1.blI, a.bas, null, 8, null);
    }

    public static /* synthetic */ p a(b bVar, String[] strArr, String str, String str2, String str3, String str4, String str5, Long l, int i, Object obj) {
        return bVar.a(strArr, (i & 2) != 0 ? (String) null : str, (i & 4) != 0 ? (String) null : str2, (i & 8) != 0 ? (String) null : str3, (i & 16) != 0 ? (String) null : str4, (i & 32) != 0 ? (String) null : str5, (i & 64) != 0 ? (Long) null : l);
    }

    public final p<d> a(String[] strArr, String str, String str2, String str3, String str4, String str5, Long l) {
        String[] strArr2 = strArr;
        kotlin.jvm.internal.i.f(strArr, "accepted");
        String tVar = new t(new AuthRequestsV2$register$body$1(strArr2, str, str2, str3, str4, str5, l)).toString();
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vd());
        stringBuilder.append("api/v2/register");
        Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, tVar));
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar, post, AuthRequestsV2$register$1.blK, a.bas, null, 8, null);
    }

    public final p<d> o(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "appKey");
        str = new t(new AuthRequestsV2$loginSocial$body$1(str, str2, str3)).toString();
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vd());
        stringBuilder.append("api/v2/oauth/login");
        Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, str));
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar, post, AuthRequestsV2$loginSocial$1.blH, a.bas, null, 8, null);
    }

    public final p<d> a(String[] strArr, String str, String str2, String str3, Long l) {
        kotlin.jvm.internal.i.f(strArr, "accepted");
        kotlin.jvm.internal.i.f(str, "identifier");
        kotlin.jvm.internal.i.f(str2, "password");
        String tVar = new t(new AuthRequestsV2$upgrade$body$1(strArr, str, str2, str3, l)).toString();
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vd());
        stringBuilder.append("api/v2/upgrade");
        Builder post = a.url(stringBuilder.toString()).post(RequestBody.create(blz, tVar));
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return c.b(cVar, post, AuthRequestsV2$upgrade$1.blL, a.bas, null, 8, null);
    }
}
