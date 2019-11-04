package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.b.g;
import io.fabric.sdk.android.services.c.a;
import io.fabric.sdk.android.services.common.t;

/* compiled from: AnswersFilesManagerProvider */
class f {
    final Context context;
    final a oa;

    public f(Context context, a aVar) {
        this.context = context;
        this.oa = aVar;
    }

    public x ei() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new x(this.context, new ac(), new t(), new g(this.context, this.oa.getFilesDir(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
