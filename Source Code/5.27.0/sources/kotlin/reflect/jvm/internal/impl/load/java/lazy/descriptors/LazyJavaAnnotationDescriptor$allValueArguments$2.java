package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.j;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<f, ? extends g<?>>> {
    final /* synthetic */ e this$0;

    LazyJavaAnnotationDescriptor$allValueArguments$2(e eVar) {
        this.this$0 = eVar;
        super(0);
    }

    /* renamed from: aAU */
    public final Map<f, g<?>> invoke() {
        Collection arrayList = new ArrayList();
        for (b bVar : this.this$0.fju.bxf()) {
            Object bsZ = bVar.bsZ();
            if (bsZ == null) {
                bsZ = n.fhm;
            }
            g a = this.this$0.b(bVar);
            Object x = a != null ? j.x(bsZ, a) : null;
            if (x != null) {
                arrayList.add(x);
            }
        }
        return af.ac((List) arrayList);
    }
}
