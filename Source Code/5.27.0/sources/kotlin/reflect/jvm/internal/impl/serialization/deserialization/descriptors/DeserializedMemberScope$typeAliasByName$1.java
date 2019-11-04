package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.an;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$typeAliasByName$1 extends Lambda implements b<f, an> {
    final /* synthetic */ f this$0;

    DeserializedMemberScope$typeAliasByName$1(f fVar) {
        this.this$0 = fVar;
        super(1);
    }

    /* renamed from: V */
    public final an invoke(f fVar) {
        i.f(fVar, "it");
        return this.this$0.S(fVar);
    }
}
