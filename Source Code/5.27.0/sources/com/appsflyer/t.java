package com.appsflyer;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class t {
    @Nullable
    static JSONObject X(String str) {
        JSONObject jSONObject;
        Throwable th;
        try {
            jSONObject = new JSONObject(str);
            try {
                if (jSONObject.optBoolean("monitor", false)) {
                    ag.dT().dU();
                } else {
                    ag.dT().dh();
                    ag.dT().di();
                }
            } catch (JSONException unused) {
                ag.dT().dh();
                ag.dT().di();
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AFLogger.c(th.getMessage(), th);
                ag.dT().dh();
                ag.dT().di();
                return jSONObject;
            }
        } catch (JSONException unused2) {
            jSONObject = null;
            ag.dT().dh();
            ag.dT().di();
            return jSONObject;
        } catch (Throwable th3) {
            th = th3;
            jSONObject = null;
            AFLogger.c(th.getMessage(), th);
            ag.dT().dh();
            ag.dT().di();
            return jSONObject;
        }
        return jSONObject;
    }

    public static String Y(String str) {
        return String.format(str, new Object[]{j.dq().dt(), j.dq().getHostName()});
    }
}
