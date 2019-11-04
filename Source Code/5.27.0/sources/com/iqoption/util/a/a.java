package com.iqoption.util.a;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ConcurrentMapSet */
public class a<T> {
    private final ConcurrentMap<T, T> TA = new ConcurrentHashMap();

    public T ct(T t) {
        return this.TA.put(t, t);
    }

    public T remove(T t) {
        return this.TA.remove(t);
    }

    public T get(T t) {
        return this.TA.get(t);
    }

    public void clear() {
        this.TA.clear();
    }

    public void addAll(Collection<? extends T> collection) {
        for (Object ct : collection) {
            ct(ct);
        }
    }

    public Collection<T> aXc() {
        return this.TA.values();
    }
}
