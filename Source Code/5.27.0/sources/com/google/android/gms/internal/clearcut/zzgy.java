package com.google.android.gms.internal.clearcut;

public final class zzgy extends zzfu<zzgy> implements Cloneable {
    private String[] zzbiw;
    private String[] zzbix;
    private int[] zzbiy;
    private long[] zzbiz;
    private long[] zzbja;

    public zzgy() {
        this.zzbiw = zzgb.zzsc;
        this.zzbix = zzgb.zzsc;
        this.zzbiy = zzgb.zzrx;
        this.zzbiz = zzgb.zzry;
        this.zzbja = zzgb.zzry;
        this.zzrj = null;
        this.zzrs = -1;
    }

    private final zzgy zzgb() {
        try {
            zzgy zzgy = (zzgy) super.clone();
            String[] strArr = this.zzbiw;
            if (strArr != null && strArr.length > 0) {
                zzgy.zzbiw = (String[]) strArr.clone();
            }
            strArr = this.zzbix;
            if (strArr != null && strArr.length > 0) {
                zzgy.zzbix = (String[]) strArr.clone();
            }
            int[] iArr = this.zzbiy;
            if (iArr != null && iArr.length > 0) {
                zzgy.zzbiy = (int[]) iArr.clone();
            }
            long[] jArr = this.zzbiz;
            if (jArr != null && jArr.length > 0) {
                zzgy.zzbiz = (long[]) jArr.clone();
            }
            jArr = this.zzbja;
            if (jArr != null && jArr.length > 0) {
                zzgy.zzbja = (long[]) jArr.clone();
            }
            return zzgy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return zzgb();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgy)) {
            return false;
        }
        zzgy zzgy = (zzgy) obj;
        return (zzfy.equals(this.zzbiw, zzgy.zzbiw) && zzfy.equals(this.zzbix, zzgy.zzbix) && zzfy.equals(this.zzbiy, zzgy.zzbiy) && zzfy.equals(this.zzbiz, zzgy.zzbiz) && zzfy.equals(this.zzbja, zzgy.zzbja)) ? (this.zzrj == null || this.zzrj.isEmpty()) ? zzgy.zzrj == null || zzgy.zzrj.isEmpty() : this.zzrj.equals(zzgy.zzrj) : false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + zzfy.hashCode(this.zzbiw)) * 31) + zzfy.hashCode(this.zzbix)) * 31) + zzfy.hashCode(this.zzbiy)) * 31) + zzfy.hashCode(this.zzbiz)) * 31) + zzfy.hashCode(this.zzbja)) * 31;
        int hashCode2 = (this.zzrj == null || this.zzrj.isEmpty()) ? 0 : this.zzrj.hashCode();
        return hashCode + hashCode2;
    }

    public final void zza(zzfs zzfs) {
        int i;
        String[] strArr;
        String str;
        String[] strArr2 = this.zzbiw;
        int i2 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.zzbiw;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    zzfs.zza(1, str);
                }
                i++;
            }
        }
        strArr2 = this.zzbix;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.zzbix;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    zzfs.zza(2, str);
                }
                i++;
            }
        }
        int[] iArr = this.zzbiy;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            while (true) {
                int[] iArr2 = this.zzbiy;
                if (i >= iArr2.length) {
                    break;
                }
                zzfs.zzc(3, iArr2[i]);
                i++;
            }
        }
        long[] jArr = this.zzbiz;
        if (jArr != null && jArr.length > 0) {
            i = 0;
            while (true) {
                long[] jArr2 = this.zzbiz;
                if (i >= jArr2.length) {
                    break;
                }
                zzfs.zzi(4, jArr2[i]);
                i++;
            }
        }
        jArr = this.zzbja;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                jArr = this.zzbja;
                if (i2 >= jArr.length) {
                    break;
                }
                zzfs.zzi(5, jArr[i2]);
                i2++;
            }
        }
        super.zza(zzfs);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzen() {
        int i;
        int i2;
        int i3;
        String[] strArr;
        String str;
        int zzen = super.zzen();
        String[] strArr2 = this.zzbiw;
        int i4 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.zzbiw;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += zzfs.zzh(str);
                }
                i++;
            }
            zzen = (zzen + i2) + (i3 * 1);
        }
        strArr2 = this.zzbix;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.zzbix;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += zzfs.zzh(str);
                }
                i++;
            }
            zzen = (zzen + i2) + (i3 * 1);
        }
        int[] iArr = this.zzbiy;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            i = 0;
            i2 = 0;
            while (true) {
                iArr2 = this.zzbiy;
                if (i >= iArr2.length) {
                    break;
                }
                i2 += zzfs.zzs(iArr2[i]);
                i++;
            }
            zzen = (zzen + i2) + (iArr2.length * 1);
        }
        long[] jArr = this.zzbiz;
        if (jArr != null && jArr.length > 0) {
            long[] jArr2;
            i = 0;
            i2 = 0;
            while (true) {
                jArr2 = this.zzbiz;
                if (i >= jArr2.length) {
                    break;
                }
                i2 += zzfs.zzo(jArr2[i]);
                i++;
            }
            zzen = (zzen + i2) + (jArr2.length * 1);
        }
        jArr = this.zzbja;
        if (jArr == null || jArr.length <= 0) {
            return zzen;
        }
        i = 0;
        while (true) {
            long[] jArr3 = this.zzbja;
            if (i4 >= jArr3.length) {
                return (zzen + i) + (jArr3.length * 1);
            }
            i += zzfs.zzo(jArr3[i4]);
            i4++;
        }
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzgy) clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzgy) clone();
    }
}
