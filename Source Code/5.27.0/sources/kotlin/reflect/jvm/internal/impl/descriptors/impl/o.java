package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.q;

/* compiled from: FieldDescriptorImpl.kt */
public final class o extends b implements q {
    private final ae feB;

    public o(f fVar, ae aeVar) {
        i.f(fVar, "annotations");
        i.f(aeVar, "correspondingProperty");
        super(fVar);
        this.feB = aeVar;
    }
}
