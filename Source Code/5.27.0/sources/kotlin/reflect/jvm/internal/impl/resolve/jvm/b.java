package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: JavaDescriptorResolver.kt */
public final class b {
    private final g fiE;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g ftP;

    public b(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, g gVar2) {
        i.f(gVar, "packageFragmentProvider");
        i.f(gVar2, "javaResolverCache");
        this.ftP = gVar;
        this.fiE = gVar2;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.g bNl() {
        return this.ftP;
    }

    public final d b(kotlin.reflect.jvm.internal.impl.load.java.structure.g gVar) {
        i.f(gVar, "javaClass");
        kotlin.reflect.jvm.internal.impl.name.b btB = gVar.btB();
        if (btB != null && gVar.bxo() == LightClassOriginKind.SOURCE) {
            return this.fiE.n(btB);
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.g bxm = gVar.bxm();
        d dVar = null;
        if (bxm != null) {
            d b = b(bxm);
            h btd = b != null ? b.btd() : null;
            f c = btd != null ? btd.c(gVar.bsZ(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            if (!(c instanceof d)) {
                c = null;
            }
            return (d) c;
        } else if (btB == null) {
            return null;
        } else {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = this.ftP;
            btB = btB.bKb();
            i.e(btB, "fqName.parent()");
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h) u.bV(gVar2.h(btB));
            if (hVar != null) {
                dVar = hVar.c(gVar);
            }
            return dVar;
        }
    }
}
