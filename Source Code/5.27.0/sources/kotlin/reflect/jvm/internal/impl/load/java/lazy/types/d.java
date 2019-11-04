package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: RawType.kt */
public final class d extends as {
    private static final a fks = c.a(TypeUsage.COMMON, false, null, 3, null).a(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
    private static final a fkt = c.a(TypeUsage.COMMON, false, null, 3, null).a(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    public static final d fku = new d();

    public boolean isEmpty() {
        return false;
    }

    private d() {
    }

    /* renamed from: X */
    public ar Y(w wVar) {
        i.f(wVar, "key");
        return new ar(Z(wVar));
    }

    private final w Z(w wVar) {
        f brQ = wVar.bMZ().brQ();
        if (brQ instanceof ao) {
            return Z(c.a((ao) brQ, null, null, 3, null));
        }
        if (brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            ay fVar;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brQ;
            Pair a = a(t.aG(wVar), dVar, fks);
            ad adVar = (ad) a.bnj();
            boolean booleanValue = ((Boolean) a.bnk()).booleanValue();
            Pair a2 = a(t.aH(wVar), dVar, fkt);
            ad adVar2 = (ad) a2.bnj();
            boolean booleanValue2 = ((Boolean) a2.bnk()).booleanValue();
            if (booleanValue || booleanValue2) {
                fVar = new f(adVar, adVar2);
            } else {
                fVar = x.a(adVar, adVar2);
            }
            return fVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected declaration kind: ");
        stringBuilder.append(brQ);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final Pair<ad, Boolean> a(ad adVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, a aVar) {
        boolean isEmpty = adVar.bMZ().getParameters().isEmpty();
        Boolean valueOf = Boolean.valueOf(false);
        if (isEmpty) {
            return j.x(adVar, valueOf);
        }
        w wVar = adVar;
        if (g.o(wVar)) {
            ap apVar = (ap) adVar.btD().get(0);
            Variance bPD = apVar.bPD();
            w bpT = apVar.bpT();
            i.e(bpT, "componentTypeProjection.type");
            return j.x(x.c(adVar.brE(), adVar.bMZ(), l.listOf(new ar(bPD, Z(bpT))), adVar.boc()), valueOf);
        } else if (y.aJ(wVar)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Raw error type: ");
            stringBuilder.append(adVar.bMZ());
            return j.x(p.mK(stringBuilder.toString()), valueOf);
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE = adVar.brE();
            an bMZ = adVar.bMZ();
            List parameters = adVar.bMZ().getParameters();
            i.e(parameters, "type.constructor.parameters");
            Iterable<ao> iterable = parameters;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (ao aoVar : iterable) {
                d dVar2 = fku;
                i.e(aoVar, "parameter");
                arrayList.add(a(dVar2, aoVar, aVar, null, 4, null));
            }
            List list = (List) arrayList;
            boolean boc = adVar.boc();
            h a = dVar.a(fku);
            i.e(a, "declaration.getMemberScope(RawSubstitution)");
            return j.x(x.a(brE, bMZ, list, boc, a), Boolean.valueOf(true));
        }
    }

    public static /* synthetic */ ap a(d dVar, ao aoVar, a aVar, w wVar, int i, Object obj) {
        if ((i & 4) != 0) {
            wVar = c.a(aoVar, null, null, 3, null);
        }
        return dVar.a(aoVar, aVar, wVar);
    }

    public final ap a(ao aoVar, a aVar, w wVar) {
        i.f(aoVar, "parameter");
        i.f(aVar, "attr");
        i.f(wVar, "erasedUpperBound");
        int i = e.aob[aVar.bwZ().ordinal()];
        if (i == 1) {
            return new ar(Variance.INVARIANT, wVar);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (!aoVar.bta().getAllowsOutPosition()) {
            return new ar(Variance.INVARIANT, a.Q(aoVar).bqK());
        } else {
            ap arVar;
            List parameters = wVar.bMZ().getParameters();
            i.e(parameters, "erasedUpperBound.constructor.parameters");
            if ((parameters.isEmpty() ^ 1) != 0) {
                arVar = new ar(Variance.OUT_VARIANCE, wVar);
            } else {
                arVar = c.a(aoVar, aVar);
            }
            return arVar;
        }
    }
}
