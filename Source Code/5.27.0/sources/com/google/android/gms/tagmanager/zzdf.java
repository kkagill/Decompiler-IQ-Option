package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

final class zzdf extends zzdy {
    private static final String ID = zza.LESS_THAN.toString();

    public zzdf() {
        super(ID);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzgi zzgi, zzgi zzgi2, Map<String, zzl> map) {
        return zzgi.compareTo(zzgi2) < 0;
    }
}
