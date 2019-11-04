package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$properties$1 extends Lambda implements b<f, Collection<? extends ae>> {
    final /* synthetic */ f this$0;

    DeserializedMemberScope$properties$1(f fVar) {
        this.this$0 = fVar;
        super(1);
    }

    /* renamed from: h */
    public final Collection<ae> invoke(f fVar) {
        i.f(fVar, "it");
        return this.this$0.f(fVar);
    }
}
