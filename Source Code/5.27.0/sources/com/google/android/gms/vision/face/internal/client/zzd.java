package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Creator<FaceParcel> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new FaceParcel[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LandmarkParcel[] landmarkParcelArr = null;
        zza[] zzaArr = landmarkParcelArr;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 3:
                    f = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 4:
                    f2 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 5:
                    f3 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 6:
                    f4 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 7:
                    f5 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 8:
                    f6 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) SafeParcelReader.createTypedArray(parcel2, readHeader, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f8 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 11:
                    f9 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 12:
                    f10 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 13:
                    zzaArr = (zza[]) SafeParcelReader.createTypedArray(parcel2, readHeader, zza.CREATOR);
                    break;
                case 14:
                    f7 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, f7, landmarkParcelArr, f8, f9, f10, zzaArr);
    }
}
