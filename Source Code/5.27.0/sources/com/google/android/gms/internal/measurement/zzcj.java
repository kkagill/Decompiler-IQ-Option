package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;

final class zzcj implements zzce {
    @GuardedBy("GservicesLoader.class")
    static zzcj zzaau;
    private final Context zzob;

    static zzcj zzp(Context context) {
        zzcj zzcj;
        synchronized (zzcj.class) {
            if (zzaau == null) {
                zzaau = (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? 1 : null) != null ? new zzcj(context) : new zzcj();
            }
            zzcj = zzaau;
        }
        return zzcj;
    }

    private zzcj(Context context) {
        this.zzob = context;
        this.zzob.getContentResolver().registerContentObserver(zzbz.CONTENT_URI, true, new zzcl(this, null));
    }

    private zzcj() {
        this.zzob = null;
    }

    private final String zzde(String str) {
        if (this.zzob == null) {
            return null;
        }
        try {
            return (String) zzch.zza(new zzci(this, str));
        } catch (SecurityException e) {
            String str2 = "Unable to read GServices for: ";
            str = String.valueOf(str);
            Log.e("GservicesLoader", str.length() != 0 ? str2.concat(str) : new String(str2), e);
            return null;
        }
    }

    public final /* synthetic */ Object zzdd(String str) {
        return zzde(str);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ String zzdf(String str) {
        return zzbz.zza(this.zzob.getContentResolver(), str, null);
    }
}
