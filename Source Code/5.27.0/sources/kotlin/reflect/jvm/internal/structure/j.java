package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.m;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.structure.f.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020'H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000202018VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\t8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\f¨\u0006B"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructors", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "getConstructors", "()Ljava/util/List;", "element", "getElement", "()Ljava/lang/Class;", "fields", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "getFields", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "innerClassNames", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getInnerClassNames", "isAnnotationType", "", "()Z", "isEnum", "isInterface", "lightClassOriginKind", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "methods", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "getMethods", "modifiers", "", "getModifiers", "()I", "name", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "outerClass", "getOuterClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "supertypes", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "getSupertypes", "()Ljava/util/Collection;", "typeParameters", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "equals", "other", "", "findInnerClass", "hashCode", "isEnumValuesOrValueOf", "method", "Ljava/lang/reflect/Method;", "toString", "", "descriptors.runtime"})
/* compiled from: ReflectJavaClass.kt */
public final class j extends n implements g, f, t {
    private final Class<?> eYR;

    public LightClassOriginKind bxo() {
        return null;
    }

    /* renamed from: bOw */
    public List<c> getAnnotations() {
        return a.a(this);
    }

    public boolean bo() {
        return t.a.b(this);
    }

    public aw brx() {
        return t.a.d(this);
    }

    public boolean bxG() {
        return t.a.a(this);
    }

    public boolean bxH() {
        return t.a.c(this);
    }

    public boolean bxi() {
        return a.b(this);
    }

    /* renamed from: v */
    public c q(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "fqName");
        return a.a(this, bVar);
    }

    public j(Class<?> cls) {
        kotlin.jvm.internal.i.f(cls, "klass");
        this.eYR = cls;
    }

    /* renamed from: bQq */
    public Class<?> bQn() {
        return this.eYR;
    }

    public int getModifiers() {
        return this.eYR.getModifiers();
    }

    /* renamed from: bQr */
    public List<f> bxl() {
        Class[] declaredClasses = this.eYR.getDeclaredClasses();
        kotlin.jvm.internal.i.e(declaredClasses, "klass.declaredClasses");
        return n.f(n.g(n.c(i.I(declaredClasses), ReflectJavaClass$innerClassNames$1.fAM), ReflectJavaClass$innerClassNames$2.fAN));
    }

    public b btB() {
        b bJZ = b.U(this.eYR).bJZ();
        kotlin.jvm.internal.i.e(bJZ, "klass.classId.asSingleFqName()");
        return bJZ;
    }

    /* renamed from: bQs */
    public j bxm() {
        Class declaringClass = this.eYR.getDeclaringClass();
        return declaringClass != null ? new j(declaringClass) : null;
    }

    public Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.j> bup() {
        if (kotlin.jvm.internal.i.y(this.eYR, Object.class)) {
            return m.emptyList();
        }
        m mVar = new m(2);
        Object genericSuperclass = this.eYR.getGenericSuperclass();
        if (genericSuperclass == null) {
            genericSuperclass = Object.class;
        }
        mVar.add(genericSuperclass);
        Type[] genericInterfaces = this.eYR.getGenericInterfaces();
        kotlin.jvm.internal.i.e(genericInterfaces, "klass.genericInterfaces");
        mVar.dg(genericInterfaces);
        Iterable<Type> listOf = m.listOf((Type[]) mVar.toArray(new Type[mVar.size()]));
        Collection arrayList = new ArrayList(n.e(listOf, 10));
        for (Type lVar : listOf) {
            arrayList.add(new l(lVar));
        }
        return (List) arrayList;
    }

    /* renamed from: ajQ */
    public List<s> bxp() {
        Method[] declaredMethods = this.eYR.getDeclaredMethods();
        kotlin.jvm.internal.i.e(declaredMethods, "klass.declaredMethods");
        return n.f(n.f(n.b(i.I(declaredMethods), (kotlin.jvm.a.b) new ReflectJavaClass$methods$1(this)), ReflectJavaClass$methods$2.fAO));
    }

    private final boolean i(Method method) {
        String name = method.getName();
        if (name == null) {
            return false;
        }
        int hashCode = name.hashCode();
        if (hashCode != -823812830) {
            if (hashCode != 231605032 || !name.equals("valueOf")) {
                return false;
            }
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else if (!name.equals("values")) {
            return false;
        } else {
            Class[] parameterTypes = method.getParameterTypes();
            kotlin.jvm.internal.i.e(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ajD */
    public List<p> bxq() {
        Field[] declaredFields = this.eYR.getDeclaredFields();
        kotlin.jvm.internal.i.e(declaredFields, "klass.declaredFields");
        return n.f(n.f(n.b(i.I(declaredFields), (kotlin.jvm.a.b) ReflectJavaClass$fields$1.fAK), ReflectJavaClass$fields$2.fAL));
    }

    /* renamed from: brr */
    public List<m> brs() {
        Constructor[] declaredConstructors = this.eYR.getDeclaredConstructors();
        kotlin.jvm.internal.i.e(declaredConstructors, "klass.declaredConstructors");
        return n.f(n.f(n.b(i.I(declaredConstructors), (kotlin.jvm.a.b) ReflectJavaClass$constructors$1.fAI), ReflectJavaClass$constructors$2.fAJ));
    }

    public f bsZ() {
        f ms = f.ms(this.eYR.getSimpleName());
        kotlin.jvm.internal.i.e(ms, "Name.identifier(klass.simpleName)");
        return ms;
    }

    public List<x> bsM() {
        TypeVariable[] typeParameters = this.eYR.getTypeParameters();
        kotlin.jvm.internal.i.e(typeParameters, "klass.typeParameters");
        Collection arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable xVar : typeParameters) {
            arrayList.add(new x(xVar));
        }
        return (List) arrayList;
    }

    public boolean isInterface() {
        return this.eYR.isInterface();
    }

    public boolean bxn() {
        return this.eYR.isAnnotation();
    }

    public boolean isEnum() {
        return this.eYR.isEnum();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && kotlin.jvm.internal.i.y(this.eYR, ((j) obj).eYR);
    }

    public int hashCode() {
        return this.eYR.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(this.eYR);
        return stringBuilder.toString();
    }
}
