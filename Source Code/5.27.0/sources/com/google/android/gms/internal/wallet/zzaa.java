package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.Wallet.zzb;

final class zzaa extends zzb {
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ MaskedWalletRequest zzgf;

    zzaa(zzy zzy, GoogleApiClient googleApiClient, MaskedWalletRequest maskedWalletRequest, int i) {
        this.zzgf = maskedWalletRequest;
        this.val$requestCode = i;
        super(googleApiClient);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzaf zzaf) {
        zzaf.zza(this.zzgf, this.val$requestCode);
        setResult(Status.RESULT_SUCCESS);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        doExecute((zzaf) anyClient);
    }
}
