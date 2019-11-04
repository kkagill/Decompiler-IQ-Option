package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zzh;

final class zzl extends zzp {
    private final /* synthetic */ String zzak;

    zzl(zzj zzj, GoogleApiClient googleApiClient, String str) {
        this.zzak = str;
        super(googleApiClient, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        setCancelToken(((zzh) anyClient).zza(this, 0, this.zzak));
    }
}
