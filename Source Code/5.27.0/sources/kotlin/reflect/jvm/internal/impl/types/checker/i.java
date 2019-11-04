package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.g;
import kotlin.reflect.jvm.internal.impl.types.v;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: NewKotlinTypeChecker.kt */
public final class i {
    public static final boolean d(ad adVar) {
        kotlin.jvm.internal.i.f(adVar, "$this$isClassType");
        return adVar.bMZ().brQ() instanceof d;
    }

    public static final boolean e(ad adVar) {
        kotlin.jvm.internal.i.f(adVar, "$this$isSingleClassifierType");
        return (y.aJ((w) adVar) || (adVar.bMZ().brQ() instanceof an) || (adVar.bMZ().brQ() == null && !(adVar instanceof a) && !(adVar instanceof d) && !(adVar instanceof g))) ? false : true;
    }

    public static final boolean f(ad adVar) {
        kotlin.jvm.internal.i.f(adVar, "$this$isIntersectionType");
        return adVar.bMZ() instanceof v;
    }
}
