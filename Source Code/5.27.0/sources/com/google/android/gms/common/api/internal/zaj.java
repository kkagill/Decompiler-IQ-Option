package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zaj extends zal {
    private final SparseArray<zaa> zacv = new SparseArray();

    private class zaa implements OnConnectionFailedListener {
        public final int zacw;
        public final GoogleApiClient zacx;
        public final OnConnectionFailedListener zacy;

        public zaa(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
            this.zacw = i;
            this.zacx = googleApiClient;
            this.zacy = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("beginFailureResolution for ");
            stringBuilder.append(valueOf);
            Log.d("AutoManageHelper", stringBuilder.toString());
            zaj.this.zab(connectionResult, this.zacw);
        }
    }

    public static zaj zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zaj zaj = (zaj) fragment.getCallbackOrNull("AutoManageHelper", zaj.class);
        if (zaj != null) {
            return zaj;
        }
        return new zaj(fragment);
    }

    private zaj(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public final void zaa(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.zacv.indexOfKey(i) < 0;
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Already managing a GoogleApiClient with id ");
        stringBuilder.append(i);
        Preconditions.checkState(z, stringBuilder.toString());
        zam zam = (zam) this.zade.get();
        boolean z2 = this.mStarted;
        String valueOf = String.valueOf(zam);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        stringBuilder2.append("starting AutoManage for client ");
        stringBuilder2.append(i);
        String str = " ";
        stringBuilder2.append(str);
        stringBuilder2.append(z2);
        stringBuilder2.append(str);
        stringBuilder2.append(valueOf);
        valueOf = "AutoManageHelper";
        Log.d(valueOf, stringBuilder2.toString());
        this.zacv.put(i, new zaa(i, googleApiClient, onConnectionFailedListener));
        if (this.mStarted && zam == null) {
            String valueOf2 = String.valueOf(googleApiClient);
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            stringBuilder3.append("connecting ");
            stringBuilder3.append(valueOf2);
            Log.d(valueOf, stringBuilder3.toString());
            googleApiClient.connect();
        }
    }

    public final void zaa(int i) {
        zaa zaa = (zaa) this.zacv.get(i);
        this.zacv.remove(i);
        if (zaa != null) {
            zaa.zacx.unregisterConnectionFailedListener(zaa);
            zaa.zacx.disconnect();
        }
    }

    public void onStart() {
        super.onStart();
        boolean z = this.mStarted;
        String valueOf = String.valueOf(this.zacv);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("onStart ");
        stringBuilder.append(z);
        stringBuilder.append(" ");
        stringBuilder.append(valueOf);
        Log.d("AutoManageHelper", stringBuilder.toString());
        if (this.zade.get() == null) {
            for (int i = 0; i < this.zacv.size(); i++) {
                zaa zab = zab(i);
                if (zab != null) {
                    zab.zacx.connect();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.zacv.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                zab.zacx.disconnect();
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zacv.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                printWriter.append(str).append("GoogleApiClient #").print(zab.zacw);
                printWriter.println(":");
                zab.zacx.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zaa(ConnectionResult connectionResult, int i) {
        String str = "AutoManageHelper";
        Log.w(str, "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf(str, "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaa zaa = (zaa) this.zacv.get(i);
        if (zaa != null) {
            zaa(i);
            OnConnectionFailedListener onConnectionFailedListener = zaa.zacy;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zao() {
        for (int i = 0; i < this.zacv.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                zab.zacx.connect();
            }
        }
    }

    @Nullable
    private final zaa zab(int i) {
        if (this.zacv.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.zacv;
        return (zaa) sparseArray.get(sparseArray.keyAt(i));
    }
}
