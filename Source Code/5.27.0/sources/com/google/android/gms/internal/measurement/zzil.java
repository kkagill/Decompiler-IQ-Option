package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzil {
    private final byte[] buffer;
    private int zzadp;
    private int zzadq = 64;
    private int zzadr = 67108864;
    private int zzady;
    private int zzaea;
    private int zzaeb = Integer.MAX_VALUE;
    private final int zzaog;
    private final int zzaoh;
    private int zzaoi;
    private int zzaoj;
    private zzeb zzaok;

    public static zzil zzj(byte[] bArr, int i, int i2) {
        return new zzil(bArr, 0, i2);
    }

    public final int zzsg() {
        if (this.zzaoj == this.zzaoi) {
            this.zzaea = 0;
            return 0;
        }
        this.zzaea = zzta();
        int i = this.zzaea;
        if (i != 0) {
            return i;
        }
        throw new zzit("Protocol message contained an invalid tag (zero).");
    }

    private final void zzat(int i) {
        if (this.zzaea != i) {
            throw new zzit("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzau(int i) {
        int i2 = i & 7;
        if (i2 == 0) {
            zzta();
            return true;
        } else if (i2 == 1) {
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            zztf();
            return true;
        } else if (i2 == 2) {
            zzay(zzta());
            return true;
        } else if (i2 == 3) {
            do {
                i2 = zzsg();
                if (i2 == 0) {
                    break;
                }
            } while (zzau(i2));
            zzat(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zztf();
                zztf();
                zztf();
                zztf();
                return true;
            }
            throw new zzit("Protocol message tag had invalid wire type.");
        }
    }

    public final boolean zzsm() {
        return zzta() != 0;
    }

    public final String readString() {
        int zzta = zzta();
        if (zzta >= 0) {
            int i = this.zzaoi;
            int i2 = this.zzaoj;
            if (zzta <= i - i2) {
                String str = new String(this.buffer, i2, zzta, zziu.UTF_8);
                this.zzaoj += zzta;
                return str;
            }
            throw zzit.zzxd();
        }
        throw zzit.zzxe();
    }

    public final void zza(zziw zziw) {
        int zzta = zzta();
        if (this.zzadp >= this.zzadq) {
            throw new zzit("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (zzta >= 0) {
            zzta += this.zzaoj;
            int i = this.zzaeb;
            if (zzta <= i) {
                this.zzaeb = zzta;
                zzte();
                this.zzadp++;
                zziw.zza(this);
                zzat(0);
                this.zzadp--;
                this.zzaeb = i;
                zzte();
                return;
            }
            throw zzit.zzxd();
        } else {
            throw zzit.zzxe();
        }
    }

    public final int zzta() {
        byte zztf = zztf();
        if (zztf >= (byte) 0) {
            return zztf;
        }
        int i;
        int i2 = zztf & 127;
        byte zztf2 = zztf();
        if (zztf2 >= (byte) 0) {
            i = zztf2 << 7;
        } else {
            i2 |= (zztf2 & 127) << 7;
            zztf2 = zztf();
            if (zztf2 >= (byte) 0) {
                i = zztf2 << 14;
            } else {
                i2 |= (zztf2 & 127) << 14;
                zztf2 = zztf();
                if (zztf2 >= (byte) 0) {
                    i = zztf2 << 21;
                } else {
                    i2 |= (zztf2 & 127) << 21;
                    zztf2 = zztf();
                    i2 |= zztf2 << 28;
                    if (zztf2 < (byte) 0) {
                        for (i = 0; i < 5; i++) {
                            if (zztf() >= (byte) 0) {
                                return i2;
                            }
                        }
                        throw zzit.zzxf();
                    }
                    return i2;
                }
            }
        }
        i2 |= i;
        return i2;
    }

    public final long zztb() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zztf = zztf();
            j |= ((long) (zztf & 127)) << i;
            if ((zztf & 128) == 0) {
                return j;
            }
        }
        throw zzit.zzxf();
    }

    private zzil(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzaog = 0;
        i2 += 0;
        this.zzaoi = i2;
        this.zzaoh = i2;
        this.zzaoj = 0;
    }

    public final <T extends zzey<T, ?>> T zza(zzgr<T> zzgr) {
        try {
            if (this.zzaok == null) {
                this.zzaok = zzeb.zzd(this.buffer, this.zzaog, this.zzaoh);
            }
            int zzsx = this.zzaok.zzsx();
            int i = this.zzaoj - this.zzaog;
            if (zzsx <= i) {
                this.zzaok.zzay(i - zzsx);
                this.zzaok.zzav(this.zzadq - this.zzadp);
                zzey zzey = (zzey) this.zzaok.zza(zzgr, zzel.zztq());
                zzau(this.zzaea);
                return zzey;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(zzsx), Integer.valueOf(i)}));
        } catch (zzfi e) {
            throw new zzit("", e);
        }
    }

    private final void zzte() {
        this.zzaoi += this.zzady;
        int i = this.zzaoi;
        int i2 = this.zzaeb;
        if (i > i2) {
            this.zzady = i - i2;
            this.zzaoi = i - this.zzady;
            return;
        }
        this.zzady = 0;
    }

    public final int getPosition() {
        return this.zzaoj - this.zzaog;
    }

    public final byte[] zzt(int i, int i2) {
        if (i2 == 0) {
            return zzix.zzaph;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzaog + i, bArr, 0, i2);
        return bArr;
    }

    /* Access modifiers changed, original: final */
    public final void zzu(int i, int i2) {
        int i3 = this.zzaoj;
        int i4 = this.zzaog;
        if (i > i3 - i4) {
            i3 -= i4;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.zzaoj = i4 + i;
            this.zzaea = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final byte zztf() {
        int i = this.zzaoj;
        if (i != this.zzaoi) {
            byte[] bArr = this.buffer;
            this.zzaoj = i + 1;
            return bArr[i];
        }
        throw zzit.zzxd();
    }

    private final void zzay(int i) {
        if (i >= 0) {
            int i2 = this.zzaoj;
            int i3 = i2 + i;
            int i4 = this.zzaeb;
            if (i3 > i4) {
                zzay(i4 - i2);
                throw zzit.zzxd();
            } else if (i <= this.zzaoi - i2) {
                this.zzaoj = i2 + i;
                return;
            } else {
                throw zzit.zzxd();
            }
        }
        throw zzit.zzxe();
    }
}
