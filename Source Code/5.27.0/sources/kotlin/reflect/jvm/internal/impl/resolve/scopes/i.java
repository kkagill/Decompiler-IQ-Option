package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.at;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.utils.d;

/* compiled from: MemberScopeImpl.kt */
public abstract class i implements h {
    public f c(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        return null;
    }

    public void d(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        h.b.a(this, fVar, bVar);
    }

    public Collection<? extends ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        return m.emptyList();
    }

    public Collection<? extends ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(bVar, "location");
        return m.emptyList();
    }

    public Collection<k> a(d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        kotlin.jvm.internal.i.f(dVar, "kindFilter");
        kotlin.jvm.internal.i.f(bVar, "nameFilter");
        return m.emptyList();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
        Collection arrayList = new ArrayList();
        for (Object next : a(d.fup, d.bPW())) {
            if (next instanceof ai) {
                arrayList.add(next);
            }
        }
        Collection linkedHashSet = new LinkedHashSet();
        for (ai bsZ : (List) arrayList) {
            linkedHashSet.add(bsZ.bsZ());
        }
        return (Set) linkedHashSet;
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
        Collection arrayList = new ArrayList();
        for (Object next : a(d.fuq, d.bPW())) {
            if (next instanceof at) {
                arrayList.add(next);
            }
        }
        Collection linkedHashSet = new LinkedHashSet();
        for (at bsZ : (List) arrayList) {
            linkedHashSet.add(bsZ.bsZ());
        }
        return (Set) linkedHashSet;
    }
}
