package com.crashlytics.android.core;

/* compiled from: MiddleOutStrategy */
class ae implements at {
    private final int rC;

    public ae(int i) {
        this.rC = i;
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.rC;
        if (length <= i) {
            return stackTraceElementArr;
        }
        length = i / 2;
        int i2 = i - length;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i2);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - length, stackTraceElementArr2, i2, length);
        return stackTraceElementArr2;
    }
}
