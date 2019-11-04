package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class q extends n<Long> {
    public q(long j) {
        super(Long.valueOf(j));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqS = vVar.btw().bqS();
        i.e(bqS, "module.builtIns.longType");
        return bqS;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).longValue());
        stringBuilder.append(".toLong()");
        return stringBuilder.toString();
    }
}
