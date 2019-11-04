package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;

/* compiled from: LazyJavaClassDescriptor.kt */
final class LazyJavaClassDescriptor$declaredParameters$1 extends Lambda implements a<List<? extends ao>> {
    final /* synthetic */ f this$0;

    LazyJavaClassDescriptor$declaredParameters$1(f fVar) {
        this.this$0 = fVar;
        super(0);
    }

    /* renamed from: acZ */
    public final List<ao> invoke() {
        Iterable<w> bsM = this.this$0.bwx().bsM();
        Collection arrayList = new ArrayList(n.e(bsM, 10));
        for (w wVar : bsM) {
            ao a = this.this$0.fiV.bwm().a(wVar);
            if (a != null) {
                arrayList.add(a);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Parameter ");
                stringBuilder.append(wVar);
                stringBuilder.append(" surely belongs to class ");
                stringBuilder.append(this.this$0.bwx());
                stringBuilder.append(", so it must be resolved");
                throw new AssertionError(stringBuilder.toString());
            }
        }
        return (List) arrayList;
    }
}
