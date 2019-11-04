package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaConstructor;", "member", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getMember", "()Ljava/lang/reflect/Constructor;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"})
/* compiled from: ReflectJavaConstructor.kt */
public final class m extends r implements k {
    private final Constructor<?> fAQ;

    public m(Constructor<?> constructor) {
        kotlin.jvm.internal.i.f(constructor, "member");
        this.fAQ = constructor;
    }

    /* renamed from: bQt */
    public Constructor<?> bpY() {
        return this.fAQ;
    }

    public List<y> bsP() {
        Object genericParameterTypes = bpY().getGenericParameterTypes();
        kotlin.jvm.internal.i.e(genericParameterTypes, "types");
        if ((genericParameterTypes.length == 0 ? 1 : null) != null) {
            return m.emptyList();
        }
        Class declaringClass = bpY().getDeclaringClass();
        kotlin.jvm.internal.i.e(declaringClass, "klass");
        if (!(declaringClass.getDeclaringClass() == null || Modifier.isStatic(declaringClass.getModifiers()))) {
            genericParameterTypes = (Type[]) h.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Object parameterAnnotations = bpY().getParameterAnnotations();
        Object[] objArr = (Object[]) parameterAnnotations;
        if (objArr.length >= genericParameterTypes.length) {
            if (objArr.length > genericParameterTypes.length) {
                kotlin.jvm.internal.i.e(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) h.copyOfRange(objArr, objArr.length - genericParameterTypes.length, objArr.length);
            }
            kotlin.jvm.internal.i.e(genericParameterTypes, "realTypes");
            kotlin.jvm.internal.i.e(parameterAnnotations, "realAnnotations");
            return a(genericParameterTypes, parameterAnnotations, bpY().isVarArgs());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal generic signature: ");
        stringBuilder.append(bpY());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public List<x> bsM() {
        TypeVariable[] typeParameters = bpY().getTypeParameters();
        kotlin.jvm.internal.i.e(typeParameters, "member.typeParameters");
        Collection arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable xVar : typeParameters) {
            arrayList.add(new x(xVar));
        }
        return (List) arrayList;
    }
}
