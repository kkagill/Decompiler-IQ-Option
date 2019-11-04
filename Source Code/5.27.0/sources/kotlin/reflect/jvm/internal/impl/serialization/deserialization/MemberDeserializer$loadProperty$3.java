package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: MemberDeserializer.kt */
final class MemberDeserializer$loadProperty$3 extends Lambda implements a<g<?>> {
    final /* synthetic */ h $property;
    final /* synthetic */ Property $proto;
    final /* synthetic */ p this$0;

    MemberDeserializer$loadProperty$3(p pVar, Property property, h hVar) {
        this.this$0 = pVar;
        this.$proto = property;
        this.$property = hVar;
        super(0);
    }

    /* renamed from: bwT */
    public final g<?> invoke() {
        p pVar = this.this$0;
        r a = pVar.X(pVar.fvy.brj());
        if (a == null) {
            i.bnJ();
        }
        a bOb = this.this$0.fvy.bys().bOb();
        Property property = this.$proto;
        w bsN = this.$property.bsN();
        i.e(bsN, "property.returnType");
        return (g) bOb.a(a, property, bsN);
    }
}
