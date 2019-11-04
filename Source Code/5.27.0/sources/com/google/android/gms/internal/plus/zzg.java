package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Plus.zza;

abstract class zzg extends zza<Status> {
    private zzg(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* synthetic */ zzg(GoogleApiClient googleApiClient, zzf zzf) {
        this(googleApiClient);
    }

    public /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
