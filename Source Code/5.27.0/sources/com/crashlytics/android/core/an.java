package com.crashlytics.android.core;

import java.util.HashMap;

/* compiled from: RemoveRepeatsStrategy */
class an implements at {
    private final int rP;

    public an() {
        this(1);
    }

    public an(int i) {
        this.rP = i;
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] a = a(stackTraceElementArr, this.rP);
        return a.length < stackTraceElementArr.length ? a : stackTraceElementArr;
    }

    private static StackTraceElement[] a(StackTraceElement[] stackTraceElementArr, int i) {
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            int i5;
            Object obj = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null || !a(stackTraceElementArr, num.intValue(), i2)) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i5 = i2;
                i4 = 1;
            } else {
                i5 = i2 - num.intValue();
                if (i4 < i) {
                    System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, i5);
                    i3 += i5;
                    i4++;
                }
                i5 = (i5 - 1) + i2;
            }
            hashMap.put(obj, Integer.valueOf(i2));
            i2 = i5 + 1;
        }
        stackTraceElementArr = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr, 0, stackTraceElementArr.length);
        return stackTraceElementArr;
    }

    private static boolean a(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }
}
