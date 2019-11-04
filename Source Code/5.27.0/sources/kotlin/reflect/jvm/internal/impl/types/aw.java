package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;

/* compiled from: TypeWithEnhancement.kt */
public final class aw {
    public static final w bh(w wVar) {
        i.f(wVar, "$this$getEnhancement");
        return wVar instanceof av ? ((av) wVar).bPw() : null;
    }

    public static final w bi(w wVar) {
        i.f(wVar, "$this$unwrapEnhancement");
        w bh = bh(wVar);
        return bh != null ? bh : wVar;
    }

    public static final ay a(ay ayVar, w wVar) {
        i.f(ayVar, "$this$inheritEnhancement");
        i.f(wVar, ConditionalUserProperty.ORIGIN);
        return b(ayVar, bh(wVar));
    }

    public static final ay b(ay ayVar, w wVar) {
        i.f(ayVar, "$this$wrapEnhancement");
        if (wVar == null) {
            return ayVar;
        }
        ay afVar;
        if (ayVar instanceof ad) {
            afVar = new af((ad) ayVar, wVar);
        } else if (ayVar instanceof q) {
            afVar = new s((q) ayVar, wVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return afVar;
    }
}
