package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
public final class zzch {
    private static volatile Logger zzabk = new zzbr();

    @SuppressLint({"LogTagMismatch"})
    public static void zzf(String str, Object obj) {
        zzci zzfn = zzci.zzfn();
        if (zzfn != null) {
            zzfn.zze(str, obj);
        } else if (isLoggable(3)) {
            String valueOf;
            if (obj != null) {
                valueOf = String.valueOf(obj);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length());
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(valueOf);
                valueOf = stringBuilder.toString();
            } else {
                valueOf = str;
            }
            Log.e((String) zzby.zzzb.get(), valueOf);
        }
        Logger logger = zzabk;
        if (logger != null) {
            logger.error(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzab(String str) {
        zzci zzfn = zzci.zzfn();
        if (zzfn != null) {
            zzfn.zzq(str);
        } else if (isLoggable(0)) {
            Log.v((String) zzby.zzzb.get(), str);
        }
        Logger logger = zzabk;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzac(String str) {
        zzci zzfn = zzci.zzfn();
        if (zzfn != null) {
            zzfn.zzt(str);
        } else if (isLoggable(2)) {
            Log.w((String) zzby.zzzb.get(), str);
        }
        Logger logger = zzabk;
        if (logger != null) {
            logger.warn(str);
        }
    }

    private static boolean isLoggable(int i) {
        if (zzabk == null || zzabk.getLogLevel() > i) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public static void setLogger(Logger logger) {
        zzabk = logger;
    }

    @VisibleForTesting
    public static Logger getLogger() {
        return zzabk;
    }
}
