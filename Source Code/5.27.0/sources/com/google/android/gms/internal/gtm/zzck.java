package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;

final class zzck extends zzan {
    private static final byte[] zzabr = "\n".getBytes();
    private final String zzabp;
    private final zzcv zzabq;

    zzck(zzap zzap) {
        super(zzap);
        String str = zzao.VERSION;
        String str2 = VERSION.RELEASE;
        String zza = zzcz.zza(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        this.zzabp = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", str, str2, zza, str3, str4});
        this.zzabq = new zzcv(zzap.zzcn());
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        zza("Network initialized. User agent", this.zzabp);
    }

    public final boolean zzfr() {
        NetworkInfo activeNetworkInfo;
        zzk.zzav();
        zzdb();
        try {
            activeNetworkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzq("No network connectivity");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b5 A:{SYNTHETIC, EDGE_INSN: B:71:0x01b5->B:67:0x01b5 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Missing block: B:51:0x0159, code skipped:
            if (zza(r5) == 200) goto L_0x0135;
     */
    /* JADX WARNING: Missing block: B:63:0x019b, code skipped:
            if (zza(r6, r5) == 200) goto L_0x0135;
     */
    public final java.util.List<java.lang.Long> zzb(java.util.List<com.google.android.gms.internal.gtm.zzcd> r9) {
        /*
        r8 = this;
        com.google.android.gms.analytics.zzk.zzav();
        r8.zzdb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r9);
        r0 = r8.zzcp();
        r0 = r0.zzew();
        r0 = r0.isEmpty();
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0059;
    L_0x0019:
        r0 = r8.zzabq;
        r3 = com.google.android.gms.internal.gtm.zzby.zzaab;
        r3 = r3.get();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r3 = (long) r3;
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r3 * r5;
        r0 = r0.zzj(r3);
        if (r0 != 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0059;
    L_0x0033:
        r0 = com.google.android.gms.internal.gtm.zzby.zzzu;
        r0 = r0.get();
        r0 = (java.lang.String) r0;
        r0 = com.google.android.gms.internal.gtm.zzbg.zzz(r0);
        r3 = com.google.android.gms.internal.gtm.zzbg.NONE;
        if (r0 == r3) goto L_0x0045;
    L_0x0043:
        r0 = 1;
        goto L_0x0046;
    L_0x0045:
        r0 = 0;
    L_0x0046:
        r3 = com.google.android.gms.internal.gtm.zzby.zzzv;
        r3 = r3.get();
        r3 = (java.lang.String) r3;
        r3 = com.google.android.gms.internal.gtm.zzbm.zzaa(r3);
        r4 = com.google.android.gms.internal.gtm.zzbm.GZIP;
        if (r3 != r4) goto L_0x005a;
    L_0x0056:
        r3 = r0;
        r0 = 1;
        goto L_0x005c;
    L_0x0059:
        r0 = 0;
    L_0x005a:
        r3 = r0;
        r0 = 0;
    L_0x005c:
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 == 0) goto L_0x0105;
    L_0x0060:
        r1 = r9.isEmpty();
        r1 = r1 ^ r2;
        com.google.android.gms.common.internal.Preconditions.checkArgument(r1);
        r1 = java.lang.Boolean.valueOf(r0);
        r2 = r9.size();
        r2 = java.lang.Integer.valueOf(r2);
        r3 = "Uploading batched hits. compression, count";
        r8.zza(r3, r1, r2);
        r1 = new com.google.android.gms.internal.gtm.zzcl;
        r1.<init>(r8);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r9 = r9.iterator();
    L_0x0087:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x00a5;
    L_0x008d:
        r3 = r9.next();
        r3 = (com.google.android.gms.internal.gtm.zzcd) r3;
        r5 = r1.zze(r3);
        if (r5 == 0) goto L_0x00a5;
    L_0x0099:
        r5 = r3.zzfg();
        r3 = java.lang.Long.valueOf(r5);
        r2.add(r3);
        goto L_0x0087;
    L_0x00a5:
        r9 = r1.zzfu();
        if (r9 != 0) goto L_0x00ac;
    L_0x00ab:
        return r2;
    L_0x00ac:
        r9 = r8.zzfs();
        if (r9 != 0) goto L_0x00b8;
    L_0x00b2:
        r9 = "Failed to build batching endpoint url";
        r8.zzu(r9);
        goto L_0x0100;
    L_0x00b8:
        if (r0 == 0) goto L_0x00c3;
    L_0x00ba:
        r0 = r1.getPayload();
        r9 = r8.zzb(r9, r0);
        goto L_0x00cb;
    L_0x00c3:
        r0 = r1.getPayload();
        r9 = r8.zza(r9, r0);
    L_0x00cb:
        if (r4 != r9) goto L_0x00db;
    L_0x00cd:
        r9 = r1.zzfu();
        r9 = java.lang.Integer.valueOf(r9);
        r0 = "Batched upload completed. Hits batched";
        r8.zza(r0, r9);
        return r2;
    L_0x00db:
        r0 = java.lang.Integer.valueOf(r9);
        r1 = "Network error uploading hits. status code";
        r8.zza(r1, r0);
        r0 = r8.zzcp();
        r0 = r0.zzew();
        r9 = java.lang.Integer.valueOf(r9);
        r9 = r0.contains(r9);
        if (r9 == 0) goto L_0x0100;
    L_0x00f6:
        r9 = "Server instructed the client to stop batching";
        r8.zzt(r9);
        r9 = r8.zzabq;
        r9.start();
    L_0x0100:
        r9 = java.util.Collections.emptyList();
        return r9;
    L_0x0105:
        r0 = new java.util.ArrayList;
        r3 = r9.size();
        r0.<init>(r3);
        r9 = r9.iterator();
    L_0x0112:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x01b5;
    L_0x0118:
        r3 = r9.next();
        r3 = (com.google.android.gms.internal.gtm.zzcd) r3;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
        r5 = r3.zzfj();
        r5 = r5 ^ r2;
        r5 = r8.zza(r3, r5);
        if (r5 != 0) goto L_0x0137;
    L_0x012c:
        r5 = r8.zzco();
        r6 = "Error formatting hit for upload";
        r5.zza(r3, r6);
    L_0x0135:
        r5 = 1;
        goto L_0x019e;
    L_0x0137:
        r6 = r5.length();
        r7 = com.google.android.gms.internal.gtm.zzby.zzzt;
        r7 = r7.get();
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        if (r6 > r7) goto L_0x015e;
    L_0x0149:
        r5 = r8.zzb(r3, r5);
        if (r5 != 0) goto L_0x0155;
    L_0x014f:
        r5 = "Failed to build collect GET endpoint url";
        r8.zzu(r5);
        goto L_0x015c;
    L_0x0155:
        r5 = r8.zza(r5);
        if (r5 != r4) goto L_0x015c;
    L_0x015b:
        goto L_0x0135;
    L_0x015c:
        r5 = 0;
        goto L_0x019e;
    L_0x015e:
        r5 = r8.zza(r3, r1);
        if (r5 != 0) goto L_0x016e;
    L_0x0164:
        r5 = r8.zzco();
        r6 = "Error formatting hit for POST upload";
        r5.zza(r3, r6);
        goto L_0x0135;
    L_0x016e:
        r5 = r5.getBytes();
        r6 = r5.length;
        r7 = com.google.android.gms.internal.gtm.zzby.zzzy;
        r7 = r7.get();
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        if (r6 <= r7) goto L_0x018b;
    L_0x0181:
        r5 = r8.zzco();
        r6 = "Hit payload exceeds size limit";
        r5.zza(r3, r6);
        goto L_0x0135;
    L_0x018b:
        r6 = r8.zzd(r3);
        if (r6 != 0) goto L_0x0197;
    L_0x0191:
        r5 = "Failed to build collect POST endpoint url";
        r8.zzu(r5);
        goto L_0x015c;
    L_0x0197:
        r5 = r8.zza(r6, r5);
        if (r5 != r4) goto L_0x015c;
    L_0x019d:
        goto L_0x015b;
    L_0x019e:
        if (r5 == 0) goto L_0x01b5;
    L_0x01a0:
        r5 = r3.zzfg();
        r3 = java.lang.Long.valueOf(r5);
        r0.add(r3);
        r3 = r0.size();
        r5 = com.google.android.gms.internal.gtm.zzbq.zzer();
        if (r3 < r5) goto L_0x0112;
    L_0x01b5:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzb(java.util.List):java.util.List");
    }

    private final int zza(URL url) {
        Preconditions.checkNotNull(url);
        zzb("GET request", url);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = zzb(url);
            httpURLConnection.connect();
            zza(httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                zzcs().zzcl();
            }
            zzb("GET status", Integer.valueOf(responseCode));
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return responseCode;
        } catch (IOException e) {
            zzd("Network GET connection error", e);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return 0;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079 A:{SYNTHETIC, Splitter:B:28:0x0079} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b A:{SYNTHETIC, Splitter:B:38:0x008b} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    private final int zza(java.net.URL r5, byte[] r6) {
        /*
        r4 = this;
        r0 = "Error closing http post connection output stream";
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r6);
        r1 = r6.length;
        r1 = java.lang.Integer.valueOf(r1);
        r2 = "POST bytes, url";
        r4.zzb(r2, r1, r5);
        r1 = com.google.android.gms.internal.gtm.zzam.zzda();
        if (r1 == 0) goto L_0x0022;
    L_0x0018:
        r1 = new java.lang.String;
        r1.<init>(r6);
        r2 = "Post payload\n";
        r4.zza(r2, r1);
    L_0x0022:
        r1 = 0;
        r2 = r4.getContext();	 Catch:{ IOException -> 0x0070, all -> 0x006d }
        r2.getPackageName();	 Catch:{ IOException -> 0x0070, all -> 0x006d }
        r5 = r4.zzb(r5);	 Catch:{ IOException -> 0x0070, all -> 0x006d }
        r2 = 1;
        r5.setDoOutput(r2);	 Catch:{ IOException -> 0x006b }
        r2 = r6.length;	 Catch:{ IOException -> 0x006b }
        r5.setFixedLengthStreamingMode(r2);	 Catch:{ IOException -> 0x006b }
        r5.connect();	 Catch:{ IOException -> 0x006b }
        r1 = r5.getOutputStream();	 Catch:{ IOException -> 0x006b }
        r1.write(r6);	 Catch:{ IOException -> 0x006b }
        r4.zza(r5);	 Catch:{ IOException -> 0x006b }
        r6 = r5.getResponseCode();	 Catch:{ IOException -> 0x006b }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r6 != r2) goto L_0x0052;
    L_0x004b:
        r2 = r4.zzcs();	 Catch:{ IOException -> 0x006b }
        r2.zzcl();	 Catch:{ IOException -> 0x006b }
    L_0x0052:
        r2 = "POST status";
        r3 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x006b }
        r4.zzb(r2, r3);	 Catch:{ IOException -> 0x006b }
        if (r1 == 0) goto L_0x0065;
    L_0x005d:
        r1.close();	 Catch:{ IOException -> 0x0061 }
        goto L_0x0065;
    L_0x0061:
        r1 = move-exception;
        r4.zze(r0, r1);
    L_0x0065:
        if (r5 == 0) goto L_0x006a;
    L_0x0067:
        r5.disconnect();
    L_0x006a:
        return r6;
    L_0x006b:
        r6 = move-exception;
        goto L_0x0072;
    L_0x006d:
        r6 = move-exception;
        r5 = r1;
        goto L_0x0089;
    L_0x0070:
        r6 = move-exception;
        r5 = r1;
    L_0x0072:
        r2 = "Network POST connection error";
        r4.zzd(r2, r6);	 Catch:{ all -> 0x0088 }
        if (r1 == 0) goto L_0x0081;
    L_0x0079:
        r1.close();	 Catch:{ IOException -> 0x007d }
        goto L_0x0081;
    L_0x007d:
        r6 = move-exception;
        r4.zze(r0, r6);
    L_0x0081:
        if (r5 == 0) goto L_0x0086;
    L_0x0083:
        r5.disconnect();
    L_0x0086:
        r5 = 0;
        return r5;
    L_0x0088:
        r6 = move-exception;
    L_0x0089:
        if (r1 == 0) goto L_0x0093;
    L_0x008b:
        r1.close();	 Catch:{ IOException -> 0x008f }
        goto L_0x0093;
    L_0x008f:
        r1 = move-exception;
        r4.zze(r0, r1);
    L_0x0093:
        if (r5 == 0) goto L_0x0098;
    L_0x0095:
        r5.disconnect();
    L_0x0098:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zza(java.net.URL, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8 A:{SYNTHETIC, Splitter:B:51:0x00e8} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6 A:{SYNTHETIC, Splitter:B:41:0x00d6} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8 A:{SYNTHETIC, Splitter:B:51:0x00e8} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6 A:{SYNTHETIC, Splitter:B:41:0x00d6} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8 A:{SYNTHETIC, Splitter:B:51:0x00e8} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f2  */
    private final int zzb(java.net.URL r11, byte[] r12) {
        /*
        r10 = this;
        r0 = "Error closing http compressed post connection output stream";
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r11);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
        r1 = 0;
        r2 = r10.getContext();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2.getPackageName();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2.<init>();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r3 = new java.util.zip.GZIPOutputStream;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r3.<init>(r2);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r3.write(r12);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r3.close();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2.close();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2 = r2.toByteArray();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r3 = "POST compressed size, ratio %, url";
        r4 = r2.length;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r5 = 100;
        r7 = r2.length;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r7 = (long) r7;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r7 = r7 * r5;
        r5 = r12.length;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r5 = (long) r5;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r7 = r7 / r5;
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r10.zza(r3, r4, r5, r11);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r3 = r2.length;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r4 = r12.length;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        if (r3 <= r4) goto L_0x0051;
    L_0x0042:
        r3 = "Compressed payload is larger then uncompressed. compressed, uncompressed";
        r4 = r2.length;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r5 = r12.length;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r10.zzc(r3, r4, r5);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
    L_0x0051:
        r3 = com.google.android.gms.internal.gtm.zzam.zzda();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        if (r3 == 0) goto L_0x0073;
    L_0x0057:
        r3 = "Post payload";
        r4 = "\n";
        r5 = new java.lang.String;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r5.<init>(r12);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r12 = r5.length();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        if (r12 == 0) goto L_0x006b;
    L_0x0066:
        r12 = r4.concat(r5);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        goto L_0x0070;
    L_0x006b:
        r12 = new java.lang.String;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r12.<init>(r4);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
    L_0x0070:
        r10.zza(r3, r12);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
    L_0x0073:
        r11 = r10.zzb(r11);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r12 = 1;
        r11.setDoOutput(r12);	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r12 = "Content-Encoding";
        r3 = "gzip";
        r11.addRequestProperty(r12, r3);	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r12 = r2.length;	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r11.setFixedLengthStreamingMode(r12);	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r11.connect();	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r12 = r11.getOutputStream();	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r12.write(r2);	 Catch:{ IOException -> 0x00ba, all -> 0x00b4 }
        r12.close();	 Catch:{ IOException -> 0x00ba, all -> 0x00b4 }
        r10.zza(r11);	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r12 = r11.getResponseCode();	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r12 != r2) goto L_0x00a5;
    L_0x009e:
        r2 = r10.zzcs();	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r2.zzcl();	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
    L_0x00a5:
        r2 = "POST status";
        r3 = java.lang.Integer.valueOf(r12);	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        r10.zzb(r2, r3);	 Catch:{ IOException -> 0x00c5, all -> 0x00c0 }
        if (r11 == 0) goto L_0x00b3;
    L_0x00b0:
        r11.disconnect();
    L_0x00b3:
        return r12;
    L_0x00b4:
        r1 = move-exception;
        r9 = r12;
        r12 = r11;
        r11 = r1;
        r1 = r9;
        goto L_0x00e6;
    L_0x00ba:
        r1 = move-exception;
        r9 = r12;
        r12 = r11;
        r11 = r1;
        r1 = r9;
        goto L_0x00cf;
    L_0x00c0:
        r12 = move-exception;
        r9 = r12;
        r12 = r11;
        r11 = r9;
        goto L_0x00e6;
    L_0x00c5:
        r12 = move-exception;
        r9 = r12;
        r12 = r11;
        r11 = r9;
        goto L_0x00cf;
    L_0x00ca:
        r11 = move-exception;
        r12 = r1;
        goto L_0x00e6;
    L_0x00cd:
        r11 = move-exception;
        r12 = r1;
    L_0x00cf:
        r2 = "Network compressed POST connection error";
        r10.zzd(r2, r11);	 Catch:{ all -> 0x00e5 }
        if (r1 == 0) goto L_0x00de;
    L_0x00d6:
        r1.close();	 Catch:{ IOException -> 0x00da }
        goto L_0x00de;
    L_0x00da:
        r11 = move-exception;
        r10.zze(r0, r11);
    L_0x00de:
        if (r12 == 0) goto L_0x00e3;
    L_0x00e0:
        r12.disconnect();
    L_0x00e3:
        r11 = 0;
        return r11;
    L_0x00e5:
        r11 = move-exception;
    L_0x00e6:
        if (r1 == 0) goto L_0x00f0;
    L_0x00e8:
        r1.close();	 Catch:{ IOException -> 0x00ec }
        goto L_0x00f0;
    L_0x00ec:
        r1 = move-exception;
        r10.zze(r0, r1);
    L_0x00f0:
        if (r12 == 0) goto L_0x00f5;
    L_0x00f2:
        r12.disconnect();
    L_0x00f5:
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzb(java.net.URL, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0021 A:{SYNTHETIC, Splitter:B:19:0x0021} */
    private final void zza(java.net.HttpURLConnection r4) {
        /*
        r3 = this;
        r0 = "Error closing http connection input stream";
        r4 = r4.getInputStream();	 Catch:{ all -> 0x001d }
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1 = new byte[r1];	 Catch:{ all -> 0x001b }
    L_0x000a:
        r2 = r4.read(r1);	 Catch:{ all -> 0x001b }
        if (r2 > 0) goto L_0x000a;
    L_0x0010:
        if (r4 == 0) goto L_0x001a;
    L_0x0012:
        r4.close();	 Catch:{ IOException -> 0x0016 }
        return;
    L_0x0016:
        r4 = move-exception;
        r3.zze(r0, r4);
    L_0x001a:
        return;
    L_0x001b:
        r1 = move-exception;
        goto L_0x001f;
    L_0x001d:
        r1 = move-exception;
        r4 = 0;
    L_0x001f:
        if (r4 == 0) goto L_0x0029;
    L_0x0021:
        r4.close();	 Catch:{ IOException -> 0x0025 }
        goto L_0x0029;
    L_0x0025:
        r4 = move-exception;
        r3.zze(r0, r4);
    L_0x0029:
        goto L_0x002b;
    L_0x002a:
        throw r1;
    L_0x002b:
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zza(java.net.HttpURLConnection):void");
    }

    @VisibleForTesting
    private final HttpURLConnection zzb(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(((Integer) zzby.zzaad.get()).intValue());
            httpURLConnection.setReadTimeout(((Integer) zzby.zzaae.get()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzabp);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    private final URL zzd(zzcd zzcd) {
        String valueOf;
        String valueOf2;
        if (zzcd.zzfj()) {
            valueOf = String.valueOf(zzbq.zzet());
            valueOf2 = String.valueOf(zzbq.zzev());
            if (valueOf2.length() != 0) {
                valueOf = valueOf.concat(valueOf2);
                return new URL(valueOf);
            }
            valueOf2 = new String(valueOf);
        } else {
            valueOf = String.valueOf(zzbq.zzeu());
            valueOf2 = String.valueOf(zzbq.zzev());
            if (valueOf2.length() != 0) {
                valueOf = valueOf.concat(valueOf2);
                return new URL(valueOf);
            }
            valueOf2 = new String(valueOf);
        }
        valueOf = valueOf2;
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzb(zzcd zzcd, String str) {
        String zzet;
        String str2 = "?";
        String zzev;
        StringBuilder stringBuilder;
        if (zzcd.zzfj()) {
            zzet = zzbq.zzet();
            zzev = zzbq.zzev();
            stringBuilder = new StringBuilder(((String.valueOf(zzet).length() + 1) + String.valueOf(zzev).length()) + String.valueOf(str).length());
            stringBuilder.append(zzet);
            stringBuilder.append(zzev);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            zzet = stringBuilder.toString();
        } else {
            zzet = zzbq.zzeu();
            zzev = zzbq.zzev();
            stringBuilder = new StringBuilder(((String.valueOf(zzet).length() + 1) + String.valueOf(zzev).length()) + String.valueOf(str).length());
            stringBuilder.append(zzet);
            stringBuilder.append(zzev);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            zzet = stringBuilder.toString();
        }
        try {
            return new URL(zzet);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzfs() {
        String valueOf = String.valueOf(zzbq.zzet());
        String valueOf2 = String.valueOf((String) zzby.zzzs.get());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final String zza(zzcd zzcd, boolean z) {
        Preconditions.checkNotNull(zzcd);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String str;
            String str2;
            String str3;
            Iterator it = zzcd.zzdm().entrySet().iterator();
            while (true) {
                str = "z";
                str2 = "qt";
                str3 = "ht";
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str4 = (String) entry.getKey();
                if (!(str3.equals(str4) || str2.equals(str4) || "AppUID".equals(str4) || str.equals(str4) || "_gmsv".equals(str4))) {
                    zza(stringBuilder, str4, (String) entry.getValue());
                }
            }
            zza(stringBuilder, str3, String.valueOf(zzcd.zzfh()));
            zza(stringBuilder, str2, String.valueOf(zzcn().currentTimeMillis() - zzcd.zzfh()));
            if (z) {
                String valueOf;
                long zzfk = zzcd.zzfk();
                if (zzfk != 0) {
                    valueOf = String.valueOf(zzfk);
                } else {
                    valueOf = String.valueOf(zzcd.zzfg());
                }
                zza(stringBuilder, str, valueOf);
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            zze("Failed to encode name or value", e);
            return null;
        }
    }

    private static void zza(StringBuilder stringBuilder, String str, String str2) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        String str3 = "UTF-8";
        stringBuilder.append(URLEncoder.encode(str, str3));
        stringBuilder.append('=');
        stringBuilder.append(URLEncoder.encode(str2, str3));
    }
}
