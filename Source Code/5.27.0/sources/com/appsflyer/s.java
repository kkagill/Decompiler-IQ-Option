package com.appsflyer;

import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public abstract class s implements Runnable {
    String kZ;
    private j ma;
    private a mg;

    public static class a {
        static HttpsURLConnection W(String str) {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    public abstract void H(String str);

    public abstract void a(HttpsURLConnection httpsURLConnection);

    public abstract void di();

    public abstract String dl();

    s(j jVar) {
        this.ma = jVar;
    }

    public void a(a aVar) {
        this.mg = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5  */
    public void run() {
        /*
        r9 = this;
        r0 = "";
        r1 = java.lang.System.currentTimeMillis();
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r1 / r3;
        r3 = r9.dl();
        r4 = java.lang.String.valueOf(r3);
        r5 = "oneLinkUrl: ";
        r4 = r5.concat(r4);
        com.appsflyer.AFLogger.G(r4);
        r4 = com.appsflyer.s.a.W(r3);	 Catch:{ Throwable -> 0x0087 }
        r5 = "content-type";
        r6 = "application/json";
        r4.addRequestProperty(r5, r6);	 Catch:{ Throwable -> 0x0087 }
        r5 = "authorization";
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0087 }
        r6.<init>();	 Catch:{ Throwable -> 0x0087 }
        r7 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0087 }
        r8 = "AppsFlyerKey";
        r7 = r7.getString(r8);	 Catch:{ Throwable -> 0x0087 }
        r6.append(r7);	 Catch:{ Throwable -> 0x0087 }
        r6.append(r1);	 Catch:{ Throwable -> 0x0087 }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x0087 }
        r6 = com.appsflyer.ae.U(r6);	 Catch:{ Throwable -> 0x0087 }
        r4.addRequestProperty(r5, r6);	 Catch:{ Throwable -> 0x0087 }
        r5 = "af-timestamp";
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x0087 }
        r4.addRequestProperty(r5, r1);	 Catch:{ Throwable -> 0x0087 }
        r1 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r4.setReadTimeout(r1);	 Catch:{ Throwable -> 0x0087 }
        r4.setConnectTimeout(r1);	 Catch:{ Throwable -> 0x0087 }
        r9.a(r4);	 Catch:{ Throwable -> 0x0087 }
        r1 = r4.getResponseCode();	 Catch:{ Throwable -> 0x0087 }
        r2 = com.appsflyer.j.c(r4);	 Catch:{ Throwable -> 0x0087 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 != r4) goto L_0x006d;
    L_0x0067:
        r1 = "Status 200 ok";
        com.appsflyer.AFLogger.J(r1);	 Catch:{ Throwable -> 0x0084 }
        goto L_0x00ae;
    L_0x006d:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0084 }
        r4 = "Response code = ";
        r0.<init>(r4);	 Catch:{ Throwable -> 0x0084 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0084 }
        r1 = " content = ";
        r0.append(r1);	 Catch:{ Throwable -> 0x0084 }
        r0.append(r2);	 Catch:{ Throwable -> 0x0084 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0084 }
        goto L_0x00ae;
    L_0x0084:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0089;
    L_0x0087:
        r1 = move-exception;
        r2 = r0;
    L_0x0089:
        r0 = java.lang.String.valueOf(r3);
        r4 = "Error while calling ";
        r0 = r4.concat(r0);
        com.appsflyer.AFLogger.c(r0, r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>(r4);
        r0.append(r3);
        r3 = " stacktrace: ";
        r0.append(r3);
        r1 = r1.toString();
        r0.append(r1);
        r0 = r0.toString();
    L_0x00ae:
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x00c5;
    L_0x00b4:
        r0 = java.lang.String.valueOf(r2);
        r1 = "Connection call succeeded: ";
        r0 = r1.concat(r0);
        com.appsflyer.AFLogger.J(r0);
        r9.H(r2);
        return;
    L_0x00c5:
        r0 = java.lang.String.valueOf(r0);
        r1 = "Connection error: ";
        r0 = r1.concat(r0);
        com.appsflyer.AFLogger.K(r0);
        r9.di();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.s.run():void");
    }
}
