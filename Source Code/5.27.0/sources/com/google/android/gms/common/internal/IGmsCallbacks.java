package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IGmsCallbacks extends IInterface {

    public static abstract class zza extends zzb implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                zza(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                zza(parcel.readInt(), parcel.readStrongBinder(), (zzb) zzc.zza(parcel, zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle);

    void zza(int i, Bundle bundle);

    void zza(int i, IBinder iBinder, zzb zzb);
}
