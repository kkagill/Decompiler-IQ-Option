package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;

/* compiled from: ManifestUnityVersionProvider */
class ab implements av {
    private final Context context;
    private final String packageName;

    public ab(Context context, String str) {
        this.context = context;
        this.packageName = str;
    }

    public String fP() {
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.packageName, 128).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
