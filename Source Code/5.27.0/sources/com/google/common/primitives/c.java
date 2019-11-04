package com.google.common.primitives;

import com.google.common.base.i;

/* compiled from: Ints */
public final class c {
    public static int G(long j) {
        return j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
    }

    public static int compare(int i, int i2) {
        return i < i2 ? -1 : i > i2 ? 1 : 0;
    }

    public static int d(int... iArr) {
        i.checkArgument(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public static Integer bW(String str) {
        return n(str, 10);
    }

    public static Integer n(String str, int i) {
        Long o = Longs.o(str, i);
        return (o == null || o.longValue() != ((long) o.intValue())) ? null : Integer.valueOf(o.intValue());
    }
}
