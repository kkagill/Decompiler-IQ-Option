package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: RuntimeTypeMapper.kt */
final class JvmFunctionSignature$JavaConstructor$asString$1 extends Lambda implements b<Class<?>, String> {
    public static final JvmFunctionSignature$JavaConstructor$asString$1 eWF = new JvmFunctionSignature$JavaConstructor$asString$1();

    JvmFunctionSignature$JavaConstructor$asString$1() {
        super(1);
    }

    /* renamed from: H */
    public final String invoke(Class<?> cls) {
        kotlin.jvm.internal.i.e(cls, "it");
        return kotlin.reflect.jvm.internal.structure.b.V(cls);
    }
}
