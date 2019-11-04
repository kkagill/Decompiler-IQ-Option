package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;

/* compiled from: KotlinType.kt */
public final class y {
    public static final boolean aI(w wVar) {
        i.f(wVar, "$this$isNullable");
        return au.bb(wVar);
    }

    public static final boolean aJ(w wVar) {
        i.f(wVar, "$this$isError");
        ay bPA = wVar.bPA();
        return (bPA instanceof o) || ((bPA instanceof q) && (((q) bPA).bxe() instanceof o));
    }
}
