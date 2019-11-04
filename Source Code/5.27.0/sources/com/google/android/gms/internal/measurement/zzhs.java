package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey.zzd;
import java.util.Arrays;

public final class zzhs {
    private static final zzhs zzaly = new zzhs(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzacz;
    private int zzaia;
    private Object[] zzakk;
    private int[] zzalz;

    public static zzhs zzwq() {
        return zzaly;
    }

    static zzhs zzwr() {
        return new zzhs();
    }

    static zzhs zza(zzhs zzhs, zzhs zzhs2) {
        int i = zzhs.count + zzhs2.count;
        int[] copyOf = Arrays.copyOf(zzhs.zzalz, i);
        System.arraycopy(zzhs2.zzalz, 0, copyOf, zzhs.count, zzhs2.count);
        Object[] copyOf2 = Arrays.copyOf(zzhs.zzakk, i);
        System.arraycopy(zzhs2.zzakk, 0, copyOf2, zzhs.count, zzhs2.count);
        return new zzhs(i, copyOf, copyOf2, true);
    }

    private zzhs() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhs(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzaia = -1;
        this.count = i;
        this.zzalz = iArr;
        this.zzakk = objArr;
        this.zzacz = z;
    }

    public final void zzry() {
        this.zzacz = false;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzim zzim) {
        int i;
        if (zzim.zztk() == zzd.zzaip) {
            for (i = this.count - 1; i >= 0; i--) {
                zzim.zza(this.zzalz[i] >>> 3, this.zzakk[i]);
            }
            return;
        }
        for (i = 0; i < this.count; i++) {
            zzim.zza(this.zzalz[i] >>> 3, this.zzakk[i]);
        }
    }

    public final void zzb(zzim zzim) {
        if (this.count != 0) {
            int i;
            if (zzim.zztk() == zzd.zzaio) {
                for (i = 0; i < this.count; i++) {
                    zzb(this.zzalz[i], this.zzakk[i], zzim);
                }
                return;
            }
            for (i = this.count - 1; i >= 0; i--) {
                zzb(this.zzalz[i], this.zzakk[i], zzim);
            }
        }
    }

    private static void zzb(int i, Object obj, zzim zzim) {
        int i2 = i >>> 3;
        i &= 7;
        if (i == 0) {
            zzim.zzi(i2, ((Long) obj).longValue());
        } else if (i == 1) {
            zzim.zzc(i2, ((Long) obj).longValue());
        } else if (i == 2) {
            zzim.zza(i2, (zzdp) obj);
        } else if (i != 3) {
            if (i == 5) {
                zzim.zzf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfi.zzuy());
        } else if (zzim.zztk() == zzd.zzaio) {
            zzim.zzbr(i2);
            ((zzhs) obj).zzb(zzim);
            zzim.zzbs(i2);
        } else {
            zzim.zzbs(i2);
            ((zzhs) obj).zzb(zzim);
            zzim.zzbr(i2);
        }
    }

    public final int zzws() {
        int i = this.zzaia;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            i2 += zzee.zzd(this.zzalz[i] >>> 3, (zzdp) this.zzakk[i]);
        }
        this.zzaia = i2;
        return i2;
    }

    public final int zzuk() {
        int i = this.zzaia;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            int i3 = this.zzalz[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 == 0) {
                i3 = zzee.zze(i4, ((Long) this.zzakk[i]).longValue());
            } else if (i3 == 1) {
                i3 = zzee.zzg(i4, ((Long) this.zzakk[i]).longValue());
            } else if (i3 == 2) {
                i3 = zzee.zzc(i4, (zzdp) this.zzakk[i]);
            } else if (i3 == 3) {
                i3 = (zzee.zzbi(i4) << 1) + ((zzhs) this.zzakk[i]).zzuk();
            } else if (i3 == 5) {
                i3 = zzee.zzj(i4, ((Integer) this.zzakk[i]).intValue());
            } else {
                throw new IllegalStateException(zzfi.zzuy());
            }
            i2 += i3;
        }
        this.zzaia = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhs)) {
            return false;
        }
        zzhs zzhs = (zzhs) obj;
        int i = this.count;
        if (i == zzhs.count) {
            Object obj2;
            int[] iArr = this.zzalz;
            int[] iArr2 = zzhs.zzalz;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.zzakk;
                Object[] objArr2 = zzhs.zzakk;
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
        int[] iArr = this.zzalz;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        i2 = (i2 + i4) * 31;
        Object[] objArr = this.zzakk;
        for (int i6 = 0; i6 < this.count; i6++) {
            i3 = (i3 * 31) + objArr[i6].hashCode();
        }
        return i2 + i3;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzgj.zzb(stringBuilder, i, String.valueOf(this.zzalz[i2] >>> 3), this.zzakk[i2]);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzb(int i, Object obj) {
        if (this.zzacz) {
            int i2;
            int i3 = this.count;
            if (i3 == this.zzalz.length) {
                i2 = this.count + (i3 < 4 ? 8 : i3 >> 1);
                this.zzalz = Arrays.copyOf(this.zzalz, i2);
                this.zzakk = Arrays.copyOf(this.zzakk, i2);
            }
            int[] iArr = this.zzalz;
            i2 = this.count;
            iArr[i2] = i;
            this.zzakk[i2] = obj;
            this.count = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
