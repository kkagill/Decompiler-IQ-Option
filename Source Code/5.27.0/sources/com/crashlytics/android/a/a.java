package com.crashlytics.android.a;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import io.fabric.sdk.android.services.common.l;
import java.util.Collections;
import java.util.Map;

/* compiled from: Beta */
public class a extends h<Boolean> implements l {
    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.2.10.27";
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: ef */
    public Boolean ec() {
        c.biX().d("Beta", "Beta kit initializing...");
        return Boolean.valueOf(true);
    }

    public Map<DeviceIdentifierType, String> eC() {
        return Collections.emptyMap();
    }
}
