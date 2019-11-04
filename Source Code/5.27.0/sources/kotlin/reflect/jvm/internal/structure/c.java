package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b;
import kotlin.reflect.jvm.internal.impl.name.f;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "arguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "getArguments", "()Ljava/util/Collection;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "equals", "", "other", "", "hashCode", "", "resolve", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "toString", "", "descriptors.runtime"})
/* compiled from: ReflectJavaAnnotation.kt */
public final class c extends n implements a {
    private final Annotation eYO;

    public c(Annotation annotation) {
        kotlin.jvm.internal.i.f(annotation, "annotation");
        this.eYO = annotation;
    }

    public final Annotation bqh() {
        return this.eYO;
    }

    public Collection<b> bxf() {
        Method[] declaredMethods = kotlin.jvm.a.a(kotlin.jvm.a.a(this.eYO)).getDeclaredMethods();
        kotlin.jvm.internal.i.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        Collection arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            d.a aVar = d.fAF;
            Object invoke = method.invoke(this.eYO, new Object[0]);
            kotlin.jvm.internal.i.e(invoke, "method.invoke(annotation)");
            kotlin.jvm.internal.i.e(method, "method");
            arrayList.add(aVar.a(invoke, f.ms(method.getName())));
        }
        return (List) arrayList;
    }

    public kotlin.reflect.jvm.internal.impl.name.a getClassId() {
        return b.U(kotlin.jvm.a.a(kotlin.jvm.a.a(this.eYO)));
    }

    /* renamed from: bQm */
    public j bxg() {
        return new j(kotlin.jvm.a.a(kotlin.jvm.a.a(this.eYO)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && kotlin.jvm.internal.i.y(this.eYO, ((c) obj).eYO);
    }

    public int hashCode() {
        return this.eYO.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(this.eYO);
        return stringBuilder.toString();
    }
}
