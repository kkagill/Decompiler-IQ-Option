package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1 extends Lambda implements b<n, b<? extends A, ? extends C>> {
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

    AbstractBinaryClassAnnotationAndConstantLoader$storage$1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader) {
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
        super(1);
    }

    /* renamed from: d */
    public final b<A, C> invoke(n nVar) {
        i.f(nVar, "kotlinClass");
        return this.this$0.c(nVar);
    }
}
