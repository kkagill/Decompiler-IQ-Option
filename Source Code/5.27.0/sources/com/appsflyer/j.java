package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import com.appsflyer.AFLogger.LogLevel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j implements w {
    static final String kZ;
    static final String lc;
    private static String ld;
    private static String le;
    private static final List<String> lh = Arrays.asList(new String[]{"is_cache"});
    private static final List<String> li = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    private static h lk = null;
    static i ll = null;
    private static o lm = null;
    private static j lu = new j();
    /* renamed from: ʽ */
    private static String f28;
    /* renamed from: ॱॱ */
    private static final String f29;
    private boolean lA = false;
    private boolean lB = false;
    private String lC;
    private boolean lD;
    private boolean lE;
    private q lF = new q();
    private boolean lG = false;
    private boolean lH = false;
    private long lf = -1;
    private long lg = -1;
    private long lj = TimeUnit.SECONDS.toMillis(5);
    private x ln = null;
    private Map<String, String> lo;
    private boolean lp = false;
    private long lq;
    private ScheduledExecutorService lr = null;
    private long ls;
    private long lt;
    private b lv;
    String lw;
    String lx;
    protected Uri ly = null;
    private long lz;

    class a implements Runnable {
        private final String kZ;
        private final Intent lM;
        private WeakReference<Context> lN;
        private String lO;
        private boolean lP;
        private boolean lQ;
        private String lc;
        private String ld;
        /* renamed from: ॱॱ */
        private String f9;

        /* synthetic */ a(j jVar, WeakReference weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5, byte b) {
            this(weakReference, str, str2, str3, str4, z, intent, str5);
        }

        private a(WeakReference<Context> weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5) {
            this.lN = weakReference;
            this.lO = str;
            this.lc = str2;
            this.ld = str3;
            this.f9 = str4;
            this.lP = true;
            this.lQ = z;
            this.lM = intent;
            this.kZ = str5;
        }

        public final void run() {
            j.a(j.this, (Context) this.lN.get(), this.lO, this.lc, this.ld, this.f9, this.lP, this.lQ, this.lM, this.kZ);
        }
    }

    class b implements Runnable {
        private WeakReference<Context> lS;
        private Map<String, Object> lT;
        private boolean lU;
        private int lV;
        private String lw;

        /* synthetic */ b(j jVar, String str, Map map, Context context, boolean z, int i, byte b) {
            this(str, map, context, z, i);
        }

        private b(String str, Map<String, Object> map, Context context, boolean z, int i) {
            this.lS = null;
            this.lw = str;
            this.lT = map;
            this.lS = new WeakReference(context);
            this.lU = z;
            this.lV = i;
        }

        public final void run() {
            if (!j.this.ds()) {
                String str = null;
                if (this.lU && this.lV <= 2 && j.a(j.this)) {
                    this.lT.put("rfr", j.this.lo);
                }
                Map map = this.lT;
                map.putAll(new e(map, (Context) this.lS.get()));
                try {
                    String str2 = (String) this.lT.get("appsflyerKey");
                    synchronized (this.lT) {
                        str = d.b(this.lT).toString();
                    }
                    j.a(j.this, this.lw, str, str2, this.lS, null, this.lU);
                } catch (IOException e) {
                    AFLogger.c("Exception while sending request to server. ", e);
                    if (!(str == null || this.lS == null || this.lw.contains("&isCachedRequest=true&timeincache="))) {
                        com.appsflyer.a.a.dH().a(new com.appsflyer.a.b(this.lw, str, "4.9.0"), (Context) this.lS.get());
                        AFLogger.c(e.getMessage(), e);
                    }
                } catch (Throwable th) {
                    AFLogger.c(th.getMessage(), th);
                }
            }
        }
    }

    class c implements Runnable {
        private WeakReference<Context> lX = null;

        public c(Context context) {
            this.lX = new WeakReference(context);
        }

        public final void run() {
            if (!j.this.lp) {
                j.this.lq = System.currentTimeMillis();
                if (this.lX != null) {
                    j.this.lp = true;
                    try {
                        String U = m.dw().getString("AppsFlyerKey");
                        synchronized (this.lX) {
                            for (com.appsflyer.a.b bVar : com.appsflyer.a.a.dH().A((Context) this.lX.get())) {
                                StringBuilder stringBuilder = new StringBuilder("resending request: ");
                                stringBuilder.append(bVar.dJ());
                                AFLogger.J(stringBuilder.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(bVar.dK(), 10);
                                    j jVar = j.this;
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(bVar.dJ());
                                    stringBuilder2.append("&isCachedRequest=true&timeincache=");
                                    stringBuilder2.append(Long.toString((currentTimeMillis - parseLong) / 1000));
                                    j.a(jVar, stringBuilder2.toString(), bVar.dI(), U, this.lX, bVar.dK(), false);
                                } catch (Exception e) {
                                    AFLogger.c("Failed to resend cached request", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        try {
                            AFLogger.c("failed to check cache. ", e2);
                        } catch (Throwable th) {
                            j.this.lp = false;
                        }
                    }
                    j.this.lp = false;
                    j.this.lr.shutdown();
                    j.this.lr = null;
                }
            }
        }
    }

    abstract class d implements Runnable {
        private String kZ;
        WeakReference<Context> lJ = null;
        private ScheduledExecutorService lY;
        private AtomicInteger lZ = new AtomicInteger(0);

        public abstract String dl();

        public abstract void f(String str, int i);

        public abstract void h(Map<String, String> map);

        d(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.lJ = new WeakReference(context);
            this.kZ = str;
            if (scheduledExecutorService == null) {
                this.lY = c.dd().dg();
            } else {
                this.lY = scheduledExecutorService;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:62:0x01d8 A:{Catch:{ Throwable -> 0x0211, all -> 0x020f }} */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00f6 A:{Catch:{ Throwable -> 0x0211, all -> 0x020f }} */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x021e A:{Catch:{ all -> 0x0214 }} */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0233  */
        /* JADX WARNING: Missing block: B:89:0x0247, code skipped:
            return;
     */
        public void run() {
            /*
            r13 = this;
            r0 = "af_siteid";
            r1 = r13.kZ;
            if (r1 == 0) goto L_0x0247;
        L_0x0006:
            r1 = r1.length();
            if (r1 != 0) goto L_0x000e;
        L_0x000c:
            goto L_0x0247;
        L_0x000e:
            r1 = com.appsflyer.j.this;
            r1 = r1.ds();
            if (r1 == 0) goto L_0x0017;
        L_0x0016:
            return;
        L_0x0017:
            r1 = r13.lZ;
            r1.incrementAndGet();
            r1 = 0;
            r2 = 0;
            r3 = r13.lJ;	 Catch:{ Throwable -> 0x0217 }
            r3 = r3.get();	 Catch:{ Throwable -> 0x0217 }
            r3 = (android.content.Context) r3;	 Catch:{ Throwable -> 0x0217 }
            if (r3 != 0) goto L_0x002e;
        L_0x0028:
            r0 = r13.lZ;
            r0.decrementAndGet();
            return;
        L_0x002e:
            r4 = java.lang.System.currentTimeMillis();	 Catch:{ Throwable -> 0x0217 }
            r6 = new java.lang.ref.WeakReference;	 Catch:{ Throwable -> 0x0217 }
            r6.<init>(r3);	 Catch:{ Throwable -> 0x0217 }
            r6 = com.appsflyer.j.b(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = com.appsflyer.j.m(r3, r6);	 Catch:{ Throwable -> 0x0217 }
            r7 = "";
            r8 = 1;
            if (r6 == 0) goto L_0x006a;
        L_0x0044:
            r9 = com.appsflyer.j.li;	 Catch:{ Throwable -> 0x0217 }
            r10 = r6.toLowerCase();	 Catch:{ Throwable -> 0x0217 }
            r9 = r9.contains(r10);	 Catch:{ Throwable -> 0x0217 }
            if (r9 != 0) goto L_0x005d;
        L_0x0052:
            r9 = "-";
            r6 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = r9.concat(r6);	 Catch:{ Throwable -> 0x0217 }
            goto L_0x006b;
        L_0x005d:
            r9 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.";
            r10 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x0217 }
            r10[r2] = r6;	 Catch:{ Throwable -> 0x0217 }
            r6 = java.lang.String.format(r9, r10);	 Catch:{ Throwable -> 0x0217 }
            com.appsflyer.AFLogger.K(r6);	 Catch:{ Throwable -> 0x0217 }
        L_0x006a:
            r6 = r7;
        L_0x006b:
            r9 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0217 }
            r9.<init>();	 Catch:{ Throwable -> 0x0217 }
            r10 = r13.dl();	 Catch:{ Throwable -> 0x0217 }
            r9.append(r10);	 Catch:{ Throwable -> 0x0217 }
            r10 = r3.getPackageName();	 Catch:{ Throwable -> 0x0217 }
            r9.append(r10);	 Catch:{ Throwable -> 0x0217 }
            r9.append(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = "?devkey=";
            r9.append(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = r13.kZ;	 Catch:{ Throwable -> 0x0217 }
            r9.append(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = "&device_id=";
            r9.append(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = new java.lang.ref.WeakReference;	 Catch:{ Throwable -> 0x0217 }
            r6.<init>(r3);	 Catch:{ Throwable -> 0x0217 }
            r6 = com.appsflyer.af.e(r6);	 Catch:{ Throwable -> 0x0217 }
            r9.append(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = com.appsflyer.ag.dT();	 Catch:{ Throwable -> 0x0217 }
            r10 = r9.toString();	 Catch:{ Throwable -> 0x0217 }
            r6.l(r10, r7);	 Catch:{ Throwable -> 0x0217 }
            r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0217 }
            r7 = "Calling server for attribution url: ";
            r6.<init>(r7);	 Catch:{ Throwable -> 0x0217 }
            r7 = r9.toString();	 Catch:{ Throwable -> 0x0217 }
            r6.append(r7);	 Catch:{ Throwable -> 0x0217 }
            r6 = r6.toString();	 Catch:{ Throwable -> 0x0217 }
            com.appsflyer.aa.a.ae(r6);	 Catch:{ Throwable -> 0x0217 }
            r6 = new java.net.URL;	 Catch:{ Throwable -> 0x0217 }
            r7 = r9.toString();	 Catch:{ Throwable -> 0x0217 }
            r6.<init>(r7);	 Catch:{ Throwable -> 0x0217 }
            r6 = r6.openConnection();	 Catch:{ Throwable -> 0x0217 }
            r6 = (java.net.HttpURLConnection) r6;	 Catch:{ Throwable -> 0x0217 }
            r1 = "GET";
            r6.setRequestMethod(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
            r6.setConnectTimeout(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = "Connection";
            r7 = "close";
            r6.setRequestProperty(r1, r7);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r6.connect();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = r6.getResponseCode();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r7 = com.appsflyer.j.c(r6);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r10 = com.appsflyer.ag.dT();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r11 = r9.toString();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r10.a(r11, r1, r7);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r10 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
            if (r1 != r10) goto L_0x01d8;
        L_0x00f6:
            r9 = java.lang.System.currentTimeMillis();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = "appsflyerGetConversionDataTiming";
            r9 = r9 - r4;
            com.appsflyer.j.a(r3, r1, r9);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = "Attribution data: ";
            r4 = java.lang.String.valueOf(r7);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = r1.concat(r4);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            com.appsflyer.aa.a.ae(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = r7.length();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r1 <= 0) goto L_0x0204;
        L_0x0113:
            if (r3 == 0) goto L_0x0204;
        L_0x0115:
            r1 = com.appsflyer.j.Q(r7);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r4 = "iscache";
            r4 = r1.get(r4);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r4 = (java.lang.String) r4;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r4 == 0) goto L_0x0136;
        L_0x0123:
            r5 = java.lang.Boolean.toString(r2);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5 = r5.equals(r4);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r5 == 0) goto L_0x0136;
        L_0x012d:
            r5 = "appsflyerConversionDataCacheExpiration";
            r9 = java.lang.System.currentTimeMillis();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            com.appsflyer.j.a(r3, r5, r9);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
        L_0x0136:
            r5 = r1.containsKey(r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r9 = "[Invite] Detected App-Invite via channel: ";
            r10 = "af_channel";
            if (r5 == 0) goto L_0x016d;
        L_0x0140:
            r5 = r1.containsKey(r10);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r5 == 0) goto L_0x015c;
        L_0x0146:
            r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5.<init>(r9);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r11 = r1.get(r10);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r11 = (java.lang.String) r11;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5.append(r11);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5 = r5.toString();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            com.appsflyer.AFLogger.I(r5);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            goto L_0x016d;
        L_0x015c:
            r5 = "[CrossPromotion] App was installed via %s's Cross Promotion";
            r11 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r12 = r1.get(r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r11[r2] = r12;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5 = java.lang.String.format(r5, r11);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            com.appsflyer.AFLogger.I(r5);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
        L_0x016d:
            r0 = r1.containsKey(r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r0 == 0) goto L_0x0188;
        L_0x0173:
            r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0.<init>(r9);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5 = r1.get(r10);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5 = (java.lang.String) r5;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0.append(r5);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = r0.toString();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            com.appsflyer.AFLogger.I(r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
        L_0x0188:
            r0 = "is_first_launch";
            r5 = java.lang.Boolean.toString(r2);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1.put(r0, r5);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0.<init>(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = r0.toString();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5 = "attributionId";
            if (r0 == 0) goto L_0x01a2;
        L_0x019e:
            com.appsflyer.j.a(r3, r5, r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            goto L_0x01a5;
        L_0x01a2:
            com.appsflyer.j.a(r3, r5, r7);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
        L_0x01a5:
            r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r5 = "iscache=";
            r0.<init>(r5);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0.append(r4);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r4 = " caching conversion data";
            r0.append(r4);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = r0.toString();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            com.appsflyer.AFLogger.I(r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = com.appsflyer.j.lk;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r0 == 0) goto L_0x0204;
        L_0x01c1:
            r0 = r13.lZ;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = r0.intValue();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r0 > r8) goto L_0x0204;
        L_0x01c9:
            r1 = com.appsflyer.j.k(r3);	 Catch:{ k -> 0x01ce }
            goto L_0x01d4;
        L_0x01ce:
            r0 = move-exception;
            r3 = "Exception while trying to fetch attribution data. ";
            com.appsflyer.AFLogger.c(r3, r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
        L_0x01d4:
            r13.h(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            goto L_0x0204;
        L_0x01d8:
            r0 = com.appsflyer.j.lk;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            if (r0 == 0) goto L_0x01eb;
        L_0x01de:
            r0 = "Error connection to server: ";
            r3 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = r0.concat(r3);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r13.f(r0, r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
        L_0x01eb:
            r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r3 = "AttributionIdFetcher response code: ";
            r0.<init>(r3);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0.append(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r1 = "  url: ";
            r0.append(r1);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0.append(r9);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            r0 = r0.toString();	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
            com.appsflyer.aa.a.ae(r0);	 Catch:{ Throwable -> 0x0211, all -> 0x020f }
        L_0x0204:
            r0 = r13.lZ;
            r0.decrementAndGet();
            if (r6 == 0) goto L_0x0236;
        L_0x020b:
            r6.disconnect();
            goto L_0x0236;
        L_0x020f:
            r0 = move-exception;
            goto L_0x023c;
        L_0x0211:
            r0 = move-exception;
            r1 = r6;
            goto L_0x0218;
        L_0x0214:
            r0 = move-exception;
            r6 = r1;
            goto L_0x023c;
        L_0x0217:
            r0 = move-exception;
        L_0x0218:
            r3 = com.appsflyer.j.lk;	 Catch:{ all -> 0x0214 }
            if (r3 == 0) goto L_0x0225;
        L_0x021e:
            r3 = r0.getMessage();	 Catch:{ all -> 0x0214 }
            r13.f(r3, r2);	 Catch:{ all -> 0x0214 }
        L_0x0225:
            r2 = r0.getMessage();	 Catch:{ all -> 0x0214 }
            com.appsflyer.AFLogger.c(r2, r0);	 Catch:{ all -> 0x0214 }
            r0 = r13.lZ;
            r0.decrementAndGet();
            if (r1 == 0) goto L_0x0236;
        L_0x0233:
            r1.disconnect();
        L_0x0236:
            r0 = r13.lY;
            r0.shutdown();
            return;
        L_0x023c:
            r1 = r13.lZ;
            r1.decrementAndGet();
            if (r6 == 0) goto L_0x0246;
        L_0x0243:
            r6.disconnect();
        L_0x0246:
            throw r0;
        L_0x0247:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.j$d.run():void");
        }
    }

    class e extends d {
        public e(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }

        public final String dl() {
            return t.Y("https://%sapi.%s/install_data/v3/");
        }

        /* Access modifiers changed, original: protected|final */
        public final void h(Map<String, String> map) {
            map.put("is_first_launch", Boolean.toString(true));
            j.lk.d(map);
            j.b((Context) this.lJ.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        /* Access modifiers changed, original: protected|final */
        public final void f(String str, int i) {
            j.lk.L(str);
            if (i >= 400 && i < 500) {
                String str2 = "appsflyerConversionDataRequestRetries";
                j.b((Context) this.lJ.get(), str2, j.p((Context) this.lJ.get()).getInt(str2, 0) + 1);
            }
        }
    }

    static /* synthetic */ void g(Map map) {
        h hVar = lk;
        if (hVar != null) {
            try {
                hVar.e(map);
            } catch (Throwable th) {
                AFLogger.c(th.getLocalizedMessage(), th);
            }
        }
    }

    static {
        String str = "4.9.0";
        lc = str.substring(0, str.indexOf("."));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lc);
        stringBuilder.append("/androidevent?buildnumber=4.9.0&app_id=");
        f29 = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%sattr.%s/api/v");
        stringBuilder.append(f29);
        f28 = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%st.%s/api/v");
        stringBuilder.append(f29);
        ld = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%sevents.%s/api/v");
        stringBuilder.append(f29);
        le = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://%sregister.%s/api/v");
        stringBuilder.append(f29);
        kZ = stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    /* renamed from: do */
    public final void m4do() {
        this.ls = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: final */
    public final void dp() {
        this.lt = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: final */
    public final void b(Context context, Intent intent) {
        String str = "shouldMonitor";
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null) {
            AFLogger.J("Turning on monitoring.");
            m.dw().c(str, stringExtra.equals("true"));
            a(context, null, "START_TRACKING", context.getPackageName());
            return;
        }
        AFLogger.J("****** onReceive called *******");
        m.dw().dx();
        str = "referrer";
        String stringExtra2 = intent.getStringExtra(str);
        AFLogger.J("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            Editor edit;
            String str2 = "appsflyer-data";
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                edit = context.getApplicationContext().getSharedPreferences(str2, 0).edit();
                edit.clear();
                if (VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
                m.dw().v(false);
                AFLogger.J("Test mode started..");
                this.lz = System.currentTimeMillis();
            }
            edit = context.getApplicationContext().getSharedPreferences(str2, 0).edit();
            edit.putString(str, stringExtra2);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
            m.dw().setReferrer(stringExtra2);
            if (m.dw().dy()) {
                AFLogger.J("onReceive: isLaunchCalled");
                if (stringExtra2 != null && stringExtra2.length() > 5) {
                    a(c.dd().dg(), new a(this, new WeakReference(context.getApplicationContext()), null, null, null, stringExtra2, true, intent, null, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    private static void b(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator keys = jSONObject.keys();
        while (true) {
            int i = 0;
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get((String) keys.next()));
                while (i < jSONArray.length()) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                    i++;
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        keys = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys.hasNext() && str == null) {
                String str2 = (String) keys.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(str2));
                    String str3 = str;
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        try {
                            if (!(jSONArray2.getLong(i2) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i2) == ((Long) arrayList.get(1)).longValue())) {
                                if (jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                    i2++;
                                    str3 = str2;
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    str = str3;
                } catch (JSONException unused3) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    static void h(Context context, String str) {
        String str2 = "extraReferrers";
        String str3 = "appsflyer-data";
        AFLogger.I("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject;
            JSONArray jSONArray;
            long currentTimeMillis = System.currentTimeMillis();
            String string = context.getApplicationContext().getSharedPreferences(str3, 0).getString(str2, null);
            if (string == null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                jSONObject = jSONObject2;
                jSONArray = jSONArray2;
            } else {
                jSONObject = new JSONObject(string);
                if (jSONObject.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                b(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject3 = jSONObject.toString();
            Editor edit = context.getApplicationContext().getSharedPreferences(str3, 0).edit();
            edit.putString(str2, jSONObject3);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Couldn't save referrer - ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            AFLogger.c(stringBuilder.toString(), th);
        }
    }

    private j() {
        g.init();
    }

    public static j dq() {
        return lu;
    }

    private void a(Application application) {
        m.dw().v(application.getApplicationContext());
        if (VERSION.SDK_INT < 14) {
            AFLogger.J("SDK<14 call trackEvent manually");
            AFLogger.J("onBecameForeground");
            dq().ls = System.currentTimeMillis();
            dq().b((Context) application, null, null);
            AFLogger.dn();
        } else if (VERSION.SDK_INT >= 14 && this.lv == null) {
            ac.dQ();
            this.lv = new b() {
                public final void c(Activity activity) {
                    if (2 > j.a(j.p(activity))) {
                        ab D = ab.D(activity);
                        D.mH.post(D.mP);
                        D.mH.post(D.mO);
                    }
                    AFLogger.J("onBecameForeground");
                    j.dq().m4do();
                    j.dq().b((Context) activity, null, null);
                    AFLogger.dn();
                }

                public final void d(WeakReference<Context> weakReference) {
                    com.appsflyer.b.AnonymousClass1.h((Context) weakReference.get());
                    ab D = ab.D((Context) weakReference.get());
                    D.mH.post(D.mP);
                }
            };
            ac.dR().a(application, this.lv);
        }
    }

    public void N(String str) {
        ag.dT().a("enableUninstallTracking", str);
        m.dw().set("gcmProjectNumber", str);
    }

    public void i(Context context, String str) {
        if (str != null) {
            ai.a(context, new a(str));
        }
    }

    public void u(boolean z) {
        ag.dT().a("setDebugLog", String.valueOf(z));
        m.dw().c("shouldLog", z);
        m.dw().set("logLevel", (z ? LogLevel.DEBUG : LogLevel.NONE).getLevel());
    }

    public void O(String str) {
        ag.dT().a("setCustomerUserId", str);
        AFLogger.J("setCustomerUserId = ".concat(String.valueOf(str)));
        m.dw().set("AppUserId", str);
    }

    public void b(Activity activity) {
        String str = "sendDeepLinkData";
        if (activity != null && activity.getIntent() != null) {
            ag dT = ag.dT();
            String[] strArr = new String[2];
            strArr[0] = activity.getLocalClassName();
            StringBuilder stringBuilder = new StringBuilder("activity_intent_");
            stringBuilder.append(activity.getIntent().toString());
            strArr[1] = stringBuilder.toString();
            dT.a(str, strArr);
        } else if (activity != null) {
            ag.dT().a(str, activity.getLocalClassName(), "activity_intent_null");
        } else {
            ag.dT().a(str, "activity_null");
        }
        try {
            a(activity.getApplication());
            StringBuilder stringBuilder2 = new StringBuilder("getDeepLinkData with activity ");
            stringBuilder2.append(activity.getIntent().getDataString());
            AFLogger.J(stringBuilder2.toString());
        } catch (Exception e) {
            AFLogger.J("getDeepLinkData Exception: ".concat(String.valueOf(e)));
        }
    }

    public j a(String str, h hVar) {
        ag dT = ag.dT();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = hVar == null ? "null" : "conversionDataListener";
        dT.a("init", strArr);
        AFLogger.H(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"4.9.0", "184"}));
        this.lE = true;
        m.dw().set("AppsFlyerKey", str);
        a.H(str);
        lk = hVar;
        return this;
    }

    public j a(String str, h hVar, Context context) {
        if (context == null) {
            AFLogger.K("init :: context is null, Google Install Referrer will be not initialized!");
        } else if (j(context)) {
            if (this.ln == null) {
                this.ln = new x();
                this.ln.a(context, this);
            } else {
                AFLogger.K("AFInstallReferrer instance already created");
            }
        }
        return a(str, hVar);
    }

    private static boolean j(@NonNull Context context) {
        if (a(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            AFLogger.G("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.a.a.a");
            if (com.appsflyer.c.1.AnonymousClass1.g(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.I("Install referrer is allowed");
                return true;
            }
            AFLogger.I("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.G("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.c("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    public void a(Application application, String str) {
        a(application, str, null);
    }

    public void a(Application application, String str, o oVar) {
        ag.dT().a("startTracking", str);
        AFLogger.J(String.format("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{"4.9.0", "184"}));
        AFLogger.J("Build Number: 184");
        m.dw().v(application.getApplicationContext());
        String str2 = "AppsFlyerKey";
        if (!TextUtils.isEmpty(str)) {
            m.dw().set(str2, str);
            a.H(str);
        } else if (TextUtils.isEmpty(m.dw().getString(str2))) {
            AFLogger.K("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
            return;
        }
        if (oVar != null) {
            lm = oVar;
        }
        a(application);
    }

    public void P(String str) {
        ag.dT().a("setCurrencyCode", str);
        m.dw().set("currencyCode", str);
    }

    /* Access modifiers changed, original: final */
    public final void a(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.J("app went to background");
            SharedPreferences sharedPreferences = ((Context) weakReference.get()).getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            m.dw().b(sharedPreferences);
            long j = this.lt - this.ls;
            HashMap hashMap = new HashMap();
            String string = m.dw().getString("AppsFlyerKey");
            if (string == null) {
                AFLogger.K("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            Object string2 = m.dw().getString("KSAppsFlyerId");
            String str = "deviceTrackingDisabled";
            if (m.dw().getBoolean(str, false)) {
                hashMap.put(str, "true");
            }
            l b = n.b(((Context) weakReference.get()).getContentResolver());
            if (b != null) {
                hashMap.put("amazon_aid", b.dG());
                hashMap.put("amazon_aid_limit", String.valueOf(b.dL()));
            }
            str = "advertiserId";
            String string3 = m.dw().getString(str);
            if (string3 != null) {
                hashMap.put(str, string3);
            }
            hashMap.put("app_id", ((Context) weakReference.get()).getPackageName());
            hashMap.put("devkey", string);
            hashMap.put("uid", af.e(weakReference));
            hashMap.put("time_in_app", String.valueOf(j / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(a(sharedPreferences, "appsFlyerCount", false)));
            hashMap.put("channel", b((WeakReference) weakReference));
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put("originalAppsflyerId", string2);
            if (this.lG) {
                try {
                    ad adVar = new ad(null, ds());
                    adVar.na = hashMap;
                    String str2 = "https://%sstats.%s/stats";
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        AFLogger.I("Main thread detected. Running callStats task in a new thread.");
                        adVar.execute(new String[]{t.Y(str2)});
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Running callStats task (on current thread: ");
                    stringBuilder.append(Thread.currentThread().toString());
                    stringBuilder.append(" )");
                    AFLogger.I(stringBuilder.toString());
                    adVar.onPreExecute();
                    adVar.onPostExecute(adVar.doInBackground(t.Y(str2)));
                    return;
                } catch (Throwable th) {
                    AFLogger.c("Could not send callStats request", th);
                    return;
                }
            }
            AFLogger.I("Stats call is disabled, ignore ...");
        }
    }

    public void a(Context context, String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject(map == null ? new HashMap() : map);
        ag.dT().a("trackEvent", str, jSONObject.toString());
        b(context, str, (Map) map);
    }

    /* Access modifiers changed, original: final */
    public final void b(Context context, String str, Map<String, Object> map) {
        String obj;
        Intent intent;
        String str2 = "";
        Object obj2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Intent intent2 = activity.getIntent();
            b.dc().kM = System.identityHashCode(activity);
            try {
                obj2 = ActivityCompat.getReferrer(activity);
            } catch (Throwable th) {
                AFLogger.c(th.getLocalizedMessage(), th);
            }
            obj = obj2 != null ? obj2.toString() : str2;
            intent = intent2;
        } else {
            obj = str2;
            intent = null;
        }
        if (m.dw().getString("AppsFlyerKey") == null) {
            AFLogger.K("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        Map map2;
        if (map2 == null) {
            map2 = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(map2);
        String u = m.dw().u(context);
        a(context, null, str, jSONObject.toString(), u == null ? str2 : u, intent, obj);
    }

    private static void a(Context context, String str, String str2, String str3) {
        if (m.dw().getBoolean("shouldMonitor", false)) {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra("message", str2);
            intent.putExtra(ConditionalUserProperty.VALUE, str3);
            intent.putExtra("packageName", "true");
            intent.putExtra("pid", new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", str);
            intent.putExtra("sdk", "4.9.0");
            context.sendBroadcast(intent);
        }
    }

    /* Access modifiers changed, original: final */
    public final void j(Context context, String str) {
        String str2 = "AppUserId";
        Object obj = (m.dw().getBoolean("waitForCustomerId", false) && m.dw().getString(str2) == null) ? 1 : null;
        if (obj != null) {
            AFLogger.a("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        Map hashMap = new HashMap();
        String string = m.dw().getString("AppsFlyerKey");
        if (string == null) {
            AFLogger.K("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("installDate", simpleDateFormat.format(new Date(j)));
        } catch (Throwable th) {
            AFLogger.c("Exception while collecting application version info.", th);
        }
        a(context, hashMap);
        str2 = m.dw().getString(str2);
        if (str2 != null) {
            hashMap.put("appUserId", str2);
        }
        try {
            hashMap.put("model", Build.MODEL);
            hashMap.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.c("Exception while collecting device brand and model.", th2);
        }
        String str3 = "deviceTrackingDisabled";
        if (m.dw().getBoolean(str3, false)) {
            hashMap.put(str3, "true");
        }
        l b = n.b(context.getContentResolver());
        if (b != null) {
            hashMap.put("amazon_aid", b.dG());
            hashMap.put("amazon_aid_limit", String.valueOf(b.dL()));
        }
        str3 = "advertiserId";
        str2 = m.dw().getString(str3);
        if (str2 != null) {
            hashMap.put(str3, str2);
        }
        hashMap.put("devkey", string);
        hashMap.put("uid", af.e(new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(a(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)));
        hashMap.put("sdk", Integer.toString(VERSION.SDK_INT));
        str = b(new WeakReference(context));
        if (str != null) {
            hashMap.put("channel", str);
        }
        try {
            ad adVar = new ad(context, ds());
            adVar.na = hashMap;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(t.Y(kZ));
            stringBuilder.append(packageName);
            adVar.execute(new String[]{stringBuilder.toString()});
        } catch (Throwable th3) {
            AFLogger.c(th3.getMessage(), th3);
        }
    }

    private static void k(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        if (VERSION.SDK_INT >= 26) {
            String str2 = "com.appsflyer.referrerSender";
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).toString().contains(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName(str2, "com.appsflyer.referrerSender.Receiver"));
                context.sendBroadcast(intent2);
            }
            return;
        }
        context.sendBroadcast(intent);
    }

    private static Map<String, String> k(Context context) {
        String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return Q(string);
        }
        throw new k();
    }

    private static Map<String, String> l(Context context, String str) {
        String str2;
        String str3 = "install_time";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split("&");
        int length = split.length;
        int i = 0;
        Object obj = null;
        while (true) {
            str2 = "media_source";
            if (i < length) {
                Object substring;
                String str4 = split[i];
                int indexOf = str4.indexOf("=");
                Object substring2 = indexOf > 0 ? str4.substring(0, indexOf) : str4;
                if (!linkedHashMap.containsKey(substring2)) {
                    if (substring2.equals("c")) {
                        str2 = "campaign";
                    } else if (!substring2.equals("pid")) {
                        if (substring2.equals("af_prt")) {
                            obj = 1;
                            str2 = "agency";
                        }
                        linkedHashMap.put(substring2, "");
                    }
                    substring2 = str2;
                    linkedHashMap.put(substring2, "");
                }
                if (indexOf > 0) {
                    indexOf++;
                    if (str4.length() > indexOf) {
                        substring = str4.substring(indexOf);
                        linkedHashMap.put(substring2, substring);
                        i++;
                    }
                }
                substring = null;
                linkedHashMap.put(substring2, substring);
                i++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    AFLogger.c("Could not fetch install time. ", e);
                }
            }
        }
        if (!linkedHashMap.containsKey(str3)) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            linkedHashMap.put(str3, simpleDateFormat.format(new Date(j)));
        }
        String str5 = "af_status";
        if (!linkedHashMap.containsKey(str5)) {
            linkedHashMap.put(str5, "Non-organic");
        }
        if (obj != null) {
            linkedHashMap.remove(str2);
        }
        return linkedHashMap;
    }

    private static Map<String, String> Q(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (!lh.contains(str2)) {
                    String string = jSONObject.getString(str2);
                    if (!(TextUtils.isEmpty(string) || "null".equals(string))) {
                        hashMap.put(str2, string);
                    }
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.c(e.getMessage(), e);
            return null;
        }
    }

    private void a(Context context, String str, String str2, String str3, String str4, Intent intent, String str5) {
        Context applicationContext = context.getApplicationContext();
        boolean z = false;
        Object obj = str2 == null ? 1 : null;
        if (m.dw().getBoolean("waitForCustomerId", false) && m.dw().getString("AppUserId") == null) {
            z = true;
        }
        if (z) {
            AFLogger.a("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (obj != null) {
            if (!m.dw().getBoolean("launchProtectEnabled", true)) {
                AFLogger.J("Allowing multiple launches within a 5 second time window.");
            } else if (dr()) {
                return;
            }
            this.lf = System.currentTimeMillis();
        }
        a(c.dd().dg(), new a(this, new WeakReference(applicationContext), str, str2, str3, str4, false, intent, str5, (byte) 0), 150, TimeUnit.MILLISECONDS);
    }

    private boolean dr() {
        if (this.lf > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.lf;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.lf;
            String str = "UTC";
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.lg;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.lj && !ds()) {
                AFLogger.J(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.lj)}));
                return true;
            } else if (!ds()) {
                AFLogger.J(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!ds()) {
            AFLogger.J("Sending first launch for this session!");
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0442 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0441 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0432 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0441 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0442 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x041e A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0426 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0432 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0442 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0441 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x040a A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0412 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x041e A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0426 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0432 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0441 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0442 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03ea A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03fe A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x040a A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0412 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x041e A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0426 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0432 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0442 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0441 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x065e A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0653 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06c5 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0653 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x065e A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0677 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06c5 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04a6 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04bf A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04b8 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04d7 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04ef A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0506 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0534 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x058b A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0553 A:{SYNTHETIC, Splitter:B:230:0x0553} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05a8 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x059f A:{SYNTHETIC, Splitter:B:252:0x059f} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0301 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0314 A:{Catch:{ Exception -> 0x031a }} */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0347 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0378 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0370 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0397 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b3 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x045d A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x046c A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x047b A:{SYNTHETIC, Splitter:B:194:0x047b} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x065e A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0653 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0677 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06c5 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0653 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x065e A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0677 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06c5 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0301 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0314 A:{Catch:{ Exception -> 0x031a }} */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0347 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0370 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0378 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0397 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b3 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x045d A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x046c A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x047b A:{SYNTHETIC, Splitter:B:194:0x047b} */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0491 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0585 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x059f A:{SYNTHETIC, Splitter:B:252:0x059f} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05a8 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0301 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0314 A:{Catch:{ Exception -> 0x031a }} */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0347 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0378 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0370 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0397 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b3 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x045d A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x046c A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x047b A:{SYNTHETIC, Splitter:B:194:0x047b} */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0491 A:{Catch:{ Exception -> 0x00b4, Throwable -> 0x0bf7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x063d A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x062d A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x065e A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0653 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0677 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06c5 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0622 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0612 A:{SYNTHETIC, Splitter:B:276:0x0612} */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0653 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x065e A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0677 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06c5 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06cb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06d6 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0585 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05a8 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x059f A:{SYNTHETIC, Splitter:B:252:0x059f} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0585 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x059f A:{SYNTHETIC, Splitter:B:252:0x059f} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05a8 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06e6 A:{Catch:{ Exception -> 0x06ed }} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07a3 A:{Catch:{ Throwable -> 0x0843 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0808 A:{Catch:{ Throwable -> 0x0841 }} */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0856 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0866 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0877 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08ad A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08dd A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0909 A:{SKIP, Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0918 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0944 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x096a A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cc A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09ca A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09f4 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a05 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a06 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a41 A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0baf A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bcb A:{Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c, Throwable -> 0x0bf5 }} */
    public final java.util.Map<java.lang.String, java.lang.Object> a(android.content.Context r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, android.content.SharedPreferences r31, boolean r32, @androidx.annotation.Nullable android.content.Intent r33, @androidx.annotation.Nullable java.lang.String r34) {
        /*
        r24 = this;
        r1 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r5 = r28;
        r6 = r31;
        r7 = r32;
        r8 = "appid";
        r9 = "INSTALL_STORE";
        r10 = "prev_event_name";
        r11 = "preInstallName";
        r12 = new java.util.HashMap;
        r12.<init>();
        com.appsflyer.n.b(r2, r12);
        r13 = new java.util.Date;
        r13.<init>();
        r13 = r13.getTime();
        r15 = java.lang.Long.toString(r13);
        r1 = "af_timestamp";
        r12.put(r1, r15);
        r13 = com.appsflyer.a.b(r2, r13);
        if (r13 == 0) goto L_0x003b;
    L_0x0036:
        r14 = "cksm_v1";
        r12.put(r14, r13);
    L_0x003b:
        r13 = r24.ds();	 Catch:{ Throwable -> 0x0bf7 }
        if (r13 != 0) goto L_0x0059;
    L_0x0041:
        r13 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf7 }
        r14 = "******* sendTrackingWithEvent: ";
        r13.<init>(r14);	 Catch:{ Throwable -> 0x0bf7 }
        if (r7 == 0) goto L_0x004d;
    L_0x004a:
        r14 = "Launch";
        goto L_0x004e;
    L_0x004d:
        r14 = r4;
    L_0x004e:
        r13.append(r14);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = r13.toString();	 Catch:{ Throwable -> 0x0bf7 }
        com.appsflyer.AFLogger.J(r13);	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x005e;
    L_0x0059:
        r13 = "SDK tracking has been stopped";
        com.appsflyer.AFLogger.J(r13);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x005e:
        r13 = "AppsFlyer_4.9.0";
        r14 = "EVENT_CREATED_WITH_NAME";
        if (r7 == 0) goto L_0x0067;
    L_0x0064:
        r15 = "Launch";
        goto L_0x0068;
    L_0x0067:
        r15 = r4;
    L_0x0068:
        a(r2, r13, r14, r15);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = com.appsflyer.a.a.dH();	 Catch:{ Throwable -> 0x0bf7 }
        r13.init(r2);	 Catch:{ Throwable -> 0x0bf7 }
        r14 = r25.getPackageManager();	 Catch:{ Exception -> 0x00b4 }
        r15 = r25.getPackageName();	 Catch:{ Exception -> 0x00b4 }
        r13 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r13 = r14.getPackageInfo(r15, r13);	 Catch:{ Exception -> 0x00b4 }
        r13 = r13.requestedPermissions;	 Catch:{ Exception -> 0x00b4 }
        r13 = java.util.Arrays.asList(r13);	 Catch:{ Exception -> 0x00b4 }
        r14 = "android.permission.INTERNET";
        r14 = r13.contains(r14);	 Catch:{ Exception -> 0x00b4 }
        if (r14 != 0) goto L_0x0099;
    L_0x008e:
        r14 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml";
        com.appsflyer.AFLogger.K(r14);	 Catch:{ Exception -> 0x00b4 }
        r14 = "PERMISSION_INTERNET_MISSING";
        r15 = 0;
        a(r2, r15, r14, r15);	 Catch:{ Exception -> 0x00b4 }
    L_0x0099:
        r14 = "android.permission.ACCESS_NETWORK_STATE";
        r14 = r13.contains(r14);	 Catch:{ Exception -> 0x00b4 }
        if (r14 != 0) goto L_0x00a6;
    L_0x00a1:
        r14 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml";
        com.appsflyer.AFLogger.K(r14);	 Catch:{ Exception -> 0x00b4 }
    L_0x00a6:
        r14 = "android.permission.ACCESS_WIFI_STATE";
        r13 = r13.contains(r14);	 Catch:{ Exception -> 0x00b4 }
        if (r13 != 0) goto L_0x00bb;
    L_0x00ae:
        r13 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml";
        com.appsflyer.AFLogger.K(r13);	 Catch:{ Exception -> 0x00b4 }
        goto L_0x00bb;
    L_0x00b4:
        r0 = move-exception;
        r13 = r0;
        r14 = "Exception while validation permissions. ";
        com.appsflyer.AFLogger.c(r14, r13);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x00bb:
        if (r30 == 0) goto L_0x00c4;
    L_0x00bd:
        r13 = "af_events_api";
        r14 = "1";
        r12.put(r13, r14);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x00c4:
        r13 = "brand";
        r14 = android.os.Build.BRAND;	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r13, r14);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = "device";
        r14 = android.os.Build.DEVICE;	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r13, r14);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = "product";
        r14 = android.os.Build.PRODUCT;	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r13, r14);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = "sdk";
        r14 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0bf7 }
        r14 = java.lang.Integer.toString(r14);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r13, r14);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = "model";
        r14 = android.os.Build.MODEL;	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r13, r14);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = "deviceType";
        r14 = android.os.Build.TYPE;	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r13, r14);	 Catch:{ Throwable -> 0x0bf7 }
        r13 = "appsFlyerCount";
        r14 = "appsflyer-data";
        r15 = 0;
        if (r7 == 0) goto L_0x0243;
    L_0x00f9:
        r10 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf7 }
        r10 = r10.getSharedPreferences(r14, r15);	 Catch:{ Throwable -> 0x0bf7 }
        r10 = r10.contains(r13);	 Catch:{ Throwable -> 0x0bf7 }
        r18 = 1;
        r10 = r10 ^ 1;
        if (r10 == 0) goto L_0x01b6;
    L_0x010b:
        r10 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r10 = r10.dB();	 Catch:{ Throwable -> 0x0bf7 }
        if (r10 != 0) goto L_0x0122;
    L_0x0115:
        r10 = r(r25);	 Catch:{ Throwable -> 0x0bf7 }
        r15 = "batteryLevel";
        r10 = java.lang.String.valueOf(r10);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r15, r10);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0122:
        r15 = "OPPO";
        r10 = android.os.Build.BRAND;	 Catch:{ Throwable -> 0x0bf7 }
        r10 = r15.equals(r10);	 Catch:{ Throwable -> 0x0bf7 }
        if (r10 == 0) goto L_0x0134;
    L_0x012c:
        r10 = 23;
        r15 = "OPPO device found";
        com.appsflyer.AFLogger.G(r15);	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x0136;
    L_0x0134:
        r10 = 18;
    L_0x0136:
        r15 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0bf7 }
        if (r15 < r10) goto L_0x019b;
    L_0x013a:
        r10 = "keyPropDisableAFKeystore";
        r15 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r19 = r1;
        r1 = 0;
        r10 = r15.getBoolean(r10, r1);	 Catch:{ Throwable -> 0x0bf7 }
        if (r10 != 0) goto L_0x019d;
    L_0x0149:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf7 }
        r10 = "OS SDK is=";
        r1.<init>(r10);	 Catch:{ Throwable -> 0x0bf7 }
        r10 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0bf7 }
        r1.append(r10);	 Catch:{ Throwable -> 0x0bf7 }
        r10 = "; use KeyStore";
        r1.append(r10);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0bf7 }
        com.appsflyer.AFLogger.G(r1);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = new com.appsflyer.e;	 Catch:{ Throwable -> 0x0bf7 }
        r1.<init>(r2);	 Catch:{ Throwable -> 0x0bf7 }
        r10 = r1.dj();	 Catch:{ Throwable -> 0x0bf7 }
        if (r10 != 0) goto L_0x0179;
    L_0x016c:
        r10 = new java.lang.ref.WeakReference;	 Catch:{ Throwable -> 0x0bf7 }
        r10.<init>(r2);	 Catch:{ Throwable -> 0x0bf7 }
        r10 = com.appsflyer.af.e(r10);	 Catch:{ Throwable -> 0x0bf7 }
        r1.D(r10);	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x017c;
    L_0x0179:
        r1.di();	 Catch:{ Throwable -> 0x0bf7 }
    L_0x017c:
        r10 = "KSAppsFlyerId";
        r15 = r1.dl();	 Catch:{ Throwable -> 0x0bf7 }
        r7 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r7.set(r10, r15);	 Catch:{ Throwable -> 0x0bf7 }
        r7 = "KSAppsFlyerRICounter";
        r1 = r1.dm();	 Catch:{ Throwable -> 0x0bf7 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x0bf7 }
        r10 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r10.set(r7, r1);	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x01b8;
    L_0x019b:
        r19 = r1;
    L_0x019d:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf7 }
        r7 = "OS SDK is=";
        r1.<init>(r7);	 Catch:{ Throwable -> 0x0bf7 }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0bf7 }
        r1.append(r7);	 Catch:{ Throwable -> 0x0bf7 }
        r7 = "; no KeyStore usage";
        r1.append(r7);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0bf7 }
        com.appsflyer.AFLogger.G(r1);	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x01b8;
    L_0x01b6:
        r19 = r1;
    L_0x01b8:
        r1 = "timepassedsincelastlaunch";
        r7 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf7 }
        r10 = 0;
        r7 = r7.getSharedPreferences(r14, r10);	 Catch:{ Throwable -> 0x0bf7 }
        r10 = "AppsFlyerTimePassedSincePrevLaunch";
        r15 = r8;
        r20 = r9;
        r8 = 0;
        r21 = r7.getLong(r10, r8);	 Catch:{ Throwable -> 0x0bf7 }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ Throwable -> 0x0bf7 }
        r7 = "AppsFlyerTimePassedSincePrevLaunch";
        a(r2, r7, r8);	 Catch:{ Throwable -> 0x0bf7 }
        r16 = 0;
        r7 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1));
        if (r7 <= 0) goto L_0x01e5;
    L_0x01de:
        r8 = r8 - r21;
        r21 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 / r21;
        goto L_0x01e7;
    L_0x01e5:
        r8 = -1;
    L_0x01e7:
        r7 = java.lang.Long.toString(r8);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r1, r7);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r7 = "oneLinkSlug";
        r1 = r1.getString(r7);	 Catch:{ Throwable -> 0x0bf7 }
        if (r1 == 0) goto L_0x020e;
    L_0x01fa:
        r7 = "onelink_id";
        r12.put(r7, r1);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = "ol_ver";
        r7 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r8 = "onelinkVersion";
        r7 = r7.getString(r8);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r1, r7);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x020e:
        r1 = "appsflyerGetConversionDataTiming";
        r7 = 0;
        r9 = r6.getLong(r1, r7);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r1 <= 0) goto L_0x023b;
    L_0x021a:
        r1 = "gcd_timing";
        r7 = java.lang.Long.toString(r9);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r1, r7);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = "appsflyerGetConversionDataTiming";
        r7 = r31.edit();	 Catch:{ Throwable -> 0x0bf7 }
        r8 = 0;
        r7.putLong(r1, r8);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0bf7 }
        r8 = 9;
        if (r1 < r8) goto L_0x0238;
    L_0x0234:
        r7.apply();	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x023b;
    L_0x0238:
        r7.commit();	 Catch:{ Throwable -> 0x0bf7 }
    L_0x023b:
        r22 = r13;
        r23 = r14;
        r21 = r15;
        goto L_0x02c9;
    L_0x0243:
        r19 = r1;
        r15 = r8;
        r20 = r9;
        r1 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf7 }
        r7 = 0;
        r1 = r1.getSharedPreferences(r14, r7);	 Catch:{ Throwable -> 0x0bf7 }
        r7 = r1.edit();	 Catch:{ Throwable -> 0x0bf7 }
        r8 = 0;
        r9 = r1.getString(r10, r8);	 Catch:{ Exception -> 0x02bc }
        r8 = "prev_event_timestamp";
        r21 = r15;
        r15 = "prev_event_value";
        if (r9 == 0) goto L_0x029b;
    L_0x0262:
        r6 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0295 }
        r6.<init>();	 Catch:{ Exception -> 0x0295 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0295 }
        r3.<init>();	 Catch:{ Exception -> 0x0295 }
        r22 = r13;
        r23 = r14;
        r13 = -1;
        r13 = r1.getLong(r8, r13);	 Catch:{ Exception -> 0x02ba }
        r3.append(r13);	 Catch:{ Exception -> 0x02ba }
        r3 = r3.toString();	 Catch:{ Exception -> 0x02ba }
        r6.put(r8, r3);	 Catch:{ Exception -> 0x02ba }
        r3 = 0;
        r1 = r1.getString(r15, r3);	 Catch:{ Exception -> 0x02ba }
        r6.put(r15, r1);	 Catch:{ Exception -> 0x02ba }
        r6.put(r10, r9);	 Catch:{ Exception -> 0x02ba }
        r1 = "prev_event";
        r3 = r6.toString();	 Catch:{ Exception -> 0x02ba }
        r12.put(r1, r3);	 Catch:{ Exception -> 0x02ba }
        goto L_0x029f;
    L_0x0295:
        r0 = move-exception;
        r22 = r13;
        r23 = r14;
        goto L_0x02c3;
    L_0x029b:
        r22 = r13;
        r23 = r14;
    L_0x029f:
        r7.putString(r10, r4);	 Catch:{ Exception -> 0x02ba }
        r7.putString(r15, r5);	 Catch:{ Exception -> 0x02ba }
        r9 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x02ba }
        r7.putLong(r8, r9);	 Catch:{ Exception -> 0x02ba }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x02ba }
        r3 = 9;
        if (r1 < r3) goto L_0x02b6;
    L_0x02b2:
        r7.apply();	 Catch:{ Exception -> 0x02ba }
        goto L_0x02c9;
    L_0x02b6:
        r7.commit();	 Catch:{ Exception -> 0x02ba }
        goto L_0x02c9;
    L_0x02ba:
        r0 = move-exception;
        goto L_0x02c3;
    L_0x02bc:
        r0 = move-exception;
        r22 = r13;
        r23 = r14;
        r21 = r15;
    L_0x02c3:
        r1 = r0;
        r3 = "Error while processing previous event.";
        com.appsflyer.AFLogger.c(r3, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x02c9:
        r1 = "KSAppsFlyerId";
        r3 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r1 = r3.getString(r1);	 Catch:{ Throwable -> 0x0bf7 }
        r3 = "KSAppsFlyerRICounter";
        r6 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r3 = r6.getString(r3);	 Catch:{ Throwable -> 0x0bf7 }
        if (r1 == 0) goto L_0x02f5;
    L_0x02df:
        if (r3 == 0) goto L_0x02f5;
    L_0x02e1:
        r6 = java.lang.Integer.valueOf(r3);	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r6.intValue();	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 <= 0) goto L_0x02f5;
    L_0x02eb:
        r6 = "reinstallCounter";
        r12.put(r6, r3);	 Catch:{ Throwable -> 0x0bf7 }
        r3 = "originalAppsflyerId";
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x02f5:
        r1 = "additionalCustomData";
        r3 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r1 = r3.getString(r1);	 Catch:{ Throwable -> 0x0bf7 }
        if (r1 == 0) goto L_0x0306;
    L_0x0301:
        r3 = "customData";
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0306:
        r1 = r25.getPackageManager();	 Catch:{ Exception -> 0x031a }
        r3 = r25.getPackageName();	 Catch:{ Exception -> 0x031a }
        r1 = r1.getInstallerPackageName(r3);	 Catch:{ Exception -> 0x031a }
        if (r1 == 0) goto L_0x0321;
    L_0x0314:
        r3 = "installer_package";
        r12.put(r3, r1);	 Catch:{ Exception -> 0x031a }
        goto L_0x0321;
    L_0x031a:
        r0 = move-exception;
        r1 = r0;
        r3 = "Exception while getting the app's installer package. ";
        com.appsflyer.AFLogger.c(r3, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0321:
        r1 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r3 = "sdkExtension";
        r1 = r1.getString(r3);	 Catch:{ Throwable -> 0x0bf7 }
        if (r1 == 0) goto L_0x0338;
    L_0x032d:
        r3 = r1.length();	 Catch:{ Throwable -> 0x0bf7 }
        if (r3 <= 0) goto L_0x0338;
    L_0x0333:
        r3 = "sdkExtension";
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0338:
        r1 = new java.lang.ref.WeakReference;	 Catch:{ Throwable -> 0x0bf7 }
        r1.<init>(r2);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = b(r1);	 Catch:{ Throwable -> 0x0bf7 }
        r3 = m(r2, r1);	 Catch:{ Throwable -> 0x0bf7 }
        if (r3 == 0) goto L_0x034c;
    L_0x0347:
        r6 = "channel";
        r12.put(r6, r3);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x034c:
        if (r3 == 0) goto L_0x0354;
    L_0x034e:
        r6 = r3.equals(r1);	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 == 0) goto L_0x0358;
    L_0x0354:
        if (r3 != 0) goto L_0x035d;
    L_0x0356:
        if (r1 == 0) goto L_0x035d;
    L_0x0358:
        r3 = "af_latestchannel";
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x035d:
        r1 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf7 }
        r3 = r23;
        r6 = 0;
        r1 = r1.getSharedPreferences(r3, r6);	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r20;
        r7 = r1.contains(r6);	 Catch:{ Throwable -> 0x0bf7 }
        if (r7 == 0) goto L_0x0378;
    L_0x0370:
        r7 = 0;
        r1 = r1.getString(r6, r7);	 Catch:{ Throwable -> 0x0bf7 }
        r7 = r22;
        goto L_0x0395;
    L_0x0378:
        r1 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf7 }
        r7 = 0;
        r1 = r1.getSharedPreferences(r3, r7);	 Catch:{ Throwable -> 0x0bf7 }
        r7 = r22;
        r1 = r1.contains(r7);	 Catch:{ Throwable -> 0x0bf7 }
        r8 = 1;
        r1 = r1 ^ r8;
        if (r1 == 0) goto L_0x0391;
    L_0x038b:
        r13 = n(r25);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = r13;
        goto L_0x0392;
    L_0x0391:
        r1 = 0;
    L_0x0392:
        a(r2, r6, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0395:
        if (r1 == 0) goto L_0x03a0;
    L_0x0397:
        r6 = "af_installstore";
        r1 = r1.toLowerCase();	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r6, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x03a0:
        r1 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf7 }
        r6 = 0;
        r1 = r1.getSharedPreferences(r3, r6);	 Catch:{ Throwable -> 0x0bf7 }
        r6 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r6.getString(r11);	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 != 0) goto L_0x045b;
    L_0x03b3:
        r8 = r1.contains(r11);	 Catch:{ Throwable -> 0x0bf7 }
        if (r8 == 0) goto L_0x03c1;
    L_0x03b9:
        r6 = 0;
        r1 = r1.getString(r11, r6);	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r1;
        goto L_0x0452;
    L_0x03c1:
        r1 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf7 }
        r8 = 0;
        r1 = r1.getSharedPreferences(r3, r8);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = r1.contains(r7);	 Catch:{ Throwable -> 0x0bf7 }
        r8 = 1;
        r1 = r1 ^ r8;
        if (r1 == 0) goto L_0x044d;
    L_0x03d2:
        r1 = "ro.appsflyer.preinstall.path";
        r1 = R(r1);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = S(r1);	 Catch:{ Throwable -> 0x0bf7 }
        if (r1 == 0) goto L_0x03e7;
    L_0x03de:
        r6 = r1.exists();	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 != 0) goto L_0x03e5;
    L_0x03e4:
        goto L_0x03e7;
    L_0x03e5:
        r6 = 0;
        goto L_0x03e8;
    L_0x03e7:
        r6 = 1;
    L_0x03e8:
        if (r6 == 0) goto L_0x03fc;
    L_0x03ea:
        r1 = "AF_PRE_INSTALL_PATH";
        r6 = r25.getPackageManager();	 Catch:{ Throwable -> 0x0bf7 }
        r8 = r25.getPackageName();	 Catch:{ Throwable -> 0x0bf7 }
        r1 = a(r1, r6, r8);	 Catch:{ Throwable -> 0x0bf7 }
        r1 = S(r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x03fc:
        if (r1 == 0) goto L_0x0407;
    L_0x03fe:
        r6 = r1.exists();	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 != 0) goto L_0x0405;
    L_0x0404:
        goto L_0x0407;
    L_0x0405:
        r6 = 0;
        goto L_0x0408;
    L_0x0407:
        r6 = 1;
    L_0x0408:
        if (r6 == 0) goto L_0x0410;
    L_0x040a:
        r1 = "/data/local/tmp/pre_install.appsflyer";
        r1 = S(r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0410:
        if (r1 == 0) goto L_0x041b;
    L_0x0412:
        r6 = r1.exists();	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 != 0) goto L_0x0419;
    L_0x0418:
        goto L_0x041b;
    L_0x0419:
        r6 = 0;
        goto L_0x041c;
    L_0x041b:
        r6 = 1;
    L_0x041c:
        if (r6 == 0) goto L_0x0424;
    L_0x041e:
        r1 = "/etc/pre_install.appsflyer";
        r1 = S(r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0424:
        if (r1 == 0) goto L_0x042f;
    L_0x0426:
        r6 = r1.exists();	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 != 0) goto L_0x042d;
    L_0x042c:
        goto L_0x042f;
    L_0x042d:
        r6 = 0;
        goto L_0x0430;
    L_0x042f:
        r6 = 1;
    L_0x0430:
        if (r6 != 0) goto L_0x043e;
    L_0x0432:
        r6 = r25.getPackageName();	 Catch:{ Throwable -> 0x0bf7 }
        r13 = b(r1, r6);	 Catch:{ Throwable -> 0x0bf7 }
        if (r13 == 0) goto L_0x043e;
    L_0x043c:
        r6 = r13;
        goto L_0x043f;
    L_0x043e:
        r6 = 0;
    L_0x043f:
        if (r6 == 0) goto L_0x0442;
    L_0x0441:
        goto L_0x044d;
    L_0x0442:
        r1 = new java.lang.ref.WeakReference;	 Catch:{ Throwable -> 0x0bf7 }
        r1.<init>(r2);	 Catch:{ Throwable -> 0x0bf7 }
        r6 = "AF_PRE_INSTALL_NAME";
        r6 = a(r1, r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x044d:
        if (r6 == 0) goto L_0x0452;
    L_0x044f:
        a(r2, r11, r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0452:
        if (r6 == 0) goto L_0x045b;
    L_0x0454:
        r1 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r1.set(r11, r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x045b:
        if (r6 == 0) goto L_0x0466;
    L_0x045d:
        r1 = "af_preinstall_name";
        r6 = r6.toLowerCase();	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r1, r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0466:
        r1 = n(r25);	 Catch:{ Throwable -> 0x0bf7 }
        if (r1 == 0) goto L_0x0475;
    L_0x046c:
        r6 = "af_currentstore";
        r1 = r1.toLowerCase();	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r6, r1);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0475:
        r1 = "appsflyerKey";
        r6 = r26;
        if (r6 == 0) goto L_0x0485;
    L_0x047b:
        r8 = r26.length();	 Catch:{ Throwable -> 0x0bf7 }
        if (r8 < 0) goto L_0x0485;
    L_0x0481:
        r12.put(r1, r6);	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x049a;
    L_0x0485:
        r6 = "AppsFlyerKey";
        r8 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r8.getString(r6);	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 == 0) goto L_0x0be0;
    L_0x0491:
        r8 = r6.length();	 Catch:{ Throwable -> 0x0bf7 }
        if (r8 < 0) goto L_0x0be0;
    L_0x0497:
        r12.put(r1, r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x049a:
        r6 = "AppUserId";
        r8 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r8.getString(r6);	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 == 0) goto L_0x04ab;
    L_0x04a6:
        r8 = "appUserId";
        r12.put(r8, r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x04ab:
        r6 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r8 = "userEmails";
        r6 = r6.getString(r8);	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 == 0) goto L_0x04bf;
    L_0x04b8:
        r8 = "user_emails";
        r12.put(r8, r6);	 Catch:{ Throwable -> 0x0bf7 }
        goto L_0x04d5;
    L_0x04bf:
        r6 = "userEmail";
        r8 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r8.getString(r6);	 Catch:{ Throwable -> 0x0bf7 }
        if (r6 == 0) goto L_0x04d5;
    L_0x04cc:
        r8 = "sha1_el";
        r6 = com.appsflyer.ae.U(r6);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r8, r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x04d5:
        if (r4 == 0) goto L_0x04e3;
    L_0x04d7:
        r6 = "eventName";
        r12.put(r6, r4);	 Catch:{ Throwable -> 0x0bf7 }
        if (r5 == 0) goto L_0x04e3;
    L_0x04de:
        r6 = "eventValue";
        r12.put(r6, r5);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x04e3:
        r5 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r21;
        r5 = r5.getString(r6);	 Catch:{ Throwable -> 0x0bf7 }
        if (r5 == 0) goto L_0x04fa;
    L_0x04ef:
        r5 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r5 = r5.getString(r6);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r6, r5);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x04fa:
        r5 = "currencyCode";
        r6 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r5 = r6.getString(r5);	 Catch:{ Throwable -> 0x0bf7 }
        if (r5 == 0) goto L_0x0528;
    L_0x0506:
        r6 = r5.length();	 Catch:{ Throwable -> 0x0bf7 }
        r8 = 3;
        if (r6 == r8) goto L_0x0523;
    L_0x050d:
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf7 }
        r8 = "WARNING: currency code should be 3 characters!!! '";
        r6.<init>(r8);	 Catch:{ Throwable -> 0x0bf7 }
        r6.append(r5);	 Catch:{ Throwable -> 0x0bf7 }
        r8 = "' is not a legal value.";
        r6.append(r8);	 Catch:{ Throwable -> 0x0bf7 }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x0bf7 }
        com.appsflyer.AFLogger.K(r6);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0523:
        r6 = "currency";
        r12.put(r6, r5);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0528:
        r5 = "IS_UPDATE";
        r6 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r5 = r6.getString(r5);	 Catch:{ Throwable -> 0x0bf7 }
        if (r5 == 0) goto L_0x0539;
    L_0x0534:
        r6 = "isUpdate";
        r12.put(r6, r5);	 Catch:{ Throwable -> 0x0bf7 }
    L_0x0539:
        r5 = r24.o(r25);	 Catch:{ Throwable -> 0x0bf7 }
        r6 = "af_preinstalled";
        r5 = java.lang.Boolean.toString(r5);	 Catch:{ Throwable -> 0x0bf7 }
        r12.put(r6, r5);	 Catch:{ Throwable -> 0x0bf7 }
        r5 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf7 }
        r6 = "collectFacebookAttrId";
        r8 = 1;
        r5 = r5.getBoolean(r6, r8);	 Catch:{ Throwable -> 0x0bf7 }
        if (r5 == 0) goto L_0x058b;
    L_0x0553:
        r5 = r25.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c }
        r6 = "com.facebook.katana";
        r8 = 0;
        r5.getApplicationInfo(r6, r8);	 Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c }
        r5 = r25.getContentResolver();	 Catch:{ NameNotFoundException -> 0x0579, Throwable -> 0x056c }
        r6 = r24;
        r8 = r19;
        r13 = r6.a(r5);	 Catch:{ NameNotFoundException -> 0x057d, Throwable -> 0x056a }
        goto L_0x0583;
    L_0x056a:
        r0 = move-exception;
        goto L_0x0571;
    L_0x056c:
        r0 = move-exception;
        r6 = r24;
        r8 = r19;
    L_0x0571:
        r5 = r0;
        r9 = "Exception while collecting facebook's attribution ID. ";
        com.appsflyer.AFLogger.c(r9, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0577:
        r13 = 0;
        goto L_0x0583;
    L_0x0579:
        r6 = r24;
        r8 = r19;
    L_0x057d:
        r5 = "Exception while collecting facebook's attribution ID. ";
        com.appsflyer.AFLogger.K(r5);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0577;
    L_0x0583:
        if (r13 == 0) goto L_0x058f;
    L_0x0585:
        r5 = "fb";
        r12.put(r5, r13);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x058f;
    L_0x058b:
        r6 = r24;
        r8 = r19;
    L_0x058f:
        r5 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r9 = "deviceTrackingDisabled";
        r10 = 0;
        r5 = r5.getBoolean(r9, r10);	 Catch:{ Throwable -> 0x0bf5 }
        r9 = "true";
        if (r5 == 0) goto L_0x05a8;
    L_0x059f:
        r5 = "deviceTrackingDisabled";
        r12.put(r5, r9);	 Catch:{ Throwable -> 0x0bf5 }
        r19 = r8;
        goto L_0x06db;
    L_0x05a8:
        r5 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0bf5 }
        r10 = 0;
        r5 = r5.getSharedPreferences(r3, r10);	 Catch:{ Throwable -> 0x0bf5 }
        r10 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r11 = "collectIMEI";
        r13 = 1;
        r10 = r10.getBoolean(r11, r13);	 Catch:{ Throwable -> 0x0bf5 }
        r11 = "imeiCached";
        r13 = 0;
        r11 = r5.getString(r11, r13);	 Catch:{ Throwable -> 0x0bf5 }
        if (r10 == 0) goto L_0x0647;
    L_0x05c5:
        r10 = r6.lw;	 Catch:{ Throwable -> 0x0bf5 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ Throwable -> 0x0bf5 }
        if (r10 == 0) goto L_0x0647;
    L_0x05cd:
        r10 = m(r25);	 Catch:{ Throwable -> 0x0bf5 }
        if (r10 == 0) goto L_0x0644;
    L_0x05d3:
        r10 = "phone";
        r10 = r2.getSystemService(r10);	 Catch:{ InvocationTargetException -> 0x0629, Exception -> 0x060c }
        r10 = (android.telephony.TelephonyManager) r10;	 Catch:{ InvocationTargetException -> 0x0629, Exception -> 0x060c }
        r13 = r10.getClass();	 Catch:{ InvocationTargetException -> 0x0629, Exception -> 0x060c }
        r14 = "getDeviceId";
        r19 = r8;
        r15 = 0;
        r8 = new java.lang.Class[r15];	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        r8 = r13.getMethod(r14, r8);	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        r13 = new java.lang.Object[r15];	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        r8 = r8.invoke(r10, r13);	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        r13 = r8;
        r13 = (java.lang.String) r13;	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        if (r13 == 0) goto L_0x05f6;
    L_0x05f5:
        goto L_0x0651;
    L_0x05f6:
        if (r11 == 0) goto L_0x0650;
    L_0x05f8:
        r8 = "use cached IMEI: ";
        r10 = java.lang.String.valueOf(r11);	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        r8 = r8.concat(r10);	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        com.appsflyer.AFLogger.I(r8);	 Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x0608 }
        r13 = r11;
        goto L_0x0651;
    L_0x0608:
        r0 = move-exception;
        goto L_0x060f;
        goto L_0x062b;
    L_0x060c:
        r0 = move-exception;
        r19 = r8;
    L_0x060f:
        r8 = r0;
        if (r11 == 0) goto L_0x0622;
    L_0x0612:
        r10 = "use cached IMEI: ";
        r13 = java.lang.String.valueOf(r11);	 Catch:{ Throwable -> 0x0bf5 }
        r10 = r10.concat(r13);	 Catch:{ Throwable -> 0x0bf5 }
        com.appsflyer.AFLogger.I(r10);	 Catch:{ Throwable -> 0x0bf5 }
        r13 = r11;
        goto L_0x0623;
    L_0x0622:
        r13 = 0;
    L_0x0623:
        r10 = "WARNING: other reason: ";
        com.appsflyer.AFLogger.c(r10, r8);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0651;
    L_0x0629:
        r19 = r8;
    L_0x062b:
        if (r11 == 0) goto L_0x063d;
    L_0x062d:
        r8 = "use cached IMEI: ";
        r10 = java.lang.String.valueOf(r11);	 Catch:{ Throwable -> 0x0bf5 }
        r8 = r8.concat(r10);	 Catch:{ Throwable -> 0x0bf5 }
        com.appsflyer.AFLogger.I(r8);	 Catch:{ Throwable -> 0x0bf5 }
        r13 = r11;
        goto L_0x063e;
    L_0x063d:
        r13 = 0;
    L_0x063e:
        r8 = "WARNING: READ_PHONE_STATE is missing.";
        com.appsflyer.AFLogger.K(r8);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0651;
    L_0x0644:
        r19 = r8;
        goto L_0x0650;
    L_0x0647:
        r19 = r8;
        r8 = r6.lw;	 Catch:{ Throwable -> 0x0bf5 }
        if (r8 == 0) goto L_0x0650;
    L_0x064d:
        r13 = r6.lw;	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0651;
    L_0x0650:
        r13 = 0;
    L_0x0651:
        if (r13 == 0) goto L_0x065e;
    L_0x0653:
        r8 = "imeiCached";
        a(r2, r8, r13);	 Catch:{ Throwable -> 0x0bf5 }
        r8 = "imei";
        r12.put(r8, r13);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0663;
    L_0x065e:
        r8 = "IMEI was not collected.";
        com.appsflyer.AFLogger.J(r8);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0663:
        r8 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r10 = "collectAndroidId";
        r11 = 1;
        r8 = r8.getBoolean(r10, r11);	 Catch:{ Throwable -> 0x0bf5 }
        r10 = "androidIdCached";
        r11 = 0;
        r5 = r5.getString(r10, r11);	 Catch:{ Throwable -> 0x0bf5 }
        if (r8 == 0) goto L_0x06c1;
    L_0x0677:
        r8 = r6.lx;	 Catch:{ Throwable -> 0x0bf5 }
        r8 = android.text.TextUtils.isEmpty(r8);	 Catch:{ Throwable -> 0x0bf5 }
        if (r8 == 0) goto L_0x06c1;
    L_0x067f:
        r8 = m(r25);	 Catch:{ Throwable -> 0x0bf5 }
        if (r8 == 0) goto L_0x06c8;
    L_0x0685:
        r8 = r25.getContentResolver();	 Catch:{ Exception -> 0x06a4 }
        r10 = "android_id";
        r13 = android.provider.Settings.Secure.getString(r8, r10);	 Catch:{ Exception -> 0x06a4 }
        if (r13 == 0) goto L_0x0692;
    L_0x0691:
        goto L_0x06c9;
    L_0x0692:
        if (r5 == 0) goto L_0x06c8;
    L_0x0694:
        r8 = "use cached AndroidId: ";
        r10 = java.lang.String.valueOf(r5);	 Catch:{ Exception -> 0x06a4 }
        r8 = r8.concat(r10);	 Catch:{ Exception -> 0x06a4 }
        com.appsflyer.AFLogger.I(r8);	 Catch:{ Exception -> 0x06a4 }
        r13 = r5;
        goto L_0x06c9;
    L_0x06a4:
        r0 = move-exception;
        r8 = r0;
        if (r5 == 0) goto L_0x06b8;
    L_0x06a8:
        r10 = "use cached AndroidId: ";
        r11 = java.lang.String.valueOf(r5);	 Catch:{ Throwable -> 0x0bf5 }
        r10 = r10.concat(r11);	 Catch:{ Throwable -> 0x0bf5 }
        com.appsflyer.AFLogger.I(r10);	 Catch:{ Throwable -> 0x0bf5 }
        r13 = r5;
        goto L_0x06b9;
    L_0x06b8:
        r13 = 0;
    L_0x06b9:
        r5 = r8.getMessage();	 Catch:{ Throwable -> 0x0bf5 }
        com.appsflyer.AFLogger.c(r5, r8);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x06c9;
    L_0x06c1:
        r5 = r6.lx;	 Catch:{ Throwable -> 0x0bf5 }
        if (r5 == 0) goto L_0x06c8;
    L_0x06c5:
        r13 = r6.lx;	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x06c9;
    L_0x06c8:
        r13 = 0;
    L_0x06c9:
        if (r13 == 0) goto L_0x06d6;
    L_0x06cb:
        r5 = "androidIdCached";
        a(r2, r5, r13);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = "android_id";
        r12.put(r5, r13);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x06db;
    L_0x06d6:
        r5 = "Android ID was not collected.";
        com.appsflyer.AFLogger.J(r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x06db:
        r5 = new java.lang.ref.WeakReference;	 Catch:{ Exception -> 0x06ed }
        r5.<init>(r2);	 Catch:{ Exception -> 0x06ed }
        r5 = com.appsflyer.af.e(r5);	 Catch:{ Exception -> 0x06ed }
        if (r5 == 0) goto L_0x0704;
    L_0x06e6:
        r8 = "uid";
        r12.put(r8, r5);	 Catch:{ Exception -> 0x06ed }
        goto L_0x0704;
    L_0x06ed:
        r0 = move-exception;
        r5 = r0;
        r8 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r10 = "ERROR: could not get uid ";
        r8.<init>(r10);	 Catch:{ Throwable -> 0x0bf5 }
        r10 = r5.getMessage();	 Catch:{ Throwable -> 0x0bf5 }
        r8.append(r10);	 Catch:{ Throwable -> 0x0bf5 }
        r8 = r8.toString();	 Catch:{ Throwable -> 0x0bf5 }
        com.appsflyer.AFLogger.c(r8, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0704:
        r5 = "lang";
        r8 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x0712 }
        r8 = r8.getDisplayLanguage();	 Catch:{ Exception -> 0x0712 }
        r12.put(r5, r8);	 Catch:{ Exception -> 0x0712 }
        goto L_0x0719;
    L_0x0712:
        r0 = move-exception;
        r5 = r0;
        r8 = "Exception while collecting display language name. ";
        com.appsflyer.AFLogger.c(r8, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0719:
        r5 = "lang_code";
        r8 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x0727 }
        r8 = r8.getLanguage();	 Catch:{ Exception -> 0x0727 }
        r12.put(r5, r8);	 Catch:{ Exception -> 0x0727 }
        goto L_0x072e;
    L_0x0727:
        r0 = move-exception;
        r5 = r0;
        r8 = "Exception while collecting display language code. ";
        com.appsflyer.AFLogger.c(r8, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x072e:
        r5 = "country";
        r8 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x073c }
        r8 = r8.getCountry();	 Catch:{ Exception -> 0x073c }
        r12.put(r5, r8);	 Catch:{ Exception -> 0x073c }
        goto L_0x0743;
    L_0x073c:
        r0 = move-exception;
        r5 = r0;
        r8 = "Exception while collecting country name. ";
        com.appsflyer.AFLogger.c(r8, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0743:
        r5 = "platformextension";
        r8 = r6.lF;	 Catch:{ Throwable -> 0x0bf5 }
        r8 = r8.dG();	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r5, r8);	 Catch:{ Throwable -> 0x0bf5 }
        a(r2, r12);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = "yyyy-MM-dd_HHmmssZ";
        r8 = new java.text.SimpleDateFormat;	 Catch:{ Throwable -> 0x0bf5 }
        r10 = java.util.Locale.US;	 Catch:{ Throwable -> 0x0bf5 }
        r8.<init>(r5, r10);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = r25.getPackageManager();	 Catch:{ Exception -> 0x0782 }
        r10 = r25.getPackageName();	 Catch:{ Exception -> 0x0782 }
        r11 = 0;
        r5 = r5.getPackageInfo(r10, r11);	 Catch:{ Exception -> 0x0782 }
        r10 = r5.firstInstallTime;	 Catch:{ Exception -> 0x0782 }
        r5 = "installDate";
        r13 = "UTC";
        r13 = java.util.TimeZone.getTimeZone(r13);	 Catch:{ Exception -> 0x0782 }
        r8.setTimeZone(r13);	 Catch:{ Exception -> 0x0782 }
        r13 = new java.util.Date;	 Catch:{ Exception -> 0x0782 }
        r13.<init>(r10);	 Catch:{ Exception -> 0x0782 }
        r10 = r8.format(r13);	 Catch:{ Exception -> 0x0782 }
        r12.put(r5, r10);	 Catch:{ Exception -> 0x0782 }
        goto L_0x0789;
    L_0x0782:
        r0 = move-exception;
        r5 = r0;
        r10 = "Exception while collecting install date. ";
        com.appsflyer.AFLogger.c(r10, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0789:
        r5 = r25.getPackageManager();	 Catch:{ Throwable -> 0x0845 }
        r10 = r25.getPackageName();	 Catch:{ Throwable -> 0x0845 }
        r11 = 0;
        r5 = r5.getPackageInfo(r10, r11);	 Catch:{ Throwable -> 0x0845 }
        r10 = "versionCode";
        r13 = r31;
        r10 = r13.getInt(r10, r11);	 Catch:{ Throwable -> 0x0843 }
        r14 = r5.versionCode;	 Catch:{ Throwable -> 0x0843 }
        if (r14 <= r10) goto L_0x07b0;
    L_0x07a3:
        r10 = "appsflyerConversionDataRequestRetries";
        b(r2, r10, r11);	 Catch:{ Throwable -> 0x0843 }
        r10 = "versionCode";
        r11 = r5.versionCode;	 Catch:{ Throwable -> 0x0843 }
        b(r2, r10, r11);	 Catch:{ Throwable -> 0x0843 }
    L_0x07b0:
        r10 = "app_version_code";
        r11 = r5.versionCode;	 Catch:{ Throwable -> 0x0843 }
        r11 = java.lang.Integer.toString(r11);	 Catch:{ Throwable -> 0x0843 }
        r12.put(r10, r11);	 Catch:{ Throwable -> 0x0843 }
        r10 = "app_version_name";
        r11 = r5.versionName;	 Catch:{ Throwable -> 0x0843 }
        r12.put(r10, r11);	 Catch:{ Throwable -> 0x0843 }
        r10 = r5.firstInstallTime;	 Catch:{ Throwable -> 0x0843 }
        r14 = r5.lastUpdateTime;	 Catch:{ Throwable -> 0x0843 }
        r5 = "date1";
        r20 = "UTC";
        r21 = r1;
        r1 = java.util.TimeZone.getTimeZone(r20);	 Catch:{ Throwable -> 0x0841 }
        r8.setTimeZone(r1);	 Catch:{ Throwable -> 0x0841 }
        r1 = new java.util.Date;	 Catch:{ Throwable -> 0x0841 }
        r1.<init>(r10);	 Catch:{ Throwable -> 0x0841 }
        r1 = r8.format(r1);	 Catch:{ Throwable -> 0x0841 }
        r12.put(r5, r1);	 Catch:{ Throwable -> 0x0841 }
        r1 = "date2";
        r5 = "UTC";
        r5 = java.util.TimeZone.getTimeZone(r5);	 Catch:{ Throwable -> 0x0841 }
        r8.setTimeZone(r5);	 Catch:{ Throwable -> 0x0841 }
        r5 = new java.util.Date;	 Catch:{ Throwable -> 0x0841 }
        r5.<init>(r14);	 Catch:{ Throwable -> 0x0841 }
        r5 = r8.format(r5);	 Catch:{ Throwable -> 0x0841 }
        r12.put(r1, r5);	 Catch:{ Throwable -> 0x0841 }
        r1 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0841 }
        r5 = 0;
        r1 = r1.getSharedPreferences(r3, r5);	 Catch:{ Throwable -> 0x0841 }
        r10 = "appsFlyerFirstInstall";
        r11 = 0;
        r1 = r1.getString(r10, r11);	 Catch:{ Throwable -> 0x0841 }
        if (r1 != 0) goto L_0x082e;
    L_0x0808:
        r1 = r25.getApplicationContext();	 Catch:{ Throwable -> 0x0841 }
        r1 = r1.getSharedPreferences(r3, r5);	 Catch:{ Throwable -> 0x0841 }
        r1 = r1.contains(r7);	 Catch:{ Throwable -> 0x0841 }
        r3 = 1;
        r1 = r1 ^ r3;
        if (r1 == 0) goto L_0x0827;
    L_0x0818:
        r1 = "AppsFlyer: first launch detected";
        com.appsflyer.AFLogger.I(r1);	 Catch:{ Throwable -> 0x0841 }
        r1 = new java.util.Date;	 Catch:{ Throwable -> 0x0841 }
        r1.<init>();	 Catch:{ Throwable -> 0x0841 }
        r1 = r8.format(r1);	 Catch:{ Throwable -> 0x0841 }
        goto L_0x0829;
    L_0x0827:
        r1 = "";
    L_0x0829:
        r3 = "appsFlyerFirstInstall";
        a(r2, r3, r1);	 Catch:{ Throwable -> 0x0841 }
    L_0x082e:
        r3 = "AppsFlyer: first launch date: ";
        r5 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x0841 }
        r3 = r3.concat(r5);	 Catch:{ Throwable -> 0x0841 }
        com.appsflyer.AFLogger.J(r3);	 Catch:{ Throwable -> 0x0841 }
        r3 = "firstLaunchDate";
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0841 }
        goto L_0x0850;
    L_0x0841:
        r0 = move-exception;
        goto L_0x084a;
    L_0x0843:
        r0 = move-exception;
        goto L_0x0848;
    L_0x0845:
        r0 = move-exception;
        r13 = r31;
    L_0x0848:
        r21 = r1;
    L_0x084a:
        r1 = r0;
        r3 = "Exception while collecting app version data ";
        com.appsflyer.AFLogger.c(r3, r1);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0850:
        r1 = r29.length();	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 <= 0) goto L_0x085d;
    L_0x0856:
        r1 = "referrer";
        r3 = r29;
        r12.put(r1, r3);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x085d:
        r1 = "extraReferrers";
        r3 = 0;
        r1 = r13.getString(r1, r3);	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x086b;
    L_0x0866:
        r3 = "extraReferrers";
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x086b:
        r1 = "afUninstallToken";
        r3 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r3.getString(r1);	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x0884;
    L_0x0877:
        r1 = com.appsflyer.a.e.a.ac(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "af_gcm_token";
        r1 = r1.dD();	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0884:
        r1 = com.appsflyer.ai.j(r25);	 Catch:{ Throwable -> 0x0bf5 }
        r6.lD = r1;	 Catch:{ Throwable -> 0x0bf5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "didConfigureTokenRefreshService=";
        r1.<init>(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r6.lD;	 Catch:{ Throwable -> 0x0bf5 }
        r1.append(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0bf5 }
        com.appsflyer.AFLogger.I(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r6.lD;	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 != 0) goto L_0x08a9;
    L_0x08a1:
        r1 = "tokenRefreshConfigured";
        r3 = java.lang.Boolean.FALSE;	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r1, r3);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x08a9:
        r1 = r32;
        if (r1 == 0) goto L_0x08d9;
    L_0x08ad:
        r3 = com.appsflyer.b.dc();	 Catch:{ Throwable -> 0x0bf5 }
        r5 = r33;
        r3.a(r5, r2, r12);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r6.lC;	 Catch:{ Throwable -> 0x0bf5 }
        if (r3 == 0) goto L_0x08cf;
    L_0x08ba:
        r3 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0bf5 }
        r5 = r6.lC;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>(r5);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = "isPush";
        r3.put(r5, r9);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = "af_deeplink";
        r3 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r5, r3);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x08cf:
        r3 = 0;
        r6.lC = r3;	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "open_referrer";
        r5 = r34;
        r12.put(r3, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x08d9:
        r3 = r6.lB;	 Catch:{ Throwable -> 0x0bf5 }
        if (r3 == 0) goto L_0x08f4;
    L_0x08dd:
        r3 = "testAppMode_retargeting";
        r12.put(r3, r9);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>(r12);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        k(r2, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "Sent retargeting params to test app";
        com.appsflyer.AFLogger.J(r3);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x08f4:
        r10 = java.lang.System.currentTimeMillis();	 Catch:{ Throwable -> 0x0bf5 }
        r14 = r6.lz;	 Catch:{ Throwable -> 0x0bf5 }
        r10 = r10 - r14;
        r3 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r3.u(r2);	 Catch:{ Throwable -> 0x0bf5 }
        r14 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r5 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r5 > 0) goto L_0x0915;
    L_0x0909:
        if (r3 == 0) goto L_0x0915;
    L_0x090b:
        r5 = "AppsFlyer_Test";
        r3 = r3.contains(r5);	 Catch:{ Throwable -> 0x0bf5 }
        if (r3 == 0) goto L_0x0915;
    L_0x0913:
        r3 = 1;
        goto L_0x0916;
    L_0x0915:
        r3 = 0;
    L_0x0916:
        if (r3 == 0) goto L_0x0938;
    L_0x0918:
        r3 = "testAppMode";
        r12.put(r3, r9);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>(r12);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        k(r2, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "Sent params to test app";
        com.appsflyer.AFLogger.J(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "Test mode ended!";
        com.appsflyer.AFLogger.J(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r10 = 0;
        r6.lz = r10;	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0938:
        r3 = "advertiserId";
        r5 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r5.getString(r3);	 Catch:{ Throwable -> 0x0bf5 }
        if (r3 != 0) goto L_0x0960;
    L_0x0944:
        com.appsflyer.n.b(r2, r12);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "advertiserId";
        r5 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r5.getString(r3);	 Catch:{ Throwable -> 0x0bf5 }
        if (r3 == 0) goto L_0x0959;
    L_0x0953:
        r3 = "GAID_retry";
        r12.put(r3, r9);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0960;
    L_0x0959:
        r3 = "GAID_retry";
        r5 = "false";
        r12.put(r3, r5);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0960:
        r3 = r25.getContentResolver();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = com.appsflyer.n.b(r3);	 Catch:{ Throwable -> 0x0bf5 }
        if (r3 == 0) goto L_0x0980;
    L_0x096a:
        r5 = "amazon_aid";
        r8 = r3.dG();	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r5, r8);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = "amazon_aid_limit";
        r3 = r3.dL();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r5, r3);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0980:
        r3 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r3.u(r2);	 Catch:{ Throwable -> 0x0bf5 }
        if (r3 == 0) goto L_0x099d;
    L_0x098a:
        r5 = r3.length();	 Catch:{ Throwable -> 0x0bf5 }
        if (r5 <= 0) goto L_0x099d;
    L_0x0990:
        r5 = "referrer";
        r5 = r12.get(r5);	 Catch:{ Throwable -> 0x0bf5 }
        if (r5 != 0) goto L_0x099d;
    L_0x0998:
        r5 = "referrer";
        r12.put(r5, r3);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x099d:
        r3 = "sentSuccessfully";
        r5 = "";
        r3 = r13.getString(r3, r5);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r9.equals(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = "sentRegisterRequestToAF";
        r8 = 0;
        r5 = r13.getBoolean(r5, r8);	 Catch:{ Throwable -> 0x0bf5 }
        r8 = "registeredUninstall";
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r8, r5);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = a(r13, r7, r1);	 Catch:{ Throwable -> 0x0bf5 }
        r7 = "counter";
        r8 = java.lang.Integer.toString(r5);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r7, r8);	 Catch:{ Throwable -> 0x0bf5 }
        r7 = "iaecounter";
        if (r4 == 0) goto L_0x09cc;
    L_0x09ca:
        r4 = 1;
        goto L_0x09cd;
    L_0x09cc:
        r4 = 0;
    L_0x09cd:
        r8 = "appsFlyerInAppEventCount";
        r4 = a(r13, r8, r4);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r7, r4);	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x0a00;
    L_0x09dc:
        r4 = 1;
        if (r5 != r4) goto L_0x0a00;
    L_0x09df:
        r4 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r4.dz();	 Catch:{ Throwable -> 0x0bf5 }
        r4 = "waitForCustomerId";
        r7 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r8 = 0;
        r4 = r7.getBoolean(r4, r8);	 Catch:{ Throwable -> 0x0bf5 }
        if (r4 == 0) goto L_0x0a00;
    L_0x09f4:
        r4 = "wait_cid";
        r15 = 1;
        r7 = java.lang.Boolean.toString(r15);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r4, r7);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0a01;
    L_0x0a00:
        r15 = 1;
    L_0x0a01:
        r4 = "isFirstCall";
        if (r3 != 0) goto L_0x0a06;
    L_0x0a05:
        goto L_0x0a07;
    L_0x0a06:
        r15 = 0;
    L_0x0a07:
        r3 = java.lang.Boolean.toString(r15);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r4, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new java.util.HashMap;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r4 = "cpu_abi";
        r7 = "ro.product.cpu.abi";
        r7 = R(r7);	 Catch:{ Throwable -> 0x0bf5 }
        r3.put(r4, r7);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = "cpu_abi2";
        r7 = "ro.product.cpu.abi2";
        r7 = R(r7);	 Catch:{ Throwable -> 0x0bf5 }
        r3.put(r4, r7);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = "arch";
        r7 = "os.arch";
        r7 = R(r7);	 Catch:{ Throwable -> 0x0bf5 }
        r3.put(r4, r7);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = "build_display_id";
        r7 = "ro.build.display.id";
        r7 = R(r7);	 Catch:{ Throwable -> 0x0bf5 }
        r3.put(r4, r7);	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x0abe;
    L_0x0a41:
        r1 = r6.lA;	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x0a86;
    L_0x0a45:
        r1 = com.appsflyer.u.a.mp;	 Catch:{ Throwable -> 0x0bf5 }
        r1 = com.appsflyer.u.y(r25);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = new java.util.HashMap;	 Catch:{ Throwable -> 0x0bf5 }
        r7 = 3;
        r4.<init>(r7);	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x0a7b;
    L_0x0a53:
        r7 = "lat";
        r8 = r1.getLatitude();	 Catch:{ Throwable -> 0x0bf5 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ Throwable -> 0x0bf5 }
        r4.put(r7, r8);	 Catch:{ Throwable -> 0x0bf5 }
        r7 = "lon";
        r8 = r1.getLongitude();	 Catch:{ Throwable -> 0x0bf5 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ Throwable -> 0x0bf5 }
        r4.put(r7, r8);	 Catch:{ Throwable -> 0x0bf5 }
        r7 = "ts";
        r8 = r1.getTime();	 Catch:{ Throwable -> 0x0bf5 }
        r1 = java.lang.String.valueOf(r8);	 Catch:{ Throwable -> 0x0bf5 }
        r4.put(r7, r1);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0a7b:
        r1 = r4.isEmpty();	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 != 0) goto L_0x0a86;
    L_0x0a81:
        r1 = "loc";
        r3.put(r1, r4);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0a86:
        r1 = com.appsflyer.v.a.mr;	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r1.z(r2);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = "btl";
        r7 = r1.dF();	 Catch:{ Throwable -> 0x0bf5 }
        r7 = java.lang.Float.toString(r7);	 Catch:{ Throwable -> 0x0bf5 }
        r3.put(r4, r7);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = r1.dG();	 Catch:{ Throwable -> 0x0bf5 }
        if (r4 == 0) goto L_0x0aa8;
    L_0x0a9f:
        r4 = "btch";
        r1 = r1.dG();	 Catch:{ Throwable -> 0x0bf5 }
        r3.put(r4, r1);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0aa8:
        r1 = 2;
        if (r1 < r5) goto L_0x0abe;
    L_0x0aab:
        r1 = com.appsflyer.ab.D(r25);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r1.dP();	 Catch:{ Throwable -> 0x0bf5 }
        r4 = r1.isEmpty();	 Catch:{ Throwable -> 0x0bf5 }
        if (r4 != 0) goto L_0x0abe;
    L_0x0ab9:
        r4 = "sensors";
        r3.put(r4, r1);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0abe:
        r1 = com.appsflyer.f.i(r25);	 Catch:{ Throwable -> 0x0bf5 }
        r4 = "dim";
        r3.put(r4, r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "deviceData";
        r12.put(r1, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = new com.appsflyer.ae;	 Catch:{ Throwable -> 0x0bf5 }
        r1.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r21;
        r3 = r12.get(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = (java.lang.String) r3;	 Catch:{ Throwable -> 0x0bf5 }
        r4 = r19;
        r5 = r12.get(r4);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = (java.lang.String) r5;	 Catch:{ Throwable -> 0x0bf5 }
        r7 = "uid";
        r7 = r12.get(r7);	 Catch:{ Throwable -> 0x0bf5 }
        r7 = (java.lang.String) r7;	 Catch:{ Throwable -> 0x0bf5 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r8.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r9 = 7;
        r10 = 0;
        r3 = r3.substring(r10, r9);	 Catch:{ Throwable -> 0x0bf5 }
        r8.append(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = 7;
        r3 = r7.substring(r10, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r8.append(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r5.length();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r3 + -7;
        r3 = r5.substring(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r8.append(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = r8.toString();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = com.appsflyer.ae.U(r3);	 Catch:{ Throwable -> 0x0bf5 }
        r5 = "af_v";
        r12.put(r5, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new com.appsflyer.ae;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r12.get(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = (java.lang.String) r1;	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r12.get(r4);	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "uid";
        r1 = r12.get(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "installDate";
        r1 = r12.get(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "counter";
        r1 = r12.get(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0bf5 }
        r3.<init>();	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "iaecounter";
        r1 = r12.get(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r3.append(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = r3.toString();	 Catch:{ Throwable -> 0x0bf5 }
        r1 = com.appsflyer.ae.ab(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = com.appsflyer.ae.U(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r3 = "af_v2";
        r12.put(r3, r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = s(r25);	 Catch:{ Throwable -> 0x0bf5 }
        r2 = "ivc";
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r2, r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "is_stop_tracking_used";
        r1 = r13.contains(r1);	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x0bbf;
    L_0x0baf:
        r1 = "istu";
        r2 = "is_stop_tracking_used";
        r3 = 0;
        r2 = r13.getBoolean(r2, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ Throwable -> 0x0bf5 }
        r12.put(r1, r2);	 Catch:{ Throwable -> 0x0bf5 }
    L_0x0bbf:
        r1 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r2 = "consumeAfDeepLink";
        r1 = r1.getObject(r2);	 Catch:{ Throwable -> 0x0bf5 }
        if (r1 == 0) goto L_0x0c02;
    L_0x0bcb:
        r1 = com.appsflyer.m.dw();	 Catch:{ Throwable -> 0x0bf5 }
        r2 = "consumeAfDeepLink";
        r3 = 0;
        r1 = r1.getBoolean(r2, r3);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r2 = "is_dp_api";
        r12.put(r2, r1);	 Catch:{ Throwable -> 0x0bf5 }
        goto L_0x0c02;
    L_0x0be0:
        r6 = r24;
        r1 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ";
        com.appsflyer.AFLogger.J(r1);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "AppsFlyer_4.9.0";
        r3 = "DEV_KEY_MISSING";
        r4 = 0;
        a(r2, r1, r3, r4);	 Catch:{ Throwable -> 0x0bf5 }
        r1 = "AppsFlyer will not track this event.";
        com.appsflyer.AFLogger.J(r1);	 Catch:{ Throwable -> 0x0bf5 }
        return r4;
    L_0x0bf5:
        r0 = move-exception;
        goto L_0x0bfa;
    L_0x0bf7:
        r0 = move-exception;
        r6 = r24;
    L_0x0bfa:
        r1 = r0;
        r2 = r1.getLocalizedMessage();
        com.appsflyer.AFLogger.c(r2, r1);
    L_0x0c02:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.j.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, android.content.SharedPreferences, boolean, android.content.Intent, java.lang.String):java.util.Map");
    }

    private static void a(Context context, Map<String, ? super String> map) {
        aa aaVar = b.mD;
        a C = aa.C(context);
        map.put("network", C.dD());
        if (C.dk() != null) {
            map.put("operator", C.dk());
        }
        if (C.dl() != null) {
            map.put("carrier", C.dl());
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(Context context, Map<String, Object> map, Uri uri) {
        Map l;
        Object obj = uri.toString();
        boolean z = true;
        if (obj == null) {
            obj = null;
        } else {
            Matcher matcher = Pattern.compile("fb\\d*?://authorize.*access_token=([^&]*)").matcher(obj);
            if (matcher.find()) {
                String str = "";
                obj = new StringBuilder(obj).replace(matcher.start(1), matcher.end(1), str).toString().replaceFirst("&access_token=", str).replaceFirst("access_token=&", str).replaceFirst("access_token=", str);
            }
        }
        String str2 = "af_deeplink";
        if (!map.containsKey(str2)) {
            map.put(str2, obj);
        }
        if (uri.getQueryParameter(str2) != null) {
            String queryParameter = uri.getQueryParameter("media_source");
            String queryParameter2 = uri.getQueryParameter("is_retargeting");
            if (!("AppsFlyer_Test".equals(queryParameter) && Boolean.parseBoolean(queryParameter2))) {
                z = false;
            }
            this.lB = z;
            l = l(context, uri.getQuery());
            queryParameter2 = uri.getPath();
            if (queryParameter2 != null) {
                l.put("path", queryParameter2);
            }
            queryParameter2 = uri.getScheme();
            if (queryParameter2 != null) {
                l.put("scheme", queryParameter2);
            }
            queryParameter2 = uri.getHost();
            if (queryParameter2 != null) {
                l.put("host", queryParameter2);
            }
        } else {
            l = new HashMap();
            l.put("link", uri.toString());
        }
        final WeakReference weakReference = new WeakReference(context);
        ah ahVar = new ah(uri, this);
        ahVar.a(new com.appsflyer.s.a());
        if (ahVar.dL()) {
            ahVar.a(new a() {
                public final void H(String str) {
                    if (j.lk != null) {
                        h(l);
                        j.lk.M(str);
                    }
                }

                private void h(Map<String, String> map) {
                    if (weakReference.get() != null) {
                        j.a((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                    }
                }

                public final void g(Map<String, String> map) {
                    for (String str : map.keySet()) {
                        l.put(str, map.get(str));
                    }
                    h(l);
                    j.g(l);
                }
            });
            c.dd().df().execute(ahVar);
            return;
        }
        h hVar = lk;
        if (hVar != null) {
            try {
                hVar.e(l);
            } catch (Throwable th) {
                AFLogger.c(th.getLocalizedMessage(), th);
            }
        }
    }

    private static boolean l(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.c("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (NameNotFoundException e) {
            AFLogger.c("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    private static boolean m(Context context) {
        Object obj = (m.dw().getBoolean("collectAndroidIdForceByUser", false) || m.dw().getBoolean("collectIMEIForceByUser", false)) ? 1 : null;
        if (obj == null && l(context)) {
            return false;
        }
        return true;
    }

    private static String n(Context context) {
        String string = m.dw().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String a = a(new WeakReference(context), "AF_STORE");
        return a != null ? a : null;
    }

    private static String R(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.c(th.getMessage(), th);
            return null;
        }
    }

    @Nullable
    private static String a(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return a(str, ((Context) weakReference.get()).getPackageManager(), ((Context) weakReference.get()).getPackageName());
    }

    @Nullable
    private static String a(String str, PackageManager packageManager, String str2) {
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, 128).metaData;
            if (bundle == null) {
                return null;
            }
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Could not find ");
            stringBuilder.append(str);
            stringBuilder.append(" value in the manifest");
            AFLogger.c(stringBuilder.toString(), th);
            return null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0042=Splitter:B:24:0x0042, B:15:0x002b=Splitter:B:15:0x002b} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A:{SYNTHETIC, Splitter:B:18:0x0034} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A:{SYNTHETIC, Splitter:B:32:0x0060} */
    private static java.lang.String b(java.io.File r4, java.lang.String r5) {
        /*
        r0 = 0;
        r1 = new java.util.Properties;	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r2 = new java.io.FileReader;	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r2.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r1.load(r2);	 Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
        r3 = "Found PreInstall property!";
        com.appsflyer.AFLogger.J(r3);	 Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
        r4 = r1.getProperty(r5);	 Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
        r2.close();	 Catch:{ Throwable -> 0x001b }
        goto L_0x0023;
    L_0x001b:
        r5 = move-exception;
        r0 = r5.getMessage();
        com.appsflyer.AFLogger.c(r0, r5);
    L_0x0023:
        return r4;
    L_0x0024:
        r4 = move-exception;
        goto L_0x002b;
    L_0x0026:
        r4 = move-exception;
        r2 = r0;
        goto L_0x005e;
    L_0x0029:
        r4 = move-exception;
        r2 = r0;
    L_0x002b:
        r5 = r4.getMessage();	 Catch:{ all -> 0x005d }
        com.appsflyer.AFLogger.c(r5, r4);	 Catch:{ all -> 0x005d }
        if (r2 == 0) goto L_0x005c;
    L_0x0034:
        r2.close();	 Catch:{ Throwable -> 0x0038 }
        goto L_0x005c;
    L_0x0038:
        r4 = move-exception;
        r5 = r4.getMessage();
        com.appsflyer.AFLogger.c(r5, r4);
        goto L_0x005c;
    L_0x0041:
        r2 = r0;
    L_0x0042:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005d }
        r1 = "PreInstall file wasn't found: ";
        r5.<init>(r1);	 Catch:{ all -> 0x005d }
        r4 = r4.getAbsolutePath();	 Catch:{ all -> 0x005d }
        r5.append(r4);	 Catch:{ all -> 0x005d }
        r4 = r5.toString();	 Catch:{ all -> 0x005d }
        com.appsflyer.AFLogger.I(r4);	 Catch:{ all -> 0x005d }
        if (r2 == 0) goto L_0x005c;
    L_0x0059:
        r2.close();	 Catch:{ Throwable -> 0x0038 }
    L_0x005c:
        return r0;
    L_0x005d:
        r4 = move-exception;
    L_0x005e:
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2.close();	 Catch:{ Throwable -> 0x0064 }
        goto L_0x006c;
    L_0x0064:
        r5 = move-exception;
        r0 = r5.getMessage();
        com.appsflyer.AFLogger.c(r0, r5);
    L_0x006c:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.j.b(java.io.File, java.lang.String):java.lang.String");
    }

    private static File S(String str) {
        if (str != null) {
            try {
                if (str.trim().length() > 0) {
                    return new File(str.trim());
                }
            } catch (Throwable th) {
                AFLogger.c(th.getMessage(), th);
            }
        }
        return null;
    }

    @Nullable
    private static String b(WeakReference<Context> weakReference) {
        Object string = m.dw().getString("channel");
        if (string == null) {
            string = a((WeakReference) weakReference, "CHANNEL");
        }
        return (string == null || !string.equals("")) ? string : null;
    }

    public boolean o(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            AFLogger.c("Could not check if app is pre installed", e);
        }
    }

    private static String m(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        String str2 = "CACHED_CHANNEL";
        if (sharedPreferences.contains(str2)) {
            return sharedPreferences.getString(str2, null);
        }
        a(context, str2, str);
        return str;
    }

    public String a(ContentResolver contentResolver) {
        String str = "aid";
        String[] strArr = new String[]{str};
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), strArr, null, null, null);
        String str2 = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str2 = query.getString(query.getColumnIndex(str));
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e) {
                            AFLogger.c(e.getMessage(), e);
                        }
                    }
                    return str2;
                }
            } catch (Exception e2) {
                AFLogger.c("Could not collect cursor attribution. ", e2);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e3) {
                        AFLogger.c(e3.getMessage(), e3);
                    }
                }
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Exception e32) {
                AFLogger.c(e32.getMessage(), e32);
            }
        }
        return null;
    }

    static SharedPreferences p(Context context) {
        return context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
    }

    static int a(SharedPreferences sharedPreferences) {
        return a(sharedPreferences, "appsFlyerCount", false);
    }

    private static int a(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
        if (ag.dT().dX()) {
            ag.dT().E(String.valueOf(i));
        }
        return i;
    }

    public String q(Context context) {
        ag.dT().a("getAppsFlyerUID", new String[0]);
        return af.e(new WeakReference(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0236 A:{Catch:{ k -> 0x020f, all -> 0x0234 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0228 A:{SYNTHETIC, Splitter:B:102:0x0228} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0244  */
    private void a(java.net.URL r21, java.lang.String r22, java.lang.String r23, java.lang.ref.WeakReference<android.content.Context> r24, java.lang.String r25, boolean r26) {
        /*
        r20 = this;
        r1 = r20;
        r0 = r22;
        r2 = r23;
        r3 = r25;
        r4 = "is_first_launch";
        r5 = "appsflyerConversionDataCacheExpiration";
        r6 = r24.get();
        r6 = (android.content.Context) r6;
        r7 = 1;
        r8 = 0;
        if (r26 == 0) goto L_0x001c;
    L_0x0016:
        r9 = lk;
        if (r9 == 0) goto L_0x001c;
    L_0x001a:
        r9 = 1;
        goto L_0x001d;
    L_0x001c:
        r9 = 0;
    L_0x001d:
        r10 = 0;
        r11 = com.appsflyer.ag.dT();	 Catch:{ all -> 0x023e }
        r12 = r21.toString();	 Catch:{ all -> 0x023e }
        r11.l(r12, r0);	 Catch:{ all -> 0x023e }
        r11 = r21.openConnection();	 Catch:{ all -> 0x023e }
        r11 = (java.net.HttpURLConnection) r11;	 Catch:{ all -> 0x023e }
        r12 = "POST";
        r11.setRequestMethod(r12);	 Catch:{ all -> 0x023a }
        r12 = r22.getBytes();	 Catch:{ all -> 0x023a }
        r12 = r12.length;	 Catch:{ all -> 0x023a }
        r13 = "Content-Length";
        r12 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x023a }
        r11.setRequestProperty(r13, r12);	 Catch:{ all -> 0x023a }
        r12 = "Content-Type";
        r13 = "application/json";
        r11.setRequestProperty(r12, r13);	 Catch:{ all -> 0x023a }
        r12 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r11.setConnectTimeout(r12);	 Catch:{ all -> 0x023a }
        r11.setDoOutput(r7);	 Catch:{ all -> 0x023a }
        r12 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x0222 }
        r13 = r11.getOutputStream();	 Catch:{ all -> 0x0222 }
        r14 = "UTF-8";
        r12.<init>(r13, r14);	 Catch:{ all -> 0x0222 }
        r12.write(r0);	 Catch:{ all -> 0x021d }
        r12.close();	 Catch:{ all -> 0x023a }
        r0 = r11.getResponseCode();	 Catch:{ all -> 0x023a }
        r12 = c(r11);	 Catch:{ all -> 0x023a }
        r13 = com.appsflyer.ag.dT();	 Catch:{ all -> 0x023a }
        r14 = r21.toString();	 Catch:{ all -> 0x023a }
        r13.a(r14, r0, r12);	 Catch:{ all -> 0x023a }
        r13 = "response code: ";
        r14 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x023a }
        r13 = r13.concat(r14);	 Catch:{ all -> 0x023a }
        com.appsflyer.AFLogger.J(r13);	 Catch:{ all -> 0x023a }
        r13 = "AppsFlyer_4.9.0";
        r14 = "SERVER_RESPONSE_CODE";
        r15 = java.lang.Integer.toString(r0);	 Catch:{ all -> 0x023a }
        a(r6, r13, r14, r15);	 Catch:{ all -> 0x023a }
        r13 = r6.getApplicationContext();	 Catch:{ all -> 0x023a }
        r14 = "appsflyer-data";
        r13 = r13.getSharedPreferences(r14, r8);	 Catch:{ all -> 0x023a }
        r14 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 != r14) goto L_0x0168;
    L_0x009b:
        r0 = r24.get();	 Catch:{ all -> 0x023a }
        if (r0 == 0) goto L_0x00b2;
    L_0x00a1:
        if (r26 == 0) goto L_0x00b2;
    L_0x00a3:
        r14 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x023a }
        r1.lg = r14;	 Catch:{ all -> 0x023a }
        r0 = lm;	 Catch:{ all -> 0x023a }
        if (r0 == 0) goto L_0x00b2;
    L_0x00ad:
        r0 = lm;	 Catch:{ all -> 0x023a }
        r0.dC();	 Catch:{ all -> 0x023a }
    L_0x00b2:
        r0 = "afUninstallToken";
        r14 = com.appsflyer.m.dw();	 Catch:{ all -> 0x023a }
        r0 = r14.getString(r0);	 Catch:{ all -> 0x023a }
        if (r0 == 0) goto L_0x00e9;
    L_0x00be:
        r14 = "Uninstall Token exists: ";
        r15 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x023a }
        r14 = r14.concat(r15);	 Catch:{ all -> 0x023a }
        com.appsflyer.AFLogger.I(r14);	 Catch:{ all -> 0x023a }
        r14 = "sentRegisterRequestToAF";
        r14 = r13.getBoolean(r14, r8);	 Catch:{ all -> 0x023a }
        if (r14 != 0) goto L_0x0109;
    L_0x00d3:
        r14 = "Resending Uninstall token to AF servers: ";
        r15 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x023a }
        r14 = r14.concat(r15);	 Catch:{ all -> 0x023a }
        com.appsflyer.AFLogger.I(r14);	 Catch:{ all -> 0x023a }
        r14 = new com.appsflyer.a$e$a;	 Catch:{ all -> 0x023a }
        r14.<init>(r0);	 Catch:{ all -> 0x023a }
        com.appsflyer.ai.a(r6, r14);	 Catch:{ all -> 0x023a }
        goto L_0x0109;
    L_0x00e9:
        r0 = "gcmProjectNumber";
        r14 = com.appsflyer.m.dw();	 Catch:{ all -> 0x023a }
        r0 = r14.getString(r0);	 Catch:{ all -> 0x023a }
        if (r0 == 0) goto L_0x0109;
    L_0x00f5:
        r0 = "GCM Project number exists. Fetching token and sending to AF servers";
        com.appsflyer.AFLogger.I(r0);	 Catch:{ all -> 0x023a }
        r0 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x023a }
        r0.<init>(r6);	 Catch:{ all -> 0x023a }
        r14 = new com.appsflyer.ai$a;	 Catch:{ all -> 0x023a }
        r14.<init>(r0);	 Catch:{ all -> 0x023a }
        r0 = new java.lang.Void[r8];	 Catch:{ all -> 0x023a }
        r14.execute(r0);	 Catch:{ all -> 0x023a }
    L_0x0109:
        r0 = r1.ly;	 Catch:{ all -> 0x023a }
        if (r0 == 0) goto L_0x010f;
    L_0x010d:
        r1.ly = r10;	 Catch:{ all -> 0x023a }
    L_0x010f:
        if (r3 == 0) goto L_0x0118;
    L_0x0111:
        r0 = com.appsflyer.a.a.dH();	 Catch:{ all -> 0x023a }
        r0.a(r3, r6);	 Catch:{ all -> 0x023a }
    L_0x0118:
        r0 = r24.get();	 Catch:{ all -> 0x023a }
        if (r0 == 0) goto L_0x0159;
    L_0x011e:
        if (r3 != 0) goto L_0x0159;
    L_0x0120:
        r0 = "sentSuccessfully";
        r3 = "true";
        a(r6, r0, r3);	 Catch:{ all -> 0x023a }
        r0 = r1.lp;	 Catch:{ all -> 0x023a }
        if (r0 != 0) goto L_0x0159;
    L_0x012c:
        r14 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x023a }
        r16 = r11;
        r10 = r1.lq;	 Catch:{ all -> 0x0234 }
        r14 = r14 - r10;
        r10 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x013c;
    L_0x013b:
        goto L_0x015b;
    L_0x013c:
        r0 = r1.lr;	 Catch:{ all -> 0x0234 }
        if (r0 != 0) goto L_0x015b;
    L_0x0140:
        r0 = com.appsflyer.c.dd();	 Catch:{ all -> 0x0234 }
        r0 = r0.dg();	 Catch:{ all -> 0x0234 }
        r1.lr = r0;	 Catch:{ all -> 0x0234 }
        r0 = new com.appsflyer.j$c;	 Catch:{ all -> 0x0234 }
        r0.<init>(r6);	 Catch:{ all -> 0x0234 }
        r10 = r1.lr;	 Catch:{ all -> 0x0234 }
        r14 = 1;
        r11 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0234 }
        a(r10, r0, r14, r11);	 Catch:{ all -> 0x0234 }
        goto L_0x015b;
    L_0x0159:
        r16 = r11;
    L_0x015b:
        r0 = com.appsflyer.t.X(r12);	 Catch:{ all -> 0x0234 }
        r10 = "send_background";
        r0 = r0.optBoolean(r10, r8);	 Catch:{ all -> 0x0234 }
        r1.lG = r0;	 Catch:{ all -> 0x0234 }
        goto L_0x017d;
    L_0x0168:
        r16 = r11;
        r10 = lm;	 Catch:{ all -> 0x0234 }
        if (r10 == 0) goto L_0x017d;
    L_0x016e:
        r10 = "Failure: ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0234 }
        r0 = r10.concat(r0);	 Catch:{ all -> 0x0234 }
        r10 = lm;	 Catch:{ all -> 0x0234 }
        r10.V(r0);	 Catch:{ all -> 0x0234 }
    L_0x017d:
        r0 = "appsflyerConversionDataRequestRetries";
        r0 = r13.getInt(r0, r8);	 Catch:{ all -> 0x0234 }
        r10 = 0;
        r14 = r13.getLong(r5, r10);	 Catch:{ all -> 0x0234 }
        r12 = "attributionId";
        r17 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r17 == 0) goto L_0x01a5;
    L_0x018f:
        r17 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0234 }
        r17 = r17 - r14;
        r14 = 5184000000; // 0x134fd9000 float:4.7229696E-7 double:2.561236308E-314;
        r19 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1));
        if (r19 <= 0) goto L_0x01a5;
    L_0x019e:
        r3 = 0;
        a(r6, r12, r3);	 Catch:{ all -> 0x0234 }
        a(r6, r5, r10);	 Catch:{ all -> 0x0234 }
    L_0x01a5:
        r3 = 0;
        r5 = r13.getString(r12, r3);	 Catch:{ all -> 0x0234 }
        if (r5 != 0) goto L_0x01d0;
    L_0x01ac:
        if (r2 == 0) goto L_0x01d0;
    L_0x01ae:
        if (r9 == 0) goto L_0x01d0;
    L_0x01b0:
        r5 = lk;	 Catch:{ all -> 0x0234 }
        if (r5 == 0) goto L_0x01d0;
    L_0x01b4:
        r5 = 5;
        if (r0 > r5) goto L_0x01d0;
    L_0x01b7:
        r0 = com.appsflyer.c.dd();	 Catch:{ all -> 0x0234 }
        r0 = r0.dg();	 Catch:{ all -> 0x0234 }
        r3 = new com.appsflyer.j$e;	 Catch:{ all -> 0x0234 }
        r4 = r6.getApplicationContext();	 Catch:{ all -> 0x0234 }
        r3.<init>(r4, r2, r0);	 Catch:{ all -> 0x0234 }
        r4 = 10;
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0234 }
        a(r0, r3, r4, r2);	 Catch:{ all -> 0x0234 }
        goto L_0x0217;
    L_0x01d0:
        if (r2 != 0) goto L_0x01d8;
    L_0x01d2:
        r0 = "AppsFlyer dev key is missing.";
        com.appsflyer.AFLogger.K(r0);	 Catch:{ all -> 0x0234 }
        goto L_0x0217;
    L_0x01d8:
        if (r9 == 0) goto L_0x0217;
    L_0x01da:
        r0 = lk;	 Catch:{ all -> 0x0234 }
        if (r0 == 0) goto L_0x0217;
    L_0x01de:
        r2 = 0;
        r0 = r13.getString(r12, r2);	 Catch:{ all -> 0x0234 }
        if (r0 == 0) goto L_0x0217;
    L_0x01e5:
        r0 = "appsFlyerCount";
        r0 = a(r13, r0, r8);	 Catch:{ all -> 0x0234 }
        if (r0 <= r7) goto L_0x0217;
    L_0x01ed:
        r0 = k(r6);	 Catch:{ k -> 0x020f }
        if (r0 == 0) goto L_0x0217;
    L_0x01f3:
        r2 = r0.containsKey(r4);	 Catch:{ Throwable -> 0x0206 }
        if (r2 != 0) goto L_0x0200;
    L_0x01f9:
        r2 = java.lang.Boolean.toString(r8);	 Catch:{ Throwable -> 0x0206 }
        r0.put(r4, r2);	 Catch:{ Throwable -> 0x0206 }
    L_0x0200:
        r2 = lk;	 Catch:{ Throwable -> 0x0206 }
        r2.d(r0);	 Catch:{ Throwable -> 0x0206 }
        goto L_0x0217;
    L_0x0206:
        r0 = move-exception;
        r2 = r0.getLocalizedMessage();	 Catch:{ k -> 0x020f }
        com.appsflyer.AFLogger.c(r2, r0);	 Catch:{ k -> 0x020f }
        goto L_0x0217;
    L_0x020f:
        r0 = move-exception;
        r2 = r0.getMessage();	 Catch:{ all -> 0x0234 }
        com.appsflyer.AFLogger.c(r2, r0);	 Catch:{ all -> 0x0234 }
    L_0x0217:
        if (r16 == 0) goto L_0x021c;
    L_0x0219:
        r16.disconnect();
    L_0x021c:
        return;
    L_0x021d:
        r0 = move-exception;
        r16 = r11;
        r2 = r12;
        goto L_0x0226;
    L_0x0222:
        r0 = move-exception;
        r2 = r10;
        r16 = r11;
    L_0x0226:
        if (r2 != 0) goto L_0x0236;
    L_0x0228:
        r2 = lm;	 Catch:{ all -> 0x0234 }
        if (r2 == 0) goto L_0x0239;
    L_0x022c:
        r2 = lm;	 Catch:{ all -> 0x0234 }
        r3 = "No Connectivity";
        r2.V(r3);	 Catch:{ all -> 0x0234 }
        goto L_0x0239;
    L_0x0234:
        r0 = move-exception;
        goto L_0x0242;
    L_0x0236:
        r2.close();	 Catch:{ all -> 0x0234 }
    L_0x0239:
        throw r0;	 Catch:{ all -> 0x0234 }
    L_0x023a:
        r0 = move-exception;
        r16 = r11;
        goto L_0x0242;
    L_0x023e:
        r0 = move-exception;
        r2 = r10;
        r16 = r2;
    L_0x0242:
        if (r16 == 0) goto L_0x0247;
    L_0x0244:
        r16.disconnect();
    L_0x0247:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.j.a(java.net.URL, java.lang.String, java.lang.String, java.lang.ref.WeakReference, java.lang.String, boolean):void");
    }

    private static void a(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!(scheduledExecutorService.isShutdown() || scheduledExecutorService.isTerminated())) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.c("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.c("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.K("scheduler is null, shut downed or terminated");
    }

    public void f(Map<String, String> map) {
        this.lo = map;
    }

    public boolean ds() {
        return this.lH;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A:{SYNTHETIC, Splitter:B:28:0x005a} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087 A:{SYNTHETIC, Splitter:B:46:0x0087} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c A:{Catch:{ Throwable -> 0x008f }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087 A:{SYNTHETIC, Splitter:B:46:0x0087} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c A:{Catch:{ Throwable -> 0x008f }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A:{SYNTHETIC, Splitter:B:28:0x005a} */
    /* JADX WARNING: Missing block: B:30:0x005d, code skipped:
            if (r3 != null) goto L_0x002c;
     */
    @androidx.annotation.NonNull
    static java.lang.String c(java.net.HttpURLConnection r7) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 0;
        r2 = r7.getErrorStream();	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        if (r2 != 0) goto L_0x0010;
    L_0x000c:
        r2 = r7.getInputStream();	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
    L_0x0010:
        r3 = new java.io.InputStreamReader;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r3.<init>(r2);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r2 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x0038 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0038 }
    L_0x001a:
        r1 = r2.readLine();	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
        if (r1 == 0) goto L_0x0029;
    L_0x0020:
        r0.append(r1);	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
        r1 = 10;
        r0.append(r1);	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
        goto L_0x001a;
    L_0x0029:
        r2.close();	 Catch:{ Throwable -> 0x0060 }
    L_0x002c:
        r3.close();	 Catch:{ Throwable -> 0x0060 }
        goto L_0x0060;
    L_0x0030:
        r7 = move-exception;
        r1 = r2;
        goto L_0x0085;
    L_0x0033:
        r1 = move-exception;
        r6 = r2;
        r2 = r1;
        r1 = r6;
        goto L_0x003f;
    L_0x0038:
        r2 = move-exception;
        goto L_0x003f;
    L_0x003a:
        r7 = move-exception;
        r3 = r1;
        goto L_0x0085;
    L_0x003d:
        r2 = move-exception;
        r3 = r1;
    L_0x003f:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0084 }
        r5 = "Could not read connection response from: ";
        r4.<init>(r5);	 Catch:{ all -> 0x0084 }
        r7 = r7.getURL();	 Catch:{ all -> 0x0084 }
        r7 = r7.toString();	 Catch:{ all -> 0x0084 }
        r4.append(r7);	 Catch:{ all -> 0x0084 }
        r7 = r4.toString();	 Catch:{ all -> 0x0084 }
        com.appsflyer.AFLogger.c(r7, r2);	 Catch:{ all -> 0x0084 }
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r1.close();	 Catch:{ Throwable -> 0x0060 }
    L_0x005d:
        if (r3 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x002c;
    L_0x0060:
        r7 = r0.toString();
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x006a }
        r0.<init>(r7);	 Catch:{ JSONException -> 0x006a }
        return r7;
    L_0x006a:
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "string_response";
        r0.put(r1, r7);	 Catch:{ JSONException -> 0x007a }
        r7 = r0.toString();	 Catch:{ JSONException -> 0x007a }
        return r7;
    L_0x007a:
        r7 = new org.json.JSONObject;
        r7.<init>();
        r7 = r7.toString();
        return r7;
    L_0x0084:
        r7 = move-exception;
    L_0x0085:
        if (r1 == 0) goto L_0x008a;
    L_0x0087:
        r1.close();	 Catch:{ Throwable -> 0x008f }
    L_0x008a:
        if (r3 == 0) goto L_0x008f;
    L_0x008c:
        r3.close();	 Catch:{ Throwable -> 0x008f }
    L_0x008f:
        goto L_0x0091;
    L_0x0090:
        throw r7;
    L_0x0091:
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.j.c(java.net.HttpURLConnection):java.lang.String");
    }

    private static float r(Context context) {
        float f;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            f = (((float) intExtra) / ((float) intExtra2)) * 100.0f;
            return f;
        } catch (Throwable th) {
            AFLogger.c(th.getMessage(), th);
            f = 1.0f;
        }
    }

    private static boolean s(Context context) {
        if (context != null) {
            String str = "Failed collecting ivc data";
            if (VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.c(str, e);
                }
            } else if (VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.c(str, e2);
                }
            }
        }
        return false;
    }

    public String getHostName() {
        String string = m.dw().getString("custom_host");
        return string != null ? string : "appsflyer.com";
    }

    public String dt() {
        String string = m.dw().getString("custom_host_prefix");
        return string != null ? string : "";
    }

    private static void a(Context context, String str, String str2) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putString(str, str2);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    private static void b(Context context, String str, int i) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putInt(str, i);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    private static void a(Context context, String str, long j) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putLong(str, j);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }
}
