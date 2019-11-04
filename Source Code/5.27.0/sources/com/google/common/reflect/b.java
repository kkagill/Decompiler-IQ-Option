package com.google.common.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/* compiled from: Invokable */
public abstract class b<T, R> extends a implements GenericDeclaration {

    /* compiled from: Invokable */
    static class a<T> extends b<T, Object> {
        final Method Yh;

        public final TypeVariable<?>[] getTypeParameters() {
            return this.Yh.getTypeParameters();
        }
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final Class<? super T> getDeclaringClass() {
        return super.getDeclaringClass();
    }

    public TypeToken<T> vg() {
        return TypeToken.k(getDeclaringClass());
    }
}
