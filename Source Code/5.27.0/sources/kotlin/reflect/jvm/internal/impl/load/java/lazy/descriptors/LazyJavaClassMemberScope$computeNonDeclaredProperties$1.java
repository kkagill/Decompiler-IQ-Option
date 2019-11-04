package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$computeNonDeclaredProperties$1 extends Lambda implements b<f, Collection<? extends ai>> {
    final /* synthetic */ g this$0;

    LazyJavaClassMemberScope$computeNonDeclaredProperties$1(g gVar) {
        this.this$0 = gVar;
        super(1);
    }

    /* renamed from: h */
    public final Collection<ai> invoke(f fVar) {
        i.f(fVar, "it");
        return this.this$0.u(fVar);
    }
}
