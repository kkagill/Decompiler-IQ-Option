package com.iqoption.util.b;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;
import java.util.Iterator;

/* compiled from: SparseArrays */
public final class b {
    public static <T> Iterable<T> a(final LongSparseArray<T> longSparseArray) {
        return new Iterable<T>() {
            @NonNull
            public Iterator<T> iterator() {
                return new a(longSparseArray);
            }
        };
    }
}
