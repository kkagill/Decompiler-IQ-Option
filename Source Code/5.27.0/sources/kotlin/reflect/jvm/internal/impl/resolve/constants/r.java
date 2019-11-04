package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class r extends g<Void> {
    public r() {
        super(null);
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqL = vVar.btw().bqL();
        i.e(bqL, "module.builtIns.nullableNothingType");
        return bqL;
    }
}
