package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.a.g;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$simpleType$1 extends Lambda implements b<Type, List<? extends Argument>> {
    final /* synthetic */ v this$0;

    TypeDeserializer$simpleType$1(v vVar) {
        this.this$0 = vVar;
        super(1);
    }

    /* renamed from: u */
    public final List<Argument> invoke(Type type) {
        i.f(type, "$this$collectAllArguments");
        List bzh = type.bzh();
        i.e(bzh, "argumentList");
        Collection collection = bzh;
        type = g.b(type, this.this$0.fvy.bou());
        List u = type != null ? invoke(type) : null;
        if (u == null) {
            u = m.emptyList();
        }
        return u.b(collection, (Iterable) u);
    }
}
