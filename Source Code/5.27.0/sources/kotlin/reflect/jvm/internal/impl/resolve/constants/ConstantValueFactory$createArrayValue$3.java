package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: ConstantValueFactory.kt */
final class ConstantValueFactory$createArrayValue$3 extends Lambda implements b<v, ad> {
    final /* synthetic */ PrimitiveType $componentType;

    ConstantValueFactory$createArrayValue$3(PrimitiveType primitiveType) {
        this.$componentType = primitiveType;
        super(1);
    }

    /* renamed from: e */
    public final ad invoke(v vVar) {
        i.f(vVar, "module");
        ad c = vVar.btw().c(this.$componentType);
        i.e(c, "module.builtIns.getPrimi…KotlinType(componentType)");
        return c;
    }
}
