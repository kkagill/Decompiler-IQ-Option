package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class zzl extends zzo {
    private final AtomicReference<Bundle> zzp = new AtomicReference();
    private boolean zzq;

    public final void zzb(Bundle bundle) {
        synchronized (this.zzp) {
            try {
                this.zzp.set(bundle);
                this.zzq = true;
                this.zzp.notify();
            } catch (Throwable th) {
                this.zzp.notify();
            }
        }
    }

    public final String zza(long j) {
        return (String) zza(zzb(j), String.class);
    }

    public final Bundle zzb(long j) {
        Bundle bundle;
        synchronized (this.zzp) {
            if (!this.zzq) {
                try {
                    this.zzp.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.zzp.get();
        }
        return bundle;
    }

    public static <T> T zza(Bundle bundle, Class<T> cls) {
        if (bundle != null) {
            Object obj = bundle.get("r");
            if (obj != null) {
                try {
                    obj = cls.cast(obj);
                    return obj;
                } catch (ClassCastException e) {
                    String canonicalName = cls.getCanonicalName();
                    String canonicalName2 = obj.getClass().getCanonicalName();
                    Object[] objArr = new Object[]{canonicalName, canonicalName2};
                    canonicalName = "AM";
                    Log.w(canonicalName, String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), objArr), e);
                    throw e;
                }
            }
        }
        return null;
    }
}
