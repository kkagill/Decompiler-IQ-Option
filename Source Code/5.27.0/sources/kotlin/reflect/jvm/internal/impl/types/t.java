package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;

/* compiled from: flexibleTypes.kt */
public final class t {
    public static final boolean aE(w wVar) {
        i.f(wVar, "$this$isFlexible");
        return wVar.bPA() instanceof q;
    }

    public static final q aF(w wVar) {
        i.f(wVar, "$this$asFlexibleType");
        ay bPA = wVar.bPA();
        if (bPA != null) {
            return (q) bPA;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
    }

    public static final ad aG(w wVar) {
        i.f(wVar, "$this$lowerIfFlexible");
        ay bPA = wVar.bPA();
        if (bPA instanceof q) {
            return ((q) bPA).bPr();
        }
        if (bPA instanceof ad) {
            return (ad) bPA;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ad aH(w wVar) {
        i.f(wVar, "$this$upperIfFlexible");
        ay bPA = wVar.bPA();
        if (bPA instanceof q) {
            return ((q) bPA).bPs();
        }
        if (bPA instanceof ad) {
            return (ad) bPA;
        }
        throw new NoWhenBranchMatchedException();
    }
}
