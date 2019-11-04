package com.google.common.base;

final class Absent<T> extends Optional<T> {
    static final Absent<Object> RJ = new Absent();
    private static final long serialVersionUID = 0;

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    public T pN() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    static <T> Optional<T> pM() {
        return RJ;
    }

    private Absent() {
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public T ae(T t) {
        return i.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    private Object readResolve() {
        return RJ;
    }
}
