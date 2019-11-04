package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz.zzc.zzb;

public final class zzdl extends zzjn<zzdl> {
    private String url;
    private Boolean zzoi;
    private zzb zzoj;
    private Long zzok;
    private Long zzol;
    private Long zzom;
    private String zzon;

    public zzdl() {
        this.url = null;
        this.zzoi = null;
        this.zzok = null;
        this.zzol = null;
        this.zzom = null;
        this.zzon = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        String str = this.url;
        if (str != null) {
            zzjl.zza(1, str);
        }
        Boolean bool = this.zzoi;
        if (bool != null) {
            zzjl.zzb(2, bool.booleanValue());
        }
        zzb zzb = this.zzoj;
        if (!(zzb == null || zzb == null)) {
            zzjl.zze(3, zzb.zzr());
        }
        Long l = this.zzok;
        if (l != null) {
            zzjl.zzi(4, l.longValue());
        }
        l = this.zzol;
        if (l != null) {
            zzjl.zzi(5, l.longValue());
        }
        l = this.zzom;
        if (l != null) {
            zzjl.zzi(6, l.longValue());
        }
        str = this.zzon;
        if (str != null) {
            zzjl.zza(7, str);
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        String str = this.url;
        if (str != null) {
            zzt += zzjl.zzb(1, str);
        }
        Boolean bool = this.zzoi;
        if (bool != null) {
            bool.booleanValue();
            zzt += zzjl.zzav(2) + 1;
        }
        zzb zzb = this.zzoj;
        if (!(zzb == null || zzb == null)) {
            zzt += zzjl.zzi(3, zzb.zzr());
        }
        Long l = this.zzok;
        if (l != null) {
            zzt += zzjl.zzd(4, l.longValue());
        }
        l = this.zzol;
        if (l != null) {
            zzt += zzjl.zzd(5, l.longValue());
        }
        l = this.zzom;
        if (l != null) {
            zzt += zzjl.zzd(6, l.longValue());
        }
        str = this.zzon;
        return str != null ? zzt + zzjl.zzb(7, str) : zzt;
    }
}
