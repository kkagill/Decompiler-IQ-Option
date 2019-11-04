package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.af;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.at;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: inlineClassesUtils.kt */
public final class d {
    public static final ar K(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        i.f(dVar, "$this$underlyingRepresentation");
        ar arVar = null;
        if (!dVar.brA()) {
            return null;
        }
        c brw = dVar.brw();
        if (brw != null) {
            List bsP = brw.bsP();
            if (bsP != null) {
                arVar = (ar) u.bZ(bsP);
            }
        }
        return arVar;
    }

    public static final boolean N(k kVar) {
        i.f(kVar, "$this$isInlineClass");
        return (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar).brA();
    }

    public static final ar ao(w wVar) {
        i.f(wVar, "$this$unsubstitutedUnderlyingParameter");
        f brQ = wVar.bMZ().brQ();
        if (!(brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            brQ = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brQ;
        return dVar != null ? K(dVar) : null;
    }

    public static final boolean ap(w wVar) {
        i.f(wVar, "$this$isInlineClassType");
        f brQ = wVar.bMZ().brQ();
        return brQ != null ? N(brQ) : false;
    }

    public static final w aq(w wVar) {
        i.f(wVar, "$this$substitutedUnderlyingType");
        ar ao = ao(wVar);
        if (ao == null) {
            return null;
        }
        h bsF = wVar.bsF();
        kotlin.reflect.jvm.internal.impl.name.f bsZ = ao.bsZ();
        i.e(bsZ, "parameter.name");
        ae aeVar = (ae) u.O(bsF.a(bsZ, NoLookupLocation.FOR_ALREADY_TRACKED));
        if (aeVar != null) {
            return aeVar.bpT();
        }
        return null;
    }

    public static final boolean g(a aVar) {
        i.f(aVar, "$this$isGetterOfUnderlyingPropertyOfInlineClass");
        if (aVar instanceof af) {
            ae btF = ((af) aVar).btF();
            i.e(btF, "correspondingProperty");
            if (a(btF)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(at atVar) {
        i.f(atVar, "$this$isUnderlyingPropertyOfInlineClass");
        k brj = atVar.brj();
        i.e(brj, "this.containingDeclaration");
        if (!N(brj)) {
            return false;
        }
        if (brj != null) {
            ar K = K((kotlin.reflect.jvm.internal.impl.descriptors.d) brj);
            return i.y(K != null ? K.bsZ() : null, atVar.bsZ());
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }
}
