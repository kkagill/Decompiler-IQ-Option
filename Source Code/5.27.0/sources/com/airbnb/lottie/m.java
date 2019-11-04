package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: LottieResult */
public final class m<V> {
    @Nullable
    private final Throwable exception;
    @Nullable
    private final V value;

    public m(V v) {
        this.value = v;
        this.exception = null;
    }

    public m(Throwable th) {
        this.exception = th;
        this.value = null;
    }

    @Nullable
    public V getValue() {
        return this.value;
    }

    @Nullable
    public Throwable getException() {
        return this.exception;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (getValue() != null && getValue().equals(mVar.getValue())) {
            return true;
        }
        if (getException() == null || mVar.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }
}
