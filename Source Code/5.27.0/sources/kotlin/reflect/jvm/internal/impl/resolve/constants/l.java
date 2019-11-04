package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class l extends g<Float> {
    public l(float f) {
        super(Float.valueOf(f));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqT = vVar.btw().bqT();
        i.e(bqT, "module.builtIns.floatType");
        return bqT;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).floatValue());
        stringBuilder.append(".toFloat()");
        return stringBuilder.toString();
    }
}
