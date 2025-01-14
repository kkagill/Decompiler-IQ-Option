package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;

public final class zzd extends zza<Integer> {
    public static Integer zza(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) zze.zza(new zze(sharedPreferences, str, num));
        } catch (Exception e) {
            str = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return num;
        }
    }
}
