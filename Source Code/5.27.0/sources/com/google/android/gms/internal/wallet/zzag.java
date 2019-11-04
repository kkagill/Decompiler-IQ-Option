package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.ref.WeakReference;

final class zzag extends zzah {
    private final int zzab;
    private final WeakReference<Activity> zzgk;

    public zzag(Activity activity, int i) {
        this.zzgk = new WeakReference(activity);
        this.zzab = i;
    }

    public final void zza(int i, MaskedWallet maskedWallet, Bundle bundle) {
        Activity activity = (Activity) this.zzgk.get();
        String str = "WalletClientImpl";
        if (activity == null) {
            Log.d(str, "Ignoring onMaskedWalletLoaded, Activity has gone");
            return;
        }
        PendingIntent pendingIntent = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzab);
                return;
            } catch (SendIntentException e) {
                Log.w(str, "Exception starting pending intent", e);
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            i = -1;
            intent.putExtra(WalletConstants.EXTRA_MASKED_WALLET, maskedWallet);
        } else {
            int i2 = i == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
            i = i2;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzab, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w(str, "Null pending result returned for onMaskedWalletLoaded");
            return;
        }
        try {
            createPendingResult.send(i);
        } catch (CanceledException e2) {
            Log.w(str, "Exception setting pending result", e2);
        }
    }

    public final void zza(int i, FullWallet fullWallet, Bundle bundle) {
        Activity activity = (Activity) this.zzgk.get();
        String str = "WalletClientImpl";
        if (activity == null) {
            Log.d(str, "Ignoring onFullWalletLoaded, Activity has gone");
            return;
        }
        PendingIntent pendingIntent = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzab);
                return;
            } catch (SendIntentException e) {
                Log.w(str, "Exception starting pending intent", e);
                return;
            }
        }
        Intent intent = new Intent();
        if (connectionResult.isSuccess()) {
            i = -1;
            intent.putExtra(WalletConstants.EXTRA_FULL_WALLET, fullWallet);
        } else {
            int i2 = i == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
            i = i2;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzab, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w(str, "Null pending result returned for onFullWalletLoaded");
            return;
        }
        try {
            createPendingResult.send(i);
        } catch (CanceledException e2) {
            Log.w(str, "Exception setting pending result", e2);
        }
    }

    public final void zza(int i, boolean z, Bundle bundle) {
        Activity activity = (Activity) this.zzgk.get();
        String str = "WalletClientImpl";
        if (activity == null) {
            Log.d(str, "Ignoring onPreAuthorizationDetermined, Activity has gone");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzab, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w(str, "Null pending result returned for onPreAuthorizationDetermined");
            return;
        }
        try {
            createPendingResult.send(-1);
        } catch (CanceledException e) {
            Log.w(str, "Exception setting pending result", e);
        }
    }

    public final void zza(int i, Bundle bundle) {
        Preconditions.checkNotNull(bundle, "Bundle should not be null");
        Activity activity = (Activity) this.zzgk.get();
        String str = "WalletClientImpl";
        if (activity == null) {
            Log.d(str, "Ignoring onWalletObjectsCreated, Activity has gone");
            return;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(activity, this.zzab);
                return;
            } catch (SendIntentException e) {
                Log.w(str, "Exception starting pending intent", e);
                return;
            }
        }
        String valueOf = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 75);
        stringBuilder.append("Create Wallet Objects confirmation UI will not be shown connection result: ");
        stringBuilder.append(valueOf);
        Log.e(str, stringBuilder.toString());
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, WalletConstants.ERROR_CODE_UNKNOWN);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzab, intent, 1073741824);
        if (createPendingResult == null) {
            Log.w(str, "Null pending result returned for onWalletObjectsCreated");
            return;
        }
        try {
            createPendingResult.send(1);
        } catch (CanceledException e2) {
            Log.w(str, "Exception setting pending result", e2);
        }
    }
}
