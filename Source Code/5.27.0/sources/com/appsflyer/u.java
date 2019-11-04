package com.appsflyer;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.c.1.AnonymousClass1;

final class u {

    static final class a {
        static final u mp = new u();
    }

    u() {
    }

    /* JADX WARNING: Missing block: B:17:0x003e, code skipped:
            if (r8 != null) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:20:0x004e, code skipped:
            if (60000 >= (r3.getTime() - r8.getTime())) goto L_0x0051;
     */
    @androidx.annotation.Nullable
    static android.location.Location y(@androidx.annotation.NonNull android.content.Context r8) {
        /*
        r0 = "android.permission.ACCESS_FINE_LOCATION";
        r1 = 0;
        r2 = "location";
        r2 = r8.getSystemService(r2);	 Catch:{ Throwable -> 0x0054 }
        r2 = (android.location.LocationManager) r2;	 Catch:{ Throwable -> 0x0054 }
        r3 = "network";
        r4 = "android.permission.ACCESS_COARSE_LOCATION";
        r4 = new java.lang.String[]{r0, r4};	 Catch:{ Throwable -> 0x0054 }
        r4 = a(r8, r4);	 Catch:{ Throwable -> 0x0054 }
        if (r4 == 0) goto L_0x001e;
    L_0x0019:
        r3 = r2.getLastKnownLocation(r3);	 Catch:{ Throwable -> 0x0054 }
        goto L_0x001f;
    L_0x001e:
        r3 = r1;
    L_0x001f:
        r4 = "gps";
        r0 = new java.lang.String[]{r0};	 Catch:{ Throwable -> 0x0054 }
        r8 = a(r8, r0);	 Catch:{ Throwable -> 0x0054 }
        if (r8 == 0) goto L_0x0030;
    L_0x002b:
        r8 = r2.getLastKnownLocation(r4);	 Catch:{ Throwable -> 0x0054 }
        goto L_0x0031;
    L_0x0030:
        r8 = r1;
    L_0x0031:
        if (r8 != 0) goto L_0x0037;
    L_0x0033:
        if (r3 != 0) goto L_0x0037;
    L_0x0035:
        r8 = r1;
        goto L_0x0051;
    L_0x0037:
        if (r8 != 0) goto L_0x003c;
    L_0x0039:
        if (r3 == 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0050;
    L_0x003c:
        if (r3 != 0) goto L_0x0040;
    L_0x003e:
        if (r8 != 0) goto L_0x0051;
    L_0x0040:
        r4 = r3.getTime();	 Catch:{ Throwable -> 0x0054 }
        r6 = r8.getTime();	 Catch:{ Throwable -> 0x0054 }
        r4 = r4 - r6;
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0051;
    L_0x0050:
        r8 = r3;
    L_0x0051:
        if (r8 == 0) goto L_0x0054;
    L_0x0053:
        r1 = r8;
    L_0x0054:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.u.y(android.content.Context):android.location.Location");
    }

    private static boolean a(@NonNull Context context, @NonNull String[] strArr) {
        for (String g : strArr) {
            if (AnonymousClass1.g(context, g)) {
                return true;
            }
        }
        return false;
    }
}
