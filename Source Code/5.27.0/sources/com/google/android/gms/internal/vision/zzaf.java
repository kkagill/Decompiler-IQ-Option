package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaf implements Creator<zzae> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzan[] zzanArr = null;
        zzy zzy = zzanArr;
        zzy zzy2 = zzy;
        zzy zzy3 = zzy2;
        String str = zzy3;
        String str2 = str;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zzanArr = (zzan[]) SafeParcelReader.createTypedArray(parcel2, readHeader, zzan.CREATOR);
                    break;
                case 3:
                    zzy = (zzy) SafeParcelReader.createParcelable(parcel2, readHeader, zzy.CREATOR);
                    break;
                case 4:
                    zzy2 = (zzy) SafeParcelReader.createParcelable(parcel2, readHeader, zzy.CREATOR);
                    break;
                case 5:
                    zzy3 = (zzy) SafeParcelReader.createParcelable(parcel2, readHeader, zzy.CREATOR);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 7:
                    f = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 9:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 12:
                    i3 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzae(zzanArr, zzy, zzy2, zzy3, str, f, str2, i, z, i2, i3);
    }
}
