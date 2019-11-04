package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.base.d;
import com.google.common.base.f;
import com.google.common.base.i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.aj;
import com.google.common.collect.s;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

final class Types {
    private static final d<Type, String> ZB = new d<Type, String>() {
        /* renamed from: k */
        public String apply(Type type) {
            return JavaVersion.CURRENT.typeName(type);
        }
    };
    private static final Joiner ZC = Joiner.on(", ").bQ("null");

    private enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS {
            /* Access modifiers changed, original: 0000 */
            public Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* Access modifiers changed, original: 0000 */
            public Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        
        static final ClassOwnership JVM_BEHAVIOR = null;

        class a<T> {
            a() {
            }
        }

        public abstract Class<?> getOwnerType(Class<?> cls);

        static {
            JVM_BEHAVIOR = detectJvmBehavior();
        }

        private static ClassOwnership detectJvmBehavior() {
            ParameterizedType parameterizedType = (ParameterizedType) new a<String>() {
            }.getClass().getGenericSuperclass();
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(a.class) == parameterizedType.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }
    }

    private static final class GenericArrayTypeImpl implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.CURRENT.usedInGenericType(type);
        }

        public Type getGenericComponentType() {
            return this.componentType;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Types.i(this.componentType));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return f.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }
    }

    enum JavaVersion {
        JAVA6 {
            /* Access modifiers changed, original: 0000 */
            public GenericArrayType newArrayType(Type type) {
                return new GenericArrayTypeImpl(type);
            }

            /* Access modifiers changed, original: 0000 */
            public Type usedInGenericType(Type type) {
                i.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        },
        JAVA7 {
            /* Access modifiers changed, original: 0000 */
            public Type newArrayType(Type type) {
                if (type instanceof Class) {
                    return Types.o((Class) type);
                }
                return new GenericArrayTypeImpl(type);
            }

            /* Access modifiers changed, original: 0000 */
            public Type usedInGenericType(Type type) {
                return (Type) i.checkNotNull(type);
            }
        },
        JAVA8 {
            /* Access modifiers changed, original: 0000 */
            public Type newArrayType(Type type) {
                return JAVA7.newArrayType(type);
            }

            /* Access modifiers changed, original: 0000 */
            public Type usedInGenericType(Type type) {
                return JAVA7.usedInGenericType(type);
            }

            /* Access modifiers changed, original: 0000 */
            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        },
        JAVA9 {
            /* Access modifiers changed, original: 0000 */
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            /* Access modifiers changed, original: 0000 */
            public Type newArrayType(Type type) {
                return JAVA8.newArrayType(type);
            }

            /* Access modifiers changed, original: 0000 */
            public Type usedInGenericType(Type type) {
                return JAVA8.usedInGenericType(type);
            }

            /* Access modifiers changed, original: 0000 */
            public String typeName(Type type) {
                return JAVA8.typeName(type);
            }
        };
        
        static final JavaVersion CURRENT = null;

        /* Access modifiers changed, original: 0000 */
        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type type);

        public abstract Type usedInGenericType(Type type);

        /* Access modifiers changed, original: final */
        public final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            com.google.common.collect.ImmutableList.a sT = ImmutableList.sT();
            for (Type usedInGenericType : typeArr) {
                sT.aI(usedInGenericType(usedInGenericType));
            }
            return sT.sU();
        }

        /* Access modifiers changed, original: 0000 */
        public String typeName(Type type) {
            return Types.i(type);
        }
    }

    private static final class ParameterizedTypeImpl implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        private final Type ownerType;
        private final Class<?> rawType;

        ParameterizedTypeImpl(Type type, Class<?> cls, Type[] typeArr) {
            i.checkNotNull(cls);
            i.checkArgument(typeArr.length == cls.getTypeParameters().length);
            Types.a(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        public Type[] getActualTypeArguments() {
            return Types.s(this.argumentsList);
        }

        public Type getRawType() {
            return this.rawType;
        }

        public Type getOwnerType() {
            return this.ownerType;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.ownerType != null && JavaVersion.CURRENT.jdkTypeDuplicatesOwnerName()) {
                stringBuilder.append(JavaVersion.CURRENT.typeName(this.ownerType));
                stringBuilder.append('.');
            }
            stringBuilder.append(this.rawType.getName());
            stringBuilder.append('<');
            stringBuilder.append(Types.ZC.join(s.a(this.argumentsList, Types.ZB)));
            stringBuilder.append('>');
            return stringBuilder.toString();
        }

        public int hashCode() {
            Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (getRawType().equals(parameterizedType.getRawType()) && f.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                z = true;
            }
            return z;
        }
    }

    static final class WildcardTypeImpl implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.a(typeArr, "lower bound for wildcard");
            Types.a(typeArr2, "upper bound for wildcard");
            this.lowerBounds = JavaVersion.CURRENT.usedInGenericType(typeArr);
            this.upperBounds = JavaVersion.CURRENT.usedInGenericType(typeArr2);
        }

        public Type[] getLowerBounds() {
            return Types.s(this.lowerBounds);
        }

        public Type[] getUpperBounds() {
            return Types.s(this.upperBounds);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            Type type;
            StringBuilder stringBuilder = new StringBuilder("?");
            aj sK = this.lowerBounds.iterator();
            while (sK.hasNext()) {
                type = (Type) sK.next();
                stringBuilder.append(" super ");
                stringBuilder.append(JavaVersion.CURRENT.typeName(type));
            }
            for (Type type2 : Types.z(this.upperBounds)) {
                stringBuilder.append(" extends ");
                stringBuilder.append(JavaVersion.CURRENT.typeName(type2));
            }
            return stringBuilder.toString();
        }
    }

    static final class a<X> {
        static final boolean ZE = (a.class.getTypeParameters()[0].equals(Types.a((GenericDeclaration) a.class, "X", new Type[0])) ^ 1);

        a() {
        }
    }

    private static final class b<D extends GenericDeclaration> {
        private final D ZF;
        private final ImmutableList<Type> ZG;
        private final String name;

        b(D d, String str, Type[] typeArr) {
            Types.a(typeArr, "bound for type variable");
            this.ZF = (GenericDeclaration) i.checkNotNull(d);
            this.name = (String) i.checkNotNull(str);
            this.ZG = ImmutableList.f((Object[]) typeArr);
        }

        public D getGenericDeclaration() {
            return this.ZF;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }

        public int hashCode() {
            return this.ZF.hashCode() ^ this.name.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (a.ZE) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof c)) {
                    return false;
                }
                b a = ((c) Proxy.getInvocationHandler(obj)).ZI;
                if (!(this.name.equals(a.getName()) && this.ZF.equals(a.getGenericDeclaration()) && this.ZG.equals(a.ZG))) {
                    z = false;
                }
                return z;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!(this.name.equals(typeVariable.getName()) && this.ZF.equals(typeVariable.getGenericDeclaration()))) {
                    z = false;
                }
                return z;
            }
        }
    }

    private static final class c implements InvocationHandler {
        private static final ImmutableMap<String, Method> ZH;
        private final b<?> ZI;

        static {
            com.google.common.collect.ImmutableMap.a sX = ImmutableMap.sX();
            for (Method method : b.class.getMethods()) {
                if (method.getDeclaringClass().equals(b.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    sX.m(method.getName(), method);
                }
            }
            ZH = sX.tf();
        }

        c(b<?> bVar) {
            this.ZI = bVar;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            method = (Method) ZH.get(name);
            if (method != null) {
                try {
                    return method.invoke(this.ZI, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
            throw new UnsupportedOperationException(name);
        }
    }

    static Type newArrayType(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z = true;
        i.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return supertypeOf(newArrayType(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z = false;
        }
        i.checkArgument(z, "Wildcard should have only one upper bound.");
        return subtypeOf(newArrayType(upperBounds[0]));
    }

    static ParameterizedType a(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return a((Class) cls, typeArr);
        }
        i.checkNotNull(typeArr);
        i.a(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", (Object) cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    static ParameterizedType a(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    static <D extends GenericDeclaration> TypeVariable<D> a(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return b(d, str, typeArr);
    }

    static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static Type j(Type type) {
        i.checkNotNull(type);
        final AtomicReference atomicReference = new AtomicReference();
        new f() {
            /* Access modifiers changed, original: 0000 */
            public void a(TypeVariable<?> typeVariable) {
                atomicReference.set(Types.d(typeVariable.getBounds()));
            }

            /* Access modifiers changed, original: 0000 */
            public void b(WildcardType wildcardType) {
                atomicReference.set(Types.d(wildcardType.getUpperBounds()));
            }

            /* Access modifiers changed, original: 0000 */
            public void b(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            /* Access modifiers changed, original: 0000 */
            public void j(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }
        }.c(type);
        return (Type) atomicReference.get();
    }

    private static Type d(Type[] typeArr) {
        for (Type j : typeArr) {
            Type j2 = j(j2);
            if (j2 != null) {
                if (j2 instanceof Class) {
                    Class cls = (Class) j2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return subtypeOf(j2);
            }
        }
        return null;
    }

    private static <D extends GenericDeclaration> TypeVariable<D> b(D d, String str, Type[] typeArr) {
        return (TypeVariable) c.a(TypeVariable.class, new c(new b(d, str, typeArr)));
    }

    private static Type[] s(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    private static Iterable<Type> z(Iterable<Type> iterable) {
        return s.a((Iterable) iterable, Predicates.a(Predicates.ao(Object.class)));
    }

    private static void a(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Object obj = (Class) type;
                i.a(obj.isPrimitive() ^ 1, "Primitive type '%s' used as %s", obj, (Object) str);
            }
        }
    }

    static Class<?> o(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }
}
