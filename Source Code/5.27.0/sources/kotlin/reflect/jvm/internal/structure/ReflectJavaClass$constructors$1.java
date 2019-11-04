package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Constructor;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "constructor", "Ljava/lang/reflect/Constructor;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ReflectJavaClass.kt */
final class ReflectJavaClass$constructors$1 extends Lambda implements b<Constructor<?>, Boolean> {
    public static final ReflectJavaClass$constructors$1 fAI = new ReflectJavaClass$constructors$1();

    ReflectJavaClass$constructors$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(b((Constructor) obj));
    }

    public final boolean b(Constructor<?> constructor) {
        kotlin.jvm.internal.i.e(constructor, "constructor");
        return constructor.isSynthetic() ^ 1;
    }
}
