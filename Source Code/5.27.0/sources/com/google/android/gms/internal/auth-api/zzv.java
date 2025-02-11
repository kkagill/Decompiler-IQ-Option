package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzc((Status) zze.zzc(parcel, Status.CREATOR), (Credential) zze.zzc(parcel, Credential.CREATOR));
        } else if (i == 2) {
            zzc((Status) zze.zzc(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzc((Status) zze.zzc(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
