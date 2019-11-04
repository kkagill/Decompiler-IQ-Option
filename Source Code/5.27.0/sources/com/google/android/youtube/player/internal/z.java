package com.google.android.youtube.player.internal;

import android.util.Log;

public final class z {
    public static void f(String str, Throwable th) {
        Log.e("YouTubeAndroidPlayerAPI", str, th);
    }

    public static void f(String str, Object... objArr) {
        Log.w("YouTubeAndroidPlayerAPI", String.format(str, objArr));
    }
}
