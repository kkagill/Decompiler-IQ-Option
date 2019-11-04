package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

final /* synthetic */ class ao implements s {
    private final FirebaseInstanceId aec;
    private final String aed;
    private final String aee;
    private final String zzbc;
    private final String zzbe;

    ao(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, String str4) {
        this.aec = firebaseInstanceId;
        this.zzbc = str;
        this.aed = str2;
        this.zzbe = str3;
        this.aee = str4;
    }

    public final Task wH() {
        return this.aec.c(this.zzbc, this.aed, this.zzbe, this.aee);
    }
}
