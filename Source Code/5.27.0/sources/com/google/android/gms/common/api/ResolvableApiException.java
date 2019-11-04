package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.NonNull;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@NonNull Status status) {
        super(status);
    }

    public void startResolutionForResult(Activity activity, int i) {
        this.mStatus.startResolutionForResult(activity, i);
    }

    public PendingIntent getResolution() {
        return this.mStatus.getResolution();
    }
}
