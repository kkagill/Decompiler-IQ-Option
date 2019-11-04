package com.google.common.reflect;

import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.i;
import com.google.common.collect.p;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public abstract class TypeToken<T> extends d<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    private transient e Zr;
    private transient e Zs;
    private final Type runtimeType;

    private static abstract class a<K> {
        static final a<TypeToken<?>> Zu = new a<TypeToken<?>>() {
            /* Access modifiers changed, original: 0000 */
            /* renamed from: c */
            public Class<?> bk(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            /* Access modifiers changed, original: 0000 */
            /* renamed from: d */
            public Iterable<? extends TypeToken<?>> bl(TypeToken<?> typeToken) {
                return typeToken.vj();
            }

            /* Access modifiers changed, original: 0000 */
            /* renamed from: e */
            public TypeToken<?> bm(TypeToken<?> typeToken) {
                return typeToken.vi();
            }
        };
        static final a<Class<?>> Zv = new a<Class<?>>() {
            /* Access modifiers changed, original: 0000 */
            /* renamed from: l */
            public Class<?> bk(Class<?> cls) {
                return cls;
            }

            /* Access modifiers changed, original: 0000 */
            /* renamed from: m */
            public Iterable<? extends Class<?>> bl(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* Access modifiers changed, original: 0000 */
            /* renamed from: n */
            public Class<?> bm(Class<?> cls) {
                return cls.getSuperclass();
            }
        };

        public abstract Class<?> bk(K k);

        public abstract Iterable<? extends K> bl(K k);

        public abstract K bm(K k);

        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final ImmutableList<K> bj(K k) {
            return y(ImmutableList.aJ(k));
        }

        /* Access modifiers changed, original: 0000 */
        public ImmutableList<K> y(Iterable<? extends K> iterable) {
            Map uk = Maps.uk();
            for (Object a : iterable) {
                a(a, uk);
            }
            return a(uk, Ordering.natural().reverse());
        }

        private int a(K k, Map<? super K, Integer> map) {
            Integer num = (Integer) map.get(k);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = bk(k).isInterface();
            for (Object a : bl(k)) {
                isInterface = Math.max(isInterface, a(a, (Map) map));
            }
            Object bm = bm(k);
            if (bm != null) {
                isInterface = Math.max(isInterface, a(bm, (Map) map));
            }
            isInterface++;
            map.put(k, Integer.valueOf(isInterface));
            return isInterface;
        }

        private static <K, V> ImmutableList<K> a(final Map<K, V> map, final Comparator<? super V> comparator) {
            return new Ordering<K>() {
                public int compare(K k, K k2) {
                    return comparator.compare(map.get(k), map.get(k2));
                }
            }.immutableSortedCopy(map.keySet());
        }
    }

    private enum TypeFilter implements j<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            public boolean apply(TypeToken<?> typeToken) {
                return ((typeToken.runtimeType instanceof TypeVariable) || (typeToken.runtimeType instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY {
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }
    }

    private static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        SimpleTypeToken(Type type) {
            super(type, null);
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$1 */
    class AnonymousClass1 extends a<T> {
        final /* synthetic */ TypeToken this$0;

        public TypeToken<T> vg() {
            return this.this$0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(vg());
            stringBuilder.append(".");
            stringBuilder.append(super.toString());
            return stringBuilder.toString();
        }
    }

    public class TypeSet extends p<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        private transient ImmutableSet<TypeToken<? super T>> Zy;

        TypeSet() {
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: su */
        public Set<TypeToken<? super T>> sv() {
            Set<TypeToken<? super T>> set = this.Zy;
            if (set != null) {
                return set;
            }
            ImmutableSet sD = i.b(a.Zu.bj(TypeToken.this)).b(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).sD();
            this.Zy = sD;
            return sD;
        }

        public Set<Class<? super T>> vn() {
            return ImmutableSet.n(a.Zv.y(TypeToken.this.vl()));
        }
    }

    /* synthetic */ TypeToken(Type type, AnonymousClass1 anonymousClass1) {
        this(type);
    }

    protected TypeToken() {
        this.runtimeType = vh();
        com.google.common.base.i.b(!(this.runtimeType instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", this.runtimeType);
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) com.google.common.base.i.checkNotNull(type);
    }

    public static <T> TypeToken<T> k(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    public static TypeToken<?> f(Type type) {
        return new SimpleTypeToken(type);
    }

    public final Class<? super T> getRawType() {
        return (Class) vl().iterator().next();
    }

    public final Type getType() {
        return this.runtimeType;
    }

    private TypeToken<?> g(Type type) {
        TypeToken f = f(vm().b(type));
        f.Zs = this.Zs;
        f.Zr = this.Zr;
        return f;
    }

    /* Access modifiers changed, original: final */
    public final TypeToken<? super T> vi() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return h(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        type = getRawType().getGenericSuperclass();
        if (type == null) {
            return null;
        }
        return g(type);
    }

    private TypeToken<? super T> h(Type type) {
        TypeToken<? super T> f = f(type);
        return f.getRawType().isInterface() ? null : f;
    }

    /* Access modifiers changed, original: final */
    public final ImmutableList<TypeToken<? super T>> vj() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return b(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return b(((WildcardType) type).getUpperBounds());
        }
        com.google.common.collect.ImmutableList.a sT = ImmutableList.sT();
        for (Type g : getRawType().getGenericInterfaces()) {
            sT.aI(g(g));
        }
        return sT.sU();
    }

    private ImmutableList<TypeToken<? super T>> b(Type[] typeArr) {
        com.google.common.collect.ImmutableList.a sT = ImmutableList.sT();
        for (Type f : typeArr) {
            TypeToken f2 = f(f);
            if (f2.getRawType().isInterface()) {
                sT.aI(f2);
            }
        }
        return sT.sU();
    }

    public final TypeSet vk() {
        return new TypeSet();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeToken)) {
            return false;
        }
        return this.runtimeType.equals(((TypeToken) obj).runtimeType);
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public String toString() {
        return Types.i(this.runtimeType);
    }

    /* Access modifiers changed, original: protected */
    public Object writeReplace() {
        return f(new e().b(this.runtimeType));
    }

    private ImmutableSet<Class<? super T>> vl() {
        final com.google.common.collect.ImmutableSet.a tp = ImmutableSet.tp();
        new f() {
            /* Access modifiers changed, original: 0000 */
            public void a(TypeVariable<?> typeVariable) {
                c(typeVariable.getBounds());
            }

            /* Access modifiers changed, original: 0000 */
            public void b(WildcardType wildcardType) {
                c(wildcardType.getUpperBounds());
            }

            /* Access modifiers changed, original: 0000 */
            public void b(ParameterizedType parameterizedType) {
                tp.aI((Class) parameterizedType.getRawType());
            }

            /* Access modifiers changed, original: 0000 */
            public void j(Class<?> cls) {
                tp.aI(cls);
            }

            /* Access modifiers changed, original: 0000 */
            public void b(GenericArrayType genericArrayType) {
                tp.aI(Types.o(TypeToken.f(genericArrayType.getGenericComponentType()).getRawType()));
            }
        }.c(this.runtimeType);
        return tp.tq();
    }

    private e vm() {
        e eVar = this.Zs;
        if (eVar != null) {
            return eVar;
        }
        eVar = e.a(this.runtimeType);
        this.Zs = eVar;
        return eVar;
    }
}
