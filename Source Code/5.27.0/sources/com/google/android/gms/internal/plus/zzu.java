package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.plus.zzr.zzb;
import com.google.android.gms.internal.plus.zzr.zzb.zza;
import java.util.HashSet;

public final class zzu implements Creator<zzb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zza zza = null;
        zzb.zzb zzb = zza;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            int i3 = 1;
            if (fieldId != 1) {
                i3 = 2;
                if (fieldId != 2) {
                    i3 = 3;
                    if (fieldId != 3) {
                        i3 = 4;
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            i2 = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        zzb = (zzb.zzb) SafeParcelReader.createParcelable(parcel, readHeader, zzb.zzb.CREATOR);
                    }
                } else {
                    zza = (zza) SafeParcelReader.createParcelable(parcel, readHeader, zza.CREATOR);
                }
            } else {
                i = SafeParcelReader.readInt(parcel, readHeader);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zzb(hashSet, i, zza, zzb, i2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(validateObjectHeader);
        throw new ParseException(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
