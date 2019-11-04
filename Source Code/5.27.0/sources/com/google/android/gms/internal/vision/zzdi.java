package com.google.android.gms.internal.vision;

public final class zzdi extends zzjn<zzdi> {
    private int[] zzoe;

    public zzdi() {
        this.zzoe = zzjw.zzzb;
        this.zzadp = -1;
    }

    public final void zza(zzjl zzjl) {
        int[] iArr = this.zzoe;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.zzoe;
                if (i >= iArr2.length) {
                    break;
                }
                zzjl.zze(1, iArr2[i]);
                i++;
            }
        }
        super.zza(zzjl);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzt() {
        int zzt = super.zzt();
        int[] iArr = this.zzoe;
        if (iArr == null || iArr.length <= 0) {
            return zzt;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.zzoe;
            if (i >= iArr2.length) {
                return (zzt + i2) + (iArr2.length * 1);
            }
            i2 += zzjl.zzaw(iArr2[i]);
            i++;
        }
    }

    private final zzdi zzb(zzjk zzjk) {
        while (true) {
            int zzdq = zzjk.zzdq();
            if (zzdq == 0) {
                return this;
            }
            int[] iArr;
            int i;
            if (zzdq == 8) {
                int zzb = zzjw.zzb(zzjk, 8);
                iArr = new int[zzb];
                int i2 = 0;
                for (i = 0; i < zzb; i++) {
                    if (i != 0) {
                        zzjk.zzdq();
                    }
                    int position = zzjk.getPosition();
                    try {
                        iArr[i2] = zzeb.zzx(zzjk.zzdt());
                        i2++;
                    } catch (IllegalArgumentException unused) {
                        zzjk.zzbt(position);
                        zza(zzjk, zzdq);
                    }
                }
                if (i2 != 0) {
                    int[] iArr2 = this.zzoe;
                    zzdq = iArr2 == null ? 0 : iArr2.length;
                    if (zzdq == 0 && i2 == iArr.length) {
                        this.zzoe = iArr;
                    } else {
                        int[] iArr3 = new int[(zzdq + i2)];
                        if (zzdq != 0) {
                            System.arraycopy(this.zzoe, 0, iArr3, 0, zzdq);
                        }
                        System.arraycopy(iArr, 0, iArr3, zzdq, i2);
                        this.zzoe = iArr3;
                    }
                }
            } else if (zzdq == 10) {
                zzdq = zzjk.zzan(zzjk.zzdt());
                int position2 = zzjk.getPosition();
                i = 0;
                while (zzjk.zzhq() > 0) {
                    try {
                        zzeb.zzx(zzjk.zzdt());
                        i++;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                if (i != 0) {
                    zzjk.zzbt(position2);
                    iArr = this.zzoe;
                    position2 = iArr == null ? 0 : iArr.length;
                    int[] iArr4 = new int[(i + position2)];
                    if (position2 != 0) {
                        System.arraycopy(this.zzoe, 0, iArr4, 0, position2);
                    }
                    while (zzjk.zzhq() > 0) {
                        int position3 = zzjk.getPosition();
                        try {
                            iArr4[position2] = zzeb.zzx(zzjk.zzdt());
                            position2++;
                        } catch (IllegalArgumentException unused3) {
                            zzjk.zzbt(position3);
                            zza(zzjk, 8);
                        }
                    }
                    this.zzoe = iArr4;
                }
                zzjk.zzao(zzdq);
            } else if (!super.zza(zzjk, zzdq)) {
                return this;
            }
        }
    }
}
