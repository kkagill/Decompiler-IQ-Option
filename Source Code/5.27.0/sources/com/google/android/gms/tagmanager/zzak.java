package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzak extends zzfz {
    private static final String ID = zza.CONTAINS.toString();

    public zzak() {
        super(ID);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(String str, String str2, Map<String, zzl> map) {
        return str.contains(str2);
    }
}
