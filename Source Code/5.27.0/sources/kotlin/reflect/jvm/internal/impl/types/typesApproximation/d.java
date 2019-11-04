package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: CapturedTypeApproximation.kt */
final class d {
    private final ao fxr;
    private final w fyl;
    private final w fym;

    public d(ao aoVar, w wVar, w wVar2) {
        i.f(aoVar, "typeParameter");
        i.f(wVar, "inProjection");
        i.f(wVar2, "outProjection");
        this.fxr = aoVar;
        this.fyl = wVar;
        this.fym = wVar2;
    }

    public final ao bPR() {
        return this.fxr;
    }

    public final w bPS() {
        return this.fyl;
    }

    public final w bPT() {
        return this.fym;
    }

    public final boolean bPQ() {
        return b.fxI.c(this.fyl, this.fym);
    }
}
