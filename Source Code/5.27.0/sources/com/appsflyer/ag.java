package com.appsflyer;

import android.content.pm.PackageManager;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ag {
    private static ag ng;
    private final String lC;
    private boolean lE;
    private boolean lU;
    private final String ld;
    private final String le;
    private final String lw;
    private final String lx;
    private boolean mV;
    private JSONArray nA;
    private int nB;
    private String nC;
    private final String nh;
    private final String ni;
    private final String nj;
    private final String nk;
    private final String nl;
    private final String nm;
    private final String nn;
    private final String np;
    private final String nq;
    private final String nr;
    private final String ns;
    private final String nt;
    private final String nu;
    private final String nv;
    private final String nw;
    private final String nx;
    private final String ny;
    private JSONObject nz;
    /* renamed from: ʽ */
    private final String f6;
    /* renamed from: ॱॱ */
    private final String f7;

    private ag() {
        this.mV = true;
        this.lU = true;
        this.lw = "brand";
        this.lx = "model";
        this.ld = "platform";
        this.f7 = "platform_version";
        this.f6 = "advertiserId";
        this.le = "imei";
        this.nh = "android_id";
        this.ni = "sdk_version";
        this.nj = "devkey";
        this.nk = "originalAppsFlyerId";
        this.nl = "uid";
        this.nm = "app_id";
        this.nn = "app_version";
        this.np = "channel";
        this.nq = "preInstall";
        this.nr = "data";
        this.ns = "r_debugging_off";
        this.nt = "r_debugging_on";
        this.nu = "public_api_call";
        this.nv = "exception";
        this.nw = "server_request";
        this.nx = "server_response";
        this.lC = "yyyy-MM-dd HH:mm:ssZ";
        this.ny = "MM-dd HH:mm:ss.SSS";
        this.nB = 0;
        this.nC = "-1";
        this.nA = new JSONArray();
        this.nB = 0;
        this.lE = false;
    }

    static ag dT() {
        if (ng == null) {
            ng = new ag();
        }
        return ng;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void E(String str) {
        this.nC = str;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void dU() {
        this.lE = true;
        a("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void di() {
        a("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.lE = false;
        this.mV = false;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void dp() {
        this.nz = null;
        this.nA = null;
        ng = null;
    }

    private synchronized void a(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.nz.put("brand", str);
            this.nz.put("model", str2);
            this.nz.put("platform", "Android");
            this.nz.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.nz.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.nz.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.nz.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void a(String str, String str2, String str3, String str4) {
        try {
            this.nz.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.nz.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.nz.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.nz.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void b(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.nz.put("app_id", str);
                }
            } catch (Throwable th) {
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.nz.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.nz.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.nz.put("preInstall", str4);
        }
    }

    /* Access modifiers changed, original: final|varargs */
    public final void a(String str, String... strArr) {
        a("public_api_call", str, strArr);
    }

    /* Access modifiers changed, original: final */
    public final void c(Throwable th) {
        String[] strArr;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        StackTraceElement[] stackTrace = cause == null ? th.getStackTrace() : cause.getStackTrace();
        int i = 1;
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            String[] strArr2 = new String[(stackTrace.length + 1)];
            strArr2[0] = message;
            while (i < stackTrace.length) {
                strArr2[i] = stackTrace[i].toString();
                i++;
            }
            strArr = strArr2;
        }
        a("exception", simpleName, strArr);
    }

    /* Access modifiers changed, original: final */
    public final void l(String str, String str2) {
        a("server_request", str, str2);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, int i, String str2) {
        a("server_response", str, String.valueOf(i), str2);
    }

    /* Access modifiers changed, original: final */
    public final void m(String str, String str2) {
        a(null, str, str2);
    }

    private synchronized String dV() {
        String str;
        str = null;
        try {
            this.nz.put("data", this.nA);
            str = this.nz.toString();
            dW();
        } catch (JSONException unused) {
        }
        return str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0071 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0066 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|10|11|12) */
    private synchronized void b(java.lang.String r11, android.content.pm.PackageManager r12) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = com.appsflyer.m.dw();	 Catch:{ all -> 0x0082 }
        r1 = com.appsflyer.j.dq();	 Catch:{ all -> 0x0082 }
        r2 = "remote_debug_static_data";
        r2 = r0.getString(r2);	 Catch:{ all -> 0x0082 }
        if (r2 == 0) goto L_0x0019;
    L_0x0011:
        r11 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0071 }
        r11.<init>(r2);	 Catch:{ Throwable -> 0x0071 }
        r10.nz = r11;	 Catch:{ Throwable -> 0x0071 }
        goto L_0x0071;
    L_0x0019:
        r2 = new org.json.JSONObject;	 Catch:{ all -> 0x0082 }
        r2.<init>();	 Catch:{ all -> 0x0082 }
        r10.nz = r2;	 Catch:{ all -> 0x0082 }
        r4 = android.os.Build.BRAND;	 Catch:{ all -> 0x0082 }
        r5 = android.os.Build.MODEL;	 Catch:{ all -> 0x0082 }
        r6 = android.os.Build.VERSION.RELEASE;	 Catch:{ all -> 0x0082 }
        r2 = "advertiserId";
        r7 = r0.getString(r2);	 Catch:{ all -> 0x0082 }
        r8 = r1.lw;	 Catch:{ all -> 0x0082 }
        r9 = r1.lx;	 Catch:{ all -> 0x0082 }
        r3 = r10;
        r3.a(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0082 }
        r1 = "4.9.0.184";
        r2 = "AppsFlyerKey";
        r2 = r0.getString(r2);	 Catch:{ all -> 0x0082 }
        r3 = "KSAppsFlyerId";
        r3 = r0.getString(r3);	 Catch:{ all -> 0x0082 }
        r4 = "uid";
        r4 = r0.getString(r4);	 Catch:{ all -> 0x0082 }
        r10.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0082 }
        r1 = 0;
        r12 = r12.getPackageInfo(r11, r1);	 Catch:{ Throwable -> 0x0066 }
        r12 = r12.versionCode;	 Catch:{ Throwable -> 0x0066 }
        r1 = "channel";
        r1 = r0.getString(r1);	 Catch:{ Throwable -> 0x0066 }
        r2 = "preInstallName";
        r2 = r0.getString(r2);	 Catch:{ Throwable -> 0x0066 }
        r12 = java.lang.String.valueOf(r12);	 Catch:{ Throwable -> 0x0066 }
        r10.b(r11, r12, r1, r2);	 Catch:{ Throwable -> 0x0066 }
    L_0x0066:
        r11 = "remote_debug_static_data";
        r12 = r10.nz;	 Catch:{ all -> 0x0082 }
        r12 = r12.toString();	 Catch:{ all -> 0x0082 }
        r0.set(r11, r12);	 Catch:{ all -> 0x0082 }
    L_0x0071:
        r11 = r10.nz;	 Catch:{ JSONException -> 0x007c }
        r12 = "launch_counter";
        r0 = r10.nC;	 Catch:{ JSONException -> 0x007c }
        r11.put(r12, r0);	 Catch:{ JSONException -> 0x007c }
        monitor-exit(r10);
        return;
    L_0x007c:
        r11 = move-exception;
        r11.printStackTrace();	 Catch:{ all -> 0x0082 }
        monitor-exit(r10);
        return;
    L_0x0082:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.ag.b(java.lang.String, android.content.pm.PackageManager):void");
    }

    private synchronized void dW() {
        this.nA = null;
        this.nA = new JSONArray();
        this.nB = 0;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void dh() {
        this.mV = false;
        dW();
    }

    /* Access modifiers changed, original: final */
    public final boolean dX() {
        return this.lE;
    }

    static void a(String str, PackageManager packageManager) {
        try {
            if (ng == null) {
                ng = new ag();
            }
            ng.b(str, packageManager);
            if (ng == null) {
                ng = new ag();
            }
            String dV = ng.dV();
            ad adVar = new ad(null, j.dq().ds());
            adVar.lx = dV;
            adVar.dp();
            String[] strArr = new String[1];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(t.Y("https://%smonitorsdk.%s/remote-debug?app_id="));
            stringBuilder.append(str);
            strArr[0] = stringBuilder.toString();
            adVar.execute(strArr);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing block: B:32:0x00b4, code skipped:
            return;
     */
    private synchronized void a(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r11.lU;	 Catch:{ all -> 0x00b5 }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x0007:
        r0 = r11.mV;	 Catch:{ all -> 0x00b5 }
        if (r0 != 0) goto L_0x000f;
    L_0x000b:
        r0 = r11.lE;	 Catch:{ all -> 0x00b5 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        r0 = 1;
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        if (r0 == 0) goto L_0x00b3;
    L_0x0014:
        r0 = r11.nB;	 Catch:{ all -> 0x00b5 }
        r3 = 98304; // 0x18000 float:1.37753E-40 double:4.85686E-319;
        if (r0 < r3) goto L_0x001d;
    L_0x001b:
        goto L_0x00b3;
    L_0x001d:
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ Throwable -> 0x00b1 }
        r0 = "";
        r5 = r14.length;	 Catch:{ Throwable -> 0x00b1 }
        if (r5 <= 0) goto L_0x0045;
    L_0x0026:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00b1 }
        r0.<init>();	 Catch:{ Throwable -> 0x00b1 }
        r5 = r14.length;	 Catch:{ Throwable -> 0x00b1 }
        r5 = r5 - r1;
    L_0x002d:
        if (r5 <= 0) goto L_0x003c;
    L_0x002f:
        r6 = r14[r5];	 Catch:{ Throwable -> 0x00b1 }
        r0.append(r6);	 Catch:{ Throwable -> 0x00b1 }
        r6 = ", ";
        r0.append(r6);	 Catch:{ Throwable -> 0x00b1 }
        r5 = r5 + -1;
        goto L_0x002d;
    L_0x003c:
        r14 = r14[r2];	 Catch:{ Throwable -> 0x00b1 }
        r0.append(r14);	 Catch:{ Throwable -> 0x00b1 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00b1 }
    L_0x0045:
        r14 = new java.text.SimpleDateFormat;	 Catch:{ Throwable -> 0x00b1 }
        r5 = "MM-dd HH:mm:ss.SSS";
        r6 = java.util.Locale.ENGLISH;	 Catch:{ Throwable -> 0x00b1 }
        r14.<init>(r5, r6);	 Catch:{ Throwable -> 0x00b1 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ Throwable -> 0x00b1 }
        r14 = r14.format(r3);	 Catch:{ Throwable -> 0x00b1 }
        r3 = 4;
        r4 = 3;
        r5 = 2;
        r6 = 5;
        if (r12 == 0) goto L_0x0080;
    L_0x005c:
        r7 = "%18s %5s _/%s [%s] %s %s";
        r8 = 6;
        r8 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x00b1 }
        r8[r2] = r14;	 Catch:{ Throwable -> 0x00b1 }
        r14 = java.lang.Thread.currentThread();	 Catch:{ Throwable -> 0x00b1 }
        r9 = r14.getId();	 Catch:{ Throwable -> 0x00b1 }
        r14 = java.lang.Long.valueOf(r9);	 Catch:{ Throwable -> 0x00b1 }
        r8[r1] = r14;	 Catch:{ Throwable -> 0x00b1 }
        r14 = "AppsFlyer_4.9.0";
        r8[r5] = r14;	 Catch:{ Throwable -> 0x00b1 }
        r8[r4] = r12;	 Catch:{ Throwable -> 0x00b1 }
        r8[r3] = r13;	 Catch:{ Throwable -> 0x00b1 }
        r8[r6] = r0;	 Catch:{ Throwable -> 0x00b1 }
        r12 = java.lang.String.format(r7, r8);	 Catch:{ Throwable -> 0x00b1 }
        goto L_0x00a0;
    L_0x0080:
        r12 = "%18s %5s %s/%s %s";
        r6 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x00b1 }
        r6[r2] = r14;	 Catch:{ Throwable -> 0x00b1 }
        r14 = java.lang.Thread.currentThread();	 Catch:{ Throwable -> 0x00b1 }
        r7 = r14.getId();	 Catch:{ Throwable -> 0x00b1 }
        r14 = java.lang.Long.valueOf(r7);	 Catch:{ Throwable -> 0x00b1 }
        r6[r1] = r14;	 Catch:{ Throwable -> 0x00b1 }
        r6[r5] = r13;	 Catch:{ Throwable -> 0x00b1 }
        r13 = "AppsFlyer_4.9.0";
        r6[r4] = r13;	 Catch:{ Throwable -> 0x00b1 }
        r6[r3] = r0;	 Catch:{ Throwable -> 0x00b1 }
        r12 = java.lang.String.format(r12, r6);	 Catch:{ Throwable -> 0x00b1 }
    L_0x00a0:
        r13 = r11.nA;	 Catch:{ Throwable -> 0x00b1 }
        r13.put(r12);	 Catch:{ Throwable -> 0x00b1 }
        r13 = r11.nB;	 Catch:{ Throwable -> 0x00b1 }
        r12 = r12.getBytes();	 Catch:{ Throwable -> 0x00b1 }
        r12 = r12.length;	 Catch:{ Throwable -> 0x00b1 }
        r13 = r13 + r12;
        r11.nB = r13;	 Catch:{ Throwable -> 0x00b1 }
        monitor-exit(r11);
        return;
    L_0x00b1:
        monitor-exit(r11);
        return;
    L_0x00b3:
        monitor-exit(r11);
        return;
    L_0x00b5:
        r12 = move-exception;
        monitor-exit(r11);
        goto L_0x00b9;
    L_0x00b8:
        throw r12;
    L_0x00b9:
        goto L_0x00b8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.ag.a(java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
