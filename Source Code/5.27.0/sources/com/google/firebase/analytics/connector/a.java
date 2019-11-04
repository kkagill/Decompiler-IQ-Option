package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

public interface a {
    @KeepForSdk
    void logEvent(@NonNull String str, @NonNull String str2, Bundle bundle);

    @KeepForSdk
    void setUserProperty(@NonNull String str, @NonNull String str2, Object obj);
}
