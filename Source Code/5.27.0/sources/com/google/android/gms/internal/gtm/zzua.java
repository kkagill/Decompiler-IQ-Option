package com.google.android.gms.internal.gtm;

final class zzua {
    private static boolean zzd(byte b) {
        return b >= (byte) 0;
    }

    private static boolean zze(byte b) {
        return b < (byte) -32;
    }

    private static boolean zzf(byte b) {
        return b < (byte) -16;
    }

    private static boolean zzg(byte b) {
        return b > (byte) -65;
    }

    private static void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    private static void zza(byte b, byte b2, char[] cArr, int i) {
        if (b < (byte) -62 || zzg(b2)) {
            throw zzrk.zzpw();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    private static void zza(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (zzg(b2) || ((b == (byte) -32 && b2 < (byte) -96) || ((b == (byte) -19 && b2 >= (byte) -96) || zzg(b3)))) {
            throw zzrk.zzpw();
        }
        cArr[i] = (char) ((((b & 15) << 12) | ((b2 & 63) << 6)) | (b3 & 63));
    }

    private static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (zzg(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw zzrk.zzpw();
        }
        int i2 = ((((b & 7) << 18) | ((b2 & 63) << 12)) | ((b3 & 63) << 6)) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }
}
