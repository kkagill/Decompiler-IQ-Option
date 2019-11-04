package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.load.java.structure.p;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.name.h;
import kotlin.reflect.jvm.internal.structure.f.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0\"2\u0006\u0010&\u001a\u00020\u001bH\u0004¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;", "()V", "containingClass", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "getContainingClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "member", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "modifiers", "", "getModifiers", "()I", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "equals", "", "other", "", "getValueParameters", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "isVararg", "([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;", "hashCode", "toString", "", "descriptors.runtime"})
/* compiled from: ReflectJavaMember.kt */
public abstract class r extends n implements p, f, t {
    public abstract Member bpY();

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

    public AnnotatedElement bQn() {
        Member bpY = bpY();
        if (bpY != null) {
            return (AnnotatedElement) bpY;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    public int getModifiers() {
        return bpY().getModifiers();
    }

    public f bsZ() {
        f ms;
        String name = bpY().getName();
        if (name != null) {
            ms = f.ms(name);
            if (ms != null) {
                return ms;
            }
        }
        ms = h.fpy;
        kotlin.jvm.internal.i.e(ms, "SpecialNames.NO_NAME_PROVIDED");
        return ms;
    }

    /* renamed from: bQw */
    public j bxC() {
        Class declaringClass = bpY().getDeclaringClass();
        kotlin.jvm.internal.i.e(declaringClass, "member.declaringClass");
        return new j(declaringClass);
    }

    /* Access modifiers changed, original: protected|final */
    public final List<y> a(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        kotlin.jvm.internal.i.f(typeArr, "parameterTypes");
        kotlin.jvm.internal.i.f(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List b = a.fAw.b(bpY());
        int size = b != null ? b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            String str;
            w m = w.fAV.m(typeArr[i]);
            if (b != null) {
                str = (String) u.h(b, i + size);
                if (str == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No parameter with index ");
                    stringBuilder.append(i);
                    stringBuilder.append('+');
                    stringBuilder.append(size);
                    stringBuilder.append(" (name=");
                    stringBuilder.append(bsZ());
                    stringBuilder.append(" type=");
                    stringBuilder.append(m);
                    stringBuilder.append(") in ");
                    stringBuilder.append(b);
                    stringBuilder.append("@ReflectJavaMember");
                    throw new IllegalStateException(stringBuilder.toString().toString());
                }
            }
            str = null;
            boolean z2 = z && i == i.D(typeArr);
            arrayList.add(new y(m, annotationArr[i], str, z2));
            i++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && kotlin.jvm.internal.i.y(bpY(), ((r) obj).bpY());
    }

    public int hashCode() {
        return bpY().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(bpY());
        return stringBuilder.toString();
    }
}
