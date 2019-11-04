package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.f;
import java.util.Collection;
import java.util.List;

/* compiled from: Validate */
public final class aa {
    private static final String TAG = "com.facebook.internal.aa";

    public static void b(Object obj, String str) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Argument '");
            stringBuilder.append(str);
            stringBuilder.append("' cannot be null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    public static <T> void a(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Container '");
            stringBuilder.append(str);
            stringBuilder.append("' cannot be empty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static <T> void b(Collection<T> collection, String str) {
        b((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Container '");
                stringBuilder.append(str);
                stringBuilder.append("' cannot contain null values");
                throw new NullPointerException(stringBuilder.toString());
            }
        }
    }

    public static <T> void c(Collection<T> collection, String str) {
        b((Collection) collection, str);
        a((Collection) collection, str);
    }

    public static void H(String str, String str2) {
        if (z.aB(str)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Argument '");
            stringBuilder.append(str2);
            stringBuilder.append("' cannot be null or empty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static void kV() {
        if (!f.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static String kW() {
        String go = f.go();
        if (go != null) {
            return go;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static String kX() {
        String gX = f.gX();
        if (gX != null) {
            return gX;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    public static void a(Context context, boolean z) {
        b((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            String str = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
            if (z) {
                throw new IllegalStateException(str);
            }
            Log.w(TAG, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    public static void b(android.content.Context r3, boolean r4) {
        /*
        r0 = "context";
        b(r3, r0);
        r0 = r3.getPackageManager();
        if (r0 == 0) goto L_0x0018;
    L_0x000b:
        r1 = new android.content.ComponentName;
        r2 = "com.facebook.FacebookActivity";
        r1.<init>(r3, r2);
        r3 = 1;
        r3 = r0.getActivityInfo(r1, r3);	 Catch:{ NameNotFoundException -> 0x0018 }
        goto L_0x0019;
    L_0x0018:
        r3 = 0;
    L_0x0019:
        if (r3 != 0) goto L_0x002b;
    L_0x001b:
        r3 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
        if (r4 != 0) goto L_0x0025;
    L_0x001f:
        r4 = TAG;
        android.util.Log.w(r4, r3);
        goto L_0x002b;
    L_0x0025:
        r4 = new java.lang.IllegalStateException;
        r4.<init>(r3);
        throw r4;
    L_0x002b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.aa.b(android.content.Context, boolean):void");
    }

    public static boolean ah(Context context) {
        b((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        List queryIntentActivities;
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fb");
            stringBuilder.append(f.go());
            stringBuilder.append("://authorize");
            intent.setData(Uri.parse(stringBuilder.toString()));
            queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            queryIntentActivities = null;
        }
        boolean z = false;
        if (queryIntentActivities != null) {
            boolean z2 = false;
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                    return false;
                }
                z2 = true;
            }
            z = z2;
        }
        return z;
    }
}
