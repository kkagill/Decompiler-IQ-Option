package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class d extends n<Byte> {
    public d(byte b) {
        super(Byte.valueOf(b));
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqP = vVar.btw().bqP();
        i.e(bqP, "module.builtIns.byteType");
        return bqP;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).byteValue());
        stringBuilder.append(".toByte()");
        return stringBuilder.toString();
    }
}
