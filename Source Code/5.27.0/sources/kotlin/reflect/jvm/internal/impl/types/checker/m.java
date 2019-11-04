package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: utils.kt */
final class m {
    private final w eYc;
    private final m fxS;

    public m(w wVar, m mVar) {
        i.f(wVar, "type");
        this.eYc = wVar;
        this.fxS = mVar;
    }

    public final m bPK() {
        return this.fxS;
    }

    public final w bpT() {
        return this.eYc;
    }
}
