package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$simpleType$annotations$1 extends Lambda implements a<List<? extends c>> {
    final /* synthetic */ Type $proto;
    final /* synthetic */ v this$0;

    TypeDeserializer$simpleType$annotations$1(v vVar, Type type) {
        this.this$0 = vVar;
        this.$proto = type;
        super(0);
    }

    /* renamed from: acZ */
    public final List<c> invoke() {
        return this.this$0.fvy.bys().bOb().a(this.$proto, this.this$0.fvy.bot());
    }
}
