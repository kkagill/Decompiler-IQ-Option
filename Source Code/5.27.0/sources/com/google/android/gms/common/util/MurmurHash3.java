package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class MurmurHash3 {
    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = (i2 & -4) + i;
        while (i < i6) {
            i4 = ((((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)) | (bArr[i + 3] << 24)) * -862048943;
            i3 ^= ((i4 << 15) | (i4 >>> 17)) * 461845907;
            i3 = (((i3 >>> 19) | (i3 << 13)) * 5) - 430675100;
            i += 4;
        }
        i = 0;
        i4 = i2 & 3;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    i = (bArr[i6 + 2] & 255) << 16;
                }
                i5 = i3 ^ i2;
                i5 = (i5 ^ (i5 >>> 16)) * -2048144789;
                i5 = (i5 ^ (i5 >>> 13)) * -1028477387;
                return i5 ^ (i5 >>> 16);
            }
            i |= (bArr[i6 + 1] & 255) << 8;
        }
        i5 = ((bArr[i6] & 255) | i) * -862048943;
        i3 ^= ((i5 >>> 17) | (i5 << 15)) * 461845907;
        i5 = i3 ^ i2;
        i5 = (i5 ^ (i5 >>> 16)) * -2048144789;
        i5 = (i5 ^ (i5 >>> 13)) * -1028477387;
        return i5 ^ (i5 >>> 16);
    }

    private MurmurHash3() {
    }
}
