package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

@WorkerThread
final class zzen implements Runnable {
    private final String packageName;
    private final URL url;
    private final byte[] zzlc;
    private final zzel zzld;
    private final Map<String, String> zzle;
    private final /* synthetic */ zzej zzlf;

    public zzen(zzej zzej, String str, URL url, byte[] bArr, Map<String, String> map, zzel zzel) {
        this.zzlf = zzej;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzel);
        this.url = url;
        this.zzlc = bArr;
        this.zzld = zzel;
        this.packageName = str;
        this.zzle = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A:{SYNTHETIC, Splitter:B:57:0x0101} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A:{SYNTHETIC, Splitter:B:44:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A:{SYNTHETIC, Splitter:B:44:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A:{SYNTHETIC, Splitter:B:57:0x0101} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A:{SYNTHETIC, Splitter:B:44:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A:{SYNTHETIC, Splitter:B:57:0x0101} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A:{SYNTHETIC, Splitter:B:44:0x00c6} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    public final void run() {
        /*
        r13 = this;
        r0 = "Error closing HTTP compressed POST connection output stream. appId";
        r1 = r13.zzlf;
        r1.zzn();
        r1 = 0;
        r2 = 0;
        r3 = r13.zzlf;	 Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
        r4 = r13.url;	 Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
        r3 = r3.zza(r4);	 Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
        r4 = r13.zzle;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        if (r4 == 0) goto L_0x003b;
    L_0x0015:
        r4 = r13.zzle;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r4 = r4.entrySet();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r4 = r4.iterator();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
    L_0x001f:
        r5 = r4.hasNext();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        if (r5 == 0) goto L_0x003b;
    L_0x0025:
        r5 = r4.next();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = (java.util.Map.Entry) r5;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r6 = r5.getKey();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r6 = (java.lang.String) r6;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = r5.getValue();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = (java.lang.String) r5;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r3.addRequestProperty(r6, r5);	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        goto L_0x001f;
    L_0x003b:
        r4 = r13.zzlc;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        if (r4 == 0) goto L_0x0086;
    L_0x003f:
        r4 = r13.zzlf;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r4 = r4.zzgw();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = r13.zzlc;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r4 = r4.zzc(r5);	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = r13.zzlf;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = r5.zzab();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = r5.zzgs();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r6 = "Uploading data. size";
        r7 = r4.length;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5.zza(r6, r7);	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = 1;
        r3.setDoOutput(r5);	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = "Content-Encoding";
        r6 = "gzip";
        r3.addRequestProperty(r5, r6);	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = r4.length;	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r3.setFixedLengthStreamingMode(r5);	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r3.connect();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5 = r3.getOutputStream();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r5.write(r4);	 Catch:{ IOException -> 0x0080, all -> 0x007c }
        r5.close();	 Catch:{ IOException -> 0x0080, all -> 0x007c }
        goto L_0x0086;
    L_0x007c:
        r4 = move-exception;
        r11 = r1;
        r1 = r5;
        goto L_0x00c3;
    L_0x0080:
        r4 = move-exception;
        r11 = r1;
        r9 = r4;
        r1 = r5;
        goto L_0x00fe;
    L_0x0086:
        r8 = r3.getResponseCode();	 Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        r11 = r3.getHeaderFields();	 Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
        r2 = r13.zzlf;	 Catch:{ IOException -> 0x00b1, all -> 0x00af }
        r10 = com.google.android.gms.measurement.internal.zzej.zza(r3);	 Catch:{ IOException -> 0x00b1, all -> 0x00af }
        if (r3 == 0) goto L_0x0099;
    L_0x0096:
        r3.disconnect();
    L_0x0099:
        r0 = r13.zzlf;
        r0 = r0.zzaa();
        r1 = new com.google.android.gms.measurement.internal.zzek;
        r6 = r13.packageName;
        r7 = r13.zzld;
        r9 = 0;
        r12 = 0;
        r5 = r1;
        r5.<init>(r6, r7, r8, r9, r10, r11);
        r0.zza(r1);
        return;
    L_0x00af:
        r4 = move-exception;
        goto L_0x00c4;
    L_0x00b1:
        r4 = move-exception;
        goto L_0x00b8;
    L_0x00b3:
        r4 = move-exception;
        r11 = r1;
        goto L_0x00c4;
    L_0x00b6:
        r4 = move-exception;
        r11 = r1;
    L_0x00b8:
        r9 = r4;
        goto L_0x00ff;
    L_0x00ba:
        r4 = move-exception;
        r11 = r1;
        goto L_0x00c3;
    L_0x00bd:
        r4 = move-exception;
        r11 = r1;
        goto L_0x00fd;
    L_0x00c0:
        r4 = move-exception;
        r3 = r1;
        r11 = r3;
    L_0x00c3:
        r8 = 0;
    L_0x00c4:
        if (r1 == 0) goto L_0x00de;
    L_0x00c6:
        r1.close();	 Catch:{ IOException -> 0x00ca }
        goto L_0x00de;
    L_0x00ca:
        r1 = move-exception;
        r2 = r13.zzlf;
        r2 = r2.zzab();
        r2 = r2.zzgk();
        r5 = r13.packageName;
        r5 = com.google.android.gms.measurement.internal.zzef.zzam(r5);
        r2.zza(r0, r5, r1);
    L_0x00de:
        if (r3 == 0) goto L_0x00e3;
    L_0x00e0:
        r3.disconnect();
    L_0x00e3:
        r0 = r13.zzlf;
        r0 = r0.zzaa();
        r1 = new com.google.android.gms.measurement.internal.zzek;
        r6 = r13.packageName;
        r7 = r13.zzld;
        r9 = 0;
        r10 = 0;
        r12 = 0;
        r5 = r1;
        r5.<init>(r6, r7, r8, r9, r10, r11);
        r0.zza(r1);
        throw r4;
    L_0x00fa:
        r4 = move-exception;
        r3 = r1;
        r11 = r3;
    L_0x00fd:
        r9 = r4;
    L_0x00fe:
        r8 = 0;
    L_0x00ff:
        if (r1 == 0) goto L_0x0119;
    L_0x0101:
        r1.close();	 Catch:{ IOException -> 0x0105 }
        goto L_0x0119;
    L_0x0105:
        r1 = move-exception;
        r2 = r13.zzlf;
        r2 = r2.zzab();
        r2 = r2.zzgk();
        r4 = r13.packageName;
        r4 = com.google.android.gms.measurement.internal.zzef.zzam(r4);
        r2.zza(r0, r4, r1);
    L_0x0119:
        if (r3 == 0) goto L_0x011e;
    L_0x011b:
        r3.disconnect();
    L_0x011e:
        r0 = r13.zzlf;
        r0 = r0.zzaa();
        r1 = new com.google.android.gms.measurement.internal.zzek;
        r6 = r13.packageName;
        r7 = r13.zzld;
        r10 = 0;
        r12 = 0;
        r5 = r1;
        r5.<init>(r6, r7, r8, r9, r10, r11);
        r0.zza(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzen.run():void");
    }
}
