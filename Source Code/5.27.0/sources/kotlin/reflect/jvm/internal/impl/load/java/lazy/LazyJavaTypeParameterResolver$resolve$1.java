package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;

/* compiled from: resolvers.kt */
final class LazyJavaTypeParameterResolver$resolve$1 extends Lambda implements b<w, n> {
    final /* synthetic */ i this$0;

    LazyJavaTypeParameterResolver$resolve$1(i iVar) {
        this.this$0 = iVar;
        super(1);
    }

    /* renamed from: b */
    public final n invoke(w wVar) {
        i.f(wVar, "typeParameter");
        Integer num = (Integer) this.this$0.fjd.get(wVar);
        if (num == null) {
            return null;
        }
        return new n(a.a(this.this$0.fiV, (m) this.this$0), wVar, this.this$0.fjf + num.intValue(), this.this$0.fej);
    }
}
