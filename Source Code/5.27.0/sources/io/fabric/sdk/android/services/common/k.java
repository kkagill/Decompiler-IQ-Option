package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: DataCollectionArbiter */
public class k {
    private static k eMX;
    private static Object eMY = new Object();
    private volatile boolean eMZ;
    private volatile boolean eNa;
    private final n eNb;
    private boolean eNc = false;
    private final SharedPreferences sA;

    public static k cC(Context context) {
        k kVar;
        synchronized (eMY) {
            if (eMX == null) {
                eMX = new k(context);
            }
            kVar = eMX;
        }
        return kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    private k(android.content.Context r7) {
        /*
        r6 = this;
        r6.<init>();
        r0 = 0;
        r6.eNc = r0;
        if (r7 == 0) goto L_0x006a;
    L_0x0008:
        r1 = "com.google.firebase.crashlytics.prefs";
        r1 = r7.getSharedPreferences(r1, r0);
        r6.sA = r1;
        r1 = io.fabric.sdk.android.services.common.o.cD(r7);
        r6.eNb = r1;
        r1 = r6.sA;
        r2 = "firebase_crashlytics_collection_enabled";
        r1 = r1.contains(r2);
        r3 = 1;
        if (r1 == 0) goto L_0x0029;
    L_0x0021:
        r1 = r6.sA;
        r1 = r1.getBoolean(r2, r3);
    L_0x0027:
        r2 = 1;
        goto L_0x005c;
    L_0x0029:
        r1 = r7.getPackageManager();	 Catch:{ NameNotFoundException -> 0x004e }
        if (r1 == 0) goto L_0x005a;
    L_0x002f:
        r4 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x004e }
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = r1.getApplicationInfo(r4, r5);	 Catch:{ NameNotFoundException -> 0x004e }
        if (r1 == 0) goto L_0x005a;
    L_0x003b:
        r4 = r1.metaData;	 Catch:{ NameNotFoundException -> 0x004e }
        if (r4 == 0) goto L_0x005a;
    L_0x003f:
        r4 = r1.metaData;	 Catch:{ NameNotFoundException -> 0x004e }
        r4 = r4.containsKey(r2);	 Catch:{ NameNotFoundException -> 0x004e }
        if (r4 == 0) goto L_0x005a;
    L_0x0047:
        r1 = r1.metaData;	 Catch:{ NameNotFoundException -> 0x004e }
        r1 = r1.getBoolean(r2);	 Catch:{ NameNotFoundException -> 0x004e }
        goto L_0x0027;
    L_0x004e:
        r1 = move-exception;
        r2 = io.fabric.sdk.android.c.biX();
        r4 = "Fabric";
        r5 = "Unable to get PackageManager. Falling through";
        r2.d(r4, r5, r1);
    L_0x005a:
        r1 = 1;
        r2 = 0;
    L_0x005c:
        r6.eNa = r1;
        r6.eMZ = r2;
        r7 = io.fabric.sdk.android.services.common.CommonUtils.cA(r7);
        if (r7 == 0) goto L_0x0067;
    L_0x0066:
        r0 = 1;
    L_0x0067:
        r6.eNc = r0;
        return;
    L_0x006a:
        r7 = new java.lang.RuntimeException;
        r0 = "null context";
        r7.<init>(r0);
        goto L_0x0073;
    L_0x0072:
        throw r7;
    L_0x0073:
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.k.<init>(android.content.Context):void");
    }

    public boolean bjx() {
        if (this.eNc && this.eMZ) {
            return this.eNa;
        }
        n nVar = this.eNb;
        return nVar != null ? nVar.isDataCollectionDefaultEnabled() : true;
    }

    public boolean bjy() {
        return this.eNa;
    }
}
