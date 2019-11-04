package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class zzx extends zzc implements zzw {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zzc(zzu zzu, CredentialRequest credentialRequest) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzu);
        zze.zzc(obtainAndWriteInterfaceToken, (Parcelable) credentialRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzu zzu, zzy zzy) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzu);
        zze.zzc(obtainAndWriteInterfaceToken, (Parcelable) zzy);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzu zzu, zzs zzs) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzu);
        zze.zzc(obtainAndWriteInterfaceToken, (Parcelable) zzs);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzu zzu) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzu);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }
}
