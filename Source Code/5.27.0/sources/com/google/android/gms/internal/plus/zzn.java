package com.google.android.gms.internal.plus;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.plus.internal.zzh;
import java.util.Collection;

final class zzn extends zzp {
    private final /* synthetic */ Collection zzal;

    zzn(zzj zzj, GoogleApiClient googleApiClient, Collection collection) {
        this.zzal = collection;
        super(googleApiClient, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        ((zzh) anyClient).zza((ResultHolder) this, this.zzal);
    }
}
