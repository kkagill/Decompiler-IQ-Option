package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;

/* compiled from: constantValues.kt */
public final class w extends y<Long> {
    public w(long j) {
        super(Long.valueOf(j));
    }

    public kotlin.reflect.jvm.internal.impl.types.w g(v vVar) {
        ad bsY;
        i.f(vVar, "module");
        a aVar = g.eZA.faW;
        i.e(aVar, "KotlinBuiltIns.FQ_NAMES.uLong");
        d a = r.a(vVar, aVar);
        if (a != null) {
            bsY = a.bsY();
            if (bsY != null) {
                return bsY;
            }
        }
        bsY = p.mK("Unsigned type ULong not found");
        i.e(bsY, "ErrorUtils.createErrorTy…ed type ULong not found\")");
        return bsY;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).longValue());
        stringBuilder.append(".toULong()");
        return stringBuilder.toString();
    }
}
