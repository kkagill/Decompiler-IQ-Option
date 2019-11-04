package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

final class y implements Runnable {
    private final aa acF;
    private final long adA;
    private final WakeLock adB = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
    private final FirebaseInstanceId adC;

    @VisibleForTesting
    y(FirebaseInstanceId firebaseInstanceId, o oVar, aa aaVar, long j) {
        this.adC = firebaseInstanceId;
        this.acF = aaVar;
        this.adA = j;
        this.adB.setReferenceCounted(false);
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        try {
            if (x.wJ().aE(getContext())) {
                this.adB.acquire();
            }
            this.adC.zza(true);
            if (!this.adC.ww()) {
                this.adC.zza(false);
            } else if (!x.wJ().zze(getContext()) || zzan()) {
                if (zzam() && this.acF.c(this.adC)) {
                    this.adC.zza(false);
                } else {
                    this.adC.zza(this.adA);
                }
                if (x.wJ().aE(getContext())) {
                    this.adB.release();
                }
            } else {
                new ac(this).wN();
                if (x.wJ().aE(getContext())) {
                    this.adB.release();
                }
            }
        } finally {
            if (x.wJ().aE(getContext())) {
                this.adB.release();
            }
        }
    }

    @VisibleForTesting
    private final boolean zzam() {
        String str = "FirebaseInstanceId";
        z wu = this.adC.wu();
        if (!this.adC.zzr() && !this.adC.a(wu)) {
            return true;
        }
        try {
            String wv = this.adC.wv();
            if (wv == null) {
                Log.e(str, "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Token successfully retrieved");
            }
            if (wu == null || !(wu == null || wv.equals(wu.zzbv))) {
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", wv);
                Context context = getContext();
                Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                context.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e) {
            String str2 = "Token retrieval failed: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final Context getContext() {
        return this.adC.wt().getApplicationContext();
    }

    /* Access modifiers changed, original: final */
    public final boolean zzan() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
