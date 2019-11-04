package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.k;

/* compiled from: ChainedMemberScope.kt */
public final class b implements h {
    public static final a ftR = new a();
    private final String fpc;
    private final List<h> ftQ;

    /* compiled from: ChainedMemberScope.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public b(String str, List<? extends h> list) {
        i.f(str, "debugName");
        i.f(list, "scopes");
        this.fpc = str;
        this.ftQ = list;
    }

    public f c(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        f fVar2 = (f) null;
        for (h c : this.ftQ) {
            f c2 = c.c(fVar, bVar);
            if (c2 != null) {
                if (!(c2 instanceof g) || !((g) c2).brB()) {
                    return c2;
                }
                if (fVar2 == null) {
                    fVar2 = c2;
                }
            }
        }
        return fVar2;
    }

    public Collection<ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        List<h> list = this.ftQ;
        if (list.isEmpty()) {
            return al.emptySet();
        }
        Collection<ae> collection = (Collection) null;
        for (h a : list) {
            collection = kotlin.reflect.jvm.internal.impl.util.a.a.d(collection, a.a(fVar, bVar));
        }
        return collection != null ? collection : al.emptySet();
    }

    public Collection<ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        List<h> list = this.ftQ;
        if (list.isEmpty()) {
            return al.emptySet();
        }
        Collection<ai> collection = (Collection) null;
        for (h b : list) {
            collection = kotlin.reflect.jvm.internal.impl.util.a.a.d(collection, b.b(fVar, bVar));
        }
        return collection != null ? collection : al.emptySet();
    }

    public Collection<k> a(d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        List<h> list = this.ftQ;
        if (list.isEmpty()) {
            return al.emptySet();
        }
        Collection<k> collection = (Collection) null;
        for (h a : list) {
            collection = kotlin.reflect.jvm.internal.impl.util.a.a.d(collection, a.a(dVar, bVar));
        }
        return collection != null ? collection : al.emptySet();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
        Collection linkedHashSet = new LinkedHashSet();
        for (h bux : this.ftQ) {
            r.a(linkedHashSet, (Iterable) bux.bux());
        }
        return (Set) linkedHashSet;
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
        Collection linkedHashSet = new LinkedHashSet();
        for (h buy : this.ftQ) {
            r.a(linkedHashSet, (Iterable) buy.buy());
        }
        return (Set) linkedHashSet;
    }

    public String toString() {
        return this.fpc;
    }
}
