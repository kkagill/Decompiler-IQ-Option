package com.google.android.gms.internal.identity;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.identity.intents.AddressConstants.ErrorCodes;
import com.google.android.gms.identity.intents.AddressConstants.Extras;
import com.google.android.gms.identity.intents.UserAddressRequest;

public final class zze extends GmsClient<zzi> {
    private Activity mActivity;
    private final int mTheme;
    private zzf zzh;
    private final String zzi;

    public zze(Activity activity, Looper looper, ClientSettings clientSettings, int i, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(activity, looper, 12, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzi = clientSettings.getAccountName();
        this.mActivity = activity;
        this.mTheme = i;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return queryLocalInterface instanceof zzi ? (zzi) queryLocalInterface : new zzj(iBinder);
    }

    public final void disconnect() {
        super.disconnect();
        zzf zzf = this.zzh;
        if (zzf != null) {
            zzf.setActivity(null);
            this.zzh = null;
        }
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* Access modifiers changed, original: protected|final */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    /* Access modifiers changed, original: protected|final */
    public final String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    public final boolean requiresAccount() {
        return true;
    }

    public final void zza(UserAddressRequest userAddressRequest, int i) {
        super.checkConnected();
        this.zzh = new zzf(i, this.mActivity);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.zzi)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.zzi, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.mTheme);
            ((zzi) super.getService()).zza(this.zzh, userAddressRequest, bundle);
        } catch (RemoteException e) {
            Log.e("AddressClientImpl", "Exception requesting user address", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(Extras.EXTRA_ERROR_CODE, ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES);
            this.zzh.zza(1, bundle2);
        }
    }
}
