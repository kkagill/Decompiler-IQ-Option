package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.c;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.a;
import kotlin.jvm.a.d;
import kotlin.jvm.a.e;
import kotlin.jvm.a.f;
import kotlin.jvm.a.g;
import kotlin.jvm.a.h;
import kotlin.jvm.a.l;
import kotlin.jvm.a.m;
import kotlin.jvm.a.n;
import kotlin.jvm.a.o;
import kotlin.jvm.a.p;
import kotlin.jvm.a.q;
import kotlin.jvm.a.r;
import kotlin.jvm.a.s;
import kotlin.jvm.a.t;
import kotlin.jvm.a.u;
import kotlin.jvm.a.v;
import kotlin.jvm.a.w;
import kotlin.jvm.internal.k;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010$\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u0002\"&\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\",\u0010\t\u001a \u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\",\u0010\n\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0002\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006&"}, bng = {"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"})
/* compiled from: reflectClassUtil.kt */
public final class b {
    private static final Map<Class<? extends Object>, Class<? extends Object>> fAA;
    private static final Map<Class<? extends Object>, Class<? extends Object>> fAB;
    private static final Map<Class<? extends c<?>>, Integer> fAC;
    private static final List<kotlin.reflect.b<? extends Object>> fAz;

    public static final ClassLoader Q(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "$this$safeClassLoader");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        classLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.i.e(classLoader, "ClassLoader.getSystemClassLoader()");
        return classLoader;
    }

    public static final boolean R(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "$this$isEnumClassOrSpecializedEnumEntryClass");
        return Enum.class.isAssignableFrom(cls);
    }

    static {
        r1 = new kotlin.reflect.b[8];
        int i = 0;
        r1[0] = k.G(Boolean.TYPE);
        r1[1] = k.G(Byte.TYPE);
        r1[2] = k.G(Character.TYPE);
        r1[3] = k.G(Double.TYPE);
        r1[4] = k.G(Float.TYPE);
        r1[5] = k.G(Integer.TYPE);
        r1[6] = k.G(Long.TYPE);
        r1[7] = k.G(Short.TYPE);
        fAz = m.listOf(r1);
        Iterable<kotlin.reflect.b> iterable = fAz;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (kotlin.reflect.b bVar : iterable) {
            arrayList.add(j.x(a.c(bVar), a.b(bVar)));
        }
        fAA = af.ac((List) arrayList);
        iterable = fAz;
        arrayList = new ArrayList(n.e(iterable, 10));
        for (kotlin.reflect.b bVar2 : iterable) {
            arrayList.add(j.x(a.b(bVar2), a.c(bVar2)));
        }
        fAB = af.ac((List) arrayList);
        Iterable listOf = m.listOf(kotlin.jvm.a.a.class, kotlin.jvm.a.b.class, m.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, kotlin.jvm.a.c.class, d.class, e.class, f.class, g.class, h.class, kotlin.jvm.a.i.class, kotlin.jvm.a.j.class, kotlin.jvm.a.k.class, l.class, n.class, o.class, p.class);
        Collection arrayList2 = new ArrayList(n.e(listOf, 10));
        for (Object next : listOf) {
            int i2 = i + 1;
            if (i < 0) {
                m.bno();
            }
            arrayList2.add(j.x((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        fAC = af.ac((List) arrayList2);
    }

    public static final Class<?> S(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "$this$primitiveByWrapper");
        return (Class) fAA.get(cls);
    }

    public static final Class<?> T(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "$this$wrapperByPrimitive");
        return (Class) fAB.get(cls);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.a U(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "$this$classId");
        StringBuilder stringBuilder;
        if (cls.isPrimitive()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't compute ClassId for primitive type: ");
            stringBuilder.append(cls);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (cls.isArray()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't compute ClassId for array type: ");
            stringBuilder.append(cls);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                kotlin.jvm.internal.i.e(simpleName, "simpleName");
                if ((((CharSequence) simpleName).length() == 0 ? 1 : null) == null) {
                    kotlin.reflect.jvm.internal.impl.name.a U;
                    Class declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null) {
                        U = U(declaringClass);
                        if (U != null) {
                            U = U.B(kotlin.reflect.jvm.internal.impl.name.f.ms(cls.getSimpleName()));
                            if (U != null) {
                                return U;
                            }
                        }
                    }
                    U = kotlin.reflect.jvm.internal.impl.name.a.s(new kotlin.reflect.jvm.internal.impl.name.b(cls.getName()));
                    kotlin.jvm.internal.i.e(U, "ClassId.topLevel(FqName(name))");
                    return U;
                }
            }
            kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(cls.getName());
            return new kotlin.reflect.jvm.internal.impl.name.a(bVar.bKb(), kotlin.reflect.jvm.internal.impl.name.b.E(bVar.bKc()), true);
        }
    }

    public static final String V(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "$this$desc");
        if (kotlin.jvm.internal.i.y(cls, Void.TYPE)) {
            return "V";
        }
        String name = W(cls).getName();
        kotlin.jvm.internal.i.e(name, "createArrayType().name");
        if (name != null) {
            String substring = name.substring(1);
            kotlin.jvm.internal.i.e(substring, "(this as java.lang.String).substring(startIndex)");
            return u.a(substring, '.', '/', false, 4, null);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public static final Class<?> W(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "$this$createArrayType");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final List<Type> l(Type type) {
        kotlin.jvm.internal.i.f(type, "$this$parameterizedTypeArguments");
        if (!(type instanceof ParameterizedType)) {
            return m.emptyList();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return n.f(n.e(l.a((Object) type, (kotlin.jvm.a.b) ReflectClassUtilKt$parameterizedTypeArguments$1.fAD), ReflectClassUtilKt$parameterizedTypeArguments$2.fAE));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.i.e(actualTypeArguments, "actualTypeArguments");
        return i.E(actualTypeArguments);
    }
}
