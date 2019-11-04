package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

abstract class zzfz extends zzef {
    public zzfz(String str) {
        super(str);
    }

    public abstract boolean zza(String str, String str2, Map<String, zzl> map);

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzl zzl, zzl zzl2, Map<String, zzl> map) {
        String zzc = zzgj.zzc(zzl);
        String zzc2 = zzgj.zzc(zzl2);
        return (zzc == zzgj.zzkb() || zzc2 == zzgj.zzkb()) ? false : zza(zzc, zzc2, (Map) map);
    }
}
