package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzu;

public abstract class zzi extends zzb implements zzh {
    public zzi() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzh;
        if (i == 1) {
            zzh = zzh(zzu.zzg(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            zzh = zzi(zzu.zzg(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        zzc.zza(parcel2, zzh);
        return true;
    }
}
