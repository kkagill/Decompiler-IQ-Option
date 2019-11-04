package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzw;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        String str;
        String valueOf;
        String str2 = "RevocationService";
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction())) {
            if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
                str = "Unknown action sent to RevocationBoundService: ";
                valueOf = String.valueOf(intent.getAction());
                Log.w(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return null;
            }
        }
        if (Log.isLoggable(str2, 2)) {
            str = "RevocationBoundService handling ";
            valueOf = String.valueOf(intent.getAction());
            Log.v(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        return new zzw(this);
    }
}
