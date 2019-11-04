package com.iqoption.util;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ArrayUtils */
public class c {
    public static long[] a(Long... lArr) {
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    public static <T> List<T> c(SparseArray<T> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.valueAt(i));
        }
        return arrayList;
    }
}
