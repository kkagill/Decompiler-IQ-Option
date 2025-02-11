package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;

public final class zzf extends zza<Long> {
    public static Long zza(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) zze.zza(new zzg(sharedPreferences, str, l));
        } catch (Exception e) {
            str = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return l;
        }
    }
}
