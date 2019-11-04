package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.jumio.analytics.MobileEvents;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b {
    static final int kG = ((int) TimeUnit.MILLISECONDS.toMillis(1500));
    static volatile boolean kH;
    static String[] kI;
    private static b kJ = null;
    private static Uri kK = null;
    private static Uri kL = null;
    protected int kM = -1;

    private b() {
    }

    public static b dc() {
        if (kJ == null) {
            kJ = new b();
        }
        return kJ;
    }

    private void a(final Context context, final Map<String, Object> map, final Uri uri) {
        Object obj;
        String obj2 = uri.toString();
        if (kI != null) {
            StringBuilder stringBuilder = new StringBuilder("Validate ESP deeplinks : ");
            stringBuilder.append(Arrays.asList(kI));
            AFLogger.G(stringBuilder.toString());
            if (!obj2.contains("af_tranid=")) {
                for (String str : Arrays.asList(kI)) {
                    if (obj2.contains("://".concat(String.valueOf(str)))) {
                        obj = 1;
                        break;
                    } else {
                        AFLogger.G("Validate ESP: reject ".concat(String.valueOf(str)));
                    }
                }
            }
        }
        obj = null;
        if (obj != null) {
            StringBuilder stringBuilder2 = new StringBuilder("Validation ESP succeeded for: ");
            stringBuilder2.append(uri.toString());
            AFLogger.G(stringBuilder2.toString());
            kH = true;
            c.dd().de().execute(new Runnable() {
                public final void run() {
                    long currentTimeMillis;
                    HashMap hashMap = new HashMap();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Uri uri = null;
                    try {
                        StringBuilder stringBuilder = new StringBuilder("ESP deeplink resoling is started: ");
                        stringBuilder.append(uri.toString());
                        AFLogger.G(stringBuilder.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(b.kG);
                        httpURLConnection.setConnectTimeout(b.kG);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.connect();
                        AFLogger.G("ESP deeplink resoling is finished");
                        hashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(httpURLConnection.getResponseCode()));
                        if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() <= MobileEvents.EVENTTYPE_EXCEPTION) {
                            uri = Uri.parse(httpURLConnection.getHeaderField("Location"));
                        }
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                        httpURLConnection.disconnect();
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        hashMap.put(NotificationCompat.CATEGORY_STATUS, "-1");
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                        AFLogger.c(th.getMessage(), th);
                    }
                    hashMap.put("latency", Long.toString(currentTimeMillis));
                    if (uri != null) {
                        hashMap.put("res", uri.toString());
                    } else {
                        hashMap.put("res", "");
                    }
                    StringBuilder stringBuilder2 = new StringBuilder("ESP deeplink results: ");
                    stringBuilder2.append(new JSONObject(hashMap).toString());
                    AFLogger.G(stringBuilder2.toString());
                    synchronized (map) {
                        map.put("af_deeplink_r", hashMap);
                        map.put("af_deeplink", uri.toString());
                    }
                    b.kH = false;
                    if (uri == null) {
                        uri = uri;
                    }
                    j.dq().b(context, map, uri);
                }

                static void h(Context context) {
                    context = context.getApplicationContext();
                    AFLogger.J("onBecameBackground");
                    j.dq().dp();
                    AFLogger.J("callStatsBackground background call");
                    j.dq().a(new WeakReference(context));
                    ag dT = ag.dT();
                    if (dT.dX()) {
                        dT.di();
                        if (context != null) {
                            ag.a(context.getPackageName(), context.getPackageManager());
                        }
                        dT.dp();
                    } else {
                        AFLogger.I("RD status is OFF");
                    }
                    c.dd().dh();
                }
            });
            return;
        }
        j.dq().b(context, (Map) map, uri);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    public void a(android.content.Intent r10, android.content.Context r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
        r9 = this;
        r0 = 0;
        if (r10 == 0) goto L_0x0014;
    L_0x0003:
        r1 = r10.getAction();
        r2 = "android.intent.action.VIEW";
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0014;
    L_0x000f:
        r1 = r10.getData();
        goto L_0x0015;
    L_0x0014:
        r1 = r0;
    L_0x0015:
        if (r1 == 0) goto L_0x00f5;
    L_0x0017:
        r0 = com.appsflyer.m.dw();
        r2 = 0;
        r3 = "consumeAfDeepLink";
        r0 = r0.getBoolean(r3, r2);
        r3 = r10.getFlags();
        r4 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r3 = r3 & r4;
        if (r3 != 0) goto L_0x002d;
    L_0x002b:
        r3 = 1;
        goto L_0x002e;
    L_0x002d:
        r3 = 0;
    L_0x002e:
        r4 = "appsflyer_click_ts";
        r5 = r10.hasExtra(r4);
        r6 = "skipping re-use of previously consumed deep link: ";
        if (r5 == 0) goto L_0x007d;
    L_0x0038:
        if (r0 != 0) goto L_0x007d;
    L_0x003a:
        r2 = 0;
        r4 = r10.getLongExtra(r4, r2);
        r10 = com.appsflyer.m.dw();
        r0 = "appsflyer_click_consumed_ts";
        r7 = r10.getLong(r0, r2);
        r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r10 == 0) goto L_0x005d;
    L_0x004e:
        r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r10 == 0) goto L_0x005d;
    L_0x0052:
        r9.a(r11, r12, r1);
        r10 = com.appsflyer.m.dw();
        r10.b(r0, r4);
        return;
    L_0x005d:
        r10 = new java.lang.StringBuilder;
        r10.<init>(r6);
        r11 = r1.toString();
        r10.append(r11);
        r11 = " w/Ex: ";
        r10.append(r11);
        r11 = java.lang.String.valueOf(r4);
        r10.append(r11);
        r10 = r10.toString();
        com.appsflyer.AFLogger.J(r10);
        return;
    L_0x007d:
        if (r0 != 0) goto L_0x00be;
    L_0x007f:
        if (r3 != 0) goto L_0x00be;
    L_0x0081:
        r10 = com.appsflyer.m.dw();
        r0 = "lastActivityHash";
        r10 = r10.getInt(r0, r2);
        r2 = r9.kM;
        if (r2 == r10) goto L_0x009c;
    L_0x008f:
        r9.a(r11, r12, r1);
        r10 = com.appsflyer.m.dw();
        r11 = r9.kM;
        r10.set(r0, r11);
        return;
    L_0x009c:
        r10 = new java.lang.StringBuilder;
        r10.<init>(r6);
        r11 = r1.toString();
        r10.append(r11);
        r11 = " w/hC: ";
        r10.append(r11);
        r11 = r9.kM;
        r11 = java.lang.String.valueOf(r11);
        r10.append(r11);
        r10 = r10.toString();
        com.appsflyer.AFLogger.J(r10);
        return;
    L_0x00be:
        r10 = java.lang.Boolean.valueOf(r3);
        r0 = kK;
        if (r0 == 0) goto L_0x00ef;
    L_0x00c6:
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00ef;
    L_0x00cd:
        r11 = new java.lang.StringBuilder;
        r11.<init>(r6);
        r12 = r1.toString();
        r11.append(r12);
        r10 = r10.booleanValue();
        if (r10 == 0) goto L_0x00e2;
    L_0x00df:
        r10 = " w/sT";
        goto L_0x00e4;
    L_0x00e2:
        r10 = " w/cAPI";
    L_0x00e4:
        r11.append(r10);
        r10 = r11.toString();
        com.appsflyer.AFLogger.J(r10);
        return;
    L_0x00ef:
        r9.a(r11, r12, r1);
        kK = r1;
        return;
    L_0x00f5:
        r10 = kL;
        if (r10 == 0) goto L_0x0117;
    L_0x00f9:
        r9.a(r11, r12, r10);
        r10 = new java.lang.StringBuilder;
        r11 = "using trampoline Intent fallback with URI : ";
        r10.<init>(r11);
        r11 = kL;
        r11 = r11.toString();
        r10.append(r11);
        r10 = r10.toString();
        com.appsflyer.AFLogger.J(r10);
        kL = r0;
        return;
    L_0x0117:
        r10 = com.appsflyer.j.dq();
        r10 = r10.ly;
        if (r10 == 0) goto L_0x0128;
    L_0x011f:
        r10 = com.appsflyer.j.dq();
        r10 = r10.ly;
        r9.a(r11, r12, r10);
    L_0x0128:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.b.a(android.content.Intent, android.content.Context, java.util.Map):void");
    }

    /* Access modifiers changed, original: protected */
    public void c(Intent intent) {
        Uri data;
        if (intent != null) {
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                data = intent.getData();
                if (data != null && intent.getData() != kL) {
                    kL = intent.getData();
                    return;
                }
            }
        }
        data = null;
        if (data != null) {
        }
    }
}
