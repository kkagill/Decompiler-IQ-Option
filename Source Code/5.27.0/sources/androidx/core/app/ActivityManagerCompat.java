package androidx.core.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;

public final class ActivityManagerCompat {
    private ActivityManagerCompat() {
    }

    public static boolean isLowRamDevice(@NonNull ActivityManager activityManager) {
        return VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : false;
    }
}
