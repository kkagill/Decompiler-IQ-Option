package com.google.common.reflect;

import com.google.common.base.i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeCapture */
abstract class d<T> {
    d() {
    }

    /* Access modifiers changed, original: final */
    public final Type vh() {
        Object genericSuperclass = getClass().getGenericSuperclass();
        i.a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
