package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class k implements ExternalOverridabilityCondition {
    public static final a fhe = new a();

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            i.f(aVar, "superDescriptor");
            i.f(aVar2, "subDescriptor");
            if ((aVar2 instanceof JavaMethodDescriptor) && (aVar instanceof s)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
                s sVar = (s) aVar;
                Object obj = javaMethodDescriptor.bsP().size() == sVar.bsP().size() ? 1 : null;
                if (m.eVC && obj == null) {
                    throw new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
                }
                ai bvb = javaMethodDescriptor.bul();
                i.e(bvb, "subDescriptor.original");
                List bsP = bvb.bsP();
                i.e(bsP, "subDescriptor.original.valueParameters");
                Iterable iterable = bsP;
                s bti = sVar.bti();
                i.e(bti, "superDescriptor.original");
                List bsP2 = bti.bsP();
                i.e(bsP2, "superDescriptor.original.valueParameters");
                for (Pair pair : u.e(iterable, (Iterable) bsP2)) {
                    ar arVar = (ar) pair.bnj();
                    ar arVar2 = (ar) pair.bnk();
                    a aVar3 = this;
                    s sVar2 = (s) aVar2;
                    i.e(arVar, "subParameter");
                    boolean z = aVar3.a(sVar2, arVar) instanceof c;
                    i.e(arVar2, "superParameter");
                    if (z != (aVar3.a(sVar, arVar2) instanceof c)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final kotlin.reflect.jvm.internal.impl.load.kotlin.i a(s sVar, ar arVar) {
            String str = "valueParameterDescriptor.type";
            w bpT;
            if (r.c(sVar) || i(sVar)) {
                bpT = arVar.bpT();
                i.e(bpT, str);
                return r.af(kotlin.reflect.jvm.internal.impl.types.b.a.aY(bpT));
            }
            bpT = arVar.bpT();
            i.e(bpT, str);
            return r.af(bpT);
        }

        private final boolean i(s sVar) {
            boolean z = true;
            if (sVar.bsP().size() != 1) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.k brj = sVar.brj();
            if (!(brj instanceof d)) {
                brj = null;
            }
            d dVar = (d) brj;
            if (dVar != null) {
                List bsP = sVar.bsP();
                i.e(bsP, "f.valueParameters");
                Object bY = u.bY(bsP);
                i.e(bY, "f.valueParameters.single()");
                f brQ = ((ar) bY).bpT().bMZ().brQ();
                if (!(brQ instanceof d)) {
                    brQ = null;
                }
                d dVar2 = (d) brQ;
                if (dVar2 != null) {
                    if (!(g.d(dVar) && i.y(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(dVar), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(dVar2)))) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    public Result a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, d dVar) {
        i.f(aVar, "superDescriptor");
        i.f(aVar2, "subDescriptor");
        if (b(aVar, aVar2, dVar)) {
            return Result.INCOMPATIBLE;
        }
        if (fhe.a(aVar, aVar2)) {
            return Result.INCOMPATIBLE;
        }
        return Result.UNKNOWN;
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, d dVar) {
        if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof s) && !g.c((kotlin.reflect.jvm.internal.impl.descriptors.k) aVar2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.fgP;
            s sVar = (s) aVar2;
            kotlin.reflect.jvm.internal.impl.name.f bsZ = sVar.bsZ();
            String str = "subDescriptor.name";
            i.e(bsZ, str);
            if (!builtinMethodsWithSpecialGenericSignature.m(bsZ)) {
                b bVar = b.fgH;
                bsZ = sVar.bsZ();
                i.e(bsZ, str);
                if (!bVar.k(bsZ)) {
                    return false;
                }
            }
            CallableMemberDescriptor r = r.r((CallableMemberDescriptor) aVar);
            boolean z = aVar instanceof s;
            s sVar2 = (s) (!z ? null : aVar);
            Object obj = (sVar2 == null || sVar.btk() != sVar2.btk()) ? 1 : null;
            if (obj != null && (r == null || !sVar.btk())) {
                return true;
            }
            if ((dVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.d) && sVar.btj() == null && r != null && !r.a(dVar, r)) {
                if ((r instanceof s) && z && BuiltinMethodsWithSpecialGenericSignature.h((s) r) != null) {
                    String a = r.a(sVar, false, false, 2, null);
                    s bti = ((s) aVar).bti();
                    i.e(bti, "superDescriptor.original");
                    if (i.y(a, r.a(bti, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Contract bvx() {
        return Contract.CONFLICTS_ONLY;
    }
}
