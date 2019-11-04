package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.aa.a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class r extends j implements aa {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(r.class), "fragments", "getFragments()Ljava/util/List;"))};
    private final b fdF;
    private final e ffq;
    private final h ffr;
    private final v ffs;

    public List<y> getFragments() {
        return (List) g.a(this.ffq, (Object) this, anY[0]);
    }

    public boolean isEmpty() {
        return a.a(this);
    }

    /* renamed from: buH */
    public v bql() {
        return this.ffs;
    }

    public b btB() {
        return this.fdF;
    }

    public r(v vVar, b bVar, kotlin.reflect.jvm.internal.impl.storage.h hVar) {
        i.f(vVar, "module");
        i.f(bVar, "fqName");
        i.f(hVar, "storageManager");
        super(f.fdA.bug(), bVar.bKd());
        this.ffs = vVar;
        this.fdF = bVar;
        this.ffq = hVar.f(new LazyPackageViewDescriptorImpl$fragments$2(this));
        this.ffr = new kotlin.reflect.jvm.internal.impl.resolve.scopes.g(hVar.f(new LazyPackageViewDescriptorImpl$memberScope$1(this)));
    }

    public h bsF() {
        return this.ffr;
    }

    /* renamed from: buG */
    public aa brj() {
        if (btB().isRoot()) {
            return null;
        }
        v buH = bql();
        b bKb = btB().bKb();
        i.e(bKb, "fqName.parent()");
        return buH.f(bKb);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aa)) {
            obj = null;
        }
        aa aaVar = (aa) obj;
        if (aaVar != null && i.y(btB(), aaVar.btB()) && i.y(bql(), aaVar.bql())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (bql().hashCode() * 31) + btB().hashCode();
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        i.f(mVar, "visitor");
        return mVar.a((aa) this, (Object) d);
    }
}
