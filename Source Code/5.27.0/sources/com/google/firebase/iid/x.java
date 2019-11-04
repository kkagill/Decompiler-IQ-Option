package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.wallet.WalletConstants;
import com.jumio.commons.remote.exception.UnexpectedResponseException;
import java.util.ArrayDeque;
import java.util.Queue;

public final class x {
    private static x adv;
    @Nullable
    private String adw = null;
    private Boolean adx = null;
    private Boolean ady = null;
    @VisibleForTesting
    private final Queue<Intent> adz = new ArrayDeque();

    public static synchronized x wJ() {
        x xVar;
        synchronized (x.class) {
            if (adv == null) {
                adv = new x();
            }
            xVar = adv;
        }
        return xVar;
    }

    private x() {
    }

    public final Intent wK() {
        return (Intent) this.adz.poll();
    }

    public final int e(Context context, Intent intent) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Starting service");
        }
        this.adz.offer(intent);
        intent = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent.setPackage(context.getPackageName());
        return f(context, intent);
    }

    private final int f(Context context, Intent intent) {
        String g = g(context, intent);
        String str = "FirebaseInstanceId";
        if (g != null) {
            if (Log.isLoggable(str, 3)) {
                String str2 = "Restricting intent to a specific service: ";
                String valueOf = String.valueOf(g);
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            intent.setClassName(context.getPackageName(), g);
        }
        try {
            ComponentName startWakefulService;
            if (aE(context)) {
                startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
            } else {
                startWakefulService = context.startService(intent);
                Log.d(str, "Missing wake lock permission, service start may be delayed");
            }
            if (startWakefulService != null) {
                return -1;
            }
            Log.e(str, "Error while delivering the message: ServiceIntent not found.");
            return WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
        } catch (SecurityException e) {
            Log.e(str, "Error while delivering the message to the serviceIntent", e);
            return UnexpectedResponseException.STATUS_CODE_UNAUTHORIZED;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            stringBuilder.append("Failed to start service while in background: ");
            stringBuilder.append(valueOf2);
            Log.e(str, stringBuilder.toString());
            return WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
        }
    }

    @Nullable
    private final synchronized String g(Context context, Intent intent) {
        if (this.adw != null) {
            return this.adw;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                String valueOf;
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        if (serviceInfo.name.startsWith(".")) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            valueOf = String.valueOf(serviceInfo.name);
                            this.adw = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                        } else {
                            this.adw = serviceInfo.name;
                        }
                        return this.adw;
                    }
                }
                String str = serviceInfo.packageName;
                valueOf = serviceInfo.name;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 94) + String.valueOf(valueOf).length());
                stringBuilder.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                stringBuilder.append(str);
                stringBuilder.append("/");
                stringBuilder.append(valueOf);
                Log.e("FirebaseInstanceId", stringBuilder.toString());
                return null;
            }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* Access modifiers changed, original: final */
    public final boolean aE(Context context) {
        if (this.adx == null) {
            this.adx = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.adx.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.adx.booleanValue();
    }

    /* Access modifiers changed, original: final */
    public final boolean zze(Context context) {
        if (this.ady == null) {
            this.ady = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.adx.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.ady.booleanValue();
    }
}
