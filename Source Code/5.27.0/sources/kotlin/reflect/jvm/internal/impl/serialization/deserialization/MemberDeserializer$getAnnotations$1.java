package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: MemberDeserializer.kt */
final class MemberDeserializer$getAnnotations$1 extends Lambda implements a<List<? extends c>> {
    final /* synthetic */ AnnotatedCallableKind $kind;
    final /* synthetic */ n $proto;
    final /* synthetic */ p this$0;

    MemberDeserializer$getAnnotations$1(p pVar, n nVar, AnnotatedCallableKind annotatedCallableKind) {
        this.this$0 = pVar;
        this.$proto = nVar;
        this.$kind = annotatedCallableKind;
        super(0);
    }

    /* renamed from: acZ */
    public final List<c> invoke() {
        p pVar = this.this$0;
        r a = pVar.X(pVar.fvy.brj());
        List<c> T = a != null ? u.T(this.this$0.fvy.bys().bOb().a(a, this.$proto, this.$kind)) : null;
        return T != null ? T : m.emptyList();
    }
}
