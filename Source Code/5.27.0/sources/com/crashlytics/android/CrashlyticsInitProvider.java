package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.common.p;

public class CrashlyticsInitProvider extends ContentProvider {

    interface a {
        boolean G(Context context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        boolean a = a(context, new p(), new b());
        String str = "CrashlyticsInitProvider";
        if (a) {
            try {
                c.a(context, F(context.getApplicationContext()));
                c.biX().i(str, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                c.biX().i(str, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        }
        c.biX().i(str, "CrashlyticsInitProvider skipping initialization");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A:{SYNTHETIC, Splitter:B:12:0x0032} */
    private io.fabric.sdk.android.h[] F(android.content.Context r7) {
        /*
        r6 = this;
        r0 = "Fabric";
        r1 = 1;
        r2 = 0;
        r3 = r7.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0020 }
        r7 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x0020 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r7 = r3.getApplicationInfo(r7, r4);	 Catch:{ NameNotFoundException -> 0x0020 }
        r7 = r7.metaData;	 Catch:{ NameNotFoundException -> 0x0020 }
        if (r7 == 0) goto L_0x002a;
    L_0x0016:
        r3 = "firebase_crashlytics_ndk_enabled";
        r7 = r7.getBoolean(r3, r2);	 Catch:{ NameNotFoundException -> 0x0020 }
        if (r7 == 0) goto L_0x002a;
    L_0x001e:
        r7 = 1;
        goto L_0x002b;
    L_0x0020:
        r7 = move-exception;
        r3 = io.fabric.sdk.android.c.biX();
        r4 = "Unable to get PackageManager while determining if Crashlytics NDK should be initialized";
        r3.d(r0, r4, r7);
    L_0x002a:
        r7 = 0;
    L_0x002b:
        r3 = new com.crashlytics.android.a;
        r3.<init>();
        if (r7 == 0) goto L_0x0052;
    L_0x0032:
        r7 = io.fabric.sdk.android.c.biX();	 Catch:{ Throwable -> 0x0048 }
        r4 = "Crashlytics is initializing NDK crash reporter.";
        r7.i(r0, r4);	 Catch:{ Throwable -> 0x0048 }
        r7 = 2;
        r7 = new io.fabric.sdk.android.h[r7];	 Catch:{ Throwable -> 0x0048 }
        r7[r2] = r3;	 Catch:{ Throwable -> 0x0048 }
        r4 = new com.crashlytics.android.ndk.c;	 Catch:{ Throwable -> 0x0048 }
        r4.<init>();	 Catch:{ Throwable -> 0x0048 }
        r7[r1] = r4;	 Catch:{ Throwable -> 0x0048 }
        return r7;
    L_0x0048:
        r7 = move-exception;
        r4 = io.fabric.sdk.android.c.biX();
        r5 = "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK...";
        r4.e(r0, r5, r7);
    L_0x0052:
        r7 = new io.fabric.sdk.android.h[r1];
        r7[r2] = r3;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.CrashlyticsInitProvider.F(android.content.Context):io.fabric.sdk.android.h[]");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(Context context, p pVar, a aVar) {
        if (pVar.cE(context)) {
            return aVar.G(context);
        }
        return pVar.cG(context);
    }
}
