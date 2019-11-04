package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.i;

/* compiled from: Modality.kt */
public final class u {
    public static final boolean s(d dVar) {
        i.f(dVar, "$this$isFinalClass");
        return dVar.bru() == Modality.FINAL && dVar.brt() != ClassKind.ENUM_CLASS;
    }
}
