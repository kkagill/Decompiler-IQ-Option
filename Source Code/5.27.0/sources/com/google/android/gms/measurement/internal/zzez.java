package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzez {
    private final zzfa zzmw;

    public zzez(zzfa zzfa) {
        Preconditions.checkNotNull(zzfa);
        this.zzmw = zzfa;
    }

    public static boolean zzl(Context context) {
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        zzfj zza = zzfj.zza(context, null);
        zzef zzab = zza.zzab();
        if (intent == null) {
            zzab.zzgn().zzao("Receiver called with null intent");
            return;
        }
        zza.zzae();
        String action = intent.getAction();
        zzab.zzgs().zza("Local receiver got", action);
        String str = "com.google.android.gms.measurement.UPLOAD";
        if (str.equals(action)) {
            intent = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            intent.setAction(str);
            zzab.zzgs().zzao("Starting wakeful intent.");
            this.zzmw.doStartService(context, intent);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                zza.zzaa().zza(new zzey(this, zza, zzab));
            } catch (Exception e) {
                zzab.zzgn().zza("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult doGoAsync = this.zzmw.doGoAsync();
            action = intent.getStringExtra("referrer");
            if (action == null) {
                zzab.zzgs().zzao("Install referrer extras are null");
                if (doGoAsync != null) {
                    doGoAsync.finish();
                }
                return;
            }
            zzab.zzgq().zza("Install referrer extras are", action);
            str = "?";
            if (!action.contains(str)) {
                action = String.valueOf(action);
                action = action.length() != 0 ? str.concat(action) : new String(str);
            }
            Bundle zza2 = zza.zzz().zza(Uri.parse(action));
            if (zza2 == null) {
                zzab.zzgs().zzao("No campaign defined in install referrer broadcast");
                if (doGoAsync != null) {
                    doGoAsync.finish();
                    return;
                }
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                zzab.zzgn().zzao("Install referrer is missing timestamp");
            }
            zza.zzaa().zza(new zzfb(this, zza, longExtra, zza2, context, zzab, doGoAsync));
        }
    }
}
