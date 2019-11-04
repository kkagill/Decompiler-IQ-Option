package com.facebook.appevents.codeless.internal;

import android.util.Log;

/* compiled from: UnityReflection */
public class c {
    private static final String TAG = "com.facebook.appevents.codeless.internal.c";
    private static Class<?> wx;

    public static void c(String str, String str2, String str3) {
        try {
            if (wx == null) {
                wx = Class.forName("com.unity3d.player.UnityPlayer");
            }
            wx.getMethod("UnitySendMessage", new Class[]{String.class, String.class, String.class}).invoke(wx, new Object[]{str, str2, str3});
        } catch (Exception e) {
            Log.e(TAG, "Failed to send message to Unity", e);
        }
    }

    public static void iN() {
        c("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static void aU(String str) {
        c("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }
}
