package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: BuiltInAnnotationDescriptor.kt */
final class BuiltInAnnotationDescriptor$type$2 extends Lambda implements a<ad> {
    final /* synthetic */ i this$0;

    BuiltInAnnotationDescriptor$type$2(i iVar) {
        this.this$0 = iVar;
        super(0);
    }

    /* renamed from: bsD */
    public final ad invoke() {
        d c = this.this$0.fdE.c(this.this$0.btB());
        i.e(c, "builtIns.getBuiltInClassByFqName(fqName)");
        return c.bsY();
    }
}
