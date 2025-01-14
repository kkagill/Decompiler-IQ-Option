package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzo;

public abstract class zzaa extends zzb implements zzz {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            onIndoorBuildingFocused();
        } else if (i != 2) {
            return false;
        } else {
            zza(zzo.zze(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
