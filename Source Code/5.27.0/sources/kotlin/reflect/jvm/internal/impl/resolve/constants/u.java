package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: constantValues.kt */
public final class u extends y<Byte> {
    public u(byte b) {
        super(Byte.valueOf(b));
    }

    public w g(v vVar) {
        ad bsY;
        i.f(vVar, "module");
        a aVar = g.eZA.faT;
        i.e(aVar, "KotlinBuiltIns.FQ_NAMES.uByte");
        d a = r.a(vVar, aVar);
        if (a != null) {
            bsY = a.bsY();
            if (bsY != null) {
                return bsY;
            }
        }
        bsY = p.mK("Unsigned type UByte not found");
        i.e(bsY, "ErrorUtils.createErrorTy…ed type UByte not found\")");
        return bsY;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).byteValue());
        stringBuilder.append(".toUByte()");
        return stringBuilder.toString();
    }
}
