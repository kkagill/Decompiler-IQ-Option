package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class am implements Creator<an> {
    am() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new an[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        return readStrongBinder != null ? new an(readStrongBinder) : null;
    }
}
