package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

public interface ILocationSourceDelegate extends IInterface {

    public static abstract class zza extends zzb implements ILocationSourceDelegate {
        public zza() {
            super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                zzah zzah;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzah = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    zzah = queryLocalInterface instanceof zzah ? (zzah) queryLocalInterface : new zzai(readStrongBinder);
                }
                activate(zzah);
            } else if (i != 2) {
                return false;
            } else {
                deactivate();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void activate(zzah zzah);

    void deactivate();
}
