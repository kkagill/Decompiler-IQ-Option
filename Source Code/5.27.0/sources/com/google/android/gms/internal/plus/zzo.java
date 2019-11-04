package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.plus.internal.zzh;

final class zzo extends zzp {
    private final /* synthetic */ String[] zzam;

    zzo(zzj zzj, GoogleApiClient googleApiClient, String[] strArr) {
        this.zzam = strArr;
        super(googleApiClient, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        ((zzh) anyClient).zza((ResultHolder) this, this.zzam);
    }
}
