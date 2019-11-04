package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class n extends b {
    private final h fiV;
    private final e fkk = new e(this.fiV, this.fkl);
    private final w fkl;

    /* Access modifiers changed, original: protected */
    public void P(kotlin.reflect.jvm.internal.impl.types.w wVar) {
        i.f(wVar, "type");
    }

    public n(h hVar, w wVar, int i, k kVar) {
        i.f(hVar, "c");
        i.f(wVar, "javaTypeParameter");
        i.f(kVar, "containingDeclaration");
        super(hVar.bqz(), kVar, wVar.bsZ(), Variance.INVARIANT, false, i, aj.fcV, hVar.bwl().brT());
        this.fiV = hVar;
        this.fkl = wVar;
    }

    /* renamed from: bwX */
    public e brE() {
        return this.fkk;
    }

    /* Access modifiers changed, original: protected */
    public List<kotlin.reflect.jvm.internal.impl.types.w> buq() {
        Collection bxK = this.fkl.bxK();
        if (bxK.isEmpty()) {
            ad bqM = this.fiV.bql().btw().bqM();
            i.e(bqM, "c.module.builtIns.anyType");
            ad bqN = this.fiV.bql().btw().bqN();
            i.e(bqN, "c.module.builtIns.nullableAnyType");
            return l.listOf(x.a(bqM, bqN));
        }
        Iterable<j> iterable = bxK;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (j a : iterable) {
            arrayList.add(this.fiV.bwk().a((v) a, c.a(TypeUsage.COMMON, false, (ao) this, 1, null)));
        }
        return (List) arrayList;
    }
}
