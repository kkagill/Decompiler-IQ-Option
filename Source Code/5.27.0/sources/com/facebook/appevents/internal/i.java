package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.f;

/* compiled from: SourceApplicationInfo */
class i {
    private String xq;
    private boolean xr;

    private i(String str, boolean z) {
        this.xq = str;
        this.xr = z;
    }

    public static i jz() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext());
        String str = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
        if (defaultSharedPreferences.contains(str)) {
            return new i(defaultSharedPreferences.getString(str, null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
        }
        return null;
    }

    public static void jA() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    public String toString() {
        String str = this.xr ? "Applink" : "Unclassified";
        if (this.xq == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(this.xq);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void jB() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.xq);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.xr);
        edit.apply();
    }
}
