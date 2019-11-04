package com.iqoption.util;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: ArrayLists */
public final class b {
    public static <T> ArrayList<T> B(Collection<T> collection) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        return arrayList;
    }
}
