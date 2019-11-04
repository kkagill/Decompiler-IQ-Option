package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzez {
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final byte[] zzair;
    private static final ByteBuffer zzais;
    private static final zzeb zzait;

    public static int zzbx(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static boolean zzf(zzgi zzgi) {
        return false;
    }

    public static int zzs(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static <T> T zza(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean zzh(byte[] bArr) {
        return zzhy.zzh(bArr);
    }

    public static String zzi(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        return zza == 0 ? 1 : zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + bArr[i];
        }
        return i4;
    }

    static Object zza(Object obj, Object obj2) {
        return ((zzgi) obj).zzuo().zza((zzgi) obj2).zzuf();
    }

    static {
        byte[] bArr = new byte[0];
        zzair = bArr;
        zzais = ByteBuffer.wrap(bArr);
        bArr = zzair;
        zzait = zzeb.zza(bArr, 0, bArr.length, false);
    }
}
