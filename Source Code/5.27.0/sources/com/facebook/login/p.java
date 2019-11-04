package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.a;
import com.facebook.f;
import com.facebook.internal.z;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.c;
import java.util.Locale;

/* compiled from: WebLoginMethodHandler */
abstract class p extends k {
    private String CJ;

    public abstract AccessTokenSource lh();

    /* Access modifiers changed, original: protected */
    public String li() {
        return null;
    }

    private static final String md() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fb");
        stringBuilder.append(f.go());
        stringBuilder.append("://authorize");
        return stringBuilder.toString();
    }

    p(LoginClient loginClient) {
        super(loginClient);
    }

    p(Parcel parcel) {
        super(parcel);
    }

    /* Access modifiers changed, original: protected */
    public Bundle i(c cVar) {
        String join;
        Bundle bundle = new Bundle();
        if (!z.c(cVar.gj())) {
            join = TextUtils.join(",", cVar.gj());
            String str = "scope";
            bundle.putString(str, join);
            b(str, join);
        }
        bundle.putString("default_audience", cVar.lN().getNativeProtocolAudience());
        bundle.putString("state", bz(cVar.lO()));
        a ge = a.ge();
        String token = ge != null ? ge.getToken() : null;
        join = "access_token";
        if (token == null || !token.equals(me())) {
            z.aa(this.Cm.getActivity());
            b(join, "0");
        } else {
            bundle.putString(join, token);
            b(join, "1");
        }
        return bundle;
    }

    /* Access modifiers changed, original: protected */
    public Bundle a(Bundle bundle, c cVar) {
        bundle.putString("redirect_uri", md());
        bundle.putString("client_id", cVar.go());
        LoginClient loginClient = this.Cm;
        bundle.putString("e2e", LoginClient.lJ());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", cVar.lS());
        if (li() != null) {
            bundle.putString("sso", li());
        }
        return bundle;
    }

    /* Access modifiers changed, original: protected */
    public void a(c cVar, Bundle bundle, FacebookException facebookException) {
        Result a;
        this.CJ = null;
        if (bundle != null) {
            String str = "e2e";
            if (bundle.containsKey(str)) {
                this.CJ = bundle.getString(str);
            }
            try {
                a a2 = k.a(cVar.gj(), bundle, lh(), cVar.go());
                a = Result.a(this.Cm.lx(), a2);
                CookieSyncManager.createInstance(this.Cm.getActivity()).sync();
                bC(a2.getToken());
            } catch (FacebookException e) {
                a = Result.a(this.Cm.lx(), null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            a = Result.a(this.Cm.lx(), "User canceled log in.");
        } else {
            String format;
            this.CJ = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError hh = ((FacebookServiceException) facebookException).hh();
                format = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(hh.getErrorCode())});
                message = hh.toString();
            } else {
                format = null;
            }
            a = Result.a(this.Cm.lx(), null, message, format);
        }
        if (!z.aB(this.CJ)) {
            bA(this.CJ);
        }
        this.Cm.a(a);
    }

    private String me() {
        return this.Cm.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private void bC(String str) {
        this.Cm.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }
}
