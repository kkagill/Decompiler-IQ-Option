package com.iqoption.util;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.os.Bundle;
import com.iqoption.app.IQApp;
import com.iqoption.core.c.a;

/* compiled from: ConfigChangingTracker */
public final class h {
    private static boolean eaV;

    public static void init() {
        IQApp.Eu().registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            private ComponentName eaW;

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.eaW = activity.getComponentName();
            }

            public void onActivityStarted(Activity activity) {
                if (this.eaW == null) {
                    this.eaW = activity.getComponentName();
                }
            }

            public void onActivityResumed(Activity activity) {
                if (h.eaV) {
                    a.biN.post(new Runnable() {
                        public void run() {
                            h.eaV = false;
                        }
                    });
                }
            }

            public void onActivityPaused(Activity activity) {
                if (activity.isChangingConfigurations()) {
                    h.eaV = true;
                } else {
                    this.eaW = null;
                }
            }
        });
    }
}
