package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$resolveProperty$1 extends Lambda implements a<g<?>> {
    final /* synthetic */ n $field;
    final /* synthetic */ z $propertyDescriptor;
    final /* synthetic */ k this$0;

    LazyJavaScope$resolveProperty$1(k kVar, n nVar, z zVar) {
        this.this$0 = kVar;
        this.$field = nVar;
        this.$propertyDescriptor = zVar;
        super(0);
    }

    /* renamed from: bwT */
    public final g<?> invoke() {
        return this.this$0.bwP().bwl().bvW().a(this.$field, this.$propertyDescriptor);
    }
}
