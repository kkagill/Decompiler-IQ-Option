package com.google.android.gms.internal.vision;

import java.io.IOException;

public final class zzjk {
    private final byte[] buffer;
    private final int zzacz;
    private final int zzada;
    private int zzadb;
    private int zzadc;
    private zzez zzadd;
    private int zzsf;
    private int zzsg = 64;
    private int zzsh = 67108864;
    private int zzsl;
    private int zzsn;
    private int zzso = Integer.MAX_VALUE;

    public static zzjk zzk(byte[] bArr, int i, int i2) {
        return new zzjk(bArr, 0, i2);
    }

    public final int zzdq() {
        if (this.zzadc == this.zzadb) {
            this.zzsn = 0;
            return 0;
        }
        this.zzsn = zzdt();
        int i = this.zzsn;
        if (i != 0) {
            return i;
        }
        throw new zzjs("Protocol message contained an invalid tag (zero).");
    }

    public final void zzak(int i) {
        if (this.zzsn != i) {
            throw new zzjs("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzal(int i) {
        int i2 = i & 7;
        if (i2 == 0) {
            zzdt();
            return true;
        } else if (i2 == 1) {
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            zzdy();
            return true;
        } else if (i2 == 2) {
            zzap(zzdt());
            return true;
        } else if (i2 == 3) {
            do {
                i2 = zzdq();
                if (i2 == 0) {
                    break;
                }
            } while (zzal(i2));
            zzak(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzdv();
                return true;
            }
            throw new zzjs("Protocol message tag had invalid wire type.");
        }
    }

    public final boolean zzcu() {
        return zzdt() != 0;
    }

    public final String readString() {
        int zzdt = zzdt();
        if (zzdt >= 0) {
            int i = this.zzadb;
            int i2 = this.zzadc;
            if (zzdt <= i - i2) {
                String str = new String(this.buffer, i2, zzdt, zzjr.UTF_8);
                this.zzadc += zzdt;
                return str;
            }
            throw zzjs.zzht();
        }
        throw zzjs.zzhu();
    }

    public final void zza(zzjt zzjt) {
        int zzdt = zzdt();
        if (this.zzsf < this.zzsg) {
            zzdt = zzan(zzdt);
            this.zzsf++;
            zzjt.zza(this);
            zzak(0);
            this.zzsf--;
            zzao(zzdt);
            return;
        }
        throw new zzjs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final int zzdt() {
        byte zzdy = zzdy();
        if (zzdy >= (byte) 0) {
            return zzdy;
        }
        int i;
        int i2 = zzdy & 127;
        byte zzdy2 = zzdy();
        if (zzdy2 >= (byte) 0) {
            i = zzdy2 << 7;
        } else {
            i2 |= (zzdy2 & 127) << 7;
            zzdy2 = zzdy();
            if (zzdy2 >= (byte) 0) {
                i = zzdy2 << 14;
            } else {
                i2 |= (zzdy2 & 127) << 14;
                zzdy2 = zzdy();
                if (zzdy2 >= (byte) 0) {
                    i = zzdy2 << 21;
                } else {
                    i2 |= (zzdy2 & 127) << 21;
                    zzdy2 = zzdy();
                    i2 |= zzdy2 << 28;
                    if (zzdy2 < (byte) 0) {
                        for (i = 0; i < 5; i++) {
                            if (zzdy() >= (byte) 0) {
                                return i2;
                            }
                        }
                        throw zzjs.zzhv();
                    }
                    return i2;
                }
            }
        }
        i2 |= i;
        return i2;
    }

    public final long zzdu() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzdy = zzdy();
            j |= ((long) (zzdy & 127)) << i;
            if ((zzdy & 128) == 0) {
                return j;
            }
        }
        throw zzjs.zzhv();
    }

    public final int zzdv() {
        return (((zzdy() & 255) | ((zzdy() & 255) << 8)) | ((zzdy() & 255) << 16)) | ((zzdy() & 255) << 24);
    }

    private zzjk(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzacz = i;
        i2 += i;
        this.zzadb = i2;
        this.zzada = i2;
        this.zzadc = i;
    }

    public final <T extends zzfy<T, ?>> T zza(zzhq<T> zzhq) {
        try {
            if (this.zzadd == null) {
                this.zzadd = zzez.zze(this.buffer, this.zzacz, this.zzada);
            }
            int zzds = this.zzadd.zzds();
            int i = this.zzadc - this.zzacz;
            if (zzds <= i) {
                this.zzadd.zzap(i - zzds);
                this.zzadd.zzam(this.zzsg - this.zzsf);
                zzfy zzfy = (zzfy) this.zzadd.zza(zzhq, zzfk.zzel());
                zzal(this.zzsn);
                return zzfy;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(zzds), Integer.valueOf(i)}));
        } catch (zzgf e) {
            throw new zzjs("", e);
        }
    }

    public final int zzan(int i) {
        if (i >= 0) {
            i += this.zzadc;
            int i2 = this.zzso;
            if (i <= i2) {
                this.zzso = i;
                zzdx();
                return i2;
            }
            throw zzjs.zzht();
        }
        throw zzjs.zzhu();
    }

    private final void zzdx() {
        this.zzadb += this.zzsl;
        int i = this.zzadb;
        int i2 = this.zzso;
        if (i > i2) {
            this.zzsl = i - i2;
            this.zzadb = i - this.zzsl;
            return;
        }
        this.zzsl = 0;
    }

    public final void zzao(int i) {
        this.zzso = i;
        zzdx();
    }

    public final int zzhq() {
        int i = this.zzso;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzadc;
    }

    public final int getPosition() {
        return this.zzadc - this.zzacz;
    }

    public final byte[] zzv(int i, int i2) {
        if (i2 == 0) {
            return zzjw.zzaea;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzacz + i, bArr, 0, i2);
        return bArr;
    }

    public final void zzbt(int i) {
        zzw(i, this.zzsn);
    }

    /* Access modifiers changed, original: final */
    public final void zzw(int i, int i2) {
        int i3 = this.zzadc;
        int i4 = this.zzacz;
        if (i > i3 - i4) {
            i3 -= i4;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.zzadc = i4 + i;
            this.zzsn = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final byte zzdy() {
        int i = this.zzadc;
        if (i != this.zzadb) {
            byte[] bArr = this.buffer;
            this.zzadc = i + 1;
            return bArr[i];
        }
        throw zzjs.zzht();
    }

    private final void zzap(int i) {
        if (i >= 0) {
            int i2 = this.zzadc;
            int i3 = i2 + i;
            int i4 = this.zzso;
            if (i3 > i4) {
                zzap(i4 - i2);
                throw zzjs.zzht();
            } else if (i <= this.zzadb - i2) {
                this.zzadc = i2 + i;
                return;
            } else {
                throw zzjs.zzht();
            }
        }
        throw zzjs.zzhu();
    }
}
