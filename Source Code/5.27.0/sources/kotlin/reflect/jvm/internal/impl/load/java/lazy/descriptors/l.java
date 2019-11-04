package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.an;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class l extends m {
    private final g fjm;
    private final f fkc;

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class a<N> implements kotlin.reflect.jvm.internal.impl.utils.b.b<N> {
        public static final a fkf = new a();

        a() {
        }

        /* renamed from: B */
        public final Iterable<d> dy(d dVar) {
            i.e(dVar, "it");
            an brm = dVar.brm();
            i.e(brm, "it.typeConstructor");
            Collection bup = brm.bup();
            i.e(bup, "it.typeConstructor.supertypes");
            return n.i(n.g(u.Z(bup), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1.fkg));
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    public static final class b extends kotlin.reflect.jvm.internal.impl.utils.b.a<d, kotlin.l> {
        final /* synthetic */ d fkh;
        final /* synthetic */ Set fki;
        final /* synthetic */ kotlin.jvm.a.b fkj;

        public void bwV() {
        }

        b(d dVar, Set set, kotlin.jvm.a.b bVar) {
            this.fkh = dVar;
            this.fki = set;
            this.fkj = bVar;
        }

        public /* synthetic */ Object bsI() {
            bwV();
            return kotlin.l.eVB;
        }

        /* renamed from: r */
        public boolean dz(d dVar) {
            i.f(dVar, "current");
            if (dVar == this.fkh) {
                return true;
            }
            h brl = dVar.brl();
            i.e(brl, "current.staticScope");
            if (!(brl instanceof m)) {
                return true;
            }
            this.fki.addAll((Collection) this.fkj.invoke(brl));
            return false;
        }
    }

    public f c(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return null;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bwU */
    public f bwF() {
        return this.fkc;
    }

    public l(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, g gVar, f fVar) {
        i.f(hVar, "c");
        i.f(gVar, "jClass");
        i.f(fVar, "ownerDescriptor");
        super(hVar);
        this.fjm = gVar;
        this.fkc = fVar;
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bwA */
    public a bwB() {
        return new a(this.fjm, LazyJavaStaticClassScope$computeMemberIndex$1.fkd);
    }

    /* Access modifiers changed, original: protected */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        Set Y = u.Y(((b) bwM().invoke()).bwq());
        l z = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.z(bwF());
        Set bux = z != null ? z.bux() : null;
        if (bux == null) {
            bux = al.emptySet();
        }
        Y.addAll(bux);
        if (this.fjm.isEnum()) {
            Y.addAll(m.listOf(c.fsP, c.fsO));
        }
        return Y;
    }

    /* Access modifiers changed, original: protected */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> e(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        Set Y = u.Y(((b) bwM().invoke()).bwr());
        a(bwF(), Y, LazyJavaStaticClassScope$computePropertyNames$1$1.fke);
        return Y;
    }

    /* Access modifiers changed, original: protected */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        return al.emptySet();
    }

    /* Access modifiers changed, original: protected */
    public void a(Collection<ai> collection, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        i.f(collection, "result");
        i.f(fVar, ConditionalUserProperty.NAME);
        Collection b = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, c(fVar, (d) bwF()), collection, bwF(), bwP().bwl().bvU());
        i.e(b, "resolveOverridesForStati…components.errorReporter)");
        collection.addAll(b);
        if (!this.fjm.isEnum()) {
            return;
        }
        ai H;
        if (i.y(fVar, c.fsP)) {
            H = kotlin.reflect.jvm.internal.impl.resolve.b.H(bwF());
            i.e(H, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(H);
        } else if (i.y(fVar, c.fsO)) {
            H = kotlin.reflect.jvm.internal.impl.resolve.b.G(bwF());
            i.e(H, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(H);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<ae> collection) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(collection, "result");
        Set a = a(bwF(), new LinkedHashSet(), new LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(fVar));
        if ((collection.isEmpty() ^ 1) != 0) {
            Collection b = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, a, collection, bwF(), bwP().bwl().bvU());
            i.e(b, "resolveOverridesForStati…rorReporter\n            )");
            collection.addAll(b);
            return;
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : a) {
            ae i = i((ae) next);
            ArrayList arrayList = linkedHashMap.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(i, arrayList);
            }
            arrayList.add(next);
        }
        Collection arrayList2 = new ArrayList();
        for (Entry value : linkedHashMap.entrySet()) {
            r.a(arrayList2, (Iterable) kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, (Collection) value.getValue(), collection, bwF(), bwP().bwl().bvU()));
        }
        collection.addAll((List) arrayList2);
    }

    private final Set<ai> c(kotlin.reflect.jvm.internal.impl.name.f fVar, d dVar) {
        l z = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.z(dVar);
        if (z != null) {
            return u.V(z.b(fVar, (kotlin.reflect.jvm.internal.impl.incremental.components.b) NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return al.emptySet();
    }

    private final <R> Set<R> a(d dVar, Set<R> set, kotlin.jvm.a.b<? super h, ? extends Collection<? extends R>> bVar) {
        kotlin.reflect.jvm.internal.impl.utils.b.a((Collection) l.listOf(dVar), (kotlin.reflect.jvm.internal.impl.utils.b.b) a.fkf, (kotlin.reflect.jvm.internal.impl.utils.b.c) new b(dVar, set, bVar));
        return set;
    }

    private final ae i(ae aeVar) {
        Kind bsT = aeVar.bsT();
        i.e(bsT, "this.kind");
        if (bsT.isReal()) {
            return aeVar;
        }
        Collection bsR = aeVar.bsR();
        i.e(bsR, "this.overriddenDescriptors");
        Iterable<ae> iterable = bsR;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (ae aeVar2 : iterable) {
            i.e(aeVar2, "it");
            arrayList.add(i(aeVar2));
        }
        return (ae) u.bY(u.X((List) arrayList));
    }
}
