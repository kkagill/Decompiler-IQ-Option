package com.google.android.gms.internal.clearcut;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzfs {
    private final ByteBuffer zzgd;
    private zzbn zzrh;
    private int zzri;

    private zzfs(ByteBuffer byteBuffer) {
        this.zzgd = byteBuffer;
        this.zzgd.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzfs(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A:{RETURN} */
    private static int zza(java.lang.CharSequence r8) {
        /*
        r0 = r8.length();
        r1 = 0;
        r2 = 0;
    L_0x0006:
        if (r2 >= r0) goto L_0x0013;
    L_0x0008:
        r3 = r8.charAt(r2);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 >= r4) goto L_0x0013;
    L_0x0010:
        r2 = r2 + 1;
        goto L_0x0006;
    L_0x0013:
        r3 = r0;
    L_0x0014:
        if (r2 >= r0) goto L_0x006c;
    L_0x0016:
        r4 = r8.charAt(r2);
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r4 >= r5) goto L_0x0026;
    L_0x001e:
        r4 = 127 - r4;
        r4 = r4 >>> 31;
        r3 = r3 + r4;
        r2 = r2 + 1;
        goto L_0x0014;
    L_0x0026:
        r4 = r8.length();
    L_0x002a:
        if (r2 >= r4) goto L_0x006b;
    L_0x002c:
        r6 = r8.charAt(r2);
        if (r6 >= r5) goto L_0x0038;
    L_0x0032:
        r6 = 127 - r6;
        r6 = r6 >>> 31;
        r1 = r1 + r6;
        goto L_0x0068;
    L_0x0038:
        r1 = r1 + 2;
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r7 > r6) goto L_0x0068;
    L_0x003f:
        r7 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r6 > r7) goto L_0x0068;
    L_0x0044:
        r6 = java.lang.Character.codePointAt(r8, r2);
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r6 < r7) goto L_0x004f;
    L_0x004c:
        r2 = r2 + 1;
        goto L_0x0068;
    L_0x004f:
        r8 = new java.lang.IllegalArgumentException;
        r0 = 39;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Unpaired surrogate at index ";
        r1.append(r0);
        r1.append(r2);
        r0 = r1.toString();
        r8.<init>(r0);
        throw r8;
    L_0x0068:
        r2 = r2 + 1;
        goto L_0x002a;
    L_0x006b:
        r3 = r3 + r1;
    L_0x006c:
        if (r3 < r0) goto L_0x006f;
    L_0x006e:
        return r3;
    L_0x006f:
        r8 = new java.lang.IllegalArgumentException;
        r0 = (long) r3;
        r2 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r0 = r0 + r2;
        r2 = 54;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "UTF-8 length does not fit in int: ";
        r3.append(r2);
        r3.append(r0);
        r0 = r3.toString();
        r8.<init>(r0);
        goto L_0x0090;
    L_0x008f:
        throw r8;
    L_0x0090:
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfs.zza(java.lang.CharSequence):int");
    }

    private final void zzao(int i) {
        byte b = (byte) i;
        if (this.zzgd.hasRemaining()) {
            this.zzgd.put(b);
            return;
        }
        throw new zzft(this.zzgd.position(), this.zzgd.limit());
    }

    private final void zzap(int i) {
        while ((i & -128) != 0) {
            zzao((i & 127) | 128);
            i >>>= 7;
        }
        zzao(i);
    }

    public static int zzb(int i, zzfz zzfz) {
        i = zzr(i);
        int zzas = zzfz.zzas();
        return i + (zzz(zzas) + zzas);
    }

    public static int zzb(int i, String str) {
        return zzr(i) + zzh(str);
    }

    public static int zzb(int i, byte[] bArr) {
        return zzr(i) + zzh(bArr);
    }

    public static int zzd(int i, long j) {
        return zzr(i) + zzo(j);
    }

    private static void zzd(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        String str = "Unpaired surrogate at index ";
        int i = 0;
        int arrayOffset;
        int remaining;
        char charAt;
        StringBuilder stringBuilder;
        if (byteBuffer.hasArray()) {
            try {
                int i2;
                byte[] array = byteBuffer.array();
                arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                remaining = byteBuffer.remaining();
                int length = charSequence.length();
                remaining += arrayOffset;
                while (i < length) {
                    i2 = i + arrayOffset;
                    if (i2 >= remaining) {
                        break;
                    }
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 >= 128) {
                        break;
                    }
                    array[i2] = (byte) charAt2;
                    i++;
                }
                if (i == length) {
                    arrayOffset += length;
                } else {
                    arrayOffset += i;
                    while (i < length) {
                        int i3;
                        char charAt3 = charSequence.charAt(i);
                        if (charAt3 < 128 && arrayOffset < remaining) {
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) charAt3;
                        } else if (charAt3 < 2048 && arrayOffset <= remaining - 2) {
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) ((charAt3 >>> 6) | 960);
                            arrayOffset = i3 + 1;
                            array[i3] = (byte) ((charAt3 & 63) | 128);
                            i++;
                        } else if ((charAt3 < 55296 || 57343 < charAt3) && arrayOffset <= remaining - 3) {
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) ((charAt3 >>> 12) | 480);
                            arrayOffset = i3 + 1;
                            array[i3] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i3 = arrayOffset + 1;
                            array[arrayOffset] = (byte) ((charAt3 & 63) | 128);
                        } else if (arrayOffset <= remaining - 4) {
                            i3 = i + 1;
                            if (i3 != charSequence.length()) {
                                charAt = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt3, charAt)) {
                                    i = Character.toCodePoint(charAt3, charAt);
                                    i2 = arrayOffset + 1;
                                    array[arrayOffset] = (byte) ((i >>> 18) | 240);
                                    arrayOffset = i2 + 1;
                                    array[i2] = (byte) (((i >>> 12) & 63) | 128);
                                    i2 = arrayOffset + 1;
                                    array[arrayOffset] = (byte) (((i >>> 6) & 63) | 128);
                                    arrayOffset = i2 + 1;
                                    array[i2] = (byte) ((i & 63) | 128);
                                    i = i3;
                                    i++;
                                } else {
                                    i = i3;
                                }
                            }
                            i--;
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append(str);
                            stringBuilder.append(i);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            StringBuilder stringBuilder2 = new StringBuilder(37);
                            stringBuilder2.append("Failed writing ");
                            stringBuilder2.append(charAt3);
                            stringBuilder2.append(" at index ");
                            stringBuilder2.append(arrayOffset);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
                        }
                        arrayOffset = i3;
                        i++;
                    }
                }
                byteBuffer.position(arrayOffset - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length2 = charSequence.length();
        while (i < length2) {
            arrayOffset = charSequence.charAt(i);
            if (arrayOffset >= 128) {
                if (arrayOffset < 2048) {
                    remaining = (arrayOffset >>> 6) | 960;
                } else if (arrayOffset < 55296 || 57343 < arrayOffset) {
                    byteBuffer.put((byte) ((arrayOffset >>> 12) | 480));
                    remaining = ((arrayOffset >>> 6) & 63) | 128;
                } else {
                    remaining = i + 1;
                    if (remaining != charSequence.length()) {
                        charAt = charSequence.charAt(remaining);
                        if (Character.isSurrogatePair(arrayOffset, charAt)) {
                            i = Character.toCodePoint(arrayOffset, charAt);
                            byteBuffer.put((byte) ((i >>> 18) | 240));
                            byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((i & 63) | 128));
                            i = remaining;
                            i++;
                        } else {
                            i = remaining;
                        }
                    }
                    i--;
                    stringBuilder = new StringBuilder(39);
                    stringBuilder.append(str);
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                byteBuffer.put((byte) remaining);
                arrayOffset = (arrayOffset & 63) | 128;
            }
            byteBuffer.put((byte) arrayOffset);
            i++;
        }
    }

    public static zzfs zzg(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    public static int zzh(String str) {
        int zza = zza(str);
        return zzz(zza) + zza;
    }

    public static int zzh(byte[] bArr) {
        return zzz(bArr.length) + bArr.length;
    }

    public static zzfs zzh(byte[] bArr, int i, int i2) {
        return new zzfs(bArr, 0, i2);
    }

    public static long zzj(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzo(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int zzr(int i) {
        return zzz(i << 3);
    }

    public static int zzs(int i) {
        return i >= 0 ? zzz(i) : 10;
    }

    private static int zzz(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public final void zza(int i, zzfz zzfz) {
        zzb(i, 2);
        if (zzfz.zzrs < 0) {
            zzfz.zzas();
        }
        zzap(zzfz.zzrs);
        zzfz.zza(this);
    }

    public final void zza(int i, String str) {
        zzb(i, 2);
        try {
            i = zzz(str.length());
            if (i == zzz(str.length() * 3)) {
                int position = this.zzgd.position();
                if (this.zzgd.remaining() >= i) {
                    this.zzgd.position(position + i);
                    zzd((CharSequence) str, this.zzgd);
                    int position2 = this.zzgd.position();
                    this.zzgd.position(position);
                    zzap((position2 - position) - i);
                    this.zzgd.position(position2);
                    return;
                }
                throw new zzft(position + i, this.zzgd.limit());
            }
            zzap(zza(str));
            zzd((CharSequence) str, this.zzgd);
        } catch (BufferOverflowException e) {
            zzft zzft = new zzft(this.zzgd.position(), this.zzgd.limit());
            zzft.initCause(e);
            throw zzft;
        }
    }

    public final void zza(int i, byte[] bArr) {
        zzb(i, 2);
        zzap(bArr.length);
        i = bArr.length;
        if (this.zzgd.remaining() >= i) {
            this.zzgd.put(bArr, 0, i);
            return;
        }
        throw new zzft(this.zzgd.position(), this.zzgd.limit());
    }

    public final void zzb(int i, int i2) {
        zzap((i << 3) | i2);
    }

    public final void zzb(int i, boolean z) {
        zzb(25, 0);
        byte b = (byte) z;
        if (this.zzgd.hasRemaining()) {
            this.zzgd.put(b);
            return;
        }
        throw new zzft(this.zzgd.position(), this.zzgd.limit());
    }

    public final void zzc(int i, int i2) {
        zzb(i, 0);
        if (i2 >= 0) {
            zzap(i2);
        } else {
            zzn((long) i2);
        }
    }

    public final void zze(int i, zzdo zzdo) {
        zzbn zzbn;
        if (this.zzrh == null) {
            this.zzrh = zzbn.zza(this.zzgd);
        } else {
            if (this.zzri != this.zzgd.position()) {
                this.zzrh.write(this.zzgd.array(), this.zzri, this.zzgd.position() - this.zzri);
            }
            zzbn = this.zzrh;
            zzbn.zza(i, zzdo);
            zzbn.flush();
            this.zzri = this.zzgd.position();
        }
        this.zzri = this.zzgd.position();
        zzbn = this.zzrh;
        zzbn.zza(i, zzdo);
        zzbn.flush();
        this.zzri = this.zzgd.position();
    }

    public final void zzem() {
        if (this.zzgd.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.zzgd.remaining())}));
        }
    }

    public final void zzi(int i, long j) {
        zzb(i, 0);
        zzn(j);
    }

    public final void zzn(long j) {
        while ((-128 & j) != 0) {
            zzao((((int) j) & 127) | 128);
            j >>>= 7;
        }
        zzao((int) j);
    }
}
