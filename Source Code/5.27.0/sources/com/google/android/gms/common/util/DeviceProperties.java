package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {
    private static Boolean zzgn;
    private static Boolean zzgo;
    private static Boolean zzgp;
    private static Boolean zzgq;
    private static Boolean zzgr;
    private static Boolean zzgs;
    private static Boolean zzgt;
    private static Boolean zzgu;

    private DeviceProperties() {
    }

    /* JADX WARNING: Missing block: B:20:0x003c, code skipped:
            if (zzgo.booleanValue() != false) goto L_0x003e;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isTablet(android.content.res.Resources r4) {
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = zzgn;
        if (r1 != 0) goto L_0x0045;
    L_0x0008:
        r1 = r4.getConfiguration();
        r1 = r1.screenLayout;
        r1 = r1 & 15;
        r2 = 3;
        r3 = 1;
        if (r1 <= r2) goto L_0x0016;
    L_0x0014:
        r1 = 1;
        goto L_0x0017;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        if (r1 != 0) goto L_0x003e;
    L_0x0019:
        r1 = zzgo;
        if (r1 != 0) goto L_0x0036;
    L_0x001d:
        r4 = r4.getConfiguration();
        r1 = r4.screenLayout;
        r1 = r1 & 15;
        if (r1 > r2) goto L_0x002f;
    L_0x0027:
        r4 = r4.smallestScreenWidthDp;
        r1 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r4 < r1) goto L_0x002f;
    L_0x002d:
        r4 = 1;
        goto L_0x0030;
    L_0x002f:
        r4 = 0;
    L_0x0030:
        r4 = java.lang.Boolean.valueOf(r4);
        zzgo = r4;
    L_0x0036:
        r4 = zzgo;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x003f;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        r4 = java.lang.Boolean.valueOf(r0);
        zzgn = r4;
    L_0x0045:
        r4 = zzgn;
        r4 = r4.booleanValue();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.isTablet(android.content.res.Resources):boolean");
    }

    @TargetApi(20)
    @KeepForSdk
    public static boolean isWearable(Context context) {
        if (zzgp == null) {
            boolean z = PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            zzgp = Boolean.valueOf(z);
        }
        return zzgp.booleanValue();
    }

    @TargetApi(26)
    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(Context context) {
        return isWearable(context) && (!PlatformVersion.isAtLeastN() || (isSidewinder(context) && !PlatformVersion.isAtLeastO()));
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean isSidewinder(Context context) {
        if (zzgq == null) {
            boolean z = PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google");
            zzgq = Boolean.valueOf(z);
        }
        return zzgq.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context) {
        if (zzgr == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services");
            zzgr = Boolean.valueOf(z);
        }
        return zzgr.booleanValue();
    }

    public static boolean zzf(Context context) {
        if (zzgs == null) {
            boolean z = context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            zzgs = Boolean.valueOf(z);
        }
        return zzgs.booleanValue();
    }

    @KeepForSdk
    public static boolean isAuto(Context context) {
        if (zzgt == null) {
            boolean z = PlatformVersion.isAtLeastO() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
            zzgt = Boolean.valueOf(z);
        }
        return zzgt.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(Context context) {
        if (zzgu == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback");
            zzgu = Boolean.valueOf(z);
        }
        return zzgu.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        return "user".equals(Build.TYPE);
    }
}
