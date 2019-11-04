package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz.zzf.zzb;

public final class zzdq extends zzjn<zzdq> {
    private zzb zzpl;
    public Long zzpm;
    public Long zzpn;
    public Long zzpo;
    public Long zzpp;

    public zzdq() {
        this.zzpm = null;
        this.zzpn = null;
        this.zzpo = null;
        this.zzpp = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        zzb zzb = this.zzpl;
        if (!(zzb == null || zzb == null)) {
            zzjl.zze(1, zzb.zzr());
        }
        Long l = this.zzpm;
        if (l != null) {
            zzjl.zzi(2, l.longValue());
        }
        l = this.zzpn;
        if (l != null) {
            zzjl.zzi(3, l.longValue());
        }
        l = this.zzpp;
        if (l != null) {
            zzjl.zzi(4, l.longValue());
        }
        l = this.zzpo;
        if (l != null) {
            zzjl.zzi(5, l.longValue());
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        zzb zzb = this.zzpl;
        if (!(zzb == null || zzb == null)) {
            zzt += zzjl.zzi(1, zzb.zzr());
        }
        Long l = this.zzpm;
        if (l != null) {
            zzt += zzjl.zzd(2, l.longValue());
        }
        l = this.zzpn;
        if (l != null) {
            zzt += zzjl.zzd(3, l.longValue());
        }
        l = this.zzpp;
        if (l != null) {
            zzt += zzjl.zzd(4, l.longValue());
        }
        l = this.zzpo;
        return l != null ? zzt + zzjl.zzd(5, l.longValue()) : zzt;
    }
}
