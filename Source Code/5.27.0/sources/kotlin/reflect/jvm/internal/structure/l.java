package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.v;
import kotlin.reflect.jvm.internal.impl.name.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/Collection;", "classifier", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifier;", "getClassifier", "()Lorg/jetbrains/kotlin/load/java/structure/JavaClassifier;", "classifierQualifiedName", "", "getClassifierQualifiedName", "()Ljava/lang/String;", "isDeprecatedInJavaDoc", "", "()Z", "isRaw", "presentableText", "getPresentableText", "getReflectType", "()Ljava/lang/reflect/Type;", "typeArguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "getTypeArguments", "()Ljava/util/List;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"})
/* compiled from: ReflectJavaClassifierType.kt */
public final class l extends w implements j {
    private final Type fAH;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.i fAP;

    public boolean bxi() {
        return false;
    }

    public a q(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "fqName");
        return null;
    }

    public l(Type type) {
        kotlin.reflect.jvm.internal.impl.load.java.structure.i jVar;
        kotlin.jvm.internal.i.f(type, "reflectType");
        this.fAH = type;
        type = bQp();
        if (type instanceof Class) {
            jVar = new j((Class) type);
        } else if (type instanceof TypeVariable) {
            jVar = new x((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
            if (type != null) {
                jVar = new j((Class) type);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not a classifier type (");
            stringBuilder.append(type.getClass());
            stringBuilder.append("): ");
            stringBuilder.append(type);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.fAP = jVar;
    }

    public Type bQp() {
        return this.fAH;
    }

    public kotlin.reflect.jvm.internal.impl.load.java.structure.i bxs() {
        return this.fAP;
    }

    public String bxv() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type not found: ");
        stringBuilder.append(bQp());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public String bxw() {
        return bQp().toString();
    }

    public boolean bxu() {
        Type bQp = bQp();
        if (!(bQp instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) bQp).getTypeParameters();
        kotlin.jvm.internal.i.e(typeParameters, "getTypeParameters()");
        return ((typeParameters.length == 0 ? 1 : 0) ^ 1) != 0;
    }

    public List<v> bxt() {
        Iterable<Type> l = b.l(bQp());
        w.a aVar = w.fAV;
        Collection arrayList = new ArrayList(n.e(l, 10));
        for (Type m : l) {
            arrayList.add(aVar.m(m));
        }
        return (List) arrayList;
    }

    public Collection<a> getAnnotations() {
        return m.emptyList();
    }
}
