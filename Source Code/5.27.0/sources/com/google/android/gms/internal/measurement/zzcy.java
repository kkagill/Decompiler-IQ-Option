package com.google.android.gms.internal.measurement;

final class zzcy<T> extends zzcw<T> {
    private final T zzabr;

    zzcy(T t) {
        this.zzabr = t;
    }

    public final boolean isPresent() {
        return true;
    }

    public final T get() {
        return this.zzabr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcy)) {
            return false;
        }
        return this.zzabr.equals(((zzcy) obj).zzabr);
    }

    public final int hashCode() {
        return this.zzabr.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzabr);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 13);
        stringBuilder.append("Optional.of(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
