package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.o;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ag;
import kotlin.reflect.jvm.internal.impl.types.aj;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.aw;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.a.b;
import kotlin.reflect.jvm.internal.impl.types.n;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.v;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.utils.h;

/* compiled from: NewKotlinTypeChecker.kt */
public final class g implements b {
    public static final g fxP = new g();

    private g() {
    }

    public boolean c(w wVar, w wVar2) {
        i.f(wVar, "subtype");
        i.f(wVar2, "supertype");
        return b(new TypeCheckerContext(true, false, 2, null), wVar.bPA(), wVar2.bPA());
    }

    public boolean d(w wVar, w wVar2) {
        i.f(wVar, "a");
        i.f(wVar2, "b");
        return a(new TypeCheckerContext(false, false, 2, null), wVar.bPA(), wVar2.bPA());
    }

    public final boolean a(TypeCheckerContext typeCheckerContext, ay ayVar, ay ayVar2) {
        i.f(typeCheckerContext, "$this$equalTypes");
        i.f(ayVar, "a");
        i.f(ayVar2, "b");
        boolean z = true;
        if (ayVar == ayVar2) {
            return true;
        }
        w wVar = ayVar;
        if (bk(wVar)) {
            w wVar2 = ayVar2;
            if (bk(wVar2)) {
                if (!typeCheckerContext.d(ayVar.bMZ(), ayVar2.bMZ())) {
                    return false;
                }
                if (ayVar.btD().isEmpty()) {
                    if (!(bj(wVar) || bj(wVar2) || ayVar.boc() == ayVar2.boc())) {
                        z = false;
                    }
                    return z;
                }
            }
        }
        if (!(b(typeCheckerContext, ayVar, ayVar2) && b(typeCheckerContext, ayVar2, ayVar))) {
            z = false;
        }
        return z;
    }

    private final boolean bj(w wVar) {
        return t.aG(wVar).boc() != t.aH(wVar).boc();
    }

    private final boolean bk(w wVar) {
        return wVar.bMZ().brS() && !n.aC(wVar) && !ag.aM(wVar) && i.y(t.aG(wVar).bMZ(), t.aH(wVar).bMZ());
    }

    public final boolean b(TypeCheckerContext typeCheckerContext, ay ayVar, ay ayVar2) {
        i.f(typeCheckerContext, "$this$isSubtypeOf");
        i.f(ayVar, "subType");
        i.f(ayVar2, "superType");
        if (ayVar == ayVar2) {
            return true;
        }
        ayVar = e(ayVar);
        ayVar2 = e(ayVar2);
        w wVar = ayVar;
        w wVar2 = ayVar2;
        Boolean a = a(typeCheckerContext, t.aG(wVar), t.aH(wVar2));
        if (a != null) {
            boolean booleanValue = a.booleanValue();
            typeCheckerContext.b(ayVar, ayVar2);
            return booleanValue;
        }
        Boolean b = typeCheckerContext.b(ayVar, ayVar2);
        if (b != null) {
            return b.booleanValue();
        }
        return b(typeCheckerContext, t.aG(wVar), t.aH(wVar2));
    }

    public final ad c(ad adVar) {
        i.f(adVar, "type");
        an bMZ = adVar.bMZ();
        Object obj = 1;
        v vVar = null;
        if (bMZ instanceof c) {
            c cVar = (c) bMZ;
            ap bNa = cVar.bNa();
            if (bNa.bPD() != Variance.IN_VARIANCE) {
                obj = null;
            }
            if (obj == null) {
                bNa = null;
            }
            if (bNa != null) {
                w bpT = bNa.bpT();
                if (bpT != null) {
                    vVar = bpT.bPA();
                }
            }
            v vVar2 = vVar;
            if (cVar.bNb() == null) {
                bNa = cVar.bNa();
                Iterable<w> bup = cVar.bup();
                Collection arrayList = new ArrayList(n.e(bup, 10));
                for (w bPA : bup) {
                    arrayList.add(bPA.bPA());
                }
                cVar.a(new e(bNa, (List) arrayList));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            e bNb = cVar.bNb();
            if (bNb == null) {
                i.bnJ();
            }
            return new d(captureStatus, bNb, vVar2, adVar.brE(), adVar.boc());
        } else if (bMZ instanceof o) {
            Iterable<w> bup2 = ((o) bMZ).bup();
            Collection arrayList2 = new ArrayList(n.e(bup2, 10));
            for (w b : bup2) {
                arrayList2.add(au.b(b, adVar.boc()));
            }
            return x.a(adVar.brE(), new v((List) arrayList2), m.emptyList(), false, adVar.bsF());
        } else {
            if ((bMZ instanceof v) && adVar.boc()) {
                v vVar3 = (v) bMZ;
                Iterable<w> bup3 = vVar3.bup();
                Collection arrayList3 = new ArrayList(n.e(bup3, 10));
                Object obj2 = null;
                for (w bPA2 : bup3) {
                    arrayList3.add(a.aY(bPA2));
                    obj2 = 1;
                }
                List list = (List) arrayList3;
                if (obj2 != null) {
                    vVar = new v(list);
                }
                if (vVar != null) {
                    vVar3 = vVar;
                }
                adVar = x.a(adVar.brE(), vVar3, m.emptyList(), false, vVar3.bPz());
            }
            return adVar;
        }
    }

    public final ay e(ay ayVar) {
        ay c;
        i.f(ayVar, "type");
        if (ayVar instanceof ad) {
            c = c((ad) ayVar);
        } else if (ayVar instanceof q) {
            q qVar = (q) ayVar;
            ad c2 = c(qVar.bPr());
            ad c3 = c(qVar.bPs());
            if (c2 == qVar.bPr() && c3 == qVar.bPs()) {
                c = ayVar;
            } else {
                c = x.a(c2, c3);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return aw.a(c, ayVar);
    }

    private final Boolean a(TypeCheckerContext typeCheckerContext, ad adVar, ad adVar2) {
        boolean aJ = y.aJ(adVar);
        boolean z = true;
        Boolean valueOf = Boolean.valueOf(true);
        if (aJ || y.aJ(adVar2)) {
            if (typeCheckerContext.bPM()) {
                return valueOf;
            }
            if (!adVar.boc() || adVar2.boc()) {
                return Boolean.valueOf(l.fxR.c(adVar.gM(false), adVar2.gM(false)));
            }
            return Boolean.valueOf(false);
        } else if ((adVar instanceof aj) || (adVar2 instanceof aj)) {
            return valueOf;
        } else {
            if (adVar2 instanceof d) {
                d dVar = (d) adVar2;
                if (dVar.bPJ() != null) {
                    int i = h.aob[typeCheckerContext.a(adVar, dVar).ordinal()];
                    if (i == 1) {
                        return Boolean.valueOf(b(typeCheckerContext, (ay) adVar, dVar.bPJ()));
                    }
                    if (i == 2 && b(typeCheckerContext, (ay) adVar, dVar.bPJ())) {
                        return valueOf;
                    }
                }
            }
            an bMZ = adVar2.bMZ();
            if (!(bMZ instanceof v)) {
                bMZ = null;
            }
            v vVar = (v) bMZ;
            if (vVar == null) {
                return null;
            }
            int boc = adVar2.boc() ^ 1;
            if (m.eVC && boc == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Intersection type should not be marked nullable!: ");
                stringBuilder.append(adVar2);
                throw new AssertionError(stringBuilder.toString());
            }
            Iterable<w> bup = vVar.bup();
            if (!(bup instanceof Collection) || !((Collection) bup).isEmpty()) {
                for (w bPA : bup) {
                    if (!fxP.b(typeCheckerContext, (ay) adVar, bPA.bPA())) {
                        z = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    private final boolean b(TypeCheckerContext typeCheckerContext, ad adVar, ad adVar2) {
        TypeCheckerContext typeCheckerContext2 = typeCheckerContext;
        ad adVar3 = adVar;
        ad adVar4 = adVar2;
        Object obj = (i.e(adVar) || i.f(adVar) || typeCheckerContext2.g(adVar3)) ? 1 : null;
        StringBuilder stringBuilder;
        if (m.eVC && obj == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Not singleClassifierType and not intersection subType: ");
            stringBuilder.append(adVar3);
            throw new AssertionError(stringBuilder.toString());
        }
        obj = (i.e(adVar2) || typeCheckerContext2.g(adVar4)) ? 1 : null;
        if (m.eVC && obj == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Not singleClassifierType superType: ");
            stringBuilder.append(adVar4);
            throw new AssertionError(stringBuilder.toString());
        } else if (!k.fxQ.c(typeCheckerContext2, adVar3, adVar4)) {
            return false;
        } else {
            an bMZ = adVar2.bMZ();
            if ((i.y(adVar.bMZ(), bMZ) && bMZ.getParameters().isEmpty()) || a.E(adVar4)) {
                return true;
            }
            List b = b(typeCheckerContext2, adVar3, bMZ);
            int size = b.size();
            if (size == 0) {
                return a(typeCheckerContext, adVar);
            }
            if (size == 1) {
                return a(typeCheckerContext2, ((ad) u.bU(b)).btD(), adVar4);
            }
            size = h.axg[typeCheckerContext.bPL().ordinal()];
            if (size == 1) {
                return false;
            }
            if (size == 2) {
                return a(typeCheckerContext2, ((ad) u.bU(b)).btD(), adVar4);
            }
            if (size == 3 || size == 4) {
                Object obj2;
                Iterable<ad> iterable = b;
                if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                    for (ad btD : iterable) {
                        if (fxP.a(typeCheckerContext2, btD.btD(), adVar4)) {
                            obj2 = 1;
                            break;
                        }
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                    return true;
                }
            }
            if (typeCheckerContext.bPL() != SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN) {
                return false;
            }
            List parameters = bMZ.getParameters();
            i.e(parameters, "superConstructor.parameters");
            Iterable iterable2 = parameters;
            int i = 10;
            Collection arrayList = new ArrayList(n.e(iterable2, 10));
            int i2 = 0;
            for (Object next : iterable2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    m.bno();
                }
                ao aoVar = (ao) next;
                Iterable<ad> iterable3 = b;
                Collection arrayList2 = new ArrayList(n.e(iterable3, i));
                for (ad adVar5 : iterable3) {
                    ap apVar = (ap) u.h(adVar5.btD(), i2);
                    if (apVar != null) {
                        if ((apVar.bPD() == Variance.INVARIANT ? 1 : null) == null) {
                            apVar = null;
                        }
                        if (apVar != null) {
                            w bpT = apVar.bpT();
                            if (bpT != null) {
                                ay bPA = bpT.bPA();
                                if (bPA != null) {
                                    arrayList2.add(bPA);
                                }
                            }
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Incorrect type: ");
                    stringBuilder.append(adVar5);
                    stringBuilder.append(", subType: ");
                    stringBuilder.append(adVar3);
                    stringBuilder.append(", superType: ");
                    stringBuilder.append(adVar4);
                    throw new IllegalStateException(stringBuilder.toString().toString());
                }
                arrayList.add(a.bp(a.co((List) arrayList2)));
                i2 = i3;
                i = 10;
            }
            return a(typeCheckerContext2, (List) arrayList, adVar4);
        }
    }

    private final List<ad> a(TypeCheckerContext typeCheckerContext, ad adVar, an anVar) {
        return cq(c(typeCheckerContext, adVar, anVar));
    }

    public final List<ad> b(TypeCheckerContext typeCheckerContext, ad adVar, an anVar) {
        i.f(typeCheckerContext, "$this$findCorrespondingSupertypes");
        i.f(adVar, "baseType");
        i.f(anVar, "constructor");
        if (i.d(adVar)) {
            return a(typeCheckerContext, adVar, anVar);
        }
        if (!(anVar.brQ() instanceof d)) {
            return c(typeCheckerContext, adVar, anVar);
        }
        h<ad> hVar = new h();
        typeCheckerContext.initialize();
        ArrayDeque c = typeCheckerContext.fxV;
        if (c == null) {
            i.bnJ();
        }
        Set d = typeCheckerContext.fxW;
        if (d == null) {
            i.bnJ();
        }
        c.push(adVar);
        while ((c.isEmpty() ^ 1) != 0) {
            if (d.size() <= 1000) {
                ad adVar2 = (ad) c.pop();
                i.e(adVar2, "current");
                if (d.add(adVar2)) {
                    TypeCheckerContext.a aVar;
                    if (i.d(adVar2)) {
                        hVar.add(adVar2);
                        aVar = TypeCheckerContext.a.c.fya;
                    } else {
                        aVar = TypeCheckerContext.a.a.fxZ;
                    }
                    if ((i.y(aVar, TypeCheckerContext.a.c.fya) ^ 1) == 0) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        for (w wVar : adVar2.bMZ().bup()) {
                            i.e(wVar, "supertype");
                            c.add(aVar.bl(wVar));
                        }
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many supertypes for type: ");
                stringBuilder.append(adVar);
                stringBuilder.append(". Supertypes = ");
                stringBuilder.append(u.a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }
        typeCheckerContext.clear();
        Collection arrayList = new ArrayList();
        for (ad adVar3 : hVar) {
            g gVar = fxP;
            i.e(adVar3, "it");
            r.a(arrayList, (Iterable) gVar.a(typeCheckerContext, adVar3, anVar));
        }
        return (List) arrayList;
    }

    private final List<ad> c(TypeCheckerContext typeCheckerContext, ad adVar, an anVar) {
        TypeCheckerContext typeCheckerContext2 = typeCheckerContext;
        ad adVar2 = adVar;
        an anVar2 = anVar;
        f brQ = anVar.brQ();
        if (!(brQ instanceof d)) {
            brQ = null;
        }
        d dVar = (d) brQ;
        if (dVar == null) {
        } else if (O(dVar)) {
            List<ad> listOf;
            if (typeCheckerContext2.d(adVar.bMZ(), anVar2)) {
                Object a = f.a(adVar2, CaptureStatus.FOR_SUBTYPING, null, 4, null);
                if (a == null) {
                    a = adVar2;
                }
                listOf = l.listOf(a);
            } else {
                listOf = m.emptyList();
            }
            return listOf;
        }
        List hVar = new h();
        typeCheckerContext.initialize();
        ArrayDeque c = typeCheckerContext.fxV;
        if (c == null) {
            i.bnJ();
        }
        Set d = typeCheckerContext.fxW;
        if (d == null) {
            i.bnJ();
        }
        c.push(adVar2);
        while ((c.isEmpty() ^ 1) != 0) {
            if (d.size() <= 1000) {
                ad adVar3 = (ad) c.pop();
                i.e(adVar3, "current");
                if (d.add(adVar3)) {
                    TypeCheckerContext.a aVar;
                    ad a2 = f.a(adVar3, CaptureStatus.FOR_SUBTYPING, null, 4, null);
                    if (a2 == null) {
                        a2 = adVar3;
                    }
                    if (typeCheckerContext2.d(a2.bMZ(), anVar2)) {
                        hVar.add(a2);
                        aVar = TypeCheckerContext.a.c.fya;
                    } else if (a2.btD().isEmpty()) {
                        aVar = TypeCheckerContext.a.a.fxZ;
                    } else {
                        aVar = new b(kotlin.reflect.jvm.internal.impl.types.ao.fxv.aS(a2).bPF());
                    }
                    if ((i.y(aVar, TypeCheckerContext.a.c.fya) ^ 1) == 0) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        for (w wVar : adVar3.bMZ().bup()) {
                            i.e(wVar, "supertype");
                            c.add(aVar.bl(wVar));
                        }
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many supertypes for type: ");
                stringBuilder.append(adVar2);
                stringBuilder.append(". Supertypes = ");
                stringBuilder.append(u.a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }
        typeCheckerContext.clear();
        return hVar;
    }

    private final boolean O(d dVar) {
        return (!u.s(dVar) || dVar.brt() == ClassKind.ENUM_ENTRY || dVar.brt() == ClassKind.ANNOTATION_CLASS) ? false : true;
    }

    private final List<ad> cq(List<? extends ad> list) {
        if (list.size() < 2) {
            return list;
        }
        List<ad> list2;
        Collection arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Iterable<ap> btD = ((ad) next).btD();
            if (!(btD instanceof Collection) || !((Collection) btD).isEmpty()) {
                for (ap bpT : btD) {
                    w bpT2 = bpT.bpT();
                    i.e(bpT2, "it.type");
                    if ((t.aE(bpT2) ^ 1) == 0) {
                        i = 0;
                        break;
                    }
                }
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        List<ad> list3 = (List) arrayList;
        if ((list3.isEmpty() ^ 1) != 0) {
            list2 = list3;
        }
        return list2;
    }

    public final Variance c(Variance variance, Variance variance2) {
        i.f(variance, "declared");
        i.f(variance2, "useSite");
        if (variance == Variance.INVARIANT) {
            return variance2;
        }
        return (variance2 == Variance.INVARIANT || variance == variance2) ? variance : null;
    }

    private final boolean a(TypeCheckerContext typeCheckerContext, List<? extends ap> list, ad adVar) {
        if (list == adVar.btD()) {
            return true;
        }
        List parameters = adVar.bMZ().getParameters();
        i.e(parameters, "superType.constructor.parameters");
        int size = parameters.size();
        for (int i = 0; i < size; i++) {
            ap apVar = (ap) adVar.btD().get(i);
            if (!apVar.bPC()) {
                ay bPA = apVar.bpT().bPA();
                ap apVar2 = (ap) list.get(i);
                Object obj = apVar2.bPD() == Variance.INVARIANT ? 1 : null;
                StringBuilder stringBuilder;
                if (m.eVC && obj == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Incorrect sub argument: ");
                    stringBuilder.append(apVar2);
                    throw new AssertionError(stringBuilder.toString());
                }
                ay bPA2 = apVar2.bpT().bPA();
                obj = parameters.get(i);
                i.e(obj, "parameters[index]");
                Variance bta = ((ao) obj).bta();
                i.e(bta, "parameters[index].variance");
                Variance bPD = apVar.bPD();
                i.e(bPD, "superProjection.projectionKind");
                bPD = c(bta, bPD);
                if (bPD == null) {
                    return typeCheckerContext.bPM();
                }
                if (typeCheckerContext.fxT <= 100) {
                    boolean a;
                    typeCheckerContext.fxT = typeCheckerContext.fxT + 1;
                    int i2 = h.aFX[bPD.ordinal()];
                    if (i2 == 1) {
                        a = fxP.a(typeCheckerContext, bPA2, bPA);
                    } else if (i2 == 2) {
                        a = fxP.b(typeCheckerContext, bPA2, bPA);
                    } else if (i2 == 3) {
                        a = fxP.b(typeCheckerContext, bPA, bPA2);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    typeCheckerContext.fxT = typeCheckerContext.fxT - 1;
                    if (!a) {
                        return false;
                    }
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Arguments depth is too high. Some related argument: ");
                    stringBuilder.append(bPA2);
                    throw new IllegalStateException(stringBuilder.toString().toString());
                }
            }
        }
        return true;
    }

    private final boolean a(TypeCheckerContext typeCheckerContext, ad adVar) {
        if (kotlin.reflect.jvm.internal.impl.builtins.g.D(adVar)) {
            return true;
        }
        typeCheckerContext.initialize();
        ArrayDeque c = typeCheckerContext.fxV;
        if (c == null) {
            i.bnJ();
        }
        Set d = typeCheckerContext.fxW;
        if (d == null) {
            i.bnJ();
        }
        c.push(adVar);
        while ((c.isEmpty() ^ 1) != 0) {
            if (d.size() <= 1000) {
                ad adVar2 = (ad) c.pop();
                i.e(adVar2, "current");
                if (d.add(adVar2)) {
                    TypeCheckerContext.a aVar;
                    if (i.d(adVar2)) {
                        aVar = TypeCheckerContext.a.c.fya;
                    } else {
                        aVar = TypeCheckerContext.a.a.fxZ;
                    }
                    if ((i.y(aVar, TypeCheckerContext.a.c.fya) ^ 1) == 0) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        for (w wVar : adVar2.bMZ().bup()) {
                            i.e(wVar, "supertype");
                            ad bl = aVar.bl(wVar);
                            if (kotlin.reflect.jvm.internal.impl.builtins.g.D(bl)) {
                                typeCheckerContext.clear();
                                return true;
                            }
                            c.add(bl);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many supertypes for type: ");
                stringBuilder.append(adVar);
                stringBuilder.append(". Supertypes = ");
                stringBuilder.append(u.a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }
        typeCheckerContext.clear();
        return false;
    }
}
