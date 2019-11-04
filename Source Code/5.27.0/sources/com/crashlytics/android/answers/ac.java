package com.crashlytics.android.answers;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import io.fabric.sdk.android.services.b.a;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SessionEventTransform */
class ac implements a<SessionEvent> {
    ac() {
    }

    /* renamed from: e */
    public byte[] T(SessionEvent sessionEvent) {
        return f(sessionEvent).toString().getBytes("UTF-8");
    }

    @TargetApi(9)
    public JSONObject f(SessionEvent sessionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            ab abVar = sessionEvent.oR;
            jSONObject.put("appBundleId", abVar.oZ);
            jSONObject.put("executionId", abVar.pa);
            jSONObject.put("installationId", abVar.pb);
            jSONObject.put("limitAdTrackingEnabled", abVar.pc);
            jSONObject.put("betaDeviceToken", abVar.pd);
            jSONObject.put("buildId", abVar.pe);
            jSONObject.put("osVersion", abVar.pf);
            jSONObject.put("deviceModel", abVar.pg);
            jSONObject.put("appVersionCode", abVar.ph);
            jSONObject.put("appVersionName", abVar.pi);
            jSONObject.put("timestamp", sessionEvent.timestamp);
            jSONObject.put("type", sessionEvent.oS.toString());
            if (sessionEvent.oT != null) {
                jSONObject.put("details", new JSONObject(sessionEvent.oT));
            }
            jSONObject.put("customType", sessionEvent.oU);
            if (sessionEvent.oV != null) {
                jSONObject.put("customAttributes", new JSONObject(sessionEvent.oV));
            }
            jSONObject.put("predefinedType", sessionEvent.oW);
            if (sessionEvent.oX != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(sessionEvent.oX));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }
}
