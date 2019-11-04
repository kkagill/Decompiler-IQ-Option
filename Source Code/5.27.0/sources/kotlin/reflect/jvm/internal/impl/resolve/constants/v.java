package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: constantValues.kt */
public final class v extends y<Integer> {
    public v(int i) {
        super(Integer.valueOf(i));
    }

    public w g(kotlin.reflect.jvm.internal.impl.descriptors.v vVar) {
        ad bsY;
        i.f(vVar, "module");
        a aVar = g.eZA.faV;
        i.e(aVar, "KotlinBuiltIns.FQ_NAMES.uInt");
        d a = r.a(vVar, aVar);
        if (a != null) {
            bsY = a.bsY();
            if (bsY != null) {
                return bsY;
            }
        }
        bsY = p.mK("Unsigned type UInt not found");
        i.e(bsY, "ErrorUtils.createErrorTy…ned type UInt not found\")");
        return bsY;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Number) getValue()).intValue());
        stringBuilder.append(".toUInt()");
        return stringBuilder.toString();
    }
}
