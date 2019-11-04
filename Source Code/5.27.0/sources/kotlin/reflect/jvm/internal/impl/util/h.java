package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.util.b.a;

/* compiled from: modifierChecks.kt */
final class h implements b {
    private static final String description = description;
    public static final h fyA = new h();

    private h() {
    }

    public String a(s sVar) {
        i.f(sVar, "functionDescriptor");
        return a.a(this, sVar);
    }

    public String getDescription() {
        return description;
    }

    public boolean n(s sVar) {
        i.f(sVar, "functionDescriptor");
        List bsP = sVar.bsP();
        i.e(bsP, "functionDescriptor.valueParameters");
        Iterable<ar> iterable = bsP;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (ar arVar : iterable) {
            Object obj;
            i.e(arVar, "it");
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.e(arVar) || arVar.btS() != null) {
                obj = null;
                continue;
            } else {
                obj = 1;
                continue;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
}
