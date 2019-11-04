package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

final class zzf {
    private final String zzce;
    private String zzcf;
    private String zzcg;
    private String zzch;
    private String zzci;
    private long zzcj;
    private long zzck;
    private long zzcl;
    private String zzcm;
    private long zzcn;
    private String zzco;
    private long zzcp;
    private boolean zzcq;
    private long zzcr;
    private boolean zzcs;
    private boolean zzct;
    private String zzcu;
    private Boolean zzcv;
    private List<String> zzcw;
    private long zzcx;
    private long zzcy;
    private long zzcz;
    private long zzda;
    private long zzdb;
    private long zzdc;
    private String zzdd;
    private boolean zzde;
    private long zzdf;
    private long zzdg;
    private final zzfj zzj;
    private long zzr;
    private long zzs;

    @WorkerThread
    zzf(zzfj zzfj, String str) {
        Preconditions.checkNotNull(zzfj);
        Preconditions.checkNotEmpty(str);
        this.zzj = zzfj;
        this.zzce = str;
        this.zzj.zzaa().zzo();
    }

    @WorkerThread
    public final void zzaf() {
        this.zzj.zzaa().zzo();
        this.zzde = false;
    }

    @WorkerThread
    public final String zzag() {
        this.zzj.zzaa().zzo();
        return this.zzce;
    }

    @WorkerThread
    public final String getAppInstanceId() {
        this.zzj.zzaa().zzo();
        return this.zzcf;
    }

    @WorkerThread
    public final void zza(String str) {
        this.zzj.zzaa().zzo();
        this.zzde |= zzjs.zzs(this.zzcf, str) ^ 1;
        this.zzcf = str;
    }

    @WorkerThread
    public final String getGmpAppId() {
        this.zzj.zzaa().zzo();
        return this.zzcg;
    }

    @WorkerThread
    public final void zzb(String str) {
        this.zzj.zzaa().zzo();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzde |= zzjs.zzs(this.zzcg, str) ^ 1;
        this.zzcg = str;
    }

    @WorkerThread
    public final String zzah() {
        this.zzj.zzaa().zzo();
        return this.zzcu;
    }

    @WorkerThread
    public final void zzc(String str) {
        this.zzj.zzaa().zzo();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzde |= zzjs.zzs(this.zzcu, str) ^ 1;
        this.zzcu = str;
    }

    @WorkerThread
    public final String zzai() {
        this.zzj.zzaa().zzo();
        return this.zzch;
    }

    @WorkerThread
    public final void zzd(String str) {
        this.zzj.zzaa().zzo();
        this.zzde |= zzjs.zzs(this.zzch, str) ^ 1;
        this.zzch = str;
    }

    @WorkerThread
    public final String getFirebaseInstanceId() {
        this.zzj.zzaa().zzo();
        return this.zzci;
    }

    @WorkerThread
    public final void zze(String str) {
        this.zzj.zzaa().zzo();
        this.zzde |= zzjs.zzs(this.zzci, str) ^ 1;
        this.zzci = str;
    }

    @WorkerThread
    public final long zzaj() {
        this.zzj.zzaa().zzo();
        return this.zzck;
    }

    @WorkerThread
    public final void zze(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzck != j ? 1 : 0;
        this.zzck = j;
    }

    @WorkerThread
    public final long zzak() {
        this.zzj.zzaa().zzo();
        return this.zzcl;
    }

    @WorkerThread
    public final void zzf(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcl != j ? 1 : 0;
        this.zzcl = j;
    }

    @WorkerThread
    public final String zzal() {
        this.zzj.zzaa().zzo();
        return this.zzcm;
    }

    @WorkerThread
    public final void zzf(String str) {
        this.zzj.zzaa().zzo();
        this.zzde |= zzjs.zzs(this.zzcm, str) ^ 1;
        this.zzcm = str;
    }

    @WorkerThread
    public final long zzam() {
        this.zzj.zzaa().zzo();
        return this.zzcn;
    }

    @WorkerThread
    public final void zzg(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcn != j ? 1 : 0;
        this.zzcn = j;
    }

    @WorkerThread
    public final String zzan() {
        this.zzj.zzaa().zzo();
        return this.zzco;
    }

    @WorkerThread
    public final void zzg(String str) {
        this.zzj.zzaa().zzo();
        this.zzde |= zzjs.zzs(this.zzco, str) ^ 1;
        this.zzco = str;
    }

    @WorkerThread
    public final long zzao() {
        this.zzj.zzaa().zzo();
        return this.zzr;
    }

    @WorkerThread
    public final void zzh(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzr != j ? 1 : 0;
        this.zzr = j;
    }

    @WorkerThread
    public final long zzap() {
        this.zzj.zzaa().zzo();
        return this.zzcp;
    }

    @WorkerThread
    public final void zzi(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcp != j ? 1 : 0;
        this.zzcp = j;
    }

    @WorkerThread
    public final long zzaq() {
        this.zzj.zzaa().zzo();
        return this.zzs;
    }

    @WorkerThread
    public final void zzj(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzs != j ? 1 : 0;
        this.zzs = j;
    }

    @WorkerThread
    public final boolean isMeasurementEnabled() {
        this.zzj.zzaa().zzo();
        return this.zzcq;
    }

    @WorkerThread
    public final void setMeasurementEnabled(boolean z) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcq != z ? 1 : 0;
        this.zzcq = z;
    }

    @WorkerThread
    public final void zzk(long j) {
        int i = 1;
        Preconditions.checkArgument(j >= 0);
        this.zzj.zzaa().zzo();
        boolean z = this.zzde;
        if (this.zzcj == j) {
            i = 0;
        }
        this.zzde = i | z;
        this.zzcj = j;
    }

    @WorkerThread
    public final long zzar() {
        this.zzj.zzaa().zzo();
        return this.zzcj;
    }

    @WorkerThread
    public final long zzas() {
        this.zzj.zzaa().zzo();
        return this.zzdf;
    }

    @WorkerThread
    public final void zzl(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzdf != j ? 1 : 0;
        this.zzdf = j;
    }

    @WorkerThread
    public final long zzat() {
        this.zzj.zzaa().zzo();
        return this.zzdg;
    }

    @WorkerThread
    public final void zzm(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzdg != j ? 1 : 0;
        this.zzdg = j;
    }

    @WorkerThread
    public final void zzau() {
        this.zzj.zzaa().zzo();
        long j = this.zzcj + 1;
        if (j > 2147483647L) {
            this.zzj.zzab().zzgn().zza("Bundle index overflow. appId", zzef.zzam(this.zzce));
            j = 0;
        }
        this.zzde = true;
        this.zzcj = j;
    }

    @WorkerThread
    public final long zzav() {
        this.zzj.zzaa().zzo();
        return this.zzcx;
    }

    @WorkerThread
    public final void zzn(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcx != j ? 1 : 0;
        this.zzcx = j;
    }

    @WorkerThread
    public final long zzaw() {
        this.zzj.zzaa().zzo();
        return this.zzcy;
    }

    @WorkerThread
    public final void zzo(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcy != j ? 1 : 0;
        this.zzcy = j;
    }

    @WorkerThread
    public final long zzax() {
        this.zzj.zzaa().zzo();
        return this.zzcz;
    }

    @WorkerThread
    public final void zzp(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcz != j ? 1 : 0;
        this.zzcz = j;
    }

    @WorkerThread
    public final long zzay() {
        this.zzj.zzaa().zzo();
        return this.zzda;
    }

    @WorkerThread
    public final void zzq(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzda != j ? 1 : 0;
        this.zzda = j;
    }

    @WorkerThread
    public final long zzaz() {
        this.zzj.zzaa().zzo();
        return this.zzdc;
    }

    @WorkerThread
    public final void zzr(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzdc != j ? 1 : 0;
        this.zzdc = j;
    }

    @WorkerThread
    public final long zzba() {
        this.zzj.zzaa().zzo();
        return this.zzdb;
    }

    @WorkerThread
    public final void zzs(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzdb != j ? 1 : 0;
        this.zzdb = j;
    }

    @WorkerThread
    public final String zzbb() {
        this.zzj.zzaa().zzo();
        return this.zzdd;
    }

    @WorkerThread
    public final String zzbc() {
        this.zzj.zzaa().zzo();
        String str = this.zzdd;
        zzh(null);
        return str;
    }

    @WorkerThread
    public final void zzh(String str) {
        this.zzj.zzaa().zzo();
        this.zzde |= zzjs.zzs(this.zzdd, str) ^ 1;
        this.zzdd = str;
    }

    @WorkerThread
    public final long zzbd() {
        this.zzj.zzaa().zzo();
        return this.zzcr;
    }

    @WorkerThread
    public final void zzt(long j) {
        this.zzj.zzaa().zzo();
        this.zzde |= this.zzcr != j ? 1 : 0;
        this.zzcr = j;
    }

    @WorkerThread
    public final boolean zzbe() {
        this.zzj.zzaa().zzo();
        return this.zzcs;
    }

    @WorkerThread
    public final void zzb(boolean z) {
        this.zzj.zzaa().zzo();
        this.zzde = this.zzcs != z;
        this.zzcs = z;
    }

    @WorkerThread
    public final boolean zzbf() {
        this.zzj.zzaa().zzo();
        return this.zzct;
    }

    @WorkerThread
    public final void zzc(boolean z) {
        this.zzj.zzaa().zzo();
        this.zzde = this.zzct != z;
        this.zzct = z;
    }

    @WorkerThread
    public final Boolean zzbg() {
        this.zzj.zzaa().zzo();
        return this.zzcv;
    }

    @WorkerThread
    public final void zza(Boolean bool) {
        this.zzj.zzaa().zzo();
        this.zzde = zzjs.zza(this.zzcv, bool) ^ 1;
        this.zzcv = bool;
    }

    @WorkerThread
    @Nullable
    public final List<String> zzbh() {
        this.zzj.zzaa().zzo();
        return this.zzcw;
    }

    @WorkerThread
    public final void zza(@Nullable List<String> list) {
        this.zzj.zzaa().zzo();
        if (!zzjs.zzb(this.zzcw, (List) list)) {
            this.zzde = true;
            this.zzcw = list != null ? new ArrayList(list) : null;
        }
    }
}
