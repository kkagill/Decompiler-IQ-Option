package com.google.android.gms.internal.gtm;

public final class zzg {

    public static final class zza extends zzuq<zza> {
        public static final zzur<zzl, zza> zzpx = zzur.zza(11, zza.class, 810);
        private static final zza[] zzpy = new zza[0];
        public int[] zzpz;
        public int[] zzqa;
        public int[] zzqb;
        private int zzqc;
        public int[] zzqd;
        public int zzqe;
        private int zzqf;

        public zza() {
            this.zzpz = zzuz.zzbcw;
            this.zzqa = zzuz.zzbcw;
            this.zzqb = zzuz.zzbcw;
            this.zzqc = 0;
            this.zzqd = zzuz.zzbcw;
            this.zzqe = 0;
            this.zzqf = 0;
            this.zzbhb = null;
            this.zzbhl = -1;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (!zzuu.equals(this.zzpz, zza.zzpz) || !zzuu.equals(this.zzqa, zza.zzqa) || !zzuu.equals(this.zzqb, zza.zzqb) || this.zzqc != zza.zzqc || !zzuu.equals(this.zzqd, zza.zzqd) || this.zzqe != zza.zzqe || this.zzqf != zza.zzqf) {
                return false;
            }
            if (this.zzbhb == null || this.zzbhb.isEmpty()) {
                return zza.zzbhb == null || zza.zzbhb.isEmpty();
            } else {
                return this.zzbhb.equals(zza.zzbhb);
            }
        }

        public final int hashCode() {
            int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzuu.hashCode(this.zzpz)) * 31) + zzuu.hashCode(this.zzqa)) * 31) + zzuu.hashCode(this.zzqb)) * 31) + this.zzqc) * 31) + zzuu.hashCode(this.zzqd)) * 31) + this.zzqe) * 31) + this.zzqf) * 31;
            int hashCode2 = (this.zzbhb == null || this.zzbhb.isEmpty()) ? 0 : this.zzbhb.hashCode();
            return hashCode + hashCode2;
        }

        public final void zza(zzuo zzuo) {
            int i;
            int[] iArr;
            int[] iArr2 = this.zzpz;
            int i2 = 0;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                while (true) {
                    iArr = this.zzpz;
                    if (i >= iArr.length) {
                        break;
                    }
                    zzuo.zze(1, iArr[i]);
                    i++;
                }
            }
            iArr2 = this.zzqa;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                while (true) {
                    iArr = this.zzqa;
                    if (i >= iArr.length) {
                        break;
                    }
                    zzuo.zze(2, iArr[i]);
                    i++;
                }
            }
            iArr2 = this.zzqb;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                while (true) {
                    iArr = this.zzqb;
                    if (i >= iArr.length) {
                        break;
                    }
                    zzuo.zze(3, iArr[i]);
                    i++;
                }
            }
            i = this.zzqc;
            if (i != 0) {
                zzuo.zze(4, i);
            }
            iArr2 = this.zzqd;
            if (iArr2 != null && iArr2.length > 0) {
                while (true) {
                    iArr2 = this.zzqd;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    zzuo.zze(5, iArr2[i2]);
                    i2++;
                }
            }
            i = this.zzqe;
            if (i != 0) {
                zzuo.zze(6, i);
            }
            i = this.zzqf;
            if (i != 0) {
                zzuo.zze(7, i);
            }
            super.zza(zzuo);
        }

        /* Access modifiers changed, original: protected|final */
        public final int zzy() {
            int i;
            int i2;
            int[] iArr;
            int zzy = super.zzy();
            int[] iArr2 = this.zzpz;
            int i3 = 0;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                i2 = 0;
                while (true) {
                    iArr = this.zzpz;
                    if (i >= iArr.length) {
                        break;
                    }
                    i2 += zzuo.zzbc(iArr[i]);
                    i++;
                }
                zzy = (zzy + i2) + (iArr.length * 1);
            }
            iArr2 = this.zzqa;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                i2 = 0;
                while (true) {
                    iArr = this.zzqa;
                    if (i >= iArr.length) {
                        break;
                    }
                    i2 += zzuo.zzbc(iArr[i]);
                    i++;
                }
                zzy = (zzy + i2) + (iArr.length * 1);
            }
            iArr2 = this.zzqb;
            if (iArr2 != null && iArr2.length > 0) {
                i = 0;
                i2 = 0;
                while (true) {
                    iArr = this.zzqb;
                    if (i >= iArr.length) {
                        break;
                    }
                    i2 += zzuo.zzbc(iArr[i]);
                    i++;
                }
                zzy = (zzy + i2) + (iArr.length * 1);
            }
            i = this.zzqc;
            if (i != 0) {
                zzy += zzuo.zzi(4, i);
            }
            iArr2 = this.zzqd;
            if (iArr2 != null && iArr2.length > 0) {
                int[] iArr3;
                i = 0;
                while (true) {
                    iArr3 = this.zzqd;
                    if (i3 >= iArr3.length) {
                        break;
                    }
                    i += zzuo.zzbc(iArr3[i3]);
                    i3++;
                }
                zzy = (zzy + i) + (iArr3.length * 1);
            }
            i = this.zzqe;
            if (i != 0) {
                zzy += zzuo.zzi(6, i);
            }
            i = this.zzqf;
            return i != 0 ? zzy + zzuo.zzi(7, i) : zzy;
        }
    }
}
