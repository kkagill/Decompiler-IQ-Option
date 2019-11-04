package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* compiled from: Element */
class a extends AccessibleObject implements Member {
    private final AccessibleObject Zh;
    private final Member Zi;

    public TypeToken<?> vg() {
        return TypeToken.k(getDeclaringClass());
    }

    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.Zh.isAnnotationPresent(cls);
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.Zh.getAnnotation(cls);
    }

    public final Annotation[] getAnnotations() {
        return this.Zh.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.Zh.getDeclaredAnnotations();
    }

    public final void setAccessible(boolean z) {
        this.Zh.setAccessible(z);
    }

    public final boolean isAccessible() {
        return this.Zh.isAccessible();
    }

    public Class<?> getDeclaringClass() {
        return this.Zi.getDeclaringClass();
    }

    public final String getName() {
        return this.Zi.getName();
    }

    public final int getModifiers() {
        return this.Zi.getModifiers();
    }

    public final boolean isSynthetic() {
        return this.Zi.isSynthetic();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (vg().equals(aVar.vg()) && this.Zi.equals(aVar.Zi)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.Zi.hashCode();
    }

    public String toString() {
        return this.Zi.toString();
    }
}
