package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzec implements zzgy {
    private int tag;
    private final zzeb zzadu;
    private int zzadv;
    private int zzadw = 0;

    public static zzec zza(zzeb zzeb) {
        if (zzeb.zzads != null) {
            return zzeb.zzads;
        }
        return new zzec(zzeb);
    }

    private zzec(zzeb zzeb) {
        this.zzadu = (zzeb) zzez.zza((Object) zzeb, "input");
        this.zzadu.zzads = this;
    }

    public final int zzsy() {
        int i = this.zzadw;
        if (i != 0) {
            this.tag = i;
            this.zzadw = 0;
        } else {
            this.tag = this.zzadu.zzsg();
        }
        i = this.tag;
        return (i == 0 || i == this.zzadv) ? Integer.MAX_VALUE : i >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzsz() {
        if (!this.zzadu.zzsw()) {
            int i = this.tag;
            if (i != this.zzadv) {
                return this.zzadu.zzau(i);
            }
        }
        return false;
    }

    private final void zzba(int i) {
        if ((this.tag & 7) != i) {
            throw zzfi.zzuy();
        }
    }

    public final double readDouble() {
        zzba(1);
        return this.zzadu.readDouble();
    }

    public final float readFloat() {
        zzba(5);
        return this.zzadu.readFloat();
    }

    public final long zzsh() {
        zzba(0);
        return this.zzadu.zzsh();
    }

    public final long zzsi() {
        zzba(0);
        return this.zzadu.zzsi();
    }

    public final int zzsj() {
        zzba(0);
        return this.zzadu.zzsj();
    }

    public final long zzsk() {
        zzba(1);
        return this.zzadu.zzsk();
    }

    public final int zzsl() {
        zzba(5);
        return this.zzadu.zzsl();
    }

    public final boolean zzsm() {
        zzba(0);
        return this.zzadu.zzsm();
    }

    public final String readString() {
        zzba(2);
        return this.zzadu.readString();
    }

    public final String zzsn() {
        zzba(2);
        return this.zzadu.zzsn();
    }

    public final <T> T zza(zzgx<T> zzgx, zzel zzel) {
        zzba(2);
        return zzc(zzgx, zzel);
    }

    public final <T> T zzb(zzgx<T> zzgx, zzel zzel) {
        zzba(3);
        return zzd(zzgx, zzel);
    }

    private final <T> T zzc(zzgx<T> zzgx, zzel zzel) {
        int zzsp = this.zzadu.zzsp();
        if (this.zzadu.zzadp < this.zzadu.zzadq) {
            zzsp = this.zzadu.zzaw(zzsp);
            Object newInstance = zzgx.newInstance();
            zzeb zzeb = this.zzadu;
            zzeb.zzadp++;
            zzgx.zza(newInstance, this, zzel);
            zzgx.zzj(newInstance);
            this.zzadu.zzat(0);
            zzeb zzeb2 = this.zzadu;
            zzeb2.zzadp--;
            this.zzadu.zzax(zzsp);
            return newInstance;
        }
        throw zzfi.zzuz();
    }

    private final <T> T zzd(zzgx<T> zzgx, zzel zzel) {
        int i = this.zzadv;
        T t = ((this.tag >>> 3) << 3) | 4;
        this.zzadv = t;
        try {
            t = zzgx.newInstance();
            zzgx.zza(t, this, zzel);
            zzgx.zzj(t);
            if (this.tag == this.zzadv) {
                return t;
            }
            throw zzfi.zzva();
        } finally {
            this.zzadv = i;
        }
    }

    public final zzdp zzso() {
        zzba(2);
        return this.zzadu.zzso();
    }

    public final int zzsp() {
        zzba(0);
        return this.zzadu.zzsp();
    }

    public final int zzsq() {
        zzba(0);
        return this.zzadu.zzsq();
    }

    public final int zzsr() {
        zzba(5);
        return this.zzadu.zzsr();
    }

    public final long zzss() {
        zzba(1);
        return this.zzadu.zzss();
    }

    public final int zzst() {
        zzba(0);
        return this.zzadu.zzst();
    }

    public final long zzsu() {
        zzba(0);
        return this.zzadu.zzsu();
    }

    public final void zze(List<Double> list) {
        int zzsx;
        if (list instanceof zzeh) {
            zzeh zzeh = (zzeh) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzeh.zzf(this.zzadu.readDouble());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                i = this.zzadu.zzsp();
                zzbb(i);
                zzsx = this.zzadu.zzsx() + i;
                do {
                    zzeh.zzf(this.zzadu.readDouble());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzadu.readDouble()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            i2 = this.zzadu.zzsp();
            zzbb(i2);
            zzsx = this.zzadu.zzsx() + i2;
            do {
                list.add(Double.valueOf(this.zzadu.readDouble()));
            } while (this.zzadu.zzsx() < zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzf(List<Float> list) {
        if (list instanceof zzeu) {
            zzeu zzeu = (zzeu) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzadu.zzsp();
                zzbc(i);
                int zzsx = this.zzadu.zzsx() + i;
                do {
                    zzeu.zzc(this.zzadu.readFloat());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else if (i == 5) {
                do {
                    zzeu.zzc(this.zzadu.readFloat());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzadu.zzsp();
            zzbc(i2);
            int zzsx2 = this.zzadu.zzsx() + i2;
            do {
                list.add(Float.valueOf(this.zzadu.readFloat()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzadu.readFloat()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzg(List<Long> list) {
        int zzsx;
        if (list instanceof zzfw) {
            zzfw zzfw = (zzfw) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfw.zzby(this.zzadu.zzsh());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfw.zzby(this.zzadu.zzsh());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsh()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Long.valueOf(this.zzadu.zzsh()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzh(List<Long> list) {
        int zzsx;
        if (list instanceof zzfw) {
            zzfw zzfw = (zzfw) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfw.zzby(this.zzadu.zzsi());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfw.zzby(this.zzadu.zzsi());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsi()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Long.valueOf(this.zzadu.zzsi()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzi(List<Integer> list) {
        int zzsx;
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfa.zzbu(this.zzadu.zzsj());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfa.zzbu(this.zzadu.zzsj());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsj()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzsj()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzj(List<Long> list) {
        int zzsx;
        if (list instanceof zzfw) {
            zzfw zzfw = (zzfw) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfw.zzby(this.zzadu.zzsk());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                i = this.zzadu.zzsp();
                zzbb(i);
                zzsx = this.zzadu.zzsx() + i;
                do {
                    zzfw.zzby(this.zzadu.zzsk());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsk()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            i2 = this.zzadu.zzsp();
            zzbb(i2);
            zzsx = this.zzadu.zzsx() + i2;
            do {
                list.add(Long.valueOf(this.zzadu.zzsk()));
            } while (this.zzadu.zzsx() < zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzk(List<Integer> list) {
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzadu.zzsp();
                zzbc(i);
                int zzsx = this.zzadu.zzsx() + i;
                do {
                    zzfa.zzbu(this.zzadu.zzsl());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else if (i == 5) {
                do {
                    zzfa.zzbu(this.zzadu.zzsl());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzadu.zzsp();
            zzbc(i2);
            int zzsx2 = this.zzadu.zzsx() + i2;
            do {
                list.add(Integer.valueOf(this.zzadu.zzsl()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsl()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzl(List<Boolean> list) {
        int zzsx;
        if (list instanceof zzdn) {
            zzdn zzdn = (zzdn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdn.addBoolean(this.zzadu.zzsm());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzdn.addBoolean(this.zzadu.zzsm());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzadu.zzsm()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Boolean.valueOf(this.zzadu.zzsm()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void readStringList(List<String> list) {
        zza((List) list, false);
    }

    public final void zzm(List<String> list) {
        zza((List) list, true);
    }

    private final void zza(List<String> list, boolean z) {
        if ((this.tag & 7) != 2) {
            throw zzfi.zzuy();
        } else if (!(list instanceof zzfp) || z) {
            int zzsg;
            do {
                list.add(z ? zzsn() : readString());
                if (!this.zzadu.zzsw()) {
                    zzsg = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else {
            int zzsg2;
            zzfp zzfp = (zzfp) list;
            do {
                zzfp.zzc(zzso());
                if (!this.zzadu.zzsw()) {
                    zzsg2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (zzsg2 == this.tag);
            this.zzadw = zzsg2;
        }
    }

    public final <T> void zza(List<T> list, zzgx<T> zzgx, zzel zzel) {
        int i = this.tag;
        if ((i & 7) == 2) {
            int zzsg;
            do {
                list.add(zzc(zzgx, zzel));
                if (!this.zzadu.zzsw() && this.zzadw == 0) {
                    zzsg = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (zzsg == i);
            this.zzadw = zzsg;
            return;
        }
        throw zzfi.zzuy();
    }

    public final <T> void zzb(List<T> list, zzgx<T> zzgx, zzel zzel) {
        int i = this.tag;
        if ((i & 7) == 3) {
            int zzsg;
            do {
                list.add(zzd(zzgx, zzel));
                if (!this.zzadu.zzsw() && this.zzadw == 0) {
                    zzsg = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (zzsg == i);
            this.zzadw = zzsg;
            return;
        }
        throw zzfi.zzuy();
    }

    public final void zzn(List<zzdp> list) {
        if ((this.tag & 7) == 2) {
            int zzsg;
            do {
                list.add(zzso());
                if (!this.zzadu.zzsw()) {
                    zzsg = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
            return;
        }
        throw zzfi.zzuy();
    }

    public final void zzo(List<Integer> list) {
        int zzsx;
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfa.zzbu(this.zzadu.zzsp());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfa.zzbu(this.zzadu.zzsp());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsp()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzsp()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzp(List<Integer> list) {
        int zzsx;
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfa.zzbu(this.zzadu.zzsq());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfa.zzbu(this.zzadu.zzsq());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsq()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzsq()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzq(List<Integer> list) {
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            int i = this.tag & 7;
            if (i == 2) {
                i = this.zzadu.zzsp();
                zzbc(i);
                int zzsx = this.zzadu.zzsx() + i;
                do {
                    zzfa.zzbu(this.zzadu.zzsr());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else if (i == 5) {
                do {
                    zzfa.zzbu(this.zzadu.zzsr());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            i2 = this.zzadu.zzsp();
            zzbc(i2);
            int zzsx2 = this.zzadu.zzsx() + i2;
            do {
                list.add(Integer.valueOf(this.zzadu.zzsr()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsr()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzr(List<Long> list) {
        int zzsx;
        if (list instanceof zzfw) {
            zzfw zzfw = (zzfw) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfw.zzby(this.zzadu.zzss());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                i = this.zzadu.zzsp();
                zzbb(i);
                zzsx = this.zzadu.zzsx() + i;
                do {
                    zzfw.zzby(this.zzadu.zzss());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzadu.zzss()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            i2 = this.zzadu.zzsp();
            zzbb(i2);
            zzsx = this.zzadu.zzsx() + i2;
            do {
                list.add(Long.valueOf(this.zzadu.zzss()));
            } while (this.zzadu.zzsx() < zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzs(List<Integer> list) {
        int zzsx;
        if (list instanceof zzfa) {
            zzfa zzfa = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfa.zzbu(this.zzadu.zzst());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfa.zzbu(this.zzadu.zzst());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzst()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzst()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    public final void zzt(List<Long> list) {
        int zzsx;
        if (list instanceof zzfw) {
            zzfw zzfw = (zzfw) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfw.zzby(this.zzadu.zzsu());
                    if (!this.zzadu.zzsw()) {
                        i = this.zzadu.zzsg();
                    } else {
                        return;
                    }
                } while (i == this.tag);
                this.zzadw = i;
                return;
            } else if (i == 2) {
                zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfw.zzby(this.zzadu.zzsu());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsu()));
                if (!this.zzadu.zzsw()) {
                    i2 = this.zzadu.zzsg();
                } else {
                    return;
                }
            } while (i2 == this.tag);
            this.zzadw = i2;
        } else if (i2 == 2) {
            zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Long.valueOf(this.zzadu.zzsu()));
            } while (this.zzadu.zzsx() < zzsx);
            zzbd(zzsx);
        } else {
            throw zzfi.zzuy();
        }
    }

    private static void zzbb(int i) {
        if ((i & 7) != 0) {
            throw zzfi.zzva();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:19:0x0052, code skipped:
            if (zzsz() != false) goto L_0x0054;
     */
    /* JADX WARNING: Missing block: B:22:0x005a, code skipped:
            throw new com.google.android.gms.internal.measurement.zzfi(r6);
     */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzfz<K, V> r9, com.google.android.gms.internal.measurement.zzel r10) {
        /*
        r7 = this;
        r0 = 2;
        r7.zzba(r0);
        r1 = r7.zzadu;
        r1 = r1.zzsp();
        r2 = r7.zzadu;
        r1 = r2.zzaw(r1);
        r2 = r9.zzakc;
        r3 = r9.zzaba;
    L_0x0014:
        r4 = r7.zzsy();	 Catch:{ all -> 0x0064 }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 == r5) goto L_0x005b;
    L_0x001d:
        r5 = r7.zzadu;	 Catch:{ all -> 0x0064 }
        r5 = r5.zzsw();	 Catch:{ all -> 0x0064 }
        if (r5 != 0) goto L_0x005b;
    L_0x0025:
        r5 = 1;
        r6 = "Unable to parse map entry.";
        if (r4 == r5) goto L_0x0046;
    L_0x002a:
        if (r4 == r0) goto L_0x0039;
    L_0x002c:
        r4 = r7.zzsz();	 Catch:{ zzfh -> 0x004e }
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0014;
    L_0x0033:
        r4 = new com.google.android.gms.internal.measurement.zzfi;	 Catch:{ zzfh -> 0x004e }
        r4.<init>(r6);	 Catch:{ zzfh -> 0x004e }
        throw r4;	 Catch:{ zzfh -> 0x004e }
    L_0x0039:
        r4 = r9.zzakd;	 Catch:{ zzfh -> 0x004e }
        r5 = r9.zzaba;	 Catch:{ zzfh -> 0x004e }
        r5 = r5.getClass();	 Catch:{ zzfh -> 0x004e }
        r3 = r7.zza(r4, r5, r10);	 Catch:{ zzfh -> 0x004e }
        goto L_0x0014;
    L_0x0046:
        r4 = r9.zzakb;	 Catch:{ zzfh -> 0x004e }
        r5 = 0;
        r2 = r7.zza(r4, r5, r5);	 Catch:{ zzfh -> 0x004e }
        goto L_0x0014;
    L_0x004e:
        r4 = r7.zzsz();	 Catch:{ all -> 0x0064 }
        if (r4 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0014;
    L_0x0055:
        r8 = new com.google.android.gms.internal.measurement.zzfi;	 Catch:{ all -> 0x0064 }
        r8.<init>(r6);	 Catch:{ all -> 0x0064 }
        throw r8;	 Catch:{ all -> 0x0064 }
    L_0x005b:
        r8.put(r2, r3);	 Catch:{ all -> 0x0064 }
        r8 = r7.zzadu;
        r8.zzax(r1);
        return;
    L_0x0064:
        r8 = move-exception;
        r9 = r7.zzadu;
        r9.zzax(r1);
        goto L_0x006c;
    L_0x006b:
        throw r8;
    L_0x006c:
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzec.zza(java.util.Map, com.google.android.gms.internal.measurement.zzfz, com.google.android.gms.internal.measurement.zzel):void");
    }

    private final Object zza(zzig zzig, Class<?> cls, zzel zzel) {
        switch (zzef.zzaee[zzig.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzsm());
            case 2:
                return zzso();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzsq());
            case 5:
                return Integer.valueOf(zzsl());
            case 6:
                return Long.valueOf(zzsk());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzsj());
            case 9:
                return Long.valueOf(zzsi());
            case 10:
                zzba(2);
                return zzc(zzgt.zzvy().zzf(cls), zzel);
            case 11:
                return Integer.valueOf(zzsr());
            case 12:
                return Long.valueOf(zzss());
            case 13:
                return Integer.valueOf(zzst());
            case 14:
                return Long.valueOf(zzsu());
            case 15:
                return zzsn();
            case 16:
                return Integer.valueOf(zzsp());
            case 17:
                return Long.valueOf(zzsh());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzbc(int i) {
        if ((i & 3) != 0) {
            throw zzfi.zzva();
        }
    }

    private final void zzbd(int i) {
        if (this.zzadu.zzsx() != i) {
            throw zzfi.zzut();
        }
    }
}
