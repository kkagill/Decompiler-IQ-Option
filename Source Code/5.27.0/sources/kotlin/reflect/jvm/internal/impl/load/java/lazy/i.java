package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.storage.c;
import kotlin.reflect.jvm.internal.impl.utils.a;

/* compiled from: resolvers.kt */
public final class i implements m {
    private final k fej;
    private final h fiV;
    private final Map<w, Integer> fjd;
    private final c<w, n> fje = this.fiV.bqz().r(new LazyJavaTypeParameterResolver$resolve$1(this));
    private final int fjf;

    public i(h hVar, k kVar, x xVar, int i) {
        kotlin.jvm.internal.i.f(hVar, "c");
        kotlin.jvm.internal.i.f(kVar, "containingDeclaration");
        kotlin.jvm.internal.i.f(xVar, "typeParameterOwner");
        this.fiV = hVar;
        this.fej = kVar;
        this.fjf = i;
        this.fjd = a.af(xVar.bsM());
    }

    public ao a(w wVar) {
        kotlin.jvm.internal.i.f(wVar, "javaTypeParameter");
        n nVar = (n) this.fje.invoke(wVar);
        return nVar != null ? nVar : this.fiV.bwm().a(wVar);
    }
}
