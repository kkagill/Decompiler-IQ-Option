package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

public final class zzdy extends zzg {
    private String zzce;
    private String zzcg;
    private String zzcm;
    private String zzco;
    private long zzcr;
    private String zzcu;
    private List<String> zzcw;
    private int zzds;
    private int zzjr;
    private String zzjs;
    private long zzjt;
    private long zzs;

    zzdy(zzfj zzfj, long j) {
        super(zzfj);
        this.zzs = j;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019f A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019e A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a8 A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bb A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019e A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019f A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a8 A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bb A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019f A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019e A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a8 A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bb A:{Catch:{ IllegalStateException -> 0x01cd }} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023b  */
    public final void zzbl() {
        /*
        r13 = this;
        r0 = r13.getContext();
        r0 = r0.getPackageName();
        r1 = r13.getContext();
        r1 = r1.getPackageManager();
        r2 = "Unknown";
        r3 = "";
        r4 = 0;
        r5 = "unknown";
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r1 != 0) goto L_0x002f;
    L_0x001c:
        r7 = r13.zzab();
        r7 = r7.zzgk();
        r8 = com.google.android.gms.measurement.internal.zzef.zzam(r0);
        r9 = "PackageManager is null, app identity information might be inaccurate. appId";
        r7.zza(r9, r8);
    L_0x002d:
        r8 = r2;
        goto L_0x008f;
    L_0x002f:
        r5 = r1.getInstallerPackageName(r0);	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0045;
    L_0x0034:
        r7 = r13.zzab();
        r7 = r7.zzgk();
        r8 = com.google.android.gms.measurement.internal.zzef.zzam(r0);
        r9 = "Error retrieving app installer package name. appId";
        r7.zza(r9, r8);
    L_0x0045:
        if (r5 != 0) goto L_0x004a;
    L_0x0047:
        r5 = "manual_install";
        goto L_0x0053;
    L_0x004a:
        r7 = "com.android.vending";
        r7 = r7.equals(r5);
        if (r7 == 0) goto L_0x0053;
    L_0x0052:
        r5 = r3;
    L_0x0053:
        r7 = r13.getContext();	 Catch:{ NameNotFoundException -> 0x007b }
        r7 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x007b }
        r7 = r1.getPackageInfo(r7, r4);	 Catch:{ NameNotFoundException -> 0x007b }
        if (r7 == 0) goto L_0x002d;
    L_0x0061:
        r8 = r7.applicationInfo;	 Catch:{ NameNotFoundException -> 0x007b }
        r8 = r1.getApplicationLabel(r8);	 Catch:{ NameNotFoundException -> 0x007b }
        r9 = android.text.TextUtils.isEmpty(r8);	 Catch:{ NameNotFoundException -> 0x007b }
        if (r9 != 0) goto L_0x0072;
    L_0x006d:
        r8 = r8.toString();	 Catch:{ NameNotFoundException -> 0x007b }
        goto L_0x0073;
    L_0x0072:
        r8 = r2;
    L_0x0073:
        r2 = r7.versionName;	 Catch:{ NameNotFoundException -> 0x0078 }
        r6 = r7.versionCode;	 Catch:{ NameNotFoundException -> 0x0078 }
        goto L_0x008f;
    L_0x0078:
        r7 = r2;
        r2 = r8;
        goto L_0x007c;
    L_0x007b:
        r7 = r2;
    L_0x007c:
        r8 = r13.zzab();
        r8 = r8.zzgk();
        r9 = com.google.android.gms.measurement.internal.zzef.zzam(r0);
        r10 = "Error retrieving package info. appId, appName";
        r8.zza(r10, r9, r2);
        r8 = r2;
        r2 = r7;
    L_0x008f:
        r13.zzce = r0;
        r13.zzco = r5;
        r13.zzcm = r2;
        r13.zzjr = r6;
        r13.zzjs = r8;
        r5 = 0;
        r13.zzjt = r5;
        r13.zzae();
        r2 = r13.getContext();
        r2 = com.google.android.gms.common.api.internal.GoogleServices.initialize(r2);
        r7 = 1;
        if (r2 == 0) goto L_0x00b3;
    L_0x00ab:
        r8 = r2.isSuccess();
        if (r8 == 0) goto L_0x00b3;
    L_0x00b1:
        r8 = 1;
        goto L_0x00b4;
    L_0x00b3:
        r8 = 0;
    L_0x00b4:
        r9 = r13.zzj;
        r9 = r9.zzhx();
        r9 = android.text.TextUtils.isEmpty(r9);
        r10 = "am";
        if (r9 != 0) goto L_0x00d0;
    L_0x00c2:
        r9 = r13.zzj;
        r9 = r9.zzhy();
        r9 = r10.equals(r9);
        if (r9 == 0) goto L_0x00d0;
    L_0x00ce:
        r9 = 1;
        goto L_0x00d1;
    L_0x00d0:
        r9 = 0;
    L_0x00d1:
        r8 = r8 | r9;
        if (r8 != 0) goto L_0x00fd;
    L_0x00d4:
        if (r2 != 0) goto L_0x00e4;
    L_0x00d6:
        r2 = r13.zzab();
        r2 = r2.zzgk();
        r9 = "GoogleService failed to initialize (no status)";
        r2.zzao(r9);
        goto L_0x00fd;
    L_0x00e4:
        r9 = r13.zzab();
        r9 = r9.zzgk();
        r11 = r2.getStatusCode();
        r11 = java.lang.Integer.valueOf(r11);
        r2 = r2.getStatusMessage();
        r12 = "GoogleService failed to initialize, status";
        r9.zza(r12, r11, r2);
    L_0x00fd:
        if (r8 == 0) goto L_0x016a;
    L_0x00ff:
        r2 = r13.zzad();
        r2 = r2.zzbq();
        r8 = r13.zzad();
        r8 = r8.zzbp();
        if (r8 == 0) goto L_0x0127;
    L_0x0111:
        r2 = r13.zzj;
        r2 = r2.zzhw();
        if (r2 == 0) goto L_0x016a;
    L_0x0119:
        r2 = r13.zzab();
        r2 = r2.zzgq();
        r8 = "Collection disabled with firebase_analytics_collection_deactivated=1";
        r2.zzao(r8);
        goto L_0x016a;
    L_0x0127:
        if (r2 == 0) goto L_0x0145;
    L_0x0129:
        r8 = r2.booleanValue();
        if (r8 != 0) goto L_0x0145;
    L_0x012f:
        r2 = r13.zzj;
        r2 = r2.zzhw();
        if (r2 == 0) goto L_0x016a;
    L_0x0137:
        r2 = r13.zzab();
        r2 = r2.zzgq();
        r8 = "Collection disabled with firebase_analytics_collection_enabled=0";
        r2.zzao(r8);
        goto L_0x016a;
    L_0x0145:
        if (r2 != 0) goto L_0x015b;
    L_0x0147:
        r2 = com.google.android.gms.common.api.internal.GoogleServices.isMeasurementExplicitlyDisabled();
        if (r2 == 0) goto L_0x015b;
    L_0x014d:
        r2 = r13.zzab();
        r2 = r2.zzgq();
        r8 = "Collection disabled with google_app_measurement_enable=0";
        r2.zzao(r8);
        goto L_0x016a;
    L_0x015b:
        r2 = r13.zzab();
        r2 = r2.zzgs();
        r8 = "Collection enabled";
        r2.zzao(r8);
        r2 = 1;
        goto L_0x016b;
    L_0x016a:
        r2 = 0;
    L_0x016b:
        r13.zzcg = r3;
        r13.zzcu = r3;
        r13.zzcr = r5;
        r13.zzae();
        r5 = r13.zzj;
        r5 = r5.zzhx();
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 != 0) goto L_0x0194;
    L_0x0180:
        r5 = r13.zzj;
        r5 = r5.zzhy();
        r5 = r10.equals(r5);
        if (r5 == 0) goto L_0x0194;
    L_0x018c:
        r5 = r13.zzj;
        r5 = r5.zzhx();
        r13.zzcu = r5;
    L_0x0194:
        r5 = com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId();	 Catch:{ IllegalStateException -> 0x01cd }
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ IllegalStateException -> 0x01cd }
        if (r6 == 0) goto L_0x019f;
    L_0x019e:
        goto L_0x01a0;
    L_0x019f:
        r3 = r5;
    L_0x01a0:
        r13.zzcg = r3;	 Catch:{ IllegalStateException -> 0x01cd }
        r3 = android.text.TextUtils.isEmpty(r5);	 Catch:{ IllegalStateException -> 0x01cd }
        if (r3 != 0) goto L_0x01b9;
    L_0x01a8:
        r3 = new com.google.android.gms.common.internal.StringResourceValueReader;	 Catch:{ IllegalStateException -> 0x01cd }
        r5 = r13.getContext();	 Catch:{ IllegalStateException -> 0x01cd }
        r3.<init>(r5);	 Catch:{ IllegalStateException -> 0x01cd }
        r5 = "admob_app_id";
        r3 = r3.getString(r5);	 Catch:{ IllegalStateException -> 0x01cd }
        r13.zzcu = r3;	 Catch:{ IllegalStateException -> 0x01cd }
    L_0x01b9:
        if (r2 == 0) goto L_0x01df;
    L_0x01bb:
        r2 = r13.zzab();	 Catch:{ IllegalStateException -> 0x01cd }
        r2 = r2.zzgs();	 Catch:{ IllegalStateException -> 0x01cd }
        r3 = "App package, google app id";
        r5 = r13.zzce;	 Catch:{ IllegalStateException -> 0x01cd }
        r6 = r13.zzcg;	 Catch:{ IllegalStateException -> 0x01cd }
        r2.zza(r3, r5, r6);	 Catch:{ IllegalStateException -> 0x01cd }
        goto L_0x01df;
    L_0x01cd:
        r2 = move-exception;
        r3 = r13.zzab();
        r3 = r3.zzgk();
        r0 = com.google.android.gms.measurement.internal.zzef.zzam(r0);
        r5 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId";
        r3.zza(r5, r0, r2);
    L_0x01df:
        r0 = 0;
        r13.zzcw = r0;
        r0 = r13.zzad();
        r2 = r13.zzce;
        r3 = com.google.android.gms.measurement.internal.zzak.zzix;
        r0 = r0.zze(r2, r3);
        if (r0 == 0) goto L_0x0235;
    L_0x01f0:
        r13.zzae();
        r0 = r13.zzad();
        r2 = "analytics.safelisted_events";
        r0 = r0.zzk(r2);
        if (r0 == 0) goto L_0x0231;
    L_0x01ff:
        r2 = r0.size();
        if (r2 != 0) goto L_0x0214;
    L_0x0205:
        r2 = r13.zzab();
        r2 = r2.zzgn();
        r3 = "Safelisted event list cannot be empty. Ignoring";
        r2.zzao(r3);
    L_0x0212:
        r7 = 0;
        goto L_0x0231;
    L_0x0214:
        r2 = r0.iterator();
    L_0x0218:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0231;
    L_0x021e:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r5 = r13.zzz();
        r6 = "safelisted event";
        r3 = r5.zzq(r6, r3);
        if (r3 != 0) goto L_0x0218;
    L_0x0230:
        goto L_0x0212;
    L_0x0231:
        if (r7 == 0) goto L_0x0235;
    L_0x0233:
        r13.zzcw = r0;
    L_0x0235:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        if (r0 < r2) goto L_0x024b;
    L_0x023b:
        if (r1 == 0) goto L_0x0248;
    L_0x023d:
        r0 = r13.getContext();
        r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0);
        r13.zzds = r0;
        return;
    L_0x0248:
        r13.zzds = r4;
        return;
    L_0x024b:
        r13.zzds = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.zzbl():void");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0102  */
    @androidx.annotation.WorkerThread
    public final com.google.android.gms.measurement.internal.zzn zzai(java.lang.String r35) {
        /*
        r34 = this;
        r0 = r34;
        r34.zzo();
        r34.zzm();
        r29 = new com.google.android.gms.measurement.internal.zzn;
        r2 = r34.zzag();
        r3 = r34.getGmpAppId();
        r34.zzbi();
        r4 = r0.zzcm;
        r1 = r34.zzgf();
        r5 = (long) r1;
        r34.zzbi();
        r7 = r0.zzco;
        r1 = r34.zzad();
        r8 = r1.zzao();
        r34.zzbi();
        r34.zzo();
        r10 = r0.zzjt;
        r12 = 0;
        r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r1 != 0) goto L_0x004f;
    L_0x0037:
        r1 = r0.zzj;
        r1 = r1.zzz();
        r10 = r34.getContext();
        r11 = r34.getContext();
        r11 = r11.getPackageName();
        r10 = r1.zzc(r10, r11);
        r0.zzjt = r10;
    L_0x004f:
        r10 = r0.zzjt;
        r1 = r0.zzj;
        r13 = r1.isEnabled();
        r1 = r34.zzac();
        r1 = r1.zzmc;
        r12 = 1;
        r14 = r1 ^ 1;
        r34.zzo();
        r34.zzm();
        r1 = r0.zzj;
        r1 = r1.isEnabled();
        if (r1 != 0) goto L_0x0071;
    L_0x006e:
        r16 = 0;
        goto L_0x0077;
    L_0x0071:
        r1 = r34.zzge();
        r16 = r1;
    L_0x0077:
        r34.zzbi();
        r17 = r13;
        r12 = r0.zzcr;
        r1 = r0.zzj;
        r19 = r1.zzic();
        r21 = r34.zzgg();
        r1 = r34.zzad();
        r1 = r1.zzbr();
        r22 = r1.booleanValue();
        r1 = r34.zzad();
        r1.zzm();
        r15 = "google_analytics_ssaid_collection_enabled";
        r1 = r1.zzj(r15);
        if (r1 == 0) goto L_0x00ac;
    L_0x00a3:
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00ac;
    L_0x00aa:
        r1 = 0;
        goto L_0x00ad;
    L_0x00ac:
        r1 = 1;
    L_0x00ad:
        r1 = java.lang.Boolean.valueOf(r1);
        r24 = r1.booleanValue();
        r1 = r34.zzac();
        r25 = r1.zzhi();
        r26 = r34.zzah();
        r1 = r34.zzad();
        r15 = r34.zzag();
        r27 = r12;
        r12 = com.google.android.gms.measurement.internal.zzak.zzij;
        r1 = r1.zze(r15, r12);
        if (r1 == 0) goto L_0x00ec;
    L_0x00d3:
        r1 = r34.zzad();
        r12 = "google_analytics_default_allow_ad_personalization_signals";
        r1 = r1.zzj(r12);
        if (r1 == 0) goto L_0x00ec;
    L_0x00df:
        r1 = r1.booleanValue();
        r12 = 1;
        r1 = r1 ^ r12;
        r1 = java.lang.Boolean.valueOf(r1);
        r30 = r1;
        goto L_0x00ee;
    L_0x00ec:
        r30 = 0;
    L_0x00ee:
        r12 = r0.zzs;
        r1 = r34.zzad();
        r15 = r34.zzag();
        r31 = r12;
        r12 = com.google.android.gms.measurement.internal.zzak.zzix;
        r1 = r1.zze(r15, r12);
        if (r1 == 0) goto L_0x0107;
    L_0x0102:
        r1 = r0.zzcw;
        r33 = r1;
        goto L_0x0109;
    L_0x0107:
        r33 = 0;
    L_0x0109:
        r1 = r29;
        r12 = r35;
        r13 = r17;
        r15 = r16;
        r16 = r27;
        r18 = r19;
        r20 = r21;
        r21 = r22;
        r22 = r24;
        r23 = r25;
        r24 = r26;
        r25 = r30;
        r26 = r31;
        r28 = r33;
        r1.<init>(r2, r3, r4, r5, r7, r8, r10, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r28);
        return r29;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.zzai(java.lang.String):com.google.android.gms.measurement.internal.zzn");
    }

    @WorkerThread
    @VisibleForTesting
    private final String zzge() {
        try {
            Class loadClass = getContext().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{getContext()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzab().zzgp().zzao("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzab().zzgo().zzao("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final String zzag() {
        zzbi();
        return this.zzce;
    }

    /* Access modifiers changed, original: final */
    public final String getGmpAppId() {
        zzbi();
        return this.zzcg;
    }

    /* Access modifiers changed, original: final */
    public final String zzah() {
        zzbi();
        return this.zzcu;
    }

    /* Access modifiers changed, original: final */
    public final int zzgf() {
        zzbi();
        return this.zzjr;
    }

    /* Access modifiers changed, original: final */
    public final int zzgg() {
        zzbi();
        return this.zzds;
    }

    /* Access modifiers changed, original: final */
    @Nullable
    public final List<String> zzbh() {
        return this.zzcw;
    }

    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    public final /* bridge */ /* synthetic */ zza zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzgp zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzdy zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzhv zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzhq zzt() {
        return super.zzt();
    }

    public final /* bridge */ /* synthetic */ zzeb zzu() {
        return super.zzu();
    }

    public final /* bridge */ /* synthetic */ zziw zzv() {
        return super.zzv();
    }

    public final /* bridge */ /* synthetic */ zzac zzw() {
        return super.zzw();
    }

    public final /* bridge */ /* synthetic */ Clock zzx() {
        return super.zzx();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ zzed zzy() {
        return super.zzy();
    }

    public final /* bridge */ /* synthetic */ zzjs zzz() {
        return super.zzz();
    }

    public final /* bridge */ /* synthetic */ zzfc zzaa() {
        return super.zzaa();
    }

    public final /* bridge */ /* synthetic */ zzef zzab() {
        return super.zzab();
    }

    public final /* bridge */ /* synthetic */ zzeo zzac() {
        return super.zzac();
    }

    public final /* bridge */ /* synthetic */ zzs zzad() {
        return super.zzad();
    }

    public final /* bridge */ /* synthetic */ zzr zzae() {
        return super.zzae();
    }
}
