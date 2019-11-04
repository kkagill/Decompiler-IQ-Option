package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class m extends n<Integer> {
    public m(int i) {
        super(Integer.valueOf(i));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqR = vVar.btw().bqR();
        i.e(bqR, "module.builtIns.intType");
        return bqR;
    }
}
