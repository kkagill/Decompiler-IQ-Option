package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.ap;

/* compiled from: typeParameterUtils.kt */
public final class ac {
    private final g fcS;
    private final List<ap> fcT;
    private final ac fcU;

    public ac(g gVar, List<? extends ap> list, ac acVar) {
        i.f(gVar, "classifierDescriptor");
        i.f(list, "arguments");
        this.fcS = gVar;
        this.fcT = list;
        this.fcU = acVar;
    }

    public final g btC() {
        return this.fcS;
    }

    public final List<ap> btD() {
        return this.fcT;
    }

    public final ac btE() {
        return this.fcU;
    }
}
