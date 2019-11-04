package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
final class LazyJavaAnnotationDescriptor$type$2 extends Lambda implements a<ad> {
    final /* synthetic */ e this$0;

    LazyJavaAnnotationDescriptor$type$2(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    /* renamed from: bsD */
    public final ad invoke() {
        b btB = this.this$0.btB();
        if (btB != null) {
            i.e(btB, "fqName ?: return@createL…fqName: $javaAnnotation\")");
            d a = c.a(c.fca, btB, this.this$0.fiV.bql().btw(), null, 4, null);
            if (a == null) {
                g bxg = this.this$0.fju.bxg();
                a = bxg != null ? this.this$0.fiV.bwl().bvY().b(bxg) : null;
            }
            if (a == null) {
                a = this.this$0.p(btB);
            }
            return a.bsY();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No fqName: ");
        stringBuilder.append(this.this$0.fju);
        return p.mK(stringBuilder.toString());
    }
}
