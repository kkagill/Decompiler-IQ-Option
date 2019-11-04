package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Platform */
final class aa {
    static <K, V> Map<K, V> cq(int i) {
        return CompactHashMap.bA(i);
    }

    static <E> Set<E> cr(int i) {
        return CompactHashSet.bM(i);
    }

    static <K, V> Map<K, V> ut() {
        return CompactHashMap.sl();
    }

    static <T> T[] c(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    static <T> T[] b(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    static v b(v vVar) {
        return vVar.tG();
    }
}
