package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* compiled from: TypeVisitor */
abstract class f {
    private final Set<Type> Zz = Sets.uw();

    /* Access modifiers changed, original: 0000 */
    public void a(TypeVariable<?> typeVariable) {
    }

    /* Access modifiers changed, original: 0000 */
    public void b(GenericArrayType genericArrayType) {
    }

    /* Access modifiers changed, original: 0000 */
    public void b(ParameterizedType parameterizedType) {
    }

    /* Access modifiers changed, original: 0000 */
    public void b(WildcardType wildcardType) {
    }

    /* Access modifiers changed, original: 0000 */
    public void j(Class<?> cls) {
    }

    f() {
    }

    public final void c(Type... typeArr) {
        for (Object obj : typeArr) {
            if (obj != null && this.Zz.add(obj)) {
                try {
                    if (obj instanceof TypeVariable) {
                        a((TypeVariable) obj);
                    } else if (obj instanceof WildcardType) {
                        b((WildcardType) obj);
                    } else if (obj instanceof ParameterizedType) {
                        b((ParameterizedType) obj);
                    } else if (obj instanceof Class) {
                        j((Class) obj);
                    } else if (obj instanceof GenericArrayType) {
                        b((GenericArrayType) obj);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown type: ");
                        stringBuilder.append(obj);
                        throw new AssertionError(stringBuilder.toString());
                    }
                } catch (Throwable th) {
                    this.Zz.remove(obj);
                }
            }
        }
    }
}
