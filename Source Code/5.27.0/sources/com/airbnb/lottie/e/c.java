package com.airbnb.lottie.e;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.airbnb.lottie.a.b.a;

/* compiled from: LottieValueCallback */
public class c<T> {
    private final b<T> gR = new b();
    @Nullable
    private a<?, ?> ky;
    @Nullable
    protected T value = null;

    public c(@Nullable T t) {
        this.value = t;
    }

    @Nullable
    public T a(b<T> bVar) {
        return this.value;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.gR.a(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({Scope.LIBRARY})
    public final void c(@Nullable a<?, ?> aVar) {
        this.ky = aVar;
    }
}
