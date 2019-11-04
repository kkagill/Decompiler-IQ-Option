package com.crashlytics.android.core;

/* compiled from: TrimmedThrowableData */
class au {
    public final String className;
    public final String sc;
    public final StackTraceElement[] sd;
    public final au se;

    public au(Throwable th, at atVar) {
        this.sc = th.getLocalizedMessage();
        this.className = th.getClass().getName();
        this.sd = atVar.a(th.getStackTrace());
        th = th.getCause();
        this.se = th != null ? new au(th, atVar) : null;
    }
}
