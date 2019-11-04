package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaAnnotationDescriptor$type$2 extends Lambda implements a<ad> {
    final /* synthetic */ h $c;
    final /* synthetic */ b this$0;

    JavaAnnotationDescriptor$type$2(b bVar, h hVar) {
        this.this$0 = bVar;
        this.$c = hVar;
        super(0);
    }

    /* renamed from: bsD */
    public final ad invoke() {
        d c = this.$c.bql().btw().c(this.this$0.btB());
        i.e(c, "c.module.builtIns.getBuiltInClassByFqName(fqName)");
        return c.bsY();
    }
}
