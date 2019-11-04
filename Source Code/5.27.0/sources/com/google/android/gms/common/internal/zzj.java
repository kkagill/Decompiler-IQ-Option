package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzj extends zzb implements zzi {
    public zzj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof zzi) {
            return (zzi) queryLocalInterface;
        }
        return new zzk(iBinder);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IInterface zzb = zzb();
            parcel2.writeNoException();
            zzc.zza(parcel2, zzb);
        } else if (i != 2) {
            return false;
        } else {
            i = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(i);
        }
        return true;
    }
}
