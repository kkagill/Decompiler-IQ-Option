package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$renderSuperTypes$1 extends Lambda implements b<w, String> {
    final /* synthetic */ d this$0;

    DescriptorRendererImpl$renderSuperTypes$1(d dVar) {
        this.this$0 = dVar;
        super(1);
    }

    /* renamed from: ak */
    public final String invoke(w wVar) {
        d dVar = this.this$0;
        i.e(wVar, "it");
        return dVar.b(wVar);
    }
}
