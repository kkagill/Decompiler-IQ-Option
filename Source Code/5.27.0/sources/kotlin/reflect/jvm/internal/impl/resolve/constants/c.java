package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class c extends g<Boolean> {
    public c(boolean z) {
        super(Boolean.valueOf(z));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqW = vVar.btw().bqW();
        i.e(bqW, "module.builtIns.booleanType");
        return bqW;
    }
}
