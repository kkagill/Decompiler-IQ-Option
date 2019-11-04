package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zze;
import java.util.HashSet;

public final class zzz implements Creator<zze> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    readHeader = 1;
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    readHeader = 2;
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    readHeader = 3;
                    break;
                case 4:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    readHeader = 4;
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    readHeader = 5;
                    break;
                case 6:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    readHeader = 6;
                    break;
                case 7:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    readHeader = 7;
                    break;
                case 8:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    readHeader = 8;
                    break;
                case 9:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    readHeader = 9;
                    break;
                case 10:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    readHeader = 10;
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    continue;
            }
            hashSet.add(Integer.valueOf(readHeader));
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zze(hashSet, i, str, str2, str3, str4, str5, z, str6, str7, i2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(validateObjectHeader);
        throw new ParseException(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
