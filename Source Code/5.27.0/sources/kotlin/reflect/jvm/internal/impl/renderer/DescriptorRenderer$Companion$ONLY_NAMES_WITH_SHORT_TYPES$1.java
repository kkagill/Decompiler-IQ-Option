package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;

/* compiled from: DescriptorRenderer.kt */
final class DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 extends Lambda implements b<g, l> {
    public static final DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 frz = new DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1();

    DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((g) obj);
        return l.eVB;
    }

    public final void a(g gVar) {
        i.f(gVar, "$receiver");
        gVar.gW(false);
        gVar.p(al.emptySet());
        gVar.a((a) a.b.frg);
        gVar.gY(true);
        gVar.a(ParameterNameRenderingPolicy.NONE);
        gVar.gS(true);
        gVar.gT(true);
        gVar.gX(true);
        gVar.gU(true);
    }
}
