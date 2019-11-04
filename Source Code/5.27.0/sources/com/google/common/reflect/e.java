package com.google.common.reflect;

import com.google.common.base.f;
import com.google.common.base.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: TypeResolver */
public final class e {
    private final b Zj;

    /* compiled from: TypeResolver */
    private static class b {
        private final ImmutableMap<c, Type> map;

        b() {
            this.map = ImmutableMap.sW();
        }

        private b(ImmutableMap<c, Type> immutableMap) {
            this.map = immutableMap;
        }

        /* Access modifiers changed, original: final */
        public final b t(Map<c, ? extends Type> map) {
            com.google.common.collect.ImmutableMap.a sX = ImmutableMap.sX();
            sX.p(this.map);
            for (Entry entry : map.entrySet()) {
                Object obj = (c) entry.getKey();
                Type type = (Type) entry.getValue();
                i.a(obj.e(type) ^ 1, "Type variable %s bound to itself", obj);
                sX.m(obj, type);
            }
            return new b(sX.tf());
        }

        /* Access modifiers changed, original: final */
        public final Type b(final TypeVariable<?> typeVariable) {
            return a(typeVariable, new b() {
                public Type a(TypeVariable<?> typeVariable, b bVar) {
                    if (typeVariable.getGenericDeclaration().equals(typeVariable.getGenericDeclaration())) {
                        return typeVariable;
                    }
                    return this.a(typeVariable, bVar);
                }
            });
        }

        /* Access modifiers changed, original: 0000 */
        public Type a(TypeVariable<?> typeVariable, b bVar) {
            Type type = (Type) this.map.get(new c(typeVariable));
            if (type != null) {
                return new e(bVar, null).b(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a = new e(bVar, null).a(bounds);
            if (a.ZE && Arrays.equals(bounds, a)) {
                return typeVariable;
            }
            return Types.a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
        }
    }

    /* compiled from: TypeResolver */
    static final class c {
        private final TypeVariable<?> Zq;

        c(TypeVariable<?> typeVariable) {
            this.Zq = (TypeVariable) i.checkNotNull(typeVariable);
        }

        public int hashCode() {
            return f.hashCode(this.Zq.getGenericDeclaration(), this.Zq.getName());
        }

        public boolean equals(Object obj) {
            return obj instanceof c ? c(((c) obj).Zq) : false;
        }

        public String toString() {
            return this.Zq.toString();
        }

        static c d(Type type) {
            return type instanceof TypeVariable ? new c((TypeVariable) type) : null;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean e(Type type) {
            return type instanceof TypeVariable ? c((TypeVariable) type) : false;
        }

        private boolean c(TypeVariable<?> typeVariable) {
            return this.Zq.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.Zq.getName().equals(typeVariable.getName());
        }
    }

    /* compiled from: TypeResolver */
    private static final class a extends f {
        private final Map<c, Type> Zm = Maps.uk();

        private a() {
        }

        static ImmutableMap<c, Type> c(Type type) {
            i.checkNotNull(type);
            a aVar = new a();
            aVar.c(type);
            return ImmutableMap.o(aVar.Zm);
        }

        /* Access modifiers changed, original: 0000 */
        public void j(Class<?> cls) {
            c(cls.getGenericSuperclass());
            c(cls.getGenericInterfaces());
        }

        /* Access modifiers changed, original: 0000 */
        public void b(ParameterizedType parameterizedType) {
            TypeVariable[] typeParameters = ((Class) parameterizedType.getRawType()).getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            i.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                a(new c(typeParameters[i]), actualTypeArguments[i]);
            }
            c(r0);
            c(parameterizedType.getOwnerType());
        }

        /* Access modifiers changed, original: 0000 */
        public void a(TypeVariable<?> typeVariable) {
            c(typeVariable.getBounds());
        }

        /* Access modifiers changed, original: 0000 */
        public void b(WildcardType wildcardType) {
            c(wildcardType.getUpperBounds());
        }

        private void a(c cVar, Type type) {
            if (!this.Zm.containsKey(cVar)) {
                Type type2 = type;
                while (type2 != null) {
                    if (cVar.e(type2)) {
                        while (type != null) {
                            type = (Type) this.Zm.remove(c.d(type));
                        }
                        return;
                    }
                    type2 = (Type) this.Zm.get(c.d(type2));
                }
                this.Zm.put(cVar, type);
            }
        }
    }

    /* synthetic */ e(b bVar, AnonymousClass1 anonymousClass1) {
        this(bVar);
    }

    public e() {
        this.Zj = new b();
    }

    private e(b bVar) {
        this.Zj = bVar;
    }

    static e a(Type type) {
        return new e().s(a.c(type));
    }

    /* Access modifiers changed, original: 0000 */
    public e s(Map<c, ? extends Type> map) {
        return new e(this.Zj.t(map));
    }

    private static void a(final Map<c, Type> map, Type type, final Type type2) {
        if (!type.equals(type2)) {
            new f() {
                /* Access modifiers changed, original: 0000 */
                public void a(TypeVariable<?> typeVariable) {
                    map.put(new c(typeVariable), type2);
                }

                /* Access modifiers changed, original: 0000 */
                public void b(WildcardType wildcardType) {
                    Type type = type2;
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type;
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Type[] upperBounds2 = wildcardType2.getUpperBounds();
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                        boolean z = upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length;
                        i.a(z, "Incompatible type: %s vs. %s", (Object) wildcardType, type2);
                        for (int i = 0; i < upperBounds.length; i++) {
                            e.a(map, upperBounds[i], upperBounds2[i]);
                        }
                        for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                            e.a(map, lowerBounds[i2], lowerBounds2[i2]);
                        }
                    }
                }

                /* Access modifiers changed, original: 0000 */
                public void b(ParameterizedType parameterizedType) {
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        Object obj = (ParameterizedType) e.a(ParameterizedType.class, (Object) type);
                        if (!(parameterizedType.getOwnerType() == null || obj.getOwnerType() == null)) {
                            e.a(map, parameterizedType.getOwnerType(), obj.getOwnerType());
                        }
                        i.a(parameterizedType.getRawType().equals(obj.getRawType()), "Inconsistent raw type: %s vs. %s", (Object) parameterizedType, type2);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type[] actualTypeArguments2 = obj.getActualTypeArguments();
                        i.a(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", (Object) parameterizedType, obj);
                        for (int i = 0; i < actualTypeArguments.length; i++) {
                            e.a(map, actualTypeArguments[i], actualTypeArguments2[i]);
                        }
                    }
                }

                /* Access modifiers changed, original: 0000 */
                public void b(GenericArrayType genericArrayType) {
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        type = Types.j(type);
                        i.a(type != null, "%s is not an array type.", type2);
                        e.a(map, genericArrayType.getGenericComponentType(), type);
                    }
                }

                /* Access modifiers changed, original: 0000 */
                public void j(Class<?> cls) {
                    if (!(type2 instanceof WildcardType)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("No type mapping from ");
                        stringBuilder.append(cls);
                        stringBuilder.append(" to ");
                        stringBuilder.append(type2);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }.c(type);
        }
    }

    public Type b(Type type) {
        i.checkNotNull(type);
        if (type instanceof TypeVariable) {
            return this.Zj.b((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return a((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return a((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            type = a((WildcardType) type);
        }
        return type;
    }

    private Type[] a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = b(typeArr[i]);
        }
        return typeArr2;
    }

    private WildcardType a(WildcardType wildcardType) {
        return new WildcardTypeImpl(a(wildcardType.getLowerBounds()), a(wildcardType.getUpperBounds()));
    }

    private Type a(GenericArrayType genericArrayType) {
        return Types.newArrayType(b(genericArrayType.getGenericComponentType()));
    }

    private ParameterizedType a(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            ownerType = null;
        } else {
            ownerType = b(ownerType);
        }
        return Types.a(ownerType, (Class) b(parameterizedType.getRawType()), a(parameterizedType.getActualTypeArguments()));
    }

    private static <T> T a(Class<T> cls, Object obj) {
        Class cls2;
        try {
            cls2 = cls2.cast(obj);
            return cls2;
        } catch (ClassCastException unused) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(obj);
            stringBuilder.append(" is not a ");
            stringBuilder.append(cls2.getSimpleName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
