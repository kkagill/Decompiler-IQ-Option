package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class as implements Runnable {
    private final at aeg;
    private final TaskCompletionSource aeh;
    private final Bundle zzbo;

    as(at atVar, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.aeg = atVar;
        this.zzbo = bundle;
        this.aeh = taskCompletionSource;
    }

    public final void run() {
        this.aeg.a(this.zzbo, this.aeh);
    }
}
