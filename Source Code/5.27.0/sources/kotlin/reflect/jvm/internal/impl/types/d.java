package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: KotlinTypeFactory.kt */
final class d extends j {
    private final f fdr;

    public f brE() {
        return this.fdr;
    }

    public d(ad adVar, f fVar) {
        i.f(adVar, "delegate");
        i.f(fVar, "annotations");
        super(adVar);
        this.fdr = fVar;
    }
}
