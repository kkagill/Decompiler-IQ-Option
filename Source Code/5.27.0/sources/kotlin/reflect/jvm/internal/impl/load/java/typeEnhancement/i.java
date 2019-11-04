package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: typeEnhancement.kt */
class i {
    private final w eYc;
    private final int fkQ;
    private final boolean fkR;

    public i(w wVar, int i, boolean z) {
        kotlin.jvm.internal.i.f(wVar, "type");
        this.eYc = wVar;
        this.fkQ = i;
        this.fkR = z;
    }

    public w bpT() {
        return this.eYc;
    }

    public final int byg() {
        return this.fkQ;
    }

    public final boolean byh() {
        return this.fkR;
    }

    public final w byf() {
        return this.fkR ? bpT() : null;
    }
}
