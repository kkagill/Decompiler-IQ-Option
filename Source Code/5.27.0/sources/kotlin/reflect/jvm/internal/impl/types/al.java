package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;

/* compiled from: StarProjectionImpl.kt */
public final class al extends aq {
    private final w fxu;

    public boolean bPC() {
        return true;
    }

    public al(w wVar) {
        i.f(wVar, "_type");
        this.fxu = wVar;
    }

    public Variance bPD() {
        return Variance.OUT_VARIANCE;
    }

    public w bpT() {
        return this.fxu;
    }
}
