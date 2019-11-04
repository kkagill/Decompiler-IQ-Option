package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.wallet.WalletConstants;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    private static aj acM;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                c(context, intent2);
            } else {
                c(context, intent);
            }
        }
    }

    private final void c(Context context, Intent intent) {
        int i;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String str;
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                str = "FirebaseInstanceId";
                if (Log.isLoggable(str, 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(stringExtra).length() + 21) + String.valueOf(valueOf).length());
                    stringBuilder.append("Received command: ");
                    stringBuilder.append(stringExtra);
                    stringBuilder.append(" - ");
                    stringBuilder.append(valueOf);
                    Log.d(str, stringBuilder.toString());
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.getInstance().zzn();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId.getInstance().zzp();
                }
            }
            i = -1;
        } else {
            String str2 = "gcm.rawData64";
            str = intent.getStringExtra(str2);
            if (str != null) {
                intent.putExtra("rawData", Base64.decode(str, 0));
                intent.removeExtra(str2);
            }
            i = a(this, context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    @ShowFirstParty
    @SuppressLint({"InlinedApi"})
    public static int a(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        Object obj = 1;
        Object obj2 = (!PlatformVersion.isAtLeastO() || context.getApplicationInfo().targetSdkVersion < 26) ? null : 1;
        if ((intent.getFlags() & 268435456) == 0) {
            obj = null;
        }
        if (obj2 != null && obj == null) {
            return b(broadcastReceiver, context, intent);
        }
        int e = x.wJ().e(context, intent);
        if (!PlatformVersion.isAtLeastO() || e != WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE) {
            return e;
        }
        b(broadcastReceiver, context, intent);
        return 403;
    }

    private static int b(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        x(context, "com.google.firebase.MESSAGING_EVENT").a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    private static synchronized aj x(Context context, String str) {
        aj ajVar;
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (acM == null) {
                acM = new aj(context, str);
            }
            ajVar = acM;
        }
        return ajVar;
    }
}
