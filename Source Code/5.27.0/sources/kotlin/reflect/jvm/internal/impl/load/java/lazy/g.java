package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.a;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class g implements z {
    private final h fiV;
    private final a<b, h> fiX = this.fiV.bqz().bPb();

    public g(b bVar) {
        i.f(bVar, "components");
        this.fiV = new h(bVar, m.a.fjj, h.da(null));
    }

    private final h o(b bVar) {
        t a = this.fiV.bwl().bvQ().a(bVar);
        return a != null ? (h) this.fiX.b(bVar, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, a)) : null;
    }

    public List<h> h(b bVar) {
        i.f(bVar, "fqName");
        return m.dc(o(bVar));
    }

    /* renamed from: b */
    public List<b> a(b bVar, kotlin.jvm.a.b<? super f, Boolean> bVar2) {
        i.f(bVar, "fqName");
        i.f(bVar2, "nameFilter");
        h o = o(bVar);
        List<b> bwI = o != null ? o.bwI() : null;
        return bwI != null ? bwI : m.emptyList();
    }
}
