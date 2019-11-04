package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorRendererImpl.kt */
final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements b<ap, CharSequence> {
    final /* synthetic */ d this$0;

    DescriptorRendererImpl$appendTypeProjections$1(d dVar) {
        this.this$0 = dVar;
        super(1);
    }

    /* renamed from: b */
    public final CharSequence invoke(ap apVar) {
        i.f(apVar, "it");
        if (apVar.bPC()) {
            return "*";
        }
        d dVar = this.this$0;
        w bpT = apVar.bpT();
        i.e(bpT, "it.type");
        String b = dVar.b(bpT);
        if (apVar.bPD() != Variance.INVARIANT) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(apVar.bPD());
            stringBuilder.append(' ');
            stringBuilder.append(b);
            b = stringBuilder.toString();
        }
        return b;
    }
}
