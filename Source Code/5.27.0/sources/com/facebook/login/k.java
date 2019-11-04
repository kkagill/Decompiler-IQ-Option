package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.a;
import com.facebook.appevents.g;
import com.facebook.internal.z;
import com.facebook.login.LoginClient.c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginMethodHandler */
abstract class k implements Parcelable {
    protected LoginClient Cm;
    Map<String, String> Cx;

    public abstract boolean a(c cVar);

    /* Access modifiers changed, original: 0000 */
    public void cancel() {
    }

    /* Access modifiers changed, original: 0000 */
    public void l(JSONObject jSONObject) {
    }

    public abstract String lg();

    /* Access modifiers changed, original: 0000 */
    public boolean mb() {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    k(LoginClient loginClient) {
        this.Cm = loginClient;
    }

    k(Parcel parcel) {
        this.Cx = z.s(parcel);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(LoginClient loginClient) {
        if (this.Cm == null) {
            this.Cm = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* Access modifiers changed, original: protected */
    public String bz(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", lg());
            l(jSONObject);
        } catch (JSONException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating client state json: ");
            stringBuilder.append(e.getMessage());
            Log.w("LoginMethodHandler", stringBuilder.toString());
        }
        return jSONObject.toString();
    }

    /* Access modifiers changed, original: protected */
    public void b(String str, Object obj) {
        if (this.Cx == null) {
            this.Cx = new HashMap();
        }
        this.Cx.put(str, obj == null ? null : obj.toString());
    }

    /* Access modifiers changed, original: protected */
    public void bA(String str) {
        String go = this.Cm.lx().go();
        g gVar = new g(this.Cm.getActivity(), go);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", go);
        gVar.a("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    static a a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Bundle bundle2 = bundle;
        Date a = z.a(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a2 = z.a(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (z.aB(string)) {
            return null;
        }
        return new a(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, accessTokenSource, a, new Date(), a2);
    }

    public static a a(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Bundle bundle2 = bundle;
        Date a = z.a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a2 = z.a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        String str2 = ",";
        Collection arrayList = !z.aB(string2) ? new ArrayList(Arrays.asList(string2.split(str2))) : collection;
        string2 = bundle.getString("denied_scopes");
        Collection arrayList2 = !z.aB(string2) ? new ArrayList(Arrays.asList(string2.split(str2))) : null;
        string2 = bundle.getString("expired_scopes");
        Collection arrayList3 = !z.aB(string2) ? new ArrayList(Arrays.asList(string2.split(str2))) : null;
        if (z.aB(string)) {
            return null;
        }
        return new a(string, str, bB(bundle.getString("signed_request")), arrayList, arrayList2, arrayList3, accessTokenSource, a, new Date(), a2);
    }

    static String bB(String str) {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(parcel, this.Cx);
    }
}
