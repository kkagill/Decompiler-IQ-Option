package com.google.android.gms.analytics;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzch;

@VisibleForTesting
public final class zzd {
    public static String zzd(int i) {
        return zza("&cd", i);
    }

    public static String zze(int i) {
        return zza("cd", i);
    }

    public static String zzf(int i) {
        return zza("&cm", i);
    }

    public static String zzg(int i) {
        return zza("cm", i);
    }

    private static String zza(String str, int i) {
        if (i <= 0) {
            zzch.zzf("index out of range for prefix", str);
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
        stringBuilder.append(str);
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static String zzh(int i) {
        return zza("&pr", i);
    }

    public static String zzi(int i) {
        return zza("pr", i);
    }

    public static String zzj(int i) {
        return zza("&promo", i);
    }

    public static String zzk(int i) {
        return zza(NotificationCompat.CATEGORY_PROMO, i);
    }

    public static String zzl(int i) {
        return zza("pi", i);
    }

    public static String zzm(int i) {
        return zza("&il", i);
    }

    public static String zzn(int i) {
        return zza("il", i);
    }

    public static String zzo(int i) {
        return zza("cd", i);
    }

    public static String zzp(int i) {
        return zza("cm", i);
    }
}
