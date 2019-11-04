package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.b;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\u0010\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u0014²\u0006\u0014\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u0002²\u0006\u0014\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u0002"}, bng = {"createAnnotationInstance", "T", "", "annotationClass", "Ljava/lang/Class;", "values", "", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflect-api", "hashCode", "toString"})
/* compiled from: AnnotationConstructorCaller.kt */
public final class a {
    static final /* synthetic */ j[] anY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062,\u0010\u0007\u001a(\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b0\bH\n¢\u0006\u0004\b\t\u0010\n"}, bng = {"<anonymous>", "", "T", "<anonymous parameter 0>", "kotlin.jvm.PlatformType", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"})
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class a implements InvocationHandler {
        final /* synthetic */ Class $annotationClass;
        final /* synthetic */ Map $values;
        final /* synthetic */ AnnotationConstructorCallerKt$createAnnotationInstance$2 eYA;
        final /* synthetic */ d eYw;
        final /* synthetic */ j eYx;
        final /* synthetic */ d eYy;
        final /* synthetic */ j eYz;

        a(Class cls, d dVar, j jVar, d dVar2, j jVar2, AnnotationConstructorCallerKt$createAnnotationInstance$2 annotationConstructorCallerKt$createAnnotationInstance$2, Map map) {
            this.$annotationClass = cls;
            this.eYw = dVar;
            this.eYx = jVar;
            this.eYy = dVar2;
            this.eYz = jVar2;
            this.eYA = annotationConstructorCallerKt$createAnnotationInstance$2;
            this.$values = map;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            kotlin.jvm.internal.i.e(method, "method");
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                d dVar;
                j jVar;
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.$annotationClass;
                        }
                    } else if (name.equals("hashCode")) {
                        dVar = this.eYy;
                        jVar = this.eYz;
                        return dVar.getValue();
                    }
                } else if (name.equals("toString")) {
                    dVar = this.eYw;
                    jVar = this.eYx;
                    return dVar.getValue();
                }
            }
            if (kotlin.jvm.internal.i.y(name, "equals") && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(this.eYA.bP(i.B(objArr)));
            }
            if (this.$values.containsKey(name)) {
                return this.$values.get(name);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method is not supported: ");
            stringBuilder.append(method);
            stringBuilder.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            stringBuilder.append(i.E(objArr));
            stringBuilder.append(')');
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
    }

    static {
        r0 = new j[2];
        String str = "kotlin-reflect-api";
        r0[0] = k.a(new PropertyReference0Impl(k.d(a.class, str), "hashCode", "<v#0>"));
        r0[1] = k.a(new PropertyReference0Impl(k.d(a.class, str), "toString", "<v#1>"));
        anY = r0;
    }

    private static final Object b(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof b) {
            obj = kotlin.jvm.a.a((b) obj);
        } else if (obj instanceof Object[]) {
            Object obj2 = (Object[]) obj;
            if (obj2 instanceof Class[]) {
                return null;
            }
            if (!(obj2 instanceof b[])) {
                obj = obj2;
            } else if (obj != null) {
                b[] bVarArr = (b[]) obj;
                Collection arrayList = new ArrayList(bVarArr.length);
                for (b a : bVarArr) {
                    arrayList.add(kotlin.jvm.a.a(a));
                }
                obj = ((List) arrayList).toArray(new Class[0]);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            }
        }
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        return obj;
    }

    private static final Void a(int i, String str, Class<?> cls) {
        b G;
        String stringBuilder;
        if (kotlin.jvm.internal.i.y(cls, Class.class)) {
            G = k.G(b.class);
        } else if (cls.isArray() && kotlin.jvm.internal.i.y(cls.getComponentType(), Class.class)) {
            G = k.G(b[].class);
        } else {
            G = kotlin.jvm.a.F(cls);
        }
        if (kotlin.jvm.internal.i.y(G.bnD(), k.G(Object[].class).bnD())) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(G.bnD());
            stringBuilder2.append('<');
            Class componentType = kotlin.jvm.a.a(G).getComponentType();
            kotlin.jvm.internal.i.e(componentType, "kotlinClass.java.componentType");
            stringBuilder2.append(kotlin.jvm.a.F(componentType).bnD());
            stringBuilder2.append('>');
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = G.bnD();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Argument #");
        stringBuilder3.append(i);
        stringBuilder3.append(' ');
        stringBuilder3.append(str);
        stringBuilder3.append(" is not of the required type ");
        stringBuilder3.append(stringBuilder);
        throw new IllegalArgumentException(stringBuilder3.toString());
    }

    public static /* synthetic */ Object a(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Iterable<String> keySet = map.keySet();
            Collection arrayList = new ArrayList(n.e(keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list = (List) arrayList;
        }
        return a(cls, map, list);
    }

    public static final <T> T a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        kotlin.jvm.internal.i.f(cls, "annotationClass");
        kotlin.jvm.internal.i.f(map, "values");
        kotlin.jvm.internal.i.f(list, "methods");
        AnnotationConstructorCallerKt$createAnnotationInstance$2 annotationConstructorCallerKt$createAnnotationInstance$2 = new AnnotationConstructorCallerKt$createAnnotationInstance$2(cls, list, map);
        d c = g.c(new AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2(map));
        j jVar = anY[0];
        d c2 = g.c(new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(cls, map));
        j jVar2 = anY[1];
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls, c2, jVar2, c, jVar, annotationConstructorCallerKt$createAnnotationInstance$2, map));
        if (newProxyInstance != null) {
            return newProxyInstance;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }
}
