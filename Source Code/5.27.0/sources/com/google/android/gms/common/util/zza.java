package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

public final class zza {
    private static final IntentFilter filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static long zzgv;
    private static float zzgw = Float.NaN;

    @TargetApi(20)
    public static int zzg(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        int i;
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
        int i2 = 0;
        if (registerReceiver == null) {
            i = 0;
        } else {
            i = registerReceiver.getIntExtra("plugged", 0);
        }
        i = (i & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        boolean isInteractive;
        if (PlatformVersion.isAtLeastKitKatWatch()) {
            isInteractive = powerManager.isInteractive();
        } else {
            isInteractive = powerManager.isScreenOn();
        }
        if (isInteractive) {
            i2 = 2;
        }
        return i2 | i;
    }

    public static synchronized float zzh(Context context) {
        synchronized (zza.class) {
            float f;
            if (SystemClock.elapsedRealtime() - zzgv >= 60000 || Float.isNaN(zzgw)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
                if (registerReceiver != null) {
                    zzgw = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                zzgv = SystemClock.elapsedRealtime();
                f = zzgw;
                return f;
            }
            f = zzgw;
            return f;
        }
    }
}
