package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

public abstract class zzae extends zzb implements zzad {
    public zzae() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zzg(zzu.zzg(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
