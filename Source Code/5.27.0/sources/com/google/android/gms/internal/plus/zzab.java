package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zzg;
import java.util.HashSet;

public final class zzab implements Creator<zzg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = str;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            int i4 = 1;
            if (fieldId != 1) {
                i4 = 3;
                if (fieldId != 3) {
                    i4 = 4;
                    if (fieldId != 4) {
                        i4 = 5;
                        if (fieldId != 5) {
                            i4 = 6;
                            if (fieldId != 6) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                i2 = SafeParcelReader.readInt(parcel, readHeader);
                            }
                        } else {
                            str = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
            hashSet.add(Integer.valueOf(i4));
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zzg(hashSet, i, str, i2, str2, i3);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(validateObjectHeader);
        throw new ParseException(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }
}
