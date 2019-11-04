package com.android.a.b;

import android.util.Log;

/* compiled from: InstallReferrerCommons */
public final class a {
    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }
}
