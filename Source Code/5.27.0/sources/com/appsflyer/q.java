package com.appsflyer;

final class q implements b {
    private b nf = this;

    enum a {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT(r6, r6),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "io.flutter.plugin.common.MethodChannel.MethodCallHandler");
        
        /* renamed from: ʽ */
        private String f23;
        /* renamed from: ॱॱ */
        private String f24;

        private a(String str, String str2) {
            this.f24 = str;
            this.f23 = str2;
        }
    }

    interface b {
        Class<?> af(String str);
    }

    /* Access modifiers changed, original: final */
    public final String dG() {
        for (a aVar : a.values()) {
            if (Z(aVar.f23)) {
                return aVar.f24;
            }
        }
        return a.DEFAULT.f24;
    }

    q() {
    }

    private boolean Z(String str) {
        try {
            this.nf.af(str);
            StringBuilder stringBuilder = new StringBuilder("Class: ");
            stringBuilder.append(str);
            stringBuilder.append(" is found.");
            AFLogger.G(stringBuilder.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.c(th.getMessage(), th);
            return false;
        }
    }

    public final Class<?> af(String str) {
        return Class.forName(str);
    }
}
