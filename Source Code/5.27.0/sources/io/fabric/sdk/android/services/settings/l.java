package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall */
class l extends a implements w {
    /* Access modifiers changed, original: 0000 */
    public boolean ju(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public l(h hVar, String str, String str2, c cVar) {
        this(hVar, str, str2, cVar, HttpMethod.GET);
    }

    l(h hVar, String str, String str2, c cVar, HttpMethod httpMethod) {
        super(hVar, str, str2, cVar, httpMethod);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    public org.json.JSONObject a(io.fabric.sdk.android.services.settings.v r10) {
        /*
        r9 = this;
        r0 = "X-REQUEST-ID";
        r1 = "Settings request ID: ";
        r2 = "Fabric";
        r3 = 0;
        r4 = r9.b(r10);	 Catch:{ HttpRequestException -> 0x0075, all -> 0x0070 }
        r5 = r9.S(r4);	 Catch:{ HttpRequestException -> 0x0075, all -> 0x0070 }
        r10 = r9.a(r5, r10);	 Catch:{ HttpRequestException -> 0x006d, all -> 0x006a }
        r5 = io.fabric.sdk.android.c.biX();	 Catch:{ HttpRequestException -> 0x0068 }
        r6 = new java.lang.StringBuilder;	 Catch:{ HttpRequestException -> 0x0068 }
        r6.<init>();	 Catch:{ HttpRequestException -> 0x0068 }
        r7 = "Requesting settings from ";
        r6.append(r7);	 Catch:{ HttpRequestException -> 0x0068 }
        r7 = r9.getUrl();	 Catch:{ HttpRequestException -> 0x0068 }
        r6.append(r7);	 Catch:{ HttpRequestException -> 0x0068 }
        r6 = r6.toString();	 Catch:{ HttpRequestException -> 0x0068 }
        r5.d(r2, r6);	 Catch:{ HttpRequestException -> 0x0068 }
        r5 = io.fabric.sdk.android.c.biX();	 Catch:{ HttpRequestException -> 0x0068 }
        r6 = new java.lang.StringBuilder;	 Catch:{ HttpRequestException -> 0x0068 }
        r6.<init>();	 Catch:{ HttpRequestException -> 0x0068 }
        r7 = "Settings query params were: ";
        r6.append(r7);	 Catch:{ HttpRequestException -> 0x0068 }
        r6.append(r4);	 Catch:{ HttpRequestException -> 0x0068 }
        r4 = r6.toString();	 Catch:{ HttpRequestException -> 0x0068 }
        r5.d(r2, r4);	 Catch:{ HttpRequestException -> 0x0068 }
        r3 = r9.b(r10);	 Catch:{ HttpRequestException -> 0x0068 }
        if (r10 == 0) goto L_0x008c;
    L_0x004d:
        r4 = io.fabric.sdk.android.c.biX();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
    L_0x0056:
        r5.append(r1);
        r10 = r10.header(r0);
        r5.append(r10);
        r10 = r5.toString();
        r4.d(r2, r10);
        goto L_0x008c;
    L_0x0068:
        r4 = move-exception;
        goto L_0x0077;
    L_0x006a:
        r3 = move-exception;
        r10 = r5;
        goto L_0x008e;
    L_0x006d:
        r4 = move-exception;
        r10 = r5;
        goto L_0x0077;
    L_0x0070:
        r10 = move-exception;
        r8 = r3;
        r3 = r10;
        r10 = r8;
        goto L_0x008e;
    L_0x0075:
        r4 = move-exception;
        r10 = r3;
    L_0x0077:
        r5 = io.fabric.sdk.android.c.biX();	 Catch:{ all -> 0x008d }
        r6 = "Settings request failed.";
        r5.e(r2, r6, r4);	 Catch:{ all -> 0x008d }
        if (r10 == 0) goto L_0x008c;
    L_0x0082:
        r4 = io.fabric.sdk.android.c.biX();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        goto L_0x0056;
    L_0x008c:
        return r3;
    L_0x008d:
        r3 = move-exception;
    L_0x008e:
        if (r10 == 0) goto L_0x00aa;
    L_0x0090:
        r4 = io.fabric.sdk.android.c.biX();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r1);
        r10 = r10.header(r0);
        r5.append(r10);
        r10 = r5.toString();
        r4.d(r2, r10);
    L_0x00aa:
        goto L_0x00ac;
    L_0x00ab:
        throw r3;
    L_0x00ac:
        goto L_0x00ab;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.settings.l.a(io.fabric.sdk.android.services.settings.v):org.json.JSONObject");
    }

    /* Access modifiers changed, original: 0000 */
    public JSONObject b(HttpRequest httpRequest) {
        int code = httpRequest.code();
        k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings result was: ");
        stringBuilder.append(code);
        String str = "Fabric";
        biX.d(str, stringBuilder.toString());
        if (ju(code)) {
            return lE(httpRequest.bkp());
        }
        k biX2 = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Failed to retrieve settings from ");
        stringBuilder2.append(getUrl());
        biX2.e(str, stringBuilder2.toString());
        return null;
    }

    private JSONObject lE(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse settings JSON from ");
            stringBuilder.append(getUrl());
            String str2 = "Fabric";
            biX.d(str2, stringBuilder.toString(), e);
            k biX2 = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Settings response ");
            stringBuilder2.append(str);
            biX2.d(str2, stringBuilder2.toString());
            return null;
        }
    }

    private Map<String, String> b(v vVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", vVar.ePh);
        hashMap.put("display_version", vVar.ePg);
        hashMap.put("source", Integer.toString(vVar.ePj));
        if (vVar.eQg != null) {
            hashMap.put("icon_hash", vVar.eQg);
        }
        String str = vVar.eQf;
        if (!CommonUtils.aB(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    private HttpRequest a(HttpRequest httpRequest, v vVar) {
        a(httpRequest, "X-CRASHLYTICS-API-KEY", vVar.oM);
        a(httpRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a(httpRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", this.nP.getVersion());
        a(httpRequest, "Accept", "application/json");
        a(httpRequest, "X-CRASHLYTICS-DEVICE-MODEL", vVar.pg);
        a(httpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", vVar.eQd);
        a(httpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", vVar.eQe);
        a(httpRequest, "X-CRASHLYTICS-INSTALLATION-ID", vVar.pb);
        return httpRequest;
    }

    private void a(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.aS(str, str2);
        }
    }
}
