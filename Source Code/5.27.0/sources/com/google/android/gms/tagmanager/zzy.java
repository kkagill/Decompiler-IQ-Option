package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzi;
import com.google.android.gms.internal.gtm.zzk;
import com.google.android.gms.internal.gtm.zzop;
import com.google.android.gms.internal.gtm.zzoq;
import com.google.android.gms.internal.gtm.zzov;

@ShowFirstParty
public final class zzy extends BasePendingResult<ContainerHolder> {
    private final String zzaec;
    private long zzaeh;
    private final Looper zzaek;
    private final TagManager zzaer;
    private final zzaf zzaeu;
    private final zzej zzaev;
    private final int zzaew;
    private final zzai zzaex;
    private zzah zzaey;
    private zzoq zzaez;
    private volatile zzv zzafa;
    private volatile boolean zzafb;
    private zzk zzafc;
    private String zzafd;
    private zzag zzafe;
    private zzac zzaff;
    private final Context zzrm;
    private final Clock zzsd;

    public zzy(Context context, TagManager tagManager, Looper looper, String str, int i, zzal zzal) {
        Context context2 = context;
        String str2 = str;
        TagManager tagManager2 = tagManager;
        Looper looper2 = looper;
        int i2 = i;
        this(context2, tagManager2, looper2, str2, i2, new zzex(context2, str2), new zzes(context2, str2, zzal), new zzoq(context2), DefaultClock.getInstance(), new zzdg(1, 5, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 5000, "refreshing", DefaultClock.getInstance()), new zzai(context2, str2));
        this.zzaez.zzcr(zzal.zzhq());
    }

    @VisibleForTesting
    private zzy(Context context, TagManager tagManager, Looper looper, String str, int i, zzah zzah, zzag zzag, zzoq zzoq, Clock clock, zzej zzej, zzai zzai) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.zzrm = context;
        this.zzaer = tagManager;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.zzaek = looper;
        this.zzaec = str;
        this.zzaew = i;
        this.zzaey = zzah;
        this.zzafe = zzag;
        this.zzaez = zzoq;
        this.zzaeu = new zzaf(this, null);
        this.zzafc = new zzk();
        this.zzsd = clock;
        this.zzaev = zzej;
        this.zzaex = zzai;
        if (zzhi()) {
            zzao(zzeh.zziy().zzja());
        }
    }

    public final void zzhf() {
        zzov zzt = this.zzaey.zzt(this.zzaew);
        if (zzt != null) {
            setResult(new zzv(this.zzaer, this.zzaek, new Container(this.zzrm, this.zzaer.getDataLayer(), this.zzaec, 0, zzt), new zzaa(this)));
        } else {
            String str = "Default was requested, but no default container was found";
            zzdi.zzav(str);
            setResult(createFailedResult(new Status(10, str, null)));
        }
        this.zzafe = null;
        this.zzaey = null;
    }

    public final void zzhg() {
        zzd(false);
    }

    public final void zzhh() {
        zzd(true);
    }

    private final void zzd(boolean z) {
        this.zzaey.zza(new zzad(this, null));
        this.zzafe.zza(new zzae(this, null));
        zzov zzt = this.zzaey.zzt(this.zzaew);
        if (zzt != null) {
            TagManager tagManager = this.zzaer;
            this.zzafa = new zzv(tagManager, this.zzaek, new Container(this.zzrm, tagManager.getDataLayer(), this.zzaec, 0, zzt), this.zzaeu);
        }
        this.zzaff = new zzab(this, z);
        if (zzhi()) {
            this.zzafe.zza(0, "");
        } else {
            this.zzaey.zzhk();
        }
    }

    /* JADX WARNING: Missing block: B:21:0x006f, code skipped:
            return;
     */
    private final synchronized void zza(com.google.android.gms.internal.gtm.zzk r10, long r11, boolean r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        if (r13 == 0) goto L_0x0005;
    L_0x0003:
        r13 = r9.zzafb;	 Catch:{ all -> 0x0070 }
    L_0x0005:
        r13 = r9.isReady();	 Catch:{ all -> 0x0070 }
        if (r13 == 0) goto L_0x0011;
    L_0x000b:
        r13 = r9.zzafa;	 Catch:{ all -> 0x0070 }
        if (r13 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r9);
        return;
    L_0x0011:
        r9.zzafc = r10;	 Catch:{ all -> 0x0070 }
        r9.zzaeh = r11;	 Catch:{ all -> 0x0070 }
        r13 = r9.zzaex;	 Catch:{ all -> 0x0070 }
        r0 = r13.zzhl();	 Catch:{ all -> 0x0070 }
        r2 = 0;
        r4 = r9.zzaeh;	 Catch:{ all -> 0x0070 }
        r4 = r4 + r0;
        r13 = r9.zzsd;	 Catch:{ all -> 0x0070 }
        r6 = r13.currentTimeMillis();	 Catch:{ all -> 0x0070 }
        r4 = r4 - r6;
        r0 = java.lang.Math.min(r0, r4);	 Catch:{ all -> 0x0070 }
        r0 = java.lang.Math.max(r2, r0);	 Catch:{ all -> 0x0070 }
        r9.zzk(r0);	 Catch:{ all -> 0x0070 }
        r13 = new com.google.android.gms.tagmanager.Container;	 Catch:{ all -> 0x0070 }
        r3 = r9.zzrm;	 Catch:{ all -> 0x0070 }
        r0 = r9.zzaer;	 Catch:{ all -> 0x0070 }
        r4 = r0.getDataLayer();	 Catch:{ all -> 0x0070 }
        r5 = r9.zzaec;	 Catch:{ all -> 0x0070 }
        r2 = r13;
        r6 = r11;
        r8 = r10;
        r2.<init>(r3, r4, r5, r6, r8);	 Catch:{ all -> 0x0070 }
        r10 = r9.zzafa;	 Catch:{ all -> 0x0070 }
        if (r10 != 0) goto L_0x0056;
    L_0x0048:
        r10 = new com.google.android.gms.tagmanager.zzv;	 Catch:{ all -> 0x0070 }
        r11 = r9.zzaer;	 Catch:{ all -> 0x0070 }
        r12 = r9.zzaek;	 Catch:{ all -> 0x0070 }
        r0 = r9.zzaeu;	 Catch:{ all -> 0x0070 }
        r10.<init>(r11, r12, r13, r0);	 Catch:{ all -> 0x0070 }
        r9.zzafa = r10;	 Catch:{ all -> 0x0070 }
        goto L_0x005b;
    L_0x0056:
        r10 = r9.zzafa;	 Catch:{ all -> 0x0070 }
        r10.zza(r13);	 Catch:{ all -> 0x0070 }
    L_0x005b:
        r10 = r9.isReady();	 Catch:{ all -> 0x0070 }
        if (r10 != 0) goto L_0x006e;
    L_0x0061:
        r10 = r9.zzaff;	 Catch:{ all -> 0x0070 }
        r10 = r10.zzb(r13);	 Catch:{ all -> 0x0070 }
        if (r10 == 0) goto L_0x006e;
    L_0x0069:
        r10 = r9.zzafa;	 Catch:{ all -> 0x0070 }
        r9.setResult(r10);	 Catch:{ all -> 0x0070 }
    L_0x006e:
        monitor-exit(r9);
        return;
    L_0x0070:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzy.zza(com.google.android.gms.internal.gtm.zzk, long, boolean):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    @VisibleForTesting
    public final synchronized void zzao(String str) {
        this.zzafd = str;
        if (this.zzafe != null) {
            this.zzafe.zzap(str);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized String zzhc() {
        return this.zzafd;
    }

    private final synchronized void zzk(long j) {
        if (this.zzafe == null) {
            zzdi.zzac("Refresh requested, but no network load scheduler.");
        } else {
            this.zzafe.zza(j, this.zzafc.zzql);
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: zza */
    public final ContainerHolder createFailedResult(Status status) {
        if (this.zzafa != null) {
            return this.zzafa;
        }
        if (status == Status.RESULT_TIMEOUT) {
            zzdi.zzav("timer expired: setting result to failure");
        }
        return new zzv(status);
    }

    private final boolean zzhi() {
        zzeh zziy = zzeh.zziy();
        return (zziy.zziz() == zza.CONTAINER || zziy.zziz() == zza.CONTAINER_DEBUG) && this.zzaec.equals(zziy.getContainerId());
    }

    private final synchronized void zza(zzk zzk) {
        if (this.zzaey != null) {
            zzop zzop = new zzop();
            zzop.zzaux = this.zzaeh;
            zzop.zzqk = new zzi();
            zzop.zzauy = zzk;
            this.zzaey.zza(zzop);
        }
    }
}
