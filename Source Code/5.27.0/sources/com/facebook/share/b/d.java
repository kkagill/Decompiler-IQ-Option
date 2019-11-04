package com.facebook.share.b;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: ShareMedia */
public abstract class d implements e {
    private final Bundle Dz;

    public int describeContents() {
        return 0;
    }

    d(Parcel parcel) {
        this.Dz = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.Dz);
    }
}
