package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.i;

/* compiled from: Annotations.kt */
public final class h {
    public static final f a(f fVar, f fVar2) {
        i.f(fVar, "first");
        i.f(fVar2, "second");
        if (fVar.isEmpty()) {
            return fVar2;
        }
        if (fVar2.isEmpty()) {
            return fVar;
        }
        return new j(fVar, fVar2);
    }
}
