package com.google.android.gms.internal.vision;

import java.util.List;

final class zzfc implements zzhv {
    private int tag;
    private int zzru;
    private final zzez zzsp;
    private int zzsq = 0;

    public static zzfc zza(zzez zzez) {
        if (zzez.zzsi != null) {
            return zzez.zzsi;
        }
        return new zzfc(zzez);
    }

    private zzfc(zzez zzez) {
        this.zzsp = (zzez) zzga.zza((Object) zzez, "input");
        this.zzsp.zzsi = this;
    }

    public final int zzcn() {
        int i = this.zzsq;
        if (i != 0) {
            this.tag = i;
            this.zzsq = 0;
        } else {
            this.tag = this.zzsp.zzdq();
        }
        i = this.tag;
        return (i == 0 || i == this.zzru) ? Integer.MAX_VALUE : i >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzco() {
        if (!this.zzsp.zzcm()) {
            int i = this.tag;
            if (i != this.zzru) {
                return this.zzsp.zzal(i);
            }
        }
        return false;
    }

    private final void zzab(int i) {
        if ((this.tag & 7) != i) {
            throw zzgf.zzfm();
        }
    }

    public final double readDouble() {
        zzab(1);
        return this.zzsp.readDouble();
    }

    public final float readFloat() {
        zzab(5);
        return this.zzsp.readFloat();
    }

    public final long zzcp() {
        zzab(0);
        return this.zzsp.zzcp();
    }

    public final long zzcq() {
        zzab(0);
        return this.zzsp.zzcq();
    }

    public final int zzcr() {
        zzab(0);
        return this.zzsp.zzcr();
    }

    public final long zzcs() {
        zzab(1);
        return this.zzsp.zzcs();
    }

    public final int zzct() {
        zzab(5);
        return this.zzsp.zzct();
    }

    public final boolean zzcu() {
        zzab(0);
        return this.zzsp.zzcu();
    }

    public final String readString() {
        zzab(2);
        return this.zzsp.readString();
    }

    public final String zzcv() {
        zzab(2);
        return this.zzsp.zzcv();
    }

    public final <T> T zza(Class<T> cls, zzfk zzfk) {
        zzab(2);
        return zzb(zzhs.zzgl().zzf(cls), zzfk);
    }

    public final <T> T zza(zzhw<T> zzhw, zzfk zzfk) {
        zzab(2);
        return zzb((zzhw) zzhw, zzfk);
    }

    public final <T> T zzb(Class<T> cls, zzfk zzfk) {
        zzab(3);
        return zzd(zzhs.zzgl().zzf(cls), zzfk);
    }

    public final <T> T zzc(zzhw<T> zzhw, zzfk zzfk) {
        zzab(3);
        return zzd(zzhw, zzfk);
    }

    private final <T> T zzb(zzhw<T> zzhw, zzfk zzfk) {
        int zzcx = this.zzsp.zzcx();
        if (this.zzsp.zzsf < this.zzsp.zzsg) {
            zzcx = this.zzsp.zzan(zzcx);
            Object newInstance = zzhw.newInstance();
            zzez zzez = this.zzsp;
            zzez.zzsf++;
            zzhw.zza(newInstance, this, zzfk);
            zzhw.zze(newInstance);
            this.zzsp.zzak(0);
            zzez zzez2 = this.zzsp;
            zzez2.zzsf--;
            this.zzsp.zzao(zzcx);
            return newInstance;
        }
        throw zzgf.zzfn();
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
        return this.zzsp.zzcw();
    }

    public final int zzcx() {
        zzab(0);
        return this.zzsp.zzcx();
    }

    public final int zzcy() {
        zzab(0);
        return this.zzsp.zzcy();
    }

    public final int zzcz() {
        zzab(5);
        return this.zzsp.zzcz();
    }

    public final long zzda() {
        zzab(1);
        return this.zzsp.zzda();
    }

    public final int zzdb() {
        zzab(0);
        return this.zzsp.zzdb();
    }

    public final long zzdc() {
        zzab(0);
        return this.zzsp.zzdc();
    }

    public final void zza(List<Double> list) {
        int zzds;
        if (list instanceof zzfh) {
            zzfh zzfh = (zzfh) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfh.zzc(this.zzsp.readDouble());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                i = this.zzsp.zzcx();
                zzac(i);
                zzds = this.zzsp.zzds() + i;
                do {
                    zzfh.zzc(this.zzsp.readDouble());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzsp.readDouble()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            i2 = this.zzsp.zzcx();
            zzac(i2);
            zzds = this.zzsp.zzds() + i2;
            do {
                list.add(Double.valueOf(this.zzsp.readDouble()));
            } while (this.zzsp.zzds() < zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzb(List<Float> list) {
        if (list instanceof zzfv) {
            zzfv zzfv = (zzfv) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzsp.zzcx();
                zzad(i);
                int zzds = this.zzsp.zzds() + i;
                do {
                    zzfv.zzh(this.zzsp.readFloat());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else if (i == 5) {
                do {
                    zzfv.zzh(this.zzsp.readFloat());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzsp.zzcx();
            zzad(i2);
            int zzds2 = this.zzsp.zzds() + i2;
            do {
                list.add(Float.valueOf(this.zzsp.readFloat()));
            } while (this.zzsp.zzds() < zzds2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzsp.readFloat()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzc(List<Long> list) {
        int zzds;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(this.zzsp.zzcp());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgt.zzp(this.zzsp.zzcp());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzsp.zzcp()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Long.valueOf(this.zzsp.zzcp()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzd(List<Long> list) {
        int zzds;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(this.zzsp.zzcq());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgt.zzp(this.zzsp.zzcq());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzsp.zzcq()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Long.valueOf(this.zzsp.zzcq()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zze(List<Integer> list) {
        int zzds;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzcr());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzcr());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcr()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzcr()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzf(List<Long> list) {
        int zzds;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzgt.zzp(this.zzsp.zzcs());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                i = this.zzsp.zzcx();
                zzac(i);
                zzds = this.zzsp.zzds() + i;
                do {
                    zzgt.zzp(this.zzsp.zzcs());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzsp.zzcs()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            i2 = this.zzsp.zzcx();
            zzac(i2);
            zzds = this.zzsp.zzds() + i2;
            do {
                list.add(Long.valueOf(this.zzsp.zzcs()));
            } while (this.zzsp.zzds() < zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzg(List<Integer> list) {
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzsp.zzcx();
                zzad(i);
                int zzds = this.zzsp.zzds() + i;
                do {
                    zzfz.zzbg(this.zzsp.zzct());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else if (i == 5) {
                do {
                    zzfz.zzbg(this.zzsp.zzct());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzsp.zzcx();
            zzad(i2);
            int zzds2 = this.zzsp.zzds() + i2;
            do {
                list.add(Integer.valueOf(this.zzsp.zzct()));
            } while (this.zzsp.zzds() < zzds2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzct()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzh(List<Boolean> list) {
        int zzds;
        if (list instanceof zzem) {
            zzem zzem = (zzem) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzem.addBoolean(this.zzsp.zzcu());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzem.addBoolean(this.zzsp.zzcu());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzsp.zzcu()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Boolean.valueOf(this.zzsp.zzcu()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
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
            int zzdq;
            do {
                list.add(z ? zzcv() : readString());
                if (!this.zzsp.zzcm()) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
        } else {
            int zzdq2;
            zzgo zzgo = (zzgo) list;
            do {
                zzgo.zzc(zzcw());
                if (!this.zzsp.zzcm()) {
                    zzdq2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq2 == this.tag);
            this.zzsq = zzdq2;
        }
    }

    public final <T> void zza(List<T> list, zzhw<T> zzhw, zzfk zzfk) {
        int i = this.tag;
        if ((i & 7) == 2) {
            int zzdq;
            do {
                list.add(zzb((zzhw) zzhw, zzfk));
                if (!this.zzsp.zzcm() && this.zzsq == 0) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == i);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    public final <T> void zzb(List<T> list, zzhw<T> zzhw, zzfk zzfk) {
        int i = this.tag;
        if ((i & 7) == 3) {
            int zzdq;
            do {
                list.add(zzd(zzhw, zzfk));
                if (!this.zzsp.zzcm() && this.zzsq == 0) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == i);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    public final void zzj(List<zzeo> list) {
        if ((this.tag & 7) == 2) {
            int zzdq;
            do {
                list.add(zzcw());
                if (!this.zzsp.zzcm()) {
                    zzdq = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (zzdq == this.tag);
            this.zzsq = zzdq;
            return;
        }
        throw zzgf.zzfm();
    }

    public final void zzk(List<Integer> list) {
        int zzds;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzcx());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzcx());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcx()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzcx()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzl(List<Integer> list) {
        int zzds;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzcy());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzcy());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcy()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzcy()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzm(List<Integer> list) {
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzsp.zzcx();
                zzad(i);
                int zzds = this.zzsp.zzds() + i;
                do {
                    zzfz.zzbg(this.zzsp.zzcz());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else if (i == 5) {
                do {
                    zzfz.zzbg(this.zzsp.zzcz());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzsp.zzcx();
            zzad(i2);
            int zzds2 = this.zzsp.zzds() + i2;
            do {
                list.add(Integer.valueOf(this.zzsp.zzcz()));
            } while (this.zzsp.zzds() < zzds2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzcz()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzn(List<Long> list) {
        int zzds;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzgt.zzp(this.zzsp.zzda());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                i = this.zzsp.zzcx();
                zzac(i);
                zzds = this.zzsp.zzds() + i;
                do {
                    zzgt.zzp(this.zzsp.zzda());
                } while (this.zzsp.zzds() < zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzsp.zzda()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            i2 = this.zzsp.zzcx();
            zzac(i2);
            zzds = this.zzsp.zzds() + i2;
            do {
                list.add(Long.valueOf(this.zzsp.zzda()));
            } while (this.zzsp.zzds() < zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzo(List<Integer> list) {
        int zzds;
        if (list instanceof zzfz) {
            zzfz zzfz = (zzfz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfz.zzbg(this.zzsp.zzdb());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzfz.zzbg(this.zzsp.zzdb());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzsp.zzdb()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Integer.valueOf(this.zzsp.zzdb()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    public final void zzp(List<Long> list) {
        int zzds;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzgt.zzp(this.zzsp.zzdc());
                    if (!this.zzsp.zzcm()) {
                        i = this.zzsp.zzdq();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzsq = i;
                return;
            } else if (i == 2) {
                zzds = this.zzsp.zzds() + this.zzsp.zzcx();
                do {
                    zzgt.zzp(this.zzsp.zzdc());
                } while (this.zzsp.zzds() < zzds);
                zzae(zzds);
                return;
            } else {
                throw zzgf.zzfm();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzsp.zzdc()));
                if (!this.zzsp.zzcm()) {
                    i2 = this.zzsp.zzdq();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzsq = i2;
        } else if (i2 == 2) {
            zzds = this.zzsp.zzds() + this.zzsp.zzcx();
            do {
                list.add(Long.valueOf(this.zzsp.zzdc()));
            } while (this.zzsp.zzds() < zzds);
            zzae(zzds);
        } else {
            throw zzgf.zzfm();
        }
    }

    private static void zzac(int i) {
        if ((i & 7) != 0) {
            throw zzgf.zzfo();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:19:0x0052, code skipped:
            if (zzco() != false) goto L_0x0054;
     */
    /* JADX WARNING: Missing block: B:22:0x005a, code skipped:
            throw new com.google.android.gms.internal.vision.zzgf(r6);
     */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.vision.zzgy<K, V> r9, com.google.android.gms.internal.vision.zzfk r10) {
        /*
        r7 = this;
        r0 = 2;
        r7.zzab(r0);
        r1 = r7.zzsp;
        r1 = r1.zzcx();
        r2 = r7.zzsp;
        r1 = r2.zzan(r1);
        r2 = r9.zzyw;
        r3 = r9.zzgq;
    L_0x0014:
        r4 = r7.zzcn();	 Catch:{ all -> 0x0064 }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 == r5) goto L_0x005b;
    L_0x001d:
        r5 = r7.zzsp;	 Catch:{ all -> 0x0064 }
        r5 = r5.zzcm();	 Catch:{ all -> 0x0064 }
        if (r5 != 0) goto L_0x005b;
    L_0x0025:
        r5 = 1;
        r6 = "Unable to parse map entry.";
        if (r4 == r5) goto L_0x0046;
    L_0x002a:
        if (r4 == r0) goto L_0x0039;
    L_0x002c:
        r4 = r7.zzco();	 Catch:{ zzgg -> 0x004e }
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0014;
    L_0x0033:
        r4 = new com.google.android.gms.internal.vision.zzgf;	 Catch:{ zzgg -> 0x004e }
        r4.<init>(r6);	 Catch:{ zzgg -> 0x004e }
        throw r4;	 Catch:{ zzgg -> 0x004e }
    L_0x0039:
        r4 = r9.zzyx;	 Catch:{ zzgg -> 0x004e }
        r5 = r9.zzgq;	 Catch:{ zzgg -> 0x004e }
        r5 = r5.getClass();	 Catch:{ zzgg -> 0x004e }
        r3 = r7.zza(r4, r5, r10);	 Catch:{ zzgg -> 0x004e }
        goto L_0x0014;
    L_0x0046:
        r4 = r9.zzyv;	 Catch:{ zzgg -> 0x004e }
        r5 = 0;
        r2 = r7.zza(r4, r5, r5);	 Catch:{ zzgg -> 0x004e }
        goto L_0x0014;
    L_0x004e:
        r4 = r7.zzco();	 Catch:{ all -> 0x0064 }
        if (r4 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0014;
    L_0x0055:
        r8 = new com.google.android.gms.internal.vision.zzgf;	 Catch:{ all -> 0x0064 }
        r8.<init>(r6);	 Catch:{ all -> 0x0064 }
        throw r8;	 Catch:{ all -> 0x0064 }
    L_0x005b:
        r8.put(r2, r3);	 Catch:{ all -> 0x0064 }
        r8 = r7.zzsp;
        r8.zzao(r1);
        return;
    L_0x0064:
        r8 = move-exception;
        r9 = r7.zzsp;
        r9.zzao(r1);
        goto L_0x006c;
    L_0x006b:
        throw r8;
    L_0x006c:
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfc.zza(java.util.Map, com.google.android.gms.internal.vision.zzgy, com.google.android.gms.internal.vision.zzfk):void");
    }

    private final Object zza(zzjd zzjd, Class<?> cls, zzfk zzfk) {
        switch (zzfd.zzrr[zzjd.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzcu());
            case 2:
                return zzcw();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzcy());
            case 5:
                return Integer.valueOf(zzct());
            case 6:
                return Long.valueOf(zzcs());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzcr());
            case 9:
                return Long.valueOf(zzcq());
            case 10:
                return zza((Class) cls, zzfk);
            case 11:
                return Integer.valueOf(zzcz());
            case 12:
                return Long.valueOf(zzda());
            case 13:
                return Integer.valueOf(zzdb());
            case 14:
                return Long.valueOf(zzdc());
            case 15:
                return zzcv();
            case 16:
                return Integer.valueOf(zzcx());
            case 17:
                return Long.valueOf(zzcp());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzad(int i) {
        if ((i & 3) != 0) {
            throw zzgf.zzfo();
        }
    }

    private final void zzae(int i) {
        if (this.zzsp.zzds() != i) {
            throw zzgf.zzfh();
        }
    }
}
