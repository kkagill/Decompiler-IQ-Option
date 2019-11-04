package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.name.a;

/* compiled from: TypeDeserializer.kt */
final class TypeDeserializer$typeConstructor$1 extends Lambda implements b<Integer, d> {
    final /* synthetic */ Type $proto;
    final /* synthetic */ v this$0;

    TypeDeserializer$typeConstructor$1(v vVar, Type type) {
        this.this$0 = vVar;
        this.$proto = type;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return mz(((Number) obj).intValue());
    }

    public final d mz(int i) {
        a a = q.a(this.this$0.fvy.bot(), i);
        List g = n.g(n.f(l.a((Object) this.$proto, (b) new TypeDeserializer$typeConstructor$1$typeParametersCount$1(this)), TypeDeserializer$typeConstructor$1$typeParametersCount$2.fvP));
        int h = n.h(l.a((Object) a, (b) TypeDeserializer$typeConstructor$1$classNestingLevel$1.fvO));
        while (g.size() < h) {
            g.add(Integer.valueOf(0));
        }
        return this.this$0.fvy.bys().bOf().a(a, g);
    }
}
