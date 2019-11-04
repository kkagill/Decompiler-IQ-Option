package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

/* compiled from: context.kt */
final class ContextKt$childForClassOrPackage$1 extends Lambda implements a<d> {
    final /* synthetic */ e $containingDeclaration;
    final /* synthetic */ h $this_childForClassOrPackage;

    ContextKt$childForClassOrPackage$1(h hVar, e eVar) {
        this.$this_childForClassOrPackage = hVar;
        this.$containingDeclaration = eVar;
        super(0);
    }

    /* renamed from: bvP */
    public final d invoke() {
        return a.a(this.$this_childForClassOrPackage, this.$containingDeclaration.brE());
    }
}
