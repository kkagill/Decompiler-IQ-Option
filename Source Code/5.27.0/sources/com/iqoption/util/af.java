package com.iqoption.util;

import android.os.Build.VERSION;

/* compiled from: PackageNameUtil */
public class af {
    public static final boolean ebQ = (VERSION.SDK_INT == 21);
    public static final boolean ebR = (VERSION.SDK_INT >= 21);
    public static final boolean ebS = (VERSION.SDK_INT >= 19);
    public static final boolean ebT;

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            z = false;
        }
        ebT = z;
    }
}
