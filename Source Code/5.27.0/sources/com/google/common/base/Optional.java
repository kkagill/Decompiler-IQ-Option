package com.google.common.base;

import java.io.Serializable;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract T ae(T t);

    public abstract T get();

    public abstract boolean isPresent();

    public abstract T pN();

    public static <T> Optional<T> pW() {
        return Absent.pM();
    }

    public static <T> Optional<T> am(T t) {
        return new Present(i.checkNotNull(t));
    }

    public static <T> Optional<T> an(T t) {
        return t == null ? pW() : new Present(t);
    }

    Optional() {
    }
}
