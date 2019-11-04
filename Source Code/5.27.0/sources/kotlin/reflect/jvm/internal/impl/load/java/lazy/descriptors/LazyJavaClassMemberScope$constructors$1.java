package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.k;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j;

/* compiled from: LazyJavaClassMemberScope.kt */
final class LazyJavaClassMemberScope$constructors$1 extends Lambda implements a<List<? extends c>> {
    final /* synthetic */ h $c;
    final /* synthetic */ g this$0;

    LazyJavaClassMemberScope$constructors$1(g gVar, h hVar) {
        this.this$0 = gVar;
        this.$c = hVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<c> invoke() {
        Collection<k> brs = this.this$0.fjm.brs();
        ArrayList arrayList = new ArrayList(brs.size());
        for (k a : brs) {
            arrayList.add(this.this$0.a(a));
        }
        j bwd = this.$c.bwl().bwd();
        h hVar = this.$c;
        Collection collection = arrayList;
        if (collection.isEmpty()) {
            collection = m.dc(this.this$0.bwD());
        }
        return u.T(bwd.a(hVar, collection));
    }
}
