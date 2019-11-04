package com.iqoption.service.websocket.a;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.aa;
import com.google.gson.JsonObject;
import com.iqoption.mobbtech.connect.RequestManager.Method;
import java.util.UUID;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* compiled from: RequestHandler */
public class b {
    @Nullable
    public final String bqc;
    @Nullable
    public final com.iqoption.mobbtech.connect.request.a.a.b dSx;
    @Nullable
    public final aa dSy;
    private final long dSz;

    b(com.iqoption.mobbtech.connect.request.a.a.b bVar, aa aaVar, long j) {
        String aPD = bVar.aPD();
        if (aPD == null) {
            aPD = UUID.randomUUID().toString();
        }
        this.bqc = aPD;
        this.dSx = bVar;
        this.dSy = aaVar;
        this.dSz = j;
    }

    b(long j) {
        this.bqc = null;
        this.dSx = null;
        this.dSy = null;
        this.dSz = j;
    }

    @Nullable
    public String aTF() {
        com.iqoption.mobbtech.connect.request.a.a.b bVar = this.dSx;
        return bVar != null ? bVar.aPH().url().encodedPath().replaceAll("[-/]", "_").substring(1) : null;
    }

    public String aTG() {
        com.iqoption.mobbtech.connect.request.a.a.b bVar = this.dSx;
        return bVar != null ? bVar.aPC() : "";
    }

    @Nullable
    public JsonObject aTH() {
        if (this.dSx == null) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        Request aPH = this.dSx.aPH();
        int i = 0;
        if (aPH.method().equalsIgnoreCase(Method.GET.name())) {
            HttpUrl url = aPH.url();
            while (i < url.querySize()) {
                jsonObject.addProperty(url.queryParameterName(i), url.queryParameterValue(i));
                i++;
            }
        } else if (aPH.body() instanceof FormBody) {
            FormBody formBody = (FormBody) aPH.body();
            while (i < formBody.size()) {
                String name = formBody.name(i);
                if (name.endsWith("[]")) {
                    name = new StringBuilder(name).insert(name.length() - 1, i).toString();
                }
                jsonObject.addProperty(name, formBody.value(i));
                i++;
            }
        }
        return jsonObject;
    }

    public long aTI() {
        return this.dSz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    public static com.iqoption.service.websocket.a.a b(java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
        r0 = r4.hashCode();
        r1 = -714599587; // 0xffffffffd568135d float:-1.59481164E13 double:NaN;
        r2 = 2;
        r3 = 1;
        if (r0 == r1) goto L_0x002b;
    L_0x000b:
        r1 = 691453791; // 0x2936bf5f float:4.0578106E-14 double:3.41623564E-315;
        if (r0 == r1) goto L_0x0021;
    L_0x0010:
        r1 = 1427230710; // 0x5511cff6 float:1.00201482E13 double:7.051456625E-315;
        if (r0 == r1) goto L_0x0016;
    L_0x0015:
        goto L_0x0036;
    L_0x0016:
        r0 = "unsubscribeMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x001f:
        r4 = 2;
        goto L_0x0037;
    L_0x0021:
        r0 = "sendMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x0029:
        r4 = 0;
        goto L_0x0037;
    L_0x002b:
        r0 = "subscribeMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x0034:
        r4 = 1;
        goto L_0x0037;
    L_0x0036:
        r4 = -1;
    L_0x0037:
        if (r4 == 0) goto L_0x004b;
    L_0x0039:
        if (r4 == r3) goto L_0x0045;
    L_0x003b:
        if (r4 == r2) goto L_0x003f;
    L_0x003d:
        r4 = 0;
        goto L_0x0050;
    L_0x003f:
        r4 = new com.iqoption.service.websocket.a.e;
        r4.<init>(r5, r6);
        goto L_0x0050;
    L_0x0045:
        r4 = new com.iqoption.service.websocket.a.d;
        r4.<init>(r5, r6);
        goto L_0x0050;
    L_0x004b:
        r4 = new com.iqoption.service.websocket.a.c;
        r4.<init>(r5, r6);
    L_0x0050:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.service.websocket.a.b.b(java.lang.String, java.lang.String, java.util.Map):com.iqoption.service.websocket.a.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    public static com.iqoption.service.websocket.a.a a(java.lang.String r4, com.iqoption.mobbtech.connect.request.a.a.b r5, com.google.common.util.concurrent.aa r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
        r0 = r4.hashCode();
        r1 = -714599587; // 0xffffffffd568135d float:-1.59481164E13 double:NaN;
        r2 = 2;
        r3 = 1;
        if (r0 == r1) goto L_0x002b;
    L_0x000b:
        r1 = 691453791; // 0x2936bf5f float:4.0578106E-14 double:3.41623564E-315;
        if (r0 == r1) goto L_0x0021;
    L_0x0010:
        r1 = 1427230710; // 0x5511cff6 float:1.00201482E13 double:7.051456625E-315;
        if (r0 == r1) goto L_0x0016;
    L_0x0015:
        goto L_0x0036;
    L_0x0016:
        r0 = "unsubscribeMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x001f:
        r4 = 2;
        goto L_0x0037;
    L_0x0021:
        r0 = "sendMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x0029:
        r4 = 0;
        goto L_0x0037;
    L_0x002b:
        r0 = "subscribeMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x0034:
        r4 = 1;
        goto L_0x0037;
    L_0x0036:
        r4 = -1;
    L_0x0037:
        if (r4 == 0) goto L_0x004b;
    L_0x0039:
        if (r4 == r3) goto L_0x0045;
    L_0x003b:
        if (r4 == r2) goto L_0x003f;
    L_0x003d:
        r4 = 0;
        goto L_0x0050;
    L_0x003f:
        r4 = new com.iqoption.service.websocket.a.e;
        r4.<init>(r5, r6, r7, r8);
        goto L_0x0050;
    L_0x0045:
        r4 = new com.iqoption.service.websocket.a.d;
        r4.<init>(r5, r6, r7, r8);
        goto L_0x0050;
    L_0x004b:
        r4 = new com.iqoption.service.websocket.a.c;
        r4.<init>(r5, r6, r7, r8);
    L_0x0050:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.service.websocket.a.b.a(java.lang.String, com.iqoption.mobbtech.connect.request.a.a.b, com.google.common.util.concurrent.aa, java.lang.String, java.util.Map):com.iqoption.service.websocket.a.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    public static com.iqoption.service.websocket.a.a a(java.lang.String r4, com.iqoption.mobbtech.connect.request.a.a.b r5, com.google.common.util.concurrent.aa r6, java.lang.String r7, com.google.gson.JsonObject r8) {
        /*
        r0 = r4.hashCode();
        r1 = -714599587; // 0xffffffffd568135d float:-1.59481164E13 double:NaN;
        r2 = 2;
        r3 = 1;
        if (r0 == r1) goto L_0x002b;
    L_0x000b:
        r1 = 691453791; // 0x2936bf5f float:4.0578106E-14 double:3.41623564E-315;
        if (r0 == r1) goto L_0x0021;
    L_0x0010:
        r1 = 1427230710; // 0x5511cff6 float:1.00201482E13 double:7.051456625E-315;
        if (r0 == r1) goto L_0x0016;
    L_0x0015:
        goto L_0x0036;
    L_0x0016:
        r0 = "unsubscribeMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x001f:
        r4 = 2;
        goto L_0x0037;
    L_0x0021:
        r0 = "sendMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x0029:
        r4 = 0;
        goto L_0x0037;
    L_0x002b:
        r0 = "subscribeMessage";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0036;
    L_0x0034:
        r4 = 1;
        goto L_0x0037;
    L_0x0036:
        r4 = -1;
    L_0x0037:
        if (r4 == 0) goto L_0x004f;
    L_0x0039:
        if (r4 == r3) goto L_0x0047;
    L_0x003b:
        if (r4 == r2) goto L_0x003f;
    L_0x003d:
        r4 = 0;
        goto L_0x0054;
    L_0x003f:
        r4 = new java.lang.RuntimeException;
        r5 = "not supported for TYPE_UNSUBSCRIBE";
        r4.<init>(r5);
        throw r4;
    L_0x0047:
        r4 = new java.lang.RuntimeException;
        r5 = "not supported for TYPE_SUBSCRIBE";
        r4.<init>(r5);
        throw r4;
    L_0x004f:
        r4 = new com.iqoption.service.websocket.a.c;
        r4.<init>(r5, r6, r7, r8);
    L_0x0054:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.service.websocket.a.b.a(java.lang.String, com.iqoption.mobbtech.connect.request.a.a.b, com.google.common.util.concurrent.aa, java.lang.String, com.google.gson.JsonObject):com.iqoption.service.websocket.a.a");
    }

    public static b a(com.iqoption.mobbtech.connect.request.a.a.b bVar, aa aaVar, long j) {
        return new b(bVar, aaVar, j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RequestHandler{requestId='");
        stringBuilder.append(this.bqc);
        stringBuilder.append('\'');
        stringBuilder.append(", requestTask=");
        stringBuilder.append(this.dSx);
        stringBuilder.append(", settableFuture=");
        stringBuilder.append(this.dSy);
        stringBuilder.append(", requestTimeout=");
        stringBuilder.append(this.dSz);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
