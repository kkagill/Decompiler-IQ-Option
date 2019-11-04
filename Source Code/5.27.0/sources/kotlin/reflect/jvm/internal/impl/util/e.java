package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.builtins.h.b;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.util.b.a;

/* compiled from: modifierChecks.kt */
final class e implements b {
    private static final String description = description;
    public static final e fyw = new e();

    private e() {
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
        ar arVar = (ar) sVar.bsP().get(1);
        b bVar = h.fbn;
        i.e(arVar, "secondParameter");
        w a = bVar.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.P(arVar));
        if (a == null) {
            return false;
        }
        w bpT = arVar.bpT();
        i.e(bpT, "secondParameter.type");
        return kotlin.reflect.jvm.internal.impl.types.b.a.c(a, kotlin.reflect.jvm.internal.impl.types.b.a.aZ(bpT));
    }
}
