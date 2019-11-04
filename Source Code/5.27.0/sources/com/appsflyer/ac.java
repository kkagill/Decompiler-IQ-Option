package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

@RequiresApi(api = 14)
final class ac implements ActivityLifecycleCallbacks {
    private static ac mU;
    private boolean lU = true;
    private boolean mV = false;
    private b mW = null;

    class a extends AsyncTask<Void, Void, Void> {
        private WeakReference<Context> lN;

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return dS();
        }

        public a(WeakReference<Context> weakReference) {
            this.lN = weakReference;
        }

        private Void dS() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                AFLogger.c("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            if (ac.this.mV && ac.this.lU) {
                ac.this.mV = false;
                try {
                    ac.this.mW.d(this.lN);
                } catch (Exception e2) {
                    AFLogger.c("Listener threw exception! ", e2);
                    cancel(true);
                }
            }
            this.lN.clear();
            return null;
        }
    }

    interface b {
        void c(Activity activity);

        void d(WeakReference<Context> weakReference);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    ac() {
    }

    static ac dQ() {
        if (mU == null) {
            mU = new ac();
        }
        return mU;
    }

    public static ac dR() {
        ac acVar = mU;
        if (acVar != null) {
            return acVar;
        }
        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
    }

    public final void a(Application application, b bVar) {
        this.mW = bVar;
        if (VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(mU);
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.lU = false;
        int i = this.mV ^ 1;
        this.mV = true;
        if (i != 0) {
            try {
                this.mW.c(activity);
            } catch (Exception e) {
                AFLogger.c("Listener threw exception! ", e);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.lU = true;
        try {
            new a(new WeakReference(activity.getApplicationContext())).executeOnExecutor(c.dd().df(), new Void[0]);
        } catch (RejectedExecutionException e) {
            AFLogger.c("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.c("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b.dc().c(activity.getIntent());
    }
}
