package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzdu<T> implements zzef<T> {
    private final zzdo zzmn;
    private final boolean zzmo;
    private final zzex<?, ?> zzmx;
    private final zzbu<?> zzmy;

    private zzdu(zzex<?, ?> zzex, zzbu<?> zzbu, zzdo zzdo) {
        this.zzmx = zzex;
        this.zzmo = zzbu.zze(zzdo);
        this.zzmy = zzbu;
        this.zzmn = zzdo;
    }

    static <T> zzdu<T> zza(zzex<?, ?> zzex, zzbu<?> zzbu, zzdo zzdo) {
        return new zzdu(zzex, zzbu, zzdo);
    }

    public final boolean equals(T t, T t2) {
        return !this.zzmx.zzq(t).equals(this.zzmx.zzq(t2)) ? false : this.zzmo ? this.zzmy.zza((Object) t).equals(this.zzmy.zza((Object) t2)) : true;
    }

    public final int hashCode(T t) {
        int hashCode = this.zzmx.zzq(t).hashCode();
        return this.zzmo ? (hashCode * 53) + this.zzmy.zza((Object) t).hashCode() : hashCode;
    }

    public final T newInstance() {
        return this.zzmn.zzbd().zzbi();
    }

    public final void zza(T t, zzfr zzfr) {
        Iterator it = this.zzmy.zza((Object) t).iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzca zzca = (zzca) entry.getKey();
            if (zzca.zzav() != zzfq.MESSAGE || zzca.zzaw() || zzca.zzax()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            int zzc;
            Object zzr;
            if (entry instanceof zzct) {
                zzc = zzca.zzc();
                zzr = ((zzct) entry).zzbs().zzr();
            } else {
                zzc = zzca.zzc();
                zzr = entry.getValue();
            }
            zzfr.zza(zzc, zzr);
        }
        zzex zzex = this.zzmx;
        zzex.zzc(zzex.zzq(t), zzfr);
    }

    public final void zza(T t, byte[] bArr, int i, int i2, zzay zzay) {
        zzcg zzcg = (zzcg) t;
        zzey zzey = zzcg.zzjp;
        if (zzey == zzey.zzea()) {
            zzey = zzey.zzeb();
            zzcg.zzjp = zzey;
        }
        zzey zzey2 = zzey;
        while (i < i2) {
            int zza = zzax.zza(bArr, i, zzay);
            int i3 = zzay.zzfd;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? zzax.zza(i3, bArr, zza, i2, zzey2, zzay) : zzax.zza(i3, bArr, zza, i2, zzay);
            } else {
                i = 0;
                Object obj = null;
                while (zza < i2) {
                    zza = zzax.zza(bArr, zza, zzay);
                    int i4 = zzay.zzfd;
                    int i5 = i4 >>> 3;
                    int i6 = i4 & 7;
                    if (i5 != 2) {
                        if (i5 == 3 && i6 == 2) {
                            zza = zzax.zze(bArr, zza, zzay);
                            obj = (zzbb) zzay.zzff;
                        }
                    } else if (i6 == 0) {
                        zza = zzax.zza(bArr, zza, zzay);
                        i = zzay.zzfd;
                    }
                    if (i4 == 12) {
                        break;
                    }
                    zza = zzax.zza(i4, bArr, zza, i2, zzay);
                }
                if (obj != null) {
                    zzey2.zzb((i << 3) | 2, obj);
                }
                i = zza;
            }
        }
        if (i != i2) {
            throw zzco.zzbo();
        }
    }

    public final void zzc(T t) {
        this.zzmx.zzc(t);
        this.zzmy.zzc(t);
    }

    public final void zzc(T t, T t2) {
        zzeh.zza(this.zzmx, (Object) t, (Object) t2);
        if (this.zzmo) {
            zzeh.zza(this.zzmy, (Object) t, (Object) t2);
        }
    }

    public final int zzm(T t) {
        zzex zzex = this.zzmx;
        int zzr = zzex.zzr(zzex.zzq(t)) + 0;
        return this.zzmo ? zzr + this.zzmy.zza((Object) t).zzat() : zzr;
    }

    public final boolean zzo(T t) {
        return this.zzmy.zza((Object) t).isInitialized();
    }
}
