package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

public final class zzgz extends zzfu<zzgz> implements Cloneable {
    private byte[] zzbjb;
    private String zzbjc;
    private byte[][] zzbjd;
    private boolean zzbje;

    public zzgz() {
        this.zzbjb = zzgb.zzse;
        this.zzbjc = "";
        this.zzbjd = zzgb.zzsd;
        this.zzbje = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    private final zzgz zzgc() {
        try {
            zzgz zzgz = (zzgz) super.clone();
            byte[][] bArr = this.zzbjd;
            if (bArr != null && bArr.length > 0) {
                zzgz.zzbjd = (byte[][]) bArr.clone();
            }
            return zzgz;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return zzgc();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgz = (zzgz) obj;
        if (!Arrays.equals(this.zzbjb, zzgz.zzbjb)) {
            return false;
        }
        String str = this.zzbjc;
        if (str == null) {
            if (zzgz.zzbjc != null) {
                return false;
            }
        } else if (!str.equals(zzgz.zzbjc)) {
            return false;
        }
        return !zzfy.zza(this.zzbjd, zzgz.zzbjd) ? false : (this.zzrj == null || this.zzrj.isEmpty()) ? zzgz.zzrj == null || zzgz.zzrj.isEmpty() : this.zzrj.equals(zzgz.zzrj);
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.zzbjb)) * 31;
        String str = this.zzbjc;
        int i = 0;
        hashCode = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + zzfy.zza(this.zzbjd)) * 31) + 1237) * 31;
        if (!(this.zzrj == null || this.zzrj.isEmpty())) {
            i = this.zzrj.hashCode();
        }
        return hashCode + i;
    }

    public final void zza(zzfs zzfs) {
        if (!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            zzfs.zza(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzfs.zza(2, bArr3);
                }
                i++;
            }
        }
        String str = this.zzbjc;
        if (!(str == null || str.equals(""))) {
            zzfs.zza(4, this.zzbjc);
        }
        super.zza(zzfs);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzen() {
        int zzen = super.zzen();
        if (!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            zzen += zzfs.zzb(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += zzfs.zzh(bArr3);
                }
                i++;
            }
            zzen = (zzen + i2) + (i3 * 1);
        }
        String str = this.zzbjc;
        return (str == null || str.equals("")) ? zzen : zzen + zzfs.zzb(4, this.zzbjc);
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzgz) clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzgz) clone();
    }
}
