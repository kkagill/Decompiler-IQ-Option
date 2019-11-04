package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ConstantValueFactory.kt */
final class ConstantValueFactory$createArrayValue$1 extends Lambda implements b<v, w> {
    final /* synthetic */ w $type;

    ConstantValueFactory$createArrayValue$1(w wVar) {
        this.$type = wVar;
        super(1);
    }

    /* renamed from: f */
    public final w invoke(v vVar) {
        i.f(vVar, "it");
        return this.$type;
    }
}
