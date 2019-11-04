package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: LazyJavaStaticScope.kt */
public abstract class m extends k {
    /* Access modifiers changed, original: protected */
    public void b(f fVar, Collection<ae> collection) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(collection, "result");
    }

    /* Access modifiers changed, original: protected */
    public Void bwW() {
        return null;
    }

    public m(h hVar) {
        i.f(hVar, "c");
        super(hVar);
    }

    public /* synthetic */ ah bsL() {
        return (ah) bwW();
    }

    /* Access modifiers changed, original: protected */
    public a a(q qVar, List<? extends ao> list, w wVar, List<? extends ar> list2) {
        i.f(qVar, "method");
        i.f(list, "methodTypeParameters");
        i.f(wVar, "returnType");
        i.f(list2, "valueParameters");
        return new a(wVar, null, list2, list, false, m.emptyList());
    }
}
