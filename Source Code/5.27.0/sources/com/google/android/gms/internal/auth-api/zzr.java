package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzr extends GmsClient<zzw> {
    @Nullable
    private final AuthCredentialsOptions zzaq;

    public zzr(Context context, Looper looper, ClientSettings clientSettings, AuthCredentialsOptions authCredentialsOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzaq = authCredentialsOptions;
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    /* Access modifiers changed, original: protected|final */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* Access modifiers changed, original: protected|final */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final Bundle getGetServiceRequestExtraArgs() {
        AuthCredentialsOptions authCredentialsOptions = this.zzaq;
        return authCredentialsOptions == null ? new Bundle() : authCredentialsOptions.toBundle();
    }

    /* Access modifiers changed, original: final */
    public final AuthCredentialsOptions zzd() {
        return this.zzaq;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zzw) {
            return (zzw) queryLocalInterface;
        }
        return new zzx(iBinder);
    }
}
