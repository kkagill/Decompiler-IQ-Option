package com.appsflyer;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings.Secure;

final class n {

    static class e extends IllegalStateException {
        e(String str) {
            super(str);
        }
    }

    static l b(ContentResolver contentResolver) {
        l lVar = null;
        if (contentResolver == null) {
            return null;
        }
        if (m.dw().getString("amazon_aid") == null) {
            if ("Amazon".equals(Build.MANUFACTURER)) {
                int i = Secure.getInt(contentResolver, "limit_ad_tracking", 2);
                String str = "advertising_id";
                if (i == 0) {
                    lVar = new l(e.AMAZON, Secure.getString(contentResolver, str), false);
                } else if (i != 2) {
                    String string;
                    try {
                        string = Secure.getString(contentResolver, str);
                    } catch (Throwable th) {
                        AFLogger.c("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                        string = "";
                    }
                    lVar = new l(e.AMAZON, string, true);
                }
            }
        }
        return lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c A:{SYNTHETIC, Splitter:B:33:0x008c} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c A:{SYNTHETIC, Splitter:B:33:0x008c} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Missing block: B:19:0x0045, code skipped:
            if (r8.length() == 0) goto L_0x0047;
     */
    static void b(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
        r0 = "advertiserIdEnabled";
        r1 = "advertiserId";
        r2 = "Trying to fetch GAID..";
        com.appsflyer.AFLogger.J(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = com.google.android.gms.common.GoogleApiAvailability.getInstance();	 Catch:{ Throwable -> 0x0017 }
        r3 = r3.isGooglePlayServicesAvailable(r12);	 Catch:{ Throwable -> 0x0017 }
        goto L_0x0020;
    L_0x0017:
        r3 = move-exception;
        r4 = r3.getMessage();
        com.appsflyer.AFLogger.c(r4, r3);
        r3 = -1;
    L_0x0020:
        r4 = 0;
        r5 = 0;
        r6 = 1;
        r7 = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
        java.lang.Class.forName(r7);	 Catch:{ Throwable -> 0x0061 }
        r7 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r12);	 Catch:{ Throwable -> 0x0061 }
        if (r7 == 0) goto L_0x0054;
    L_0x002e:
        r8 = r7.getId();	 Catch:{ Throwable -> 0x0061 }
        r7 = r7.isLimitAdTrackingEnabled();	 Catch:{ Throwable -> 0x0052 }
        if (r7 != 0) goto L_0x003a;
    L_0x0038:
        r7 = 1;
        goto L_0x003b;
    L_0x003a:
        r7 = 0;
    L_0x003b:
        r4 = java.lang.Boolean.toString(r7);	 Catch:{ Throwable -> 0x0052 }
        if (r8 == 0) goto L_0x0047;
    L_0x0041:
        r7 = r8.length();	 Catch:{ Throwable -> 0x004f }
        if (r7 != 0) goto L_0x004c;
    L_0x0047:
        r7 = "emptyOrNull |";
        r2.append(r7);	 Catch:{ Throwable -> 0x004f }
    L_0x004c:
        r9 = 1;
        goto L_0x00e9;
    L_0x004f:
        r7 = move-exception;
        r9 = 1;
        goto L_0x0064;
    L_0x0052:
        r7 = move-exception;
        goto L_0x0063;
    L_0x0054:
        r7 = "gpsAdInfo-null |";
        r2.append(r7);	 Catch:{ Throwable -> 0x0061 }
        r7 = new com.appsflyer.n$e;	 Catch:{ Throwable -> 0x0061 }
        r8 = "GpsAdIndo is null";
        r7.<init>(r8);	 Catch:{ Throwable -> 0x0061 }
        throw r7;	 Catch:{ Throwable -> 0x0061 }
    L_0x0061:
        r7 = move-exception;
        r8 = r4;
    L_0x0063:
        r9 = 0;
    L_0x0064:
        r10 = r7.getMessage();
        com.appsflyer.AFLogger.c(r10, r7);
        r7 = r7.getClass();
        r7 = r7.getSimpleName();
        r2.append(r7);
        r7 = " |";
        r2.append(r7);
        r10 = "WARNING: Google Play Services is missing.";
        com.appsflyer.AFLogger.J(r10);
        r10 = com.appsflyer.m.dw();
        r11 = "enableGpsFallback";
        r10 = r10.getBoolean(r11, r6);
        if (r10 == 0) goto L_0x00e9;
    L_0x008c:
        r4 = com.appsflyer.y.B(r12);	 Catch:{ Throwable -> 0x00ad }
        r8 = r4.dE();	 Catch:{ Throwable -> 0x00ad }
        r4 = r4.dL();	 Catch:{ Throwable -> 0x00ad }
        if (r4 != 0) goto L_0x009b;
    L_0x009a:
        r5 = 1;
    L_0x009b:
        r4 = java.lang.Boolean.toString(r5);	 Catch:{ Throwable -> 0x00ad }
        if (r8 == 0) goto L_0x00a7;
    L_0x00a1:
        r5 = r8.length();	 Catch:{ Throwable -> 0x00ad }
        if (r5 != 0) goto L_0x00e9;
    L_0x00a7:
        r5 = "emptyOrNull (bypass) |";
        r2.append(r5);	 Catch:{ Throwable -> 0x00ad }
        goto L_0x00e9;
    L_0x00ad:
        r4 = move-exception;
        r5 = r4.getMessage();
        com.appsflyer.AFLogger.c(r5, r4);
        r5 = r4.getClass();
        r5 = r5.getSimpleName();
        r2.append(r5);
        r2.append(r7);
        r5 = com.appsflyer.m.dw();
        r8 = r5.getString(r1);
        r5 = com.appsflyer.m.dw();
        r5 = r5.getString(r0);
        r6 = r4.getLocalizedMessage();
        if (r6 == 0) goto L_0x00e1;
    L_0x00d9:
        r4 = r4.getLocalizedMessage();
        com.appsflyer.AFLogger.J(r4);
        goto L_0x00e8;
    L_0x00e1:
        r4 = r4.toString();
        com.appsflyer.AFLogger.J(r4);
    L_0x00e8:
        r4 = r5;
    L_0x00e9:
        r12 = r12.getClass();
        r12 = r12.getName();
        r5 = "android.app.ReceiverRestrictedContext";
        r12 = r12.equals(r5);
        if (r12 == 0) goto L_0x010e;
    L_0x00f9:
        r12 = com.appsflyer.m.dw();
        r8 = r12.getString(r1);
        r12 = com.appsflyer.m.dw();
        r4 = r12.getString(r0);
        r12 = "context = android.app.ReceiverRestrictedContext |";
        r2.append(r12);
    L_0x010e:
        r12 = r2.length();
        if (r12 <= 0) goto L_0x012d;
    L_0x0114:
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r12.append(r3);
        r3 = ": ";
        r12.append(r3);
        r12.append(r2);
        r12 = r12.toString();
        r2 = "gaidError";
        r13.put(r2, r12);
    L_0x012d:
        if (r8 == 0) goto L_0x014e;
    L_0x012f:
        if (r4 == 0) goto L_0x014e;
    L_0x0131:
        r13.put(r1, r8);
        r13.put(r0, r4);
        r12 = com.appsflyer.m.dw();
        r12.set(r1, r8);
        r12 = com.appsflyer.m.dw();
        r12.set(r0, r4);
        r12 = java.lang.String.valueOf(r9);
        r0 = "isGaidWithGps";
        r13.put(r0, r12);
    L_0x014e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.n.b(android.content.Context, java.util.Map):void");
    }
}
