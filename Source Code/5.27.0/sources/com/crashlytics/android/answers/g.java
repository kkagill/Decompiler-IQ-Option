package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;
import io.fabric.sdk.android.a.b;

/* compiled from: AnswersLifecycleCallbacks */
class g extends b {
    private final z nM;
    private final k ob;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public g(z zVar, k kVar) {
        this.nM = zVar;
        this.ob = kVar;
    }

    public void onActivityStarted(Activity activity) {
        this.nM.a(activity, Type.START);
    }

    public void onActivityResumed(Activity activity) {
        this.nM.a(activity, Type.RESUME);
        this.ob.em();
    }

    public void onActivityPaused(Activity activity) {
        this.nM.a(activity, Type.PAUSE);
        this.ob.en();
    }

    public void onActivityStopped(Activity activity) {
        this.nM.a(activity, Type.STOP);
    }
}
