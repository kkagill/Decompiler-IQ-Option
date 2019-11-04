package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrc.zze;

final class zzrb implements zzsj {
    private static final zzrb zzbaj = new zzrb();

    private zzrb() {
    }

    public static zzrb zzpc() {
        return zzbaj;
    }

    public final boolean zze(Class<?> cls) {
        return zzrc.class.isAssignableFrom(cls);
    }

    public final zzsi zzf(Class<?> cls) {
        String valueOf;
        if (zzrc.class.isAssignableFrom(cls)) {
            try {
                return (zzsi) zzrc.zzg(cls.asSubclass(zzrc.class)).zza(zze.zzbat, null, null);
            } catch (Exception e) {
                String str = "Unable to get message info for ";
                valueOf = String.valueOf(cls.getName());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            }
        }
        String str2 = "Unsupported message type: ";
        valueOf = String.valueOf(cls.getName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
