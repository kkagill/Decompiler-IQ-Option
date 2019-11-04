package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class zzch {
    public static <V> V zza(zzcg<V> zzcg) {
        long clearCallingIdentity;
        zzcg zzcg2;
        try {
            zzcg2 = zzcg2.zzrj();
            return zzcg2;
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zzrj = zzcg2.zzrj();
            return zzrj;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
