package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.structure.f.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "typeVariable", "Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/reflect/TypeVariable;)V", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "getTypeVariable", "()Ljava/lang/reflect/TypeVariable;", "upperBounds", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "getUpperBounds", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "toString", "", "descriptors.runtime"})
/* compiled from: ReflectJavaTypeParameter.kt */
public final class x extends n implements w, f {
    private final TypeVariable<?> fAW;

    /* renamed from: bOw */
    public List<c> getAnnotations() {
        return a.a(this);
    }

    public boolean bxi() {
        return a.b(this);
    }

    /* renamed from: v */
    public c q(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "fqName");
        return a.a(this, bVar);
    }

    public x(TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.i.f(typeVariable, "typeVariable");
        this.fAW = typeVariable;
    }

    /* renamed from: bod */
    public List<l> bxK() {
        Type[] bounds = this.fAW.getBounds();
        kotlin.jvm.internal.i.e(bounds, "typeVariable.bounds");
        Collection arrayList = new ArrayList(bounds.length);
        for (Type lVar : bounds) {
            arrayList.add(new l(lVar));
        }
        List list = (List) arrayList;
        l lVar2 = (l) u.bZ(list);
        return kotlin.jvm.internal.i.y(lVar2 != null ? lVar2.bQp() : null, Object.class) ? m.emptyList() : list;
    }

    public AnnotatedElement bQn() {
        TypeVariable typeVariable = this.fAW;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    public f bsZ() {
        f ms = f.ms(this.fAW.getName());
        kotlin.jvm.internal.i.e(ms, "Name.identifier(typeVariable.name)");
        return ms;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.i.y(this.fAW, ((x) obj).fAW);
    }

    public int hashCode() {
        return this.fAW.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(this.fAW);
        return stringBuilder.toString();
    }
}
