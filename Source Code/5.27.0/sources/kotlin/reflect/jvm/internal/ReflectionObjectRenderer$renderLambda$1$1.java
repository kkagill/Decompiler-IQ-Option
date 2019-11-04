package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.types.w;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ReflectionObjectRenderer.kt */
final class ReflectionObjectRenderer$renderLambda$1$1 extends Lambda implements b<ar, String> {
    public static final ReflectionObjectRenderer$renderLambda$1$1 eYl = new ReflectionObjectRenderer$renderLambda$1$1();

    ReflectionObjectRenderer$renderLambda$1$1() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(ar arVar) {
        z zVar = z.eYj;
        kotlin.jvm.internal.i.e(arVar, "it");
        w bpT = arVar.bpT();
        kotlin.jvm.internal.i.e(bpT, "it.type");
        return zVar.b(bpT);
    }
}
