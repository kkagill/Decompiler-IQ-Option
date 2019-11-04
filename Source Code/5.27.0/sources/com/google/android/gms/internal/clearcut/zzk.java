package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzk {
    private static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private static long zza(long j, long j2, long j3) {
        j = (j ^ j2) * j3;
        j = ((j ^ (j >>> 47)) ^ j2) * j3;
        return (j ^ (j >>> 47)) * j3;
    }

    public static long zza(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder stringBuilder = new StringBuilder(67);
            stringBuilder.append("Out of bound index with offput: 0 and length: ");
            stringBuilder.append(length);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        int i = 37;
        int i2 = 0;
        long j;
        long zzb;
        long zzb2;
        long zzb3;
        long zzb4;
        long rotateRight;
        if (length <= 32) {
            if (length > 16) {
                j = ((long) (length << 1)) - 7286425919675154353L;
                zzb = zzb(bArr2, 0) * -5435081209227447693L;
                zzb2 = zzb(bArr2, 8);
                length += 0;
                zzb3 = zzb(bArr2, length - 8) * j;
                return zza((Long.rotateRight(zzb + zzb2, 43) + Long.rotateRight(zzb3, 30)) + (zzb(bArr2, length - 16) * -7286425919675154353L), (zzb + Long.rotateRight(zzb2 - 7286425919675154353L, 18)) + zzb3, j);
            } else if (length >= 8) {
                j = ((long) (length << 1)) - 7286425919675154353L;
                zzb4 = zzb(bArr2, 0) - 7286425919675154353L;
                long zzb5 = zzb(bArr2, (length + 0) - 8);
                return zza((Long.rotateRight(zzb5, 37) * j) + zzb4, (Long.rotateRight(zzb4, 25) + zzb5) * j, j);
            } else if (length >= 4) {
                return zza(((((long) zza(bArr2, 0)) & 4294967295L) << 3) + ((long) length), ((long) zza(bArr2, (length + 0) - 4)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                zzb4 = (((long) ((bArr2[0] & 255) + ((bArr2[(length >> 1) + 0] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((bArr2[(length - 1) + 0] & 255) << 2))) * -4348849565147123417L);
                return (zzb4 ^ (zzb4 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            zzb = ((long) (length << 1)) - 7286425919675154353L;
            zzb2 = zzb(bArr2, 0) * -7286425919675154353L;
            long zzb6 = zzb(bArr2, 8);
            length += 0;
            zzb4 = zzb(bArr2, length - 8) * zzb;
            rotateRight = (Long.rotateRight(zzb2 + zzb6, 43) + Long.rotateRight(zzb4, 30)) + (zzb(bArr2, length - 16) * -7286425919675154353L);
            j = zzb;
            zzb4 = zza(rotateRight, (Long.rotateRight(-7286425919675154353L + zzb6, 18) + zzb2) + zzb4, j);
            bArr2 = bArr;
            long zzb7 = zzb(bArr2, 16) * zzb;
            long zzb8 = zzb(bArr2, 24);
            zzb3 = (rotateRight + zzb(bArr2, length - 32)) * zzb;
            return zza(((zzb4 + zzb(bArr2, length - 24)) * zzb) + (Long.rotateRight(zzb7 + zzb8, 43) + Long.rotateRight(zzb3, 30)), (zzb7 + Long.rotateRight(zzb8 + zzb2, 18)) + zzb3, j);
        } else {
            zzb4 = 2480279821605975764L;
            long j2 = 1390051526045402406L;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long zzb9 = zzb(bArr2, 0) + 95310865018149119L;
            length--;
            int i3 = ((length / 64) << 6) + 0;
            int i4 = length & 63;
            int i5 = (i3 + i4) - 63;
            int i6 = 0;
            while (true) {
                zzb3 = (Long.rotateRight(((zzb9 + zzb4) + jArr[i2]) + zzb(bArr2, i6 + 8), i) * -5435081209227447693L) ^ jArr2[1];
                zzb9 = (Long.rotateRight((zzb4 + jArr[1]) + zzb(bArr2, i6 + 48), 42) * -5435081209227447693L) + (jArr[0] + zzb(bArr2, i6 + 40));
                long rotateRight2 = Long.rotateRight(j2 + jArr2[0], 33) * -5435081209227447693L;
                int i7 = i4;
                i = i3;
                zza(bArr, i6, jArr[1] * -5435081209227447693L, zzb3 + jArr2[0], jArr);
                zza(bArr, i6 + 32, rotateRight2 + jArr2[1], zzb9 + zzb(bArr2, i6 + 16), jArr2);
                length = i6 + 64;
                if (length == i) {
                    long j3 = -5435081209227447693L + ((255 & zzb3) << 1);
                    jArr2[0] = jArr2[0] + ((long) i7);
                    jArr[0] = jArr[0] + jArr2[0];
                    jArr2[0] = jArr2[0] + jArr[0];
                    long rotateRight3 = Long.rotateRight((zzb9 + jArr[1]) + zzb(bArr2, i5 + 48), 42) * j3;
                    zzb9 = (Long.rotateRight(((rotateRight2 + zzb9) + jArr[0]) + zzb(bArr2, i5 + 8), 37) * j3) ^ (jArr2[1] * 9);
                    rotateRight = rotateRight3 + ((jArr[0] * 9) + zzb(bArr2, i5 + 40));
                    zzb3 = Long.rotateRight(zzb3 + jArr2[0], 33) * j3;
                    zza(bArr, i5, jArr[1] * j3, zzb9 + jArr2[0], jArr);
                    zza(bArr, i5 + 32, jArr2[1] + zzb3, rotateRight + zzb(bArr2, i5 + 16), jArr2);
                    long j4 = j3;
                    return zza((zza(jArr[0], jArr2[0], j4) + ((rotateRight ^ (rotateRight >>> 47)) * -4348849565147123417L)) + zzb9, zza(jArr[1], jArr2[1], j4) + zzb3, j4);
                }
                i6 = length;
                i3 = i;
                i4 = i7;
                j2 = zzb3;
                zzb4 = zzb9;
                zzb9 = rotateRight2;
                i = 37;
                i2 = 0;
            }
        }
    }

    private static void zza(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long zzb = zzb(bArr, i);
        long zzb2 = zzb(bArr, i + 8);
        long zzb3 = zzb(bArr, i + 16);
        long zzb4 = zzb(bArr, i + 24);
        j += zzb;
        zzb2 = (zzb2 + j) + zzb3;
        j2 = Long.rotateRight((j2 + j) + zzb4, 21) + Long.rotateRight(zzb2, 44);
        jArr[0] = zzb2 + zzb4;
        jArr[1] = j2 + j;
    }

    private static long zzb(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
