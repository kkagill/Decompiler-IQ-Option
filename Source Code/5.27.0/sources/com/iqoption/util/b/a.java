package com.iqoption.util.b;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;
import com.google.common.base.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: LongSparseArrayIterator */
public class a<T> implements Iterator<T> {
    private int current = 0;
    private final LongSparseArray<T> ecd;
    private final int size;

    public a(@NonNull LongSparseArray<T> longSparseArray) {
        i.checkNotNull(longSparseArray);
        this.ecd = longSparseArray;
        this.size = longSparseArray.size();
    }

    public boolean hasNext() {
        return this.current < this.size;
    }

    public T next() {
        if (hasNext()) {
            LongSparseArray longSparseArray = this.ecd;
            int i = this.current;
            this.current = i + 1;
            return longSparseArray.valueAt(i);
        }
        throw new NoSuchElementException();
    }
}
