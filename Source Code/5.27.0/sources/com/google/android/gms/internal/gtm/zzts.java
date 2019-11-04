package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrc.zze;
import java.util.Arrays;

public final class zzts {
    private static final zzts zzbem = new zzts(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzavs;
    private int zzbal;
    private Object[] zzbcz;
    private int[] zzben;

    public static zzts zzrj() {
        return zzbem;
    }

    static zzts zzrk() {
        return new zzts();
    }

    static zzts zza(zzts zzts, zzts zzts2) {
        int i = zzts.count + zzts2.count;
        int[] copyOf = Arrays.copyOf(zzts.zzben, i);
        System.arraycopy(zzts2.zzben, 0, copyOf, zzts.count, zzts2.count);
        Object[] copyOf2 = Arrays.copyOf(zzts.zzbcz, i);
        System.arraycopy(zzts2.zzbcz, 0, copyOf2, zzts.count, zzts2.count);
        return new zzts(i, copyOf, copyOf2, true);
    }

    private zzts() {
        this(0, new int[8], new Object[8], true);
    }

    private zzts(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzbal = -1;
        this.count = i;
        this.zzben = iArr;
        this.zzbcz = objArr;
        this.zzavs = z;
    }

    public final void zzmi() {
        this.zzavs = false;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzum zzum) {
        int i;
        if (zzum.zzol() == zze.zzbbd) {
            for (i = this.count - 1; i >= 0; i--) {
                zzum.zza(this.zzben[i] >>> 3, this.zzbcz[i]);
            }
            return;
        }
        for (i = 0; i < this.count; i++) {
            zzum.zza(this.zzben[i] >>> 3, this.zzbcz[i]);
        }
    }

    public final void zzb(zzum zzum) {
        if (this.count != 0) {
            int i;
            if (zzum.zzol() == zze.zzbbc) {
                for (i = 0; i < this.count; i++) {
                    zzb(this.zzben[i], this.zzbcz[i], zzum);
                }
                return;
            }
            for (i = this.count - 1; i >= 0; i--) {
                zzb(this.zzben[i], this.zzbcz[i], zzum);
            }
        }
    }

    private static void zzb(int i, Object obj, zzum zzum) {
        int i2 = i >>> 3;
        i &= 7;
        if (i == 0) {
            zzum.zzi(i2, ((Long) obj).longValue());
        } else if (i == 1) {
            zzum.zzc(i2, ((Long) obj).longValue());
        } else if (i == 2) {
            zzum.zza(i2, (zzps) obj);
        } else if (i != 3) {
            if (i == 5) {
                zzum.zzh(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzrk.zzpt());
        } else if (zzum.zzol() == zze.zzbbc) {
            zzum.zzbk(i2);
            ((zzts) obj).zzb(zzum);
            zzum.zzbl(i2);
        } else {
            zzum.zzbl(i2);
            ((zzts) obj).zzb(zzum);
            zzum.zzbk(i2);
        }
    }

    public final int zzrl() {
        int i = this.zzbal;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            i2 += zzqj.zzd(this.zzben[i] >>> 3, (zzps) this.zzbcz[i]);
        }
        this.zzbal = i2;
        return i2;
    }

    public final int zzpe() {
        int i = this.zzbal;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            int i3 = this.zzben[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 == 0) {
                i3 = zzqj.zze(i4, ((Long) this.zzbcz[i]).longValue());
            } else if (i3 == 1) {
                i3 = zzqj.zzg(i4, ((Long) this.zzbcz[i]).longValue());
            } else if (i3 == 2) {
                i3 = zzqj.zzc(i4, (zzps) this.zzbcz[i]);
            } else if (i3 == 3) {
                i3 = (zzqj.zzbb(i4) << 1) + ((zzts) this.zzbcz[i]).zzpe();
            } else if (i3 == 5) {
                i3 = zzqj.zzl(i4, ((Integer) this.zzbcz[i]).intValue());
            } else {
                throw new IllegalStateException(zzrk.zzpt());
            }
            i2 += i3;
        }
        this.zzbal = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzts)) {
            return false;
        }
        zzts zzts = (zzts) obj;
        int i = this.count;
        if (i == zzts.count) {
            Object obj2;
            int[] iArr = this.zzben;
            int[] iArr2 = zzts.zzben;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.zzbcz;
                Object[] objArr2 = zzts.zzbcz;
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
        int[] iArr = this.zzben;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        i2 = (i2 + i4) * 31;
        Object[] objArr = this.zzbcz;
        for (int i6 = 0; i6 < this.count; i6++) {
            i3 = (i3 * 31) + objArr[i6].hashCode();
        }
        return i2 + i3;
    }

    /* Access modifiers changed, original: final */
    public final void zza(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzsn.zza(stringBuilder, i, String.valueOf(this.zzben[i2] >>> 3), this.zzbcz[i2]);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(int i, Object obj) {
        if (this.zzavs) {
            int i2;
            int i3 = this.count;
            if (i3 == this.zzben.length) {
                i2 = this.count + (i3 < 4 ? 8 : i3 >> 1);
                this.zzben = Arrays.copyOf(this.zzben, i2);
                this.zzbcz = Arrays.copyOf(this.zzbcz, i2);
            }
            int[] iArr = this.zzben;
            i2 = this.count;
            iArr[i2] = i;
            this.zzbcz[i2] = obj;
            this.count = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
