package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$renderConstant$1 extends Lambda implements b<g<?>, String> {
    final /* synthetic */ d this$0;

    DescriptorRendererImpl$renderConstant$1(d dVar) {
        this.this$0 = dVar;
        super(1);
    }

    /* renamed from: d */
    public final String invoke(g<?> gVar) {
        i.f(gVar, "it");
        return this.this$0.c(gVar);
    }
}
