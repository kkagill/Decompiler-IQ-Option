package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.load.java.structure.f;
import kotlin.reflect.jvm.internal.structure.w.a;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "componentType", "getComponentType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReflectType", "()Ljava/lang/reflect/Type;", "descriptors.runtime"})
/* compiled from: ReflectJavaArrayType.kt */
public final class i extends w implements f {
    private final w fAG;
    private final Type fAH;

    public i(Type type) {
        w m;
        kotlin.jvm.internal.i.f(type, "reflectType");
        this.fAH = type;
        type = bQp();
        a aVar;
        if (type instanceof GenericArrayType) {
            aVar = w.fAV;
            type = ((GenericArrayType) type).getGenericComponentType();
            kotlin.jvm.internal.i.e(type, "genericComponentType");
            m = aVar.m(type);
        } else {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    aVar = w.fAV;
                    cls = cls.getComponentType();
                    kotlin.jvm.internal.i.e(cls, "getComponentType()");
                    m = aVar.m(cls);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Not an array type (");
            stringBuilder.append(bQp().getClass());
            stringBuilder.append("): ");
            stringBuilder.append(bQp());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.fAG = m;
    }

    /* Access modifiers changed, original: protected */
    public Type bQp() {
        return this.fAH;
    }

    /* renamed from: bQo */
    public w bxk() {
        return this.fAG;
    }
}
