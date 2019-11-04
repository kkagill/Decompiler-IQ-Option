package com.google.android.gms.wallet.wobs;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;

public interface WalletObjects {
    void createWalletObjects(@NonNull GoogleApiClient googleApiClient, @NonNull CreateWalletObjectsRequest createWalletObjectsRequest, int i);
}
