package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzv implements Creator<VisibleRegion> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latLng = null;
        LatLng latLng2 = latLng;
        LatLng latLng3 = latLng2;
        LatLng latLng4 = latLng3;
        LatLngBounds latLngBounds = latLng4;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                latLng = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId == 3) {
                latLng2 = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId == 4) {
                latLng3 = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId == 5) {
                latLng4 = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, readHeader, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
