package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ao;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.aw;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: CapturedTypeApproximation.kt */
public final class b {

    /* compiled from: CapturedTypeApproximation.kt */
    public static final class a extends ao {
        a() {
        }

        public ap d(an anVar) {
            i.f(anVar, "key");
            if (!(anVar instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b)) {
                anVar = null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b bVar = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) anVar;
            if (bVar == null) {
                return null;
            }
            if (bVar.bNa().bPC()) {
                return new ar(Variance.OUT_VARIANCE, bVar.bNa().bpT());
            }
            return bVar.bNa();
        }
    }

    private static final ap a(d dVar) {
        boolean bPQ = dVar.bPQ();
        if (!m.eVC || bPQ) {
            CapturedTypeApproximationKt$toTypeProjection$2 capturedTypeApproximationKt$toTypeProjection$2 = new CapturedTypeApproximationKt$toTypeProjection$2(dVar);
            if (i.y(dVar.bPS(), dVar.bPT())) {
                return new ar(dVar.bPS());
            }
            if (g.C(dVar.bPS()) && dVar.bPR().bta() != Variance.IN_VARIANCE) {
                return new ar(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), dVar.bPT());
            }
            if (g.F(dVar.bPT())) {
                return new ar(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.IN_VARIANCE), dVar.bPS());
            }
            return new ar(capturedTypeApproximationKt$toTypeProjection$2.invoke(Variance.OUT_VARIANCE), dVar.bPT());
        }
        kotlin.reflect.jvm.internal.impl.renderer.b p = kotlin.reflect.jvm.internal.impl.renderer.b.frr.p(CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1.fyk);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Only consistent enhanced type projection can be converted to type projection, but ");
        stringBuilder.append('[');
        stringBuilder.append(p.s(dVar.bPR()));
        stringBuilder.append(": <");
        stringBuilder.append(p.b(dVar.bPS()));
        stringBuilder.append(", ");
        stringBuilder.append(p.b(dVar.bPT()));
        stringBuilder.append(">]");
        stringBuilder.append(" was found");
        throw new AssertionError(stringBuilder.toString());
    }

    private static final d c(ap apVar, kotlin.reflect.jvm.internal.impl.descriptors.ao aoVar) {
        int i = c.aob[TypeSubstitutor.a(aoVar.bta(), apVar).ordinal()];
        String str = "type";
        w bpT;
        w bpT2;
        ad bqN;
        if (i == 1) {
            bpT = apVar.bpT();
            i.e(bpT, str);
            bpT2 = apVar.bpT();
            i.e(bpT2, str);
            return new d(aoVar, bpT, bpT2);
        } else if (i == 2) {
            bpT2 = apVar.bpT();
            i.e(bpT2, str);
            bqN = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(aoVar).bqN();
            i.e(bqN, "typeParameter.builtIns.nullableAnyType");
            return new d(aoVar, bpT2, bqN);
        } else if (i == 3) {
            bqN = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(aoVar).bqK();
            i.e(bqN, "typeParameter.builtIns.nothingType");
            bpT = bqN;
            bpT2 = apVar.bpT();
            i.e(bpT2, str);
            return new d(aoVar, bpT, bpT2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final ap a(ap apVar, boolean z) {
        if (apVar == null) {
            return null;
        }
        if (apVar.bPC()) {
            return apVar;
        }
        w bpT = apVar.bpT();
        i.e(bpT, "typeProjection.type");
        if (!au.b(bpT, (kotlin.jvm.a.b) CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1.fyj)) {
            return apVar;
        }
        Variance bPD = apVar.bPD();
        i.e(bPD, "typeProjection.projectionKind");
        if (bPD == Variance.OUT_VARIANCE) {
            return new ar(bPD, (w) br(bpT).bPP());
        }
        if (z) {
            return new ar(bPD, (w) br(bpT).bPO());
        }
        return f(apVar);
    }

    private static final ap f(ap apVar) {
        TypeSubstitutor e = TypeSubstitutor.e((as) new a());
        i.e(e, "TypeSubstitutor.create(o…ojection\n        }\n    })");
        return e.e(apVar);
    }

    public static final a<w> br(w wVar) {
        i.f(wVar, "type");
        if (t.aE(wVar)) {
            a br = br(t.aG(wVar));
            a br2 = br(t.aH(wVar));
            return new a(aw.a(x.a(t.aG((w) br.bPO()), t.aH((w) br2.bPO())), wVar), aw.a(x.a(t.aG((w) br.bPP()), t.aH((w) br2.bPP())), wVar));
        }
        an bMZ = wVar.bMZ();
        String str = "type.builtIns.nothingType";
        if (d.as(wVar)) {
            if (bMZ != null) {
                a<w> aVar;
                ap bNa = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) bMZ).bNa();
                CapturedTypeApproximationKt$approximateCapturedTypes$1 capturedTypeApproximationKt$approximateCapturedTypes$1 = new CapturedTypeApproximationKt$approximateCapturedTypes$1(wVar);
                w bpT = bNa.bpT();
                i.e(bpT, "typeProjection.type");
                bpT = capturedTypeApproximationKt$approximateCapturedTypes$1.invoke(bpT);
                int i = c.axg[bNa.bPD().ordinal()];
                ad bqN;
                if (i == 1) {
                    bqN = kotlin.reflect.jvm.internal.impl.types.b.a.bo(wVar).bqN();
                    i.e(bqN, "type.builtIns.nullableAnyType");
                    aVar = new a(bpT, bqN);
                } else if (i == 2) {
                    bqN = kotlin.reflect.jvm.internal.impl.types.b.a.bo(wVar).bqK();
                    i.e(bqN, str);
                    aVar = new a(capturedTypeApproximationKt$approximateCapturedTypes$1.invoke(bqN), bpT);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Only nontrivial projections should have been captured, not: ");
                    stringBuilder.append(bNa);
                    throw new AssertionError(stringBuilder.toString());
                }
                return aVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
        } else if (wVar.btD().isEmpty() || wVar.btD().size() != bMZ.getParameters().size()) {
            return new a(wVar, wVar);
        } else {
            d c;
            Object obj;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterable btD = wVar.btD();
            List parameters = bMZ.getParameters();
            i.e(parameters, "typeConstructor.parameters");
            for (Pair pair : u.e(btD, (Iterable) parameters)) {
                ap apVar = (ap) pair.bnj();
                kotlin.reflect.jvm.internal.impl.descriptors.ao aoVar = (kotlin.reflect.jvm.internal.impl.descriptors.ao) pair.bnk();
                i.e(aoVar, "typeParameter");
                c = c(apVar, aoVar);
                if (apVar.bPC()) {
                    arrayList.add(c);
                    arrayList2.add(c);
                } else {
                    a b = b(c);
                    d dVar = (d) b.bnj();
                    c = (d) b.bnk();
                    arrayList.add(dVar);
                    arrayList2.add(c);
                }
            }
            Iterable<d> iterable = arrayList;
            Object obj2 = null;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (d c2 : iterable) {
                    if ((c2.bPQ() ^ 1) != 0) {
                        obj2 = 1;
                        break;
                    }
                }
            }
            if (obj2 != null) {
                ad bqK = kotlin.reflect.jvm.internal.impl.types.b.a.bo(wVar).bqK();
                i.e(bqK, str);
                obj = bqK;
            } else {
                obj = a(wVar, (List) arrayList);
            }
            return new a(obj, a(wVar, (List) arrayList2));
        }
    }

    private static final w a(w wVar, List<d> list) {
        Object obj = wVar.btD().size() == list.size() ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Incorrect type arguments ");
            stringBuilder.append(list);
            throw new AssertionError(stringBuilder.toString());
        }
        Iterable<d> iterable = list;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (d a : iterable) {
            arrayList.add(a(a));
        }
        return at.a(wVar, (List) arrayList, null, 2, null);
    }

    private static final a<d> b(d dVar) {
        a br = br(dVar.bPS());
        w wVar = (w) br.bnj();
        w wVar2 = (w) br.bnk();
        a br2 = br(dVar.bPT());
        return new a(new d(dVar.bPR(), wVar2, (w) br2.bnj()), new d(dVar.bPR(), wVar, (w) br2.bnk()));
    }
}
