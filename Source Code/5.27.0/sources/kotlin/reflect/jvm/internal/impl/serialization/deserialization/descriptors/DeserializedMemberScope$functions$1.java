package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$functions$1 extends Lambda implements b<f, Collection<? extends ai>> {
    final /* synthetic */ f this$0;

    DeserializedMemberScope$functions$1(f fVar) {
        this.this$0 = fVar;
        super(1);
    }

    /* renamed from: h */
    public final Collection<ai> invoke(f fVar) {
        i.f(fVar, "it");
        return this.this$0.g(fVar);
    }
}
