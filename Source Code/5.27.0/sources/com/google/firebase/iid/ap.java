package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class ap implements Continuation {
    private final FirebaseInstanceId aec;
    private final String aed;
    private final String zzbc;

    ap(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.aec = firebaseInstanceId;
        this.zzbc = str;
        this.aed = str2;
    }

    public final Object then(Task task) {
        return this.aec.a(this.zzbc, this.aed, task);
    }
}
