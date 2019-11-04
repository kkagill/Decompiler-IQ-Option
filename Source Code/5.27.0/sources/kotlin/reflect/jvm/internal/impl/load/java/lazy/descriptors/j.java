package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.storage.c;
import kotlin.reflect.jvm.internal.impl.storage.f;

/* compiled from: LazyJavaPackageScope.kt */
public final class j extends m {
    private final t fjP;
    private final f<Set<String>> fjQ;
    private final c<a, d> fjR;
    private final h fjS;

    /* compiled from: LazyJavaPackageScope.kt */
    private static final class a {
        private final kotlin.reflect.jvm.internal.impl.name.f fdP;
        private final g fjT;

        public a(kotlin.reflect.jvm.internal.impl.name.f fVar, g gVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            this.fdP = fVar;
            this.fjT = gVar;
        }

        public final kotlin.reflect.jvm.internal.impl.name.f bsZ() {
            return this.fdP;
        }

        public final g bwL() {
            return this.fjT;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.y(this.fdP, ((a) obj).fdP);
        }

        public int hashCode() {
            return this.fdP.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    private static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {
            private final d ffo;

            public a(d dVar) {
                i.f(dVar, "descriptor");
                super();
                this.ffo = dVar;
            }

            public final d boI() {
                return this.ffo;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class b extends b {
            public static final b fjU = new b();

            private b() {
                super();
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {
            public static final c fjV = new c();

            private c() {
                super();
            }
        }

        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(Collection<ai> collection, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        i.f(collection, "result");
        i.f(fVar, ConditionalUserProperty.NAME);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: bwK */
    public h bwF() {
        return this.fjS;
    }

    public j(h hVar, t tVar, h hVar2) {
        i.f(hVar, "c");
        i.f(tVar, "jPackage");
        i.f(hVar2, "ownerDescriptor");
        super(hVar);
        this.fjP = tVar;
        this.fjS = hVar2;
        this.fjQ = hVar.bqz().g(new LazyJavaPackageScope$knownClassNamesInPackage$1(this, hVar));
        this.fjR = hVar.bqz().r(new LazyJavaPackageScope$classes$1(this, hVar));
    }

    private final b a(n nVar) {
        if (nVar == null) {
            return b.fjU;
        }
        if (nVar.bqj().byV() != Kind.CLASS) {
            return c.fjV;
        }
        d e = bwP().bwl().bvS().e(nVar);
        return e != null ? new a(e) : b.fjU;
    }

    /* renamed from: e */
    public d c(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return a(fVar, null);
    }

    private final d a(kotlin.reflect.jvm.internal.impl.name.f fVar, g gVar) {
        if (!kotlin.reflect.jvm.internal.impl.name.h.J(fVar)) {
            return null;
        }
        Set set = (Set) this.fjQ.invoke();
        if (gVar != null || set == null || set.contains(fVar.boi())) {
            return (d) this.fjR.invoke(new a(fVar, gVar));
        }
        return null;
    }

    public final d c(g gVar) {
        i.f(gVar, "javaClass");
        return a(gVar.bsZ(), gVar);
    }

    public Collection<ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        return m.emptyList();
    }

    /* Access modifiers changed, original: protected */
    public b bwB() {
        return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b.a.fjo;
    }

    /* Access modifiers changed, original: protected */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        if (!dVar.mr(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.fuu.bNB())) {
            return al.emptySet();
        }
        Set<String> set = (Set) this.fjQ.invoke();
        Collection hashSet;
        if (set != null) {
            hashSet = new HashSet();
            for (String ms : set) {
                hashSet.add(kotlin.reflect.jvm.internal.impl.name.f.ms(ms));
            }
            return (Set) hashSet;
        }
        kotlin.jvm.a.b bVar2;
        t tVar = this.fjP;
        if (bVar2 == null) {
            bVar2 = kotlin.reflect.jvm.internal.impl.utils.d.bPW();
        }
        Iterable<g> o = tVar.o(bVar2);
        hashSet = new LinkedHashSet();
        for (g gVar : o) {
            Object bsZ = gVar.bxo() == LightClassOriginKind.SOURCE ? null : gVar.bsZ();
            if (bsZ != null) {
                hashSet.add(bsZ);
            }
        }
        return (Set) hashSet;
    }

    /* Access modifiers changed, original: protected */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        return al.emptySet();
    }

    /* Access modifiers changed, original: protected */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> e(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        return al.emptySet();
    }

    public Collection<k> a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        return a(dVar, (kotlin.jvm.a.b) bVar, (kotlin.reflect.jvm.internal.impl.incremental.components.b) NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
    }
}
