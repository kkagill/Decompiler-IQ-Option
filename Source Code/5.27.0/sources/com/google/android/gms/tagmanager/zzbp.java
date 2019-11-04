package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

@VisibleForTesting
final class zzbp extends zzbq {
    private static final String ID = zza.EVENT.toString();
    private final zzfb zzaee;

    public zzbp(zzfb zzfb) {
        super(ID, new String[0]);
        this.zzaee = zzfb;
    }

    public final boolean zzgw() {
        return false;
    }

    public final zzl zzb(Map<String, zzl> map) {
        String zzjf = this.zzaee.zzjf();
        if (zzjf == null) {
            return zzgj.zzkc();
        }
        return zzgj.zzi(zzjf);
    }
}
