package kotlin.reflect.jvm.internal.impl.types.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ah;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.aw;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.checker.d;
import kotlin.reflect.jvm.internal.impl.types.checker.j;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: TypeUtils.kt */
public final class a {
    public static final g bo(w wVar) {
        i.f(wVar, "$this$builtIns");
        g btw = wVar.bMZ().btw();
        i.e(btw, "constructor.builtIns");
        return btw;
    }

    public static final w aY(w wVar) {
        i.f(wVar, "$this$makeNullable");
        wVar = au.aY(wVar);
        i.e(wVar, "TypeUtils.makeNullable(this)");
        return wVar;
    }

    public static final w aZ(w wVar) {
        i.f(wVar, "$this$makeNotNullable");
        wVar = au.aZ(wVar);
        i.e(wVar, "TypeUtils.makeNotNullable(this)");
        return wVar;
    }

    public static final boolean E(w wVar) {
        i.f(wVar, "$this$isAnyOrNullableAny");
        return g.E(wVar);
    }

    public static final boolean bf(w wVar) {
        i.f(wVar, "$this$isTypeParameter");
        return au.bf(wVar);
    }

    public static final boolean c(w wVar, w wVar2) {
        i.f(wVar, "$this$isSubtypeOf");
        i.f(wVar2, "superType");
        return b.fxI.c(wVar, wVar2);
    }

    public static final w a(w wVar, f fVar) {
        i.f(wVar, "$this$replaceAnnotations");
        i.f(fVar, "newAnnotations");
        if (wVar.brE().isEmpty() && fVar.isEmpty()) {
            return wVar;
        }
        return wVar.bPA().f(fVar);
    }

    public static final ap a(w wVar, Variance variance, ao aoVar) {
        i.f(wVar, "type");
        i.f(variance, "projectionKind");
        if ((aoVar != null ? aoVar.bta() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new ar(variance, wVar);
    }

    public static final ap bp(w wVar) {
        i.f(wVar, "$this$asTypeProjection");
        return new ar(wVar);
    }

    public static final boolean b(w wVar, kotlin.jvm.a.b<? super ay, Boolean> bVar) {
        i.f(wVar, "$this$contains");
        i.f(bVar, "predicate");
        return au.b(wVar, (kotlin.jvm.a.b) bVar);
    }

    public static final boolean h(ay ayVar) {
        i.f(ayVar, "$this$canHaveUndefinedNullability");
        return (ayVar.bMZ() instanceof j) || (ayVar.bMZ().brQ() instanceof ao) || (ayVar instanceof d);
    }

    public static final w e(ao aoVar) {
        i.f(aoVar, "$this$representativeUpperBound");
        List bod = aoVar.bod();
        String str = "upperBounds";
        i.e(bod, str);
        int isEmpty = bod.isEmpty() ^ 1;
        if (m.eVC && isEmpty == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Upper bounds should not be empty: ");
            stringBuilder.append(aoVar);
            throw new AssertionError(stringBuilder.toString());
        }
        Object obj;
        bod = aoVar.bod();
        i.e(bod, str);
        Iterator it = bod.iterator();
        Object obj2;
        do {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.f brQ = ((w) obj).bMZ().brQ();
            if (brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                fVar = brQ;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) fVar;
            obj2 = null;
            if (!(dVar == null || dVar.brt() == ClassKind.INTERFACE || dVar.brt() == ClassKind.ANNOTATION_CLASS)) {
                obj2 = 1;
                continue;
            }
        } while (obj2 == null);
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar;
        }
        List bod2 = aoVar.bod();
        i.e(bod2, str);
        Object bU = u.bU(bod2);
        i.e(bU, "upperBounds.first()");
        return (w) bU;
    }

    public static final w bq(w wVar) {
        ay a;
        i.f(wVar, "$this$replaceArgumentsWithStarProjections");
        ay bPA = wVar.bPA();
        String str = "constructor.parameters";
        ad bPs;
        Collection arrayList;
        if (bPA instanceof q) {
            List parameters;
            Iterable<ao> iterable;
            q qVar = (q) bPA;
            ad bPr = qVar.bPr();
            if (!(bPr.bMZ().getParameters().isEmpty() || bPr.bMZ().brQ() == null)) {
                parameters = bPr.bMZ().getParameters();
                i.e(parameters, str);
                iterable = parameters;
                Collection arrayList2 = new ArrayList(n.e(iterable, 10));
                for (ao ahVar : iterable) {
                    arrayList2.add(new ah(ahVar));
                }
                bPr = at.a(bPr, (List) arrayList2, null, 2, null);
            }
            bPs = qVar.bPs();
            if (!(bPs.bMZ().getParameters().isEmpty() || bPs.bMZ().brQ() == null)) {
                parameters = bPs.bMZ().getParameters();
                i.e(parameters, str);
                iterable = parameters;
                arrayList = new ArrayList(n.e(iterable, 10));
                for (ao ahVar2 : iterable) {
                    arrayList.add(new ah(ahVar2));
                }
                bPs = at.a(bPs, (List) arrayList, null, 2, null);
            }
            a = x.a(bPr, bPs);
        } else if (bPA instanceof ad) {
            bPs = (ad) bPA;
            if (!(bPs.bMZ().getParameters().isEmpty() || bPs.bMZ().brQ() == null)) {
                List parameters2 = bPs.bMZ().getParameters();
                i.e(parameters2, str);
                Iterable<ao> iterable2 = parameters2;
                arrayList = new ArrayList(n.e(iterable2, 10));
                for (ao ahVar3 : iterable2) {
                    arrayList.add(new ah(ahVar3));
                }
                bPs = at.a(bPs, (List) arrayList, null, 2, null);
            }
            a = bPs;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return aw.a(a, bPA);
    }
}
