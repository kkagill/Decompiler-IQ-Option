package com.iqoption.util.a;

import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: TreeMapSet */
public class b<T> {
    private final NavigableMap<T, T> ecc;

    public b() {
        this.ecc = new TreeMap();
    }

    public b(Comparator<? super T> comparator) {
        this.ecc = new TreeMap(comparator);
    }

    public T ct(T t) {
        return this.ecc.put(t, t);
    }

    public T remove(T t) {
        return this.ecc.remove(t);
    }

    public T get(T t) {
        return this.ecc.get(t);
    }

    @Nullable
    public T first() {
        return this.ecc.firstEntry().getValue();
    }

    public void clear() {
        this.ecc.clear();
    }

    public void addAll(Collection<? extends T> collection) {
        if (collection != null) {
            for (Object ct : collection) {
                ct(ct);
            }
        }
    }

    public int size() {
        return this.ecc.size();
    }

    public boolean isEmpty() {
        return this.ecc.isEmpty();
    }

    public Collection<T> aXc() {
        return this.ecc.values();
    }

    public Iterator<Entry<T, T>> iterator() {
        return this.ecc.entrySet().iterator();
    }
}
