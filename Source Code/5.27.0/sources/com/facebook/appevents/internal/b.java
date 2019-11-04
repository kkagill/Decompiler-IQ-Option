package com.facebook.appevents.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import com.facebook.f;
import com.facebook.internal.z;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: AppEventUtility */
public class b {
    public static void jf() {
    }

    public static void jg() {
    }

    public static double aX(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(z.kR()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static String f(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    public static boolean jh() {
        String str = "generic";
        if (!(Build.FINGERPRINT.startsWith(str) || Build.FINGERPRINT.startsWith("unknown"))) {
            String str2 = "google_sdk";
            if (!(Build.MODEL.contains(str2) || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith(str) && Build.DEVICE.startsWith(str)) || str2.equals(Build.PRODUCT)))) {
                return false;
            }
        }
        return true;
    }

    public static String ji() {
        Context applicationContext = f.getApplicationContext();
        try {
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }
}
