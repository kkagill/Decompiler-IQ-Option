package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzl;
import java.util.Map;

@ShowFirstParty
@VisibleForTesting
public final class zzbm extends zzfz {
    private static final String ID = zza.EQUALS.toString();

    public zzbm() {
        super(ID);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(String str, String str2, Map<String, zzl> map) {
        return str.equals(str2);
    }
}
