package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zzh;

final class zzm extends zzp {
    zzm(zzj zzj, GoogleApiClient googleApiClient) {
        super(googleApiClient, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        ((zzh) anyClient).zza(this);
    }
}
