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
public final class x extends y<Short> {
    public x(short s) {
        super(Short.valueOf(s));
    }

    public w g(v vVar) {
        ad bsY;
        i.f(vVar, "module");
        a aVar = g.eZA.faU;
        i.e(aVar, "KotlinBuiltIns.FQ_NAMES.uShort");
        d a = r.a(vVar, aVar);
        if (a != null) {
            bsY = a.bsY();
            if (bsY != null) {
                return bsY;
            }
        }
        bsY = p.mK("Unsigned type UShort not found");
        i.e(bsY, "ErrorUtils.createErrorTy…d type UShort not found\")");
        return bsY;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).shortValue());
        stringBuilder.append(".toUShort()");
        return stringBuilder.toString();
    }
}
