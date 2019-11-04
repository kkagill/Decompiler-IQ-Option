package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzbt extends zzdy {
    private static final String ID = zza.GREATER_THAN.toString();

    public zzbt() {
        super(ID);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzgi zzgi, zzgi zzgi2, Map<String, zzl> map) {
        return zzgi.compareTo(zzgi2) > 0;
    }
}
