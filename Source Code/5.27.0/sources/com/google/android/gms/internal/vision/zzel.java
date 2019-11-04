package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.util.List;

final class zzel extends zzej {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private int tag;
    private final boolean zzrs = true;
    private final int zzrt;
    private int zzru;

    public zzel(ByteBuffer byteBuffer, boolean z) {
        super();
        this.buffer = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        this.pos = arrayOffset;
        this.zzrt = arrayOffset;
        this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final boolean zzcm() {
        return this.pos == this.limit;
    }

    public final int zzcn() {
        if (zzcm()) {
            return Integer.MAX_VALUE;
        }
        this.tag = zzdd();
        int i = this.tag;
        if (i == this.zzru) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzco() {
        int i = 0;
        if (!zzcm()) {
            int i2 = this.tag;
            int i3 = this.zzru;
            if (i2 != i3) {
                int i4 = i2 & 7;
                if (i4 == 0) {
                    i2 = this.limit;
                    i3 = this.pos;
                    if (i2 - i3 >= 10) {
                        byte[] bArr = this.buffer;
                        int i5 = i3;
                        i3 = 0;
                        while (i3 < 10) {
                            int i6 = i5 + 1;
                            if (bArr[i5] >= (byte) 0) {
                                this.pos = i6;
                                break;
                            }
                            i3++;
                            i5 = i6;
                        }
                    }
                    while (i < 10) {
                        if (readByte() >= (byte) 0) {
                            return true;
                        }
                        i++;
                    }
                    throw zzgf.zzfj();
                } else if (i4 == 1) {
                    zzz(8);
                    return true;
                } else if (i4 == 2) {
                    zzz(zzdd());
                    return true;
                } else if (i4 == 3) {
                    this.zzru = ((i2 >>> 3) << 3) | 4;
                    while (zzcn() != Integer.MAX_VALUE) {
                        if (!zzco()) {
                            break;
                        }
                    }
                    if (this.tag == this.zzru) {
                        this.zzru = i3;
                        return true;
                    }
                    throw zzgf.zzfo();
                } else if (i4 == 5) {
                    zzz(4);
                    return true;
                } else {
                    throw zzgf.zzfm();
                }
            }
        }
        return false;
    }

    public final double readDouble() {
        zzab(1);
        return Double.longBitsToDouble(zzdh());
    }

    public final float readFloat() {
        zzab(5);
        return Float.intBitsToFloat(zzdg());
    }

    public final long zzcp() {
        zzab(0);
        return zzde();
    }

    public final long zzcq() {
        zzab(0);
        return zzde();
    }

    public final int zzcr() {
        zzab(0);
        return zzdd();
    }

    public final long zzcs() {
        zzab(1);
        return zzdh();
    }

    public final int zzct() {
        zzab(5);
        return zzdg();
    }

    public final boolean zzcu() {
        zzab(0);
        if (zzdd() != 0) {
            return true;
        }
        return false;
    }

    public final String readString() {
        return zzg(false);
    }

    public final String zzcv() {
        return zzg(true);
    }

    private final String zzg(boolean z) {
        zzab(2);
        int zzdd = zzdd();
        if (zzdd == 0) {
            return "";
        }
        zzaa(zzdd);
        if (z) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            if (!zziw.zzg(bArr, i, i + zzdd)) {
                throw zzgf.zzfp();
            }
        }
        String str = new String(this.buffer, this.pos, zzdd, zzga.UTF_8);
        this.pos += zzdd;
        return str;
    }

    public final <T> T zza(Class<T> cls, zzfk zzfk) {
        zzab(2);
        return zzb(zzhs.zzgl().zzf(cls), zzfk);
    }

    public final <T> T zza(zzhw<T> zzhw, zzfk zzfk) {
        zzab(2);
        return zzb((zzhw) zzhw, zzfk);
    }

    private final <T> T zzb(zzhw<T> zzhw, zzfk zzfk) {
        T zzdd = zzdd();
        zzaa(zzdd);
        int i = this.limit;
        int i2 = this.pos + zzdd;
        this.limit = i2;
        try {
            zzdd = zzhw.newInstance();
            zzhw.zza(zzdd, this, zzfk);
            zzhw.zze(zzdd);
            if (this.pos == i2) {
                return zzdd;
            }
            throw zzgf.zzfo();
        } finally {
            this.limit = i;
        }
    }

    public final <T> T zzb(Class<T> cls, zzfk zzfk) {
        zzab(3);
        return zzd(zzhs.zzgl().zzf(cls), zzfk);
    }

    public final <T> T zzc(zzhw<T> zzhw, zzfk zzfk) {
        zzab(3);
        return zzd(zzhw, zzfk);
    }

    private final <T> T zzd(zzhw<T> zzhw, zzfk zzfk) {
        int i = this.zzru;
        T t = ((this.tag >>> 3) << 3) | 4;
        this.zzru = t;
        try {
            t = zzhw.newInstance();
            zzhw.zza(t, this, zzfk);
            zzhw.zze(t);
            if (this.tag == this.zzru) {
                return t;
            }
            throw zzgf.zzfo();
        } finally {
            this.zzru = i;
        }
    }

    public final zzeo zzcw() {
        zzab(2);
        int zzdd = zzdd();
        if (zzdd == 0) {
            return zzeo.zzrx;
        }
        zzeo zzc;
        zzaa(zzdd);
        if (this.zzrs) {
            zzc = zzeo.zzc(this.buffer, this.pos, zzdd);
        } else {
            zzc = zzeo.zzb(this.buffer, this.pos, zzdd);
        }
        this.pos += zzdd;
        return zzc;
    }

    public final int zzcx() {
        zzab(0);
        return zzdd();
    }

    public final int zzcy() {
        zzab(0);
        return zzdd();
    }

    public final int zzcz() {
        zzab(5);
        return zzdg();
    }

    public final long zzda() {
        zzab(1);
        return zzdh();
    }

    public final int zzdb() {
        zzab(0);
        return zzez.zzaq(zzdd());
    }

    public final long zzdc() {
        zzab(0);
        return zzez.zzd(zzde());
    }

    public final void zza(List<Double> list) {
        int i;
        if (list instanceof zzfh) {
            zzfh zzfh = (zzfh) list;
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    zzfh.zzc(readDouble());
                    if (!zzcm()) {
                        i2 = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i2;
                return;
            } else if (i2 == 2) {
                i2 = zzdd();
                zzac(i2);
                i = this.pos + i2;
                while (this.pos < i) {
                    zzfh.zzc(Double.longBitsToDouble(zzdj()));
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i3 = this.tag & 7;
        if (i3 == 1) {
            do {
                list.add(Double.valueOf(readDouble()));
                if (!zzcm()) {
                    i3 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i3;
        } else if (i3 == 2) {
            i3 = zzdd();
            zzac(i3);
            i = this.pos + i3;
            while (this.pos < i) {
                list.add(Double.valueOf(Double.longBitsToDouble(zzdj())));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzb(List<Float> list) {
        int i;
        int i2;
        if (list instanceof zzfv) {
            zzfv zzfv = (zzfv) list;
            i = this.tag & 7;
            if (i == 2) {
                i = zzdd();
                zzad(i);
                i2 = this.pos + i;
                while (this.pos < i2) {
                    zzfv.zzh(Float.intBitsToFloat(zzdi()));
                }
                return;
            } else if (i == 5) {
                do {
                    zzfv.zzh(readFloat());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        i = this.tag & 7;
        if (i == 2) {
            i = zzdd();
            zzad(i);
            i2 = this.pos + i;
            while (this.pos < i2) {
                list.add(Float.valueOf(Float.intBitsToFloat(zzdi())));
            }
        } else if (i == 5) {
            do {
                list.add(Float.valueOf(readFloat()));
                if (!zzcm()) {
                    i = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i;
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzc(List<Long> list) {
        int zzdd;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(zzcp());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzgt.zzp(zzde());
                }
                zzae(zzdd);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(zzcp()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Long.valueOf(zzde()));
            }
            zzae(zzdd);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzd(List<Long> list) {
        int zzdd;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(zzcq());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzgt.zzp(zzde());
                }
                zzae(zzdd);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(zzcq()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Long.valueOf(zzde()));
            }
            zzae(zzdd);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zze(List<Integer> list) {
        int zzdd;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(zzcr());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzfz.zzbg(zzdd());
                }
                zzae(zzdd);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(zzcr()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Integer.valueOf(zzdd()));
            }
            zzae(zzdd);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzf(List<Long> list) {
        int i;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    zzgt.zzp(zzcs());
                    if (!zzcm()) {
                        i2 = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i2;
                return;
            } else if (i2 == 2) {
                i2 = zzdd();
                zzac(i2);
                i = this.pos + i2;
                while (this.pos < i) {
                    zzgt.zzp(zzdj());
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i3 = this.tag & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(zzcs()));
                if (!zzcm()) {
                    i3 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i3;
        } else if (i3 == 2) {
            i3 = zzdd();
            zzac(i3);
            i = this.pos + i3;
            while (this.pos < i) {
                list.add(Long.valueOf(zzdj()));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzg(List<Integer> list) {
        int i;
        int i2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            i = this.tag & 7;
            if (i == 2) {
                i = zzdd();
                zzad(i);
                i2 = this.pos + i;
                while (this.pos < i2) {
                    zzfz.zzbg(zzdi());
                }
                return;
            } else if (i == 5) {
                do {
                    zzfz.zzbg(zzct());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        i = this.tag & 7;
        if (i == 2) {
            i = zzdd();
            zzad(i);
            i2 = this.pos + i;
            while (this.pos < i2) {
                list.add(Integer.valueOf(zzdi()));
            }
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(zzct()));
                if (!zzcm()) {
                    i = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i;
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzh(List<Boolean> list) {
        int zzdd;
        if (list instanceof zzem) {
            zzem zzem = (zzem) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzem.addBoolean(zzcu());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzem.addBoolean(zzdd() != 0);
                }
                zzae(zzdd);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(zzcu()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Boolean.valueOf(zzdd() != 0));
            }
            zzae(zzdd);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void readStringList(List<String> list) {
        zza((List) list, false);
    }

    public final void zzi(List<String> list) {
        zza((List) list, true);
    }

    private final void zza(List<String> list, boolean z) {
        if ((this.tag & 7) != 2) {
            throw zzgf.zzfm();
        } else if (!(list instanceof zzgo) || z) {
            int i;
            do {
                list.add(zzg(z));
                if (!zzcm()) {
                    i = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i;
        } else {
            int i2;
            zzgo zzgo = (zzgo) list;
            do {
                zzgo.zzc(zzcw());
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        }
    }

    public final <T> void zza(List<T> list, zzhw<T> zzhw, zzfk zzfk) {
        int i = this.tag;
        if ((i & 7) == 2) {
            int i2;
            do {
                list.add(zzb((zzhw) zzhw, zzfk));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == i);
            this.pos = i2;
            return;
        }
        throw zzgf.zzfm();
    }

    public final <T> void zzb(List<T> list, zzhw<T> zzhw, zzfk zzfk) {
        int i = this.tag;
        if ((i & 7) == 3) {
            int i2;
            do {
                list.add(zzd(zzhw, zzfk));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == i);
            this.pos = i2;
            return;
        }
        throw zzgf.zzfm();
    }

    public final void zzj(List<zzeo> list) {
        if ((this.tag & 7) == 2) {
            int i;
            do {
                list.add(zzcw());
                if (!zzcm()) {
                    i = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i;
            return;
        }
        throw zzgf.zzfm();
    }

    public final void zzk(List<Integer> list) {
        int zzdd;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(zzcx());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzfz.zzbg(zzdd());
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(zzcx()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Integer.valueOf(zzdd()));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzl(List<Integer> list) {
        int zzdd;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(zzcy());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzfz.zzbg(zzdd());
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(zzcy()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Integer.valueOf(zzdd()));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzm(List<Integer> list) {
        int i;
        int i2;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            i = this.tag & 7;
            if (i == 2) {
                i = zzdd();
                zzad(i);
                i2 = this.pos + i;
                while (this.pos < i2) {
                    zzfz.zzbg(zzdi());
                }
                return;
            } else if (i == 5) {
                do {
                    zzfz.zzbg(zzcz());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        i = this.tag & 7;
        if (i == 2) {
            i = zzdd();
            zzad(i);
            i2 = this.pos + i;
            while (this.pos < i2) {
                list.add(Integer.valueOf(zzdi()));
            }
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(zzcz()));
                if (!zzcm()) {
                    i = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i;
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzn(List<Long> list) {
        int i;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    zzgt.zzp(zzda());
                    if (!zzcm()) {
                        i2 = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i2;
                return;
            } else if (i2 == 2) {
                i2 = zzdd();
                zzac(i2);
                i = this.pos + i2;
                while (this.pos < i) {
                    zzgt.zzp(zzdj());
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i3 = this.tag & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(zzda()));
                if (!zzcm()) {
                    i3 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i3;
        } else if (i3 == 2) {
            i3 = zzdd();
            zzac(i3);
            i = this.pos + i3;
            while (this.pos < i) {
                list.add(Long.valueOf(zzdj()));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzo(List<Integer> list) {
        int zzdd;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(zzdb());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzfz.zzbg(zzez.zzaq(zzdd()));
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(zzdb()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Integer.valueOf(zzez.zzaq(zzdd())));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzp(List<Long> list) {
        int zzdd;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(zzdc());
                    if (!zzcm()) {
                        i = this.pos;
                    } else {
                        return;
                    }
                } while (zzdd() == this.tag);
                this.pos = i;
                return;
            } else if (i == 2) {
                zzdd = this.pos + zzdd();
                while (this.pos < zzdd) {
                    zzgt.zzp(zzez.zzd(zzde()));
                }
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(zzdc()));
                if (!zzcm()) {
                    i2 = this.pos;
                } else {
                    return;
                }
            } while (zzdd() == this.tag);
            this.pos = i2;
        } else if (i2 == 2) {
            zzdd = this.pos + zzdd();
            while (this.pos < zzdd) {
                list.add(Long.valueOf(zzez.zzd(zzde())));
            }
        } else {
            throw zzgf.zzfm();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|(2:20|34)(3:29|21|22)) */
    /* JADX WARNING: Missing block: B:19:0x004c, code skipped:
            if (zzco() != false) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:22:0x0054, code skipped:
            throw new com.google.android.gms.internal.vision.zzgf(r6);
     */
    /* JADX WARNING: Missing block: B:23:0x0055, code skipped:
            r8.put(r1, r3);
     */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.vision.zzgy<K, V> r9, com.google.android.gms.internal.vision.zzfk r10) {
        /*
        r7 = this;
        r0 = 2;
        r7.zzab(r0);
        r1 = r7.zzdd();
        r7.zzaa(r1);
        r2 = r7.limit;
        r3 = r7.pos;
        r3 = r3 + r1;
        r7.limit = r3;
        r1 = r9.zzyw;	 Catch:{ all -> 0x005b }
        r3 = r9.zzgq;	 Catch:{ all -> 0x005b }
    L_0x0016:
        r4 = r7.zzcn();	 Catch:{ all -> 0x005b }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 == r5) goto L_0x0055;
    L_0x001f:
        r5 = 1;
        r6 = "Unable to parse map entry.";
        if (r4 == r5) goto L_0x0040;
    L_0x0024:
        if (r4 == r0) goto L_0x0033;
    L_0x0026:
        r4 = r7.zzco();	 Catch:{ zzgg -> 0x0048 }
        if (r4 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0016;
    L_0x002d:
        r4 = new com.google.android.gms.internal.vision.zzgf;	 Catch:{ zzgg -> 0x0048 }
        r4.<init>(r6);	 Catch:{ zzgg -> 0x0048 }
        throw r4;	 Catch:{ zzgg -> 0x0048 }
    L_0x0033:
        r4 = r9.zzyx;	 Catch:{ zzgg -> 0x0048 }
        r5 = r9.zzgq;	 Catch:{ zzgg -> 0x0048 }
        r5 = r5.getClass();	 Catch:{ zzgg -> 0x0048 }
        r3 = r7.zza(r4, r5, r10);	 Catch:{ zzgg -> 0x0048 }
        goto L_0x0016;
    L_0x0040:
        r4 = r9.zzyv;	 Catch:{ zzgg -> 0x0048 }
        r5 = 0;
        r1 = r7.zza(r4, r5, r5);	 Catch:{ zzgg -> 0x0048 }
        goto L_0x0016;
    L_0x0048:
        r4 = r7.zzco();	 Catch:{ all -> 0x005b }
        if (r4 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0016;
    L_0x004f:
        r8 = new com.google.android.gms.internal.vision.zzgf;	 Catch:{ all -> 0x005b }
        r8.<init>(r6);	 Catch:{ all -> 0x005b }
        throw r8;	 Catch:{ all -> 0x005b }
    L_0x0055:
        r8.put(r1, r3);	 Catch:{ all -> 0x005b }
        r7.limit = r2;
        return;
    L_0x005b:
        r8 = move-exception;
        r7.limit = r2;
        goto L_0x0060;
    L_0x005f:
        throw r8;
    L_0x0060:
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzel.zza(java.util.Map, com.google.android.gms.internal.vision.zzgy, com.google.android.gms.internal.vision.zzfk):void");
    }

    private final Object zza(zzjd zzjd, Class<?> cls, zzfk zzfk) {
        switch (zzjd) {
            case BOOL:
                return Boolean.valueOf(zzcu());
            case BYTES:
                return zzcw();
            case DOUBLE:
                return Double.valueOf(readDouble());
            case ENUM:
                return Integer.valueOf(zzcy());
            case FIXED32:
                return Integer.valueOf(zzct());
            case FIXED64:
                return Long.valueOf(zzcs());
            case FLOAT:
                return Float.valueOf(readFloat());
            case INT32:
                return Integer.valueOf(zzcr());
            case INT64:
                return Long.valueOf(zzcq());
            case MESSAGE:
                return zza((Class) cls, zzfk);
            case SFIXED32:
                return Integer.valueOf(zzcz());
            case SFIXED64:
                return Long.valueOf(zzda());
            case SINT32:
                return Integer.valueOf(zzdb());
            case SINT64:
                return Long.valueOf(zzdc());
            case STRING:
                return zzg(true);
            case UINT32:
                return Integer.valueOf(zzcx());
            case UINT64:
                return Long.valueOf(zzcp());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzdd() {
        int i = this.pos;
        int i2 = this.limit;
        if (i2 != i) {
            byte[] bArr = this.buffer;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.pos = i3;
                return b;
            } else if (i2 - i3 < 9) {
                return (int) zzdf();
            } else {
                i2 = i3 + 1;
                i = b ^ (bArr[i3] << 7);
                if (i < 0) {
                    i ^= -128;
                } else {
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 14;
                    if (i >= 0) {
                        i ^= 16256;
                    } else {
                        i2 = i3 + 1;
                        i ^= bArr[i3] << 21;
                        if (i < 0) {
                            i ^= -2080896;
                        } else {
                            i3 = i2 + 1;
                            byte b2 = bArr[i2];
                            i = (i ^ (b2 << 28)) ^ 266354560;
                            if (b2 < (byte) 0) {
                                i2 = i3 + 1;
                                if (bArr[i3] < (byte) 0) {
                                    i3 = i2 + 1;
                                    if (bArr[i2] < (byte) 0) {
                                        i2 = i3 + 1;
                                        if (bArr[i3] < (byte) 0) {
                                            i3 = i2 + 1;
                                            if (bArr[i2] < (byte) 0) {
                                                i2 = i3 + 1;
                                                if (bArr[i3] < (byte) 0) {
                                                    throw zzgf.zzfj();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i2 = i3;
                }
                this.pos = i2;
                return i;
            }
        }
        throw zzgf.zzfh();
    }

    private final long zzde() {
        int i = this.pos;
        int i2 = this.limit;
        if (i2 != i) {
            byte[] bArr = this.buffer;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.pos = i3;
                return (long) b;
            } else if (i2 - i3 < 9) {
                return zzdf();
            } else {
                long j;
                i2 = i3 + 1;
                i = b ^ (bArr[i3] << 7);
                if (i < 0) {
                    i ^= -128;
                } else {
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 14;
                    if (i >= 0) {
                        i2 = i3;
                        j = (long) (i ^ 16256);
                    } else {
                        i2 = i3 + 1;
                        i ^= bArr[i3] << 21;
                        if (i < 0) {
                            i ^= -2080896;
                        } else {
                            long j2;
                            j = (long) i;
                            i = i2 + 1;
                            j ^= ((long) bArr[i2]) << 28;
                            if (j >= 0) {
                                j2 = 266354560;
                            } else {
                                long j3;
                                i2 = i + 1;
                                j ^= ((long) bArr[i]) << 35;
                                if (j < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i = i2 + 1;
                                    j ^= ((long) bArr[i2]) << 42;
                                    if (j >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i2 = i + 1;
                                        j ^= ((long) bArr[i]) << 49;
                                        if (j < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i = i2 + 1;
                                            j = (j ^ (((long) bArr[i2]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i2 = i + 1;
                                                if (((long) bArr[i]) < 0) {
                                                    throw zzgf.zzfj();
                                                }
                                            }
                                            i2 = i;
                                        }
                                    }
                                }
                                j ^= j3;
                            }
                            j = j2 ^ j;
                            i2 = i;
                        }
                    }
                    this.pos = i2;
                    return j;
                }
                j = (long) i;
                this.pos = i2;
                return j;
            }
        }
        throw zzgf.zzfh();
    }

    private final long zzdf() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte readByte = readByte();
            j |= ((long) (readByte & 127)) << i;
            if ((readByte & 128) == 0) {
                return j;
            }
        }
        throw zzgf.zzfj();
    }

    private final byte readByte() {
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzgf.zzfh();
    }

    private final int zzdg() {
        zzaa(4);
        return zzdi();
    }

    private final long zzdh() {
        zzaa(8);
        return zzdj();
    }

    private final int zzdi() {
        int i = this.pos;
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private final long zzdj() {
        int i = this.pos;
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    private final void zzz(int i) {
        zzaa(i);
        this.pos += i;
    }

    private final void zzaa(int i) {
        if (i < 0 || i > this.limit - this.pos) {
            throw zzgf.zzfh();
        }
    }

    private final void zzab(int i) {
        if ((this.tag & 7) != i) {
            throw zzgf.zzfm();
        }
    }

    private final void zzac(int i) {
        zzaa(i);
        if ((i & 7) != 0) {
            throw zzgf.zzfo();
        }
    }

    private final void zzad(int i) {
        zzaa(i);
        if ((i & 3) != 0) {
            throw zzgf.zzfo();
        }
    }

    private final void zzae(int i) {
        if (this.pos != i) {
            throw zzgf.zzfh();
        }
    }
}
