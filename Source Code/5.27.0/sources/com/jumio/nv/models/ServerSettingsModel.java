package com.jumio.nv.models;

import androidx.annotation.Nullable;
import com.jumio.commons.PersistWith;
import com.jumio.commons.log.Log;
import com.jumio.core.data.document.DocumentScanMode;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.core.plugins.PluginRegistry;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.nv.IsoCountryConverter;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.data.document.DocumentType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@PersistWith("ServerSettingsModel")
public class ServerSettingsModel implements StaticModel {
    private String a;
    private boolean b = true;
    private String c;
    private boolean d = true;
    private boolean e = false;
    private CountryDocumentModel f = new CountryDocumentModel();
    private boolean g = false;
    private boolean h = false;
    private String i = null;
    private int j = 0;
    private byte[] k;
    private byte[] l;
    private int m;
    private float n;
    private float o;
    private float p;
    private int q;
    private int r;
    private boolean s;
    private int t = -1;
    private float u = -1.0f;
    private float v = -1.0f;

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073 A:{Catch:{ JSONException -> 0x0103 }} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071 A:{Catch:{ JSONException -> 0x0103 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0033 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:4|5|6|7|8|9|10|11|12|13|14|15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:4|5|6|7|8|9|10|11|12|13|14|15|16|(1:18)(1:19)|20|(2:21|22)) */
    /* JADX WARNING: Missing block: B:39:0x0103, code skipped:
            r7 = move-exception;
     */
    /* JADX WARNING: Missing block: B:40:0x0104, code skipped:
            com.jumio.commons.log.Log.w("ServerSettingsModel", "JSONException ", r7);
     */
    public void parseJson(java.lang.String r7, @androidx.annotation.Nullable com.jumio.sdk.models.CredentialsModel r8, boolean r9) {
        /*
        r6 = this;
        r0 = 1;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0103 }
        r1.<init>(r7);	 Catch:{ JSONException -> 0x0103 }
        r7 = "configurations";
        r7 = r1.optJSONObject(r7);	 Catch:{ JSONException -> 0x0103 }
        r2 = 0;
        r3 = 0;
        if (r7 == 0) goto L_0x009a;
    L_0x0010:
        r4 = "barcodeScannerKey";
        r4 = r7.optString(r4);	 Catch:{ JSONException -> 0x0103 }
        r6.a = r4;	 Catch:{ JSONException -> 0x0103 }
        r4 = "cdnPublicKey";
        r4 = r7.optString(r4);	 Catch:{ Exception -> 0x0025 }
        r4 = android.util.Base64.decode(r4, r3);	 Catch:{ Exception -> 0x0025 }
        r6.k = r4;	 Catch:{ Exception -> 0x0025 }
        goto L_0x0027;
    L_0x0025:
        r6.k = r2;	 Catch:{ JSONException -> 0x0103 }
    L_0x0027:
        r4 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0033 }
        r5 = "eMRTD";
        r5 = r7.optString(r5);	 Catch:{ Exception -> 0x0033 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x0033 }
        r2 = r4;
    L_0x0033:
        r4 = "eyeTrackingKey";
        r4 = r7.getInt(r4);	 Catch:{ Exception -> 0x0067 }
        r6.m = r4;	 Catch:{ Exception -> 0x0067 }
        r4 = "eyeTrackingThresholdMax";
        r4 = r7.getDouble(r4);	 Catch:{ Exception -> 0x0067 }
        r4 = (float) r4;	 Catch:{ Exception -> 0x0067 }
        r6.n = r4;	 Catch:{ Exception -> 0x0067 }
        r4 = "eyeTrackingEarlyThresholdMin";
        r4 = r7.getDouble(r4);	 Catch:{ Exception -> 0x0067 }
        r4 = (float) r4;	 Catch:{ Exception -> 0x0067 }
        r6.o = r4;	 Catch:{ Exception -> 0x0067 }
        r4 = "eyeTrackingEarlyThresholdMax";
        r4 = r7.getDouble(r4);	 Catch:{ Exception -> 0x0067 }
        r4 = (float) r4;	 Catch:{ Exception -> 0x0067 }
        r6.p = r4;	 Catch:{ Exception -> 0x0067 }
        r4 = "eyeTrackingPositionsMin";
        r4 = r7.getInt(r4);	 Catch:{ Exception -> 0x0067 }
        r6.q = r4;	 Catch:{ Exception -> 0x0067 }
        r4 = "eyeTrackingPositionsMax";
        r4 = r7.getInt(r4);	 Catch:{ Exception -> 0x0067 }
        r6.r = r4;	 Catch:{ Exception -> 0x0067 }
        goto L_0x0069;
    L_0x0067:
        r6.m = r3;	 Catch:{ JSONException -> 0x0103 }
    L_0x0069:
        r4 = "eyeTrackingAnalyticsEnabled";
        r4 = r7.optInt(r4, r3);	 Catch:{ JSONException -> 0x0103 }
        if (r4 != r0) goto L_0x0073;
    L_0x0071:
        r4 = 1;
        goto L_0x0074;
    L_0x0073:
        r4 = 0;
    L_0x0074:
        r6.s = r4;	 Catch:{ JSONException -> 0x0103 }
        r4 = "shakeDetection";
        r4 = r7.getInt(r4);	 Catch:{ Exception -> 0x0091 }
        r6.t = r4;	 Catch:{ Exception -> 0x0091 }
        r4 = "shakeScore";
        r4 = r7.getDouble(r4);	 Catch:{ Exception -> 0x0091 }
        r4 = (float) r4;	 Catch:{ Exception -> 0x0091 }
        r6.u = r4;	 Catch:{ Exception -> 0x0091 }
        r4 = "focusScore";
        r4 = r7.getDouble(r4);	 Catch:{ Exception -> 0x0091 }
        r7 = (float) r4;	 Catch:{ Exception -> 0x0091 }
        r6.v = r7;	 Catch:{ Exception -> 0x0091 }
        goto L_0x009a;
    L_0x0091:
        r7 = -1;
        r6.t = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r6.u = r7;	 Catch:{ JSONException -> 0x0103 }
        r6.v = r7;	 Catch:{ JSONException -> 0x0103 }
    L_0x009a:
        r7 = "brandingEnabled";
        r7 = r1.optBoolean(r7, r0);	 Catch:{ JSONException -> 0x0103 }
        r6.b = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = "countryForIp";
        r7 = r1.optString(r7);	 Catch:{ JSONException -> 0x0103 }
        r6.c = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = "analyticsEnabled";
        r7 = r1.optBoolean(r7, r0);	 Catch:{ JSONException -> 0x0103 }
        r6.h = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = "enabledFields";
        r7 = r1.optString(r7);	 Catch:{ JSONException -> 0x0103 }
        r6.i = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = "verificationAllowed";
        r7 = r1.optBoolean(r7, r0);	 Catch:{ JSONException -> 0x0103 }
        r6.d = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = "additionalDataPoints";
        r7 = r1.optBoolean(r7, r3);	 Catch:{ JSONException -> 0x0103 }
        r6.e = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = "maxLivenessImages";
        r3 = 10;
        r7 = r1.optInt(r7, r3);	 Catch:{ JSONException -> 0x0103 }
        r6.j = r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = r6.j;	 Catch:{ JSONException -> 0x0103 }
        if (r7 < 0) goto L_0x00dc;
    L_0x00d8:
        r7 = r6.j;	 Catch:{ JSONException -> 0x0103 }
        if (r7 <= r3) goto L_0x00de;
    L_0x00dc:
        r6.j = r3;	 Catch:{ JSONException -> 0x0103 }
    L_0x00de:
        r7 = "supportedCountries";
        r7 = r1.getJSONArray(r7);	 Catch:{ JSONException -> 0x0103 }
        r6.a(r7, r2, r9);	 Catch:{ JSONException -> 0x0103 }
        if (r8 == 0) goto L_0x010b;
    L_0x00e9:
        r7 = r8 instanceof com.jumio.nv.models.NetverifyCredentialsModel;	 Catch:{ JSONException -> 0x0103 }
        if (r7 == 0) goto L_0x010b;
    L_0x00ed:
        r7 = r8;
        r7 = (com.jumio.nv.models.NetverifyCredentialsModel) r7;	 Catch:{ JSONException -> 0x0103 }
        r7 = r7.getOfflineCredentialsModel();	 Catch:{ JSONException -> 0x0103 }
        if (r7 == 0) goto L_0x010b;
    L_0x00f6:
        r8 = (com.jumio.nv.models.NetverifyCredentialsModel) r8;	 Catch:{ JSONException -> 0x0103 }
        r7 = r8.getOfflineCredentialsModel();	 Catch:{ JSONException -> 0x0103 }
        r7 = r7.getStatusPublicKey();	 Catch:{ JSONException -> 0x0103 }
        r6.l = r7;	 Catch:{ JSONException -> 0x0103 }
        goto L_0x010b;
    L_0x0103:
        r7 = move-exception;
        r8 = "ServerSettingsModel";
        r9 = "JSONException ";
        com.jumio.commons.log.Log.w(r8, r9, r7);
    L_0x010b:
        r6.g = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.models.ServerSettingsModel.parseJson(java.lang.String, com.jumio.sdk.models.CredentialsModel, boolean):void");
    }

    public void useOfflineToken(NetverifyOfflineCredentialsModel netverifyOfflineCredentialsModel, boolean z) {
        this.k = null;
        this.a = netverifyOfflineCredentialsModel.getBarcodeLicense();
        this.b = netverifyOfflineCredentialsModel.isBranding();
        this.c = netverifyOfflineCredentialsModel.getPreferredCountry();
        this.h = false;
        this.i = netverifyOfflineCredentialsModel.getEnabledFields();
        this.d = netverifyOfflineCredentialsModel.isNetverifyable();
        this.j = 10;
        this.m = 0;
        this.l = netverifyOfflineCredentialsModel.getStatusPublicKey();
        this.t = -1;
        this.u = -1.0f;
        this.v = -1.0f;
        try {
            a(new JSONArray(netverifyOfflineCredentialsModel.getSupportedCountries()), null, z);
        } catch (JSONException e) {
            Log.w("ServerSettingsModel", "JSONException ", e);
        }
        this.g = true;
    }

    private void a(JSONArray jSONArray, @Nullable JSONObject jSONObject, boolean z) {
        String arrays = Arrays.toString(PluginRegistry.getAvailablePlugins().toArray());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Available plugins: ");
        stringBuilder.append(arrays);
        Log.d("NetverifySDK", stringBuilder.toString());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String str = "country";
            Country country = new Country(jSONObject2.getString(str), z);
            if (!country.getName().equalsIgnoreCase(IsoCountryConverter.convertToAlpha2(jSONObject2.getString(str)))) {
                str = "idTypes";
                JSONArray optJSONArray = jSONObject2.optJSONArray(str);
                ArrayList arrayList = new ArrayList();
                String str2 = " because no plugin was found!";
                String str3 = "Skipping scan mode ";
                String str4 = "ServerSettingsModel";
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        DocumentType a = a(country, optJSONArray.getJSONObject(i2), jSONObject);
                        if (PluginRegistry.getPlugin(getScanPluginMode(a.getDocumentScanMode())) != null) {
                            arrayList.add(a);
                        } else {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(str3);
                            stringBuilder2.append(a.getDocumentScanMode());
                            stringBuilder2.append(str2);
                            Log.i(str4, stringBuilder2.toString());
                        }
                    }
                } else {
                    DocumentType a2 = a(country, jSONObject2.getJSONObject(str), jSONObject);
                    if (PluginRegistry.getPlugin(getScanPluginMode(a2.getDocumentScanMode())) != null) {
                        arrayList.add(a2);
                    } else {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(str3);
                        stringBuilder3.append(a2.getDocumentScanMode());
                        stringBuilder3.append(str2);
                        Log.i(str4, stringBuilder3.toString());
                    }
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    this.f.add(country, (DocumentType[]) arrayList.toArray(new DocumentType[arrayList.size()]));
                }
            }
        }
    }

    public PluginMode getScanPluginMode(DocumentScanMode documentScanMode) {
        switch (documentScanMode) {
            case CREDIT:
                return PluginMode.CARD;
            case MRP:
            case MRV:
            case TD1:
            case TD2:
            case CNIS:
                return PluginMode.MRZ;
            case PDF417:
                PluginMode pluginMode = PluginMode.BARCODE;
                if (PluginRegistry.hasPlugin(pluginMode)) {
                    String str = this.a;
                    if (!(str == null || str.length() == 0)) {
                        return pluginMode;
                    }
                }
                return PluginMode.BARCODE_NATIVE;
            case TEMPLATEMATCHER:
                return PluginMode.TEMPLATE_MATCHER;
            case CSSN:
            case LINEFINDER:
                return PluginMode.LINE_FINDER;
            case FACE:
                return PluginMode.FACE;
            case MANUAL:
                return PluginMode.MANUAL;
            case NFC:
                return PluginMode.NFC;
            default:
                return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0106  */
    private com.jumio.nv.data.document.DocumentType a(com.jumio.nv.data.country.Country r19, org.json.JSONObject r20, org.json.JSONObject r21) {
        /*
        r18 = this;
        r0 = r20;
        r1 = r21;
        r2 = 0;
        r3 = "paperVariant";
        r13 = r0.optBoolean(r3, r2);
        r3 = "paperVariantParts";
        r4 = r0.optJSONArray(r3);
        r5 = 0;
        r15 = 1;
        if (r13 == 0) goto L_0x0025;
    L_0x0015:
        if (r4 == 0) goto L_0x001d;
    L_0x0017:
        r3 = r4.length();
        r14 = r3;
        goto L_0x0026;
    L_0x001d:
        r3 = r0.optString(r3, r5);
        if (r3 == 0) goto L_0x0025;
    L_0x0023:
        r14 = 1;
        goto L_0x0026;
    L_0x0025:
        r14 = 0;
    L_0x0026:
        if (r1 == 0) goto L_0x0060;
    L_0x0028:
        r3 = r19.getIsoCode();
        r3 = r1.has(r3);
        if (r3 == 0) goto L_0x0060;
    L_0x0032:
        r3 = r19.getIsoCode();
        r3 = r1.optJSONArray(r3);
        if (r3 == 0) goto L_0x0052;
    L_0x003c:
        r1 = r3.length();
        r1 = new java.lang.String[r1];
        r4 = 0;
    L_0x0043:
        r5 = r3.length();
        if (r4 >= r5) goto L_0x0061;
    L_0x0049:
        r5 = r3.getString(r4);
        r1[r4] = r5;
        r4 = r4 + 1;
        goto L_0x0043;
    L_0x0052:
        r3 = new java.lang.String[r15];
        r4 = r19.getIsoCode();
        r1 = r1.getString(r4);
        r3[r2] = r1;
        r1 = r3;
        goto L_0x0061;
    L_0x0060:
        r1 = r5;
    L_0x0061:
        r3 = new com.jumio.nv.data.document.DocumentType;
        r4 = "idType";
        r5 = r0.getString(r4);
        r4 = "parts";
        r6 = r0.optInt(r4);
        r4 = "";
        r7 = "mrzFormat";
        r7 = r0.optString(r7, r4);
        r8 = "mrzSide";
        r8 = r0.optString(r8, r4);
        r9 = "barcodeFormat";
        r9 = r0.optString(r9, r4);
        r10 = "barcodeSide";
        r10 = r0.optString(r10, r4);
        r11 = "thirdPartyOcr";
        r11 = r0.optString(r11, r4);
        r12 = "ocrSide";
        r12 = r0.optString(r12, r4);
        r15 = "masking";
        r0 = r0.optString(r15, r4);
        r4 = r3;
        r17 = 1;
        r15 = r1;
        r16 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r0 = r19.getIsoCode();
        r1 = "FRA";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00be;
    L_0x00b0:
        r0 = r3.getDocumentScanMode();
        r1 = com.jumio.core.data.document.DocumentScanMode.TD2;
        if (r0 != r1) goto L_0x00be;
    L_0x00b8:
        r0 = com.jumio.core.data.document.DocumentScanMode.CNIS;
        r3.setDocumentScanMode(r0);
        goto L_0x0117;
    L_0x00be:
        r0 = r19.getIsoCode();
        r1 = "DEU";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0117;
    L_0x00ca:
        r0 = r3.getId();
        r1 = com.jumio.nv.data.document.NVDocumentType.IDENTITY_CARD;
        if (r0 != r1) goto L_0x0117;
    L_0x00d2:
        r3.setFallbackScan(r2);
        r0 = r3.getMaskingType();
        r1 = com.jumio.nv.data.document.NVDocumentMaskingType.NONE;
        if (r0 == r1) goto L_0x00e0;
    L_0x00dd:
        r0 = com.jumio.core.data.document.DocumentScanMode.LINEFINDER;
        goto L_0x00e2;
    L_0x00e0:
        r0 = com.jumio.core.data.document.DocumentScanMode.TD1;
    L_0x00e2:
        r3.setDocumentScanMode(r0);
        r0 = com.jumio.core.data.document.ScanSide.BACK;
        r3.setDocumentScanSide(r0);
        r0 = r3.getMaskingType();
        r1 = com.jumio.nv.data.document.NVDocumentMaskingType.NONE;
        if (r0 != r1) goto L_0x00fa;
    L_0x00f2:
        r0 = com.jumio.core.plugins.PluginRegistry.PluginMode.MRZ;
        r0 = com.jumio.core.plugins.PluginRegistry.hasPlugin(r0);
        if (r0 == 0) goto L_0x00fb;
    L_0x00fa:
        r2 = 1;
    L_0x00fb:
        r3.setPaperVariant(r2);
        r0 = r3.getMaskingType();
        r1 = com.jumio.nv.data.document.NVDocumentMaskingType.NONE;
        if (r0 == r1) goto L_0x0109;
    L_0x0106:
        r0 = com.jumio.core.data.document.DocumentScanMode.LINEFINDER;
        goto L_0x010b;
    L_0x0109:
        r0 = com.jumio.core.data.document.DocumentScanMode.TD2;
    L_0x010b:
        r3.setPaperScanMode(r0);
        r0 = com.jumio.core.data.document.ScanSide.FRONT;
        r3.setPaperScanSide(r0);
        r0 = 2;
        r3.setPaperParts(r0);
    L_0x0117:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.models.ServerSettingsModel.a(com.jumio.nv.data.country.Country, org.json.JSONObject, org.json.JSONObject):com.jumio.nv.data.document.DocumentType");
    }

    public boolean isLoaded() {
        return this.g;
    }

    public String getBarcodeScannerKey() {
        return this.a;
    }

    public boolean isBrandingEnabled() {
        return this.b;
    }

    public String getCountryForIp() {
        return this.c;
    }

    public CountryDocumentModel getCountryModel() {
        return this.f;
    }

    public boolean isVerificationAllowed() {
        return this.d;
    }

    public boolean isAdditionalDataPointsEnabled() {
        return this.e;
    }

    public boolean isAnalyticsEnabled() {
        return this.h;
    }

    public String getEnabledFields() {
        return this.i;
    }

    public int getMaxLivenessImages() {
        return this.j;
    }

    public byte[] getStatusPublicKey() {
        return this.l;
    }

    public byte[] getCdnPublicKey() {
        return this.k;
    }

    public boolean isCdnUsable() {
        byte[] bArr = this.k;
        return (bArr == null || bArr.length == 0) ? false : true;
    }

    public int getEyeTrackingKey() {
        return this.m;
    }

    public float getEyeTrackingThresholdMax() {
        return this.n;
    }

    public float getEyeTrackingEarlyThresholdMin() {
        return this.o;
    }

    public float getEyeTrackingEarlyThresholdMax() {
        return this.p;
    }

    public int getEyeTrackingPositionsMin() {
        return this.q;
    }

    public int getEyeTrackingPositionsMax() {
        return this.r;
    }

    public boolean isEyeTrackingAnalyticsEnabled() {
        return this.s;
    }

    public int getShakeDetection() {
        return this.t;
    }

    public float getShakeScore() {
        return this.u;
    }

    public float getFocusScore() {
        return this.v;
    }
}
