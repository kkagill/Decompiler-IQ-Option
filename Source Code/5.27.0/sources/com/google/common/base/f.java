package com.google.common.base;

import java.util.Arrays;

/* compiled from: Objects */
public final class f extends c {
    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
