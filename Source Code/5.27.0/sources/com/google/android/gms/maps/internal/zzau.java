package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

public abstract class zzau extends zzb implements zzat {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzb(zzu.zzg(parcel.readStrongBinder()));
        } else if (i == 2) {
            zzd(zzu.zzg(parcel.readStrongBinder()));
        } else if (i != 3) {
            return false;
        } else {
            zzc(zzu.zzg(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
