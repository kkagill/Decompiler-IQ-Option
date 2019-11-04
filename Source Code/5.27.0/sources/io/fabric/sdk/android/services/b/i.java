package io.fabric.sdk.android.services.b;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* compiled from: TimeBasedFileRollOverRunnable */
public class i implements Runnable {
    private final Context context;
    private final e eOv;

    public i(Context context, e eVar) {
        this.context = context;
        this.eOv = eVar;
    }

    public void run() {
        try {
            CommonUtils.K(this.context, "Performing time based file roll over.");
            if (!this.eOv.er()) {
                this.eOv.es();
            }
        } catch (Exception e) {
            CommonUtils.a(this.context, "Failed to roll over file", e);
        }
    }
}
