package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* compiled from: ResourceUnityVersionProvider */
class ap implements av {
    private final Context context;
    private String pY;
    private final av rX;
    private boolean rY = false;

    public ap(Context context, av avVar) {
        this.context = context;
        this.rX = avVar;
    }

    public String fP() {
        if (!this.rY) {
            this.pY = CommonUtils.cA(this.context);
            this.rY = true;
        }
        String str = this.pY;
        if (str != null) {
            return str;
        }
        av avVar = this.rX;
        return avVar != null ? avVar.fP() : null;
    }
}
