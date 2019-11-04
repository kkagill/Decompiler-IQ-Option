package com.google.android.gms.internal.gtm;

import java.util.List;

final class zzqh implements zzsy {
    private int tag;
    private final zzqe zzawp;
    private int zzawq;
    private int zzawr = 0;

    public static zzqh zza(zzqe zzqe) {
        if (zzqe.zzawi != null) {
            return zzqe.zzawi;
        }
        return new zzqh(zzqe);
    }

    private zzqh(zzqe zzqe) {
        this.zzawp = (zzqe) zzre.zza(zzqe, "input");
        this.zzawp.zzawi = this;
    }

    public final int zzog() {
        int i = this.zzawr;
        if (i != 0) {
            this.tag = i;
            this.zzawr = 0;
        } else {
            this.tag = this.zzawp.zzni();
        }
        i = this.tag;
        return (i == 0 || i == this.zzawq) ? Integer.MAX_VALUE : i >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzoh() {
        if (!this.zzawp.zzny()) {
            int i = this.tag;
            if (i != this.zzawq) {
                return this.zzawp.zzao(i);
            }
        }
        return false;
    }

    private final void zzat(int i) {
        if ((this.tag & 7) != i) {
            throw zzrk.zzpt();
        }
    }

    public final double readDouble() {
        zzat(1);
        return this.zzawp.readDouble();
    }

    public final float readFloat() {
        zzat(5);
        return this.zzawp.readFloat();
    }

    public final long zznj() {
        zzat(0);
        return this.zzawp.zznj();
    }

    public final long zznk() {
        zzat(0);
        return this.zzawp.zznk();
    }

    public final int zznl() {
        zzat(0);
        return this.zzawp.zznl();
    }

    public final long zznm() {
        zzat(1);
        return this.zzawp.zznm();
    }

    public final int zznn() {
        zzat(5);
        return this.zzawp.zznn();
    }

    public final boolean zzno() {
        zzat(0);
        return this.zzawp.zzno();
    }

    public final String readString() {
        zzat(2);
        return this.zzawp.readString();
    }

    public final String zznp() {
        zzat(2);
        return this.zzawp.zznp();
    }

    public final <T> T zza(zzsz<T> zzsz, zzqp zzqp) {
        zzat(2);
        return zzc(zzsz, zzqp);
    }

    public final <T> T zzb(zzsz<T> zzsz, zzqp zzqp) {
        zzat(3);
        return zzd(zzsz, zzqp);
    }

    private final <T> T zzc(zzsz<T> zzsz, zzqp zzqp) {
        int zznr = this.zzawp.zznr();
        if (this.zzawp.zzawf < this.zzawp.zzawg) {
            zznr = this.zzawp.zzaq(zznr);
            Object newInstance = zzsz.newInstance();
            zzqe zzqe = this.zzawp;
            zzqe.zzawf++;
            zzsz.zza(newInstance, this, zzqp);
            zzsz.zzt(newInstance);
            this.zzawp.zzan(0);
            zzqe zzqe2 = this.zzawp;
            zzqe2.zzawf--;
            this.zzawp.zzar(zznr);
            return newInstance;
        }
        throw zzrk.zzpu();
    }

    private final <T> T zzd(zzsz<T> zzsz, zzqp zzqp) {
        int i = this.zzawq;
        T t = ((this.tag >>> 3) << 3) | 4;
        this.zzawq = t;
        try {
            t = zzsz.newInstance();
            zzsz.zza(t, this, zzqp);
            zzsz.zzt(t);
            if (this.tag == this.zzawq) {
                return t;
            }
            throw zzrk.zzpv();
        } finally {
            this.zzawq = i;
        }
    }

    public final zzps zznq() {
        zzat(2);
        return this.zzawp.zznq();
    }

    public final int zznr() {
        zzat(0);
        return this.zzawp.zznr();
    }

    public final int zzns() {
        zzat(0);
        return this.zzawp.zzns();
    }

    public final int zznt() {
        zzat(5);
        return this.zzawp.zznt();
    }

    public final long zznu() {
        zzat(1);
        return this.zzawp.zznu();
    }

    public final int zznv() {
        zzat(0);
        return this.zzawp.zznv();
    }

    public final long zznw() {
        zzat(0);
        return this.zzawp.zznw();
    }

    public final void zzg(List<Double> list) {
        int zznz;
        if (list instanceof zzqm) {
            zzqm zzqm = (zzqm) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzqm.zzd(this.zzawp.readDouble());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                i = this.zzawp.zznr();
                zzau(i);
                zznz = this.zzawp.zznz() + i;
                do {
                    zzqm.zzd(this.zzawp.readDouble());
                } while (this.zzawp.zznz() < zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzawp.readDouble()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            i2 = this.zzawp.zznr();
            zzau(i2);
            zznz = this.zzawp.zznz() + i2;
            do {
                list.add(Double.valueOf(this.zzawp.readDouble()));
            } while (this.zzawp.zznz() < zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzh(List<Float> list) {
        if (list instanceof zzqz) {
            zzqz zzqz = (zzqz) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzawp.zznr();
                zzav(i);
                int zznz = this.zzawp.zznz() + i;
                do {
                    zzqz.zzc(this.zzawp.readFloat());
                } while (this.zzawp.zznz() < zznz);
                return;
            } else if (i == 5) {
                do {
                    zzqz.zzc(this.zzawp.readFloat());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzawp.zznr();
            zzav(i2);
            int zznz2 = this.zzawp.zznz() + i2;
            do {
                list.add(Float.valueOf(this.zzawp.readFloat()));
            } while (this.zzawp.zznz() < zznz2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzawp.readFloat()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzi(List<Long> list) {
        int zznz;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzry.zzaa(this.zzawp.zznj());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzry.zzaa(this.zzawp.zznj());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzawp.zznj()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Long.valueOf(this.zzawp.zznj()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzj(List<Long> list) {
        int zznz;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzry.zzaa(this.zzawp.zznk());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzry.zzaa(this.zzawp.zznk());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzawp.zznk()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Long.valueOf(this.zzawp.zznk()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzk(List<Integer> list) {
        int zznz;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzrd.zzbm(this.zzawp.zznl());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzrd.zzbm(this.zzawp.zznl());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzawp.zznl()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Integer.valueOf(this.zzawp.zznl()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzl(List<Long> list) {
        int zznz;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzry.zzaa(this.zzawp.zznm());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                i = this.zzawp.zznr();
                zzau(i);
                zznz = this.zzawp.zznz() + i;
                do {
                    zzry.zzaa(this.zzawp.zznm());
                } while (this.zzawp.zznz() < zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzawp.zznm()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            i2 = this.zzawp.zznr();
            zzau(i2);
            zznz = this.zzawp.zznz() + i2;
            do {
                list.add(Long.valueOf(this.zzawp.zznm()));
            } while (this.zzawp.zznz() < zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzm(List<Integer> list) {
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzawp.zznr();
                zzav(i);
                int zznz = this.zzawp.zznz() + i;
                do {
                    zzrd.zzbm(this.zzawp.zznn());
                } while (this.zzawp.zznz() < zznz);
                return;
            } else if (i == 5) {
                do {
                    zzrd.zzbm(this.zzawp.zznn());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzawp.zznr();
            zzav(i2);
            int zznz2 = this.zzawp.zznz() + i2;
            do {
                list.add(Integer.valueOf(this.zzawp.zznn()));
            } while (this.zzawp.zznz() < zznz2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzawp.zznn()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzn(List<Boolean> list) {
        int zznz;
        if (list instanceof zzpq) {
            zzpq zzpq = (zzpq) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzpq.addBoolean(this.zzawp.zzno());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzpq.addBoolean(this.zzawp.zzno());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzawp.zzno()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Boolean.valueOf(this.zzawp.zzno()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void readStringList(List<String> list) {
        zza((List) list, false);
    }

    public final void zzo(List<String> list) {
        zza((List) list, true);
    }

    private final void zza(List<String> list, boolean z) {
        if ((this.tag & 7) != 2) {
            throw zzrk.zzpt();
        } else if (!(list instanceof zzrt) || z) {
            int zzni;
            do {
                list.add(z ? zznp() : readString());
                if (!this.zzawp.zzny()) {
                    zzni = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (zzni == this.tag);
            this.zzawr = zzni;
        } else {
            int zzni2;
            zzrt zzrt = (zzrt) list;
            do {
                zzrt.zzc(zznq());
                if (!this.zzawp.zzny()) {
                    zzni2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (zzni2 == this.tag);
            this.zzawr = zzni2;
        }
    }

    public final <T> void zza(List<T> list, zzsz<T> zzsz, zzqp zzqp) {
        int i = this.tag;
        if ((i & 7) == 2) {
            int zzni;
            do {
                list.add(zzc(zzsz, zzqp));
                if (!this.zzawp.zzny() && this.zzawr == 0) {
                    zzni = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (zzni == i);
            this.zzawr = zzni;
            return;
        }
        throw zzrk.zzpt();
    }

    public final <T> void zzb(List<T> list, zzsz<T> zzsz, zzqp zzqp) {
        int i = this.tag;
        if ((i & 7) == 3) {
            int zzni;
            do {
                list.add(zzd(zzsz, zzqp));
                if (!this.zzawp.zzny() && this.zzawr == 0) {
                    zzni = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (zzni == i);
            this.zzawr = zzni;
            return;
        }
        throw zzrk.zzpt();
    }

    public final void zzp(List<zzps> list) {
        if ((this.tag & 7) == 2) {
            int zzni;
            do {
                list.add(zznq());
                if (!this.zzawp.zzny()) {
                    zzni = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (zzni == this.tag);
            this.zzawr = zzni;
            return;
        }
        throw zzrk.zzpt();
    }

    public final void zzq(List<Integer> list) {
        int zznz;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzrd.zzbm(this.zzawp.zznr());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzrd.zzbm(this.zzawp.zznr());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzawp.zznr()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Integer.valueOf(this.zzawp.zznr()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzr(List<Integer> list) {
        int zznz;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzrd.zzbm(this.zzawp.zzns());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzrd.zzbm(this.zzawp.zzns());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzawp.zzns()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Integer.valueOf(this.zzawp.zzns()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzs(List<Integer> list) {
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzawp.zznr();
                zzav(i);
                int zznz = this.zzawp.zznz() + i;
                do {
                    zzrd.zzbm(this.zzawp.zznt());
                } while (this.zzawp.zznz() < zznz);
                return;
            } else if (i == 5) {
                do {
                    zzrd.zzbm(this.zzawp.zznt());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzawp.zznr();
            zzav(i2);
            int zznz2 = this.zzawp.zznz() + i2;
            do {
                list.add(Integer.valueOf(this.zzawp.zznt()));
            } while (this.zzawp.zznz() < zznz2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzawp.zznt()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzt(List<Long> list) {
        int zznz;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzry.zzaa(this.zzawp.zznu());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                i = this.zzawp.zznr();
                zzau(i);
                zznz = this.zzawp.zznz() + i;
                do {
                    zzry.zzaa(this.zzawp.zznu());
                } while (this.zzawp.zznz() < zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzawp.zznu()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            i2 = this.zzawp.zznr();
            zzau(i2);
            zznz = this.zzawp.zznz() + i2;
            do {
                list.add(Long.valueOf(this.zzawp.zznu()));
            } while (this.zzawp.zznz() < zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzu(List<Integer> list) {
        int zznz;
        if (list instanceof zzrd) {
            zzrd zzrd = (zzrd) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzrd.zzbm(this.zzawp.zznv());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzrd.zzbm(this.zzawp.zznv());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzawp.zznv()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Integer.valueOf(this.zzawp.zznv()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    public final void zzv(List<Long> list) {
        int zznz;
        if (list instanceof zzry) {
            zzry zzry = (zzry) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzry.zzaa(this.zzawp.zznw());
                    if (!this.zzawp.zzny()) {
                        i = this.zzawp.zzni();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzawr = i;
                return;
            } else if (i == 2) {
                zznz = this.zzawp.zznz() + this.zzawp.zznr();
                do {
                    zzry.zzaa(this.zzawp.zznw());
                } while (this.zzawp.zznz() < zznz);
                zzaw(zznz);
                return;
            } else {
                throw zzrk.zzpt();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzawp.zznw()));
                if (!this.zzawp.zzny()) {
                    i2 = this.zzawp.zzni();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzawr = i2;
        } else if (i2 == 2) {
            zznz = this.zzawp.zznz() + this.zzawp.zznr();
            do {
                list.add(Long.valueOf(this.zzawp.zznw()));
            } while (this.zzawp.zznz() < zznz);
            zzaw(zznz);
        } else {
            throw zzrk.zzpt();
        }
    }

    private static void zzau(int i) {
        if ((i & 7) != 0) {
            throw zzrk.zzpv();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:19:0x0052, code skipped:
            if (zzoh() != false) goto L_0x0054;
     */
    /* JADX WARNING: Missing block: B:22:0x005a, code skipped:
            throw new com.google.android.gms.internal.gtm.zzrk(r6);
     */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.gtm.zzsd<K, V> r9, com.google.android.gms.internal.gtm.zzqp r10) {
        /*
        r7 = this;
        r0 = 2;
        r7.zzat(r0);
        r1 = r7.zzawp;
        r1 = r1.zznr();
        r2 = r7.zzawp;
        r1 = r2.zzaq(r1);
        r2 = r9.zzbcq;
        r3 = r9.zzbcs;
    L_0x0014:
        r4 = r7.zzog();	 Catch:{ all -> 0x0064 }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 == r5) goto L_0x005b;
    L_0x001d:
        r5 = r7.zzawp;	 Catch:{ all -> 0x0064 }
        r5 = r5.zzny();	 Catch:{ all -> 0x0064 }
        if (r5 != 0) goto L_0x005b;
    L_0x0025:
        r5 = 1;
        r6 = "Unable to parse map entry.";
        if (r4 == r5) goto L_0x0046;
    L_0x002a:
        if (r4 == r0) goto L_0x0039;
    L_0x002c:
        r4 = r7.zzoh();	 Catch:{ zzrl -> 0x004e }
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0014;
    L_0x0033:
        r4 = new com.google.android.gms.internal.gtm.zzrk;	 Catch:{ zzrl -> 0x004e }
        r4.<init>(r6);	 Catch:{ zzrl -> 0x004e }
        throw r4;	 Catch:{ zzrl -> 0x004e }
    L_0x0039:
        r4 = r9.zzbcr;	 Catch:{ zzrl -> 0x004e }
        r5 = r9.zzbcs;	 Catch:{ zzrl -> 0x004e }
        r5 = r5.getClass();	 Catch:{ zzrl -> 0x004e }
        r3 = r7.zza(r4, r5, r10);	 Catch:{ zzrl -> 0x004e }
        goto L_0x0014;
    L_0x0046:
        r4 = r9.zzbcp;	 Catch:{ zzrl -> 0x004e }
        r5 = 0;
        r2 = r7.zza(r4, r5, r5);	 Catch:{ zzrl -> 0x004e }
        goto L_0x0014;
    L_0x004e:
        r4 = r7.zzoh();	 Catch:{ all -> 0x0064 }
        if (r4 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0014;
    L_0x0055:
        r8 = new com.google.android.gms.internal.gtm.zzrk;	 Catch:{ all -> 0x0064 }
        r8.<init>(r6);	 Catch:{ all -> 0x0064 }
        throw r8;	 Catch:{ all -> 0x0064 }
    L_0x005b:
        r8.put(r2, r3);	 Catch:{ all -> 0x0064 }
        r8 = r7.zzawp;
        r8.zzar(r1);
        return;
    L_0x0064:
        r8 = move-exception;
        r9 = r7.zzawp;
        r9.zzar(r1);
        goto L_0x006c;
    L_0x006b:
        throw r8;
    L_0x006c:
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqh.zza(java.util.Map, com.google.android.gms.internal.gtm.zzsd, com.google.android.gms.internal.gtm.zzqp):void");
    }

    private final Object zza(zzug zzug, Class<?> cls, zzqp zzqp) {
        switch (zzqi.zzaws[zzug.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzno());
            case 2:
                return zznq();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzns());
            case 5:
                return Integer.valueOf(zznn());
            case 6:
                return Long.valueOf(zznm());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zznl());
            case 9:
                return Long.valueOf(zznk());
            case 10:
                zzat(2);
                return zzc(zzsw.zzqs().zzi(cls), zzqp);
            case 11:
                return Integer.valueOf(zznt());
            case 12:
                return Long.valueOf(zznu());
            case 13:
                return Integer.valueOf(zznv());
            case 14:
                return Long.valueOf(zznw());
            case 15:
                return zznp();
            case 16:
                return Integer.valueOf(zznr());
            case 17:
                return Long.valueOf(zznj());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzav(int i) {
        if ((i & 3) != 0) {
            throw zzrk.zzpv();
        }
    }

    private final void zzaw(int i) {
        if (this.zzawp.zznz() != i) {
            throw zzrk.zzpp();
        }
    }
}
