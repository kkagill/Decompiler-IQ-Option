package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class z {
    private static final long adD = TimeUnit.DAYS.toMillis(7);
    private final String adE;
    private final long timestamp;
    final String zzbv;

    private z(String str, String str2, long j) {
        this.zzbv = str;
        this.adE = str2;
        this.timestamp = j;
    }

    static z cf(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new z(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new z(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
            stringBuilder.append("Failed to parse token: ");
            stringBuilder.append(str);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 24);
            stringBuilder.append("Failed to encode token: ");
            stringBuilder.append(str);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }

    static String b(@Nullable z zVar) {
        return zVar == null ? null : zVar.zzbv;
    }

    /* Access modifiers changed, original: final */
    public final boolean cg(String str) {
        return System.currentTimeMillis() > this.timestamp + adD || !str.equals(this.adE);
    }
}
