package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.f;
import com.facebook.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppGateKeepersManager */
public class i {
    private static final String TAG = "com.facebook.internal.i";
    private static final Map<String, JSONObject> xV = new ConcurrentHashMap();
    @Nullable
    private static Long xW = null;

    public static synchronized void jL() {
        synchronized (i.class) {
            if (b(xW)) {
                return;
            }
            final Context applicationContext = f.getApplicationContext();
            final String go = f.go();
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{go});
            f.getExecutor().execute(new Runnable() {
                public void run() {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
                    JSONObject jSONObject = null;
                    String string = sharedPreferences.getString(format, null);
                    if (!z.aB(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            z.a("FacebookSDK", e);
                        }
                        if (jSONObject != null) {
                            i.a(go, jSONObject);
                        }
                    }
                    JSONObject bf = i.be(go);
                    if (bf != null) {
                        i.xW = Long.valueOf(System.currentTimeMillis());
                        i.a(go, bf);
                        sharedPreferences.edit().putString(format, bf.toString()).apply();
                    }
                }
            });
        }
    }

    @Nullable
    public static JSONObject f(String str, boolean z) {
        if (!z && xV.containsKey(str)) {
            return (JSONObject) xV.get(str);
        }
        JSONObject be = be(str);
        if (be == null) {
            return null;
        }
        Context applicationContext = f.getApplicationContext();
        applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), be.toString()).apply();
        return a(str, be);
    }

    public static boolean a(String str, String str2, boolean z) {
        jL();
        return (str2 == null || !xV.containsKey(str2)) ? z : ((JSONObject) xV.get(str2)).optBoolean(str, z);
    }

    @Nullable
    private static JSONObject be(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", f.gV());
        bundle.putString("fields", "gatekeepers");
        g a = g.a(null, String.format("%s/%s", new Object[]{str, "mobile_sdk_gk"}), null);
        a.C(true);
        a.setParameters(bundle);
        return a.hn().hH();
    }

    private static synchronized JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (i.class) {
            if (xV.containsKey(str)) {
                jSONObject2 = (JSONObject) xV.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            int i = 0;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                optJSONArray = jSONObject3.optJSONArray("gatekeepers");
                while (i < optJSONArray.length()) {
                    try {
                        jSONObject3 = optJSONArray.getJSONObject(i);
                        jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean(ConditionalUserProperty.VALUE));
                    } catch (JSONException e) {
                        z.a("FacebookSDK", e);
                    }
                    i++;
                }
            }
            xV.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    private static boolean b(Long l) {
        boolean z = false;
        if (l == null) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < 3600000) {
            z = true;
        }
        return z;
    }
}
