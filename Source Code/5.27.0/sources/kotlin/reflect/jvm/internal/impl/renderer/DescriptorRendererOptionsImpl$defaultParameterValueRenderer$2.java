package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;

/* compiled from: DescriptorRendererOptionsImpl.kt */
final class DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 extends Lambda implements b<ar, String> {
    public static final DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 fsD = new DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2();

    DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(ar arVar) {
        i.f(arVar, "it");
        return "...";
    }
}
