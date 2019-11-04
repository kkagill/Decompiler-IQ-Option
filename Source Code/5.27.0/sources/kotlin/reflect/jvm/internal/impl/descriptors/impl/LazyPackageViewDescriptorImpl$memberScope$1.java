package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
final class LazyPackageViewDescriptorImpl$memberScope$1 extends Lambda implements a<h> {
    final /* synthetic */ r this$0;

    LazyPackageViewDescriptorImpl$memberScope$1(r rVar) {
        this.this$0 = rVar;
        super(0);
    }

    /* renamed from: brc */
    public final h invoke() {
        if (this.this$0.getFragments().isEmpty()) {
            return c.fuD;
        }
        Iterable<y> fragments = this.this$0.getFragments();
        Collection arrayList = new ArrayList(n.e(fragments, 10));
        for (y bsF : fragments) {
            arrayList.add(bsF.bsF());
        }
        List i = u.i((Collection) (List) arrayList, (Object) new ae(this.this$0.bql(), this.this$0.btB()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package view scope for ");
        stringBuilder.append(this.this$0.btB());
        stringBuilder.append(" in ");
        stringBuilder.append(this.this$0.bql().bsZ());
        return new b(stringBuilder.toString(), i);
    }
}
