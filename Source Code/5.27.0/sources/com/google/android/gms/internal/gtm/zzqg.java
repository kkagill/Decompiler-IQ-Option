package com.google.android.gms.internal.gtm;

import java.util.Arrays;

final class zzqg extends zzqe {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzawk;
    private int zzawl;
    private int zzawm;
    private int zzawn;
    private int zzawo;

    private zzqg(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzawo = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzawm = this.pos;
        this.zzawk = z;
    }

    public final int zzni() {
        if (zzny()) {
            this.zzawn = 0;
            return 0;
        }
        this.zzawn = zzoa();
        int i = this.zzawn;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw new zzrk("Protocol message contained an invalid tag (zero).");
    }

    public final void zzan(int i) {
        if (this.zzawn != i) {
            throw zzrk.zzps();
        }
    }

    public final boolean zzao(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < (byte) 0) {
                        i3++;
                    }
                }
                throw zzrk.zzpr();
            }
            while (i3 < 10) {
                if (zzof() < (byte) 0) {
                    i3++;
                }
            }
            throw zzrk.zzpr();
            return true;
        } else if (i2 == 1) {
            zzas(8);
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
                zzas(4);
                return true;
            }
            throw zzrk.zzpt();
        }
    }

    public final double readDouble() {
        return Double.longBitsToDouble(zzod());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(zzoc());
    }

    public final long zznj() {
        return zzob();
    }

    public final long zznk() {
        return zzob();
    }

    public final int zznl() {
        return zzoa();
    }

    public final long zznm() {
        return zzod();
    }

    public final int zznn() {
        return zzoc();
    }

    public final boolean zzno() {
        return zzob() != 0;
    }

    public final String readString() {
        int zzoa = zzoa();
        if (zzoa > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzoa <= i - i2) {
                String str = new String(this.buffer, i2, zzoa, zzre.UTF_8);
                this.pos += zzoa;
                return str;
            }
        }
        if (zzoa == 0) {
            return "";
        }
        if (zzoa < 0) {
            throw zzrk.zzpq();
        }
        throw zzrk.zzpp();
    }

    public final String zznp() {
        int zzoa = zzoa();
        if (zzoa > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzoa <= i - i2) {
                String zzh = zztz.zzh(this.buffer, i2, zzoa);
                this.pos += zzoa;
                return zzh;
            }
        }
        if (zzoa == 0) {
            return "";
        }
        if (zzoa <= 0) {
            throw zzrk.zzpq();
        }
        throw zzrk.zzpp();
    }

    public final <T extends zzsk> T zza(zzsu<T> zzsu, zzqp zzqp) {
        int zzoa = zzoa();
        if (this.zzawf < this.zzawg) {
            zzoa = zzaq(zzoa);
            this.zzawf++;
            zzsk zzsk = (zzsk) zzsu.zza(this, zzqp);
            zzan(0);
            this.zzawf--;
            zzar(zzoa);
            return zzsk;
        }
        throw zzrk.zzpu();
    }

    public final zzps zznq() {
        int i;
        int i2;
        int zzoa = zzoa();
        if (zzoa > 0) {
            i = this.limit;
            i2 = this.pos;
            if (zzoa <= i - i2) {
                zzps zzb = zzps.zzb(this.buffer, i2, zzoa);
                this.pos += zzoa;
                return zzb;
            }
        }
        if (zzoa == 0) {
            return zzps.zzavx;
        }
        byte[] copyOfRange;
        if (zzoa > 0) {
            i = this.limit;
            i2 = this.pos;
            if (zzoa <= i - i2) {
                this.pos = zzoa + i2;
                copyOfRange = Arrays.copyOfRange(this.buffer, i2, this.pos);
                return zzps.zzf(copyOfRange);
            }
        }
        if (zzoa > 0) {
            throw zzrk.zzpp();
        } else if (zzoa == 0) {
            copyOfRange = zzre.zzbbh;
            return zzps.zzf(copyOfRange);
        } else {
            throw zzrk.zzpq();
        }
    }

    public final int zznr() {
        return zzoa();
    }

    public final int zzns() {
        return zzoa();
    }

    public final int zznt() {
        return zzoc();
    }

    public final long zznu() {
        return zzod();
    }

    public final int zznv() {
        int zzoa = zzoa();
        return (-(zzoa & 1)) ^ (zzoa >>> 1);
    }

    public final long zznw() {
        long zzob = zzob();
        return (-(zzob & 1)) ^ (zzob >>> 1);
    }

    /* JADX WARNING: Missing block: B:29:0x0066, code skipped:
            if (r2[r3] >= (byte) 0) goto L_0x0068;
     */
    private final int zzoa() {
        /*
        r5 = this;
        r0 = r5.pos;
        r1 = r5.limit;
        if (r1 == r0) goto L_0x006b;
    L_0x0006:
        r2 = r5.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.pos = r3;
        return r0;
    L_0x0011:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x006b;
    L_0x0016:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0022;
    L_0x001f:
        r0 = r0 ^ -128;
        goto L_0x0068;
    L_0x0022:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x002f;
    L_0x002b:
        r0 = r0 ^ 16256;
    L_0x002d:
        r1 = r3;
        goto L_0x0068;
    L_0x002f:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x003d;
    L_0x0038:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0068;
    L_0x003d:
        r3 = r1 + 1;
        r1 = r2[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x002d;
    L_0x004a:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0068;
    L_0x0050:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x002d;
    L_0x0056:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0068;
    L_0x005c:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x002d;
    L_0x0062:
        r1 = r3 + 1;
        r2 = r2[r3];
        if (r2 < 0) goto L_0x006b;
    L_0x0068:
        r5.pos = r1;
        return r0;
    L_0x006b:
        r0 = r5.zznx();
        r1 = (int) r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqg.zzoa():int");
    }

    /* JADX WARNING: Missing block: B:36:0x00b0, code skipped:
            if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    private final long zzob() {
        /*
        r11 = this;
        r0 = r11.pos;
        r1 = r11.limit;
        if (r1 == r0) goto L_0x00b5;
    L_0x0006:
        r2 = r11.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0012;
    L_0x000e:
        r11.pos = r3;
        r0 = (long) r0;
        return r0;
    L_0x0012:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x00b5;
    L_0x0017:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0026;
    L_0x0020:
        r0 = r0 ^ -128;
    L_0x0022:
        r2 = (long) r0;
        r3 = r2;
        goto L_0x00b2;
    L_0x0026:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0037;
    L_0x002f:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        r9 = r0;
        r1 = r3;
        r3 = r9;
        goto L_0x00b2;
    L_0x0037:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0045;
    L_0x0040:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0022;
    L_0x0045:
        r3 = (long) r0;
        r0 = r1 + 1;
        r1 = r2[r1];
        r5 = (long) r1;
        r1 = 28;
        r5 = r5 << r1;
        r3 = r3 ^ r5;
        r5 = 0;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x005c;
    L_0x0055:
        r1 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
    L_0x0058:
        r1 = r1 ^ r3;
        r3 = r1;
    L_0x005a:
        r1 = r0;
        goto L_0x00b2;
    L_0x005c:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 35;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x0070;
    L_0x0069:
        r5 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
    L_0x006e:
        r3 = r3 ^ r5;
        goto L_0x00b2;
    L_0x0070:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 42;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x0083;
    L_0x007d:
        r1 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        goto L_0x0058;
    L_0x0083:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 49;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x0096;
    L_0x0090:
        r5 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        goto L_0x006e;
    L_0x0096:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 56;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r7 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x005a;
    L_0x00a9:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 < 0) goto L_0x00b5;
    L_0x00b2:
        r11.pos = r1;
        return r3;
    L_0x00b5:
        r0 = r11.zznx();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqg.zzob():long");
    }

    /* Access modifiers changed, original: final */
    public final long zznx() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzof = zzof();
            j |= ((long) (zzof & 127)) << i;
            if ((zzof & 128) == 0) {
                return j;
            }
        }
        throw zzrk.zzpr();
    }

    private final int zzoc() {
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }
        throw zzrk.zzpp();
    }

    private final long zzod() {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
        }
        throw zzrk.zzpp();
    }

    public final int zzaq(int i) {
        if (i >= 0) {
            i += zznz();
            int i2 = this.zzawo;
            if (i <= i2) {
                this.zzawo = i;
                zzoe();
                return i2;
            }
            throw zzrk.zzpp();
        }
        throw zzrk.zzpq();
    }

    private final void zzoe() {
        this.limit += this.zzawl;
        int i = this.limit;
        int i2 = i - this.zzawm;
        int i3 = this.zzawo;
        if (i2 > i3) {
            this.zzawl = i2 - i3;
            this.limit = i - this.zzawl;
            return;
        }
        this.zzawl = 0;
    }

    public final void zzar(int i) {
        this.zzawo = i;
        zzoe();
    }

    public final boolean zzny() {
        return this.pos == this.limit;
    }

    public final int zznz() {
        return this.pos - this.zzawm;
    }

    private final byte zzof() {
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzrk.zzpp();
    }

    public final void zzas(int i) {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzrk.zzpq();
        }
        throw zzrk.zzpp();
    }

    /* synthetic */ zzqg(byte[] bArr, int i, int i2, boolean z, zzqf zzqf) {
        this(bArr, i, i2, z);
    }
}
