package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zzh;

final class zzk extends zzp {
    private final /* synthetic */ int zzaj;
    private final /* synthetic */ String zzak;

    zzk(zzj zzj, GoogleApiClient googleApiClient, int i, String str) {
        this.zzaj = i;
        this.zzak = str;
        super(googleApiClient, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        setCancelToken(((zzh) anyClient).zza(this, this.zzaj, this.zzak));
    }
}
