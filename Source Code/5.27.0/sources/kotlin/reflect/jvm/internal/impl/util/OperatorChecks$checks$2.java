package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;

/* compiled from: modifierChecks.kt */
final class OperatorChecks$checks$2 extends Lambda implements b<s, String> {
    public static final OperatorChecks$checks$2 fyE = new OperatorChecks$checks$2();

    OperatorChecks$checks$2() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(s sVar) {
        i.f(sVar, "$receiver");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.fyF;
        i iVar = i.fyC;
        k brj = sVar.brj();
        i.e(brj, "containingDeclaration");
        boolean j = anonymousClass1.j(brj);
        Object obj = 1;
        if (!j) {
            Object obj2;
            Collection bsR = sVar.bsR();
            i.e(bsR, "overriddenDescriptors");
            Iterable<s> iterable = bsR;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (s sVar2 : iterable) {
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.fyF;
                    i.e(sVar2, "it");
                    k brj2 = sVar2.brj();
                    i.e(brj2, "it.containingDeclaration");
                    if (anonymousClass12.j(brj2)) {
                        obj2 = 1;
                        break;
                    }
                }
            }
            obj2 = null;
            if (obj2 == null) {
                obj = null;
            }
        }
        return obj == null ? "must override ''equals()'' in Any" : null;
    }
}
