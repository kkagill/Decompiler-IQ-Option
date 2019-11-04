package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.services.c.c;
import io.fabric.sdk.android.services.c.d;

/* compiled from: AnswersPreferenceManager */
class h {
    private final c oc;

    public static h H(Context context) {
        return new h(new d(context, "settings"));
    }

    h(c cVar) {
        this.oc = cVar;
    }

    @SuppressLint({"CommitPrefEdits"})
    public void ej() {
        c cVar = this.oc;
        cVar.a(cVar.edit().putBoolean("analytics_launched", true));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean ek() {
        return this.oc.bkA().getBoolean("analytics_launched", false);
    }
}
