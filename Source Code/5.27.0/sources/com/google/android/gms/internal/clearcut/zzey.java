package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg.zzg;
import java.util.Arrays;

public final class zzey {
    private static final zzey zzoz = new zzey(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzfa;
    private int zzjq;
    private Object[] zzmj;
    private int[] zzpa;

    private zzey() {
        this(0, new int[8], new Object[8], true);
    }

    private zzey(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzjq = -1;
        this.count = i;
        this.zzpa = iArr;
        this.zzmj = objArr;
        this.zzfa = z;
    }

    static zzey zza(zzey zzey, zzey zzey2) {
        int i = zzey.count + zzey2.count;
        int[] copyOf = Arrays.copyOf(zzey.zzpa, i);
        System.arraycopy(zzey2.zzpa, 0, copyOf, zzey.count, zzey2.count);
        Object[] copyOf2 = Arrays.copyOf(zzey.zzmj, i);
        System.arraycopy(zzey2.zzmj, 0, copyOf2, zzey.count, zzey2.count);
        return new zzey(i, copyOf, copyOf2, true);
    }

    private static void zzb(int i, Object obj, zzfr zzfr) {
        int i2 = i >>> 3;
        i &= 7;
        if (i == 0) {
            zzfr.zzi(i2, ((Long) obj).longValue());
        } else if (i == 1) {
            zzfr.zzc(i2, ((Long) obj).longValue());
        } else if (i == 2) {
            zzfr.zza(i2, (zzbb) obj);
        } else if (i != 3) {
            if (i == 5) {
                zzfr.zzf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzco.zzbn());
        } else if (zzfr.zzaj() == zzg.zzko) {
            zzfr.zzaa(i2);
            ((zzey) obj).zzb(zzfr);
            zzfr.zzab(i2);
        } else {
            zzfr.zzab(i2);
            ((zzey) obj).zzb(zzfr);
            zzfr.zzaa(i2);
        }
    }

    public static zzey zzea() {
        return zzoz;
    }

    static zzey zzeb() {
        return new zzey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzey)) {
            return false;
        }
        zzey zzey = (zzey) obj;
        int i = this.count;
        if (i == zzey.count) {
            Object obj2;
            int[] iArr = this.zzpa;
            int[] iArr2 = zzey.zzpa;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.zzmj;
                Object[] objArr2 = zzey.zzmj;
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
        int[] iArr = this.zzpa;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        i2 = (i2 + i4) * 31;
        Object[] objArr = this.zzmj;
        for (int i6 = 0; i6 < this.count; i6++) {
            i3 = (i3 * 31) + objArr[i6].hashCode();
        }
        return i2 + i3;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzfr zzfr) {
        int i;
        if (zzfr.zzaj() == zzg.zzkp) {
            for (i = this.count - 1; i >= 0; i--) {
                zzfr.zza(this.zzpa[i] >>> 3, this.zzmj[i]);
            }
            return;
        }
        for (i = 0; i < this.count; i++) {
            zzfr.zza(this.zzpa[i] >>> 3, this.zzmj[i]);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzdr.zza(stringBuilder, i, String.valueOf(this.zzpa[i2] >>> 3), this.zzmj[i2]);
        }
    }

    public final int zzas() {
        int i = this.zzjq;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            int i3 = this.zzpa[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 == 0) {
                i3 = zzbn.zze(i4, ((Long) this.zzmj[i]).longValue());
            } else if (i3 == 1) {
                i3 = zzbn.zzg(i4, ((Long) this.zzmj[i]).longValue());
            } else if (i3 == 2) {
                i3 = zzbn.zzc(i4, (zzbb) this.zzmj[i]);
            } else if (i3 == 3) {
                i3 = (zzbn.zzr(i4) << 1) + ((zzey) this.zzmj[i]).zzas();
            } else if (i3 == 5) {
                i3 = zzbn.zzj(i4, ((Integer) this.zzmj[i]).intValue());
            } else {
                throw new IllegalStateException(zzco.zzbn());
            }
            i2 += i3;
        }
        this.zzjq = i2;
        return i2;
    }

    /* Access modifiers changed, original: final */
    public final void zzb(int i, Object obj) {
        if (this.zzfa) {
            int i2;
            int i3 = this.count;
            if (i3 == this.zzpa.length) {
                i2 = this.count + (i3 < 4 ? 8 : i3 >> 1);
                this.zzpa = Arrays.copyOf(this.zzpa, i2);
                this.zzmj = Arrays.copyOf(this.zzmj, i2);
            }
            int[] iArr = this.zzpa;
            i2 = this.count;
            iArr[i2] = i;
            this.zzmj[i2] = obj;
            this.count = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzb(zzfr zzfr) {
        if (this.count != 0) {
            int i;
            if (zzfr.zzaj() == zzg.zzko) {
                for (i = 0; i < this.count; i++) {
                    zzb(this.zzpa[i], this.zzmj[i], zzfr);
                }
                return;
            }
            for (i = this.count - 1; i >= 0; i--) {
                zzb(this.zzpa[i], this.zzmj[i], zzfr);
            }
        }
    }

    public final int zzec() {
        int i = this.zzjq;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            i2 += zzbn.zzd(this.zzpa[i] >>> 3, (zzbb) this.zzmj[i]);
        }
        this.zzjq = i2;
        return i2;
    }

    public final void zzv() {
        this.zzfa = false;
    }
}
