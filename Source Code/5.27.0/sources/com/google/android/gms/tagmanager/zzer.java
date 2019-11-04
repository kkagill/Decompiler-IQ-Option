package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzk;
import com.google.android.gms.internal.gtm.zzpd;

final class zzer implements Runnable {
    private final String zzaec;
    private volatile String zzafd;
    private final zzpd zzajd;
    private final String zzaje;
    private zzdh<zzk> zzajf;
    private volatile zzal zzajg;
    private volatile String zzajh;
    private final Context zzrm;

    public zzer(Context context, String str, zzal zzal) {
        this(context, str, new zzpd(), zzal);
    }

    @VisibleForTesting
    private zzer(Context context, String str, zzpd zzpd, zzal zzal) {
        this.zzrm = context;
        this.zzajd = zzpd;
        this.zzaec = str;
        this.zzajg = zzal;
        String valueOf = String.valueOf(str);
        String str2 = "/r?id=";
        this.zzaje = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        this.zzafd = this.zzaje;
        this.zzajh = null;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x01e0=Splitter:B:55:0x01e0, B:31:0x0116=Splitter:B:31:0x0116} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x01e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0116 */
    public final void run() {
        /*
        r7 = this;
        r0 = " ";
        r1 = r7.zzajf;
        if (r1 == 0) goto L_0x0225;
    L_0x0006:
        r1.zzhj();
        r1 = r7.zzrm;
        r2 = "connectivity";
        r1 = r1.getSystemService(r2);
        r1 = (android.net.ConnectivityManager) r1;
        r1 = r1.getActiveNetworkInfo();
        if (r1 == 0) goto L_0x0022;
    L_0x0019:
        r1 = r1.isConnected();
        if (r1 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0022;
    L_0x0020:
        r1 = 1;
        goto L_0x0028;
    L_0x0022:
        r1 = "...no network connectivity";
        com.google.android.gms.tagmanager.zzdi.zzab(r1);
        r1 = 0;
    L_0x0028:
        if (r1 != 0) goto L_0x0032;
    L_0x002a:
        r0 = r7.zzajf;
        r1 = com.google.android.gms.tagmanager.zzcz.zzaht;
        r0.zzs(r1);
        return;
    L_0x0032:
        r1 = "Start loading resource from network ...";
        com.google.android.gms.tagmanager.zzdi.zzab(r1);
        r1 = r7.zzajg;
        r1 = r1.zzhq();
        r2 = r7.zzafd;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 12;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r4.append(r1);
        r4.append(r2);
        r1 = "&v=a65833898";
        r4.append(r1);
        r1 = r4.toString();
        r2 = r7.zzajh;
        if (r2 == 0) goto L_0x00a5;
    L_0x006a:
        r2 = r7.zzajh;
        r2 = r2.trim();
        r3 = "";
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x00a5;
    L_0x0078:
        r1 = java.lang.String.valueOf(r1);
        r2 = r7.zzajh;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 4;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r4.append(r1);
        r1 = "&pv=";
        r4.append(r1);
        r4.append(r2);
        r1 = r4.toString();
    L_0x00a5:
        r2 = com.google.android.gms.tagmanager.zzeh.zziy();
        r2 = r2.zziz();
        r3 = com.google.android.gms.tagmanager.zzeh.zza.CONTAINER_DEBUG;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00cc;
    L_0x00b5:
        r1 = java.lang.String.valueOf(r1);
        r2 = "&gtm_debug=x";
        r3 = r2.length();
        if (r3 == 0) goto L_0x00c6;
    L_0x00c1:
        r1 = r1.concat(r2);
        goto L_0x00cc;
    L_0x00c6:
        r2 = new java.lang.String;
        r2.<init>(r1);
        r1 = r2;
    L_0x00cc:
        r2 = com.google.android.gms.internal.gtm.zzpd.zzmt();
        r3 = 0;
        r3 = r2.zzcj(r1);	 Catch:{ FileNotFoundException -> 0x01e0, zzpe -> 0x0116, IOException -> 0x00d9 }
        goto L_0x0137;
    L_0x00d6:
        r0 = move-exception;
        goto L_0x0221;
    L_0x00d9:
        r3 = move-exception;
        r4 = r3.getMessage();	 Catch:{ all -> 0x00d6 }
        r5 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d6 }
        r5 = r5.length();	 Catch:{ all -> 0x00d6 }
        r5 = r5 + 40;
        r6 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00d6 }
        r6 = r6.length();	 Catch:{ all -> 0x00d6 }
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d6 }
        r6.<init>(r5);	 Catch:{ all -> 0x00d6 }
        r5 = "Error when loading resources from url: ";
        r6.append(r5);	 Catch:{ all -> 0x00d6 }
        r6.append(r1);	 Catch:{ all -> 0x00d6 }
        r6.append(r0);	 Catch:{ all -> 0x00d6 }
        r6.append(r4);	 Catch:{ all -> 0x00d6 }
        r0 = r6.toString();	 Catch:{ all -> 0x00d6 }
        com.google.android.gms.tagmanager.zzdi.zzb(r0, r3);	 Catch:{ all -> 0x00d6 }
        r0 = r7.zzajf;	 Catch:{ all -> 0x00d6 }
        r1 = com.google.android.gms.tagmanager.zzcz.zzahu;	 Catch:{ all -> 0x00d6 }
        r0.zzs(r1);	 Catch:{ all -> 0x00d6 }
        r2.close();
        return;
    L_0x0116:
        r4 = "Error when loading resource for url: ";
        r5 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d6 }
        r6 = r5.length();	 Catch:{ all -> 0x00d6 }
        if (r6 == 0) goto L_0x0127;
    L_0x0122:
        r4 = r4.concat(r5);	 Catch:{ all -> 0x00d6 }
        goto L_0x012d;
    L_0x0127:
        r5 = new java.lang.String;	 Catch:{ all -> 0x00d6 }
        r5.<init>(r4);	 Catch:{ all -> 0x00d6 }
        r4 = r5;
    L_0x012d:
        com.google.android.gms.tagmanager.zzdi.zzac(r4);	 Catch:{ all -> 0x00d6 }
        r4 = r7.zzajf;	 Catch:{ all -> 0x00d6 }
        r5 = com.google.android.gms.tagmanager.zzcz.zzahw;	 Catch:{ all -> 0x00d6 }
        r4.zzs(r5);	 Catch:{ all -> 0x00d6 }
    L_0x0137:
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x01a3 }
        r4.<init>();	 Catch:{ IOException -> 0x01a3 }
        com.google.android.gms.internal.gtm.zzor.zza(r3, r4);	 Catch:{ IOException -> 0x01a3 }
        r3 = r4.toByteArray();	 Catch:{ IOException -> 0x01a3 }
        r4 = new com.google.android.gms.internal.gtm.zzk;	 Catch:{ IOException -> 0x01a3 }
        r4.<init>();	 Catch:{ IOException -> 0x01a3 }
        r3 = com.google.android.gms.internal.gtm.zzuw.zza(r4, r3);	 Catch:{ IOException -> 0x01a3 }
        r3 = (com.google.android.gms.internal.gtm.zzk) r3;	 Catch:{ IOException -> 0x01a3 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x01a3 }
        r5 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x01a3 }
        r5 = r5.length();	 Catch:{ IOException -> 0x01a3 }
        r5 = r5 + 43;
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01a3 }
        r6.<init>(r5);	 Catch:{ IOException -> 0x01a3 }
        r5 = "Successfully loaded supplemented resource: ";
        r6.append(r5);	 Catch:{ IOException -> 0x01a3 }
        r6.append(r4);	 Catch:{ IOException -> 0x01a3 }
        r4 = r6.toString();	 Catch:{ IOException -> 0x01a3 }
        com.google.android.gms.tagmanager.zzdi.zzab(r4);	 Catch:{ IOException -> 0x01a3 }
        r4 = r3.zzqk;	 Catch:{ IOException -> 0x01a3 }
        if (r4 != 0) goto L_0x0195;
    L_0x0174:
        r4 = r3.zzqj;	 Catch:{ IOException -> 0x01a3 }
        r4 = r4.length;	 Catch:{ IOException -> 0x01a3 }
        if (r4 != 0) goto L_0x0195;
    L_0x0179:
        r4 = "No change for container: ";
        r5 = r7.zzaec;	 Catch:{ IOException -> 0x01a3 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ IOException -> 0x01a3 }
        r6 = r5.length();	 Catch:{ IOException -> 0x01a3 }
        if (r6 == 0) goto L_0x018c;
    L_0x0187:
        r4 = r4.concat(r5);	 Catch:{ IOException -> 0x01a3 }
        goto L_0x0192;
    L_0x018c:
        r5 = new java.lang.String;	 Catch:{ IOException -> 0x01a3 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x01a3 }
        r4 = r5;
    L_0x0192:
        com.google.android.gms.tagmanager.zzdi.zzab(r4);	 Catch:{ IOException -> 0x01a3 }
    L_0x0195:
        r4 = r7.zzajf;	 Catch:{ IOException -> 0x01a3 }
        r4.zze(r3);	 Catch:{ IOException -> 0x01a3 }
        r2.close();
        r0 = "Load resource from network finished.";
        com.google.android.gms.tagmanager.zzdi.zzab(r0);
        return;
    L_0x01a3:
        r3 = move-exception;
        r4 = r3.getMessage();	 Catch:{ all -> 0x00d6 }
        r5 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d6 }
        r5 = r5.length();	 Catch:{ all -> 0x00d6 }
        r5 = r5 + 51;
        r6 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00d6 }
        r6 = r6.length();	 Catch:{ all -> 0x00d6 }
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d6 }
        r6.<init>(r5);	 Catch:{ all -> 0x00d6 }
        r5 = "Error when parsing downloaded resources from url: ";
        r6.append(r5);	 Catch:{ all -> 0x00d6 }
        r6.append(r1);	 Catch:{ all -> 0x00d6 }
        r6.append(r0);	 Catch:{ all -> 0x00d6 }
        r6.append(r4);	 Catch:{ all -> 0x00d6 }
        r0 = r6.toString();	 Catch:{ all -> 0x00d6 }
        com.google.android.gms.tagmanager.zzdi.zzb(r0, r3);	 Catch:{ all -> 0x00d6 }
        r0 = r7.zzajf;	 Catch:{ all -> 0x00d6 }
        r1 = com.google.android.gms.tagmanager.zzcz.zzahv;	 Catch:{ all -> 0x00d6 }
        r0.zzs(r1);	 Catch:{ all -> 0x00d6 }
        r2.close();
        return;
    L_0x01e0:
        r0 = r7.zzaec;	 Catch:{ all -> 0x00d6 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d6 }
        r3 = r3.length();	 Catch:{ all -> 0x00d6 }
        r3 = r3 + 79;
        r4 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00d6 }
        r4 = r4.length();	 Catch:{ all -> 0x00d6 }
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d6 }
        r4.<init>(r3);	 Catch:{ all -> 0x00d6 }
        r3 = "No data is retrieved from the given url: ";
        r4.append(r3);	 Catch:{ all -> 0x00d6 }
        r4.append(r1);	 Catch:{ all -> 0x00d6 }
        r1 = ". Make sure container_id: ";
        r4.append(r1);	 Catch:{ all -> 0x00d6 }
        r4.append(r0);	 Catch:{ all -> 0x00d6 }
        r0 = " is correct.";
        r4.append(r0);	 Catch:{ all -> 0x00d6 }
        r0 = r4.toString();	 Catch:{ all -> 0x00d6 }
        com.google.android.gms.tagmanager.zzdi.zzac(r0);	 Catch:{ all -> 0x00d6 }
        r0 = r7.zzajf;	 Catch:{ all -> 0x00d6 }
        r1 = com.google.android.gms.tagmanager.zzcz.zzahv;	 Catch:{ all -> 0x00d6 }
        r0.zzs(r1);	 Catch:{ all -> 0x00d6 }
        r2.close();
        return;
    L_0x0221:
        r2.close();
        throw r0;
    L_0x0225:
        r0 = new java.lang.IllegalStateException;
        r1 = "callback must be set before execute";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzer.run():void");
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzdh<zzk> zzdh) {
        this.zzajf = zzdh;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final void zzap(String str) {
        if (str == null) {
            this.zzafd = this.zzaje;
            return;
        }
        String str2 = "Setting CTFE URL path: ";
        String valueOf = String.valueOf(str);
        zzdi.zzax(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.zzafd = str;
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final void zzbi(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Setting previous container version: ";
        zzdi.zzax(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.zzajh = str;
    }
}
