package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzgl extends zzbq {
    private static final String ID = zza.UPPERCASE_STRING.toString();
    private static final String zzags = zzb.ARG0.toString();

    public zzgl() {
        super(ID, zzags);
    }

    public final boolean zzgw() {
        return true;
    }

    public final zzl zzb(Map<String, zzl> map) {
        return zzgj.zzi(zzgj.zzc((zzl) map.get(zzags)).toUpperCase());
    }
}
