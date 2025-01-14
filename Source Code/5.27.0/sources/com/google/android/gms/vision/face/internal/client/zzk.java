package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzc;

public abstract class zzk extends zzb implements zzj {
    public zzk() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public static zzj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (queryLocalInterface instanceof zzj) {
            return (zzj) queryLocalInterface;
        }
        return new zzl(iBinder);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        IInterface newFaceDetector = newFaceDetector(Stub.asInterface(parcel.readStrongBinder()), (zze) zzc.zza(parcel, zze.CREATOR));
        parcel2.writeNoException();
        zzc.zza(parcel2, newFaceDetector);
        return true;
    }
}
