package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: CapturedTypeApproximation.kt */
final class CapturedTypeApproximationKt$toTypeProjection$2 extends Lambda implements b<Variance, Variance> {
    final /* synthetic */ d $this_toTypeProjection;

    CapturedTypeApproximationKt$toTypeProjection$2(d dVar) {
        this.$this_toTypeProjection = dVar;
        super(1);
    }

    /* renamed from: b */
    public final Variance invoke(Variance variance) {
        i.f(variance, "variance");
        return variance == this.$this_toTypeProjection.bPR().bta() ? Variance.INVARIANT : variance;
    }
}
