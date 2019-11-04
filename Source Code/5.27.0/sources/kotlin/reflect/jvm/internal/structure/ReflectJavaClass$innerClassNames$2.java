package kotlin.reflect.jvm.internal.structure;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.f;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ReflectJavaClass.kt */
final class ReflectJavaClass$innerClassNames$2 extends Lambda implements b<Class<?>, f> {
    public static final ReflectJavaClass$innerClassNames$2 fAN = new ReflectJavaClass$innerClassNames$2();

    ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    /* renamed from: Y */
    public final f invoke(Class<?> cls) {
        kotlin.jvm.internal.i.e(cls, "it");
        String simpleName = cls.getSimpleName();
        if (!f.mt(simpleName)) {
            simpleName = null;
        }
        return simpleName != null ? f.ms(simpleName) : null;
    }
}
