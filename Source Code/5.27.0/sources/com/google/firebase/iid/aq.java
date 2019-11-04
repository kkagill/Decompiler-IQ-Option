package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class aq implements SuccessContinuation {
    private final FirebaseInstanceId aec;
    private final String aed;
    private final String zzbc;
    private final String zzbe;

    aq(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.aec = firebaseInstanceId;
        this.zzbc = str;
        this.aed = str2;
        this.zzbe = str3;
    }

    public final Task then(Object obj) {
        return this.aec.d(this.zzbc, this.aed, this.zzbe, (String) obj);
    }
}
