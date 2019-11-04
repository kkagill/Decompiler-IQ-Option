package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy.zzg;
import java.util.Arrays;

public final class zzip {
    private static final zzip zzaas = new zzip(0, new int[0], new Object[0], false);
    private int count;
    private int[] zzaat;
    private boolean zzrl;
    private int zzwk;
    private Object[] zzze;

    public static zzip zzhe() {
        return zzaas;
    }

    static zzip zzhf() {
        return new zzip();
    }

    static zzip zza(zzip zzip, zzip zzip2) {
        int i = zzip.count + zzip2.count;
        int[] copyOf = Arrays.copyOf(zzip.zzaat, i);
        System.arraycopy(zzip2.zzaat, 0, copyOf, zzip.count, zzip2.count);
        Object[] copyOf2 = Arrays.copyOf(zzip.zzze, i);
        System.arraycopy(zzip2.zzze, 0, copyOf2, zzip.count, zzip2.count);
        return new zzip(i, copyOf, copyOf2, true);
    }

    private zzip() {
        this(0, new int[8], new Object[8], true);
    }

    private zzip(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzwk = -1;
        this.count = i;
        this.zzaat = iArr;
        this.zzze = objArr;
        this.zzrl = z;
    }

    public final void zzci() {
        this.zzrl = false;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzjj zzjj) {
        int i;
        if (zzjj.zzed() == zzg.zzxj) {
            for (i = this.count - 1; i >= 0; i--) {
                zzjj.zza(this.zzaat[i] >>> 3, this.zzze[i]);
            }
            return;
        }
        for (i = 0; i < this.count; i++) {
            zzjj.zza(this.zzaat[i] >>> 3, this.zzze[i]);
        }
    }

    public final void zzb(zzjj zzjj) {
        if (this.count != 0) {
            int i;
            if (zzjj.zzed() == zzg.zzxi) {
                for (i = 0; i < this.count; i++) {
                    zzb(this.zzaat[i], this.zzze[i], zzjj);
                }
                return;
            }
            for (i = this.count - 1; i >= 0; i--) {
                zzb(this.zzaat[i], this.zzze[i], zzjj);
            }
        }
    }

    private static void zzb(int i, Object obj, zzjj zzjj) {
        int i2 = i >>> 3;
        i &= 7;
        if (i == 0) {
            zzjj.zzi(i2, ((Long) obj).longValue());
        } else if (i == 1) {
            zzjj.zzc(i2, ((Long) obj).longValue());
        } else if (i == 2) {
            zzjj.zza(i2, (zzeo) obj);
        } else if (i != 3) {
            if (i == 5) {
                zzjj.zzh(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzgf.zzfm());
        } else if (zzjj.zzed() == zzg.zzxi) {
            zzjj.zzbe(i2);
            ((zzip) obj).zzb(zzjj);
            zzjj.zzbf(i2);
        } else {
            zzjj.zzbf(i2);
            ((zzip) obj).zzb(zzjj);
            zzjj.zzbe(i2);
        }
    }

    public final int zzhg() {
        int i = this.zzwk;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            i2 += zzfe.zzd(this.zzaat[i] >>> 3, (zzeo) this.zzze[i]);
        }
        this.zzwk = i2;
        return i2;
    }

    public final int zzeq() {
        int i = this.zzwk;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            int i3 = this.zzaat[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 == 0) {
                i3 = zzfe.zze(i4, ((Long) this.zzze[i]).longValue());
            } else if (i3 == 1) {
                i3 = zzfe.zzg(i4, ((Long) this.zzze[i]).longValue());
            } else if (i3 == 2) {
                i3 = zzfe.zzc(i4, (zzeo) this.zzze[i]);
            } else if (i3 == 3) {
                i3 = (zzfe.zzav(i4) << 1) + ((zzip) this.zzze[i]).zzeq();
            } else if (i3 == 5) {
                i3 = zzfe.zzl(i4, ((Integer) this.zzze[i]).intValue());
            } else {
                throw new IllegalStateException(zzgf.zzfm());
            }
            i2 += i3;
        }
        this.zzwk = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzip)) {
            return false;
        }
        zzip zzip = (zzip) obj;
        int i = this.count;
        if (i == zzip.count) {
            Object obj2;
            int[] iArr = this.zzaat;
            int[] iArr2 = zzip.zzaat;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.zzze;
                Object[] objArr2 = zzip.zzze;
                int i3 = this.count;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!objArr[i4].equals(objArr2[i4])) {
                        obj = null;
                        break;
                    }
                }
                obj = 1;
                return obj != null;
            }
        }
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzaat;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        i2 = (i2 + i4) * 31;
        Object[] objArr = this.zzze;
        for (int i6 = 0; i6 < this.count; i6++) {
            i3 = (i3 * 31) + objArr[i6].hashCode();
        }
        return i2 + i3;
    }

    /* Access modifiers changed, original: final */
    public final void zza(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzhi.zza(stringBuilder, i, String.valueOf(this.zzaat[i2] >>> 3), this.zzze[i2]);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(int i, Object obj) {
        if (this.zzrl) {
            int i2;
            int i3 = this.count;
            if (i3 == this.zzaat.length) {
                i2 = this.count + (i3 < 4 ? 8 : i3 >> 1);
                this.zzaat = Arrays.copyOf(this.zzaat, i2);
                this.zzze = Arrays.copyOf(this.zzze, i2);
            }
            int[] iArr = this.zzaat;
            i2 = this.count;
            iArr[i2] = i;
            this.zzze[i2] = obj;
            this.count = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
