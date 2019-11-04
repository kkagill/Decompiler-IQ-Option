package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
public class StatsUtils {
    @KeepForSdk
    public static String getEventKey(Context context, Intent intent) {
        return String.valueOf(((long) System.identityHashCode(intent)) | (((long) System.identityHashCode(context)) << 32));
    }

    @KeepForSdk
    public static String getEventKey(WakeLock wakeLock, String str) {
        Object str2;
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        str2 = String.valueOf(str2);
        return str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
    }

    @Nullable
    static List<String> zza(@Nullable List<String> list) {
        if (list == null || list.size() != 1) {
            return list;
        }
        return "com.google.android.gms".equals(list.get(0)) ? null : list;
    }

    @Nullable
    static String zzi(String str) {
        return "com.google.android.gms".equals(str) ? null : str;
    }
}
