package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.renderer.a.a;

/* compiled from: DescriptorRenderer.kt */
final class DescriptorRenderer$Companion$DEBUG_TEXT$1 extends Lambda implements b<g, l> {
    public static final DescriptorRenderer$Companion$DEBUG_TEXT$1 frw = new DescriptorRenderer$Companion$DEBUG_TEXT$1();

    DescriptorRenderer$Companion$DEBUG_TEXT$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        a((g) obj);
        return l.eVB;
    }

    public final void a(g gVar) {
        i.f(gVar, "$receiver");
        gVar.gR(true);
        gVar.a((a) a.frf);
        gVar.p(DescriptorRendererModifier.ALL);
    }
}
