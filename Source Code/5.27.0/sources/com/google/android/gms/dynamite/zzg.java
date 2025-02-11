package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza;
import com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb;

final class zzg implements VersionPolicy {
    zzg() {
    }

    public final zzb zza(Context context, String str, zza zza) {
        zzb zzb = new zzb();
        zzb.zzir = zza.getLocalVersion(context, str);
        if (zzb.zzir != 0) {
            zzb.zzis = zza.zza(context, str, false);
        } else {
            zzb.zzis = zza.zza(context, str, true);
        }
        if (zzb.zzir == 0 && zzb.zzis == 0) {
            zzb.zzit = 0;
        } else if (zzb.zzis >= zzb.zzir) {
            zzb.zzit = 1;
        } else {
            zzb.zzit = -1;
        }
        return zzb;
    }
}
