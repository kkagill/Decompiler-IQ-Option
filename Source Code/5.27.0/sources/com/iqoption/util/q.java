package com.iqoption.util;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: Dp2PxUtils */
public class q {
    private Resources aOg;
    private float dM;

    public q(Context context) {
        if (context != null) {
            this.aOg = context.getResources();
            this.dM = this.aOg.getDisplayMetrics().density;
            return;
        }
        this.dM = 1.0f;
    }

    public int ad(float f) {
        return Math.round(f * this.dM);
    }
}
