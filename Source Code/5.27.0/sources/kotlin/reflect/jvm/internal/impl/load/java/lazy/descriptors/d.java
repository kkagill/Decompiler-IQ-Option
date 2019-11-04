package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.util.a.a;

/* compiled from: JvmPackageScope.kt */
public final class d implements h {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.h fiV;
    private final j fjp;
    private final e fjq = this.fiV.bqz().f(new JvmPackageScope$kotlinScopes$2(this));
    private final h fjr;

    private final List<h> bwt() {
        return (List) g.a(this.fjq, (Object) this, anY[0]);
    }

    public d(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, t tVar, h hVar2) {
        i.f(hVar, "c");
        i.f(tVar, "jPackage");
        i.f(hVar2, "packageFragment");
        this.fiV = hVar;
        this.fjr = hVar2;
        this.fjp = new j(this.fiV, tVar, this.fjr);
    }

    public final j bws() {
        return this.fjp;
    }

    public f c(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        d(fVar, bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.d e = this.fjp.c(fVar, bVar);
        if (e != null) {
            return e;
        }
        f fVar2 = (f) null;
        for (h c : bwt()) {
            f c2 = c.c(fVar, bVar);
            if (c2 != null) {
                if (!(c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) || !((kotlin.reflect.jvm.internal.impl.descriptors.g) c2).brB()) {
                    fVar2 = c2;
                    break;
                } else if (fVar2 == null) {
                    fVar2 = c2;
                }
            }
        }
        return fVar2;
    }

    public Collection<ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        d(fVar, bVar);
        j jVar = this.fjp;
        List<h> bwt = bwt();
        Collection<ae> a = jVar.a(fVar, bVar);
        for (h a2 : bwt) {
            a = a.d(a, a2.a(fVar, bVar));
        }
        return a != null ? a : al.emptySet();
    }

    public Collection<ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        d(fVar, bVar);
        j jVar = this.fjp;
        List<h> bwt = bwt();
        Collection<ai> b = jVar.b(fVar, bVar);
        for (h b2 : bwt) {
            b = a.d(b, b2.b(fVar, bVar));
        }
        return b != null ? b : al.emptySet();
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        j jVar = this.fjp;
        List<h> bwt = bwt();
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> a = jVar.a(dVar, bVar);
        for (h a2 : bwt) {
            a = a.d(a, a2.a(dVar, bVar));
        }
        return a != null ? a : al.emptySet();
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
        Collection linkedHashSet = new LinkedHashSet();
        for (h bux : bwt()) {
            r.a(linkedHashSet, (Iterable) bux.bux());
        }
        Set set = (Set) linkedHashSet;
        set.addAll(this.fjp.bux());
        return set;
    }

    public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
        Collection linkedHashSet = new LinkedHashSet();
        for (h buy : bwt()) {
            r.a(linkedHashSet, (Iterable) buy.buy());
        }
        Set set = (Set) linkedHashSet;
        set.addAll(this.fjp.buy());
        return set;
    }

    public void d(kotlin.reflect.jvm.internal.impl.name.f fVar, b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        kotlin.reflect.jvm.internal.impl.incremental.a.a(this.fiV.bwl().bwa(), bVar, (y) this.fjr, fVar);
    }
}
