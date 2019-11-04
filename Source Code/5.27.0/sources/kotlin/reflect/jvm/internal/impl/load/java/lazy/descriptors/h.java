package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;

/* compiled from: LazyJavaPackageFragment.kt */
public final class h extends x {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), k.a(new PropertyReference1Impl(k.G(h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    private final f fdr;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.h fiV;
    private final e fjL = this.fiV.bqz().f(new LazyJavaPackageFragment$binaryClasses$2(this));
    private final d fjM = new d(this.fiV, this.fjP, this);
    private final e<List<b>> fjN = this.fiV.bqz().a(new LazyJavaPackageFragment$subPackages$1(this), m.emptyList());
    private final e fjO;
    private final t fjP;

    public final Map<String, n> bwH() {
        return (Map) g.a(this.fjL, (Object) this, anY[0]);
    }

    public h(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, t tVar) {
        f bug;
        i.f(hVar, "outerContext");
        i.f(tVar, "jPackage");
        super(hVar.bql(), tVar.btB());
        this.fjP = tVar;
        this.fiV = a.a(hVar, (kotlin.reflect.jvm.internal.impl.descriptors.e) this, null, 0, 6, null);
        if (this.fiV.bwl().bwc().bvp()) {
            bug = f.fdA.bug();
        } else {
            bug = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(this.fiV, this.fjP);
        }
        this.fdr = bug;
        this.fjO = this.fiV.bqz().f(new LazyJavaPackageFragment$partToFacade$2(this));
    }

    public f brE() {
        return this.fdr;
    }

    public final List<b> bwI() {
        return (List) this.fjN.invoke();
    }

    public final d c(kotlin.reflect.jvm.internal.impl.load.java.structure.g gVar) {
        i.f(gVar, "jClass");
        return this.fjM.bws().c(gVar);
    }

    /* renamed from: bwJ */
    public d bsF() {
        return this.fjM;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy Java package fragment: ");
        stringBuilder.append(btB());
        return stringBuilder.toString();
    }

    public aj brF() {
        return new o(this);
    }
}
