package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: AbstractScopeAdapter.kt */
public abstract class a implements h {
    public abstract h bNn();

    public Collection<ai> b(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return bNn().b(fVar, bVar);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.f c(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return bNn().c(fVar, bVar);
    }

    public Collection<ae> a(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return bNn().a(fVar, bVar);
    }

    public Collection<k> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        return bNn().a(dVar, bVar);
    }

    public Set<f> bux() {
        return bNn().bux();
    }

    public Set<f> buy() {
        return bNn().buy();
    }
}
