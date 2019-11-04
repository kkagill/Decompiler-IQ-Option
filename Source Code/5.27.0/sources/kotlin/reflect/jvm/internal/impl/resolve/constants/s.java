package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class s extends n<Short> {
    public s(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqQ = vVar.btw().bqQ();
        i.e(bqQ, "module.builtIns.shortType");
        return bqQ;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).shortValue());
        stringBuilder.append(".toShort()");
        return stringBuilder.toString();
    }
}
