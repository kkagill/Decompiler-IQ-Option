package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: SpecialTypes.kt */
public final class z extends az {
    private final e<w> fxp;

    public z(h hVar, a<? extends w> aVar) {
        i.f(hVar, "storageManager");
        i.f(aVar, "computation");
        this.fxp = hVar.f(aVar);
    }

    /* Access modifiers changed, original: protected */
    public w bPB() {
        return (w) this.fxp.invoke();
    }

    public boolean bPc() {
        return this.fxp.bPc();
    }
}
