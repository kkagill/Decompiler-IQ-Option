package io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ActivityLifecycleManager */
public class a {
    private final Application eLY;
    private a eLZ;

    /* compiled from: ActivityLifecycleManager */
    public static abstract class b {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* compiled from: ActivityLifecycleManager */
    private static class a {
        private final Application eLY;
        private final Set<ActivityLifecycleCallbacks> eMa = new HashSet();

        a(Application application) {
            this.eLY = application;
        }

        @TargetApi(14)
        private void clearCallbacks() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.eMa) {
                this.eLY.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        @TargetApi(14)
        private boolean b(final b bVar) {
            if (this.eLY == null) {
                return false;
            }
            AnonymousClass1 anonymousClass1 = new ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    bVar.onActivityCreated(activity, bundle);
                }

                public void onActivityStarted(Activity activity) {
                    bVar.onActivityStarted(activity);
                }

                public void onActivityResumed(Activity activity) {
                    bVar.onActivityResumed(activity);
                }

                public void onActivityPaused(Activity activity) {
                    bVar.onActivityPaused(activity);
                }

                public void onActivityStopped(Activity activity) {
                    bVar.onActivityStopped(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    bVar.onActivitySaveInstanceState(activity, bundle);
                }

                public void onActivityDestroyed(Activity activity) {
                    bVar.onActivityDestroyed(activity);
                }
            };
            this.eLY.registerActivityLifecycleCallbacks(anonymousClass1);
            this.eMa.add(anonymousClass1);
            return true;
        }
    }

    public a(Context context) {
        this.eLY = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.eLZ = new a(this.eLY);
        }
    }

    public boolean a(b bVar) {
        a aVar = this.eLZ;
        return aVar != null && aVar.b(bVar);
    }

    public void biU() {
        a aVar = this.eLZ;
        if (aVar != null) {
            aVar.clearCallbacks();
        }
    }
}
