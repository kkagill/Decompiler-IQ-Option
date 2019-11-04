package com.iqoption.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.iqoption.app.d;
import java.util.UUID;

/* compiled from: SystemUtils */
public class aj {
    private static final String TAG = "com.iqoption.util.aj";

    static String fu(int i) {
        return i <= 160 ? "mdpi" : i <= 240 ? "hdpi" : i <= 320 ? "xhdpi" : i <= 480 ? "xxhdpi" : "xxxhdpi";
    }

    public static String bl(Context context) {
        return fu(context.getResources().getDisplayMetrics().densityDpi);
    }

    public static String bO(Context context) {
        String deviceId = d.aP(context).getDeviceId();
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        deviceId = UUID.randomUUID().toString();
        d.aP(context).dP(deviceId);
        return deviceId;
    }

    public static boolean anH() {
        return Looper.getMainLooper().equals(Looper.myLooper());
    }

    public static void bm(Context context) {
        if (context != null) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
        }
    }

    public static void aWY() {
        Process.killProcess(Process.myPid());
    }

    public static String jQ(String str) {
        if (str.endsWith("/")) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('/');
        return stringBuilder.toString();
    }
}
