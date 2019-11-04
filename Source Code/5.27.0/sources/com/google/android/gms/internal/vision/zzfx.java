package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy.zzg;

final class zzfx implements zzhe {
    private static final zzfx zzwi = new zzfx();

    private zzfx() {
    }

    public static zzfx zzex() {
        return zzwi;
    }

    public final boolean zzb(Class<?> cls) {
        return zzfy.class.isAssignableFrom(cls);
    }

    public final zzhd zzc(Class<?> cls) {
        String valueOf;
        if (zzfy.class.isAssignableFrom(cls)) {
            try {
                return (zzhd) zzfy.zzd(cls.asSubclass(zzfy.class)).zza(zzg.zzwz, null, null);
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
