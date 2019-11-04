package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;

/* compiled from: DescriptorRenderer.kt */
final class DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 extends Lambda implements b<g, l> {
    public static final DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 frA = new DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1();

    DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((g) obj);
        return l.eVB;
    }

    public final void a(g gVar) {
        i.f(gVar, "$receiver");
        gVar.a((a) a.b.frg);
        gVar.a(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
    }
}
