package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$functions$1 extends Lambda implements b<f, List<? extends ai>> {
    final /* synthetic */ k this$0;

    LazyJavaScope$functions$1(k kVar) {
        this.this$0 = kVar;
        super(1);
    }

    /* renamed from: z */
    public final List<ai> invoke(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (q qVar : ((b) this.this$0.bwM().invoke()).r(fVar)) {
            JavaMethodDescriptor c = this.this$0.c(qVar);
            if (this.this$0.a(c)) {
                this.this$0.bwP().bwl().bvV().a(qVar, (ai) c);
                linkedHashSet.add(c);
            }
        }
        Collection collection = linkedHashSet;
        kotlin.reflect.jvm.internal.impl.resolve.i.O(collection);
        this.this$0.a(collection, fVar);
        return u.T(this.this$0.bwP().bwl().bwd().a(this.this$0.bwP(), collection));
    }
}
