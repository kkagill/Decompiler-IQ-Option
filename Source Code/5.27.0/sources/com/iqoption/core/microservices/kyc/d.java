package com.iqoption.core.microservices.kyc;

import androidx.core.app.NotificationCompat;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.microservices.kyc.response.e;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.p;
import kotlin.i;
import okhttp3.FormBody;
import okhttp3.Request.Builder;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nJ\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/kyc/PhoneRequests;", "", "()V", "API_PROFILE_AUTH_TWO_FACTOR", "", "CMD_API_SEND_PHONE_CONFIRMATION", "CMD_PROXY_CONFIRM_PHONE", "CMD_SAVE_PHONE", "TAG", "confirmPhone", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/kyc/response/ConfirmPhoneResult;", "code", "savePhone", "Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "number", "sendPhoneConfirmation", "Lcom/iqoption/core/microservices/kyc/response/SendPhoneConfirmationResponse;", "twoFactorAuth", "Lcom/iqoption/core/microservices/kyc/response/TwoFactorResponse;", "enable", "", "core_release"})
/* compiled from: PhoneRequests.kt */
public final class d {
    private static final String TAG;
    public static final d buw = new d();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/ConfirmPhoneResult;", "it", "", "apply"})
    /* compiled from: PhoneRequests.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bux = new a();

        a() {
        }

        /* renamed from: bO */
        public final com.iqoption.core.microservices.kyc.response.a apply(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return com.iqoption.core.microservices.kyc.response.a.buD;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneRequests.kt */
    static final class b<T> implements f<com.iqoption.core.microservices.kyc.response.d> {
        public static final b buA = new b();

        b() {
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.d dVar) {
        }
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    private d() {
    }

    public final p<e> aeG() {
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.Um().EE().Vb());
        stringBuilder.append("/api/sendphoneconfirmation");
        Builder builder = a.url(stringBuilder.toString()).get();
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(builder, "builder");
        return c.b(cVar, builder, PhoneRequests$sendPhoneConfirmation$1.buB, null, null, 12, null);
    }

    public static final p<com.iqoption.core.microservices.kyc.response.a> gH(String str) {
        String str2 = "code";
        kotlin.jvm.internal.i.f(str, str2);
        p t = com.iqoption.core.d.EV().a("proxy-confirm-phone", Object.class).k(str2, str).fp("1.0").UB().t(a.bux);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory.cr…ap { ConfirmPhoneResult }");
        return t;
    }

    public static final p<com.iqoption.core.microservices.kyc.response.d> ao(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "code");
        kotlin.jvm.internal.i.f(str2, "number");
        FormBody.Builder add = new FormBody.Builder().add("phone_code", str).add("phone", str2);
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vb());
        stringBuilder.append("api/profile/save-phone");
        Builder post = a.url(stringBuilder.toString()).post(add.build());
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        p h = cVar.b(post, PhoneRequests$savePhone$1.buz, com.iqoption.core.connect.http.b.bau, c.UJ()).h((f) b.buA);
        kotlin.jvm.internal.i.e(h, "Http.executeSingle(\n    … {\n            \n        }");
        return h;
    }

    public static /* synthetic */ p a(boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = (String) null;
        }
        return f(z, str);
    }

    public static final p<com.iqoption.core.microservices.kyc.response.g> f(boolean z, String str) {
        FormBody.Builder add = new FormBody.Builder().add(NotificationCompat.CATEGORY_STATUS, z ? "1" : "0");
        if (str != null) {
            add.add("auth_code", str);
        }
        c cVar = c.baF;
        Builder a = c.a(c.baF, new Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(com.iqoption.core.d.EE().Vb());
        stringBuilder.append("api/profile/auth_two_factor");
        Builder post = a.url(stringBuilder.toString()).post(add.build());
        kotlin.jvm.internal.i.e(post, "Request.Builder().accept…post(bodyBuilder.build())");
        return c.b(cVar, post, PhoneRequests$twoFactorAuth$2.buC, null, null, 12, null);
    }
}
