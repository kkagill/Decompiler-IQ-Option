package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.b;

/* compiled from: ModuleClassResolver.kt */
public final class l implements j {
    public b fji;

    public d b(g gVar) {
        i.f(gVar, "javaClass");
        b bVar = this.fji;
        if (bVar == null) {
            i.lG("resolver");
        }
        return bVar.b(gVar);
    }

    public final void a(b bVar) {
        i.f(bVar, "<set-?>");
        this.fji = bVar;
    }
}
