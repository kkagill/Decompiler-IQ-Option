package com.microblink.secured;

import com.microblink.secured.a.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: line */
public final class u {
    String exc;
    String exd;
    a exe;
    public a exf;
    a exg;
    public a exh;
    public int exi = -1;
    double exj = 0.0d;
    double exk = 1.0d;
    public double exl = 1.0d;
    h exm;
    public h exn;
    public h exo;
    h exp;
    h exq;
    public h exr;
    public h exs;
    public h ext;
    public h exu;

    public u(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Device and Model cannot be null");
        }
        this.exc = str;
        this.exd = str2;
    }

    public u(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        String[] split = str.split("::");
        this.exd = split[1];
        this.exc = split[0];
        str = "backFacingPreviewSize";
        if (jSONObject.has(str)) {
            jSONArray = jSONObject.getJSONArray(str);
            this.exe = new a(jSONArray.getInt(0), jSONArray.getInt(1));
        }
        str = "backFacingPictureSize";
        if (jSONObject.has(str)) {
            jSONArray = jSONObject.getJSONArray(str);
            this.exf = new a(jSONArray.getInt(0), jSONArray.getInt(1));
        }
        str = "frontFacingPreviewSize";
        if (jSONObject.has(str)) {
            jSONArray = jSONObject.getJSONArray(str);
            this.exg = new a(jSONArray.getInt(0), jSONArray.getInt(1));
        }
        str = "frontFacingPictureSize";
        if (jSONObject.has(str)) {
            jSONArray = jSONObject.getJSONArray(str);
            this.exh = new a(jSONArray.getInt(0), jSONArray.getInt(1));
        }
        str = "cameraInitDelayMs";
        if (jSONObject.has(str)) {
            this.exi = jSONObject.getInt(str);
        }
        str = "minZoomLevel";
        if (jSONObject.has(str)) {
            this.exj = jSONObject.getDouble(str);
        }
        str = "maxZoomLevel";
        if (jSONObject.has(str)) {
            this.exk = jSONObject.getDouble(str);
        }
        str = "blacklisted";
        if (jSONObject.has(str)) {
            this.exm = new h(jSONObject.getString(str));
        }
        str = "displayOrientationNotWorking";
        if (jSONObject.has(str)) {
            this.exn = new h(jSONObject.getString(str));
        }
        str = "naturalOrientationIsLandscapeLeft";
        if (jSONObject.has(str)) {
            this.exo = new h(jSONObject.getString(str));
        }
        str = "focusUntrusty";
        if (jSONObject.has(str)) {
            this.exp = new h(jSONObject.getString(str));
        }
        str = "meteringNotWorking";
        if (jSONObject.has(str)) {
            this.exq = new h(jSONObject.getString(str));
        }
        if (jSONObject.has("zeroCopyBufferAllowed")) {
            this.exr = new h(jSONObject.getString("zeroCopyBufferAllowed"));
        }
        if (jSONObject.has("eglPbufferNotSupported")) {
            this.exs = new h(jSONObject.getString("eglPbufferNotSupported"));
        }
        if (jSONObject.has("frameQualityFactor")) {
            this.exl = jSONObject.getDouble("frameQualityFactor");
        }
        if (jSONObject.has("phaseAutoFocusSupported")) {
            this.ext = new h(jSONObject.getString("phaseAutoFocusSupported"));
        }
        if (jSONObject.has("forceUseLegacyCamera")) {
            this.exu = new h(jSONObject.getString("forceUseLegacyCamera"));
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeviceInfo{mDevice='");
        stringBuilder.append(this.exc);
        stringBuilder.append('\'');
        stringBuilder.append(", mModel='");
        stringBuilder.append(this.exd);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
