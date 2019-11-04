package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg.zzb;
import com.google.android.gms.internal.clearcut.zzcg.zzc;
import com.google.android.gms.internal.clearcut.zzcg.zzd;

public final class zzgc extends zzd<zzgc, zza> implements zzdq {
    private static volatile zzdz<zzgc> zzbg;
    private static final zzgc zzsg = new zzgc();
    private byte zzsf = (byte) 2;

    public static final class zza extends zzc<zzgc, zza> implements zzdq {
        private zza() {
            super(zzgc.zzsg);
        }

        /* synthetic */ zza(zzgd zzgd) {
            this();
        }
    }

    static {
        zzcg.zza(zzgc.class, zzsg);
    }

    private zzgc() {
    }

    public static zzgc zzer() {
        return zzsg;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        int i2 = 1;
        switch (zzgd.zzba[i - 1]) {
            case 1:
                return new zzgc();
            case 2:
                return new zza();
            case 3:
                return zzcg.zza((zzdo) zzsg, "\u0003\u0000", null);
            case 4:
                return zzsg;
            case 5:
                Object obj3 = zzbg;
                if (obj3 == null) {
                    synchronized (zzgc.class) {
                        obj3 = zzbg;
                        if (obj3 == null) {
                            obj3 = new zzb(zzsg);
                            zzbg = obj3;
                        }
                    }
                }
                return obj3;
            case 6:
                return Byte.valueOf(this.zzsf);
            case 7:
                if (obj == null) {
                    i2 = 0;
                }
                this.zzsf = (byte) i2;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
