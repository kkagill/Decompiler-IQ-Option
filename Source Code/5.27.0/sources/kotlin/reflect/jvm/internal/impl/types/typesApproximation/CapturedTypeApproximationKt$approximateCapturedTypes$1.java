package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: CapturedTypeApproximation.kt */
final class CapturedTypeApproximationKt$approximateCapturedTypes$1 extends Lambda implements b<w, w> {
    final /* synthetic */ w $type;

    CapturedTypeApproximationKt$approximateCapturedTypes$1(w wVar) {
        this.$type = wVar;
        super(1);
    }

    /* renamed from: al */
    public final w invoke(w wVar) {
        i.f(wVar, "$this$makeNullableIfNeeded");
        wVar = au.c(wVar, this.$type.boc());
        i.e(wVar, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
        return wVar;
    }
}
