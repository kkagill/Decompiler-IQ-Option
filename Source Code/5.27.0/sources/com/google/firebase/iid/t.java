package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class t implements Continuation {
    private final r adk;
    private final Pair adl;

    t(r rVar, Pair pair) {
        this.adk = rVar;
        this.adl = pair;
    }

    public final Object then(Task task) {
        return this.adk.a(this.adl, task);
    }
}
