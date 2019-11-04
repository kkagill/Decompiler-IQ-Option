package com.crashlytics.android.core;

/* compiled from: MiddleOutFallbackStrategy */
class ad implements at {
    private final at[] rA;
    private final ae rB;
    private final int rz;

    public ad(int i, at... atVarArr) {
        this.rz = i;
        this.rA = atVarArr;
        this.rB = new ae(i);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.rz) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (at atVar : this.rA) {
            if (stackTraceElementArr2.length <= this.rz) {
                break;
            }
            stackTraceElementArr2 = atVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.rz) {
            stackTraceElementArr2 = this.rB.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
