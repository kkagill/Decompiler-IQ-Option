package com.google.android.gms.internal.gtm;

final class zzcb implements zzbp<zzcc> {
    private final zzcc zzaat = new zzcc();
    private final zzap zzwc;

    public zzcb(zzap zzap) {
        this.zzwc = zzap;
    }

    public final void zzb(String str, String str2) {
    }

    public final void zzc(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.zzaat.zzaau = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.zzaat.zzaav = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.zzaat.zzaaw = str2;
        } else {
            this.zzwc.zzco().zzd("String xml configuration name not recognized", str);
        }
    }

    public final void zza(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.zzaat.zzaay = z;
        } else {
            this.zzwc.zzco().zzd("Bool xml configuration name not recognized", str);
        }
    }

    public final void zzb(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.zzaat.zzaax = i;
        } else {
            this.zzwc.zzco().zzd("Int xml configuration name not recognized", str);
        }
    }

    public final /* synthetic */ zzbn zzel() {
        return this.zzaat;
    }
}
