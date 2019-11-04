package com.iqoption.core.util;

import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.iqoption.core.d;

/* compiled from: SystemUtils */
public class ag {
    private static final String TAG = "com.iqoption.core.util.ag";

    static String fu(int i) {
        return i <= 160 ? "mdpi" : i <= 240 ? "hdpi" : i <= 320 ? "xhdpi" : i <= 480 ? "xxhdpi" : "xxxhdpi";
    }

    public static String bl(Context context) {
        return fu(context.getResources().getDisplayMetrics().densityDpi);
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

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Exception unused) {
        }
    }

    public static boolean aZ(Context context) {
        return a(context.getResources());
    }

    public static boolean a(Resources resources) {
        return resources.getConfiguration().orientation == 2;
    }

    public static boolean au(String str, String str2) {
        ClipboardManager clipboardManager = (ClipboardManager) d.Uo().getSystemService("clipboard");
        if (clipboardManager == null) {
            return false;
        }
        try {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static JsonObject anI() {
        JsonObject jsonObject = new JsonObject();
        if (!TextUtils.isEmpty(Build.DEVICE)) {
            jsonObject.addProperty("device", Build.DEVICE);
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            jsonObject.addProperty("manufacturer", Build.MANUFACTURER);
        }
        if (!TextUtils.isEmpty(Build.BRAND)) {
            jsonObject.addProperty("brand", Build.BRAND);
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            jsonObject.addProperty("model", Build.MODEL);
        }
        if (!TextUtils.isEmpty(Build.HARDWARE)) {
            jsonObject.addProperty("hardware", Build.HARDWARE);
        }
        return jsonObject;
    }
}
