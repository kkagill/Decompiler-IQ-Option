package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;

/* compiled from: InnerClassesScopeWrapper.kt */
public final class f extends i {
    private final h fux;

    public f(h hVar) {
        i.f(hVar, "workerScope");
        this.fux = hVar;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.f c(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.f c = this.fux.c(fVar, bVar);
        if (c == null) {
            return null;
        }
        d dVar = (d) (!(c instanceof d) ? null : c);
        if (dVar != null) {
            return dVar;
        }
        if (!(c instanceof an)) {
            c = null;
        }
        return (an) c;
    }

    /* renamed from: f */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f> a(d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        dVar = dVar.ms(d.fuu.bNI());
        if (dVar == null) {
            return m.emptyList();
        }
        Iterable a = this.fux.a(dVar, bVar);
        Collection arrayList = new ArrayList();
        for (Object next : a) {
            if (next instanceof g) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
        return this.fux.bux();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
        return this.fux.buy();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Classes from ");
        stringBuilder.append(this.fux);
        return stringBuilder.toString();
    }
}
