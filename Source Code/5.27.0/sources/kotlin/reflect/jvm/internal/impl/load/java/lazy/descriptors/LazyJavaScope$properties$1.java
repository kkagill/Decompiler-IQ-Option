package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.c;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$properties$1 extends Lambda implements b<f, List<? extends ae>> {
    final /* synthetic */ k this$0;

    LazyJavaScope$properties$1(k kVar) {
        this.this$0 = kVar;
        super(1);
    }

    /* renamed from: z */
    public final List<ae> invoke(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        ArrayList arrayList = new ArrayList();
        n s = ((b) this.this$0.bwM().invoke()).s(fVar);
        if (!(s == null || s.bxz())) {
            arrayList.add(this.this$0.a(s));
        }
        Collection collection = arrayList;
        this.this$0.b(fVar, collection);
        if (c.I(this.this$0.bwF())) {
            return u.T(arrayList);
        }
        return u.T(this.this$0.bwP().bwl().bwd().a(this.this$0.bwP(), collection));
    }
}
