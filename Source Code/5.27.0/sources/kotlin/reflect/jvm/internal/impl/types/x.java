package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: KotlinTypeFactory.kt */
public final class x {
    public static final x fxo = new x();

    private x() {
    }

    private final h a(an anVar, List<? extends ap> list) {
        f brQ = anVar.brQ();
        if (brQ instanceof ao) {
            return brQ.bsY().bsF();
        }
        h a;
        if (brQ instanceof d) {
            if (list.isEmpty()) {
                return ((d) brQ).bsY().bsF();
            }
            a = ((d) brQ).a(ao.fxv.b(anVar, (List) list));
            i.e(a, "descriptor.getMemberScop…(constructor, arguments))");
            return a;
        } else if (brQ instanceof an) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scope for abbreviation: ");
            stringBuilder.append(((an) brQ).bsZ());
            a = p.C(stringBuilder.toString(), true);
            i.e(a, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            return a;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unsupported classifier: ");
            stringBuilder2.append(brQ);
            stringBuilder2.append(" for constructor: ");
            stringBuilder2.append(anVar);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    public static final ad c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, an anVar, List<? extends ap> list, boolean z) {
        i.f(fVar, "annotations");
        i.f(anVar, "constructor");
        i.f(list, "arguments");
        if (!fVar.isEmpty() || !list.isEmpty() || z || anVar.brQ() == null) {
            return a(fVar, anVar, list, z, fxo.a(anVar, (List) list));
        }
        f brQ = anVar.brQ();
        if (brQ == null) {
            i.bnJ();
        }
        i.e(brQ, "constructor.declarationDescriptor!!");
        ad bsY = brQ.bsY();
        i.e(bsY, "constructor.declarationDescriptor!!.defaultType");
        return bsY;
    }

    public static final ad a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, an anVar, List<? extends ap> list, boolean z, h hVar) {
        i.f(fVar, "annotations");
        i.f(anVar, "constructor");
        i.f(list, "arguments");
        i.f(hVar, "memberScope");
        ae aeVar = new ae(anVar, list, z, hVar);
        if (fVar.isEmpty()) {
            return aeVar;
        }
        return new d(aeVar, fVar);
    }

    public static final ad a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, d dVar, List<? extends ap> list) {
        i.f(fVar, "annotations");
        i.f(dVar, "descriptor");
        i.f(list, "arguments");
        an brm = dVar.brm();
        i.e(brm, "descriptor.typeConstructor");
        return c(fVar, brm, list, false);
    }

    public static final ay a(ad adVar, ad adVar2) {
        i.f(adVar, "lowerBound");
        i.f(adVar2, "upperBound");
        if (i.y(adVar, adVar2)) {
            return adVar;
        }
        return new r(adVar, adVar2);
    }
}
