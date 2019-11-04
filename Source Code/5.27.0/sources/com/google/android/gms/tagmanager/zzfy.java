package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzfy extends zzfz {
    private static final String ID = zza.STARTS_WITH.toString();

    public zzfy() {
        super(ID);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(String str, String str2, Map<String, zzl> map) {
        return str.startsWith(str2);
    }
}
