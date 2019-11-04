package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class zzo implements Creator<GiftCardWalletObject> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = j;
        CommonWalletObject commonWalletObject = null;
        String str = commonWalletObject;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    commonWalletObject = (CommonWalletObject) SafeParcelReader.createParcelable(parcel2, readHeader, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 6:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 7:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 8:
                    j2 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 9:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new GiftCardWalletObject(commonWalletObject, str, str2, str3, j, str4, j2, str5);
    }
}
