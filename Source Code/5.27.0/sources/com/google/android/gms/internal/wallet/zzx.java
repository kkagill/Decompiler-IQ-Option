package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzas;

public abstract class zzx extends zzb implements zzw {
    public zzx() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zza(parcel.readInt(), (MaskedWallet) zzc.zza(parcel, MaskedWallet.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 2:
                zza(parcel.readInt(), (FullWallet) zzc.zza(parcel, FullWallet.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 3:
                zza(parcel.readInt(), zzc.zza(parcel), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 4:
                zza(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 6:
                zzb(parcel.readInt(), zzc.zza(parcel), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 7:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (zzh) zzc.zza(parcel, zzh.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 8:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 9:
                zza((Status) zzc.zza(parcel, Status.CREATOR), zzc.zza(parcel), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (zzj) zzc.zza(parcel, zzj.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 11:
                zzb((Status) zzc.zza(parcel, Status.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 12:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (zzas) zzc.zza(parcel, zzas.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 13:
                zzc((Status) zzc.zza(parcel, Status.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 14:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (PaymentData) zzc.zza(parcel, PaymentData.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            case 15:
                zza((Status) zzc.zza(parcel, Status.CREATOR), (zzl) zzc.zza(parcel, zzl.CREATOR), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
