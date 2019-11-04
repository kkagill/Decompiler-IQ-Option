package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzge extends zzbq {
    private static final String ID = zza.TIME.toString();

    public zzge() {
        super(ID, new String[0]);
    }

    public final boolean zzgw() {
        return false;
    }

    public final zzl zzb(Map<String, zzl> map) {
        return zzgj.zzi(Long.valueOf(System.currentTimeMillis()));
    }
}
