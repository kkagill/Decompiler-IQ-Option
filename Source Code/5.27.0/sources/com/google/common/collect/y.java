package com.google.common.collect;

import com.google.common.base.i;
import java.lang.reflect.Array;
import java.util.Collection;

/* compiled from: ObjectArrays */
public final class y {
    public static <T> T[] a(Class<T> cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    public static <T> T[] c(T[] tArr, int i) {
        return aa.c(tArr, i);
    }

    static <T> T[] a(Collection<?> collection, T[] tArr) {
        Object[] tArr2;
        int size = collection.size();
        if (tArr2.length < size) {
            tArr2 = c(tArr2, size);
        }
        b(collection, tArr2);
        if (tArr2.length > size) {
            tArr2[size] = null;
        }
        return tArr2;
    }

    static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        Object tArr2;
        i.f(i, i + i2, objArr.length);
        if (tArr2.length < i2) {
            tArr2 = c(tArr2, i2);
        } else if (tArr2.length > i2) {
            tArr2[i2] = null;
        }
        System.arraycopy(objArr, i, tArr2, 0, i2);
        return tArr2;
    }

    static Object[] q(Collection<?> collection) {
        return b(collection, new Object[collection.size()]);
    }

    private static Object[] b(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            objArr[i] = obj;
            i = i2;
        }
        return objArr;
    }

    static Object[] m(Object... objArr) {
        return d(objArr, objArr.length);
    }

    static Object[] d(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            l(objArr[i2], i2);
        }
        return objArr;
    }

    static Object l(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("at index ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
