package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.PlusExtraArgs;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public final class zzh extends GmsClient<zzf> {
    private Person zzr;
    private final zzn zzs;

    public zzh(Context context, Looper looper, ClientSettings clientSettings, zzn zzn, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 2, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzs = zzn;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zzg(iBinder);
    }

    @VisibleForTesting
    public final String getAccountName() {
        checkConnected();
        try {
            return ((zzf) getService()).getAccountName();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle zze = this.zzs.zze();
        zze.putStringArray("request_visible_actions", this.zzs.zzc());
        zze.putString(PlusExtraArgs.PLUS_AUTH_PACKAGE, this.zzs.zzd());
        return zze;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* Access modifiers changed, original: protected|final */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    /* Access modifiers changed, original: protected|final */
    public final String getStartServiceAction() {
        return "com.google.android.gms.plus.service.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            String str = "loaded_person";
            if (bundle.containsKey(str)) {
                this.zzr = zzr.zza(bundle.getByteArray(str));
            }
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }

    public final boolean requiresSignIn() {
        Set applicableScopes = getClientSettings().getApplicableScopes(Plus.API);
        return (applicableScopes == null || applicableScopes.isEmpty()) ? false : (applicableScopes.size() == 1 && applicableScopes.contains(new Scope("plus_one_placeholder_scope"))) ? false : true;
    }

    @VisibleForTesting
    public final ICancelToken zza(ResultHolder<LoadPeopleResult> resultHolder, int i, String str) {
        checkConnected();
        zzj zzj = new zzj(resultHolder);
        try {
            return ((zzf) getService()).zza(zzj, 1, i, -1, str);
        } catch (RemoteException unused) {
            zzj.zza(DataHolder.empty(8), null);
            return null;
        }
    }

    @VisibleForTesting
    public final void zza() {
        checkConnected();
        try {
            this.zzr = null;
            ((zzf) getService()).zza();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zza(ResultHolder<LoadPeopleResult> resultHolder) {
        checkConnected();
        zzj zzj = new zzj(resultHolder);
        try {
            ((zzf) getService()).zza(zzj, 2, 1, -1, null);
        } catch (RemoteException unused) {
            zzj.zza(DataHolder.empty(8), null);
        }
    }

    @VisibleForTesting
    public final void zza(ResultHolder<LoadPeopleResult> resultHolder, Collection<String> collection) {
        checkConnected();
        zzj zzj = new zzj(resultHolder);
        try {
            ((zzf) getService()).zza(zzj, new ArrayList(collection));
        } catch (RemoteException unused) {
            zzj.zza(DataHolder.empty(8), null);
        }
    }

    public final void zza(ResultHolder<LoadPeopleResult> resultHolder, String[] strArr) {
        zza((ResultHolder) resultHolder, Arrays.asList(strArr));
    }

    @VisibleForTesting
    public final Person zzb() {
        checkConnected();
        return this.zzr;
    }

    @VisibleForTesting
    public final void zzb(ResultHolder<Status> resultHolder) {
        checkConnected();
        zza();
        zzk zzk = new zzk(resultHolder);
        try {
            ((zzf) getService()).zza(zzk);
        } catch (RemoteException unused) {
            zzk.zza(8, null);
        }
    }
}
