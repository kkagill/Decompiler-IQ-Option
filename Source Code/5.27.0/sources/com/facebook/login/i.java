package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.g;
import com.facebook.login.LoginClient.c;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginLogger */
class i {
    private final g Cp;
    private String Cq;
    private String applicationId;

    i(Context context, String str) {
        this.applicationId = str;
        this.Cp = new g(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.Cq = packageInfo.versionName;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    public String go() {
        return this.applicationId;
    }

    static Bundle bx(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        str = "";
        bundle.putString("3_method", str);
        bundle.putString("2_result", str);
        bundle.putString("5_error_message", str);
        bundle.putString("4_error_code", str);
        bundle.putString("6_extras", str);
        return bundle;
    }

    public void g(c cVar) {
        Bundle bx = bx(cVar.lO());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", cVar.lM().toString());
            jSONObject.put("request_code", LoginClient.ly());
            jSONObject.put("permissions", TextUtils.join(",", cVar.gj()));
            jSONObject.put("default_audience", cVar.lN().toString());
            jSONObject.put("isReauthorize", cVar.lP());
            if (this.Cq != null) {
                jSONObject.put("facebookVersion", this.Cq);
            }
            bx.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.Cp.a("fb_mobile_login_start", null, bx);
    }

    public void a(String str, Map<String, String> map, Code code, Map<String, String> map2, Exception exception) {
        Bundle bx = bx(str);
        if (code != null) {
            bx.putString("2_result", code.getLoggingValue());
        }
        if (!(exception == null || exception.getMessage() == null)) {
            bx.putString("5_error_message", exception.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            bx.putString("6_extras", jSONObject.toString());
        }
        this.Cp.d("fb_mobile_login_complete", bx);
    }

    public void I(String str, String str2) {
        Bundle bx = bx(str);
        bx.putString("3_method", str2);
        this.Cp.d("fb_mobile_login_method_start", bx);
    }

    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle bx = bx(str);
        if (str3 != null) {
            bx.putString("2_result", str3);
        }
        if (str4 != null) {
            bx.putString("5_error_message", str4);
        }
        if (str5 != null) {
            bx.putString("4_error_code", str5);
        }
        if (!(map == null || map.isEmpty())) {
            bx.putString("6_extras", new JSONObject(map).toString());
        }
        bx.putString("3_method", str2);
        this.Cp.d("fb_mobile_login_method_complete", bx);
    }

    public void J(String str, String str2) {
        Bundle bx = bx(str);
        bx.putString("3_method", str2);
        this.Cp.d("fb_mobile_login_method_not_tried", bx);
    }

    public void K(String str, String str2) {
        d(str, str2, "");
    }

    public void d(String str, String str2, String str3) {
        Bundle bx = bx("");
        bx.putString("2_result", Code.ERROR.getLoggingValue());
        bx.putString("5_error_message", str2);
        bx.putString("3_method", str3);
        this.Cp.d(str, bx);
    }
}
