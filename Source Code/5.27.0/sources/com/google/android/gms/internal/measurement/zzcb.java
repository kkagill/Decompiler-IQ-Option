package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

public class zzcb {
    @GuardedBy("DirectBootUtils.class")
    private static UserManager zzaan;
    private static volatile boolean zzaao = (zzri() ^ 1);
    @GuardedBy("DirectBootUtils.class")
    private static boolean zzaap = false;

    private zzcb() {
    }

    public static boolean zzri() {
        return VERSION.SDK_INT >= 24;
    }

    public static boolean isUserUnlocked(Context context) {
        return !zzri() || zzo(context);
    }

    @RequiresApi(24)
    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    private static boolean zzn(Context context) {
        boolean z;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zzaan == null) {
                zzaan = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zzaan;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                    z = true;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zzaan = null;
                i++;
            }
        }
        if (z) {
            zzaan = null;
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:14:0x0018, code skipped:
            return r3;
     */
    @androidx.annotation.RequiresApi(24)
    @android.annotation.TargetApi(24)
    private static boolean zzo(android.content.Context r3) {
        /*
        r0 = zzaao;
        r1 = 1;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = com.google.android.gms.internal.measurement.zzcb.class;
        monitor-enter(r0);
        r2 = zzaao;	 Catch:{ all -> 0x0019 }
        if (r2 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        return r1;
    L_0x000f:
        r3 = zzn(r3);	 Catch:{ all -> 0x0019 }
        if (r3 == 0) goto L_0x0017;
    L_0x0015:
        zzaao = r3;	 Catch:{ all -> 0x0019 }
    L_0x0017:
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        return r3;
    L_0x0019:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcb.zzo(android.content.Context):boolean");
    }
}
