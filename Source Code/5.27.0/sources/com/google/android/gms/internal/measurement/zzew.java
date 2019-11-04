package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey.zzd;

final class zzew implements zzgf {
    private static final zzew zzahu = new zzew();

    private zzew() {
    }

    public static zzew zzua() {
        return zzahu;
    }

    public final boolean zza(Class<?> cls) {
        return zzey.class.isAssignableFrom(cls);
    }

    public final zzgg zzb(Class<?> cls) {
        String valueOf;
        if (zzey.class.isAssignableFrom(cls)) {
            try {
                return (zzgg) zzey.zzd(cls.asSubclass(zzey.class)).zza(zzd.zzaif, null, null);
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
