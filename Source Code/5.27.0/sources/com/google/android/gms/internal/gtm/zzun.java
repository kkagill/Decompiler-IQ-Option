package com.google.android.gms.internal.gtm;

import java.io.IOException;

public final class zzun {
    private final byte[] buffer;
    private int zzawf;
    private int zzawg = 64;
    private int zzawh = 67108864;
    private int zzawl;
    private int zzawn;
    private int zzawo = Integer.MAX_VALUE;
    private final int zzbgu;
    private final int zzbgv;
    private int zzbgw;
    private int zzbgx;
    private zzqe zzbgy;

    public static zzun zzk(byte[] bArr) {
        return zzj(bArr, 0, bArr.length);
    }

    public static zzun zzj(byte[] bArr, int i, int i2) {
        return new zzun(bArr, 0, i2);
    }

    public final int zzni() {
        if (this.zzbgx == this.zzbgw) {
            this.zzawn = 0;
            return 0;
        }
        this.zzawn = zzoa();
        int i = this.zzawn;
        if (i != 0) {
            return i;
        }
        throw new zzuv("Protocol message contained an invalid tag (zero).");
    }

    public final void zzan(int i) {
        if (this.zzawn != i) {
            throw new zzuv("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzao(int i) {
        int i2 = i & 7;
        if (i2 == 0) {
            zzoa();
            return true;
        } else if (i2 == 1) {
            zzof();
            zzof();
            zzof();
            zzof();
            zzof();
            zzof();
            zzof();
            zzof();
            return true;
        } else if (i2 == 2) {
            zzas(zzoa());
            return true;
        } else if (i2 == 3) {
            do {
                i2 = zzni();
                if (i2 == 0) {
                    break;
                }
            } while (zzao(i2));
            zzan(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzoc();
                return true;
            }
            throw new zzuv("Protocol message tag had invalid wire type.");
        }
    }

    public final boolean zzno() {
        return zzoa() != 0;
    }

    public final String readString() {
        int zzoa = zzoa();
        if (zzoa >= 0) {
            int i = this.zzbgw;
            int i2 = this.zzbgx;
            if (zzoa <= i - i2) {
                String str = new String(this.buffer, i2, zzoa, zzuu.UTF_8);
                this.zzbgx += zzoa;
                return str;
            }
            throw zzuv.zzsa();
        }
        throw zzuv.zzsb();
    }

    public final void zza(zzuw zzuw, int i) {
        int i2 = this.zzawf;
        if (i2 < this.zzawg) {
            this.zzawf = i2 + 1;
            zzuw.zza(this);
            zzan((i << 3) | 4);
            this.zzawf--;
            return;
        }
        throw zzuv.zzsd();
    }

    public final void zza(zzuw zzuw) {
        int zzoa = zzoa();
        if (this.zzawf < this.zzawg) {
            zzoa = zzaq(zzoa);
            this.zzawf++;
            zzuw.zza(this);
            zzan(0);
            this.zzawf--;
            zzar(zzoa);
            return;
        }
        throw zzuv.zzsd();
    }

    public final int zzoa() {
        byte zzof = zzof();
        if (zzof >= (byte) 0) {
            return zzof;
        }
        int i;
        int i2 = zzof & 127;
        byte zzof2 = zzof();
        if (zzof2 >= (byte) 0) {
            i = zzof2 << 7;
        } else {
            i2 |= (zzof2 & 127) << 7;
            zzof2 = zzof();
            if (zzof2 >= (byte) 0) {
                i = zzof2 << 14;
            } else {
                i2 |= (zzof2 & 127) << 14;
                zzof2 = zzof();
                if (zzof2 >= (byte) 0) {
                    i = zzof2 << 21;
                } else {
                    i2 |= (zzof2 & 127) << 21;
                    zzof2 = zzof();
                    i2 |= zzof2 << 28;
                    if (zzof2 < (byte) 0) {
                        for (i = 0; i < 5; i++) {
                            if (zzof() >= (byte) 0) {
                                return i2;
                            }
                        }
                        throw zzuv.zzsc();
                    }
                    return i2;
                }
            }
        }
        i2 |= i;
        return i2;
    }

    public final long zzob() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzof = zzof();
            j |= ((long) (zzof & 127)) << i;
            if ((zzof & 128) == 0) {
                return j;
            }
        }
        throw zzuv.zzsc();
    }

    public final int zzoc() {
        return (((zzof() & 255) | ((zzof() & 255) << 8)) | ((zzof() & 255) << 16)) | ((zzof() & 255) << 24);
    }

    private zzun(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzbgu = i;
        i2 += i;
        this.zzbgw = i2;
        this.zzbgv = i2;
        this.zzbgx = i;
    }

    private final zzqe zzru() {
        if (this.zzbgy == null) {
            this.zzbgy = zzqe.zzd(this.buffer, this.zzbgu, this.zzbgv);
        }
        int zznz = this.zzbgy.zznz();
        int i = this.zzbgx - this.zzbgu;
        if (zznz <= i) {
            this.zzbgy.zzas(i - zznz);
            this.zzbgy.zzap(this.zzawg - this.zzawf);
            return this.zzbgy;
        }
        throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(zznz), Integer.valueOf(i)}));
    }

    public final <T extends zzrc<T, ?>> T zza(zzsu<T> zzsu) {
        try {
            zzrc zzrc = (zzrc) zzru().zza(zzsu, zzqp.zzor());
            zzao(this.zzawn);
            return zzrc;
        } catch (zzrk e) {
            throw new zzuv("", e);
        }
    }

    public final int zzaq(int i) {
        if (i >= 0) {
            i += this.zzbgx;
            int i2 = this.zzawo;
            if (i <= i2) {
                this.zzawo = i;
                zzoe();
                return i2;
            }
            throw zzuv.zzsa();
        }
        throw zzuv.zzsb();
    }

    private final void zzoe() {
        this.zzbgw += this.zzawl;
        int i = this.zzbgw;
        int i2 = this.zzawo;
        if (i > i2) {
            this.zzawl = i - i2;
            this.zzbgw = i - this.zzawl;
            return;
        }
        this.zzawl = 0;
    }

    public final void zzar(int i) {
        this.zzawo = i;
        zzoe();
    }

    public final int zzrv() {
        int i = this.zzawo;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzbgx;
    }

    public final int getPosition() {
        return this.zzbgx - this.zzbgu;
    }

    public final byte[] zzt(int i, int i2) {
        if (i2 == 0) {
            return zzuz.zzbhw;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzbgu + i, bArr, 0, i2);
        return bArr;
    }

    public final void zzbz(int i) {
        zzu(i, this.zzawn);
    }

    /* Access modifiers changed, original: final */
    public final void zzu(int i, int i2) {
        int i3 = this.zzbgx;
        int i4 = this.zzbgu;
        if (i > i3 - i4) {
            i3 -= i4;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.zzbgx = i4 + i;
            this.zzawn = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final byte zzof() {
        int i = this.zzbgx;
        if (i != this.zzbgw) {
            byte[] bArr = this.buffer;
            this.zzbgx = i + 1;
            return bArr[i];
        }
        throw zzuv.zzsa();
    }

    private final void zzas(int i) {
        if (i >= 0) {
            int i2 = this.zzbgx;
            int i3 = i2 + i;
            int i4 = this.zzawo;
            if (i3 > i4) {
                zzas(i4 - i2);
                throw zzuv.zzsa();
            } else if (i <= this.zzbgw - i2) {
                this.zzbgx = i2 + i;
                return;
            } else {
                throw zzuv.zzsa();
            }
        }
        throw zzuv.zzsb();
    }
}
