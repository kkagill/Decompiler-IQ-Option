package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class i extends g<Double> {
    public i(double d) {
        super(Double.valueOf(d));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        kotlin.jvm.internal.i.f(vVar, "module");
        ad bqU = vVar.btw().bqU();
        kotlin.jvm.internal.i.e(bqU, "module.builtIns.doubleType");
        return bqU;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).doubleValue());
        stringBuilder.append(".toDouble()");
        return stringBuilder.toString();
    }
}
