package com.iqoption.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.app.NavUtils;

/* compiled from: ActivityUtils */
public final class a {
    private static final String TAG = "com.iqoption.util.a";

    private a() {
    }

    public static void i(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void l(Activity activity) {
        b(activity, null);
    }

    public static void b(Activity activity, @Nullable Intent intent) {
        Intent parentActivityIntent = NavUtils.getParentActivityIntent(activity);
        if (!(intent == null || parentActivityIntent == null)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                parentActivityIntent.putExtras(extras);
            }
            parentActivityIntent.setData(intent.getData());
        }
        parentActivityIntent.addFlags(65536);
        if (NavUtils.shouldUpRecreateTask(activity, parentActivityIntent) || activity.isTaskRoot()) {
            activity.startActivity(parentActivityIntent);
            i(activity);
            activity.overridePendingTransition(0, 0);
            return;
        }
        parentActivityIntent.setFlags(67108864);
        NavUtils.navigateUpTo(activity, parentActivityIntent);
        activity.overridePendingTransition(0, 0);
    }
}
