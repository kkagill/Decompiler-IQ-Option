package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzh;

public final class zziw extends zzg {
    private Handler handler;
    @VisibleForTesting
    private long zzse = zzx().elapsedRealtime();
    @VisibleForTesting
    private long zzsf = this.zzse;
    private final zzaa zzsg = new zziz(this, this.zzj);
    private final zzaa zzsh = new zziy(this, this.zzj);

    zziw(zzfj zzfj) {
        super(zzfj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzbk() {
        return false;
    }

    private final void zziy() {
        synchronized (this) {
            if (this.handler == null) {
                this.handler = new zzh(Looper.getMainLooper());
            }
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zziz() {
        zzo();
        this.zzsg.cancel();
        this.zzsh.cancel();
        this.zzse = 0;
        this.zzsf = this.zzse;
    }

    @WorkerThread
    private final void zzaa(long j) {
        zzo();
        zziy();
        if (zzad().zze(zzr().zzag(), zzak.zzid)) {
            zzac().zzmd.set(false);
        }
        zzab().zzgs().zza("Activity resumed, time", Long.valueOf(j));
        this.zzse = j;
        this.zzsf = this.zzse;
        if (!this.zzj.isEnabled()) {
            return;
        }
        if (zzad().zzx(zzr().zzag())) {
            zza(zzx().currentTimeMillis(), false);
            return;
        }
        this.zzsg.cancel();
        this.zzsh.cancel();
        if (zzac().zzx(zzx().currentTimeMillis())) {
            zzac().zzlw.set(true);
            zzac().zzmb.set(0);
        }
        if (zzac().zzlw.get()) {
            this.zzsg.zzv(Math.max(0, zzac().zzlu.get() - zzac().zzmb.get()));
        } else {
            this.zzsh.zzv(Math.max(0, 3600000 - zzac().zzmb.get()));
        }
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    public final void zza(long j, boolean z) {
        zzo();
        zziy();
        this.zzsg.cancel();
        this.zzsh.cancel();
        if (zzac().zzx(j)) {
            zzac().zzlw.set(true);
            zzac().zzmb.set(0);
        }
        if (z && zzad().zzy(zzr().zzag())) {
            zzac().zzma.set(j);
        }
        if (zzac().zzlw.get()) {
            zzac(j);
        } else {
            this.zzsh.zzv(Math.max(0, 3600000 - zzac().zzmb.get()));
        }
    }

    @WorkerThread
    private final void zzab(long j) {
        zzo();
        zziy();
        if (zzad().zze(zzr().zzag(), zzak.zzid)) {
            zzac().zzmd.set(true);
        }
        this.zzsg.cancel();
        this.zzsh.cancel();
        zzab().zzgs().zza("Activity paused, time", Long.valueOf(j));
        if (this.zzse != 0) {
            zzac().zzmb.set(zzac().zzmb.get() + (j - this.zzse));
        }
    }

    @WorkerThread
    private final void zzac(long j) {
        zzo();
        zzab().zzgs().zza("Session started, time", Long.valueOf(zzx().elapsedRealtime()));
        Long valueOf = zzad().zzv(zzr().zzag()) ? Long.valueOf(j / 1000) : null;
        zzq().zza("auto", "_sid", (Object) valueOf, j);
        zzac().zzlw.set(false);
        Bundle bundle = new Bundle();
        if (zzad().zzv(zzr().zzag())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        zzq().zza("auto", "_s", j, bundle);
        zzac().zzma.set(j);
    }

    /* Access modifiers changed, original: protected|final */
    @WorkerThread
    @VisibleForTesting
    public final void zzja() {
        zzo();
        zzac(zzx().currentTimeMillis());
    }

    /* Access modifiers changed, original: final */
    @WorkerThread
    @VisibleForTesting
    public final long zzjb() {
        long elapsedRealtime = zzx().elapsedRealtime();
        long j = elapsedRealtime - this.zzsf;
        this.zzsf = elapsedRealtime;
        return j;
    }

    @WorkerThread
    public final boolean zza(boolean z, boolean z2) {
        zzo();
        zzbi();
        long elapsedRealtime = zzx().elapsedRealtime();
        zzac().zzma.set(zzx().currentTimeMillis());
        long j = elapsedRealtime - this.zzse;
        if (z || j >= 1000) {
            zzac().zzmb.set(j);
            zzab().zzgs().zza("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            zzhq.zza(zzt().zzin(), bundle, true);
            if (zzad().zzz(zzr().zzag())) {
                if (zzad().zze(zzr().zzag(), zzak.zzii)) {
                    if (!z2) {
                        zzjb();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    zzjb();
                }
            }
            if (!(zzad().zze(zzr().zzag(), zzak.zzii) && z2)) {
                zzq().logEvent("auto", "_e", bundle);
            }
            this.zzse = elapsedRealtime;
            this.zzsh.cancel();
            this.zzsh.zzv(Math.max(0, 3600000 - zzac().zzmb.get()));
            return true;
        }
        zzab().zzgs().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    @WorkerThread
    private final void zzjc() {
        zzo();
        zza(false, false);
        zzp().zzc(zzx().elapsedRealtime());
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
