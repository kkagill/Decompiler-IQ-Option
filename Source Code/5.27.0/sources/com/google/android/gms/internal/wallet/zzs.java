package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

public interface zzs extends IInterface {
    void zza(Bundle bundle, zzw zzw);

    void zza(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzw zzw);

    void zza(FullWalletRequest fullWalletRequest, Bundle bundle, zzw zzw);

    void zza(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzw zzw);

    void zza(MaskedWalletRequest maskedWalletRequest, Bundle bundle, zzw zzw);

    void zza(PaymentDataRequest paymentDataRequest, Bundle bundle, zzw zzw);

    void zza(String str, String str2, Bundle bundle, zzw zzw);
}
