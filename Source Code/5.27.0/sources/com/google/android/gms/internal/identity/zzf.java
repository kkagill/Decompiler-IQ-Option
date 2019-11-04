package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzf extends zzh {
    private Activity mActivity;
    private final int zzj;

    public zzf(int i, Activity activity) {
        this.zzj = i;
        this.mActivity = activity;
    }

    private final void setActivity(Activity activity) {
        this.mActivity = null;
    }

    public final void zza(int i, Bundle bundle) {
        Throwable e;
        String str;
        String str2 = "AddressClientImpl";
        PendingIntent createPendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            createPendingResult = this.mActivity.createPendingResult(this.zzj, intent, 1073741824);
            if (createPendingResult != null) {
                try {
                    createPendingResult.send(1);
                    return;
                } catch (CanceledException e2) {
                    e = e2;
                    str = "Exception settng pending result";
                    Log.w(str2, str, e);
                }
            }
            return;
        }
        PendingIntent pendingIntent = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(this.mActivity, this.zzj);
                return;
            } catch (SendIntentException e3) {
                e = e3;
                str = "Exception starting pending intent";
                Log.w(str2, str, e);
            }
        }
        try {
            createPendingResult = this.mActivity.createPendingResult(this.zzj, new Intent(), 1073741824);
            if (createPendingResult != null) {
                createPendingResult.send(1);
            }
        } catch (CanceledException e4) {
            e = e4;
            str = "Exception setting pending result";
            Log.w(str2, str, e);
        }
    }
}
