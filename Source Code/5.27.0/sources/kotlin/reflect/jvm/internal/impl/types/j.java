package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: KotlinTypeFactory.kt */
public abstract class j extends i {
    private final ad fkH;

    public j(ad adVar) {
        i.f(adVar, "delegate");
        this.fkH = adVar;
    }

    /* Access modifiers changed, original: protected */
    public ad bxe() {
        return this.fkH;
    }

    /* renamed from: n */
    public j h(f fVar) {
        i.f(fVar, "newAnnotations");
        return fVar != brE() ? new d(this, fVar) : this;
    }

    /* renamed from: gM */
    public ad gL(boolean z) {
        if (z == boc()) {
            return this;
        }
        return bxe().gM(z).h(brE());
    }
}
