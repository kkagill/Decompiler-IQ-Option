package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.v.a;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.b;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: ModuleDescriptorImpl.kt */
public final class v extends j implements kotlin.reflect.jvm.internal.impl.descriptors.v {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(v.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};
    private final h eZz;
    private final g fdE;
    private final Map<a<? extends Object>, Object> ffC;
    private t ffD;
    private z ffE;
    private final b<kotlin.reflect.jvm.internal.impl.name.b, aa> ffF;
    private final d ffG;
    private final f ffH;
    private boolean isValid;

    public v(f fVar, h hVar, g gVar, kotlin.reflect.jvm.internal.impl.resolve.f fVar2) {
        this(fVar, hVar, gVar, fVar2, null, null, 48, null);
    }

    private final i buO() {
        d dVar = this.ffG;
        j jVar = anY[0];
        return (i) dVar.getValue();
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        i.f(mVar, "visitor");
        return kotlin.reflect.jvm.internal.impl.descriptors.v.b.a(this, mVar, d);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.k brj() {
        return kotlin.reflect.jvm.internal.impl.descriptors.v.b.d(this);
    }

    public g btw() {
        return this.fdE;
    }

    public /* synthetic */ v(f fVar, h hVar, g gVar, kotlin.reflect.jvm.internal.impl.resolve.f fVar2, Map map, f fVar3, int i, f fVar4) {
        this(fVar, hVar, gVar, (i & 8) != 0 ? (kotlin.reflect.jvm.internal.impl.resolve.f) null : fVar2, (i & 16) != 0 ? af.emptyMap() : map, (i & 32) != 0 ? (f) null : fVar3);
    }

    /* JADX WARNING: Missing block: B:4:0x0036, code skipped:
            if (r2 != null) goto L_0x003d;
     */
    public v(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.storage.h r3, kotlin.reflect.jvm.internal.impl.builtins.g r4, kotlin.reflect.jvm.internal.impl.resolve.f r5, java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.v.a<?>, ? extends java.lang.Object> r6, kotlin.reflect.jvm.internal.impl.name.f r7) {
        /*
        r1 = this;
        r0 = "moduleName";
        kotlin.jvm.internal.i.f(r2, r0);
        r0 = "storageManager";
        kotlin.jvm.internal.i.f(r3, r0);
        r0 = "builtIns";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "capabilities";
        kotlin.jvm.internal.i.f(r6, r0);
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA;
        r0 = r0.bug();
        r1.<init>(r0, r2);
        r1.eZz = r3;
        r1.fdE = r4;
        r1.ffH = r7;
        r3 = r2.bKh();
        if (r3 == 0) goto L_0x0063;
    L_0x002a:
        if (r5 == 0) goto L_0x0039;
    L_0x002c:
        r2 = kotlin.reflect.jvm.internal.impl.resolve.f.fta;
        r2 = kotlin.j.x(r2, r5);
        r2 = kotlin.collections.ae.m(r2);
        if (r2 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003d;
    L_0x0039:
        r2 = kotlin.collections.af.emptyMap();
    L_0x003d:
        r2 = kotlin.collections.af.b(r6, r2);
        r1.ffC = r2;
        r2 = 1;
        r1.isValid = r2;
        r2 = r1.eZz;
        r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1;
        r3.<init>(r1);
        r3 = (kotlin.jvm.a.b) r3;
        r2 = r2.q(r3);
        r1.ffF = r2;
        r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2;
        r2.<init>(r1);
        r2 = (kotlin.jvm.a.a) r2;
        r2 = kotlin.g.c(r2);
        r1.ffG = r2;
        return;
    L_0x0063:
        r3 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Module name must be special: ";
        r4.append(r5);
        r4.append(r2);
        r2 = r4.toString();
        r3.<init>(r2);
        r3 = (java.lang.Throwable) r3;
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.v.<init>(kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.storage.h, kotlin.reflect.jvm.internal.impl.builtins.g, kotlin.reflect.jvm.internal.impl.resolve.f, java.util.Map, kotlin.reflect.jvm.internal.impl.name.f):void");
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void buM() {
        if (!isValid()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Accessing invalid module descriptor ");
            stringBuilder.append(this);
            throw new InvalidModuleException(stringBuilder.toString());
        }
    }

    public List<kotlin.reflect.jvm.internal.impl.descriptors.v> buN() {
        t tVar = this.ffD;
        if (tVar != null) {
            return tVar.buL();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dependencies of module ");
        stringBuilder.append(getId());
        stringBuilder.append(" were not set");
        throw new AssertionError(stringBuilder.toString());
    }

    public aa f(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqName");
        buM();
        return (aa) this.ffF.invoke(bVar);
    }

    public Collection<kotlin.reflect.jvm.internal.impl.name.b> a(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.jvm.a.b<? super f, Boolean> bVar2) {
        i.f(bVar, "fqName");
        i.f(bVar2, "nameFilter");
        buM();
        return buP().a(bVar, bVar2);
    }

    private final boolean isInitialized() {
        return this.ffE != null;
    }

    public final void a(t tVar) {
        i.f(tVar, "dependencies");
        Object obj = this.ffD == null ? 1 : null;
        if (kotlin.m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Dependencies of ");
            stringBuilder.append(getId());
            stringBuilder.append(" were already set");
            throw new AssertionError(stringBuilder.toString());
        }
        this.ffD = tVar;
    }

    public final void a(v... vVarArr) {
        i.f(vVarArr, "descriptors");
        cf(i.E(vVarArr));
    }

    public final void cf(List<v> list) {
        i.f(list, "descriptors");
        b(list, al.emptySet());
    }

    public final void b(List<v> list, Set<v> set) {
        i.f(list, "descriptors");
        i.f(set, "friends");
        a((t) new u(list, set, m.emptyList()));
    }

    public boolean c(kotlin.reflect.jvm.internal.impl.descriptors.v vVar) {
        i.f(vVar, "targetModule");
        if (!i.y(this, vVar)) {
            t tVar = this.ffD;
            if (tVar == null) {
                i.bnJ();
            }
            if (!(u.b((Iterable) tVar.buK(), (Object) vVar) || buN().contains(vVar))) {
                return false;
            }
        }
        return true;
    }

    private final String getId() {
        String fVar = bsZ().toString();
        i.e(fVar, "name.toString()");
        return fVar;
    }

    public final void a(z zVar) {
        i.f(zVar, "providerForModuleContent");
        int isInitialized = isInitialized() ^ 1;
        if (kotlin.m.eVC && isInitialized == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempt to initialize module ");
            stringBuilder.append(getId());
            stringBuilder.append(" twice");
            throw new AssertionError(stringBuilder.toString());
        }
        this.ffE = zVar;
    }

    public final z buP() {
        buM();
        return buO();
    }
}
