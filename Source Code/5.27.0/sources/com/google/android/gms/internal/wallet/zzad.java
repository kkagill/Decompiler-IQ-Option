package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.Wallet.zza;

final class zzad extends zza<BooleanResult> {
    zzad(zzy zzy, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzaf zzaf) {
        zzaf.zza(IsReadyToPayRequest.newBuilder().build(), (ResultHolder) this);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        doExecute((zzaf) anyClient);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new BooleanResult(status, false);
    }
}
