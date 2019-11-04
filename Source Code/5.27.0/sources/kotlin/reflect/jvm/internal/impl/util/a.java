package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.s;

/* compiled from: modifierChecks.kt */
public abstract class a {
    public abstract List<d> bPU();

    public final c m(s sVar) {
        i.f(sVar, "functionDescriptor");
        for (d dVar : bPU()) {
            if (dVar.o(sVar)) {
                return dVar.p(sVar);
            }
        }
        return kotlin.reflect.jvm.internal.impl.util.c.a.fyn;
    }
}
