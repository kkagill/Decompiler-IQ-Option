package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
final class LazyJavaPackageFragmentProvider$getPackageFragment$1 extends Lambda implements a<h> {
    final /* synthetic */ t $jPackage;
    final /* synthetic */ g this$0;

    LazyJavaPackageFragmentProvider$getPackageFragment$1(g gVar, t tVar) {
        this.this$0 = gVar;
        this.$jPackage = tVar;
        super(0);
    }

    /* renamed from: bwi */
    public final h invoke() {
        return new h(this.this$0.fiV, this.$jPackage);
    }
}
