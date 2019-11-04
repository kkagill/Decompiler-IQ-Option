package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: DeserializedMemberScope.kt */
final class DeserializedMemberScope$functionNamesLazy$2 extends Lambda implements a<Set<? extends f>> {
    final /* synthetic */ f this$0;

    DeserializedMemberScope$functionNamesLazy$2(f fVar) {
        this.this$0 = fVar;
        super(0);
    }

    /* renamed from: bwG */
    public final Set<f> invoke() {
        return am.a(this.this$0.fwe.keySet(), this.this$0.bOM());
    }
}
