package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.aa;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessTokenCache */
class b {
    private final SharedPreferences sA;
    private final a sB;
    private k sC;

    /* compiled from: AccessTokenCache */
    static class a {
        a() {
        }

        public k gy() {
            return new k(f.getApplicationContext());
        }
    }

    b(SharedPreferences sharedPreferences, a aVar) {
        this.sA = sharedPreferences;
        this.sB = aVar;
    }

    public b() {
        this(f.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new a());
    }

    public a gs() {
        if (gt()) {
            return gu();
        }
        if (!gv()) {
            return null;
        }
        a gw = gw();
        if (gw == null) {
            return gw;
        }
        d(gw);
        gx().clear();
        return gw;
    }

    public void d(a aVar) {
        aa.b((Object) aVar, "accessToken");
        try {
            this.sA.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.gq().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public void clear() {
        this.sA.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (gv()) {
            gx().clear();
        }
    }

    private boolean gt() {
        return this.sA.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private a gu() {
        String string = this.sA.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return a.c(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private boolean gv() {
        return f.gS();
    }

    private a gw() {
        Bundle hI = gx().hI();
        return (hI == null || !k.g(hI)) ? null : a.f(hI);
    }

    private k gx() {
        if (this.sC == null) {
            synchronized (this) {
                if (this.sC == null) {
                    this.sC = this.sB.gy();
                }
            }
        }
        return this.sC;
    }
}
