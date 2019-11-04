package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.Wallet.zzb;

final class zzab extends zzb {
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ FullWalletRequest zzgg;

    zzab(zzy zzy, GoogleApiClient googleApiClient, FullWalletRequest fullWalletRequest, int i) {
        this.zzgg = fullWalletRequest;
        this.val$requestCode = i;
        super(googleApiClient);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzaf zzaf) {
        zzaf.zza(this.zzgg, this.val$requestCode);
        setResult(Status.RESULT_SUCCESS);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        doExecute((zzaf) anyClient);
    }
}
