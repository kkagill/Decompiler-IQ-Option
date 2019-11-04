package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.al;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.utils.a;

/* compiled from: SubstitutingScope.kt */
public final class l implements h {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(l.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};
    private final TypeSubstitutor fuF;
    private Map<kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.k> fuG;
    private final d fuH = g.c(new SubstitutingScope$_allDescriptors$2(this));
    private final h fux;

    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> bNO() {
        d dVar = this.fuH;
        j jVar = anY[0];
        return (Collection) dVar.getValue();
    }

    public l(h hVar, TypeSubstitutor typeSubstitutor) {
        i.f(hVar, "workerScope");
        i.f(typeSubstitutor, "givenSubstitutor");
        this.fux = hVar;
        as bPG = typeSubstitutor.bPG();
        i.e(bPG, "givenSubstitutor.substitution");
        this.fuF = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.a(bPG, false, 1, null).bPF();
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> D W(D d) {
        if (this.fuF.isEmpty()) {
            return d;
        }
        if (this.fuG == null) {
            this.fuG = new HashMap();
        }
        Map map = this.fuG;
        if (map == null) {
            i.bnJ();
        }
        Object obj = map.get(d);
        if (obj == null) {
            StringBuilder stringBuilder;
            if (d instanceof al) {
                kotlin.reflect.jvm.internal.impl.descriptors.l f = ((al) d).f(this.fuF);
                if (f != null) {
                    obj = f;
                    map.put(d, obj);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, ");
                    stringBuilder.append("but ");
                    stringBuilder.append(d);
                    stringBuilder.append(" substitution fails");
                    throw new AssertionError(stringBuilder.toString());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown descriptor in scope: ");
            stringBuilder.append(d);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = (kotlin.reflect.jvm.internal.impl.descriptors.k) obj;
        if (kVar != null) {
            return kVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type D");
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> Collection<D> Q(Collection<? extends D> collection) {
        if (this.fuF.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet mC = a.mC(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mC.add(W((kotlin.reflect.jvm.internal.impl.descriptors.k) it.next()));
        }
        return mC;
    }

    public Collection<? extends ae> a(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return Q(this.fux.a(fVar, bVar));
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.f c(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.f c = this.fux.c(fVar, bVar);
        return c != null ? (kotlin.reflect.jvm.internal.impl.descriptors.f) W(c) : null;
    }

    public Collection<? extends ai> b(f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return Q(this.fux.b(fVar, bVar));
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> a(d dVar, kotlin.jvm.a.b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        return bNO();
    }

    public Set<f> bux() {
        return this.fux.bux();
    }

    public Set<f> buy() {
        return this.fux.buy();
    }
}
