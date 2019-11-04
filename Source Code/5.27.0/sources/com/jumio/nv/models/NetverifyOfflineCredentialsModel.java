package com.jumio.nv.models;

import com.jumio.alejwt.swig.JWT;
import com.jumio.sdk.models.OfflineCredentialsModel;

public class NetverifyOfflineCredentialsModel extends OfflineCredentialsModel {
    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e = false;
    private byte[] f;

    /* Access modifiers changed, original: protected */
    public void configureJWT(JWT jwt) {
        jwt.useGzip(true);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0037 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            return;
     */
    public void parseJson(org.json.JSONObject r4) {
        /*
        r3 = this;
        r0 = "supportedCountries";
        r0 = r4.getString(r0);	 Catch:{ JSONException -> 0x003a }
        r3.b = r0;	 Catch:{ JSONException -> 0x003a }
        r0 = "enabledFields";
        r1 = 0;
        r0 = r4.optString(r0, r1);	 Catch:{ JSONException -> 0x003a }
        r3.c = r0;	 Catch:{ JSONException -> 0x003a }
        r0 = "product";
        r2 = "Fastfill";
        r0 = r4.optString(r0, r2);	 Catch:{ JSONException -> 0x003a }
        r2 = "Netverify";
        r0 = r0.equalsIgnoreCase(r2);	 Catch:{ JSONException -> 0x003a }
        r3.e = r0;	 Catch:{ JSONException -> 0x003a }
        r0 = "android-barcode";
        r0 = r4.optString(r0, r1);	 Catch:{ JSONException -> 0x003a }
        r3.d = r0;	 Catch:{ JSONException -> 0x003a }
        r0 = "status-pin";
        r4 = r4.optString(r0);	 Catch:{ Exception -> 0x0037 }
        r0 = 0;
        r4 = android.util.Base64.decode(r4, r0);	 Catch:{ Exception -> 0x0037 }
        r3.f = r4;	 Catch:{ Exception -> 0x0037 }
        goto L_0x0039;
    L_0x0037:
        r3.f = r1;	 Catch:{ JSONException -> 0x003a }
    L_0x0039:
        return;
    L_0x003a:
        r4 = new com.jumio.core.exceptions.PlatformNotSupportedException;
        r0 = "Token not valid";
        r4.<init>(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.models.NetverifyOfflineCredentialsModel.parseJson(org.json.JSONObject):void");
    }

    public String getPreferredCountry() {
        return this.a;
    }

    public void setPreferredCountry(String str) {
        this.a = str;
    }

    public String getSupportedCountries() {
        return this.b;
    }

    public boolean isNetverifyable() {
        return this.e;
    }

    public byte[] getStatusPublicKey() {
        return this.f;
    }

    public String getEnabledFields() {
        return this.c;
    }

    public String getBarcodeLicense() {
        return this.d;
    }
}
