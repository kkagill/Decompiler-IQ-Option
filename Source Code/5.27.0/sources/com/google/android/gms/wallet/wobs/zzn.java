package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzn implements Creator<WalletObjectMessage> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = str;
        TimeInterval timeInterval = str2;
        UriData uriData = timeInterval;
        UriData uriData2 = uriData;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                timeInterval = (TimeInterval) SafeParcelReader.createParcelable(parcel, readHeader, TimeInterval.CREATOR);
            } else if (fieldId == 5) {
                uriData = (UriData) SafeParcelReader.createParcelable(parcel, readHeader, UriData.CREATOR);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                uriData2 = (UriData) SafeParcelReader.createParcelable(parcel, readHeader, UriData.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }
}
