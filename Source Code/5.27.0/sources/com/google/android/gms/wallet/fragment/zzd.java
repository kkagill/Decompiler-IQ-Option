package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class zzd implements Creator<WalletFragmentInitParams> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentInitParams[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        MaskedWalletRequest maskedWalletRequest = null;
        MaskedWallet maskedWallet = maskedWalletRequest;
        int i = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                maskedWalletRequest = (MaskedWalletRequest) SafeParcelReader.createParcelable(parcel, readHeader, MaskedWalletRequest.CREATOR);
            } else if (fieldId == 4) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                maskedWallet = (MaskedWallet) SafeParcelReader.createParcelable(parcel, readHeader, MaskedWallet.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new WalletFragmentInitParams(str, maskedWalletRequest, i, maskedWallet);
    }
}
