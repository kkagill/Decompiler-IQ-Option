package com.google.android.gms.wallet;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.Wallet.WalletOptions;

public class WalletObjectsClient extends GoogleApi<WalletOptions> {
    WalletObjectsClient(@NonNull Activity activity, @Nullable WalletOptions walletOptions) {
        super(activity, Wallet.API, (ApiOptions) walletOptions, Settings.DEFAULT_SETTINGS);
    }

    public Task<AutoResolvableVoidResult> createWalletObjects(@NonNull CreateWalletObjectsRequest createWalletObjectsRequest) {
        return doWrite((TaskApiCall) new zzar(this, createWalletObjectsRequest));
    }
}
