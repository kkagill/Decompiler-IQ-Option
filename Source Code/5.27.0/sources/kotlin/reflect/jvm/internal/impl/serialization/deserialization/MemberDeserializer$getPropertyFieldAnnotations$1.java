package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;

/* compiled from: MemberDeserializer.kt */
final class MemberDeserializer$getPropertyFieldAnnotations$1 extends Lambda implements a<List<? extends c>> {
    final /* synthetic */ boolean $isDelegate;
    final /* synthetic */ Property $proto;
    final /* synthetic */ p this$0;

    MemberDeserializer$getPropertyFieldAnnotations$1(p pVar, boolean z, Property property) {
        this.this$0 = pVar;
        this.$isDelegate = z;
        this.$proto = property;
        super(0);
    }

    /* renamed from: acZ */
    public final List<c> invoke() {
        p pVar = this.this$0;
        r a = pVar.X(pVar.fvy.brj());
        List<c> T = a != null ? this.$isDelegate ? u.T(this.this$0.fvy.bys().bOb().b(a, this.$proto)) : u.T(this.this$0.fvy.bys().bOb().a(a, this.$proto)) : null;
        return T != null ? T : m.emptyList();
    }
}
