package com.google.android.gms.internal.vision;

public final class zzdj extends zzjn<zzdj> {
    private String value;
    private Integer zzof;
    private Integer zzog;

    public zzdj() {
        this.value = null;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        Integer num = this.zzof;
        if (num != null) {
            zzjl.zze(1, num.intValue());
        }
        num = this.zzog;
        if (num != null) {
            zzjl.zze(2, num.intValue());
        }
        String str = this.value;
        if (str != null) {
            zzjl.zza(3, str);
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        Integer num = this.zzof;
        if (num != null) {
            zzt += zzjl.zzi(1, num.intValue());
        }
        num = this.zzog;
        if (num != null) {
            zzt += zzjl.zzi(2, num.intValue());
        }
        String str = this.value;
        return str != null ? zzt + zzjl.zzb(3, str) : zzt;
    }

    private final zzdj zzc(zzjk zzjk) {
        int zzdt;
        StringBuilder stringBuilder;
        while (true) {
            int zzdq = zzjk.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 8) {
                int position = zzjk.getPosition();
                try {
                    this.zzof = Integer.valueOf(zzeb.zzx(zzjk.zzdt()));
                } catch (IllegalArgumentException unused) {
                    zzjk.zzbt(position);
                    zza(zzjk, zzdq);
                }
            } else if (zzdq == 16) {
                try {
                    zzdt = zzjk.zzdt();
                    if (zzdt <= 0 || zzdt > 12) {
                        stringBuilder = new StringBuilder(50);
                        stringBuilder.append(zzdt);
                        stringBuilder.append(" is not a valid enum BarcodeValueFormat");
                    } else {
                        this.zzog = Integer.valueOf(zzdt);
                    }
                } catch (IllegalArgumentException unused2) {
                    zzjk.zzbt(zzjk.getPosition());
                    zza(zzjk, zzdq);
                }
            } else if (zzdq == 26) {
                this.value = zzjk.readString();
            } else if (!super.zza(zzjk, zzdq)) {
                return this;
            }
        }
        stringBuilder = new StringBuilder(50);
        stringBuilder.append(zzdt);
        stringBuilder.append(" is not a valid enum BarcodeValueFormat");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
