package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.TypeCastException;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends Lambda implements a<d> {
    final /* synthetic */ d this$0;

    DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(d dVar) {
        this.this$0 = dVar;
        super(0);
    }

    /* renamed from: bMQ */
    public final d invoke() {
        b p = this.this$0.p(AnonymousClass1.frF);
        if (p != null) {
            return (d) p;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
    }
}
