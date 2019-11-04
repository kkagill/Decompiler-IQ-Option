package kotlin.reflect.jvm.internal.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n.e;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001H\u0002J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u001a\u0010\u0018\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0006H\u0002¨\u0006\u001b"}, bng = {"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "()V", "loadClassAnnotations", "", "klass", "Ljava/lang/Class;", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "loadConstructorAnnotations", "memberVisitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "loadFieldAnnotations", "loadMethodAnnotations", "processAnnotation", "annotation", "", "processAnnotationArgumentValue", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationArgumentVisitor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "processAnnotationArguments", "annotationType", "visitMembers", "classLiteralValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ClassLiteralValue;", "descriptors.runtime"})
/* compiled from: ReflectKotlinClass.kt */
final class b {
    public static final b eYP = new b();

    private b() {
    }

    public final void a(Class<?> cls, c cVar) {
        kotlin.jvm.internal.i.f(cls, "klass");
        kotlin.jvm.internal.i.f(cVar, "visitor");
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            kotlin.jvm.internal.i.e(annotation, "annotation");
            a(cVar, annotation);
        }
        cVar.byq();
    }

    public final void a(Class<?> cls, d dVar) {
        kotlin.jvm.internal.i.f(cls, "klass");
        kotlin.jvm.internal.i.f(dVar, "memberVisitor");
        b(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }

    private final void b(Class<?> cls, d dVar) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method[] methodArr;
            Object obj = declaredMethods[i];
            kotlin.jvm.internal.i.e(obj, "method");
            f ms = f.ms(obj.getName());
            kotlin.jvm.internal.i.e(ms, "Name.identifier(method.name)");
            e a = dVar.a(ms, m.eZf.h(obj));
            if (a != null) {
                String str;
                Annotation[] declaredAnnotations = obj.getDeclaredAnnotations();
                int length2 = declaredAnnotations.length;
                int i2 = 0;
                while (true) {
                    str = "annotation";
                    if (i2 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i2];
                    c cVar = a;
                    kotlin.jvm.internal.i.e(annotation, str);
                    a(cVar, annotation);
                    i2++;
                }
                Annotation[][] parameterAnnotations = obj.getParameterAnnotations();
                kotlin.jvm.internal.i.e(parameterAnnotations, "method.parameterAnnotations");
                int length3 = parameterAnnotations.length;
                for (length2 = 0; length2 < length3; length2++) {
                    Annotation[] annotationArr = parameterAnnotations[length2];
                    int length4 = annotationArr.length;
                    int i3 = 0;
                    while (i3 < length4) {
                        Annotation annotation2 = annotationArr[i3];
                        Class a2 = a.a(a.a(annotation2));
                        kotlin.reflect.jvm.internal.impl.name.a U = kotlin.reflect.jvm.internal.structure.b.U(a2);
                        methodArr = declaredMethods;
                        kotlin.jvm.internal.i.e(annotation2, str);
                        n.a a3 = a.a(length2, U, new a(annotation2));
                        if (a3 != null) {
                            eYP.a(a3, annotation2, a2);
                        }
                        i3++;
                        declaredMethods = methodArr;
                    }
                    methodArr = declaredMethods;
                }
                methodArr = declaredMethods;
                a.byq();
            } else {
                methodArr = declaredMethods;
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    private final void c(Class<?> cls, d dVar) {
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (i < length) {
            Constructor[] constructorArr;
            int i2;
            Object obj = declaredConstructors[i];
            f mu = f.mu("<init>");
            kotlin.jvm.internal.i.e(mu, "Name.special(\"<init>\")");
            m mVar = m.eZf;
            kotlin.jvm.internal.i.e(obj, "constructor");
            e a = dVar.a(mu, mVar.a(obj));
            if (a != null) {
                String str;
                Annotation[] declaredAnnotations = obj.getDeclaredAnnotations();
                int length2 = declaredAnnotations.length;
                int i3 = 0;
                while (true) {
                    str = "annotation";
                    if (i3 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i3];
                    c cVar = a;
                    kotlin.jvm.internal.i.e(annotation, str);
                    a(cVar, annotation);
                    i3++;
                }
                Annotation[][] parameterAnnotations = obj.getParameterAnnotations();
                kotlin.jvm.internal.i.e(parameterAnnotations, "parameterAnnotations");
                Object[] objArr = (Object[]) parameterAnnotations;
                if (((objArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                    int length3 = obj.getParameterTypes().length - objArr.length;
                    length2 = parameterAnnotations.length;
                    for (i3 = 0; i3 < length2; i3++) {
                        int i4;
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        int length4 = annotationArr.length;
                        int i5 = 0;
                        while (i5 < length4) {
                            Annotation annotation2 = annotationArr[i5];
                            Class a2 = a.a(a.a(annotation2));
                            constructorArr = declaredConstructors;
                            int i6 = i3 + length3;
                            i2 = length;
                            kotlin.reflect.jvm.internal.impl.name.a U = kotlin.reflect.jvm.internal.structure.b.U(a2);
                            i4 = length3;
                            kotlin.jvm.internal.i.e(annotation2, str);
                            n.a a3 = a.a(i6, U, new a(annotation2));
                            if (a3 != null) {
                                eYP.a(a3, annotation2, a2);
                            }
                            i5++;
                            declaredConstructors = constructorArr;
                            length = i2;
                            length3 = i4;
                        }
                        constructorArr = declaredConstructors;
                        i2 = length;
                        i4 = length3;
                    }
                }
                constructorArr = declaredConstructors;
                i2 = length;
                a.byq();
            } else {
                constructorArr = declaredConstructors;
                i2 = length;
            }
            i++;
            declaredConstructors = constructorArr;
            length = i2;
        }
    }

    private final void d(Class<?> cls, d dVar) {
        for (Object obj : cls.getDeclaredFields()) {
            kotlin.jvm.internal.i.e(obj, "field");
            f ms = f.ms(obj.getName());
            kotlin.jvm.internal.i.e(ms, "Name.identifier(field.name)");
            c a = dVar.a(ms, m.eZf.c(obj), null);
            if (a != null) {
                for (Annotation annotation : obj.getDeclaredAnnotations()) {
                    kotlin.jvm.internal.i.e(annotation, "annotation");
                    a(a, annotation);
                }
                a.byq();
            }
        }
    }

    private final void a(c cVar, Annotation annotation) {
        Class a = a.a(a.a(annotation));
        n.a a2 = cVar.a(kotlin.reflect.jvm.internal.structure.b.U(a), new a(annotation));
        if (a2 != null) {
            eYP.a(a2, annotation, a);
        }
    }

    private final void a(n.a aVar, Annotation annotation, Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                if (invoke == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(method, "method");
                f ms = f.ms(method.getName());
                kotlin.jvm.internal.i.e(ms, "Name.identifier(method.name)");
                a(aVar, ms, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.byq();
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.f N(Class<?> cls) {
        Class cls2;
        int i = 0;
        while (cls2.isArray()) {
            i++;
            cls2 = cls2.getComponentType();
            kotlin.jvm.internal.i.e(cls2, "currentClass.componentType");
        }
        kotlin.reflect.jvm.internal.impl.name.a U;
        kotlin.reflect.jvm.internal.impl.name.a e;
        if (!cls2.isPrimitive()) {
            U = kotlin.reflect.jvm.internal.structure.b.U(cls2);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.fca;
            kotlin.reflect.jvm.internal.impl.name.b bJZ = U.bJZ();
            kotlin.jvm.internal.i.e(bJZ, "javaClassId.asSingleFqName()");
            e = cVar.e(bJZ);
            if (e != null) {
                U = e;
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(U, i);
        } else if (kotlin.jvm.internal.i.y(cls2, Void.TYPE)) {
            e = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.eZH.bKf());
            kotlin.jvm.internal.i.e(e, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(e, i);
        } else {
            JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(cls2.getName());
            kotlin.jvm.internal.i.e(jvmPrimitiveType, "JvmPrimitiveType.get(currentClass.name)");
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            kotlin.jvm.internal.i.e(primitiveType, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
            if (i > 0) {
                U = kotlin.reflect.jvm.internal.impl.name.a.s(primitiveType.getArrayTypeFqName());
                kotlin.jvm.internal.i.e(U, "ClassId.topLevel(primitiveType.arrayTypeFqName)");
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(U, i - 1);
            }
            U = kotlin.reflect.jvm.internal.impl.name.a.s(primitiveType.getTypeFqName());
            kotlin.jvm.internal.i.e(U, "ClassId.topLevel(primitiveType.typeFqName)");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(U, i);
        }
    }

    private final void a(n.a aVar, f fVar, Object obj) {
        Object obj2 = obj.getClass();
        String str = "null cannot be cast to non-null type java.lang.Class<*>";
        if (kotlin.jvm.internal.i.y(obj2, Class.class)) {
            if (obj != null) {
                aVar.a(fVar, N((Class) obj));
            } else {
                throw new TypeCastException(str);
            }
        } else if (h.eYU.contains(obj2)) {
            aVar.a(fVar, obj);
        } else {
            String str2 = "null cannot be cast to non-null type kotlin.Enum<*>";
            if (kotlin.reflect.jvm.internal.structure.b.R(obj2)) {
                if (!obj2.isEnum()) {
                    obj2 = obj2.getEnclosingClass();
                }
                kotlin.jvm.internal.i.e(obj2, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
                kotlin.reflect.jvm.internal.impl.name.a U = kotlin.reflect.jvm.internal.structure.b.U(obj2);
                if (obj != null) {
                    f ms = f.ms(((Enum) obj).name());
                    kotlin.jvm.internal.i.e(ms, "Name.identifier((value as Enum<*>).name)");
                    aVar.a(fVar, U, ms);
                } else {
                    throw new TypeCastException(str2);
                }
            } else if (Annotation.class.isAssignableFrom(obj2)) {
                Class[] interfaces = obj2.getInterfaces();
                kotlin.jvm.internal.i.e(interfaces, "clazz.interfaces");
                Class cls = (Class) i.B(interfaces);
                kotlin.jvm.internal.i.e(cls, "annotationClass");
                aVar = aVar.a(fVar, kotlin.reflect.jvm.internal.structure.b.U(cls));
                if (aVar == null) {
                    return;
                }
                if (obj != null) {
                    a(aVar, (Annotation) obj, cls);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Annotation");
                }
            } else if (obj2.isArray()) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.n.b A = aVar.A(fVar);
                if (A != null) {
                    Class componentType = obj2.getComponentType();
                    kotlin.jvm.internal.i.e(componentType, "componentType");
                    String str3 = "null cannot be cast to non-null type kotlin.Array<*>";
                    int i = 0;
                    Object[] objArr;
                    int length;
                    if (componentType.isEnum()) {
                        kotlin.reflect.jvm.internal.impl.name.a U2 = kotlin.reflect.jvm.internal.structure.b.U(componentType);
                        if (obj != null) {
                            objArr = (Object[]) obj;
                            int length2 = objArr.length;
                            while (i < length2) {
                                Object obj3 = objArr[i];
                                if (obj3 != null) {
                                    f ms2 = f.ms(((Enum) obj3).name());
                                    kotlin.jvm.internal.i.e(ms2, "Name.identifier((element as Enum<*>).name)");
                                    A.b(U2, ms2);
                                    i++;
                                } else {
                                    throw new TypeCastException(str2);
                                }
                            }
                        }
                        throw new TypeCastException(str3);
                    } else if (kotlin.jvm.internal.i.y(componentType, Class.class)) {
                        if (obj != null) {
                            objArr = (Object[]) obj;
                            length = objArr.length;
                            while (i < length) {
                                obj2 = objArr[i];
                                if (obj2 != null) {
                                    A.a(N((Class) obj2));
                                    i++;
                                } else {
                                    throw new TypeCastException(str);
                                }
                            }
                        }
                        throw new TypeCastException(str3);
                    } else if (obj != null) {
                        objArr = (Object[]) obj;
                        length = objArr.length;
                        while (i < length) {
                            A.dE(objArr[i]);
                            i++;
                        }
                    } else {
                        throw new TypeCastException(str3);
                    }
                    A.byq();
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported annotation argument value (");
                stringBuilder.append(obj2);
                stringBuilder.append("): ");
                stringBuilder.append(obj);
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
    }
}
