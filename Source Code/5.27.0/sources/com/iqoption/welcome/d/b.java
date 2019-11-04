package com.iqoption.welcome.d;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.d;
import com.facebook.e;
import com.facebook.g;
import com.facebook.g.c;
import com.facebook.login.j;
import com.facebook.login.l;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import java.util.Collection;
import kotlin.i;
import org.json.JSONObject;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\u000b\u001a\u00020\bJ \u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/welcome/social/FacebookAuthViewModel;", "Lcom/iqoption/welcome/social/BaseSocialAuthViewModel;", "app", "Landroid/app/Application;", "callbackManager", "Lcom/facebook/CallbackManager;", "(Landroid/app/Application;Lcom/facebook/CallbackManager;)V", "authFacebook", "", "accessToken", "Lcom/facebook/AccessToken;", "logout", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onFacebookButtonClick", "fragment", "Landroidx/fragment/app/Fragment;", "socialId", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "Companion", "welcome_release"})
/* compiled from: FacebookAuthViewModel.kt */
public abstract class b extends a {
    private static final String TAG;
    public static final a enm = new a();
    private final d enl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcome/social/FacebookAuthViewModel$Companion;", "", "()V", "TAG", "", "facebookLogout", "", "welcome_release"})
    /* compiled from: FacebookAuthViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void bbz() {
            j.lX().lY();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, bng = {"com/iqoption/welcome/social/FacebookAuthViewModel$1", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "clear", "", "onCancel", "onError", "exception", "Lcom/facebook/FacebookException;", "onSuccess", "loginResult", "welcome_release"})
    /* compiled from: FacebookAuthViewModel.kt */
    /* renamed from: com.iqoption.welcome.d.b$1 */
    public static final class AnonymousClass1 implements e<l> {
        final /* synthetic */ b enn;

        AnonymousClass1(b bVar) {
            this.enn = bVar;
        }

        /* renamed from: a */
        public void onSuccess(l lVar) {
            kotlin.jvm.internal.i.f(lVar, "loginResult");
            this.enn.f(lVar.hl());
        }

        public void onCancel() {
            clear();
        }

        public void b(FacebookException facebookException) {
            kotlin.jvm.internal.i.f(facebookException, "exception");
            clear();
        }

        private final void clear() {
            this.enn.baI().postValue(Boolean.valueOf(false));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "user", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "response", "Lcom/facebook/GraphResponse;", "onCompleted"})
    /* compiled from: FacebookAuthViewModel.kt */
    static final class b implements c {
        final /* synthetic */ b enn;
        final /* synthetic */ com.facebook.a eno;

        b(b bVar, com.facebook.a aVar) {
            this.enn = bVar;
            this.eno = aVar;
        }

        public final void a(JSONObject jSONObject, com.facebook.j jVar) {
            Boolean valueOf = Boolean.valueOf(false);
            if (jSONObject != null) {
                String optString = jSONObject.optString("email");
                if (TextUtils.isEmpty(optString)) {
                    this.enn.baI().postValue(valueOf);
                    return;
                }
                String optString2 = jSONObject.optString("first_name");
                String optString3 = jSONObject.optString("last_name");
                String str = "id";
                String optString4 = jSONObject.optString(str);
                b bVar = this.enn;
                kotlin.jvm.internal.i.e(optString2, "fistName");
                kotlin.jvm.internal.i.e(optString3, "lastName");
                kotlin.jvm.internal.i.e(optString, "emailObj");
                kotlin.jvm.internal.i.e(optString4, str);
                String go = this.eno.go();
                kotlin.jvm.internal.i.e(go, "accessToken.applicationId");
                String token = this.eno.getToken();
                kotlin.jvm.internal.i.e(token, "accessToken.token");
                bVar.a(optString2, optString3, optString, optString4, go, token, null);
                return;
            }
            this.enn.baI().postValue(valueOf);
        }
    }

    public static final void bbz() {
        enm.bbz();
    }

    public /* synthetic */ b(Application application, d dVar, int i, f fVar) {
        if ((i & 2) != 0) {
            dVar = com.facebook.d.a.gF();
            kotlin.jvm.internal.i.e(dVar, "CallbackManager.Factory.create()");
        }
        this(application, dVar);
    }

    public b(Application application, d dVar) {
        kotlin.jvm.internal.i.f(application, "app");
        kotlin.jvm.internal.i.f(dVar, "callbackManager");
        super(application);
        this.enl = dVar;
        j.lX().a(this.enl, (e) new AnonymousClass1(this));
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.enl.onActivityResult(i, i2, intent);
    }

    private final void f(com.facebook.a aVar) {
        if (aVar != null) {
            g a = g.a(aVar, (c) new b(this, aVar));
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,first_name,last_name,email");
            kotlin.jvm.internal.i.e(a, "request");
            a.setParameters(bundle);
            a.ho();
        }
    }

    public final void br(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        j.lX().a(fragment, (Collection) l.listOf("email"));
    }

    /* Access modifiers changed, original: protected */
    public SocialTypeId bby() {
        return SocialTypeId.FACEBOOK;
    }

    public final void logout() {
        enm.bbz();
    }
}
