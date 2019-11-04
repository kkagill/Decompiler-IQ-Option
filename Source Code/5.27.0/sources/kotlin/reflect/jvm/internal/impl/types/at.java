package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: TypeSubstitution.kt */
public final class at {
    public static final w a(w wVar, List<? extends ap> list, f fVar) {
        i.f(wVar, "$this$replace");
        i.f(list, "newArguments");
        i.f(fVar, "newAnnotations");
        if ((list.isEmpty() || list == wVar.btD()) && fVar == wVar.brE()) {
            return wVar;
        }
        ay bPA = wVar.bPA();
        if (bPA instanceof q) {
            q qVar = (q) bPA;
            wVar = x.a(a(qVar.bPr(), (List) list, fVar), a(qVar.bPs(), (List) list, fVar));
        } else if (bPA instanceof ad) {
            wVar = a((ad) bPA, (List) list, fVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return wVar;
    }

    public static final ad a(ad adVar, List<? extends ap> list, f fVar) {
        i.f(adVar, "$this$replace");
        i.f(list, "newArguments");
        i.f(fVar, "newAnnotations");
        if (list.isEmpty() && fVar == adVar.brE()) {
            return adVar;
        }
        if (list.isEmpty()) {
            return adVar.h(fVar);
        }
        return x.c(fVar, adVar.bMZ(), list, adVar.boc());
    }

    public static final ad aU(w wVar) {
        i.f(wVar, "$this$asSimpleType");
        ay bPA = wVar.bPA();
        if (!(bPA instanceof ad)) {
            bPA = null;
        }
        ad adVar = (ad) bPA;
        if (adVar != null) {
            return adVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is should be simple type: ");
        stringBuilder.append(wVar);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }
}
