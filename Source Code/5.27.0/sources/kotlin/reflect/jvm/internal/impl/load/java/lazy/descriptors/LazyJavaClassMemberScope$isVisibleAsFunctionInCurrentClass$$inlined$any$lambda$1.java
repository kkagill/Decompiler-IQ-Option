package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1 extends Lambda implements b<f, Collection<? extends ai>> {
    final /* synthetic */ ai $function$inlined;
    final /* synthetic */ g this$0;

    LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$$inlined$any$lambda$1(g gVar, ai aiVar) {
        this.this$0 = gVar;
        this.$function$inlined = aiVar;
        super(1);
    }

    /* renamed from: h */
    public final Collection<ai> invoke(f fVar) {
        i.f(fVar, "accessorName");
        if (i.y(this.$function$inlined.bsZ(), fVar)) {
            return l.listOf(this.$function$inlined);
        }
        return u.b(this.this$0.u(fVar), (Iterable) this.this$0.v(fVar));
    }
}
