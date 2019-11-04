package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: inlineClassManglingRules.kt */
public final class a {
    public static final boolean J(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "descriptor");
        if (!(callableMemberDescriptor instanceof c)) {
            callableMemberDescriptor = null;
        }
        c cVar = (c) callableMemberDescriptor;
        boolean z = false;
        if (cVar != null) {
            if (av.b(cVar.brx())) {
                return false;
            }
            d bth = cVar.bth();
            i.e(bth, "constructorDescriptor.constructedClass");
            if (bth.brA() || kotlin.reflect.jvm.internal.impl.resolve.c.E(cVar.bth())) {
                return false;
            }
            List bsP = cVar.bsP();
            i.e(bsP, "constructorDescriptor.valueParameters");
            Iterable<ar> iterable = bsP;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (ar arVar : iterable) {
                    i.e(arVar, "it");
                    w bpT = arVar.bpT();
                    i.e(bpT, "it.type");
                    if (av(bpT)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public static final boolean V(k kVar) {
        i.f(kVar, "$this$isInlineClassThatRequiresMangling");
        return kotlin.reflect.jvm.internal.impl.resolve.d.N(kVar) && !N((d) kVar);
    }

    public static final boolean au(w wVar) {
        i.f(wVar, "$this$isInlineClassThatRequiresMangling");
        f brQ = wVar.bMZ().brQ();
        return brQ != null && V(brQ);
    }

    private static final boolean av(w wVar) {
        return au(wVar) || aw(wVar);
    }

    private static final boolean N(d dVar) {
        return i.y(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.x(dVar), kotlin.reflect.jvm.internal.impl.resolve.c.fsV);
    }

    private static final boolean aw(w wVar) {
        f brQ = wVar.bMZ().brQ();
        if (!(brQ instanceof ao)) {
            brQ = null;
        }
        ao aoVar = (ao) brQ;
        return aoVar != null ? av(kotlin.reflect.jvm.internal.impl.types.b.a.e(aoVar)) : false;
    }
}
