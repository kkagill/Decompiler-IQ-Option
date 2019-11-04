package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

abstract class zzdy extends zzef {
    public zzdy(String str) {
        super(str);
    }

    public abstract boolean zza(zzgi zzgi, zzgi zzgi2, Map<String, zzl> map);

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzl zzl, zzl zzl2, Map<String, zzl> map) {
        zzgi zzd = zzgj.zzd(zzl);
        zzgi zzd2 = zzgj.zzd(zzl2);
        return (zzd == zzgj.zzka() || zzd2 == zzgj.zzka()) ? false : zza(zzd, zzd2, (Map) map);
    }
}
