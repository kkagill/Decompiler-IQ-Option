package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
public final class zzhv extends zzg {
    private final zzin zzre;
    private zzdx zzrf;
    private volatile Boolean zzrg;
    private final zzaa zzrh;
    private final zzjd zzri;
    private final List<Runnable> zzrj = new ArrayList();
    private final zzaa zzrk;

    protected zzhv(zzfj zzfj) {
        super(zzfj);
        this.zzri = new zzjd(zzfj.zzx());
        this.zzre = new zzin(this);
        this.zzrh = new zzhu(this, zzfj);
        this.zzrk = new zzif(this, zzfj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    @WorkerThread
    public final boolean isConnected() {
        zzo();
        zzbi();
        return this.zzrf != null;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzip() {
        zzo();
        zzbi();
        zzd(new zzie(this, zzi(true)));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    @androidx.annotation.WorkerThread
    @com.google.android.gms.common.util.VisibleForTesting
    public final void zza(com.google.android.gms.measurement.internal.zzdx r12, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r13, com.google.android.gms.measurement.internal.zzn r14) {
        /*
        r11 = this;
        r11.zzo();
        r11.zzm();
        r11.zzbi();
        r0 = r11.zziq();
        r1 = 0;
        r2 = 100;
        r3 = 0;
        r4 = 100;
    L_0x0013:
        r5 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        if (r3 >= r5) goto L_0x00a9;
    L_0x0017:
        if (r4 != r2) goto L_0x00a9;
    L_0x0019:
        r4 = new java.util.ArrayList;
        r4.<init>();
        if (r0 == 0) goto L_0x0032;
    L_0x0020:
        r5 = r11.zzu();
        r5 = r5.zzc(r2);
        if (r5 == 0) goto L_0x0032;
    L_0x002a:
        r4.addAll(r5);
        r5 = r5.size();
        goto L_0x0033;
    L_0x0032:
        r5 = 0;
    L_0x0033:
        if (r13 == 0) goto L_0x003a;
    L_0x0035:
        if (r5 >= r2) goto L_0x003a;
    L_0x0037:
        r4.add(r13);
    L_0x003a:
        r4 = (java.util.ArrayList) r4;
        r6 = r4.size();
        r7 = 0;
    L_0x0041:
        if (r7 >= r6) goto L_0x00a4;
    L_0x0043:
        r8 = r4.get(r7);
        r7 = r7 + 1;
        r8 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) r8;
        r9 = r8 instanceof com.google.android.gms.measurement.internal.zzai;
        if (r9 == 0) goto L_0x0064;
    L_0x004f:
        r8 = (com.google.android.gms.measurement.internal.zzai) r8;	 Catch:{ RemoteException -> 0x0055 }
        r12.zza(r8, r14);	 Catch:{ RemoteException -> 0x0055 }
        goto L_0x0041;
    L_0x0055:
        r8 = move-exception;
        r9 = r11.zzab();
        r9 = r9.zzgk();
        r10 = "Failed to send event to the service";
        r9.zza(r10, r8);
        goto L_0x0041;
    L_0x0064:
        r9 = r8 instanceof com.google.android.gms.measurement.internal.zzjn;
        if (r9 == 0) goto L_0x007d;
    L_0x0068:
        r8 = (com.google.android.gms.measurement.internal.zzjn) r8;	 Catch:{ RemoteException -> 0x006e }
        r12.zza(r8, r14);	 Catch:{ RemoteException -> 0x006e }
        goto L_0x0041;
    L_0x006e:
        r8 = move-exception;
        r9 = r11.zzab();
        r9 = r9.zzgk();
        r10 = "Failed to send attribute to the service";
        r9.zza(r10, r8);
        goto L_0x0041;
    L_0x007d:
        r9 = r8 instanceof com.google.android.gms.measurement.internal.zzq;
        if (r9 == 0) goto L_0x0096;
    L_0x0081:
        r8 = (com.google.android.gms.measurement.internal.zzq) r8;	 Catch:{ RemoteException -> 0x0087 }
        r12.zza(r8, r14);	 Catch:{ RemoteException -> 0x0087 }
        goto L_0x0041;
    L_0x0087:
        r8 = move-exception;
        r9 = r11.zzab();
        r9 = r9.zzgk();
        r10 = "Failed to send conditional property to the service";
        r9.zza(r10, r8);
        goto L_0x0041;
    L_0x0096:
        r8 = r11.zzab();
        r8 = r8.zzgk();
        r9 = "Discarding data. Unrecognized parcel type.";
        r8.zzao(r9);
        goto L_0x0041;
    L_0x00a4:
        r3 = r3 + 1;
        r4 = r5;
        goto L_0x0013;
    L_0x00a9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhv.zza(com.google.android.gms.measurement.internal.zzdx, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzn):void");
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzc(zzai zzai, String str) {
        Preconditions.checkNotNull(zzai);
        zzo();
        zzbi();
        boolean zziq = zziq();
        boolean z = zziq && zzu().zza(zzai);
        zzd(new zzih(this, zziq, z, zzai, zzi(true), str));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzd(zzq zzq) {
        Preconditions.checkNotNull(zzq);
        zzo();
        zzbi();
        zzae();
        zzd(new zzig(this, true, zzu().zzc(zzq), new zzq(zzq), zzi(true), zzq));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(AtomicReference<List<zzq>> atomicReference, String str, String str2, String str3) {
        zzo();
        zzbi();
        zzd(new zzij(this, atomicReference, str, str2, str3, zzi(false)));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(zzp zzp, String str, String str2) {
        zzo();
        zzbi();
        zzd(new zzii(this, str, str2, zzi(false), zzp));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(AtomicReference<List<zzjn>> atomicReference, String str, String str2, String str3, boolean z) {
        zzo();
        zzbi();
        zzd(new zzil(this, atomicReference, str, str2, str3, z, zzi(false)));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(zzp zzp, String str, String str2, boolean z) {
        zzo();
        zzbi();
        zzd(new zzik(this, str, str2, z, zzi(false), zzp));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzb(zzjn zzjn) {
        zzo();
        zzbi();
        boolean z = zziq() && zzu().zza(zzjn);
        zzd(new zzhx(this, z, zzjn, zzi(true)));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(AtomicReference<List<zzjn>> atomicReference, boolean z) {
        zzo();
        zzbi();
        zzd(new zzhw(this, atomicReference, zzi(false), z));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void resetAnalyticsData() {
        zzo();
        zzm();
        zzbi();
        zzn zzi = zzi(false);
        if (zziq()) {
            zzu().resetAnalyticsData();
        }
        zzd(new zzhz(this, zzi));
    }

    private final boolean zziq() {
        zzae();
        return true;
    }

    @WorkerThread
    public final void zza(AtomicReference<String> atomicReference) {
        zzo();
        zzbi();
        zzd(new zzhy(this, atomicReference, zzi(false)));
    }

    @WorkerThread
    public final void getAppInstanceId(zzp zzp) {
        zzo();
        zzbi();
        zzd(new zzib(this, zzi(false), zzp));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zzim() {
        zzo();
        zzbi();
        zzn zzi = zzi(true);
        boolean zza = zzad().zza(zzak.zzjd);
        if (zza) {
            zzu().zzgh();
        }
        zzd(new zzia(this, zzi, zza));
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    public final void zza(zzhr zzhr) {
        zzo();
        zzbi();
        zzd(new zzid(this, zzhr));
    }

    @WorkerThread
    private final void zzir() {
        zzo();
        this.zzri.start();
        this.zzrh.zzv(((Long) zzak.zzhl.get(null)).longValue());
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    @androidx.annotation.WorkerThread
    public final void zzis() {
        /*
        r6 = this;
        r6.zzo();
        r6.zzbi();
        r0 = r6.isConnected();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r6.zzrg;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x011a;
    L_0x0013:
        r6.zzo();
        r6.zzbi();
        r0 = r6.zzac();
        r0 = r0.zzhe();
        if (r0 == 0) goto L_0x002c;
    L_0x0023:
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r0 = 1;
        goto L_0x0114;
    L_0x002c:
        r6.zzae();
        r0 = r6.zzr();
        r0 = r0.zzgg();
        if (r0 != r2) goto L_0x003d;
    L_0x0039:
        r0 = 1;
    L_0x003a:
        r3 = 1;
        goto L_0x00f1;
    L_0x003d:
        r0 = r6.zzab();
        r0 = r0.zzgs();
        r3 = "Checking service availability";
        r0.zzao(r3);
        r0 = r6.zzz();
        r3 = 12451000; // 0xbdfcb8 float:1.7447567E-38 double:6.1516114E-317;
        r0 = r0.zzd(r3);
        if (r0 == 0) goto L_0x00e2;
    L_0x0057:
        if (r0 == r2) goto L_0x00d2;
    L_0x0059:
        r3 = 2;
        if (r0 == r3) goto L_0x00a6;
    L_0x005c:
        r3 = 3;
        if (r0 == r3) goto L_0x0098;
    L_0x005f:
        r3 = 9;
        if (r0 == r3) goto L_0x008a;
    L_0x0063:
        r3 = 18;
        if (r0 == r3) goto L_0x007c;
    L_0x0067:
        r3 = r6.zzab();
        r3 = r3.zzgn();
        r0 = java.lang.Integer.valueOf(r0);
        r4 = "Unexpected service status";
        r3.zza(r4, r0);
    L_0x0078:
        r0 = 0;
    L_0x0079:
        r3 = 0;
        goto L_0x00f1;
    L_0x007c:
        r0 = r6.zzab();
        r0 = r0.zzgn();
        r3 = "Service updating";
        r0.zzao(r3);
        goto L_0x0039;
    L_0x008a:
        r0 = r6.zzab();
        r0 = r0.zzgn();
        r3 = "Service invalid";
        r0.zzao(r3);
        goto L_0x0078;
    L_0x0098:
        r0 = r6.zzab();
        r0 = r0.zzgn();
        r3 = "Service disabled";
        r0.zzao(r3);
        goto L_0x0078;
    L_0x00a6:
        r0 = r6.zzab();
        r0 = r0.zzgr();
        r3 = "Service container out of date";
        r0.zzao(r3);
        r0 = r6.zzz();
        r0 = r0.zzjx();
        r3 = 15300; // 0x3bc4 float:2.144E-41 double:7.559E-320;
        if (r0 >= r3) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00df;
    L_0x00c0:
        r0 = r6.zzac();
        r0 = r0.zzhe();
        if (r0 == 0) goto L_0x00d0;
    L_0x00ca:
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0078;
    L_0x00d0:
        r0 = 1;
        goto L_0x0079;
    L_0x00d2:
        r0 = r6.zzab();
        r0 = r0.zzgs();
        r3 = "Service missing";
        r0.zzao(r3);
    L_0x00df:
        r0 = 0;
        goto L_0x003a;
    L_0x00e2:
        r0 = r6.zzab();
        r0 = r0.zzgs();
        r3 = "Service available";
        r0.zzao(r3);
        goto L_0x0039;
    L_0x00f1:
        if (r0 != 0) goto L_0x010b;
    L_0x00f3:
        r4 = r6.zzad();
        r4 = r4.zzbw();
        if (r4 == 0) goto L_0x010b;
    L_0x00fd:
        r3 = r6.zzab();
        r3 = r3.zzgk();
        r4 = "No way to upload. Consider using the full version of Analytics";
        r3.zzao(r4);
        r3 = 0;
    L_0x010b:
        if (r3 == 0) goto L_0x0114;
    L_0x010d:
        r3 = r6.zzac();
        r3.zzd(r0);
    L_0x0114:
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzrg = r0;
    L_0x011a:
        r0 = r6.zzrg;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0128;
    L_0x0122:
        r0 = r6.zzre;
        r0.zzix();
        return;
    L_0x0128:
        r0 = r6.zzad();
        r0 = r0.zzbw();
        if (r0 != 0) goto L_0x0186;
    L_0x0132:
        r6.zzae();
        r0 = r6.getContext();
        r0 = r0.getPackageManager();
        r3 = new android.content.Intent;
        r3.<init>();
        r4 = r6.getContext();
        r5 = "com.google.android.gms.measurement.AppMeasurementService";
        r3 = r3.setClassName(r4, r5);
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0.queryIntentServices(r3, r4);
        if (r0 == 0) goto L_0x015b;
    L_0x0154:
        r0 = r0.size();
        if (r0 <= 0) goto L_0x015b;
    L_0x015a:
        r1 = 1;
    L_0x015b:
        if (r1 == 0) goto L_0x0179;
    L_0x015d:
        r0 = new android.content.Intent;
        r1 = "com.google.android.gms.measurement.START";
        r0.<init>(r1);
        r1 = new android.content.ComponentName;
        r2 = r6.getContext();
        r6.zzae();
        r1.<init>(r2, r5);
        r0.setComponent(r1);
        r1 = r6.zzre;
        r1.zzb(r0);
        return;
    L_0x0179:
        r0 = r6.zzab();
        r0 = r0.zzgk();
        r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest";
        r0.zzao(r1);
    L_0x0186:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhv.zzis():void");
    }

    /* Access modifiers changed, original: final */
    public final Boolean zzit() {
        return this.zzrg;
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    @VisibleForTesting
    public final void zza(zzdx zzdx) {
        zzo();
        Preconditions.checkNotNull(zzdx);
        this.zzrf = zzdx;
        zzir();
        zziv();
    }

    @WorkerThread
    public final void disconnect() {
        zzo();
        zzbi();
        this.zzre.zziw();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzre);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzrf = null;
    }

    @WorkerThread
    private final void onServiceDisconnected(ComponentName componentName) {
        zzo();
        if (this.zzrf != null) {
            this.zzrf = null;
            zzab().zzgs().zza("Disconnected from device MeasurementService", componentName);
            zzo();
            zzis();
        }
    }

    @WorkerThread
    private final void zziu() {
        zzo();
        if (isConnected()) {
            zzab().zzgs().zzao("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    @WorkerThread
    private final void zzd(Runnable runnable) {
        zzo();
        if (isConnected()) {
            runnable.run();
        } else if (((long) this.zzrj.size()) >= 1000) {
            zzab().zzgk().zzao("Discarding data. Max runnable queue size reached");
        } else {
            this.zzrj.add(runnable);
            this.zzrk.zzv(60000);
            zzis();
        }
    }

    @WorkerThread
    private final void zziv() {
        zzo();
        zzab().zzgs().zza("Processing queued up service tasks", Integer.valueOf(this.zzrj.size()));
        for (Runnable run : this.zzrj) {
            try {
                run.run();
            } catch (Exception e) {
                zzab().zzgk().zza("Task exception while flushing queue", e);
            }
        }
        this.zzrj.clear();
        this.zzrk.cancel();
    }

    @WorkerThread
    @Nullable
    private final zzn zzi(boolean z) {
        zzae();
        return zzr().zzai(z ? zzab().zzgu() : null);
    }

    @WorkerThread
    public final void zza(zzp zzp, zzai zzai, String str) {
        zzo();
        zzbi();
        if (zzz().zzd((int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzab().zzgn().zzao("Not bundling data. Service unavailable or out of date");
            zzz().zza(zzp, new byte[0]);
            return;
        }
        zzd(new zzic(this, zzai, str, zzp));
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
