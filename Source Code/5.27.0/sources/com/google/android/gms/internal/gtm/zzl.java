package com.google.android.gms.internal.gtm;

public final class zzl extends zzuq<zzl> {
    private static volatile zzl[] zzqm;
    public String string;
    public int type = 1;
    public zzl[] zzqn;
    public zzl[] zzqo;
    public zzl[] zzqp;
    public String zzqq;
    public String zzqr;
    public long zzqs;
    public boolean zzqt;
    public zzl[] zzqu;
    public int[] zzqv;
    public boolean zzqw;

    private static int zzc(int i) {
        if (i > 0 && i <= 17) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum Escaping");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static zzl[] zzaa() {
        if (zzqm == null) {
            synchronized (zzuu.zzbhk) {
                if (zzqm == null) {
                    zzqm = new zzl[0];
                }
            }
        }
        return zzqm;
    }

    public zzl() {
        String str = "";
        this.string = str;
        this.zzqn = zzaa();
        this.zzqo = zzaa();
        this.zzqp = zzaa();
        this.zzqq = str;
        this.zzqr = str;
        this.zzqs = 0;
        this.zzqt = false;
        this.zzqu = zzaa();
        this.zzqv = zzuz.zzbcw;
        this.zzqw = false;
        this.zzbhb = null;
        this.zzbhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzl = (zzl) obj;
        if (this.type != zzl.type) {
            return false;
        }
        String str = this.string;
        if (str == null) {
            if (zzl.string != null) {
                return false;
            }
        } else if (!str.equals(zzl.string)) {
            return false;
        }
        if (!zzuu.equals(this.zzqn, zzl.zzqn) || !zzuu.equals(this.zzqo, zzl.zzqo) || !zzuu.equals(this.zzqp, zzl.zzqp)) {
            return false;
        }
        str = this.zzqq;
        if (str == null) {
            if (zzl.zzqq != null) {
                return false;
            }
        } else if (!str.equals(zzl.zzqq)) {
            return false;
        }
        str = this.zzqr;
        if (str == null) {
            if (zzl.zzqr != null) {
                return false;
            }
        } else if (!str.equals(zzl.zzqr)) {
            return false;
        }
        if (this.zzqs != zzl.zzqs || this.zzqt != zzl.zzqt || !zzuu.equals(this.zzqu, zzl.zzqu) || !zzuu.equals(this.zzqv, zzl.zzqv) || this.zzqw != zzl.zzqw) {
            return false;
        }
        if (this.zzbhb == null || this.zzbhb.isEmpty()) {
            return zzl.zzbhb == null || zzl.zzbhb.isEmpty();
        } else {
            return this.zzbhb.equals(zzl.zzbhb);
        }
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.type) * 31;
        String str = this.string;
        int i = 0;
        hashCode = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + zzuu.hashCode(this.zzqn)) * 31) + zzuu.hashCode(this.zzqo)) * 31) + zzuu.hashCode(this.zzqp)) * 31;
        str = this.zzqq;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.zzqr;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        long j = this.zzqs;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = 1231;
        hashCode = (((((hashCode + (this.zzqt ? 1231 : 1237)) * 31) + zzuu.hashCode(this.zzqu)) * 31) + zzuu.hashCode(this.zzqv)) * 31;
        if (!this.zzqw) {
            i2 = 1237;
        }
        hashCode = (hashCode + i2) * 31;
        if (!(this.zzbhb == null || this.zzbhb.isEmpty())) {
            i = this.zzbhb.hashCode();
        }
        return hashCode + i;
    }

    public final void zza(zzuo zzuo) {
        int i;
        zzl[] zzlArr;
        zzuw zzuw;
        zzuo.zze(1, this.type);
        String str = this.string;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzuo.zza(2, this.string);
        }
        zzl[] zzlArr2 = this.zzqn;
        int i2 = 0;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = 0;
            while (true) {
                zzlArr = this.zzqn;
                if (i >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[i];
                if (zzuw != null) {
                    zzuo.zza(3, zzuw);
                }
                i++;
            }
        }
        zzlArr2 = this.zzqo;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = 0;
            while (true) {
                zzlArr = this.zzqo;
                if (i >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[i];
                if (zzuw != null) {
                    zzuo.zza(4, zzuw);
                }
                i++;
            }
        }
        zzlArr2 = this.zzqp;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = 0;
            while (true) {
                zzlArr = this.zzqp;
                if (i >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[i];
                if (zzuw != null) {
                    zzuo.zza(5, zzuw);
                }
                i++;
            }
        }
        str = this.zzqq;
        if (!(str == null || str.equals(str2))) {
            zzuo.zza(6, this.zzqq);
        }
        str = this.zzqr;
        if (!(str == null || str.equals(str2))) {
            zzuo.zza(7, this.zzqr);
        }
        long j = this.zzqs;
        if (j != 0) {
            zzuo.zzi(8, j);
        }
        boolean z = this.zzqw;
        if (z) {
            zzuo.zzb(9, z);
        }
        int[] iArr = this.zzqv;
        if (iArr != null && iArr.length > 0) {
            i = 0;
            while (true) {
                int[] iArr2 = this.zzqv;
                if (i >= iArr2.length) {
                    break;
                }
                zzuo.zze(10, iArr2[i]);
                i++;
            }
        }
        zzlArr2 = this.zzqu;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            while (true) {
                zzlArr2 = this.zzqu;
                if (i2 >= zzlArr2.length) {
                    break;
                }
                zzuw zzuw2 = zzlArr2[i2];
                if (zzuw2 != null) {
                    zzuo.zza(11, zzuw2);
                }
                i2++;
            }
        }
        z = this.zzqt;
        if (z) {
            zzuo.zzb(12, z);
        }
        super.zza(zzuo);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzy() {
        int i;
        zzl[] zzlArr;
        zzuw zzuw;
        int zzy = super.zzy() + zzuo.zzi(1, this.type);
        String str = this.string;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            zzy += zzuo.zzb(2, this.string);
        }
        zzl[] zzlArr2 = this.zzqn;
        int i2 = 0;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzlArr = this.zzqn;
                if (zzy >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[zzy];
                if (zzuw != null) {
                    i += zzuo.zzb(3, zzuw);
                }
                zzy++;
            }
            zzy = i;
        }
        zzlArr2 = this.zzqo;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzlArr = this.zzqo;
                if (zzy >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[zzy];
                if (zzuw != null) {
                    i += zzuo.zzb(4, zzuw);
                }
                zzy++;
            }
            zzy = i;
        }
        zzlArr2 = this.zzqp;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            i = zzy;
            zzy = 0;
            while (true) {
                zzlArr = this.zzqp;
                if (zzy >= zzlArr.length) {
                    break;
                }
                zzuw = zzlArr[zzy];
                if (zzuw != null) {
                    i += zzuo.zzb(5, zzuw);
                }
                zzy++;
            }
            zzy = i;
        }
        str = this.zzqq;
        if (!(str == null || str.equals(str2))) {
            zzy += zzuo.zzb(6, this.zzqq);
        }
        str = this.zzqr;
        if (!(str == null || str.equals(str2))) {
            zzy += zzuo.zzb(7, this.zzqr);
        }
        long j = this.zzqs;
        if (j != 0) {
            zzy += zzuo.zzd(8, j);
        }
        if (this.zzqw) {
            zzy += zzuo.zzbb(9) + 1;
        }
        int[] iArr = this.zzqv;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            i = 0;
            int i3 = 0;
            while (true) {
                iArr2 = this.zzqv;
                if (i >= iArr2.length) {
                    break;
                }
                i3 += zzuo.zzbc(iArr2[i]);
                i++;
            }
            zzy = (zzy + i3) + (iArr2.length * 1);
        }
        zzlArr2 = this.zzqu;
        if (zzlArr2 != null && zzlArr2.length > 0) {
            while (true) {
                zzlArr2 = this.zzqu;
                if (i2 >= zzlArr2.length) {
                    break;
                }
                zzuw zzuw2 = zzlArr2[i2];
                if (zzuw2 != null) {
                    zzy += zzuo.zzb(11, zzuw2);
                }
                i2++;
            }
        }
        return this.zzqt ? zzy + (zzuo.zzbb(12) + 1) : zzy;
    }

    private final zzl zzb(zzun zzun) {
        int zzoa;
        StringBuilder stringBuilder;
        while (true) {
            int zzni = zzun.zzni();
            zzl[] zzlArr;
            int length;
            zzl[] zzlArr2;
            int[] iArr;
            int i;
            switch (zzni) {
                case 0:
                    return this;
                case 8:
                    try {
                        zzoa = zzun.zzoa();
                        if (zzoa > 0 && zzoa <= 8) {
                            this.type = zzoa;
                            break;
                        }
                        stringBuilder = new StringBuilder(36);
                        stringBuilder.append(zzoa);
                        stringBuilder.append(" is not a valid enum Type");
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzun.zzbz(zzun.getPosition());
                        zza(zzun, zzni);
                        break;
                    }
                case 18:
                    this.string = zzun.readString();
                    break;
                case 26:
                    zzni = zzuz.zzb(zzun, 26);
                    zzlArr = this.zzqn;
                    length = zzlArr == null ? 0 : zzlArr.length;
                    zzlArr2 = new zzl[(zzni + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzqn, 0, zzlArr2, 0, length);
                    }
                    while (length < zzlArr2.length - 1) {
                        zzlArr2[length] = new zzl();
                        zzun.zza(zzlArr2[length]);
                        zzun.zzni();
                        length++;
                    }
                    zzlArr2[length] = new zzl();
                    zzun.zza(zzlArr2[length]);
                    this.zzqn = zzlArr2;
                    break;
                case 34:
                    zzni = zzuz.zzb(zzun, 34);
                    zzlArr = this.zzqo;
                    length = zzlArr == null ? 0 : zzlArr.length;
                    zzlArr2 = new zzl[(zzni + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzqo, 0, zzlArr2, 0, length);
                    }
                    while (length < zzlArr2.length - 1) {
                        zzlArr2[length] = new zzl();
                        zzun.zza(zzlArr2[length]);
                        zzun.zzni();
                        length++;
                    }
                    zzlArr2[length] = new zzl();
                    zzun.zza(zzlArr2[length]);
                    this.zzqo = zzlArr2;
                    break;
                case 42:
                    zzni = zzuz.zzb(zzun, 42);
                    zzlArr = this.zzqp;
                    length = zzlArr == null ? 0 : zzlArr.length;
                    zzlArr2 = new zzl[(zzni + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzqp, 0, zzlArr2, 0, length);
                    }
                    while (length < zzlArr2.length - 1) {
                        zzlArr2[length] = new zzl();
                        zzun.zza(zzlArr2[length]);
                        zzun.zzni();
                        length++;
                    }
                    zzlArr2[length] = new zzl();
                    zzun.zza(zzlArr2[length]);
                    this.zzqp = zzlArr2;
                    break;
                case 50:
                    this.zzqq = zzun.readString();
                    break;
                case 58:
                    this.zzqr = zzun.readString();
                    break;
                case 64:
                    this.zzqs = zzun.zzob();
                    break;
                case 72:
                    this.zzqw = zzun.zzno();
                    break;
                case 80:
                    length = zzuz.zzb(zzun, 80);
                    iArr = new int[length];
                    int i2 = 0;
                    for (i = 0; i < length; i++) {
                        if (i != 0) {
                            zzun.zzni();
                        }
                        int position = zzun.getPosition();
                        try {
                            iArr[i2] = zzc(zzun.zzoa());
                            i2++;
                        } catch (IllegalArgumentException unused2) {
                            zzun.zzbz(position);
                            zza(zzun, zzni);
                        }
                    }
                    if (i2 == 0) {
                        break;
                    }
                    int[] iArr2 = this.zzqv;
                    zzni = iArr2 == null ? 0 : iArr2.length;
                    if (zzni != 0 || i2 != iArr.length) {
                        int[] iArr3 = new int[(zzni + i2)];
                        if (zzni != 0) {
                            System.arraycopy(this.zzqv, 0, iArr3, 0, zzni);
                        }
                        System.arraycopy(iArr, 0, iArr3, zzni, i2);
                        this.zzqv = iArr3;
                        break;
                    }
                    this.zzqv = iArr;
                    break;
                case 82:
                    zzni = zzun.zzaq(zzun.zzoa());
                    int position2 = zzun.getPosition();
                    i = 0;
                    while (zzun.zzrv() > 0) {
                        try {
                            zzc(zzun.zzoa());
                            i++;
                        } catch (IllegalArgumentException unused3) {
                        }
                    }
                    if (i != 0) {
                        zzun.zzbz(position2);
                        iArr = this.zzqv;
                        position2 = iArr == null ? 0 : iArr.length;
                        int[] iArr4 = new int[(i + position2)];
                        if (position2 != 0) {
                            System.arraycopy(this.zzqv, 0, iArr4, 0, position2);
                        }
                        while (zzun.zzrv() > 0) {
                            zzoa = zzun.getPosition();
                            try {
                                iArr4[position2] = zzc(zzun.zzoa());
                                position2++;
                            } catch (IllegalArgumentException unused4) {
                                zzun.zzbz(zzoa);
                                zza(zzun, 80);
                            }
                        }
                        this.zzqv = iArr4;
                    }
                    zzun.zzar(zzni);
                    break;
                case 90:
                    zzni = zzuz.zzb(zzun, 90);
                    zzlArr = this.zzqu;
                    length = zzlArr == null ? 0 : zzlArr.length;
                    zzlArr2 = new zzl[(zzni + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzqu, 0, zzlArr2, 0, length);
                    }
                    while (length < zzlArr2.length - 1) {
                        zzlArr2[length] = new zzl();
                        zzun.zza(zzlArr2[length]);
                        zzun.zzni();
                        length++;
                    }
                    zzlArr2[length] = new zzl();
                    zzun.zza(zzlArr2[length]);
                    this.zzqu = zzlArr2;
                    break;
                case 96:
                    this.zzqt = zzun.zzno();
                    break;
                default:
                    if (super.zza(zzun, zzni)) {
                        break;
                    }
                    return this;
            }
        }
        stringBuilder = new StringBuilder(36);
        stringBuilder.append(zzoa);
        stringBuilder.append(" is not a valid enum Type");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
